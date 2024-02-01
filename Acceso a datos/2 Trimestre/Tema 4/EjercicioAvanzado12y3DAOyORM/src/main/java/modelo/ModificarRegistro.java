package modelo;

import modelo.EmpresaDAO;
import modelo.EmpresaDAOHibernate;
import modelo.Empresa;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ModificarRegistro {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        EmpresaDAO empresaDAO = new EmpresaDAOHibernate(sessionFactory);

        System.out.println("Empresas existentes:");
        empresaDAO.mostrarTodasLasEmpresas().forEach(empresa -> {
            System.out.println("ID: " + empresa.getId() + ", Nombre: " + empresa.getNombre() + ", País: " + empresa.getPais());
        });
        
        System.out.println();
        
        empresaDAO.modificarEmpresa(new Empresa(2, "Juank", "Italia"));
        
        System.out.println("Empresas existentes tras la actualizacion:");
        empresaDAO.mostrarTodasLasEmpresas().forEach(empresa -> {
            System.out.println("ID: " + empresa.getId() + ", Nombre: " + empresa.getNombre() + ", País: " + empresa.getPais());
        });

        sessionFactory.close();
    }
}