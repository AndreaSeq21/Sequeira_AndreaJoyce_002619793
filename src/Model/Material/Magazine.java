/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Material;

import Model.Rental.Rent;

/**
 *
 * @author asequ
 */
public class Magazine extends Material {
   
    String issueType;
    String location;
    Rent rt;
    
    
 public Magazine() {
         super();
         this.rt = new Rent();
    }
    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Rent getRt() {
        return rt;
    }

    public void setRt(Rent rt) {
        this.rt = rt;
    }
    
    
    
}
