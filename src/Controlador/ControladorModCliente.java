package Controlador;

import Modelo.Cliente;
import Modelo.Dao.DaoCliente;
import Modelo.Dao.DaoGenero;
import Modelo.Dao.DaoNacionalidad;
import Modelo.Dao.DaoTelefonoCliente;
import Modelo.Dao.DaoTelefonoConductor;
import Modelo.Genero;
import Modelo.Nacionalidad;
import Vista.Crear.IFrmAddModCliente;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Dyl
 */
public class ControladorModCliente extends Controlador{
    IFrmAddModCliente ifrm;
    ControladorPrincipal ctrlP;
    Cliente cliente;

    public ControladorModCliente(IFrmAddModCliente ifrm, ControladorPrincipal ctrlP, Cliente cliente) {
        this.ifrm = ifrm;
        this.ctrlP = ctrlP;
        this.cliente = cliente;
    }
    
    public void llenarTxt(){
        ifrm.getTxtDireccion().setText(cliente.getDireccion());
        ifrm.getTxtId().setText(String.valueOf(cliente.getId()));
        ifrm.getTxtNombre().setText(cliente.getNombre());
    }
    
    public void llenarCmb(){
        DefaultComboBoxModel<String> listaT = new DefaultComboBoxModel<>();
        for (String telefono : cliente.getTelefonos()) {
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
            if (cliente.getNacionalidad().getNacionalidad().equals(listaN.getElementAt(i)))
                ifrm.getCmbNacionalidad().setSelectedIndex(i);
        }
                
        DaoGenero daog = new DaoGenero();
        DefaultComboBoxModel<String> listaG = new DefaultComboBoxModel<>();
        for (Genero genero : daog.listar()) {
            listaG.addElement(String.valueOf(genero.getGenero()));
        }
        ifrm.getCmbGenero().setModel(listaG);
        for (int i = 0; i < listaG.getSize(); i++) {
            if (cliente.getGenero().getGenero().equals(listaG.getElementAt(i)))
                ifrm.getCmbGenero().setSelectedIndex(i);
        }
    }
    
    
    @Override
    public void iniciar() {
        inicializarBotones(ifrm);
        String titulo = "MODIFICACION DE CLIENTE";
        ifrm.getTxtId().setEditable(false);
        ifrm.getLblAddModCliente().setText(titulo);
        ifrm.getBtnAddMod().setText("Editar");
        ctrlP.getFrm().getEscritorio().add(ifrm);
        llenarTxt();
        llenarLista();
        ifrm.setVisible(true);
    }
    
    public void llenarLista(){
        DaoTelefonoCliente daot = new DaoTelefonoCliente();
        cliente.setTelefonos(daot.consultar(cliente));
        DefaultListModel<String> lista = new DefaultListModel<>();
        for (String telefono : cliente.getTelefonos()) {
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
            cliente.setNombre(ifrm.getTxtNombre().getText());
            cliente.setDireccion(ifrm.getTxtDireccion().getText());
            System.out.println(String.valueOf(ifrm.getCmbNacionalidad().getSelectedItem()));
            cliente.setNacionalidad(new Nacionalidad(ifrm.getCmbNacionalidad().getSelectedIndex() + 1, String.valueOf(ifrm.getCmbNacionalidad().getSelectedItem())));
            cliente.setGenero(new Genero(ifrm.getCmbGenero().getSelectedIndex() + 1, String.valueOf(ifrm.getCmbGenero().getSelectedItem())));
            DaoCliente daoc = new DaoCliente();
            boolean actualizar = daoc.actualizar(cliente);
            if (actualizar) {
                ifrm.dispose();
                ctrlP.getFrm().getEscritorio().remove(ifrm);
                ctrlP.getFrm().getEscritorio().revalidate();
                ctrlP.getFrm().getEscritorio().repaint();
            }
        }
        if (e.getSource().equals(ifrm.getBtnAddTelefonos())){ 
            if (validarTelefono(ifrm.getTxtTelefono().getText())) {
                    DaoTelefonoCliente daot = new DaoTelefonoCliente();
                    daot.agregar(cliente.getId(), ifrm.getTxtTelefono().getText());                                  
            }
            llenarLista();
        } else if (e.getSource().equals(ifrm.getBtnBorrarTelefonos())){
            if ((JOptionPane.showConfirmDialog(ifrm, "Desea eliminar el telefono?", "Confirmacion Eliminar Telefono", 0)) == 0) {
                DaoTelefonoCliente daot = new DaoTelefonoCliente();
                daot.eliminar(cliente.getId(), ifrm.getLsTelefonos().getSelectedValue());
            }               
            llenarLista();
        } else if (e.getSource().equals(ifrm.getBtnEditTelefonos())){
            if ((JOptionPane.showConfirmDialog(ifrm, "Desea editar el telefono?", "Confirmacion Editar Telefono", 0)) == 0) {
                DaoTelefonoCliente daot = new DaoTelefonoCliente();
                daot.actualizar(cliente.getId(), ifrm.getTxtNueNumero().getText(), String.valueOf(ifrm.getCmbTelefonos().getSelectedItem()));
            }   
            llenarLista();        
        }
    }    
}
