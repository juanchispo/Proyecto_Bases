package Controlador;

import Modelo.Servicio;
import Modelo.Dao.DaoServicio;
import Vista.Crear.IFrmAddModServicioDetalles;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/**
 * Controlador para mostrar detalles completos de un servicio
 * @author Dyl
 */
public class ControladorServicioDetalles extends Controlador {
    private IFrmAddModServicioDetalles ifrm;
    private ControladorPrincipal ctrP;
    private Servicio servicio;

    public ControladorServicioDetalles(IFrmAddModServicioDetalles ifrm, ControladorPrincipal ctrP, Servicio servicio) {
        this.ifrm = ifrm;
        this.ctrP = ctrP;
        this.servicio = servicio;
    }

    @Override
    public void iniciar() {
        inicializarBotones(ifrm);
        
        // Configurar título y ID del servicio
        ifrm.getLblAddModCliente().setText("DETALLES DEL SERVICIO");
        ifrm.getTxtId().setText(String.valueOf(servicio.getId_servicio()));
        
        ctrP.getFrm().getEscritorio().add(ifrm);
        cargarDetallesServicio();
        ifrm.setVisible(true);
    }

    /** Carga todos los detalles del servicio en la tabla */
    public void cargarDetallesServicio() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        // Crear modelo de tabla
        DefaultTableModel model = (DefaultTableModel) ifrm.getJTable2().getModel();
        model.setRowCount(0); // Limpiar tabla
        
        // Agregar filas con la información del servicio
        model.addRow(new Object[]{"ID Servicio:", servicio.getId_servicio()});
        model.addRow(new Object[]{"Fecha del Servicio:", 
            servicio.getFecha_servicio() != null ? 
                sdf.format(servicio.getFecha_servicio()) : "No disponible"});
        model.addRow(new Object[]{"Valor del Servicio:", 
            String.format("$%,.2f", servicio.getValor_servicio())});
        model.addRow(new Object[]{"Dirección Origen:", 
            servicio.getDireccion_ori() != null && !servicio.getDireccion_ori().isEmpty() ? 
                servicio.getDireccion_ori() : "No especificada"});
        model.addRow(new Object[]{"Dirección Destino:", 
            servicio.getDireccion_des() != null && !servicio.getDireccion_des().isEmpty() ? 
                servicio.getDireccion_des() : "No especificada"});
        model.addRow(new Object[]{"Cliente:", 
            servicio.getCliente() != null ? 
                servicio.getCliente().getNombre() + " (ID: " + servicio.getCliente().getId() + ")" : 
                "No asignado"});
        model.addRow(new Object[]{"Conductor:", 
            servicio.getConductor() != null ? 
                servicio.getConductor().getNombre() + " (ID: " + servicio.getConductor().getId() + ")" : 
                "No asignado"});
        model.addRow(new Object[]{"Tipo de Servicio:", 
            servicio.getTipo_servicio() != null ? 
                servicio.getTipo_servicio().getNombreServicio(): "No especificado"});
        model.addRow(new Object[]{"Medio de Pago:", 
            servicio.getMedio_pago() != null ? 
                servicio.getMedio_pago().getNombre_medio_pago() : "No especificado"});
        model.addRow(new Object[]{"Tarifa Aplicada:", 
            servicio.getTarifa() != null ? 
                "Nivel: " + servicio.getTarifa().getNivel() + " - Valor: $" + 
                servicio.getTarifa().getValor_tarifa() : "No especificada"});
        
        // Agregar información de estado
        String estado = determinarEstadoServicio();
        model.addRow(new Object[]{"Estado del Servicio:", estado});
        
        // Información adicional
        model.addRow(new Object[]{"Información Adicional:", 
            servicio.getConductor() != null && servicio.getCliente() != null ?
            "Servicio completado exitosamente" : 
            servicio.getConductor() == null ? "Esperando asignación de conductor" : "En proceso"});
    }
    
    private String determinarEstadoServicio() {
        if (servicio.getConductor() == null) {
            return "PENDIENTE - Sin conductor asignado";
        } else if (servicio.getCliente() == null) {
            return "PENDIENTE - Sin cliente asignado";
        } else {
            return "COMPLETADO";
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Botón VOLVER
        if (e.getSource().equals(ifrm.getBtnAddMod())) {
            ifrm.dispose(); // Cerrar la ventana de detalles
        }
    }
}