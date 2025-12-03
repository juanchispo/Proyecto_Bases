package Controlador.AddMod;

import Controlador.Controlador;
import Controlador.ControladorPrincipal;
import Modelo.Conductor;
import Modelo.Dao.DaoConductor;
import Modelo.Dao.DaoGenero;
import Modelo.Dao.DaoNacionalidad;
import Modelo.Genero;
import Modelo.Nacionalidad;
import Vista.Crear.IFrmAddModConductor;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Dyl
 */
public class ControladorAddConductor extends Controlador{
    IFrmAddModConductor ifrm;
    ControladorPrincipal ctrlP;
    Conductor conductor;

    public ControladorAddConductor(IFrmAddModConductor ifrm, ControladorPrincipal ctrlP) {
        this.ifrm = ifrm;
        this.ctrlP = ctrlP;
        this.conductor = new Conductor();
    }
    
    public void llenarCmb(){
        DefaultComboBoxModel<String> lista = new DefaultComboBoxModel<>();
        for (String telefono : conductor.getTelefonos()) {
            lista.addElement(String.valueOf(telefono));
        }
        ifrm.getCmbTelefonos().setModel(lista);
        
        DaoNacionalidad daon = new DaoNacionalidad();
        DefaultComboBoxModel<String> listaN = new DefaultComboBoxModel<>();
        for (Nacionalidad nacionalidad : daon.listar()) {
            listaN.addElement(String.valueOf(nacionalidad.getNacionalidad()));
        }
        ifrm.getCmbNacionalidad().setModel(listaN);
        
        DaoGenero daog = new DaoGenero();
        DefaultComboBoxModel<String> listaG = new DefaultComboBoxModel<>();
        for (Genero genero : daog.listar()) {
            listaG.addElement(String.valueOf(genero.getGenero()));
        }
        ifrm.getCmbGenero().setModel(listaG);
    }
    
    
    @Override
    public void iniciar() {
        inicializarBotones(ifrm);
        String titulo = "CREACION DE CLIENTE";
        ifrm.getLblAddModConductor().setText(titulo);
        ctrlP.getFrm().getEscritorio().add(ifrm);
        llenarLista();
        llenarCmb();
        ifrm.setVisible(true);
    }
    
    public void llenarLista(){
        DefaultListModel<String> lista = new DefaultListModel<>();
        for (String telefono : conductor.getTelefonos()) {
            lista.addElement(String.valueOf(telefono));
        }
        ifrm.getLsTelefonos().setModel(lista);
        
    }
    
    public boolean validarTelefono(String telefono){
        return true;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ifrm.getBtnAddMod())){
            conductor.setId(Integer.parseInt(ifrm.getTxtId().getText()));
            conductor.setNombre(ifrm.getTxtNombre().getText());
            conductor.setDireccion(ifrm.getTxtDireccion().getText());
            System.out.println(String.valueOf(ifrm.getCmbNacionalidad().getSelectedItem()));
            conductor.setNacionalidad(new Nacionalidad(ifrm.getCmbNacionalidad().getSelectedIndex() + 1, String.valueOf(ifrm.getCmbNacionalidad().getSelectedItem())));
            conductor.setGenero(new Genero(ifrm.getCmbGenero().getSelectedIndex() + 1, String.valueOf(ifrm.getCmbGenero().getSelectedItem())));
            DaoConductor daoc = new DaoConductor();
            boolean agregar = daoc.agregar(conductor);
            if (agregar) {
                ifrm.dispose();
                ctrlP.getFrm().getEscritorio().remove(ifrm);
                ctrlP.getFrm().getEscritorio().revalidate();
                ctrlP.getFrm().getEscritorio().repaint();
            }
        }
        if (e.getSource().equals(ifrm.getBtnAddTelefonos())){             
            if (validarTelefono(ifrm.getTxtTelefono().getText())) {
                conductor.getTelefonos().add(ifrm.getTxtTelefono().getText());
            }            
            llenarLista();
        } else if (e.getSource().equals(ifrm.getBtnBorrarTelefonos())){
                if ((JOptionPane.showConfirmDialog(ifrm, "Desea eliminar el telefono?", "Confirmacion Eliminar Telefono", 0)) == 0) {
                    conductor.getTelefonos().remove(ifrm.getLsTelefonos().getSelectedValue());
                }                
            llenarLista();
        } else if (e.getSource().equals(ifrm.getBtnEditTelefonos())){
                if ((JOptionPane.showConfirmDialog(ifrm, "Desea editar el telefono?", "Confirmacion Editar Telefono", 0)) == 0) {
                    conductor.getTelefonos().remove(String.valueOf(ifrm.getCmbTelefonos().getSelectedItem()));
                    conductor.getTelefonos().add(ifrm.getTxtNueNumero().getText());
                }  
            llenarLista();
        }
    }    
}
