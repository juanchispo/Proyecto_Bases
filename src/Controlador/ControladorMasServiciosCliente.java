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
        String[] datos = dao.ControladorMasServiciosCliente();

        DefaultTableModel modelo = (DefaultTableModel) vista.getTbClienServ().getModel();
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

