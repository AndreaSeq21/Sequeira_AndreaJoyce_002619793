/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Material;

import java.util.Date;

/**
 *
 * @author asequ
 */
public class Material {
    String materialName;
    int serialNumber;
    Date registeredDate;
    Boolean isAvailableFlag;

    public Material(String materialName, int serialNumber, Date registeredDate, Boolean isAvailableFlag) {
        this.materialName = materialName;
        this.serialNumber = serialNumber;
        this.registeredDate = registeredDate;
        this.isAvailableFlag = isAvailableFlag;
    }

    public Material() {
    }
    
    

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    public Boolean getIsAvailableFlag() {
        return isAvailableFlag;
    }

    public void setIsAvailableFlag(Boolean isAvailableFlag) {
        this.isAvailableFlag = isAvailableFlag;
    }
    
    
    
    
    
    
    
    
    
}
