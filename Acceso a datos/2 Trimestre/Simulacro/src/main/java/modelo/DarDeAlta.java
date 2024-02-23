package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class DarDeAlta {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); 

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());
		
		
		try {
		   	Profesores profesor = new Profesores("Berto", "Palomo", "Calle 1", "29000", "Malaga", "Malaga", "666112233");

        	Session session = context.currentSession();
        	session.beginTransaction();
        	session.save(profesor);      	     	
        	session.getTransaction().commit();
        	
		
        	System.out.println(profesor.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ThreadLocalSessionContext.unbind(sessionFactory);
			sessionFactory.close();
		}
	}
}