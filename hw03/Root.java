////////////////////
// Joanna Targowski
// Root Java Program
//
//  first compile program 
//      javac Root.java
//  run the program
//      java Root//

import java.util.Scanner;

//  define a class
    public class Root{

//  add main method 
    public static void main (String[] args) {
        
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        System.out.print("Plug in a number and I will estimate the cubed root.");
        
        double x=myScanner.nextDouble();// X is the number entered.
        double guess1= x/3; // Guess number 1 for the cubed root.
        double guess2=(2*guess1*guess1*guess1+x)/(3*guess1*guess1);  // Guess number 2 for the cubed root.
        double guess3=(2*guess2*guess2*guess2+x)/(3*guess2*guess2); // Guess number 3 for the cubed root.
        double guess4=(2*guess3*guess3*guess3+x)/(3*guess3*guess3); // Guess number 4 for the cubed root.
        double guess5=(2*guess4*guess4*guess4+x)/(3*guess4*guess4); // Guess number 5 for the cubed root.
        double guess6=(2*guess5*guess5*guess5+x)/(3*guess5*guess5); // Guess number 6 for the cubed root.
        double cubed=(guess6*guess6*guess6);  // Cubing the number.

//Print out the following information.
        
        System.out.println("The cubed root is " +guess6);  
        System.out.println(+guess6+"*"+guess6+"*"+guess6+"="+cubed); 

    } // end of main method
} // end of class