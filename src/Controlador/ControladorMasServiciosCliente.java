package Controlador;

import Modelo.Dao.DaoCliente;
import Vista.IFrmAdministrador;
import javax.swing.table.DefaultTableModel;

public class ControladorMasServiciosCliente extends Controlador {

    private IFrmAdministrador vista;

    public ControladorMasServiciosCliente(IFrmAdministrador vista) {
        this.vista = vista;
        inicializarBotones(vista); 
        iniciar();
    }

    @Override
    public void iniciar() {
        cargarClienteMasServicios();
    }
    private void cargarClienteMasServicios() {

        DaoCliente dao = new DaoCliente();
        String[][] datos = dao.ControladorMasServiciosCliente();

        DefaultTableModel modelo
                = (DefaultTableModel) vista.getTbClienServ().getModel();

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

