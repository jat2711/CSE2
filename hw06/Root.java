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
    
    double x;
    double high;
    double low=0;
     
     if (myScanner.hasNextDouble()) {
         x=myScanner.nextDouble();
         high=x+1;
         
    while (high-low>0.0000001*(1+x)) {
        double middle=(high+low)/2;
    
    } // end of while statement
    
     } // end of if statement

} // end of main method
} // end of class
    