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
public class ChefDetails {

    String chefFirstName;
    String chefLastName;
    String userName;
    ContactInformation contact;
    Recipe recipe;
    
    public ChefDetails() {
        this.chefFirstName = "";
        this.chefLastName = "";
        this.userName= "";
        this.contact = new ContactInformation();
        this.recipe = new Recipe();
    }

    public String getChefFirstName() {
        return chefFirstName;
    }

    public void setChefFirstName(String chefFirstName) {
        this.chefFirstName = chefFirstName;
    }

    public String getChefLastName() {
        return chefLastName;
    }

    public void setChefLastName(String chefLastName) {
        this.chefLastName = chefLastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ContactInformation getContact() {
        return contact;
    }

    public void setContact(ContactInformation contact) {
        this.contact = contact;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
    

}
