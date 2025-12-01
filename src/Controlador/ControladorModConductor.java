package Controlador;

import Modelo.Conductor;
import Modelo.Dao.DaoConductor;
import Modelo.Dao.DaoGenero;
import Modelo.Dao.DaoNacionalidad;
import Modelo.Dao.DaoTelefonoConductor;
import Modelo.Dao.DaoTelefonoConductor;
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
public class ControladorModConductor extends Controlador{
    IFrmAddModConductor ifrm;
    ControladorPrincipal ctrlP;
    Conductor conductor;

    public ControladorModConductor(IFrmAddModConductor ifrm, ControladorPrincipal ctrlP, Conductor conductor) {
        this.ifrm = ifrm;
        this.ctrlP = ctrlP;
        this.conductor = conductor;
    }
    
    public void llenarTxt(){
        ifrm.getTxtDireccion().setText(conductor.getDireccion());
        ifrm.getTxtId().setText(String.valueOf(conductor.getId()));
        ifrm.getTxtNombre().setText(conductor.getNombre());
    }
    
    public void llenarCmb(){
        DefaultComboBoxModel<String> listaT = new DefaultComboBoxModel<>();
        for (String telefono : conductor.getTelefonos()) {
            listaT.addElement(String.valueOf(telefono));
        }
        ifrm.getCmbTelefonos().setModel(listaT);      
        
        DaoNacionalidad daon = new DaoNacionalidad();
        DefaultComboBoxModel<String> listaN = new DefaultComboBoxModel<>();
        for (Nacionalidad nacionalidad : daon.listar()) {
            listaN.addElement(String.valueOf(nacionalidad.getNacionalidad()));
        }
        ifrm.getCmbNacionalidad().setModel(listaN);
        for (int i = 0; i < listaN.getSize(); i++) {
            if (conductor.getNacionalidad().getNacionalidad().equals(listaN.getElementAt(i)))
                ifrm.getCmbNacionalidad().setSelectedIndex(i);
        }
                
        DaoGenero daog = new DaoGenero();
        DefaultComboBoxModel<String> listaG = new DefaultComboBoxModel<>();
        for (Genero genero : daog.listar()) {
            listaG.addElement(String.valueOf(genero.getGenero()));
        }
        ifrm.getCmbGenero().setModel(listaG);
        for (int i = 0; i < listaG.getSize(); i++) {
            if (conductor.getGenero().getGenero().equals(listaG.getElementAt(i)))
                ifrm.getCmbGenero().setSelectedIndex(i);
        }
    }
    
    
    @Override
    public void iniciar() {
        inicializarBotones(ifrm);
        String titulo = "MODIFICACION DE CONDUCTOR";
        ifrm.getTxtId().setEditable(false);
        ifrm.getLblAddModConductor().setText(titulo);
        ifrm.getBtnAddMod().setText("Editar");
        ctrlP.getFrm().getEscritorio().add(ifrm);
        llenarTxt();
        llenarLista();
        ifrm.setVisible(true);
    }
    
    public void llenarLista(){
        DaoTelefonoConductor daot = new DaoTelefonoConductor();
        conductor.setTelefonos(daot.consultar(conductor));
        DefaultListModel<String> lista = new DefaultListModel<>();
        for (String telefono : conductor.getTelefonos()) {
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
        if (e.getSource().equals(ifrm.getBtnAddMod())){
            conductor.setNombre(ifrm.getTxtNombre().getText());
            conductor.setDireccion(ifrm.getTxtDireccion().getText());
            System.out.println(String.valueOf(ifrm.getCmbNacionalidad().getSelectedItem()));
            conductor.setNacionalidad(new Nacionalidad(ifrm.getCmbNacionalidad().getSelectedIndex() + 1, String.valueOf(ifrm.getCmbNacionalidad().getSelectedItem())));
            conductor.setGenero(new Genero(ifrm.getCmbGenero().getSelectedIndex() + 1, String.valueOf(ifrm.getCmbGenero().getSelectedItem())));
            DaoConductor daoc = new DaoConductor();
            boolean actualizar = daoc.actualizar(conductor);
            if (actualizar) {
                ifrm.dispose();
                ctrlP.getFrm().getEscritorio().remove(ifrm);
                ctrlP.getFrm().getEscritorio().revalidate();
                ctrlP.getFrm().getEscritorio().repaint();
            }
        }
        if (e.getSource().equals(ifrm.getBtnAddTelefonos())){ 
            if (validarTelefono(ifrm.getTxtTelefono().getText())) {
                    DaoTelefonoConductor daot = new DaoTelefonoConductor();
                    daot.agregar(conductor.getId(), ifrm.getTxtTelefono().getText());                                  
            }
            llenarLista();
        } else if (e.getSource().equals(ifrm.getBtnBorrarTelefonos())){
            if ((JOptionPane.showConfirmDialog(ifrm, "Desea eliminar el telefono?", "Confirmacion Eliminar Telefono", 0)) == 0) {
                DaoTelefonoConductor daot = new DaoTelefonoConductor();
                daot.eliminar(conductor.getId(), ifrm.getLsTelefonos().getSelectedValue());
            }               
            llenarLista();
        } else if (e.getSource().equals(ifrm.getBtnEditTelefonos())){
            if ((JOptionPane.showConfirmDialog(ifrm, "Desea editar el telefono?", "Confirmacion Editar Telefono", 0)) == 0) {
                DaoTelefonoConductor daot = new DaoTelefonoConductor();
                daot.actualizar(conductor.getId(), ifrm.getTxtNueNumero().getText(), String.valueOf(ifrm.getCmbTelefonos().getSelectedItem()));
            }   
            llenarLista();        
        }
    }     
}
