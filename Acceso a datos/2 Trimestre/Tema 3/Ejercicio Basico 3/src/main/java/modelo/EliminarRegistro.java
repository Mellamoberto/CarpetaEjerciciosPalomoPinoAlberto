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

			String selectHqlBeforeDelete = "FROM Alumno WHERE id = 11";
			Query<Alumno> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Alumno.class);
			List<Alumno> alumnosBeforeDelete = selectQueryBeforeDelete.list();

			System.out.println("Registros en la tabla alumnos antes de la eliminación:");
			for (Alumno a : alumnosBeforeDelete) {
				System.out.println(a.toString());
			}

			String deleteHql = "DELETE FROM Alumno WHERE id = 12";
			Query<?> deleteQuery = session.createQuery(deleteHql);
			deleteQuery.executeUpdate();

			String selectHqlAfterDelete = "FROM Alumno";
			Query<Alumno> selectQueryAfterDelete = session.createQuery(selectHqlAfterDelete, Alumno.class);
			List<Alumno> alumnosAfterDelete = selectQueryAfterDelete.list();

			System.out.println("Registros en la tabla Fabricante después de la eliminación:");
			for (Alumno a : alumnosAfterDelete) {
				System.out.println(a.toString());
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
