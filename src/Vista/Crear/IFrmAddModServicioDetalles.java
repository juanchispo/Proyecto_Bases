/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista.Crear;

import Vista.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Dyl
 */
public class IFrmAddModServicioDetalles extends javax.swing.JInternalFrame {

    public JSeparator getSeparadorAddModCliente() {
        return SeparadorAddModCliente;
    }

    public void setSeparadorAddModCliente(JSeparator SeparadorAddModCliente) {
        this.SeparadorAddModCliente = SeparadorAddModCliente;
    }

    public JButton getBtnAddMod() {
        return btnAddMod;
    }

    public void setBtnAddMod(JButton btnAddMod) {
        this.btnAddMod = btnAddMod;
    }

    public JButton getBtnAddTelefonos() {
        return btnAddTelefonos;
    }

    public void setBtnAddTelefonos(JButton btnAddTelefonos) {
        this.btnAddTelefonos = btnAddTelefonos;
    }

    public JButton getBtnBorrarTelefonos() {
        return btnBorrarTelefonos;
    }

    public void setBtnBorrarTelefonos(JButton btnBorrarTelefonos) {
        this.btnBorrarTelefonos = btnBorrarTelefonos;
    }

    public JButton getBtnEditTelefonos() {
        return btnEditTelefonos;
    }

    public void setBtnEditTelefonos(JButton btnEditTelefonos) {
        this.btnEditTelefonos = btnEditTelefonos;
    }

    public JComboBox<String> getCmbGenero() {
        return cmbGenero;
    }

    public void setCmbGenero(JComboBox<String> cmbGenero) {
        this.cmbGenero = cmbGenero;
    }

    public JComboBox<String> getCmbNacionalidad() {
        return cmbNacionalidad;
    }

    public void setCmbNacionalidad(JComboBox<String> cmbNacionalidad) {
        this.cmbNacionalidad = cmbNacionalidad;
    }

    public JComboBox<String> getCmbTelefonos() {
        return cmbTelefonos;
    }

    public void setCmbTelefonos(JComboBox<String> cmbTelefonos) {
        this.cmbTelefonos = cmbTelefonos;
    }

    public JLabel getLblAddModCliente() {
        return lblAddModCliente;
    }

    public void setLblAddModCliente(JLabel lblAddModCliente) {
        this.lblAddModCliente = lblAddModCliente;
    }

    public JLabel getLblDireccion() {
        return lblDireccion;
    }

    public void setLblDireccion(JLabel lblDireccion) {
        this.lblDireccion = lblDireccion;
    }

    public JLabel getLblGenero() {
        return lblGenero;
    }

    public void setLblGenero(JLabel lblGenero) {
        this.lblGenero = lblGenero;
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNacionalidad() {
        return lblNacionalidad;
    }

    public void setLblNacionalidad(JLabel lblNacionalidad) {
        this.lblNacionalidad = lblNacionalidad;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JList<String> getLsTelefonos() {
        return lsTelefonos;
    }

    public void setLsTelefonos(JList<String> lsTelefonos) {
        this.lsTelefonos = lsTelefonos;
    }

    public JPanel getPnlAddModCliente() {
        return pnlAddModCliente;
    }

    public void setPnlAddModCliente(JPanel pnlAddModCliente) {
        this.pnlAddModCliente = pnlAddModCliente;
    }

    public JScrollPane getScLsTelefonos() {
        return scLsTelefonos;
    }

    public void setScLsTelefonos(JScrollPane scLsTelefonos) {
        this.scLsTelefonos = scLsTelefonos;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtNueNumero() {
        return txtNueNumero;
    }

    public void setTxtNueNumero(JTextField txtNueNumero) {
        this.txtNueNumero = txtNueNumero;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }
// En tu clase IFrmAddModServicioDetalles, agrega:

    public JTable getJTable2() {
        return jTable2;
    }

    public void setJTable2(JTable jTable2) {
        this.jTable2 = jTable2;
    }
    /**
     * Creates new form IFrmAddModGenerico
     */
    public IFrmAddModServicioDetalles()   
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        scLsTelefonos = new javax.swing.JScrollPane();
        lsTelefonos = new javax.swing.JList<>();
        cmbGenero = new javax.swing.JComboBox<>();
        txtDireccion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        cmbNacionalidad = new javax.swing.JComboBox<>();
        lblNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        btnAddTelefonos = new javax.swing.JButton();
        lblNacionalidad = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnBorrarTelefonos = new javax.swing.JButton();
        btnEditTelefonos = new javax.swing.JButton();
        cmbTelefonos = new javax.swing.JComboBox<>();
        txtNueNumero = new javax.swing.JTextField();
        pnlAddModCliente = new javax.swing.JPanel();
        lblAddModCliente = new javax.swing.JLabel();
        SeparadorAddModCliente = new javax.swing.JSeparator();
        btnAddMod = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        scLsTelefonos.setViewportView(lsTelefonos);

        cmbGenero.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N

        txtDireccion.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N

        txtNombre.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N

        txtId.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        cmbNacionalidad.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N

        lblNombre.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblNombre.setText("Nombre");

        lblDireccion.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblDireccion.setText("Direccion");

        lblGenero.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblGenero.setText("Genero");

        btnAddTelefonos.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnAddTelefonos.setText("Agregar Telefono");
        btnAddTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTelefonosActionPerformed(evt);
            }
        });

        lblNacionalidad.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblNacionalidad.setText("Nacionalidad");

        lblId.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblId.setText("Id");

        btnBorrarTelefonos.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnBorrarTelefonos.setText("Borrar Telefono");
        btnBorrarTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTelefonosActionPerformed(evt);
            }
        });

        btnEditTelefonos.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnEditTelefonos.setText("Editar Telefono");
        btnEditTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditTelefonosActionPerformed(evt);
            }
        });

        cmbTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTelefonosActionPerformed(evt);
            }
        });

        txtNueNumero.setToolTipText("Nuevo Numero");

        setClosable(true);
        setIconifiable(true);

        pnlAddModCliente.setBackground(new java.awt.Color(255, 255, 255));

        lblAddModCliente.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        lblAddModCliente.setText("Detalles Servicio");

        btnAddMod.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnAddMod.setText("Volver");
        btnAddMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddModActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Caracteristica", "Valor"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout pnlAddModClienteLayout = new javax.swing.GroupLayout(pnlAddModCliente);
        pnlAddModCliente.setLayout(pnlAddModClienteLayout);
        pnlAddModClienteLayout.setHorizontalGroup(
            pnlAddModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddModClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddModClienteLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(pnlAddModClienteLayout.createSequentialGroup()
                        .addGroup(pnlAddModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SeparadorAddModCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAddModClienteLayout.createSequentialGroup()
                                .addComponent(lblAddModCliente)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(66, 66, 66))))
            .addGroup(pnlAddModClienteLayout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(btnAddMod)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlAddModClienteLayout.setVerticalGroup(
            pnlAddModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddModClienteLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblAddModCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparadorAddModCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddMod)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAddModCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAddModCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnBorrarTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTelefonosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarTelefonosActionPerformed

    private void btnAddTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTelefonosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddTelefonosActionPerformed

    private void btnEditTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditTelefonosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditTelefonosActionPerformed

    private void cmbTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTelefonosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTelefonosActionPerformed

    private void btnAddModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddModActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator SeparadorAddModCliente;
    private javax.swing.JButton btnAddMod;
    private javax.swing.JButton btnAddTelefonos;
    private javax.swing.JButton btnBorrarTelefonos;
    private javax.swing.JButton btnEditTelefonos;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JComboBox<String> cmbNacionalidad;
    private javax.swing.JComboBox<String> cmbTelefonos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblAddModCliente;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JList<String> lsTelefonos;
    private javax.swing.JPanel pnlAddModCliente;
    private javax.swing.JScrollPane scLsTelefonos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNueNumero;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
