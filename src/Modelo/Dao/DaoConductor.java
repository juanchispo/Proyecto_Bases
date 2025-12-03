package Modelo.Dao;

import Modelo.Conductor;
import Modelo.Genero;
import Modelo.Nacionalidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JOptionPane;

public class DaoConductor {

    private final Conexion conn = new Conexion();

    // AGREGAR → INSERT
    public boolean agregar(Conductor c) {
        Connection cnx = null;
        String stc = "INSERT INTO Conductor (id_conductor, direccion, fotografia, nacionalidad, genero, nombre) "
                + "VALUES (?,?,?,?,?,?)";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(stc)) {
                pst.setInt(1, c.getId());
                pst.setString(2, c.getDireccion());
                pst.setString(3, c.getFotografia());
                pst.setInt(4, c.getNacionalidad().getId_nacionalidad());
                pst.setInt(5, c.getGenero().getId_genero());
                pst.setString(6, c.getNombre());

                pst.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el INSERT -> " + ex);
            mensaje("Error al ejecutar el INSERT", "Agregar!!!");
            return false;
        } finally {
            conn.cerrarConexion(cnx);
        }
    }

    // ELIMINAR → DELETE
    public boolean eliminar(int idConductor) {
        Connection cnx = null;
        String stc = "DELETE FROM Conductor WHERE id_conductor = ?";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(stc)) {
                pst.setInt(1, idConductor);

                pst.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el DELETE -> " + ex);
            mensaje("Error al ejecutar el DELETE", "Eliminar!!!");
            return false;
        } finally {
            conn.cerrarConexion(cnx);
        }
    }

    // ACTUALIZAR → UPDATE
    public boolean actualizar(Conductor c) {
        Connection cnx = null;
        String stc = "UPDATE Conductor SET direccion = ?, fotografia = ?, nacionalidad = ?, genero = ?, nombre = ? "
                + "WHERE id_conductor = ?";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(stc)) {
                pst.setString(1, c.getDireccion());
                pst.setString(2, c.getFotografia());
                pst.setInt(3, c.getNacionalidad().getId_nacionalidad());
                pst.setInt(4, c.getGenero().getId_genero());
                pst.setString(5, c.getNombre());
                pst.setInt(6, c.getId());

                pst.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el UPDATE -> " + ex);
            mensaje("Error al ejecutar el UPDATE", "Actualizar!!!");
            return false;
        } finally {
            conn.cerrarConexion(cnx);
        }
    }

    // CONSULTAR → SELECT
    public boolean consultar(Conductor c) {
        Connection cnx = null;
        String stc = "SELECT * FROM Conductor WHERE id_conductor = ?";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(stc)) {
                pst.setInt(1, c.getId());

                try (ResultSet rst = pst.executeQuery()) {
                    if (rst.next()) {
                        c.setId(rst.getInt("id_conductor"));
                        c.setDireccion(rst.getString("direccion"));
                        c.setFotografia(rst.getString("fotografia"));
                        c.setNacionalidad(new Nacionalidad(Integer.valueOf(rst.getString("nacionalidad")), ""));
                        c.setGenero(new Genero(rst.getInt("genero"), ""));
                        c.setNombre(rst.getString("nombre"));
                        return true;
                    }
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar el SELECT -> " + ex);
            mensaje("Error al ejecutar el SELECT", "Consultar!!!");
            return false;
        } finally {
            conn.cerrarConexion(cnx);
        }
        return false;
    }

    public ArrayList<Conductor> listar(int offset, int limit, AtomicInteger resultados) {
        ArrayList<Conductor> lista = new ArrayList<>();
        Connection cnx = null;

        String sql
                = "SELECT c.id_conductor, c.nombre, c.direccion, c.fotografia, "
                + "n.id_nacionalidad, n.nacionalidad, g.id_genero, g.genero, "
                + "COUNT(*) OVER() AS total_registros "
                + "FROM conductor c "
                + "LEFT JOIN nacionalidad n ON c.nacionalidad = n.id_nacionalidad "
                + "LEFT JOIN genero g ON c.genero = g.id_genero "
                + "ORDER BY c.id_conductor "
                + "LIMIT ? OFFSET ?";

        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(sql)) {

                pst.setInt(1, limit);
                pst.setInt(2, offset);

                try (ResultSet rs = pst.executeQuery()) {
                    while (rs.next()) {
                        Conductor con = new Conductor();
                        con.setId(rs.getInt("id_conductor"));
                        con.setNombre(rs.getString("nombre"));
                        con.setDireccion(rs.getString("direccion"));
                        con.setFotografia(rs.getString("fotografia"));

                        Nacionalidad nac = new Nacionalidad();
                        nac.setId_nacionalidad(rs.getInt("id_nacionalidad"));
                        nac.setNacionalidad(rs.getString("nacionalidad"));
                        con.setNacionalidad(nac);

                        Genero gen = new Genero();
                        gen.setId_genero(rs.getInt("id_genero"));
                        gen.setGenero(rs.getString("genero"));
                        con.setGenero(gen);

                        lista.add(con);
                        resultados.set(rs.getInt("total_registros"));
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Error SELECT Conductor: " + e.getMessage());
        } finally {
            conn.cerrarConexion(cnx);
        }
        return lista;
    }

    public String[][] conductorMasServiciosVista() {
        Connection cnx = null;
        String stc = "SELECT * FROM vista_conductor_mas_servicios";

        ArrayList<String[]> resultados = new ArrayList<>();
        try {
            cnx = conn.getConexion();
            try (PreparedStatement pst = cnx.prepareStatement(stc); ResultSet rst = pst.executeQuery()) {

                while (rst.next()) {
                    String[] fila = new String[]{
                        rst.getString("id_conductor"),
                        rst.getString("nombre"),
                        rst.getString("total_servicios")
                    };
                    resultados.add(fila);
                }
            }
        } catch (SQLException ex) {
            System.err.println("Error consultando la vista -> " + ex);
        } finally {
            conn.cerrarConexion(cnx);
        }

        return resultados.toArray(new String[resultados.size()][3]);
    }


    public void mensaje(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, 1);
    }
}
