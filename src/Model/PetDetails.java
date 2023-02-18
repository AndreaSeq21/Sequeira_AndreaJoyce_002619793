/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class PetDetails {
    String petId;
    String petName;
    int petAge;
    String gender;
    String petType;
    String breed;
    VaccineDetails vaccine;
    String insuranceDetails;

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    
    public String getInsuranceDetails() {
        return insuranceDetails;
    }

    public void setInsuranceDetails(String insuranceDetails) {
        this.insuranceDetails = insuranceDetails;
    }

    public VaccineDetails getVaccine() {
        return vaccine;
    }

    public void setVaccine(VaccineDetails vaccine) {
        this.vaccine = vaccine;
    }
    

    public PetDetails() {
    }
    

    public PetDetails(String petName, int petAge, String gender, String petType, String breed, VaccineDetails vaccine, String insuranceDetails,String petId) {
        this.petName = petName;
        this.petAge = petAge;
        this.gender = gender;
        this.petType = petType;
        this.breed = breed;
        this.vaccine = vaccine;
        this.insuranceDetails = insuranceDetails;
        this.petId = petId;
    }
    
    
    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    

}
