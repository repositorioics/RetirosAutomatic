package ni.com.sts.retirosCSSFV.thread;

import ni.com.sts.retirosCSSFV.Dao.ParticipanteDao;
import ni.com.sts.retirosCSSFV.conexion.HibernateUtil;
import ni.com.sts.retirosCSSFV.dominio.DocumentacionRetiroData;
import ni.com.sts.retirosCSSFV.dominio.Mensajes;
import ni.com.sts.retirosCSSFV.dominio.ParticipantesProcesos;
import ni.com.sts.retirosCSSFV.dto.MetaDatos;
import ni.com.sts.retirosCSSFV.dto.ParticipanteDto;
import org.apache.log4j.Logger;
import org.hibernate.Session;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by ICS on 17/01/2022.
 */
public class RetirosThread extends Thread {

    private static Logger logger = Logger.getLogger(RetirosThread.class);
    ParticipanteDao participanteDao = new ParticipanteDao();

    private static String nombre_usuario;
    private static String identificador;
    private static Integer medico_supervisor;
    private static Integer persona_documenta;
    private static Integer relacionFamiliar;

    Session session = HibernateUtil.getSessionFactory().openSession();

    public RetirosThread(){
        List<Mensajes>meta = participanteDao.getCatalogo("CAT_METADATOS_RETIRO_AUTOMATIC",session);
        nombre_usuario = meta.get(0).getEs();
        identificador = meta.get(1).getEs();
        medico_supervisor = Integer.parseInt(meta.get(2).getEs());
        persona_documenta = Integer.parseInt(meta.get(3).getEs());
        relacionFamiliar = Integer.parseInt(meta.get(4).getEs());
    }

    @Override
    public void run(){
        IniciarRetiroDengue();
        IniciarRetiroInfluenza();
        InciarRetiroUO1();
    }

    //region todo: METODO RETIRO ESTUDIO UO1 >=15 AÑOS **
    private void InciarRetiroUO1(){
        logger.info("Iniciando método para retirar del estudio de UO1..!!");
        Session session = HibernateUtil.getSessionFactory().openSession();
        int cont = 0;
        try{

            List<Mensajes> edad_max_uo1 = participanteDao.getCatalogo("CAT_EDAD_MAX_UO1", session);
            Integer edad = Integer.parseInt(edad_max_uo1.get(0).getEs());

            Date tomorrow = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(tomorrow);
            calendar.add(Calendar.DATE, 1);
            tomorrow = calendar.getTime();

            List<ParticipanteDto> participantes = participanteDao.ObtenerListaParticipantesUO1(edad,tomorrow);

            if(participantes.size()>0) {
                for (ParticipanteDto p : participantes) {
                    Integer codigo_participante = p.getCodigo_participante();
                    ParticipantesProcesos procesos = participanteDao.getParticipanteProceso(codigo_participante,session);
                    if (procesos!=null){
                     String estudios = procesos.getEstudio();
                        String[] estudiosDelParticipante = estudios.split("  ");
                        ArrayList<String> estudios_finales = new ArrayList<String>();

                        for (int i = 0; i < estudiosDelParticipante.length; i++) {
                            estudios_finales.add(estudiosDelParticipante[i]);
                            estudios_finales.remove("UO1");
                        }
                        String str="";
                        if (estudios_finales.size()>=1){
                            StringBuffer sb = new StringBuffer();
                            for (String s:estudios_finales){
                                sb.append(s);
                                sb.append("  ");
                            }
                            str = sb.toString();
                        }else{
                            procesos.setEstudio(str);
                            procesos.setEstPart(0);
                        }

                        if (estudiosDelParticipante.length > 1){
                            if (p.getEstudios().contains("UO1")){
                                procesos.setEstudio(str);
                            }
                        }
                    }//--> Fin del IF
                    boolean ProcesosActualizado = participanteDao.saveOrUpdateProcesos(procesos,session);
                    if (ProcesosActualizado){
                        DocumentacionRetiroData result = getRetiroSaved(p,session,"UO1");
                        if (result!=null)
                        logger.info("Retiro Guardado con éxito:\n  IdRetiro: "+result.getIdretiro()+"\n Participante: "+ result.getCodigoParticipante()+"\n Total Registros: "+cont++);
                        else
                        logger.error("Hubo un error al Guardar el retiro: "+result.getIdretiro());
                    }
                }
            }else{
                logger.info("No se encontraron registro del estudio de UO1");
            }
        }catch (Exception e){
            logger.error("Ha ocurrido un Error al obtener participantes de UO1: " + e.getMessage());
        }finally {
            session.close();
        }
    }
    //endregion

    //region todo: METODO RETIRO ESTUDIO DENGUE >=18 AÑOS **
    private void IniciarRetiroDengue(){
        logger.info("Iniciando método para retirar del estudio de Dengue..!!");
        int cont=0;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            // Obtendo de base de datos la edad Máxima para el estudio de Dengue
            List<Mensajes> edad_max_dengue = participanteDao.getCatalogo("CAT_EDAD_MAX_DENGUE", session);
            Integer edad = Integer.parseInt(edad_max_dengue.get(0).getEs());

            Date tomorrow = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(tomorrow);
            calendar.add(Calendar.DATE, 1);
            tomorrow = calendar.getTime();

            List<ParticipanteDto> participantes = participanteDao.ObtenerListaParticipantesDengue(edad,tomorrow);

            if (participantes.size() > 0) {
                for (ParticipanteDto p : participantes) {
                    Integer codigo_participante = p.getCodigo_participante();
                    ParticipantesProcesos procesos = participanteDao.getParticipanteProceso(codigo_participante, session);
                    if (procesos != null) {
                        String estudios = procesos.getEstudio();
                        String[] estudiosDelParticipante = estudios.split("  ");
                        ArrayList<String> estudios_finales = new ArrayList<String>();
                        for (int i = 0; i < estudiosDelParticipante.length; i++) {
                            estudios_finales.add(estudiosDelParticipante[i]);
                            estudios_finales.remove("Dengue");
                        }
                        String str = "";
                        if (estudios_finales.size() >= 1) {
                            StringBuffer sb = new StringBuffer();
                            for (String s : estudios_finales) {
                                sb.append(s);
                                sb.append("  ");
                            }
                            str = sb.toString();
                        } else {
                            procesos.setEstudio(str);
                            procesos.setEstPart(0);
                        }

                        if (estudiosDelParticipante.length > 1) {
                            if (p.getEstudios().contains("Dengue")) {
                                procesos.setEstudio(str);
                            }
                        }
                    }//--> Fin del IF

                    boolean ProcesosActualizado = participanteDao.saveOrUpdateProcesos(procesos, session); // Actualizo los Estudios y el Estado del Participante si es necesario
                    if (ProcesosActualizado) {
                        DocumentacionRetiroData result = this.getRetiroSaved(p,session,"Dengue");
                        if (result!=null)
                            logger.info("Retiro Guardado con éxito:\n  IdRetiro: "+result.getIdretiro()+"\n Participante: "+ result.getCodigoParticipante()+"\n Total Registros: "+cont++);
                        else
                            logger.error("Hubo un error al Guardar el retiro: "+result.getIdretiro());
                    }
                }// -> fin del FOREACH
            }else{
                logger.info("No se encontraron registros de Dengue..");
            }

        }catch (Exception ex){
            logger.error("Ha ocurrido un Error: "+ ex.getMessage());
        }finally {
            session.close();
        }
    }
    //endregion

    //region todo: METODO RETIRO ESTUDIO INFLUENZA >=15 AÑOS**
    public void IniciarRetiroInfluenza(){
        logger.info("Iniciando método para retirar del estudio de Influenza..");
        Session session = HibernateUtil.getSessionFactory().openSession();

        try{
            int cont=0;
            List<Mensajes> edad_max_influenza = participanteDao.getCatalogo("CAT_EDAD_MAX_INFLUENZA", session);
            Integer edad = Integer.parseInt(edad_max_influenza.get(0).getEs());

            Date tomorrow = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(tomorrow);
            calendar.add(Calendar.DATE, 1);
            tomorrow = calendar.getTime();
            List<ParticipanteDto> participantes = participanteDao.ObtenerListaParticipantesInfluenza(edad,tomorrow);

            if (participantes.size() > 0) {
                for (ParticipanteDto p : participantes) {
                    Integer codigo_participante = p.getCodigo_participante();
                    ParticipantesProcesos procesos = participanteDao.getParticipanteProceso(codigo_participante, session);
                    if (procesos!=null) {
                        String estudios = procesos.getEstudio();
                        String[] estudioDelParticipante = estudios.split("  ");
                        ArrayList<String> estudios_finales = new ArrayList<String>();
                        for (int i = 0; i < estudioDelParticipante.length; i++) {
                            estudios_finales.add(estudioDelParticipante[i]);
                            estudios_finales.remove("Influenza");
                        }
                        String str = "";
                        if (estudios_finales.size() >= 1) {
                            StringBuffer sb = new StringBuffer();
                            for (String s : estudios_finales) {
                                sb.append(s);
                                sb.append("  ");
                            }
                            str = sb.toString();
                        } else {
                            procesos.setEstudio(str);
                            procesos.setEstPart(0);
                        }

                        if (estudioDelParticipante.length > 1) {
                            if (p.getEstudios().contains("Influenza")) {
                                procesos.setEstudio(str);
                            }
                        }
                    }
                     boolean ProcesosActualizado = participanteDao.saveOrUpdateProcesos(procesos, session);
                     if (ProcesosActualizado) {
                          DocumentacionRetiroData result = this.getRetiroSaved(p,session,"Influenza");
                          logger.info("Guardado con éxito!\n CODIGO RETIRO: " + result.getIdretiro() + "\n CODIGO PARTICIPANTE: " + result.getCodigoParticipante() + "\nTotal de Registros:" + cont++);
                     }
                 }
                }else{
                logger.info("No se encontraron registro del estudio de Influenza");
            }
        }catch (Exception e){
            logger.error("Ha ocurrido un Error: "+ e.getMessage());
        }finally {
            session.close();
        }
    }
    //endregion

    //region todo: obtener FechaActual y Hora Actual
    public String getFechaHoraActual(){
        String fecha  = null;
        try{
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            Date date = new Date();
            fecha = dateFormat.format(date);
        }catch (Exception e){
            logger.error("Ocurrió un error al obtener la hora actual: "+e.getMessage());
        }
        return fecha;
    }

    public String getHora(String strFormato){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new  SimpleDateFormat(strFormato);
        String strHora = simpleDateFormat.format(calendar.getTime());
        return strHora;

    }
    //endregion

    //region Guardar Retiro
    public static DocumentacionRetiroData getRetiroSaved(ParticipanteDto p, Session session, String estudioRetirado){
        DocumentacionRetiroData retiro = new DocumentacionRetiroData();
        ParticipanteDao participanteDao = new ParticipanteDao();
        try{
            retiro.setIdentificadorEquipo(identificador);
            retiro.setEstado("1");
            retiro.setPasivo("0");
            retiro.setFechaRegistro(new Date());
            retiro.setUsuarioRegistro(nombre_usuario);

            retiro.setFechaRetiro(new Date());
            retiro.setTipoFecha("1");
            retiro.setActual(true);

            retiro.setCodigoCasapdcs(p.getCasaPDCS());
            retiro.setCasaFamilia(p.getCasaFamilia());

            retiro.setDevolvioCarnet("0");
            retiro.setEstudioRetirado(estudioRetirado);
            retiro.setEstudiosAnteriores(p.getEstudios());
            retiro.setMedicoSupervisor(medico_supervisor);
            retiro.setPersonaDocumenta(persona_documenta);

            retiro.setMotivoRetiro("C2");
            retiro.setObservaciones("RETIRADO POR MAYOR DE EDAD: " + p.getEdad());
            retiro.setOtroMotivoRetiro("");
            retiro.setQuienComunica("Ninguno");
            retiro.setRelfam(relacionFamiliar);
            retiro.setCodigoParticipante(p.getCodigo_participante());
            retiro = participanteDao.saveRetiro(retiro, session);
            return retiro;
        }catch (Exception e){
            logger.error("Error al guardar retiro: "+e.getMessage());
            return retiro;
        }
    }
    //endregion

    //region todo: Obtener MetaData
    public MetaDatos getMetaDatos(Session session){
        MetaDatos metaDatos = new MetaDatos();
        try {
            logger.info("Iniciando método para obtener MetaDatos..!!");
            //Session session = HibernateUtil.getSessionFactory().openSession();


            //Obtener el usuario
            List<Mensajes>meta = participanteDao.getCatalogo("CAT_METADATOS_RETIRO_AUTOMATIC",session);


            metaDatos.setNoombreUsuario(meta.get(0).getEs());
            metaDatos.setIdentificador(meta.get(1).getEs());
            Integer medico_supervisor = Integer.parseInt(meta.get(2).getEs());
            metaDatos.setMedicoSupervisor(medico_supervisor);

            metaDatos.setPersonalDocumenta(persona_documenta);

            metaDatos.setRelacionFamiliar(relacionFamiliar);
            return metaDatos;


            /*
            //Obtener el identificador de equipo
            List<Mensajes>identificador = participanteDao.getCatalogo("CAT_IDENTIFICADOR_EQUIPO_RETIRO_AUTOMATIC",session);
            String identificador_equipo = identificador.get(0).getEs();

            //Obtener el Medico supervisor
            List<Mensajes>medico_sup = participanteDao.getCatalogo("CAT_MEDICO_SUPERVISOR_RETIRO_AUTOMATIC",session);


            //Obtener la persona que documenta el retiro
            List<Mensajes>person = participanteDao.getCatalogo("CAT_PERSONA_DOCUMENTA_RETIRO_AUTOMATIC", session);


            //Obtener relacion familiar
            List<Mensajes>rel_fam = participanteDao.getCatalogo("CAT_RELACION_FAMILIAR_RETIRO_AUTOMATIC",session);
            */





        }catch (Exception e){
            logger.error("Error al obtener MetaDatos");
            return metaDatos;
        }
    }
    //endregion
}