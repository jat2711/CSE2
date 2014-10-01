////////////////////
// Joanna Targowski
// Random Games Java Program
// This program will use the Scanner class to obtain from the user one of three choices for a game of chance.
// Roulette, Craps, or Picking a Card from a deck of playing cards
// 
//  first compile program 
//      javac RandomGames.java
//  run the program 
//      java RandomGames

import java.util.Scanner;

//  define a class
public class RandomGames{
    
//  add main method
        public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner=new Scanner (System.in); 
        
        System.out.println("Enter R or r for Roulette, C or c for Craps, P or p for pick a card."); //Promps the user to choose one of the three choices.
         
        if (myScanner.hasNextInt()) {
        String nGame=myScanner.nextInt(); 
       else {
                System.out.println("You did not enter R, r, C, c, P, or p.");
                return; // This terminates the program. 
        } // Closes of the else statement that tells the user that they did not enter the correct letter. 
        
        
        
        
        
            
} // end of main method
    
} // end of class