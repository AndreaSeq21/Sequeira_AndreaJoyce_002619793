/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class Applicant {
    int applicationID;
    String ownerFirstName;
    String ownerLastName;
    Date applicationDate;
    PetDetails pet;
    
    public Applicant() {
       
        this.pet = new PetDetails();
    }

    public Applicant(int applicationID, String ownerFirstName, String ownerLastName, Date applicationDate ) {
        this.applicationID = applicationID;
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.applicationDate = applicationDate;
        //this.pet = pet;
    }

    public PetDetails getPet() {
        return pet;
    }

    public void setPet(PetDetails pet) {
        this.pet = pet;
    }

    public int getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(int applicationID) {
        this.applicationID = applicationID;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }
    
    
    
}
