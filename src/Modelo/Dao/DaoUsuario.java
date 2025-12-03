package Modelo.Dao;

import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DaoUsuario extends Conexion {

    // =======================
    // INSERTAR USUARIO
    // =======================
    public boolean agregar(Usuario u) {

        String sql = "INSERT INTO usuario (nombre, password, tipo) VALUES (?, ?, ?)";

        try (Connection cnx = getConexion(); PreparedStatement pst = cnx.prepareStatement(sql)) {

            pst.setString(1, u.getNombre());
            pst.setString(2, u.getPassword());
            pst.setString(3, u.getTipo());

            return pst.executeUpdate() > 0;

        } catch (SQLException ex) {
            System.err.println("Error INSERT usuario -> " + ex);
            mensaje("Error al registrar usuario", "Agregar Usuario");
            return false;
        }
    }

    // =======================
    // VALIDAR LOGIN
    // =======================
    public boolean validarLogin(Usuario u) {

        String sql = "SELECT * FROM usuario WHERE nombre = ? AND password = ?";

        try (Connection cnx = getConexion(); PreparedStatement pst = cnx.prepareStatement(sql)) {

            pst.setString(1, u.getNombre());
            pst.setString(2, u.getPassword());

            try (ResultSet rs = pst.executeQuery()) {

                if (rs.next()) {
                    u.setTipo(rs.getString("tipo"));
                    return true;
                }
            }

        } catch (SQLException ex) {
            System.err.println("Error LOGIN -> " + ex);
            mensaje("Error al validar credenciales", "Login");
        }

        return false;
    }

    // =======================
    // CONSULTAR USUARIO
    // =======================
    public boolean consultar(Usuario u) {

        String sql = "SELECT * FROM usuario WHERE nombre = ?";

        try (Connection cnx = getConexion(); PreparedStatement pst = cnx.prepareStatement(sql)) {

            pst.setString(1, u.getNombre());

            try (ResultSet rs = pst.executeQuery()) {

                if (rs.next()) {
                    u.setNombre(rs.getString("nombre"));
                    u.setPassword(rs.getString("password"));
                    u.setTipo(rs.getString("tipo"));
                    return true;
                }
            }

        } catch (SQLException ex) {
            System.err.println("Error SELECT usuario -> " + ex);
            mensaje("Error al consultar usuario", "Consultar Usuario");
        }

        return false;
    }

    // =======================
    // VERIFICAR ADMIN
    // =======================
    public boolean existeAdmin() {

    String sql = "SELECT * FROM usuario WHERE LOWER(tipo) = LOWER('Administrador') LIMIT 1";

    try (Connection cnx = getConexion();
         PreparedStatement pst = cnx.prepareStatement(sql);
         ResultSet rs = pst.executeQuery()) {

        return rs.next();

    } catch (SQLException ex) {
        System.err.println("Error SELECT admin -> " + ex);
        mensaje("Error al verificar administrador", "Verificar Admin");
        return false;
    }
}


    private void mensaje(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.ERROR_MESSAGE);
    }
}
