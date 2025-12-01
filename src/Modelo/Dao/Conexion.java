package Modelo.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    public Connection getConexion() {
        Connection cnx = null;
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/aventurerosbda";

        String usuario = "postgres";    
        String contrasena = "123456"; 

        try {
            Class.forName(driver);
            cnx = DriverManager.getConnection(url, usuario, contrasena);
        } catch (SQLException | ClassNotFoundException ex) {
            System.err.println("Error al conectar la BD -> " + ex);
        }
        return cnx;
    }
}
