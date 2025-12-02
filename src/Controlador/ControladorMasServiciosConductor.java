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
        String[][] datos = dao.conductorMasServiciosVista();

        DefaultTableModel modelo
                = (DefaultTableModel) vista.getTbConduServ().getModel();

        modelo.setRowCount(0);

        if (datos != null) {
            for (int i = 0; i < datos.length; i++) {
                modelo.addRow(new Object[]{
                    datos[i][0],
                    datos[i][1],
                    datos[i][2]
                });
            }
        }
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
    }
}
