package modelo;

import java.sql.Date;

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
		   	Fabricante fabricante = new Fabricante("pc gaming3");

        	Session session = context.currentSession();
        	session.beginTransaction();
        	session.save(fabricante);      	     	
        	session.getTransaction().commit();
        	
        	Producto producto = new Producto("PORTATIL gaming3", 3000f, fabricante);

        	Session session1 = context.currentSession();
        	session1.beginTransaction();
        	session1.save(producto);
        	session1.getTransaction().commit();
        	
        	Compra compra = new Compra(Date.valueOf("2024-01-20"), producto, 50);
        	
        	Session session2 = context.currentSession();
        	session2.beginTransaction();
        	session2.save(compra);
        	session2.getTransaction().commit();
        	
        	System.out.println(producto.toString());
        	System.out.println(fabricante.toString());
        	System.out.println(compra.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ThreadLocalSessionContext.unbind(sessionFactory);
			sessionFactory.close();
		}
	}
}