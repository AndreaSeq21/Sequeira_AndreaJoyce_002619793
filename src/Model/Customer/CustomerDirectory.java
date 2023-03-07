/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Customer;

import Model.Rental.Rent;
import java.util.ArrayList;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class CustomerDirectory {
    ArrayList<Customer> customerlist;

    public CustomerDirectory(ArrayList<Customer> customerlist) {
        this.customerlist = customerlist;
    }

     public CustomerDirectory() {
        this.customerlist = new  ArrayList<Customer>();
    }
    
    public ArrayList<Customer> getCustomerlist() {
        return customerlist;
    }

    public void setCustomerlist(ArrayList<Customer> customerlist) {
        this.customerlist = customerlist;
    }
    
    public Customer addCustomer(String customerName,int customerAge,String customerId){
        Customer customer = new Customer();
        customer.setCustomerName(customerName);
        customer.setCustomerAge(customerAge);
        customer.setCustomerId(customerId);
        this.customerlist.add(customer);
//        return customer;
        return null;
    }
    
      public void updateCustomer(String customerId,Rent rt){
       for(Customer cust: this.customerlist)
       {
           if(cust.getCustomerId().equals(customerId)){
               cust.getRentlist().add(rt);
               
           }
       }
      }
       
        public void updateRentStatus(String customerId,Rent rt){
       for(Customer cust: this.customerlist)
       {
           if(cust.getCustomerId().equals(customerId)){
               ArrayList<Rent> rent = cust.getRentlist();
               for(int i=0;i<rent.size();i++){
                   if(rent.get(i).getRentId().equals(rt.getRentId())){
                       rent.get(i).setBookRequested(rt.getBookRequested());
                   }
                       
               }
               
           }
       }
       
//        return customer;
//        return null;
    }
    
}
