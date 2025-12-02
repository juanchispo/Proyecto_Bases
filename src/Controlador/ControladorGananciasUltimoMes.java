package Controlador;

import Modelo.Dao.DaoServicio;
import Vista.IFrmAdministrador;
import javax.swing.table.DefaultTableModel;

public class ControladorGananciasUltimoMes extends Controlador {

    private IFrmAdministrador vista;

    public ControladorGananciasUltimoMes(IFrmAdministrador vista) {
        this.vista = vista;
    }

    @Override
    public void iniciar() {
        cargarGananciasUltimoMes();
    }

    private void cargarGananciasUltimoMes() {

        DaoServicio dao = new DaoServicio();
        String ganancias = dao.obtenerGananciasUltimoMes();

        if (ganancias == null) {
            ganancias = "0";
        }

        vista.getTxtRecaudoUMes().setText(ganancias);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
    }
}
