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
public class IFrmAddModCliente extends javax.swing.JInternalFrame {

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

    /**
     * Creates new form IFrmAddModGenerico
     */
    public IFrmAddModCliente() {
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

        pnlAddModCliente = new javax.swing.JPanel();
        lblAddModCliente = new javax.swing.JLabel();
        SeparadorAddModCliente = new javax.swing.JSeparator();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblNacionalidad = new javax.swing.JLabel();
        cmbNacionalidad = new javax.swing.JComboBox<>();
        btnAddMod = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox<>();
        txtNueNumero = new javax.swing.JTextField();
        cmbTelefonos = new javax.swing.JComboBox<>();
        btnBorrarTelefonos = new javax.swing.JButton();
        btnAddTelefonos = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        btnEditTelefonos = new javax.swing.JButton();
        scLsTelefonos = new javax.swing.JScrollPane();
        lsTelefonos = new javax.swing.JList<>();

        setClosable(true);
        setIconifiable(true);

        pnlAddModCliente.setBackground(new java.awt.Color(255, 255, 255));

        lblAddModCliente.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        lblAddModCliente.setText("Crear Cliente");

        lblId.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblId.setText("Id");

        txtId.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        lblNacionalidad.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblNacionalidad.setText("Nacionalidad");

        cmbNacionalidad.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N

        btnAddMod.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnAddMod.setText("CREAR");

        lblNombre.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblNombre.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N

        lblDireccion.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblDireccion.setText("Direccion");

        txtDireccion.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N

        lblGenero.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        lblGenero.setText("Genero");

        cmbGenero.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N

        txtNueNumero.setToolTipText("Nuevo Numero");

        btnBorrarTelefonos.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnBorrarTelefonos.setText("Borrar Telefono");
        btnBorrarTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTelefonosActionPerformed(evt);
            }
        });

        btnAddTelefonos.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnAddTelefonos.setText("Agregar Telefono");
        btnAddTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTelefonosActionPerformed(evt);
            }
        });

        btnEditTelefonos.setFont(new java.awt.Font("MS PGothic", 0, 12)); // NOI18N
        btnEditTelefonos.setText("Editar Telefono");
        btnEditTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditTelefonosActionPerformed(evt);
            }
        });

        scLsTelefonos.setViewportView(lsTelefonos);

        javax.swing.GroupLayout pnlAddModClienteLayout = new javax.swing.GroupLayout(pnlAddModCliente);
        pnlAddModCliente.setLayout(pnlAddModClienteLayout);
        pnlAddModClienteLayout.setHorizontalGroup(
            pnlAddModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddModClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddModClienteLayout.createSequentialGroup()
                        .addGroup(pnlAddModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SeparadorAddModCliente)
                            .addGroup(pnlAddModClienteLayout.createSequentialGroup()
                                .addComponent(lblAddModCliente)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddModClienteLayout.createSequentialGroup()
                        .addGroup(pnlAddModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAddModClienteLayout.createSequentialGroup()
                                .addGroup(pnlAddModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNueNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnBorrarTelefonos, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(btnEditTelefonos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbTelefonos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTelefono))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scLsTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddModClienteLayout.createSequentialGroup()
                                .addGroup(pnlAddModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlAddModClienteLayout.createSequentialGroup()
                                        .addGroup(pnlAddModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlAddModClienteLayout.createSequentialGroup()
                                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(pnlAddModClienteLayout.createSequentialGroup()
                                                .addComponent(btnAddTelefonos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(6, 6, 6)))
                                        .addGroup(pnlAddModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtId)
                                            .addComponent(cmbNacionalidad, javax.swing.GroupLayout.Alignment.LEADING, 0, 149, Short.MAX_VALUE))
                                        .addGap(18, 18, 18))
                                    .addGroup(pnlAddModClienteLayout.createSequentialGroup()
                                        .addComponent(lblNacionalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(176, 176, 176)))
                                .addGroup(pnlAddModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(pnlAddModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddModClienteLayout.createSequentialGroup()
                                .addComponent(txtNombre)
                                .addGap(20, 20, 20))
                            .addGroup(pnlAddModClienteLayout.createSequentialGroup()
                                .addGroup(pnlAddModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddModClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddMod)
                .addGap(225, 225, 225))
        );
        pnlAddModClienteLayout.setVerticalGroup(
            pnlAddModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddModClienteLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblAddModCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparadorAddModCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNacionalidad)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion))
                .addGap(11, 11, 11)
                .addGroup(pnlAddModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddModClienteLayout.createSequentialGroup()
                        .addGroup(pnlAddModClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddTelefonos)
                            .addComponent(lblGenero)
                            .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrarTelefonos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditTelefonos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNueNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scLsTelefonos))
                .addGap(18, 18, 18)
                .addComponent(btnAddMod)
                .addContainerGap())
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator SeparadorAddModCliente;
    private javax.swing.JButton btnAddMod;
    private javax.swing.JButton btnAddTelefonos;
    private javax.swing.JButton btnBorrarTelefonos;
    private javax.swing.JButton btnEditTelefonos;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JComboBox<String> cmbNacionalidad;
    private javax.swing.JComboBox<String> cmbTelefonos;
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
