package ni.com.sts.retirosCSSFV.conexion;

import ni.com.sts.retirosCSSFV.Dao.ParticipanteDao;
import ni.com.sts.retirosCSSFV.Principal;
import ni.com.sts.retirosCSSFV.dominio.DocumentacionRetiroData;
import ni.com.sts.retirosCSSFV.dominio.Mensajes;
import ni.com.sts.retirosCSSFV.dominio.Participantes;
import ni.com.sts.retirosCSSFV.dominio.ParticipantesProcesos;
import ni.com.sts.retirosCSSFV.thread.RetirosThread;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by ICS on 20/01/2022.
 */
public class HibernateUtil {

    private static Logger logger = Logger.getLogger(HibernateUtil.class);
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {

        // para windows
        final String ARCHIVO = "R:\\properties_automatic\\retiros_config.properties";
        // para linux
        final String FILELINUX = "\\home\\properties_automatic\\retiros_config.properties";

        if (sessionFactory == null) {
            try {
                InputStream lectura = new FileInputStream(ARCHIVO);
                Properties properties = new Properties();
                properties.load(lectura);
                Configuration configuration = new Configuration();
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, properties.getProperty("DATABASE_DRIVER"));
                settings.put(Environment.URL, properties.getProperty("DATABASE_URL"));
                settings.put(Environment.USER, properties.getProperty("DATABASE_USERNAME"));
                settings.put(Environment.PASS, properties.getProperty("DATABASE_PASSWORD"));
                settings.put(Environment.DIALECT, properties.getProperty("DATABASE_DIALECT"));
                settings.put(Environment.SHOW_SQL, "false");
                settings.put(Environment.FORMAT_SQL, "false");
                settings.put(Environment.POOL_SIZE,"10");
                configuration.setProperties(settings);
                configuration.addAnnotatedClass(Participantes.class);
                configuration.addAnnotatedClass(ParticipantesProcesos.class);
                configuration.addAnnotatedClass(DocumentacionRetiroData.class);
                configuration.addAnnotatedClass(Mensajes.class);
                configuration.addAnnotatedClass(RetirosThread.class);
                configuration.addAnnotatedClass(Principal.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
