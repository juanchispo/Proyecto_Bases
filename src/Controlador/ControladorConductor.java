package Controlador;

import Controlador.AddMod.ControladorAddConductor;
import Controlador.AddMod.ControladorModConductor;
import Modelo.Conductor;
import Modelo.Dao.DaoConductor;
import Vista.Crear.IFrmAddModConductor;
import Vista.IFrmAdministrador;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dyl
 */
public class ControladorConductor extends ControladorAdministrador{
    IFrmAdministrador ifrm;
    ArrayList<Conductor> conductores;
    int pgConductores;
    AtomicInteger rsConductores;
    
    public ControladorConductor(IFrmAdministrador ifrm) {
        this.ifrm = ifrm;
        this.rsConductores = new AtomicInteger();
        this.pgConductores = 1;
    }

    @Override
    public void iniciar() {
        inicializarBotones(ifrm);
    }
    
    public void actualizarTbConductores(){
        DaoConductor daoc = new DaoConductor();
        conductores = daoc.listar((pgConductores-1)*15, 15, rsConductores);
        Object[][] datos = new Object[conductores.size()][5];
        for (int i = 0; i < conductores.size(); i++) {
            datos[i] = conductores.get(i).getDatos();
        }
        llenarTabla(ifrm.getTbConductores().getModel(), datos);
        ifrm.getTxtMostrandoConductor().setText("Mostrando " + pgConductores +" de "+ calcularPaginas(rsConductores, 15));
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ifrm.getBtnBuscarConductor())){
            actualizarTbConductores();
        } else if (e.getSource().equals(ifrm.getBtnAnteriorConductor())){
            pgConductores = reducirPagina(pgConductores, rsConductores);
            actualizarTbConductores();
        } else if (e.getSource().equals(ifrm.getBtnSiguienteConductor())){
            pgConductores = aumentarPagina(pgConductores, rsConductores);
            actualizarTbConductores();
        } else if (e.getSource().equals(ifrm.getBtnBorrarConductor())){
            int indice = ifrm.getTbConductores().getSelectedRow();
            int confirmacion = JOptionPane.showConfirmDialog(ifrm, 
                    "¿Esta seguro que desea" +
                    "eliminar el cliente de id " +
                    String.valueOf(ifrm.getTbConductores().getValueAt(indice, 0)) +
                    " y de nombre " +
                    String.valueOf(ifrm.getTbConductores().getValueAt(indice, 1)) + 
                    "?"
            , "Confirmacion para eliminar Conductor", 0);
            if (confirmacion == 0) {
            DaoConductor daoc = new DaoConductor();
            boolean eliminar = daoc.eliminar(Integer.parseInt(String.valueOf(ifrm.getTbConductores().getValueAt(indice, 0))));
            String msg = eliminar ? "Eliminado correctamente." : "Error al eliminar.";
            ctrlP.frm.getLblAvisos().setText("Aviso -> "+ msg);
                actualizarTbConductores();
            }
        } else if (e.getSource().equals(ifrm.getBtnTelefonosConductor())){
            Conductor c = conductores.get(ifrm.getTbConductores().getSelectedRow());
            telefonos(c);
        } else if (e.getSource().equals(ifrm.getBtnEditarConductor())){
            int index = ifrm.getTbConductores().getSelectedRow();
            IFrmAddModConductor ifrmR = new IFrmAddModConductor();
            ControladorModConductor contC = new ControladorModConductor(ifrmR, ctrlP, conductores.get(index));
            contC.iniciar(); 
            actualizarTbConductores();
        } else if (e.getSource().equals(ifrm.getBtnCrearConductor())){
            IFrmAddModConductor ifrmR = new IFrmAddModConductor();
            ControladorAddConductor contC = new ControladorAddConductor(ifrmR, ctrlP);
            contC.iniciar(); 
        } 
    }

}
