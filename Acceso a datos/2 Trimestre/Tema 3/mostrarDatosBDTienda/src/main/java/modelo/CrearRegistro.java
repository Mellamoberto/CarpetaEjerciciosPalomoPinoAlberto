package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;

public class CrearRegistro {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
        context.bind(sessionFactory.openSession());

        try {
            Session session = context.currentSession();

            session.beginTransaction();

            String selectHqlBeforeInsert = "FROM Fabricante";
            Query<Fabricante> selectQueryBeforeInsert = session.createQuery(selectHqlBeforeInsert, Fabricante.class);
            List<Fabricante> fabricantesBeforeInsert = selectQueryBeforeInsert.list();

            System.out.println("Registros en la tabla Fabricante antes de la inserción:");
            for (Fabricante f : fabricantesBeforeInsert) {
                System.out.println(f.toString());
            }

            Fabricante nuevoFabricante = new Fabricante();
            nuevoFabricante.setNombre("Aragorn");

            session.save(nuevoFabricante);

            String selectHqlAfterInsert = "FROM Fabricante";
            Query<Fabricante> selectQueryAfterInsert = session.createQuery(selectHqlAfterInsert, Fabricante.class);
            List<Fabricante> fabricantesAfterInsert = selectQueryAfterInsert.list();

            System.out.println("Registros en la tabla fabricante después de la inserción:");
            for (Fabricante f : fabricantesAfterInsert) {
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
