/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.ApplicantDirectory;
import Model.Business;
import Model.InsurancePlans;
import Model.PlanDetail;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asequ
 */
public class CreateInsuranceJPanel extends javax.swing.JPanel {

    private Business business;
    DefaultTableModel viewTableModel;
    private PlanDetail plan;

    /**
     * Creates new form InsuranceJPanel
     */
    public CreateInsuranceJPanel() {
        initComponents();
    }

   
    CreateInsuranceJPanel(Business business) {
        initComponents();
        this.business = business;
        this.viewTableModel = (DefaultTableModel) insuranceTable.getModel();  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txtPlanId = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        insuranceTable = new javax.swing.JTable();
        viewInsuranceDetails = new javax.swing.JButton();
        updateInsuranceBtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtCostPerMonth = new javax.swing.JTextField();
        txtPlanName = new javax.swing.JTextField();
        txtCostPerMonth1 = new javax.swing.JTextField();
        txtPlanName1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addInsuranceBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtPlanId1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel5.setText("CREATE INSURANCE PLAN");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 550, 20));
        add(txtPlanId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 120, 30));

        jLabel14.setText("PLAN NAME");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 20));

        jLabel6.setText("COST PER MONTH");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, 20));

        insuranceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLAN ID", "PLAN NAME", "Cost per Month", "Cost per Annum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(insuranceTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 360, 290));

        viewInsuranceDetails.setText("VIEW DETAILS");
        viewInsuranceDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInsuranceDetailsActionPerformed(evt);
            }
        });
        add(viewInsuranceDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 140, 30));

        updateInsuranceBtn.setText("UPDATE INSURANCE PLAN");
        updateInsuranceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInsuranceBtnActionPerformed(evt);
            }
        });
        add(updateInsuranceBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, 40));

        jLabel15.setText("PLAN ID");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, 20));
        add(txtCostPerMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 120, 30));
        add(txtPlanName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 120, 30));
        add(txtCostPerMonth1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 120, 30));
        add(txtPlanName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 120, 30));

        jLabel16.setText("PLAN NAME");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 90, 20));

        jLabel7.setText("COST PER MONTH");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 90, 20));

        addInsuranceBtn.setText("CREATE INSURANCE PLAN");
        addInsuranceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInsuranceBtnActionPerformed(evt);
            }
        });
        add(addInsuranceBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 170, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel1.setText("UPDATE INSURANCE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 190, 20));

        jLabel17.setText("PLAN ID");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 90, 20));

        txtPlanId1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPlanId1.setEnabled(false);
        add(txtPlanId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void updateInsuranceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInsuranceBtnActionPerformed
        // TODO add your handling code here:
        
        if( txtPlanId1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Make to selection for update");
        }
        else{
            PlanDetail pd = this.business.getInsurancePlans().findbyId(Integer.valueOf(txtPlanId1.getText()));
            pd.setPlanName(txtPlanName1.getText());
            pd.setCostPerMonth(Double.valueOf(txtCostPerMonth1.getText())); 
           
            this.plan.setPlanName(txtPlanName1.getText());
            this.plan.setCostPerMonth(Double.valueOf(txtCostPerMonth1.getText()));
             double costPerAnnum = Double.valueOf(txtCostPerMonth1.getText()) * 12;
            this.plan.setCostPerAnnum(costPerAnnum);
            
        }
        JOptionPane.showMessageDialog(null, "Updated Insurance Plan Id" +txtPlanId1.getText() );
       displayObservation();
    }//GEN-LAST:event_updateInsuranceBtnActionPerformed

    private void viewInsuranceDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInsuranceDetailsActionPerformed
        // TODO add your handling code here:
        
         int selectedRow = insuranceTable.getSelectedRow();
          //InsurancePlans planList = this.business.getInsurancePlans();
        if(selectedRow >= 0 ){
            this.plan = (PlanDetail) insuranceTable.getValueAt(selectedRow,0 );
            //fill all the text fields
            txtPlanId1.setText(String.valueOf(this.plan.getPlanId()));
            txtPlanName1.setText(String.valueOf(this.plan.getPlanName()));
            txtCostPerMonth1.setText(String.valueOf(this.plan.getCostPerMonth()));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!");
        }
        displayObservation();
    }//GEN-LAST:event_viewInsuranceDetailsActionPerformed

    private void addInsuranceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInsuranceBtnActionPerformed
        // TODO add your handling code here:
        String planId = txtPlanId.getText();
        String planName = txtPlanName.getText();
        String costPerMonth = txtCostPerMonth.getText();
        String costPerAnnum = String.valueOf(Double.valueOf(costPerMonth) * 12);
        PlanDetail insurance = this.business.getInsurancePlans().createPlans(Integer.valueOf(planId), planName, Double.valueOf(costPerMonth),Double.valueOf(costPerAnnum) );
        JOptionPane.showMessageDialog(null, "Added Insurance");
        displayObservation();
    }//GEN-LAST:event_addInsuranceBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addInsuranceBtn;
    private javax.swing.JTable insuranceTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCostPerMonth;
    private javax.swing.JTextField txtCostPerMonth1;
    private javax.swing.JTextField txtPlanId;
    private javax.swing.JTextField txtPlanId1;
    private javax.swing.JTextField txtPlanName;
    private javax.swing.JTextField txtPlanName1;
    private javax.swing.JButton updateInsuranceBtn;
    private javax.swing.JButton viewInsuranceDetails;
    // End of variables declaration//GEN-END:variables

    private void displayObservation() {
           InsurancePlans plan = this.business.getInsurancePlans();
        if(plan.getInsurancePlanList().size() > 0){
            viewTableModel.setRowCount(0);
            for( PlanDetail o: plan.getInsurancePlanList())
            {
//                System.out.println(o.getObservationId());
                Object row[]= new Object[4];
                row[0] = o;
                row[1] = o.getPlanName();
                row[2] = o.getCostPerMonth();
                row[3] = o.getCostPerAnnum();
                
                viewTableModel.addRow(row);
            }
        }
        else{
            System.out.println("Empty List");
        }
    }
}
