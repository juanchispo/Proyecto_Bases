package Controlador;

import Modelo.Dao.DaoUsuario;
import Modelo.Usuario;
import Vista.IFrmRegistro;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ControladorRegistrar extends Controlador {

    private IFrmRegistro ifrm;
    private ControladorPrincipal ctrP;

    public ControladorRegistrar(ControladorPrincipal ctrP, IFrmRegistro ifrm) {
        this.ctrP = ctrP;
        this.ifrm = ifrm;
    }

    @Override
    public void iniciar() {
        inicializarBotones(ifrm);

        // Si no existe admin → solo permitir crear administrador
        DaoUsuario dao = new DaoUsuario();
        if (!dao.existeAdmin()) {
            ifrm.getCmbAdministrador().removeAllItems();
            ifrm.getCmbAdministrador().addItem("Administrador");
        }

        // Mostrar formulario en el escritorio
        ctrP.getFrm().getEscritorio().removeAll();
        ctrP.getFrm().getEscritorio().add(ifrm);
        ifrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ifrm.getBtnIngresar())) {

            String nombre = ifrm.getTxtNombre().getText().trim();
            String contrasena = ifrm.getLblConstrasena().getText().trim();
            String tipo = ifrm.getCmbAdministrador().getSelectedItem().toString();

            DaoUsuario dao = new DaoUsuario();
            Usuario u = new Usuario(nombre, contrasena, tipo);

            if (nombre.isEmpty() || contrasena.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Complete todos los campos.");
                return;
            }

            if (tipo.equals("Administrador") && dao.existeAdmin()) {
                JOptionPane.showMessageDialog(null, "Ya existe un administrador.");
                return;
            }

            if (dao.agregar(u)) {
                JOptionPane.showMessageDialog(null, "Usuario registrado.");

                ifrm.dispose();
                ctrP.iniciarFrmAdministrador();
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar usuario.");
            }
        }
    }
}
