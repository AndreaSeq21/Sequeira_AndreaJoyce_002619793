/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author asequ
 */
public class ApplicantDirectory {
    
    ArrayList<Applicant> applicantList;
    
    
    public ApplicantDirectory(){
        this.applicantList = new ArrayList<Applicant>();
    }

    public ArrayList<Applicant> getApplicantList() {
        return applicantList;
    }

    public void setApplicantList(ArrayList<Applicant> applicantList) {
        this.applicantList = applicantList;
    }
    
    //Add applicant 
    public Applicant createApplicant(int applicationID, String ownerFirstName, String ownerLastName, Date applicationDate){
        System.out.println("Account created");
        Applicant user = new Applicant(applicationID,ownerFirstName,ownerLastName,applicationDate);
        applicantList.add(user);
        return user;
        
    }
    
    //Search by id
    public Applicant findbyId(int id) {
        for(Applicant u: this.applicantList) {
            if(u.getApplicationID() == (id)) {
                return u;
            }
        }
        return null;
    }
    
    
    //Delete Applicant
    public void removeApplicant (int id){
          for(Applicant m: this.applicantList){
              if(m.getApplicationID() == id )
                  this.applicantList.remove(m);
                  break;
              }
          }
    
    
    public Boolean applicantExists(int id) {
        
        for (Applicant a : this.applicantList) {
            if(a.getApplicationID() == id){
                return true;
            }
        }
        return false;
    }

    public Applicant createApplicant(Integer valueOf, String firstName, String lastName, Date dateValue, PetDetails pet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    }

