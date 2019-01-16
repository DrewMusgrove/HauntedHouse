/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hauntedhouse;

import java.time.Year;

/**
 *
 * @author drew.musgrove
 */
public class Ghost {
    
    String name;

    String secret = "";
    int currentYear = Year.now().getValue();
    int yearDied;
    int age = 0;
    
    public Ghost( String inputName){
        this.name = inputName;
    }

    public void addYearDied(int yearDied){
        this.yearDied = yearDied;
        this.age = currentYear - yearDied ;
    }
    
    public void changeName(String newName){
        this.name = newName;
    }
    
    public void changeAge(int newAge){
        this.age = newAge;
    }
    
    public void speak(){
        System.out.println(this.name + ": Boo!");
        System.out.println("");
    }
    
    public void tellSecret(String secret){
        this.secret = secret;
    }
    
    public void askAge(){
        if (this.age < 1){
            System.out.println(this.name + ": I don't know how old I am...");
            System.out.println("");
        }
        else
        {
            System.out.println(this.name + ": I am "+this.age+" years old");
            System.out.println("");
        }
    }
         
    public void speakSecret(){
        
        if (this.secret == ""){
            System.out.println(this.name + ": I don't have a secret to tell.");
            System.out.println("");
        }
        else
        {
             
             System.out.println(this.name + ": Okay, I'll tell you...");
             System.out.println(this.name + ": "+this.secret);
             System.out.println("");
        }
    }
    
}
