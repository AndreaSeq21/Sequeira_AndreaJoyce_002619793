/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class InsurancePlans {
    ArrayList<PlanDetail> insurancePlanList;

    public InsurancePlans() {
        this.insurancePlanList = new ArrayList<PlanDetail>() ;
    }
    
    public ArrayList<PlanDetail> getInsurancePlanList() {
        return insurancePlanList;
    }

    public void setInsurancePlanList(ArrayList<PlanDetail> insurancePlanList) {
        this.insurancePlanList = insurancePlanList;
    }
    
    //Add applicant 
    public PlanDetail createPlans(int planId, String planName, double costPerMonth, double costPerAnnum){
        PlanDetail plan = new PlanDetail(planId,planName,costPerMonth,costPerAnnum);
        insurancePlanList.add(plan);
        return plan;
    }
    
    public PlanDetail findbyId(int id) {
        for(PlanDetail u: this.insurancePlanList) {
            if(u.getPlanId() == (id)) {
                return u;
            }
        }
        return null;
    }
    
}
