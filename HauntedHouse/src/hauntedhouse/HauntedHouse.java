/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hauntedhouse;

import java.util.Scanner;

/**
 *
 * @author drew.musgrove
 */
public class HauntedHouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ghost casper = new Ghost("Casper");
        Zombie zed = new Zombie("Zed");
        Phone cell = new Phone("A");
        boolean loop = true;
        
        Scanner sc = new Scanner(System.in);
        
        while (loop){
            System.out.println("System: Hello, who would you like to speak too??");
            System.out.println("System: 'Zed?'");
            System.out.println("System: 'Casper?'");
            String input = sc.nextLine();
            if (input.toUpperCase().contains("ZED"))
            {
                loop = false;
                zed.speak();
                System.out.println("System: Would you like to feed Zed? Y/N");
                input = sc.nextLine();
                if (input.toUpperCase().contains("Y"))
                {
                    System.out.println("System: Would you like to feed Zed? Brains or Hands?");
                    input = sc.nextLine();
                    if (input.toUpperCase().contains("BRAINS")){
                        zed.feedBrains();
                    }
                    else  if (input.toUpperCase().contains("HANDS"))
                    {
                        zed.feedHand();
                    }
                    else
                    {
                        System.out.println("System: Zed dont eat "+input);
                    }

                }
                else
                {
                    System.out.println("Zed: Me hungry!!");
                }
            }
            else if (input.toUpperCase().contains("CASPER"))
            {
                loop = false;
                casper.speak();
                System.out.println("Casper: What year did I die?");
                int inputInt = sc.nextInt();
                casper.addYearDied(inputInt);
                casper.askAge();
            }
            else
            {
                System.out.println("System: Whos "+input);
                System.out.println("");
            }
        };                       
       
    }
    
}
