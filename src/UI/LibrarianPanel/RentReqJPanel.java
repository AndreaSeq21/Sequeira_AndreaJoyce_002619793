/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI.LibrarianPanel;

import Model.Customer.Customer;
import UI.SystemAdminPanel.*;
import Model.Employee.Employee;
import Model.Employee.EmployeeDirectory;
import Model.Library.Library;
import Model.Material.Book;
import Model.Material.BookCollection;
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
 * @author asequ
 */
public class RentReqJPanel extends javax.swing.JPanel {

    private ApplicationSystem applicationsystem;
    private Branch branch;
    private UserAccount useraccount;
    DefaultTableModel viewTableModel;
    /** Creates new form CreateBranchJPanel */

    
    public RentReqJPanel() {
        initComponents();

    }

    public RentReqJPanel(ApplicationSystem applicationsystem, Branch branch, UserAccount useraccount) {
        initComponents();
        this.viewTableModel = (DefaultTableModel) tableBookTable.getModel();  
        this.applicationsystem = applicationsystem;
        this.branch = branch;
        this.useraccount = useraccount;
        displayBookRentRequest();
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

        btnDeclineBook = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBookTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        btnAcceptBook = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 204, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDeclineBook.setText("DECLINE");
        btnDeclineBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineBookActionPerformed(evt);
            }
        });
        add(btnDeclineBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 130, 30));

        tableBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOK NAME", "No. of Pages", "Languages", "Author", "Genre", "Type of Binding", "Date", "Available", "Rent Price", "Rent Duration", "Serial Number", "Customer Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableBookTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 1070, 280));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel12.setText("ACCEPT/REJECT RENT");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 280, -1));

        btnAcceptBook.setText("ACCEPT");
        btnAcceptBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptBookActionPerformed(evt);
            }
        });
        add(btnAcceptBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeclineBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineBookActionPerformed

          Library lib = this.branch.getLib();
          Book book = new Book();
          BookCollection bookcollection = lib.getBooklist();
          
         
          
          
          
          
       
          
          
    }//GEN-LAST:event_btnDeclineBookActionPerformed

    private void btnAcceptBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptBookActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableBookTable.getSelectedRow();
             if(selectedRow >= 0 ){
            String selectSerialNumber = tableBookTable.getValueAt(selectedRow, 10).toString();
            Library lib = this.branch.getLib();
             ArrayList<Book> bookcollection = lib.getBooklist().getBooklistCollection();
             //update rent with requested
              for(int i =0;i< bookcollection.size();i++ ){
                  long serialNumber = bookcollection.get(i).getRt().getSerialNumber();
                  
               if( serialNumber == Long.valueOf(selectSerialNumber) )
               {
                   Book bk= bookcollection.get(i);
                   bk.setIsAvailableFlag(false);
                  Rent rt = bk.getRt();
                  rt.setBookRequested("ACCEPTED");
                  bk.setRt(rt);
                  this.applicationsystem.UpdateBookToBranch(bookcollection.get(i).getLocation(),bk);
                  this.applicationsystem.getCustomerList().updateRentStatus(this.useraccount.getAccountId(), rt);
                  break;
               }
              }
               JOptionPane.showMessageDialog(null, "Accepted Request");
              
        }
             
        
        
    }//GEN-LAST:event_btnAcceptBookActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptBook;
    private javax.swing.JButton btnDeclineBook;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBookTable;
    // End of variables declaration//GEN-END:variables

public String fetchBranchName()
    {
        String BranchName = "";
        String userAccountValue = this.useraccount.getAccountId();      
        ArrayList<Branch> br = this.applicationsystem.getBranches();
        int fetchNumber = 0;
        for(int i=0;i< br.size(); i++){
            String emp = br.get(i).getLib().getEmployeelist().getEmployeelist().get(i).getPersonId();
            if(emp.equals(userAccountValue) ){
                fetchNumber = i;
                break;  
            }
        }
        BranchName = br.get(fetchNumber).getName();
        System.out.println("BRANCH NAME PRINTING "+BranchName);
        return BranchName;
    }

    private void displayBook(){
        viewTableModel.setRowCount(0);
//        ArrayList<Branch> br = this.applicationsystem.getBranches();
       
          
          Library lib = this.branch.getLib();
          ArrayList<Book> bookcollection = lib.getBooklist().getBooklistCollection();
          
        
//        String branchNameFunc = fetchBranchName();
          for(int i =0;i< bookcollection.size();i++ ){
               Object row[] = new Object[11];
               if(bookcollection.get(i).getLocation().equals(useraccount.getAccessTo()))
               {
                     row[0] = bookcollection.get(i).getMaterialName();
                     row[1] = bookcollection.get(i).getNoOfPages();
                     row[2] = bookcollection.get(i).getLanguages();
                     row[3] = bookcollection.get(i).getAuthorName();
                     row[4] = bookcollection.get(i).getGenre();
                     row[5] = bookcollection.get(i).getTypeOfBinding();
                     row[6] = String.valueOf(bookcollection.get(i).getRegisteredDate());
                     row[7] = bookcollection.get(i).getIsAvailableFlag();
                     row[8] = bookcollection.get(i).getRt().getRentPrice();
                     row[9] = bookcollection.get(i).getRt().getRentDuration();
                     row[10] = bookcollection.get(i).getRt().getSerialNumber();
                    
                    viewTableModel.addRow(row);
               }
                  
             
              }    
          }

    private void displayBookRentRequest() {
        
        //fetch all customer who have sent a rented request
        ArrayList<Customer> cust = this.applicationsystem.getCustomerList().getCustomerlist();
        ArrayList<String> customerArray = new ArrayList<String>();
        ArrayList<String> rentArray = new ArrayList<String>();
        for(int i=0;i<cust.size();i++){
            ArrayList<Rent> rt = cust.get(i).getRentlist();
           for(int j=0;j<rt.size();j++){
               if(rt.get(j).getBookRequested().equals("SENT"));
               {
               customerArray.add(cust.get(i).getCustomerName());
               rentArray.add(rt.get(j).getRentId());
               }

           }
        }
        
       
        Library lib = this.branch.getLib();
        ArrayList<Book> bookcollection = lib.getBooklist().getBooklistCollection();
        
             for(int i =0;i< bookcollection.size();i++ ){
               
               
               if(bookcollection.get(i).getLocation().equals(useraccount.getAccessTo()))
               {
                   for(int j=0;j<customerArray.size();j++){
                   
                   if(rentArray.get(j) == bookcollection.get(i).getRt().getRentId() )
                   {
                       Object row[] = new Object[12];
                     row[0] = bookcollection.get(i).getMaterialName();
                     row[1] = bookcollection.get(i).getNoOfPages();
                     row[2] = bookcollection.get(i).getLanguages();
                     row[3] = bookcollection.get(i).getAuthorName();
                     row[4] = bookcollection.get(i).getGenre();
                     row[5] = bookcollection.get(i).getTypeOfBinding();
                     row[6] = String.valueOf(bookcollection.get(i).getRegisteredDate());
                     row[7] = bookcollection.get(i).getIsAvailableFlag();
                     row[8] = bookcollection.get(i).getRt().getRentPrice();
                     row[9] = bookcollection.get(i).getRt().getRentDuration();
                     row[10] = bookcollection.get(i).getRt().getSerialNumber();
                      row[11] = customerArray.get(j);
                     viewTableModel.addRow(row);
                   }
                   
                   }
                   
                   
  
               }
                  
             
              } 
        
        
        
        
    }
    }
    
 
     


