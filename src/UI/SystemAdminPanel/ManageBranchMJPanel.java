/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI.SystemAdminPanel;

import Model.Employee.Employee;
import Model.Employee.EmployeeDirectory;
import Model.Library.Library;
import Model.Role.BranchManagerRole;
import Model.Role.LibrarianRole;
import Model.Role.Role;
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
public class ManageBranchMJPanel extends javax.swing.JPanel {

    private ApplicationSystem applicationsystem;
    private Branch branch;
    private UserAccount useraccount;
    DefaultTableModel viewTableModel;
    /** Creates new form CreateBranchJPanel */

    
    public ManageBranchMJPanel() {
        initComponents();

    }

    ManageBranchMJPanel(ApplicationSystem applicationsystem, Branch branch, UserAccount useraccount) {
        initComponents();
        this.viewTableModel = (DefaultTableModel) tableLibrarian.getModel();  
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
        txtBMExperience = new javax.swing.JTextField();
        btnLibSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLibrarian = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtBranchManagerName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboBoxLib = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtBranchManagerAge = new javax.swing.JTextField();
        txtAge1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtExperience1 = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("BRANCH MANAGER NAME");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 170, 40));

        txtBMExperience.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBMExperienceFocusLost(evt);
            }
        });
        add(txtBMExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 160, 30));

        btnLibSubmit.setText("ADD");
        btnLibSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibSubmitActionPerformed(evt);
            }
        });
        add(btnLibSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 80, 30));

        tableLibrarian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "AGE", "LIBRARY", "BRANCHNAME", "USERNAME", "Password", "Experience", "Designation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableLibrarian);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 790, 260));

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

        comboBoxLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxLibActionPerformed(evt);
            }
        });
        add(comboBoxLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 140, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("ASSIGN LIBRARY");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 130, 40));

        txtBranchManagerAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBranchManagerAgeFocusLost(evt);
            }
        });
        add(txtBranchManagerAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 160, 30));

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

        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 160, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("USERNAME");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 130, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("PASSWORD");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 130, 40));

        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 160, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLibSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibSubmitActionPerformed
        // TODO add your handling code here:
//        String branchName = txtAge.getText();
//        String libraryName = "PublicLibrary-" + branchName;
//        String buildingNum = txtBuildNumber.getText();
//        this.branch = this.applicationsystem.createBranch(branchName,libraryName,Integer.valueOf(buildingNum));
//        JOptionPane.showMessageDialog(null, "Added branch");
//        displayBranch();
   
            
        UserAccountDirectory ua = this.applicationsystem.getTopLevelUserAccountDirectory();
        if(ua.accountExists(txtUsername.getText())) {
            JOptionPane.showMessageDialog(null, "Sorry  credentials are taken");
            
        }
        else {
          String libName = txtBranchManagerName.getText();
          String libAge = txtBranchManagerAge.getText();
          String libraryName = "Public Library " + (String) comboBoxLib.getSelectedItem();
          String experience = txtBMExperience.getText();
          String userName = txtUsername.getText();
          String passWord = txtPassword.getText();
            Boolean checkBranchAssigned = this.applicationsystem.branchAlreadyAssigned((String) comboBoxLib.getSelectedItem(),"branch manager");
            if(!checkBranchAssigned)
            {
            UserAccount user = this.applicationsystem.getTopLevelUserAccountDirectory().createUserAccount(userName, passWord , new BranchManagerRole());
            Library lib = this.branch.getLib();
            EmployeeDirectory emp = lib.getEmployeelist();
            Employee e = new Employee();
            e.setPersonId(user.getAccountId());
            e.setName(libName);
            e.setAge(Integer.valueOf(libAge));
            e.setExperience(Integer.valueOf(experience));
            e.setDesignation("branch manager");
            emp.getEmployeelist().add(e);
            lib.setEmployeelist(emp);
            lib.setLibraryName(libraryName);
            
            this.applicationsystem.AddEmpToBranch((String) comboBoxLib.getSelectedItem(), lib);
            
//            System.out.println("LIBARY VALUE OF CURRENT FLOW " + this.branch.getLib().getLibraryName());
            
            JOptionPane.showMessageDialog(null, "Employee has been added");
            }
            else {
                JOptionPane.showMessageDialog(null, "Select Another Branch");
            }
            
  
            }
            displayBranchManager();
          
    }//GEN-LAST:event_btnLibSubmitActionPerformed

    private void txtBMExperienceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBMExperienceFocusLost
        // TODO add your handling code here:
//        String branchName = txtAge.getText();
//        txtLibName.setText("PublicLibrary-"+branchName);
    }//GEN-LAST:event_txtBMExperienceFocusLost

    private void txtBranchManagerNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBranchManagerNameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBranchManagerNameFocusLost

    private void txtBranchManagerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBranchManagerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBranchManagerNameActionPerformed

    private void comboBoxLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxLibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxLibActionPerformed

    private void txtBranchManagerAgeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBranchManagerAgeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBranchManagerAgeFocusLost

    private void txtAge1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAge1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAge1FocusLost

    private void txtExperience1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtExperience1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExperience1FocusLost

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLibSubmit;
    private javax.swing.JComboBox<String> comboBoxLib;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableLibrarian;
    private javax.swing.JTextField txtAge1;
    private javax.swing.JTextField txtBMExperience;
    private javax.swing.JTextField txtBranchManagerAge;
    private javax.swing.JTextField txtBranchManagerName;
    private javax.swing.JTextField txtExperience1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void displayBranchManager() {
        //ArrayList<Branch> br = this.applicationsystem.getBranches();
        //EmployeeDirectory emp = this.branch.getLib().getEmployeelist();
        //UserAccountDirectory user = this.applicationsystem.getTopLevelUserAccountDirectory();
        ArrayList<Branch> x = this.applicationsystem.getBranches();
        
        System.out.println("Size of branches of librarian:  "+ x.size());
       //System.out.println("Size of employee list of librarian:  "+ empz.size());
        viewTableModel.setRowCount(0);
        
        for(int i=0 ; i < x.size(); i++ )
        {
            
            Object row[] = new Object[8];
             String userName = x.get(i).getLib().getEmployeelist().getEmployeelist().get(i).getPersonId();
             UserAccount u = this.applicationsystem.getTopLevelUserAccountDirectory().findbyId(userName);
               row[0] = x.get(i).getLib().getEmployeelist().getEmployeelist().get(i).getName();
               row[1] = x.get(i).getLib().getEmployeelist().getEmployeelist().get(i).getAge();
               row[2] = "Public Library " +x.get(i).getName();
               //row[2] = x.get(i).getLib().getLibraryName();
               row[3] = x.get(i).getName();
               row[4] = u.getUsername();
              row[5] = u.getPassword();
              row[6] = x.get(i).getLib().getEmployeelist().getEmployeelist().get(i).getExperience();
               row[7] = x.get(i).getLib().getEmployeelist().getEmployeelist().get(i).getDesignation();
             viewTableModel.addRow(row);
        }
            }
            
                         
    
    
      private void displayLibraryDp() {
         comboBoxLib.removeAllItems();
         ArrayList<String> br = this.applicationsystem.getBranchName();
        for (int i = 0; i < br.size(); i++)
        {
            comboBoxLib.addItem(br.get(i));
        }
    }

}
