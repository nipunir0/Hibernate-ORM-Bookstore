package util;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import model.Book;
public class HibernateUtil {
	private static SessionFactory sessionFactory;
	 public static SessionFactory getSessionFactory() {
	 if (sessionFactory == null) {
	 try {
	 Configuration configuration = new Configuration();
	 // Hibernate settings equivalent to hibernate.cfg.xml's properties
	 Properties settings = new Properties();
	 settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
	 settings.put(Environment.URL,
	"jdbc:mysql://localhost:3306/onlinebookstore?useSSL=false");
	 settings.put(Environment.USER, "root");
	 settings.put(Environment.PASS, "");
	 settings.put(Environment.SHOW_SQL, "true");
	 settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
	 settings.put(Environment.HBM2DDL_AUTO, "create-drop");
	 configuration.setProperties(settings);
	 configuration.addAnnotatedClass(Book.class);
	 ServiceRegistry serviceRegistry = new
	StandardServiceRegistryBuilder()
	 .applySettings(configuration.getProperties()).build();
	 sessionFactory =
	configuration.buildSessionFactory(serviceRegistry);
	 } catch (Exception e) {
	 e.printStackTrace();
	 }
	 }
	 return sessionFactory;
	 }

}
