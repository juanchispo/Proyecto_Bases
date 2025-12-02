package Controlador;

import Modelo.Dao.DaoConductor;
import Vista.IFrmAdministrador;
import javax.swing.table.DefaultTableModel;

public class ControladorMasServiciosConductor extends Controlador {

    private IFrmAdministrador vista;

    public ControladorMasServiciosConductor(IFrmAdministrador vista) {
        this.vista = vista;
    }

    @Override
    public void iniciar() {
        cargarConductorMasServicios();
    }

    private void cargarConductorMasServicios() {

        DaoConductor dao = new DaoConductor();
        String[] datos = dao.conductorMasServiciosVista();

        DefaultTableModel modelo
                = (DefaultTableModel) vista.getTbConduServ().getModel();

        modelo.setRowCount(0);

        if (datos != null) {
            modelo.addRow(new Object[]{
                datos[0],
                datos[1],
                datos[2]
            });
        }
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
    }
}
