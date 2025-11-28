/*
 * Controlador para IFrmAdministrador
 */
package Controlador;

import Vista.IFrmAdministrador;
import java.awt.event.ActionEvent;

/**
 *
 * @author Dyl
 */
public class ControladorAdministrador extends Controlador{
    IFrmAdministrador ifrm;

    public ControladorAdministrador(IFrmAdministrador ifrm) {
        this.ifrm = ifrm;
    }
    
    public ControladorAdministrador() {
        this.ifrm = new IFrmAdministrador();
    }
    
    @Override
    public void inicializarBotones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void iniciar() {
        ifrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
