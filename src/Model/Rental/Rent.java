/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Rental;

/**
 *
 * @author asequ
 */
public class Rent {
    
    
    String rentId ;
    Double rentPrice;
    String status;
    String rentDuration;
    private static int counter = 0;
    
    
    public Rent(Double rentPrice, String status, String rentDuration) {
        this.rentId = "rentId" + this.counter++;
        this.rentPrice = rentPrice;
        this.status = status;
        this.rentDuration = rentDuration;
    }

    public Rent() {
         //To change body of generated methods, choose Tools | Templates.
    }

    public String getRentId() {
        return rentId;
    }

    public void setRentId(String rentId) {
        this.rentId = rentId;
    }

    public Double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRentDuration() {
        return rentDuration;
    }

    public void setRentDuration(String rentDuration) {
        this.rentDuration = rentDuration;
    }
    
    
    
    
    
    
    
}
