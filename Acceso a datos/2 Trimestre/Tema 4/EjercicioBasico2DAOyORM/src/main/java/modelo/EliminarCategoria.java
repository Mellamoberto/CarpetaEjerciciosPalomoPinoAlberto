package modelo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EliminarCategoria {
    public static void eliminarRegistros() {
        try (SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
             Session session = sessionFactory.openSession()) {

            session.beginTransaction();
            String deleteHql = "DELETE FROM Categorias WHERE id = 11";
            Query<?> deleteQuery = session.createQuery(deleteHql);
            deleteQuery.executeUpdate();
           session.getTransaction().commit();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        eliminarRegistros();
    }
}
