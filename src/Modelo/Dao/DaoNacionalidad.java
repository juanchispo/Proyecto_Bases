package Modelo.Dao;

import Modelo.Nacionalidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DaoNacionalidad {

    private final Conexion conn = new Conexion();

    public ArrayList<Nacionalidad> listar() {
        ArrayList<Nacionalidad> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM nacionalidad";

        try (Connection cn = conn.getConexion();
             PreparedStatement pst = cn.prepareStatement(sql)) {

            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    Nacionalidad nac = new Nacionalidad();
                    nac.setId_nacionalidad(rs.getInt("id_nacionalidad"));
                    nac.setNacionalidad(rs.getString("nacionalidad"));
                    lista.add(nac);
                }
            }

        } catch (SQLException e) {
            System.err.println("Error SELECT Nacionalidad: " + e.getMessage());
        }
        return lista;
    }

    public void mensaje(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, 1);
    }
}