package Controlador;

import Modelo.Conductor;
import Modelo.Dao.DaoVehiculoConductor;
import Modelo.VehiculoConductor;
import Vista.Crear.IFrmVehiculosConductor;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * Controlador para gestionar la relación Vehículo-Conductor
 * @author Dyl
 */
public class ControladorVehiculoConductor extends Controlador {
    private IFrmVehiculosConductor ifrm;
    private ControladorPrincipal ctrP;
    private Conductor conductor;

    public ControladorVehiculoConductor(IFrmVehiculosConductor ifrm, ControladorPrincipal ctrP, Conductor conductor) {
        this.ifrm = ifrm;
        this.ctrP = ctrP;
        this.conductor = conductor;
    }

    public void llenarCmb() {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        DaoVehiculoConductor dao = new DaoVehiculoConductor();
        for (VehiculoConductor vc : dao.consultar(conductor)) {
            modelo.addElement(String.valueOf(vc.getId_placa()));
        }
        ifrm.getCmbVehiculos().setModel(modelo);
    }

    @Override
    public void iniciar() {
        inicializarBotones(ifrm);
        ifrm.getLblVehiculos().setText("VEHÍCULOS DEL CONDUCTOR");
        ctrP.getFrm().getEscritorio().add(ifrm);
        llenarLista();
        ifrm.setVisible(true);
    }

    public void llenarLista() {
        DaoVehiculoConductor dao = new DaoVehiculoConductor();
        DefaultListModel<String> lista = new DefaultListModel<>();
        for (VehiculoConductor vc : dao.consultar(conductor)) {
            lista.addElement("Placa ID: " + vc.getId_placa());
        }
        ifrm.getLsVehiculos().setModel(lista);
        llenarCmb();
    }

    public boolean validarPlaca(String idPlaca) {
        return idPlaca != null && !idPlaca.trim().isEmpty();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DaoVehiculoConductor dao = new DaoVehiculoConductor();

        if (e.getSource().equals(ifrm.getBtnAddVehiculo())) {
            String idPlaca = ifrm.getTxtPlaca().getText().trim();
            if (validarPlaca(idPlaca)) {
                VehiculoConductor vc = new VehiculoConductor(Integer.parseInt(idPlaca), conductor.getId());
                dao.agregar(vc);
            }
            llenarLista();

        } else if (e.getSource().equals(ifrm.getBtnBorrarVehiculo())) {
            if (JOptionPane.showConfirmDialog(ifrm, "¿Desea eliminar el vehículo?", "Confirmación Eliminar Vehículo", 0) == 0) {
                String seleccion = ifrm.getLsVehiculos().getSelectedValue();
                if (seleccion != null) {
                    int idPlaca = Integer.parseInt(seleccion.replace("Placa ID: ", "").trim());
                    dao.eliminar(new VehiculoConductor(idPlaca, conductor.getId()));
                }
            }
            llenarLista();

        } else if (e.getSource().equals(ifrm.getBtnEditVehiculo())) {
            if (JOptionPane.showConfirmDialog(ifrm, "¿Desea editar el vehículo?", "Confirmación Editar Vehículo", 0) == 0) {
                String nuevaPlaca = ifrm.getTxtNuevaPlaca().getText().trim();
                String placaAnterior = String.valueOf(ifrm.getCmbVehiculos().getSelectedItem());
                if (validarPlaca(nuevaPlaca) && placaAnterior != null) {
                    dao.actualizar(
                        new VehiculoConductor(Integer.parseInt(nuevaPlaca), conductor.getId()),
                        new VehiculoConductor(Integer.parseInt(placaAnterior), conductor.getId())
                    );
                }
            }
            llenarLista();
        }
    }
}