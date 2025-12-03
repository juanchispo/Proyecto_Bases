package Controlador;

import Modelo.Conductor;
import Modelo.Dao.DaoVehiculoConductor;
import Modelo.VehiculoConductor;
import Vista.Crear.IFrmVehiculosConductor;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * Controlador para gestionar la relación Vehículo-Conductor
 * @author Dyl
 */
public class ControladorVehiculoConductor extends Controlador {
    private IFrmVehiculosConductor ifrm;
    private ControladorPrincipal ctrP;
    private Conductor conductor;

    public ControladorVehiculoConductor(IFrmVehiculosConductor ifrm, ControladorPrincipal ctrP, Conductor conductor) {
        this.ifrm = ifrm;
        this.ctrP = ctrP;
        this.conductor = conductor;
    }

    public void llenarCmb() {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        DaoVehiculoConductor dao = new DaoVehiculoConductor();
        ifrm.getVehiculos().setModel(dao.obtenerPlacasVehiculos());
    }

    @Override
    public void iniciar() {
        inicializarBotones(ifrm);
        ifrm.getLblAddModCliente().setText("VEHÍCULOS DEL CONDUCTOR");
        ctrP.getFrm().getEscritorio().add(ifrm);
        llenarLista();
        ifrm.setVisible(true);
    }

    public void llenarLista() {
        DaoVehiculoConductor dao = new DaoVehiculoConductor();
        DefaultListModel<String> lista = new DefaultListModel<>();        
        ifrm.getConductores().setModel(dao.listarConductores());
        llenarCmb();
    }
    
    

    public boolean validarPlaca(String idPlaca) {
        return idPlaca != null && !idPlaca.trim().isEmpty();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DaoVehiculoConductor dao = new DaoVehiculoConductor();

        if (e.getSource().equals(ifrm.getAgregar())) {
            llenarLista();
        } else if (e.getSource().equals(ifrm.getVer())) {
            llenarLista();
        }
    }
}