package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

import java.util.List;

public class Eliminar {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		try {
			Session session = context.currentSession();

			session.beginTransaction();

			String selectHqlBeforeDelete = "FROM Fabricante WHERE id = 11";
			Query<Fabricante> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Fabricante.class);
			List<Fabricante> fabricantesBeforeDelete = selectQueryBeforeDelete.list();

			System.out.println("Registros en la tabla fabricante antes de la eliminación:");
			for (Fabricante f : fabricantesBeforeDelete) {
				System.out.println(f.toString());
			}

			String deleteHql = "DELETE FROM Fabricante WHERE id = 10";
			Query<?> deleteQuery = session.createQuery(deleteHql);
			deleteQuery.executeUpdate();

			String selectHqlAfterDelete = "FROM Fabricante";
			Query<Fabricante> selectQueryAfterDelete = session.createQuery(selectHqlAfterDelete, Fabricante.class);
			List<Fabricante> fabricantesAfterDelete = selectQueryAfterDelete.list();

			System.out.println("Registros en la tabla Fabricante después de la eliminación:");
			for (Fabricante f : fabricantesAfterDelete) {
				System.out.println(f.toString());
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
