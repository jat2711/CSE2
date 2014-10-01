////////////////////
// Joanna Targowski
// Burger King Java Program
// My program will prompt the user to enter a choice of a burger, soda, or fries and will ask them for details about their order. 
//
//  first compile the program 
//      javac BurgerKing.java
//  run the program 
//      java BurgerKing

import java.util.Scanner;

//define class
public class BurgerKing{
    
//  add main method
        public static void main(String[] args) {
            
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        
        
        System.out.print("Enter a letter to indicate a choice of Burger (B or b) Soda (S or s) Fries (F or f) ");
    
    
        String Order= myScanner.next();
        
        switch (Order) {
            default:    System.out.println("You did not enter a valid character or a single character.");
                            return; // This terminates the program.
            case "B": 
            case "b":   System.out.println("Do you want a (A or a) for all the fixins , (C or c) for cheese, or (N or n) for none of the above? ");
                        String Burger= myScanner.next();
                        switch (Burger) {
                            default:  System.out.println("You did not enter a valid character or a single character.");
                                        return; // This temrinates the program.
                            case "A":
                            case "a": System.out.println("You ordered a burger with all the fixins.");
                                        break;
                            case "C":
                            case "c": System.out.println("You ordered a burger with cheese.");
                                        break;
                            case "n":
                            case "N": System.out.println("You ordered a plain burger.");
                                        break;
                        } break;  // end of Burger switch statement
            case "S":
            case "s":   System.out.println("Do you want Pepsi (P or p), Coke (C or c), Sprite (S or s), or Mountain Dew (M or m)?");
                        String Soda=myScanner.next();
                        switch (Soda) {
                            default:  System.out.println("You did not enter a valid character or a single character.");
                                        return; // This terminates the program.
                            case "P":
                            case "p": System.out.println("You ordered a Pepsi.");
                                        break;
                            case "C":
                            case "c": System.out.println("You ordered a Coke.");
                                        break;
                            case "S":
                            case "s": System.out.println("You ordered a Sprite.");
                                        break;
                            case "M": 
                            case "m": System.out.println("You ordered a Mountain Dew.");
                                        break;
                        } break; // end of Soda switch statement
            case "F":
            case "f": System.out.println("You want a large or small order of fries?");
                        String Fries=myScanner.next();
                        switch (Fries) {
                            default:  System.out.println("You did not enter a valid character or a single character.");
                                        return; // This terminates the program.
                            case "L":
                            case "l": System.out.println("You ordered large fries.");
                                        break;
                            case "S":
                            case "s": System.out.println("You ordered small fries.");
                                        break;
                        } break; // end of Fries switch statement
        
                                
        } // end of Order switch statement             
                    

        
        // System.out.println("A single character expected."); return; 
                
    
        
} // end of main method
} // end of class