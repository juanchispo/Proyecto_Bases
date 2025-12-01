package Controlador;

import Modelo.Cliente;
import Modelo.Conductor;
import Modelo.Dao.DaoTelefonoCliente;
import Modelo.Dao.DaoTelefonoConductor;
import Modelo.Persona;
import Modelo.imagenes.PanelLogo;
import Vista.Crear.IFrmTelefonos;
import Vista.IFrmRegistro;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dyl
 */
public class ControladorTelefonos extends Controlador{
    private IFrmTelefonos ifrm;
    private ControladorPrincipal ctrP;
    private Persona p;

    public ControladorTelefonos(IFrmTelefonos ifrm, ControladorPrincipal ctrP, Persona p) {
        this.ifrm = ifrm;
        this.ctrP = ctrP;
        this.p = p;
    }

    public void llenarCmb(){
        DefaultComboBoxModel<String> lista = new DefaultComboBoxModel<>();
        for (String telefono : p.getTelefonos()) {
            lista.addElement(String.valueOf(telefono));
        }
        ifrm.getCmbTelefonos().setModel(lista);
    }
    
    
    @Override
    public void iniciar() {
        inicializarBotones(ifrm);
        String titulo = p instanceof Cliente ? "TELEFONO DE CLIENTE": "TELEFONO DE CONDUCTOR";
        ifrm.getLblTelefonos().setText(titulo);
        ctrP.getFrm().getEscritorio().add(ifrm);
        llenarLista();
        ifrm.setVisible(true);
    }
    
    public void llenarLista(){
        p.getTelefonos().clear();
        if (p instanceof Cliente){
            DaoTelefonoCliente daot = new DaoTelefonoCliente();
            p.setTelefonos(daot.consultar((Cliente) p));
        } else {
            DaoTelefonoConductor daot = new DaoTelefonoConductor();
            p.setTelefonos(daot.consultar((Conductor) p));
        }
        DefaultListModel<String> lista = new DefaultListModel<>();
        for (String telefono : p.getTelefonos()) {
            lista.addElement(String.valueOf(telefono));
        }
        ifrm.getLsTelefonos().setModel(lista);
        llenarCmb();
    }

    public boolean validarTelefono(String telefono){
        return true;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ifrm.getBtnAddTelefonos())){ 
            if (p instanceof Cliente){
                if (validarTelefono(ifrm.getTxtTelefono().getText())) {
                    DaoTelefonoCliente daot = new DaoTelefonoCliente();
                    daot.agregar(p.getId(), ifrm.getTxtTelefono().getText());                    
                }                
            } else {
                if (validarTelefono(ifrm.getTxtTelefono().getText())) {
                    DaoTelefonoConductor daot = new DaoTelefonoConductor();
                    daot.agregar(p.getId(), ifrm.getTxtTelefono().getText());
                }
            }
            llenarLista();
        } else if (e.getSource().equals(ifrm.getBtnBorrarTelefonos())){
            if (p instanceof Cliente){
                if ((JOptionPane.showConfirmDialog(ifrm, "Desea eliminar el telefono?", "Confirmacion Eliminar Telefono", 0)) == 0) {
                    DaoTelefonoCliente daot = new DaoTelefonoCliente();
                    daot.eliminar(p.getId(), ifrm.getLsTelefonos().getSelectedValue());
                }                
            } else {
                if ((JOptionPane.showConfirmDialog(ifrm, "Desea eliminar el telefono?", "Confirmacion Eliminar Telefono", 0)) == 0) {
                    DaoTelefonoConductor daot = new DaoTelefonoConductor();
                    daot.eliminar(p.getId(), ifrm.getLsTelefonos().getSelectedValue());
                } 
            }
            llenarLista();
        } else if (e.getSource().equals(ifrm.getBtnEditTelefonos())){
            if (p instanceof Cliente){
                if ((JOptionPane.showConfirmDialog(ifrm, "Desea editar el telefono?", "Confirmacion Editar Telefono", 0)) == 0) {
                    DaoTelefonoCliente daot = new DaoTelefonoCliente();
                    daot.actualizar(p.getId(), ifrm.getTxtNueNumero().getText(), String.valueOf(ifrm.getCmbTelefonos().getSelectedItem()));
                }  
            } else {
                if ((JOptionPane.showConfirmDialog(ifrm, "Desea editar el telefono?", "Confirmacion Editar Telefono", 0)) == 0) {
                    DaoTelefonoConductor daot = new DaoTelefonoConductor();
                    daot.actualizar(p.getId(), ifrm.getTxtNueNumero().getText(), String.valueOf(ifrm.getCmbTelefonos().getSelectedItem()));
                }  
            }
            llenarLista();
        }
    }  
}
