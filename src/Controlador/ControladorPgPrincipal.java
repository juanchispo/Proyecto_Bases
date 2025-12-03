package Controlador;

import Modelo.Dao.DaoCliente;
import Modelo.Dao.DaoConductor;
import Modelo.Dao.DaoServicio;
import Modelo.imagenes.PanelLogo;
import Vista.IFrmAdministrador;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Dyl, juancho
 */
public class ControladorPgPrincipal extends Controlador{
    private IFrmAdministrador vista;
    
    public ControladorPgPrincipal(IFrmAdministrador vista) {
        this.vista = vista;
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
    
    public void actualizarTbServiPri(){
        DaoServicio daoS = new DaoServicio();
        TableModel tb = vista.getTbServRec().getModel();
        tb = daoS.obtenerServiciosTableModel(tb);
        vista.getTbServRec().setModel(tb);
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
    
    private void cargarMesMasGanancias() {

        DaoServicio dao = new DaoServicio();
        String[] datos = dao.obtenerMesMasGanancias(); 

  
        if (datos != null) {
            vista.getTxtGanaciasAnio().setText(
                "Mes: " + datos[0] + "  |  Ganancias: $" + datos[1]
            );
        } else {
            vista.getTxtGanaciasAnio().setText("Sin datos disponibles");
        }
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
    public void iniciar() {
        actualizarTbServiPri();
        cargarGananciasUltimoMes();
        cargarClienteMasServicios();
        cargarConductorMasServicios();
        cargarMesMasGanancias();
        inicializarBotones(vista);
        
        PanelLogo pn = new PanelLogo("src/img/ganancias.png");
        pn.setPreferredSize(new Dimension(150, 150));
        
        JPanel panelDestino = vista.getPnlGanancias();
        panelDestino.setLayout(new BorderLayout()); 
        panelDestino.removeAll(); 
        panelDestino.add(pn, BorderLayout.CENTER);
        panelDestino.revalidate();
        panelDestino.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
    }
    
}
