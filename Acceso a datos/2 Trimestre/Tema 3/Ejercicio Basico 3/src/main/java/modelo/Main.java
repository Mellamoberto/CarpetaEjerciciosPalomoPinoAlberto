package modelo;

import java.sql.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());
		
		try {
			Alumno alumno = new Alumno("Berto", "Palomo", "Pino", Date.valueOf("1996-05-08"), "no", "610202020");

			Session session = context.currentSession();

			session.beginTransaction();

			session.save(alumno);

			session.getTransaction().commit();

			System.out.println("Cliente: " + alumno);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ThreadLocalSessionContext.unbind(sessionFactory);
			sessionFactory.close();
		}
	}
}
