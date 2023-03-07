/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CustomerPanel;

import UI.LibrarianPanel.*;
import Model.Employee.Employee;
import UI.SystemAdminPanel.*;
import Model.system.ApplicationSystem;
import Model.system.Branch;
import Model.system.UserAccount;
import UI.MainJFrame;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asequ
 */
public class CustomerJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdminJFrame
     */
    
    DefaultTableModel viewTableModel;
    private ApplicationSystem applicationsystem;
    private Branch branch;
    private UserAccount useraccount;
    public CustomerJFrame() {
        initComponents();
        //displayLocation();
    }

    public CustomerJFrame(ApplicationSystem applicationsystem, Branch branch, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.applicationsystem = applicationsystem;
        this.branch = branch;
        this.useraccount = useraccount;
//        System.out.println("Inside librarian page");
        displayLocation();
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
        btnRentBook = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        btnRentHistory = new javax.swing.JButton();
        jLabelWelcome = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        displayJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlJPanel.setBackground(new java.awt.Color(255, 153, 153));

        btnRentBook.setText("RENT A BOOK");
        btnRentBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentBookActionPerformed(evt);
            }
        });

        btnLogOut.setText("LOGOUT");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnRentHistory.setText("VIEW RENT HISTORY");
        btnRentHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentHistoryActionPerformed(evt);
            }
        });

        jLabelWelcome.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelWelcome.setText("WELCOME ");

        jLabelUser.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelUser.setText("USER");

        javax.swing.GroupLayout controlJPanelLayout = new javax.swing.GroupLayout(controlJPanel);
        controlJPanel.setLayout(controlJPanelLayout);
        controlJPanelLayout.setHorizontalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRentHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                        .addComponent(btnRentBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(controlJPanelLayout.createSequentialGroup()
                        .addComponent(jLabelWelcome)
                        .addGap(4, 4, 4)
                        .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlJPanelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        controlJPanelLayout.setVerticalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWelcome)
                    .addComponent(jLabelUser))
                .addGap(26, 26, 26)
                .addComponent(btnRentBook, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRentHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(controlJPanel);

        displayJPanel.setBackground(new java.awt.Color(51, 204, 255));

        javax.swing.GroupLayout displayJPanelLayout = new javax.swing.GroupLayout(displayJPanel);
        displayJPanel.setLayout(displayJPanelLayout);
        displayJPanelLayout.setHorizontalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        displayJPanelLayout.setVerticalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(displayJPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRentBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentBookActionPerformed
        // TODO add your handling code here:
        
        jSplitPane1.setRightComponent(new RentBookJPanel(this.applicationsystem,this.branch, this.useraccount));
    }//GEN-LAST:event_btnRentBookActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainJFrame(this.applicationsystem,this.branch, this.useraccount);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnRentHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentHistoryActionPerformed
        // TODO add your handling code here:
                jSplitPane1.setRightComponent(new ViewBookJPanel(this.applicationsystem,this.branch, this.useraccount));

    }//GEN-LAST:event_btnRentHistoryActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerJFrame().setVisible(true);
            }
        });
    }
    
    public void displayLocation()
    {
        String userAccount = this.useraccount.getAccountId();
        System.out.println("Librarian - UserName logged in is "+userAccount);
        ArrayList<Branch> br = this.applicationsystem.getBranches();
        int fetchNumber = 0;
        for(int i=0;i< br.size(); i++){
            String emp = br.get(i).getLib().getEmployeelist().getEmployeelist().get(i).getPersonId();
//            System.out.println("USER VALUE in LIBRARY " + emp.getPersonId());
            if(emp.equals(userAccount)){
                fetchNumber = i;
                break;  
            }
        }
//        System.out.println("Librarian branch name" +br.get(fetchNumber).getName());
//        txtLocation.setText(br.get(fetchNumber).getName());
        jLabelUser.setText(br.get(fetchNumber).getLib().getEmployeelist().getEmployeelist().get(fetchNumber).getName());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnRentBook;
    private javax.swing.JButton btnRentHistory;
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JPanel displayJPanel;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelWelcome;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
