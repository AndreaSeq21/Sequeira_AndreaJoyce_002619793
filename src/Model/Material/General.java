/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Material;

import java.util.ArrayList;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class General {
    private ArrayList<Magazine> magazineCollection;

    public General() {
        this.magazineCollection = new ArrayList<Magazine>();
    }

    
    
    public ArrayList<Magazine> getMagazineCollection() {
        return magazineCollection;
    }

    public void setMagazineCollection(ArrayList<Magazine> magazineCollection) {
        this.magazineCollection = magazineCollection;
    }
    
    
    
}
