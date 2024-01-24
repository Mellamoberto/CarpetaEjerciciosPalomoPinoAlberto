package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class ModificarRegistro {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		try {
			Session session = context.currentSession();

			session.beginTransaction();

			String updateHql = "UPDATE Producto SET nombre = 'El Archivo de las Tormentas' WHERE id = 6";
			Query<?> updateQuery = session.createQuery(updateHql);
			updateQuery.executeUpdate();

			String selectHql = "FROM Producto WHERE id = 6";
			Query<Producto> selectQuery = session.createQuery(selectHql, Producto.class);
			List<Producto> alumnos = selectQuery.list();

			System.out.println("Registros en la tabla producto despues de la actualizacion:");
			for (Producto p : alumnos) {
				System.out.println(p.toString());
			}

			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			context.unbind(sessionFactory);
			sessionFactory.close();
		}
	}
}