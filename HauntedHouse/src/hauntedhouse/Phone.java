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
public class Phone {
    String name;
    
    public Phone( String inputName){
        this.name = inputName;
    }
    
    public void call(String whoYouGonnaCall){
        whoYouGonnaCall = whoYouGonnaCall.toUpperCase();
        if (whoYouGonnaCall.equals("GHOSTBUSTERS")){
            System.out.println("**Hello, you're though to the Ghostbusters, how may be help?**");
            System.out.println("");
        }
        else
        {
            System.out.println("**Unknown Number**");
            System.out.println("");
        }
    }
    
}
