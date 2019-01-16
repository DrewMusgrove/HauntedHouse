/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hauntedhouse;

/**
 *
 * @author drew.musgrove
 */
public class Zombie {
    
    String name;
    int amountOfFood = 0;
    
     public Zombie( String inputName){
        this.name = inputName;
    }
     
    public void speak(){
        System.out.println(this.name+": Grrrrrr...");
        System.out.println("");
    } 
     
    public void feedHand(){
        
        if (this.amountOfFood > 15)
        {
            System.out.println(this.name+": Grrrrrr...Too much food!");
            System.out.println("");
        }
        else
        {
            this.amountOfFood++;
            System.out.println(this.name+": Mmmmmmmm...Hnads Yum!");
            System.out.println("");
        }    
        
    }
    
    public void feedBrains(){
         if (this.amountOfFood > 15)
        {
            System.out.println(this.name+": Grrrrrr...Too much food!");
            System.out.println("");
        }
        else
        {
            this.amountOfFood = this.amountOfFood + 10;
            System.out.println(this.name+": Mmmmmmmm...Brains Yum!");
            System.out.println("");
        }
    }
            
    
}
