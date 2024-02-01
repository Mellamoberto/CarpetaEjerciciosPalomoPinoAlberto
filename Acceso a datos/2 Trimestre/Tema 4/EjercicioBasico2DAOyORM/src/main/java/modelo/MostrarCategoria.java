package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MostrarCategoria {
	 public static void mostrarRegistros() {
	        try (SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	             Session session = sessionFactory.openSession()) {

	            session.beginTransaction();
	           
	            List<Categorias> categorias = session.createQuery("from Categorias", Categorias.class).list();

	            for (Categorias categoria : categorias) {
	                System.out.println("ID: " + categoria.getId() + ", Categoría: " + categoria.getCategoria() + ", Categoría: " + categoria.getSubcategoria());
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
