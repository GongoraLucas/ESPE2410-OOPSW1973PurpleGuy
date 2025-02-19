/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.stockbill.view;


import ec.edu.espe.stockbill.model.Supplier;
import ec.edu.espe.stockbill.model.SuppliersRecord;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrés Espinosa
 */
public class FrmSupplierElimination extends javax.swing.JFrame {
    
    String id;

    /**
     * Creates new form SupplierElimination
     */
    public FrmSupplierElimination() {
        initComponents();
        lblIdVoidField.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelDeleteASupplier = new javax.swing.JLabel();
        labelInserId = new javax.swing.JLabel();
        txtInsertId = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnBacktoMenu = new javax.swing.JButton();
        lblIdVoidField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelDeleteASupplier.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDeleteASupplier.setText("Eliminar un Proveedor");

        labelInserId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelInserId.setText("Ingrese el ID del proveedor que desea eliminar");

        btnDelete.setBackground(new java.awt.Color(34, 51, 186));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBacktoMenu.setBackground(new java.awt.Color(34, 51, 186));
        btnBacktoMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnBacktoMenu.setText("Regresar al Menú");
        btnBacktoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacktoMenuActionPerformed(evt);
            }
        });

        lblIdVoidField.setForeground(new java.awt.Color(255, 51, 51));
        lblIdVoidField.setText("* Campo Vacío");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIdVoidField)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInsertId)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelDeleteASupplier)
                                    .addComponent(labelInserId))
                                .addGap(0, 73, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBacktoMenu)))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelDeleteASupplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelInserId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInsertId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIdVoidField)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnBacktoMenu))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        Supplier supplier;
        SuppliersRecord suppliers = new SuppliersRecord();
        
        if(txtInsertId.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Campos no llenados correctamente", "Error", JOptionPane.WARNING_MESSAGE);
            lblIdVoidField.setVisible(true);
        }else{
            lblIdVoidField.setVisible(false);
            id = txtInsertId.getText();
        }
        
        if(suppliers.findSupplierById(id)!=null){
            suppliers.delete(id);
            
            JOptionPane.showMessageDialog(rootPane, "Se han eliminado los datos correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            
            txtInsertId.setText("");
            
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "No existe ningún proveedor con la ID ingresada", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBacktoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacktoMenuActionPerformed
        FrmAdministrator administratorWindow = new FrmAdministrator();
        administratorWindow.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnBacktoMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmSupplierElimination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSupplierElimination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSupplierElimination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSupplierElimination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSupplierElimination().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBacktoMenu;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel labelDeleteASupplier;
    private javax.swing.JLabel labelInserId;
    private javax.swing.JLabel lblIdVoidField;
    private javax.swing.JTextField txtInsertId;
    // End of variables declaration//GEN-END:variables
}
