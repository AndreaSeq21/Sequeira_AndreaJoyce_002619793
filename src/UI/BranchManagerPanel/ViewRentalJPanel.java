/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI.BranchManagerPanel;

import UI.CustomerPanel.*;
import Model.Customer.Customer;
import UI.LibrarianPanel.*;
import UI.SystemAdminPanel.*;
import Model.Employee.Employee;
import Model.Employee.EmployeeDirectory;
import Model.Library.Library;
import Model.Material.Book;
import Model.Material.BookCollection;
import Model.Material.Magazine;
import Model.Rental.Rent;
import Model.Role.LibrarianRole;
import Model.Role.Role;
import Model.Role.SystemAdminRole;
import Model.system.ApplicationSystem;
import Model.system.Branch;
import Model.system.UserAccount;
import Model.system.UserAccountDirectory;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class ViewRentalJPanel extends javax.swing.JPanel {

    private ApplicationSystem applicationsystem;
    private Branch branch;
    private UserAccount useraccount;
    DefaultTableModel viewTableModel;
    DefaultTableModel viewTableModel2;
    /** Creates new form CreateBranchJPanel */

    
    public ViewRentalJPanel() {
        initComponents();

    }

    public ViewRentalJPanel(ApplicationSystem applicationsystem, Branch branch, UserAccount useraccount) {
        initComponents();
        this.viewTableModel = (DefaultTableModel) tableBookTable.getModel();  
        this.viewTableModel2 = (DefaultTableModel) tableMagazineTable.getModel();  
        this.applicationsystem = applicationsystem;
        this.branch = branch;
        this.useraccount = useraccount;
        displayRentalTableDetails();
//        displayBook();
//        displayLocationDp();
        //displayLibraryDp();
//        displayBookDetails();
//        displayBook();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMagazineTable = new javax.swing.JTable();
        txtGenerateRevenue = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBookTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel12.setText("RENTAL REQUEST IN LIBRARY");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 320, 20));

        tableMagazineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "BookName", "Rent Price", "Rent Duration", "Serial Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableMagazineTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 920, 150));
        add(txtGenerateRevenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 140, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("$");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 20, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("GENERATE TOTAL REVENUE");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 160, -1));

        tableBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "BookName", "Rent Price", "Rent Duration", "Serial Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableBookTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 920, 140));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Magazine Rental Request");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 240, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Book Rental Request");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 240, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableBookTable;
    private javax.swing.JTable tableMagazineTable;
    private javax.swing.JTextField txtGenerateRevenue;
    // End of variables declaration//GEN-END:variables


    private void displayRentalTableDetails() {
        ArrayList<Customer> cust = this.applicationsystem.getCustomerList().getCustomerlist();
        ArrayList<String> rentArray = new ArrayList<String>();
        ArrayList<Double> rentArrayPrice = new ArrayList<Double>();
         ArrayList<String> custArray = new ArrayList<String>();
         viewTableModel.setRowCount(0);
          viewTableModel2.setRowCount(0);
      for(int i =0; i< cust.size();i++){
            ArrayList<Rent> rt = cust.get(i).getRentlist();
          for(int j=0;j<rt.size();j++){
              rentArray.add(rt.get(j).getRentId());
              rentArrayPrice.add(rt.get(j).getRentPrice());
              custArray.add(cust.get(i).getCustomerName());
          }  
      }

      Library lib = this.branch.getLib();
        ArrayList<Book> bookcollection = lib.getBooklist().getBooklistCollection();
        ArrayList<Magazine> magCollection = lib.getGeneralList().getMagazineCollection();
        
             for(int i =0;i< bookcollection.size();i++ ){
               if(bookcollection.get(i).getLocation().equals(useraccount.getAccessTo()))
               {
                   for(int j=0;j<rentArray.size();j++){
                   
                   if(rentArray.get(j) == bookcollection.get(i).getRt().getRentId() )
                   {
                     Object row[] = new Object[6];  
                     row[0] = custArray.get(j);
                     row[1] = bookcollection.get(i).getMaterialName();
                     row[2] = bookcollection.get(i).getRt().getRentPrice();
                     row[3] = bookcollection.get(i).getRt().getRentDuration();
                     row[4] = bookcollection.get(i).getRt().getSerialNumber();
                     viewTableModel.addRow(row);
                   }
                   }
               }
             }
             
             
               for(int i =0;i< magCollection.size();i++ ){
               if(magCollection.get(i).getLocation().equals(useraccount.getAccessTo()))
               {
                   for(int j=0;j<rentArray.size();j++){
                   if(rentArray.get(j) == magCollection.get(i).getRt().getRentId() )
                   {
                     Object row[] = new Object[6];  
                     row[0] = custArray.get(j);
                     row[1] = magCollection.get(i).getMaterialName();
                     row[2] = magCollection.get(i).getRt().getRentPrice();
                     row[3] = magCollection.get(i).getRt().getRentDuration();
                     row[4] = magCollection.get(i).getRt().getSerialNumber();
                     viewTableModel2.addRow(row);
                   }
                   }
               }
             }
  
             double sum=0;
             for(int i = 0;i < rentArrayPrice.size() ;i++){
                 sum = sum + rentArrayPrice.get(i);
    }
             txtGenerateRevenue.setText(String.valueOf(sum));                                                                                                                                           
    }
    
}
      
      
      
      
      
      
      
              
        
        
        
   
        

    
    
    
 
     


