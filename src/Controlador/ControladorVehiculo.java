/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Controlador.AddMod.ControladorAddConductor;
import Controlador.AddMod.ControladorModConductor;
import Modelo.Conductor;
import Modelo.Dao.DaoConductor;
import Modelo.Dao.DaoVehiculo;
import Modelo.Dao.DaoVehiculoTipoServicio;
import Modelo.VehiculoTipoServicio;
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
public class ControladorVehiculo extends ControladorAdministrador{
    IFrmAdministrador ifrm;
    ArrayList<VehiculoTipoServicio> vehiculos;
    int pgVehiculos;
    AtomicInteger rsVehiculos;
    
    public ControladorVehiculo(IFrmAdministrador ifrm, ControladorPrincipal ctrlP) {
        super.ctrlP = ctrlP;
        this.ifrm = ifrm;
        this.rsVehiculos = new AtomicInteger();
        this.pgVehiculos = 1;
    }

    @Override
    public void iniciar() {
        inicializarBotones(ifrm);
    }
    
    public void actualizarTbVehiculos(){
        DaoVehiculoTipoServicio daoVTS = new DaoVehiculoTipoServicio();

        vehiculos = daoVTS.listar((pgVehiculos-1)*15, 15, rsVehiculos); 
        
        Object[][] datos = new Object[vehiculos.size()][4]; 

        for (int i = 0; i < vehiculos.size(); i++) {
            datos[i] = vehiculos.get(i).getDatos();
        }
        llenarTabla(ifrm.getTbVehiculos().getModel(), datos);
        ifrm.getTxtMostrandoVehiculos().setText("Mostrando " + pgVehiculos +" de "+ calcularPaginas(rsVehiculos, 15));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ifrm.getBtnBuscarVehiculos())){ // Asumo getBtnBuscarVehiculo()
        actualizarTbVehiculos();
        } else if (e.getSource().equals(ifrm.getBtnAnteriorVehiculosVehiculos())){ // Asumo getBtnAnteriorVehiculo()
            pgVehiculos = reducirPagina(pgVehiculos, rsVehiculos);
            actualizarTbVehiculos();
        } else if (e.getSource().equals(ifrm.getBtnSiguienteVehiculos())){ // Asumo getBtnSiguienteVehiculo()
            pgVehiculos = aumentarPagina(pgVehiculos, rsVehiculos);
            actualizarTbVehiculos();
        } else if (e.getSource().equals(ifrm.getBtnCrearVehiculos())){ // Asumo getBtnCrearVehiculo()
            // NOTA: Debes crear IFrmAddModVehiculo y ControladorAddVehiculo
            // IFrmAddModVehiculo ifrmR = new IFrmAddModVehiculo();
            // ControladorAddVehiculo contV = new ControladorAddVehiculo(ifrmR, ctrlP);
            // contV.iniciar();
            // Simulación:
            ctrlP.frm.getLblAvisos().setText("AVISO -> Iniciar IFrmAddModVehiculo para CREAR.");
            actualizarTbVehiculos();
        }else if (e.getSource().equals(ifrm.getBtnEditarVehiculos())){ // Asumo getBtnEditarVehiculo()
        int index = ifrm.getTbVehiculos().getSelectedRow();
        if (index >= 0) {
            // NOTA: Debes crear IFrmAddModVehiculo y ControladorModVehiculo
            // IFrmAddModVehiculo ifrmR = new IFrmAddModVehiculo();
            // ControladorModVehiculo contV = new ControladorModVehiculo(ifrmR, ctrlP, vehiculos.get(index));
            // contV.iniciar();
            // Simulación:
            ctrlP.frm.getLblAvisos().setText("AVISO -> Iniciar IFrmAddModVehiculo para EDITAR.");
            actualizarTbVehiculos();
        } else {
            ctrlP.frm.getLblAvisos().setText("AVISO -> Seleccione una fila para editar.");
        }
        } else if (e.getSource().equals(ifrm.getBtnBorrarVehiculos())){ 
            int indice = ifrm.getTbVehiculos().getSelectedRow();
            if (indice >= 0) {
                String placa = String.valueOf(ifrm.getTbVehiculos().getValueAt(indice, 0));

                int confirmacion = JOptionPane.showConfirmDialog(ifrm, 
                        "¿Está seguro que desea eliminar el vehículo con placa " + placa + "?", 
                        "Confirmación para eliminar Vehículo", 0);

                if (confirmacion == 0) {
                    DaoVehiculo daoV = new DaoVehiculo();
                    boolean eliminado = daoV.Eliminar(placa);

                    String msg = eliminado ? "Vehículo eliminado correctamente." : "Error al eliminar vehículo.";
                    ctrlP.frm.getLblAvisos().setText("Aviso -> " + msg);
                    actualizarTbVehiculos();
                }
            } else {
                ctrlP.frm.getLblAvisos().setText("AVISO -> Seleccione una fila para borrar.");
            }
        } 
    }
}
