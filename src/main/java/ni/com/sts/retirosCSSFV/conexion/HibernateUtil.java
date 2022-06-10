package ni.com.sts.retirosCSSFV.conexion;

import ni.com.sts.retirosCSSFV.dominio.DocumentacionRetiroData;
import ni.com.sts.retirosCSSFV.dominio.Mensajes;
import ni.com.sts.retirosCSSFV.dominio.Participantes;
import ni.com.sts.retirosCSSFV.dominio.ParticipantesProcesos;
import ni.com.sts.retirosCSSFV.thread.RetirosThread;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

/**
 * Created by ICS on 20/01/2022.
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {

        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/estudios_ics?useSSL=false");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "123456");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
                settings.put(Environment.SHOW_SQL, "true");
                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "RetirosThread");
                configuration.setProperties(settings);
                configuration.addAnnotatedClass(Participantes.class);
                configuration.addAnnotatedClass(ParticipantesProcesos.class);
                configuration.addAnnotatedClass(DocumentacionRetiroData.class);
                configuration.addAnnotatedClass(Mensajes.class);
                configuration.addAnnotatedClass(RetirosThread.class);

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
