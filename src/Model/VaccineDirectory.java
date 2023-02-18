/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author asequ
 */
public class VaccineDirectory {
    ArrayList<VaccineDetails> vaccineList;

    public VaccineDirectory(ArrayList<VaccineDetails> vaccineList) {
        this.vaccineList = vaccineList;
    }
     public VaccineDirectory(){
        this.vaccineList = new ArrayList<VaccineDetails>();
    }

    public ArrayList<VaccineDetails> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(ArrayList<VaccineDetails> vaccineList) {
        this.vaccineList = vaccineList;
    }
    
   public VaccineDetails addVaccine (String petId,String vaccineName, boolean courseCompleted){
        System.out.println("Account created");
        VaccineDetails vacc = new VaccineDetails(petId,vaccineName, courseCompleted);
        vaccineList.add(vacc);
        return vacc;
        
    }
    
}
