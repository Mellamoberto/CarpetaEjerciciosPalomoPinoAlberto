package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class EliminarRegistro {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		try {
			Session session = context.currentSession();

			session.beginTransaction();

			String selectHqlBeforeDelete = "FROM Producto WHERE id = 6";
			Query<Producto> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Producto.class);
			List<Producto> productosBeforeDelete = selectQueryBeforeDelete.list();

			System.out.println("Registros en la tabla producto antes de la eliminacion:");
			for (Producto p : productosBeforeDelete) {
				System.out.println(p.toString());
			}

			String deleteHql = "DELETE FROM Producto WHERE id = 6";
			Query<?> deleteQuery = session.createQuery(deleteHql);
			deleteQuery.executeUpdate();

			String selectHqlAfterDelete = "FROM Producto";
			Query<Producto> selectQueryAfterDelete = session.createQuery(selectHqlAfterDelete, Producto.class);
			List<Producto> productosAfterDelete = selectQueryAfterDelete.list();

			System.out.println("Registros en la tabla producto despues de la eliminacion:");
			for (Producto p : productosAfterDelete) {
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