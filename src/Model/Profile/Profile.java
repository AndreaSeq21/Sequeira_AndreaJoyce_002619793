/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Profile;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class Profile {

    String personId;
    String name;
    int age;
    
    public Profile(){
        
    }
    
    public Profile (String personId, String name, int age) {
        this.personId = personId;
        this.name = name;
        this.age = age;
    }
    
    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.personId;
    }
}
