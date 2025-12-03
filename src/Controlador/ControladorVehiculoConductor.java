package Controlador;

import Modelo.Conductor;
import Modelo.Dao.DaoVehiculoConductor;
import Modelo.Vehiculo;
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
        DaoVehiculoConductor dao = new DaoVehiculoConductor();
        // Obtener placas de vehículos disponibles
        DefaultComboBoxModel<String> modelo = dao.obtenerPlacasVehiculos();
        
        // Crear un nuevo modelo y copiar los elementos
        DefaultComboBoxModel<String> lista = new DefaultComboBoxModel<>();
        for (int i = 0; i < modelo.getSize(); i++) {
            lista.addElement(modelo.getElementAt(i));
        }
        
        ifrm.getjComboBox1().setModel(lista);
    }
    
    @Override
    public void iniciar() {
        inicializarBotones(ifrm);
        ifrm.getLblAddModCliente().setText("VEHÍCULOS DEL CONDUCTOR: " + conductor.getNombre());
        ctrP.getFrm().getEscritorio().add(ifrm);
        llenarLista();
        ifrm.setVisible(true);
    }
    
    public void llenarLista() {
        DaoVehiculoConductor dao = new DaoVehiculoConductor();
        
        // Obtener conductores para mostrar en la lista
        DefaultListModel<String> listaConductores = dao.listarConductores();
        
        // Crear nuevo modelo para vehículos del conductor
        DefaultListModel<String> lista = new DefaultListModel<>();
        
        // Obtener vehículos asignados a este conductor específico
        DefaultListModel<String> vehiculosConductor = dao.obtenerVehiculosPorConductor(conductor.getIdConductor());
        
        // Copiar elementos al nuevo modelo
        for (int i = 0; i < vehiculosConductor.getSize(); i++) {
            lista.addElement(vehiculosConductor.getElementAt(i));
        }
        
        ifrm.getjList1().setModel(lista);
        llenarCmb();
    }

    public boolean validarPlaca(String placa) {
        DaoVehiculoConductor dao = new DaoVehiculoConductor();
        return placa != null && !placa.trim().isEmpty() && dao.existePlaca(placa);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        DaoVehiculoConductor dao = new DaoVehiculoConductor();
        
        // Botón AGREGAR - Asignar vehículo al conductor
        if (e.getSource().equals(ifrm.getBtnAddMod())) { 
            String placaSeleccionada = (String) ifrm.getjComboBox1().getSelectedItem();
            
            if (validarPlaca(placaSeleccionada)) {
                // Verificar si la placa ya está asignada
                if (dao.placaYaAsignada(placaSeleccionada)) {
                    JOptionPane.showMessageDialog(ifrm, 
                        "Esta placa ya está asignada a otro conductor", 
                        "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                // Obtener el vehículo completo por la placa
                Vehiculo vehiculo = dao.consultarVehiculoPorPlaca(placaSeleccionada);
                
                if (vehiculo != null) {
                    // Crear la relación Vehículo-Conductor
                    VehiculoConductor vc = new VehiculoConductor(vehiculo, conductor);
                    
                    // Guardar en la base de datos
                    if (dao.asignarVehiculoConductor(vc)) {
                        JOptionPane.showMessageDialog(ifrm, 
                            "Vehículo " + vehiculo.getPlaca() + " asignado al conductor " + conductor.getNombre(),
                            "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(ifrm, 
                            "Error al asignar el vehículo", 
                            "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(ifrm, 
                    "Placa inválida o no existe", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
            llenarLista();
            
        // Botón BORRAR - Eliminar vehículo del conductor
        } else if (e.getSource().equals(ifrm.getjButton1())) {
            String seleccion = ifrm.getjList1().getSelectedValue();
            
            if (seleccion != null && !seleccion.trim().isEmpty()) {
                // Extraer la placa del texto seleccionado
                String placa = seleccion.split(" - ")[0];
                
                if (JOptionPane.showConfirmDialog(ifrm, 
                    "¿Desea eliminar el vehículo " + placa + " del conductor " + conductor.getNombre() + "?", 
                    "Confirmación Eliminar Vehículo", 
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    
                    if (dao.eliminarVehiculoConductor(placa, conductor.getIdConductor())) {
                        JOptionPane.showMessageDialog(ifrm, 
                            "Vehículo eliminado correctamente",
                            "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(ifrm, 
                            "Error al eliminar el vehículo",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(ifrm, 
                    "Seleccione un vehículo de la lista",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            llenarLista();
            
        // Si necesitas botón EDITAR (para cambiar vehículo asignado)
        } else if (e.getSource().equals(ifrm.getBtnAddMod())) {
            // Este sería para editar, pero normalmente en relaciones muchos a muchos
            // se hace eliminando y agregando nuevo
            JOptionPane.showMessageDialog(ifrm, 
                "Para cambiar un vehículo, elimine el actual y agregue uno nuevo",
                "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    // Método para manejar la selección en el ComboBox
    public void actualizarInfoVehiculo(String placa) {
        DaoVehiculoConductor dao = new DaoVehiculoConductor();
        Vehiculo vehiculo = dao.consultarVehiculoPorPlaca(placa);
        
        if (vehiculo != null) {
           
        }
    }
}