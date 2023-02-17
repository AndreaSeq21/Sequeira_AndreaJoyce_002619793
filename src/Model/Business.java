/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author asequ
 */
public class Business {

    private ApplicantDirectory applicantDirectory;
    private InsurancePlans insurancePlans;
    private VaccineDirectory vaccineDirectory;

    public Business() {
        this.applicantDirectory = new ApplicantDirectory();
        this.insurancePlans = new InsurancePlans();
        this.vaccineDirectory = new VaccineDirectory();
    }

    public VaccineDirectory getVaccineDirectory() {
        return vaccineDirectory;
    }

    public void setVaccineDirectory(VaccineDirectory vaccineDirectory) {
        this.vaccineDirectory = vaccineDirectory;
    }

    public static Business getBusinessInstance() {
        return new Business();
    }

    public ApplicantDirectory getApplicantDirectory() {
        return applicantDirectory;
    }

    public void setApplicantDirectory(ApplicantDirectory applicantDirectory) {
        this.applicantDirectory = applicantDirectory;
    }

    public InsurancePlans getInsurancePlans() {
        return insurancePlans;
    }

    public void setInsurancePlans(InsurancePlans insurancePlans) {
        this.insurancePlans = insurancePlans;
    }

}
