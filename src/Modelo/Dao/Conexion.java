package Modelo.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static String usuario = "postgres";    
    private static String contrasena = "123456"; 
    private static String nombreBD = "aventurerosbda";

    public Connection getConexion() {
        Connection cnx = null;
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/" + nombreBD;

        try {
            Class.forName(driver);
            cnx = DriverManager.getConnection(url, usuario, contrasena);
        } catch (SQLException | ClassNotFoundException ex) {
            System.err.println("Error al conectar la BD -> " + ex);
        }
        return cnx;
    }
    
    
    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        Conexion.usuario = usuario;
    }

    public static String getContrasena() {
        return contrasena;
    }

    public static void setContrasena(String contrasena) {
        Conexion.contrasena = contrasena;
    }

    public static String getNombreBD() {
        return nombreBD;
    }

    public static void setNombreBD(String nombreBD) {
        Conexion.nombreBD = nombreBD;
    }
    
    public void cerrarConexion(Connection cnx) {
        if (cnx != null) {
            try {
                if (!cnx.isClosed()) {
                    cnx.close();
                }
            } catch (SQLException ex) {
                System.err.println("Error al cerrar la conexión a la BD -> " + ex.getMessage());
            }
        }
    }
}
