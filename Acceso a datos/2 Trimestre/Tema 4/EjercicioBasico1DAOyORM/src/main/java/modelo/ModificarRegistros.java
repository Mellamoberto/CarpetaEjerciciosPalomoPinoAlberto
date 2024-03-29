package modelo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ModificarRegistros {
    public static void modificarRegistros() {
        try (SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
             Session session = sessionFactory.openSession()) {

            session.beginTransaction();
            String updateHql = "UPDATE Categorias SET categoria = 'ca' WHERE id = 11";
            Query<?> updateQuery = session.createQuery(updateHql);
            updateQuery.executeUpdate();
           session.getTransaction().commit();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
    	modificarRegistros();
    }
}
