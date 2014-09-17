////////////////////
// Joanna Targowski
// Four Digits Java Program
// My program will prompt the user to enter a double.
// Then it will print out the first four digits to the right of the decimal.
//
//  first compile the program
//      javac FourDigits.java
//  run the program
//      java FourDigits//

import java.util.Scanner; // Creating the scanner.

// define a class
    public class FourDigits{

// add a main method 
    public static void main(String[] args) {
    
    Scanner myScanner;
    myScanner=new Scanner (System.in);
    
    System.out.print("Enter a double and I will print out the first four digits to the right of the decimal "); 
    double f=myScanner.nextDouble();
    int u=(int)(f*10000);   
    int num4=u%10; 
    int num3=(u/10)%10;
    int num2=(u/100)%10; 
    int num1=(u/1000)%10; 
   
   // Uses division and remainder division to get each digit value to the right of the decimal. 
   // Print out the following information. This creates a specific int for each indivudal number.
   
    System.out.println("The four digits are " +num1+ +num2+ +num3+ num4); 
    
    } // end of main method
} // end of class
