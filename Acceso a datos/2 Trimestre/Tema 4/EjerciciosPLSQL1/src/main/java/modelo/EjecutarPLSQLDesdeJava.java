package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;


public class EjecutarPLSQLDesdeJava {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();


        try (Session session = sessionFactory.openSession()) {
            session.doWork(connection -> {
                String procedimientoAlmacenado = "{ CALL ejecutar_bloque_plsql(?) }";


                try (CallableStatement statement = connection.prepareCall(procedimientoAlmacenado)) {

                    statement.registerOutParameter(1, Types.VARCHAR);

                    statement.execute();

                    String output = statement.getString(1);

                    System.out.println(output);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
    }
}
