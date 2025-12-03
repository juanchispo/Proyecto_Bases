package Controlador;

import Modelo.Dao.BusquedasDao;
import Vista.IFrmAdministrador;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dyl
 */
public class ControladorBusqueda extends ControladorAdministrador{
    private IFrmAdministrador ifrm;
    
    public ControladorBusqueda(IFrmAdministrador ifrm) {
        this.ifrm = ifrm;
    }
    
    public void llenarConsultaTabla(){
        if (ifrm.getRdbFrecuentes().isSelected()){
            BusquedasDao daob = new BusquedasDao();
            switch (ifrm.getCmbBusquedas().getSelectedIndex()) {
                case 0:
                    ifrm.getTbConsultas().setModel(daob.valoresTotalesServicios().getModel());
                    break;
                case 1:
                    ifrm.getTbConsultas().setModel(daob.cantidadServiciosPorMes().getModel());
                    break;
                case 2:
                    String inicio = JOptionPane.showInputDialog(
                        ifrm, 
                        "Ingrese la fecha de inicio (formato AAAA-MM-DD):", 
                        "Fecha de Inicio", 
                        JOptionPane.QUESTION_MESSAGE
                    );

                    String fin = JOptionPane.showInputDialog(
                        ifrm, 
                        "Ingrese la fecha de fin (formato AAAA-MM-DD):", 
                        "Fecha de Fin", 
                        JOptionPane.QUESTION_MESSAGE
                    );

                    if (inicio != null && fin != null && !inicio.trim().isEmpty() && !fin.trim().isEmpty()) {
                        ifrm.getTbConsultas().setModel(daob.clientesPorPeriodo(inicio, fin).getModel());
                    } else {
                        JOptionPane.showMessageDialog(
                            ifrm,
                            "Debe ingresar ambas fechas para realizar la consulta.",
                            "Error de Ingreso",
                            JOptionPane.ERROR_MESSAGE
                        );
                    }
                    break;
                case 3:
                    ifrm.getTbConsultas().setModel(daob.valoresPorMedioPago().getModel());
                    break;
                case 4:
                    ifrm.getTbConsultas().setModel(daob.promedioPorNacionalidad().getModel());
                    break;
                case 5:
                    String inicio_c5 = JOptionPane.showInputDialog(
                        ifrm, 
                        "Ingrese la fecha de inicio (formato AAAA-MM-DD):", 
                        "Fecha de Inicio", 
                        JOptionPane.QUESTION_MESSAGE
                    );

                    String fin_c5 = JOptionPane.showInputDialog(
                        ifrm, 
                        "Ingrese la fecha de fin (formato AAAA-MM-DD):", 
                        "Fecha de Fin", 
                        JOptionPane.QUESTION_MESSAGE
                    );

                    if (inicio_c5 != null && fin_c5 != null && !inicio_c5.trim().isEmpty() && !fin_c5.trim().isEmpty()) {
                        ifrm.getTbConsultas().setModel(daob.conductoresPorPeriodo(inicio_c5, fin_c5).getModel());
                    } else {
                        JOptionPane.showMessageDialog(
                            ifrm,
                            "Debe ingresar ambas fechas para realizar la consulta.",
                            "Error de Ingreso",
                            JOptionPane.ERROR_MESSAGE
                        );
                    }
                    break;
                case 6:
                    ifrm.getTbConsultas().setModel(daob.serviciosPorGenero().getModel());
                    break;
                default:
                    throw new AssertionError();
            }
        } else if (ifrm.getRdbAvanzadas().isSelected()){
            BusquedasDao daob = new BusquedasDao();
            System.out.println("dsd");
            ifrm.getTbConsultas().setModel(daob.consultaLibre(ifrm.getTxtSQL().getText()).getModel());
        }   
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
        } else if(e.getSource().equals(ifrm.getBtnBA())) {
            llenarConsultaTabla();
        }
    }
    
}

