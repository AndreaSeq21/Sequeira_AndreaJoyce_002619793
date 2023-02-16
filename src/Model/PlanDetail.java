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
public class PlanDetail {
    int planId;
    String planName;
    double costPerMonth;
    double costPerAnnum;

    public PlanDetail() {
    }

    public PlanDetail(int planId, String planName, double costPerMonth, double costPerAnnum) {
        this.planId = planId;
        this.planName = planName;
        this.costPerMonth = costPerMonth;
        this.costPerAnnum = this.costPerMonth * 12;
    }
    
    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public double getCostPerMonth() {
        return costPerMonth;
    }

    public void setCostPerMonth(double costPerMonth) {
        this.costPerMonth = costPerMonth;
    }

    public double getCostPerAnnum() {
        return costPerAnnum;
    }

    public void setCostPerAnnum(double costPerAnnum) {
        this.costPerAnnum = costPerAnnum;
    }
    
}
