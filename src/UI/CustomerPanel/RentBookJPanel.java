/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI.CustomerPanel;

import Model.BookInfo.Author;
import Model.BookInfo.Genre;
import UI.LibrarianPanel.*;
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
public class RentBookJPanel extends javax.swing.JPanel {

    private ApplicationSystem applicationsystem;
    private Branch branch;
    private UserAccount useraccount;
    DefaultTableModel viewTableModel;
    /** Creates new form CreateBranchJPanel */

    
    public RentBookJPanel() {
        initComponents();

    }

    public RentBookJPanel(ApplicationSystem applicationsystem, Branch branch, UserAccount useraccount) {
        initComponents();
        this.viewTableModel = (DefaultTableModel) tableBookTable.getModel();  
        this.applicationsystem = applicationsystem;
        this.branch = branch;
        this.useraccount = useraccount;
        displayLocationDp();
        displayAuthorNameDp();
        displayGenreNameDp();
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
        jLabel2 = new javax.swing.JLabel();
        comboLocation = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboAuthorName = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        comboGenre = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBookTable = new javax.swing.JTable();
        btnRent = new javax.swing.JButton();
        btnViewLocation = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel12.setText("RENT BOOK ");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 280, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("SELECT LOCATION");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 800, 20));

        comboLocation.setBorder(null);
        comboLocation.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboLocationItemStateChanged(evt);
            }
        });
        comboLocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboLocationKeyPressed(evt);
            }
        });
        add(comboLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 230, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("SELECT AUTHOR");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 800, 20));

        comboAuthorName.setBorder(null);
        add(comboAuthorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 230, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("SELECT GENRE");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 800, 20));

        comboGenre.setBorder(null);
        add(comboGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 230, 30));

        tableBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOK NAME", "No. of Pages", "Languages", "Author", "Genre", "Type of Binding", "Date", "Available", "Rent Price", "Rent Duration", "Serial Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableBookTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 840, 270));

        btnRent.setText("RENT");
        add(btnRent, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 150, 30));

        btnViewLocation.setText("VIEW");
        btnViewLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewLocationActionPerformed(evt);
            }
        });
        add(btnViewLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 70, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void comboLocationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboLocationKeyPressed
        // TODO add your handling code here:
       
        
        
        
    }//GEN-LAST:event_comboLocationKeyPressed

    private void comboLocationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboLocationItemStateChanged
        // TODO add your handling code here:
         
    }//GEN-LAST:event_comboLocationItemStateChanged

    private void btnViewLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewLocationActionPerformed
        // TODO add your handling code here:
          String location = (String) comboLocation.getSelectedItem();
        displayBookTableDetails(location);
    }//GEN-LAST:event_btnViewLocationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRent;
    private javax.swing.JButton btnViewLocation;
    private javax.swing.JComboBox<String> comboAuthorName;
    private javax.swing.JComboBox<String> comboGenre;
    private javax.swing.JComboBox<String> comboLocation;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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

    private void displayLocationDp() {
            comboLocation.removeAllItems();
         ArrayList<String> br = this.applicationsystem.getBranchName();
        for (int i = 0; i < br.size(); i++)
        {
            comboLocation.addItem(br.get(i));
        }
        
    }
    
    private void displayAuthorNameDp() {
            comboAuthorName.removeAllItems();
         ArrayList<Branch> br = this.applicationsystem.getBranches();
         ArrayList<String> displayAuthor = new ArrayList<String>() ;
//         ArrayList<String> displayAuthor2 = null ;
        for (int i = 0; i < br.size(); i++)
        {
                ArrayList<Author> author = br.get(i).getLib().getAuthorCompleteList().getAuthorlist();
                
                    for(int j=0;j< author.size();j++){
                        displayAuthor.add(author.get(j).getAuthorName());
                    } 
        }
        
        
        int authorSize = displayAuthor.size();
        if(authorSize < 2){
            authorSize = 1;
        }else if(authorSize > 2) {
            authorSize = displayAuthor.size() / 2;
           
        }
        
        //display data
         for(int j = 0 ;j < authorSize ;j++)
             {
                   comboAuthorName.addItem(displayAuthor.get(j));
             }
          
    }
    
        private void displayGenreNameDp() {
                comboGenre.removeAllItems();
         ArrayList<Branch> br = this.applicationsystem.getBranches();
         ArrayList<String> displayAuthor = new ArrayList<String>() ;
//         ArrayList<String> displayAuthor2 = null ;
        for (int i = 0; i < br.size(); i++)
        {
                ArrayList<Genre> author = br.get(i).getLib().getGenreCompleteList().getGenrelist();
                
                    for(int j=0;j< author.size();j++){
                        displayAuthor.add(author.get(j).getGenreName());
                    } 
        }
        
        
        int authorSize = displayAuthor.size();
        if(authorSize < 2){
            authorSize = 1;
        }else if(authorSize > 2) {
            authorSize = displayAuthor.size() / 2;
           
        }
        
        //display data
         for(int j = 0 ;j < authorSize ;j++)
             {
                   comboGenre.addItem(displayAuthor.get(j));
             }
            
    }

    private void displayBookTableDetails(String location) {
        viewTableModel.setRowCount(0);
          Library lib = this.branch.getLib();
          ArrayList<Book> bookcollection = lib.getBooklist().getBooklistCollection();
        
        
//        String branchNameFunc = fetchBranchName();
          for(int i =0;i< bookcollection.size();i++ ){
               Object row[] = new Object[11];
               if(bookcollection.get(i).getLocation().equals(location))
               {
                    System.out.println("Inside display book function");
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
    }
    
    
    
    
 
     


