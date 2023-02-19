/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Applicant;
import Model.ApplicantDirectory;
import Model.Business;
import Model.PetDetails;
import Model.VaccineDetails;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asequ
 */
public class ViewApplicantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewApplicantJPanel
     */
    private Business business;
    private Applicant applicant;
    DefaultTableModel tableModel;
    DefaultTableModel tableModelVaccine;
   // PetDetails pet;
    public ViewApplicantJPanel() {
        initComponents();
       
    }
     public ViewApplicantJPanel(Business business) {
         this.setVisible(true);
         initComponents();
         this.business = business;
         this.applicant = applicant;
         this.tableModel = (DefaultTableModel)viewApplicant.getModel();
         this.tableModelVaccine = (DefaultTableModel)vaccinationTable.getModel();
         populate();
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
        viewApplicant = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        viewVaccineBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        vaccinationTable = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewApplicant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ApplicantId", "First Name", "Last Name", "Date", "Pet Name", "Pet Gender", "Pet Breed", "Pet Type", "Pet Age", "Insurance Plan Opted"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewApplicant);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 950, 120));

        jLabel5.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel5.setText("VIEW APPLICANT DETAILS");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 700, 20));

        viewVaccineBtn.setText("VIEW VACCINATION DETAILS");
        viewVaccineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVaccineBtnActionPerformed(evt);
            }
        });
        add(viewVaccineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 250, 30));

        vaccinationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccination Name", "Is course completed?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(vaccinationTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 940, 90));

        deleteButton.setText("DELETE APPLICANT");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 240, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void viewVaccineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVaccineBtnActionPerformed
        // TODO add your handling code here:
          int selectedRow = viewApplicant.getSelectedRow();
          //InsurancePlans planList = this.business.getInsurancePlans();
        if(selectedRow >= 0 ){
            System.out.println("Inside vaccine btn");
            //Object dataVa =   viewApplicant.getValueAt(selectedRow,0 );
            viewApplicant.getValueAt(selectedRow, WIDTH).toString();
            System.out.println("Get Value At  "+ viewApplicant.getValueAt(selectedRow, 0).toString());
            String petId = "petId" + viewApplicant.getValueAt(selectedRow, 0).toString();
            tableModelVaccine.setRowCount(0);
        for (VaccineDetails Vaccine: this.business.getVaccineDirectory().getVaccineList()){
           
            System.out.println("Value of petId " + Vaccine.getPetId());
            if(petId.equals(Vaccine.getPetId()))
            {  
            Object[] row = new Object[2];
            row[0] = Vaccine.getVaccineName();
            if(Vaccine.getVaccineName() == "N/A"){
                row[1] = "N/A";
            }
            else {
                row[1] = String.valueOf(Vaccine.getCourseCompleted());
            }
            
            
            tableModelVaccine.addRow(row);
            }
        } 
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!");
        }
        //displayVaccination();
        
    }//GEN-LAST:event_viewVaccineBtnActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
            int selectedRow = viewApplicant.getSelectedRow();
          
        if(selectedRow >= 0 ){
         //this.applicant = (Applicant) viewApplicant.getValueAt(selectedRow, 0);
          System.out.println("Get Value Delete Record At  "+ viewApplicant.getValueAt(selectedRow, 0).toString());
          int applicantId = Integer.valueOf(viewApplicant.getValueAt(selectedRow, 0).toString());
          String petId = "petId" + applicantId;
          this.business.getApplicantDirectory().removeApplicant(applicantId);
          populate();
        for (VaccineDetails Vaccine: this.business.getVaccineDirectory().getVaccineList()){

            if(petId.equals(Vaccine.getPetId()))
            {   
              this.business.getVaccineDirectory().removeVaccine(petId);
            }
        } 
        JOptionPane.showMessageDialog(null,"Applicant deleted");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!");
        }
        
        
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable vaccinationTable;
    private javax.swing.JTable viewApplicant;
    private javax.swing.JButton viewVaccineBtn;
    // End of variables declaration//GEN-END:variables

    private void populate() {
            tableModel.setRowCount(0);
        for (Applicant o: this.business.getApplicantDirectory().getApplicantList()){
            Object[] row = new Object[10];
            row[0] = o.getApplicationID();
            System.out.println("Inside view method " + o.getApplicationID());
            row[1] = o.getOwnerFirstName();
            row[2] = o.getOwnerLastName();
            row[3] = String.valueOf(o.getApplicationDate());
            row[4] = o.getPet().getPetName();
            row[5] = o.getPet().getGender();
            row[6] = o.getPet().getBreed();
            row[7] = o.getPet().getPetType();
            row[8] = o.getPet().getPetAge();
            row[9] = o.getPet().getInsuranceDetails();
            tableModel.addRow(row);
        } 
    }

   

}
