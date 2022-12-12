package ni.com.sts.retirosCSSFV;

import ni.com.sts.retirosCSSFV.Dao.ParticipanteDao;
import ni.com.sts.retirosCSSFV.conexion.HibernateUtil;
import ni.com.sts.retirosCSSFV.dominio.Mensajes;
import ni.com.sts.retirosCSSFV.thread.RetirosThread;
import ni.com.sts.retirosCSSFV.utils.UtilDate;
import org.apache.log4j.Logger;
import org.hibernate.Session;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.TimerTask;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;


import java.util.*;

/**
 * Created by ICS on 17/01/2022.
 */
public class Principal {

    private static  Logger logger = Logger.getLogger(Principal.class);
    private static  RetirosThread retirosThread = new RetirosThread();

    public static String dateFormat = "dd/MM/yyyy HH:mm:ss";
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);


    public static void main(String[] args) throws ParseException {

        logger.info(" ** Iniciando clase MAIN... ** ");
        ParticipanteDao dao = new ParticipanteDao();
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Mensajes> objTiempoDb = dao.getCatalogo("CAT_TIEMPO_DESPERTAR_RETIRO_AUTOMATIC",session);

        //todo: Obtengo la Fecha y Hora desde la Base de Datos  **
        String fechaDeDespertar =  objTiempoDb.get(0).getEs();

        //FORMATO FECHA Y HORA
        Date fechaDB = ni.com.sts.retirosCSSFV.utils.UtilDate.StringToDate(fechaDeDespertar, "dd/MM/yyyy HH:mm:ss");
        long timeInMillis = fechaDB.getTime();

        //TIEMPO DE REPETICION
        Integer repetir = Integer.parseInt(objTiempoDb.get(1).getEs());

        // FORMATO HORA
        String hora_desde_db = new SimpleDateFormat("HH:mm:ss").format(fechaDB);

        //SEPARAR HORA,MIN,SEG
        String string = hora_desde_db;
        String[] parts = string.split(":");
        String HORA_DB = parts[0];
        String MINUTE_DB = parts[1];
        String SECOND_DB = parts[2];
        DateFormat fechaFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        // HORA DE DESPERTAR DESDE LA BD
        Date horaDespertar = new Date(timeInMillis);
        Calendar c = Calendar.getInstance();
        c.setTime(horaDespertar);

        // SI LA HORA EN BD ES < A LA HORA ACTUAL ESPERA EL TIEMPO DE EJECUCIÓN
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime DBLocalDateTime = UtilDate.asLocalDateTime(fechaDB);
        boolean isAfter = now.isAfter(DBLocalDateTime);

        if (isAfter) {
            c.set(Calendar.DAY_OF_YEAR, c.get(Calendar.DAY_OF_YEAR) + 1);
            c.set(Calendar.HOUR_OF_DAY, Integer.parseInt(HORA_DB));
            c.set(Calendar.MINUTE, Integer.parseInt(MINUTE_DB));
            c.set(Calendar.SECOND, Integer.parseInt(SECOND_DB));
            horaDespertar = c.getTime();
            logger.info("Se ha agregado un día a la fecha. "+ fechaFormat.format(horaDespertar));
        }else{
            horaDespertar=fechaDB;
            logger.info("Esperando el tiempo para despertar... "+ fechaFormat.format(horaDespertar));
        }

        // TIEMPO DE REPETICIÓN DESDE LA DB
        int tiempoRepeticion = repetir;
        Timer temporizador = new Timer();
        temporizador.schedule(new TimerTask() {
            @Override
            public void run(){
                retirosThread.run();
            }
        },horaDespertar,tiempoRepeticion);
    }
}// fin class DAY_OF_MONTH
