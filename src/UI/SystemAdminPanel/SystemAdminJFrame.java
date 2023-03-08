/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminPanel;

import Model.system.ApplicationSystem;
import Model.system.Branch;
import Model.system.UserAccount;
import UI.MainJFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asequ
 */
public class SystemAdminJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdminJFrame
     */
    
    DefaultTableModel viewTableModel;
    private ApplicationSystem applicationsystem;
    private Branch branch;
    private UserAccount useraccount;
    public SystemAdminJFrame() {
        initComponents();
    }

    public SystemAdminJFrame(ApplicationSystem applicationsystem, Branch branch, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.applicationsystem = applicationsystem;
        this.branch = branch;
        this.useraccount = useraccount;
//        System.out.println("Inside system admin page");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        controlJPanel = new javax.swing.JPanel();
        btnBranch = new javax.swing.JButton();
        btnLibrarian = new javax.swing.JButton();
        btnBranchManager = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        txtLogOut = new javax.swing.JButton();
        displayJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlJPanel.setBackground(new java.awt.Color(255, 153, 153));

        btnBranch.setText("ADD BRANCH");
        btnBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBranchActionPerformed(evt);
            }
        });

        btnLibrarian.setText("MANAGE LIBRARIAN");
        btnLibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrarianActionPerformed(evt);
            }
        });

        btnBranchManager.setText("MANAGE BRANCH MANAGER");
        btnBranchManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBranchManagerActionPerformed(evt);
            }
        });

        btnCustomer.setText("MANAGE CUSTOMER");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        txtLogOut.setText("LOGOUT");
        txtLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlJPanelLayout = new javax.swing.GroupLayout(controlJPanel);
        controlJPanel.setLayout(controlJPanelLayout);
        controlJPanelLayout.setHorizontalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBranchManager, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBranch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLibrarian, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        controlJPanelLayout.setVerticalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(btnBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBranchManager, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtLogOut)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(controlJPanel);

        displayJPanel.setBackground(new java.awt.Color(255, 153, 255));

        javax.swing.GroupLayout displayJPanelLayout = new javax.swing.GroupLayout(displayJPanel);
        displayJPanel.setLayout(displayJPanelLayout);
        displayJPanelLayout.setHorizontalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        displayJPanelLayout.setVerticalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(displayJPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBranchActionPerformed
        // TODO add your handling code here:
        
        jSplitPane1.setRightComponent(new CreateBranchJPanel(this.applicationsystem,this.branch, this.useraccount));
    }//GEN-LAST:event_btnBranchActionPerformed

    private void btnBranchManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBranchManagerActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new ManageBranchMJPanel(this.applicationsystem,this.branch, this.useraccount));
    }//GEN-LAST:event_btnBranchManagerActionPerformed

    private void btnLibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrarianActionPerformed
        jSplitPane1.setRightComponent(new ManageLibrarian(this.applicationsystem,this.branch, this.useraccount)); // TODO add your handling code here:
    }//GEN-LAST:event_btnLibrarianActionPerformed

    private void txtLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogOutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainJFrame(this.applicationsystem,this.branch, this.useraccount);
    }//GEN-LAST:event_txtLogOutActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new CustomerJPanel(this.applicationsystem,this.branch, this.useraccount));
        
    }//GEN-LAST:event_btnCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemAdminJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBranch;
    private javax.swing.JButton btnBranchManager;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnLibrarian;
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JPanel displayJPanel;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton txtLogOut;
    // End of variables declaration//GEN-END:variables
}
