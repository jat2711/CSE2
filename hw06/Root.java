////////////////////
// Joanna Targowski
// Root Java Program
// My program will prompt the user to enter a double that is greater than 0 and then compute the square root. 
//
////  first compile the program 
//      javac Root.java
//  run the program 
//      java Root

import java.util.Scanner;

//define class
public class Root {
    
//  add main method
        public static void main(String[] args) {

    Scanner myScanner;
    myScanner=new Scanner (System.in);
    
         System.out.println("Enter a double that is >0 ");
            
            double x=myScanner.nextDouble();;
            double high=x+1;
            double low=0;
            double middle=0;
            
    while (true) {
        middle=(high+low)/2; 
        double middle2=middle*middle;

    if (middle2>x) {
        high=middle;
    } // end of if statement
    
    if (middle2<x) {
        low=middle;
    
    } // end of if statement

    if ((high-low)<0.0000001) {
        break; // stops the loop if statement is true
        
    } // end of if statement
    } // end of while statement
    
      System.out.println("The square root is " +middle);
      

} // end of main method
} // end of class
    