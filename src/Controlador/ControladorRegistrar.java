/*
 * Controlador para IFrmRegistar y registrar el usuario
 */
package Controlador;

import java.sql.Connection;
import Modelo.Dao.Conexion;
import Modelo.imagenes.PanelLogo;
import Vista.IFrmRegistro;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dyl
 */
public class ControladorRegistrar extends Controlador{
    private IFrmRegistro ifrm;
    private ControladorPrincipal ctrP;
    
    public ControladorRegistrar(ControladorPrincipal ctrP, IFrmRegistro ifrm) {
        this.ctrP = ctrP;
        this.ifrm = ifrm;
    }

@Override
public void iniciar() {
    inicializarBotones(ifrm);
    
    ifrm.getTxtNombre().setText("aventurerosbda");
    ifrm.getTxtConstrasena().setText("123456");
    PanelLogo pn = new PanelLogo("src/img/aventureros sin fondo.png");
    pn.setPreferredSize(new Dimension(150, 200));

    JPanel panelDestino = ifrm.getPnlImagen();
    panelDestino.setLayout(new BorderLayout()); 
    panelDestino.removeAll(); 
    panelDestino.add(pn, BorderLayout.CENTER);
    panelDestino.revalidate();
    panelDestino.repaint();

    ifrm.setLocation(380, 10);
    ctrP.getFrm().getPnlInferior().setVisible(false);

    JDesktopPane escritorio = ctrP.getFrm().getEscritorio();
    escritorio.removeAll();
    escritorio.add(ifrm);
    escritorio.revalidate();
    escritorio.repaint();

    ifrm.setVisible(true);
}

    
    public boolean getAcceso(){
        Conexion con = new Conexion();
        con.setUsuario("postgres");
        con.setNombreBD(ifrm.getTxtNombre().getText());
        con.setContrasena(ifrm.getTxtConstrasena().getText());
        Connection cxn = con.getConexion();
        if (cxn == null){
            return false;
        } else {
            con.cerrarConexion(cxn);
            return true;
        } 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ifrm.getBtnIngresar())){
            if (getAcceso()) {
                ctrP.iniciarFrmAdministrador();            
                ifrm.dispose();
                ctrP.getFrm().getEscritorio().remove(ifrm);
            } else {
                JOptionPane.showMessageDialog(ifrm, "Fallo al conectarse a la base de datos.");
            }
        }
    }
}
