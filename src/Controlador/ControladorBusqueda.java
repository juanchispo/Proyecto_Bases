package Controlador;

import Vista.IFrmAdministrador;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 *
 * @author Dyl
 */
public class ControladorBusqueda extends ControladorAdministrador{
    private IFrmAdministrador ifrm;
    
    public ControladorBusqueda(IFrmAdministrador ifrm) {
        this.ifrm = ifrm;
    }
    
    
    
    @Override
    public void iniciar() {
        inicializarBotones(ifrm);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(ifrm.getRdbFrecuentes())){
            ifrm.getRdbAvanzadas().setSelected(false);
        } else if(e.getSource().equals(ifrm.getRdbAvanzadas())){
            ifrm.getRdbFrecuentes().setSelected(false);
        }
    }
    
}

