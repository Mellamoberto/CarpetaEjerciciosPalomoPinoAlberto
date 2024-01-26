package modelo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MostrarRegistros {
    public static void mostrarRegistros() {
        try (SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
             Session session = sessionFactory.openSession()) {

            session.beginTransaction();
           
            List<Empresa> empresas = session.createQuery("from Empresa", Empresa.class).list();

            for (Empresa empresa : empresas) {
                System.out.println("ID: " + empresa.getId() + ", Nombre: " + empresa.getNombre() + ", Pais: " + empresa.getPais());
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        mostrarRegistros();
    }
}