/*
 * Este es el controlador principal, esta directamente asociado a FrmPrincipal y
 * es desde donde se gestionan los demas Internal Frame
 */
package Controlador;

import Vista.FrmPrincipal;
import Vista.IFrmAdministrador;
import Vista.IFrmRegistro;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author Dyl
 */
public class ControladorPrincipal extends Controlador{
    FrmPrincipal frm;

    public FrmPrincipal getFrm() {
        return frm;
    }

    public void setFrm(FrmPrincipal frm) {
        this.frm = frm;
    }
    
    
    public ControladorPrincipal(FrmPrincipal frm) {
        this.frm = frm;
    }
    
    public ControladorPrincipal() {
        this.frm = new FrmPrincipal();
    }

    @Override
    public void iniciar() {
        frm.getPnlInferior().setVisible(false);
        inicializarBotones(frm);
        frm.setVisible(true);
        registrarUsuario();
    }

    private void registrarUsuario(){
        IFrmRegistro ifrmR = new IFrmRegistro();
        ControladorRegistrar contR = new ControladorRegistrar(this, ifrmR);
        contR.iniciar();        
    }

    public void iniciarFrmAdministrador() {
        IFrmAdministrador ifrmA = new IFrmAdministrador();
        ControladorAdministrador contA = new ControladorAdministrador(this, ifrmA);
        contA.iniciar();
        frm.getPnlInferior().setVisible(true);
        frm.getEscritorio().add(ifrmA);
    } 
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(frm.getBtnCerrarSesion())){
                registrarUsuario();

        }
    }   
}
