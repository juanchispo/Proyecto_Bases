package Controlador;

import Modelo.Dao.BusquedasDao;
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
                    ifrm.getTbConsultas().setModel(daob.valoresTotalesServicios().getModel());
                    break;
                default:
                    throw new AssertionError();
            }
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

