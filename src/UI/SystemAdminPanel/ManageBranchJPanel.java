/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI.SystemAdminPanel;

import Model.Employee.Employee;
import Model.Employee.EmployeeDirectory;
import Model.Role.LibrarianRole;
import Model.Role.Role;
import Model.Role.SystemAdminRole;
import Model.system.ApplicationSystem;
import Model.system.Branch;
import Model.system.UserAccount;
import Model.system.UserAccountDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asequ
 */
public class ManageBranchJPanel extends javax.swing.JPanel {

    private ApplicationSystem applicationsystem;
    private Branch branch;
    private UserAccount useraccount;
    DefaultTableModel viewTableModel;
    /** Creates new form CreateBranchJPanel */

    
    public ManageBranchJPanel() {
        initComponents();

    }

    public ManageBranchJPanel(ApplicationSystem applicationsystem, Branch branch, UserAccount useraccount) {
        initComponents();
        this.viewTableModel = (DefaultTableModel) tableBranchManager.getModel();  
        this.applicationsystem = applicationsystem;
        this.branch = branch;
        this.useraccount = useraccount;
        
        displayLibraryDp();
        displayBranchManager();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBranchExperience = new javax.swing.JTextField();
        btnLibSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBranchManager = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtBranchManagerName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboBoxBranchManager = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtBranchAge = new javax.swing.JTextField();
        txtAge1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtExperience1 = new javax.swing.JTextField();
        txtBranchUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBranchPassword = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("BRANCH MANAGER NAME");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 170, 40));

        txtBranchExperience.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBranchExperienceFocusLost(evt);
            }
        });
        add(txtBranchExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 160, 30));

        btnLibSubmit.setText("ADD");
        btnLibSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibSubmitActionPerformed(evt);
            }
        });
        add(btnLibSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 80, 30));

        tableBranchManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "AGE", "LIBRARY", "USERNAME", "Password", "Experience"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableBranchManager);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 760, 370));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("EXPERIENCE");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 130, 40));

        txtBranchManagerName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBranchManagerNameFocusLost(evt);
            }
        });
        txtBranchManagerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBranchManagerNameActionPerformed(evt);
            }
        });
        add(txtBranchManagerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 160, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("BRANCH MANAGER AGE");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 130, 40));

        comboBoxBranchManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxBranchManagerActionPerformed(evt);
            }
        });
        add(comboBoxBranchManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 140, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("ASSIGN LIBRARY");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 130, 40));

        txtBranchAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBranchAgeFocusLost(evt);
            }
        });
        add(txtBranchAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 160, 30));

        txtAge1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAge1FocusLost(evt);
            }
        });
        add(txtAge1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 160, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("EXPERIENCE");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 130, 40));

        txtExperience1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtExperience1FocusLost(evt);
            }
        });
        add(txtExperience1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 160, 30));

        txtBranchUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBranchUsernameFocusLost(evt);
            }
        });
        add(txtBranchUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 160, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("USERNAME");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 130, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("PASSWORD");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 130, 40));

        txtBranchPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBranchPasswordFocusLost(evt);
            }
        });
        add(txtBranchPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 160, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLibSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibSubmitActionPerformed
        // TODO add your handling code here:
//        String branchName = txtAge.getText();
//        String libraryName = "PublicLibrary-" + branchName;
//        String buildingNum = txtBuildNumber.getText();
//        this.branch = this.applicationsystem.createBranch(branchName,libraryName,Integer.valueOf(buildingNum));
//        JOptionPane.showMessageDialog(null, "Added branch");
//        displayBranch();
          String libName = txtBranchManagerName.getText();
          String libAge = txtBranchAge.getText();
          String libraryName = (String) comboBoxBranchManager.getSelectedItem();
          String experience = txtBranchExperience.getText();
          String userName = txtBranchUsername.getText();
          String passWord = txtBranchPassword.getText();
            
        UserAccountDirectory ua = this.applicationsystem.getTopLevelUserAccountDirectory();
        if(ua.accountExists(userName, passWord, "branch manager")) {
            JOptionPane.showMessageDialog(null, "Sorry  credentials are taken");
            
        }
        else {
            UserAccount user = this.applicationsystem.getTopLevelUserAccountDirectory().createUserAccount(userName, passWord , new SystemAdminRole());
            this.branch.getLib().getEmployeelist().createEmployeeAccount(user.getAccountId(), libName, Integer.valueOf(libAge), "branch manager", Integer.valueOf(experience),libraryName);
            JOptionPane.showMessageDialog(null, "Employee has been added");
            displayBranchManager();
        }
          
          
    }//GEN-LAST:event_btnLibSubmitActionPerformed

    private void txtBranchExperienceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBranchExperienceFocusLost
        // TODO add your handling code here:
//        String branchName = txtAge.getText();
//        txtLibName.setText("PublicLibrary-"+branchName);
    }//GEN-LAST:event_txtBranchExperienceFocusLost

    private void txtBranchManagerNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBranchManagerNameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBranchManagerNameFocusLost

    private void txtBranchManagerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBranchManagerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBranchManagerNameActionPerformed

    private void comboBoxBranchManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxBranchManagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxBranchManagerActionPerformed

    private void txtBranchAgeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBranchAgeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBranchAgeFocusLost

    private void txtAge1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAge1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAge1FocusLost

    private void txtExperience1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtExperience1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExperience1FocusLost

    private void txtBranchUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBranchUsernameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBranchUsernameFocusLost

    private void txtBranchPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBranchPasswordFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBranchPasswordFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLibSubmit;
    private javax.swing.JComboBox<String> comboBoxBranchManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBranchManager;
    private javax.swing.JTextField txtAge1;
    private javax.swing.JTextField txtBranchAge;
    private javax.swing.JTextField txtBranchExperience;
    private javax.swing.JTextField txtBranchManagerName;
    private javax.swing.JTextField txtBranchPassword;
    private javax.swing.JTextField txtBranchUsername;
    private javax.swing.JTextField txtExperience1;
    // End of variables declaration//GEN-END:variables

    private void displayBranchManager() {
        ArrayList<Branch> br = this.applicationsystem.getBranches();
        //EmployeeDirectory emp = this.branch.getLib().getEmployeelist();
        UserAccountDirectory user = this.applicationsystem.getTopLevelUserAccountDirectory();
        viewTableModel.setRowCount(0);
        
        for (Employee emp: this.branch.getLib().getEmployeelist().getEmployeelist())
        {  
            UserAccount u = this.applicationsystem.getTopLevelUserAccountDirectory().findbyId(emp.getPersonId());
             Object row[] = new Object[6];
             row[0] = emp.getName();
             row[1] = emp.getAge();
             row[2] = emp.getLibraryName();
             row[3] = u.getUsername();
             row[4] = u.getPassword();
             row[5] = emp.getExperience();
             viewTableModel.addRow(row);
        }
                        
    }

      private void displayLibraryDp() {
         comboBoxBranchManager.removeAllItems();
         ArrayList<Branch> br = this.applicationsystem.getBranches();
        for (int i = 0; i < br.size(); i++)
        {
            comboBoxBranchManager.addItem(br.get(i).getLib().getLibraryName());
        }
    }

  
}
