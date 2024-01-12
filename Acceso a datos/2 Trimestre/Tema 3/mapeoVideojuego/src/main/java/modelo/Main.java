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
			Videojuego videojuego = new Videojuego("God of War", 2005, "Sony", 50.00f, "Kratos tiene que derrotar al dios de la guerra", "PS2");

			Session session = context.currentSession();

			session.beginTransaction();

			session.save(videojuego);

			session.getTransaction().commit();

			System.out.println("Cliente: " + videojuego);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
