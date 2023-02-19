/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Applicant;
import Model.ApplicantDirectory;
import Model.Business;
import Model.InsurancePlans;
import Model.PetDetails;
import Model.PlanDetail;
import Model.VaccineDetails;
import Validation.ValidationClass;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asequ
 */
public class UpdateApplicantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ApplicantJPanel
     */
    private Business business;
    private Applicant applicantAccount;
    private PetDetails pet;
    VaccineDetails selectedVaccine;
    DefaultTableModel tableModelUpdate;
    private ValidationClass val;
     private int count=0;
    
    public UpdateApplicantJPanel() {
        initComponents();
        this.business = business;
        this.applicantAccount = applicantAccount;
    }

    

    UpdateApplicantJPanel(Business business, Applicant applicantAccount) {
        this.setVisible(true);
        initComponents();
        this.business = business;
        this.applicantAccount = applicantAccount;
        //pet = this.applicantAccount.getPet();
        this.tableModelUpdate = (DefaultTableModel)updateVaccinationTable.getModel();
        val = new ValidationClass();
        displayInsuranceDp();
        
        //displayAllValues();
    }

 

 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFirstName1 = new javax.swing.JTextField();
        txtLastName1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPetName1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPetAge1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboPetGender1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtBreed1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        updateApplicantBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        comboInsurancePlan1 = new javax.swing.JComboBox<>();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        txtPetType1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        viewVaccBtn = new javax.swing.JButton();
        comboApplicantId = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        updateVaccinationTable = new javax.swing.JTable();
        txtVaccineName1 = new javax.swing.JTextField();
        comboCourse1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        updateVaccinationBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel1.setText("UPDATE APPLICANT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jLabel2.setText("FIRST NAME");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 70, 20));
        add(txtFirstName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 120, 30));

        txtLastName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastName1ActionPerformed(evt);
            }
        });
        add(txtLastName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 120, 30));

        jLabel3.setText("DATE");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 70, 20));

        jLabel4.setText("LAST NAME");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 70, 20));

        jLabel5.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel5.setText("UPDATE VACCINATION DETAILS");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 550, 20));
        add(txtPetName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 120, 30));

        jLabel6.setText("PET NAME");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 70, 20));
        add(txtPetAge1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 120, 30));

        jLabel7.setText("GENDER");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 70, 20));

        jLabel8.setText("PET AGE");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 70, 20));

        comboPetGender1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        add(comboPetGender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 120, 30));

        jLabel9.setText("BREED");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 70, 20));
        add(txtBreed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 120, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel10.setText("UPDATE PET DETAILS");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 550, 20));

        updateApplicantBtn.setText("UPDATE APPLICANT");
        updateApplicantBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateApplicantBtnActionPerformed(evt);
            }
        });
        add(updateApplicantBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 740, 140, 30));

        jLabel14.setText("INSURANCE PLANS");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, 20));

        comboInsurancePlan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboInsurancePlan1ActionPerformed(evt);
            }
        });
        add(comboInsurancePlan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 570, 40));
        add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 180, 30));

        jLabel15.setText("APPLICANT ID");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 70, 20));
        add(txtPetType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 120, 30));

        jLabel16.setText("PET TYPE");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 70, 20));

        viewVaccBtn.setText("VIEW ");
        viewVaccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVaccBtnActionPerformed(evt);
            }
        });
        add(viewVaccBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 660, 130, -1));

        comboApplicantId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboApplicantIdItemStateChanged(evt);
            }
        });
        comboApplicantId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboApplicantIdActionPerformed(evt);
            }
        });
        add(comboApplicantId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 59, 120, 30));

        updateVaccinationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Course Completed?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(updateVaccinationTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 240, 170));
        add(txtVaccineName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 120, 30));

        comboCourse1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        add(comboCourse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 120, 30));

        jLabel12.setText("Is Course Completed?");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 110, 20));

        jLabel13.setText("VACCINE NAME");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 90, 20));

        updateVaccinationBtn.setText("UPDATE VACCINATION");
        updateVaccinationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateVaccinationBtnActionPerformed(evt);
            }
        });
        add(updateVaccinationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastName1ActionPerformed

    private void updateApplicantBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateApplicantBtnActionPerformed
         //String applicantId = txtApplicantId.getText();
                  boolean flag = false;
          if ( val.nullCheck(txtFirstName1.getText()) || val.nullCheck(txtLastName1.getText()) || val.nullCheck(String.valueOf(jDateChooser2.getDate())) || val.nullCheck(txtPetName1.getText()) || val.nullCheck(txtPetAge1.getText()) || val.nullCheck(txtPetType1.getText()) || val.nullCheck(String.valueOf(comboPetGender1.getSelectedItem())) || val.nullCheck(txtBreed1.getText())) {
            flag = true;
            JOptionPane.showMessageDialog(null, "Null values not allowed!!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            System.out.println("Null check passed");
        }
          
           
           
          if(flag == false){
               int applicantId = (int) comboApplicantId.getSelectedItem();
        for(Applicant appl: this.business.getApplicantDirectory().getApplicantList() )
        if(Integer.valueOf(applicantId) == appl.getApplicationID())
        {
           appl.setOwnerFirstName(txtFirstName1.getText());
           appl.setOwnerLastName(txtLastName1.getText());
           Date dateValue = jDateChooser2.getDate();
           if(dateValue == null){
               
           }
           else {
               appl.setApplicationDate(jDateChooser2.getDate());
           }
           PetDetails pet = appl.getPet();
           pet.setPetName(txtPetName1.getText());
           pet.setPetAge(Integer.valueOf(txtPetAge1.getText()));
           pet.setPetType(txtPetType1.getText());
           pet.setGender(String.valueOf(comboPetGender1.getSelectedItem()));
           pet.setBreed(txtBreed1.getText());
           String insuranceValue = (String)comboInsurancePlan1.getSelectedItem();
           pet.setInsuranceDetails(insuranceValue); 
           appl.setPet(pet);
           JOptionPane.showMessageDialog(null, "Updated Applicant");
          }
        else {
           System.out.println("Validation failed");
        }

          
     
       
        }       
         
    }//GEN-LAST:event_updateApplicantBtnActionPerformed

    private void comboInsurancePlan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboInsurancePlan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboInsurancePlan1ActionPerformed

    private void viewVaccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVaccBtnActionPerformed
        // TODO add your handling code here:
       int selectedRow = updateVaccinationTable.getSelectedRow();
          //InsurancePlans planList = this.business.getInsurancePlans();
        if(selectedRow >= 0 ){
            //String vaccineDetails =  updateVaccinationTable.getValueAt(selectedRow, 0).toString();
            txtVaccineName1.setText(String.valueOf(updateVaccinationTable.getValueAt(selectedRow, 0).toString()));
            String selectCourse = updateVaccinationTable.getValueAt(selectedRow, 1).toString();
            if(selectCourse == "false"){
               comboCourse1.setSelectedItem("No"); 
            }
            else {
                comboCourse1.setSelectedItem("Yes"); 
            }
            

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!");
        }
    }//GEN-LAST:event_viewVaccBtnActionPerformed

    private void comboApplicantIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboApplicantIdItemStateChanged
        // TODO add your handling code here:
        displayAllValues();
    }//GEN-LAST:event_comboApplicantIdItemStateChanged

    private void updateVaccinationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateVaccinationBtnActionPerformed
        // TODO add your handling code here:
       int applicantId = (int) comboApplicantId.getSelectedItem();
        String petId = "petId" + applicantId;
         String vaccineName = txtVaccineName1.getText();
        String courseCompleted = (String) comboCourse1.getSelectedItem();
          boolean courseCompletedValue = true;
        if(courseCompleted == "Yes") {
            courseCompletedValue = true;
        }
        else 
        {
            courseCompletedValue= false;
        }

        for(VaccineDetails vaccine:this.business.getVaccineDirectory().getVaccineList() ){
            if(vaccine.getPetId().equals(petId)){
                vaccine.setVaccineName(vaccineName);
                vaccine.setCourseCompleted(courseCompletedValue);
            }
        }
        
      JOptionPane.showMessageDialog(null, "Updated Vaccine for Applicant");
        
        
    }//GEN-LAST:event_updateVaccinationBtnActionPerformed

    private void comboApplicantIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboApplicantIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboApplicantIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboApplicantId;
    private javax.swing.JComboBox<String> comboCourse1;
    private javax.swing.JComboBox<String> comboInsurancePlan1;
    private javax.swing.JComboBox<String> comboPetGender1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBreed1;
    private javax.swing.JTextField txtFirstName1;
    private javax.swing.JTextField txtLastName1;
    private javax.swing.JTextField txtPetAge1;
    private javax.swing.JTextField txtPetName1;
    private javax.swing.JTextField txtPetType1;
    private javax.swing.JTextField txtVaccineName1;
    private javax.swing.JButton updateApplicantBtn;
    private javax.swing.JButton updateVaccinationBtn;
    private javax.swing.JTable updateVaccinationTable;
    private javax.swing.JButton viewVaccBtn;
    // End of variables declaration//GEN-END:variables

    private void displayInsuranceDp() {
        comboInsurancePlan1.removeAllItems();
        comboApplicantId.removeAllItems();
        
        for(Applicant appl: this.business.getApplicantDirectory().getApplicantList()){
            comboApplicantId.addItem(appl.getApplicationID());
        }
        for(PlanDetail d : this.business.getInsurancePlans().getInsurancePlanList()) {
            comboInsurancePlan1.addItem("PLAN ID: " + d.getPlanId() + " PLAN NAME: " + d.getPlanName() + " COST PER MONTH: " + d.getCostPerMonth() + " COST PER ANNUM: " + d.getCostPerAnnum());          
           }
        
//        for(PlanDetail d : this.business.getInsurancePlans().getInsurancePlanList()) {
//            comboInsurancePlan.addItem("PLAN ID: " + d.getPlanId() + "PLAN NAME: " + d.getPlanName() + "COST PER MONTH: " + d.getCostPerMonth() + "COST PER ANNUM: " + d.getCostPerAnnum());       
//        }
    }

  

    private void displayAllValues() {
        int applicantId = (int) comboApplicantId.getSelectedItem();
        for(Applicant appl: this.business.getApplicantDirectory().getApplicantList() )
        if(Integer.valueOf(applicantId) == appl.getApplicationID())
        {
           txtFirstName1.setText(appl.getOwnerFirstName());
           txtLastName1.setText(appl.getOwnerLastName());
           txtPetName1.setText(appl.getPet().getPetName());
           txtPetAge1.setText(String.valueOf(appl.getPet().getPetAge()));
           txtPetType1.setText(appl.getPet().getPetType());
           txtBreed1.setText(appl.getPet().getBreed());
           comboPetGender1.setSelectedItem(appl.getPet().getGender());
           //comboInsurancePlan1.setSelectedItem(appl.getPet().getInsuranceDetails());
           jDateChooser2.setDate(appl.getApplicationDate());
           comboInsurancePlan1.setSelectedItem(appl.getPet().getInsuranceDetails());
           tableModelUpdate.setRowCount(0);
            for (VaccineDetails Vaccine: this.business.getVaccineDirectory().getVaccineList()){

            if(appl.getPet().getPetId().equals(Vaccine.getPetId()))
            {  
            Object[] row = new Object[2];
            row[0] = Vaccine.getVaccineName();
            row[1] = String.valueOf(Vaccine.getCourseCompleted());
            tableModelUpdate.addRow(row);
            }
        } 
           
           
        }
}
    
}
