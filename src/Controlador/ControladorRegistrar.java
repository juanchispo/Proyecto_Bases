/*
 * Controlador para IFrmRegistar y registrar el usuario
 */
package Controlador;

import Vista.FrmPrincipal;
import Vista.IFrmRegistro;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;

/**
 *
 * @author Dyl
 */
public class ControladorRegistrar extends Controlador{
    private IFrmRegistro ifrm;
    private ControladorPrincipal ctrP;
    private Boolean acceso = false;
    
    public ControladorRegistrar(ControladorPrincipal ctrP, IFrmRegistro ifrm) {
        this.ctrP = ctrP;
        this.ifrm = ifrm;
    }

    @Override
    public void inicializarBotones() {
        ifrm.getBtnIngresar().addActionListener(this);
    }

    @Override
    public void iniciar() {
        inicializarBotones();
        ifrm.setVisible(true);
        ifrm.setLocation(380, 10);
        ctrP.getFrm().getPnlInferior().setVisible(false);
        ctrP.getFrm().getEscritorio().removeAll();
        ctrP.getFrm().getEscritorio().add(ifrm);
        ctrP.getFrm().getEscritorio().updateUI();
    }
    
    public boolean getAcceso(){
        return acceso;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ifrm.getBtnIngresar())){
            ctrP.iniciarFrmAdministrador();            
            ifrm.dispose();
            ctrP.getFrm().getEscritorio().remove(ifrm);
        }
    }
}
