package modelo;

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
			Producto producto = new Producto("El imperio final", "Nueva era de fantasia epica", 20.00f, "Nova Editorial", 80);

			Session session = context.currentSession();

			session.beginTransaction();

			session.save(producto);

			session.getTransaction().commit();

			System.out.println("Cliente: " + producto);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}