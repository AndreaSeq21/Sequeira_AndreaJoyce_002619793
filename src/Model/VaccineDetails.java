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
public class VaccineDetails {
    String vaccineName;
    boolean courseCompleted;

    public VaccineDetails() {
    }
    
    public VaccineDetails(String vaccineName, boolean courseCompleted) {
        this.vaccineName = vaccineName;
        this.courseCompleted = courseCompleted;
    }
    
    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public boolean getCourseCompleted() {
        return courseCompleted;
    }

    public void setCourseCompleted(boolean courseCompleted) {
        this.courseCompleted = courseCompleted;
    }
    
}
