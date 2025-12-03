/*
 * Controlador para IFrmAdministrador
 */
package Controlador;

import Controlador.AddMod.ControladorModConductor;
import Controlador.AddMod.ControladorModCliente;
import Controlador.AddMod.ControladorAddCliente;
import Controlador.AddMod.ControladorAddConductor;
import java.lang.Math;
import Modelo.Cliente;
import Vista.IFrmAdministrador;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import Modelo.Dao.*;
import Modelo.Persona;
import Modelo.Conductor;
import Modelo.Servicio;
import Modelo.VehiculoTipoServicio;
import Modelo.imagenes.ImgTabla;
import Vista.Crear.IFrmAddModCliente;
import Vista.Crear.IFrmAddModConductor;
import Vista.Crear.IFrmTelefonos;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dyl
 */
public class ControladorAdministrador extends Controlador{
    IFrmAdministrador ifrm;
    ControladorPrincipal ctrlP;
 
    

    public ControladorAdministrador(ControladorPrincipal ctrlP, IFrmAdministrador ifrm) {
        this.ifrm = ifrm;
        this.ctrlP = ctrlP;
    }
    
    public ControladorAdministrador() {
        this.ifrm = new IFrmAdministrador();
    }
    
    public void llenarTabla(TableModel tbM, Object[][] datos) {
        ((DefaultTableModel) tbM).setRowCount(0);
        for (Object[] dato : datos) {
            ((DefaultTableModel)tbM).addRow(dato);
        }
    }
    
    public int calcularPaginas(AtomicInteger num, int div){
        return Math.ceilDiv(num.get(), div);
    }

    private void inicializarControladores(){
        ControladorPgPrincipal cnP = new ControladorPgPrincipal(ifrm);
        ControladorCliente cnC = new ControladorCliente(ifrm);
        ControladorConductor cnCC = new ControladorConductor(ifrm);
        ControladorVehiculo cnV = new ControladorVehiculo(ifrm);
        ControladorServicios cnS = new ControladorServicios(ifrm);
        cnP.iniciar();
        cnC.iniciar();
        cnCC.iniciar();
        cnV.iniciar();
        cnS.iniciar();
    }
    
    @Override
    public void iniciar() {        
        inicializarBotones(ifrm);
        inicializarControladores();
        ifrm.getTbConductores().setDefaultRenderer(Object.class, new ImgTabla());
        ifrm.getTbConductores().setRowHeight(100);
        ifrm.setVisible(true);
    }
    
    
    public int reducirPagina(int pg, AtomicInteger rs){
        if (pg > 1) {
            pg --;
            ctrlP.getFrm().getLblAvisos().setText("");
        } else ctrlP.getFrm().getLblAvisos().setText("AVISO -> No hay mas paginas anteriores.");
        return pg;
    }
    
    public int aumentarPagina(int pg, AtomicInteger rs){
        if (calcularPaginas(rs, 15) > pg){
            pg ++;          
            ctrlP.getFrm().getLblAvisos().setText("");
        } else ctrlP.getFrm().getLblAvisos().setText("AVISO -> No hay mas paginas siguientes.");
        return pg;
    }
 
    
    

    
    public void telefonos(Persona p){
        IFrmTelefonos ifrmR = new IFrmTelefonos();
        ControladorTelefonos contR = new ControladorTelefonos(ifrmR, ctrlP, p);
        contR.iniciar();        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
     
    }
    
}
