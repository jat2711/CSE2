////////////////////
// Joanna Targowski
// Big Mac Again Java Program
// Purpose of the program: User will be asked how many Big Macs they want and whether they want to order fries.
// The program will then print out the total cost of the meal. BM cost $2.22 each and fries cost $2.15 each.

//  first compile program
        javac BigMacAgain.java
//  run the program
//      java BigMacAgain//

import java.util.Scanner;

//  define a class
public class BigMacAgain {
    
//  add main method 
    public static void main (String[] args) {
        
    Scanner myScanner; 
    myScanner= new Scanner ( System.in );
    
    System.out.print( "How many Big Macs would you like? (an integer >0"); // This is asking the user how many Big Macs they would like.
    int nBigMacs= myScanner.nextInt();
    if (myScanner.hasNextInt())
    
    else {
        System.out.println("You did not enter an int");
        return;     // leaves program, i.e.
                        // the program terminates
    }
    System.out.print("Is the amount of Big Macs >0?"); // Validating if the amount entered is greater than 0.
    if (myScanner.hasNextIn())
    
    else {
        System.out.println("Are you sure the amount you entered is >0?");
        return;     // leaves the program 
                        // the program terminates
    }
    System.out.print("The cost of each Big Mac is $2.22."); The cost of each individual Big Mac. 
    System.out.print("Would you like to order some fries?");
    String Fries=myScanner.next();
    if (myScanner.hasNextInt())
        
    else {
        System.out.println("Error you did not enter if you want fries.Would you like fires y/n");
        return; 
    }
    } // end of main method 
} // end of class
