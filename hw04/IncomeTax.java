////////////////////
// Joanna Targowski
// Income Tax Java Program
// My program prompts the user to enter an int that gives the thousands of dollars of income.
// Then it writes out the amount of tax on the income. 
//
//  first compile the program 
//      javac IncomeTax.java
//  run the program 
//      java IncomeTax

import java.util.Scanner;

//define  class
public class IncomeTax{
    
//  add main method 
        public static void main(String[] args) { 
            
        Scanner myScanner;
        myScanner=new Scanner (System.in);

    System.out.println("Enter an int giving the number of thousands"); // This is asking the user to enter the integer that gives the thousand dollars of income. 
    
    if (myScanner.hasNextInt()) {
        int incomeThousand=myScanner.nextInt();
        int income=incomeThousand*1000; // Will turn the value into dollar amounts. 
             double tax; // Declaring tax.
                
            // The results displayed below is based upon the thousands of dollars of income entered and then the ammount of tax on the income.
                if (income <0) {
                    System.out.println("You did not enter a positive integer."); // This validates that the user did not enter a positive integer.
                    return; // This terminates the program.
                }
                if (income<20) {
                    tax=income*0.05; 
                    System.out.println("The tax rate on " +income+ " is 5%, and the tax is " +(Math.round(tax)*100)/100); 
                }
                
                else if (income >=20 && income <40) {
                    tax=income*0.7;
                    System.out.println("The tax rate on " +income+ " is 7%, and the tax is " +(Math.round(tax)*100)/100); 
                } 
                else if (income >=40 && income<78) {
                    tax=income*0.12;
                    System.out.println("The tax rate on " +income+ " is 12%, and the tax is " +(Math.round(tax)*100)/100);
                }
                else if (income >=78) {
                    tax=income*0.14;   
                    System.out.println("The tax rate on " +income+ " is 14%, and the tax is " +(Math.round(tax)*100)/100);
                } // Else if statement 3.
                } // If statement 1.
                
    else {
        System.out.println("You did not enter a integer."); // This validates that the user did not entered an integer.
    } 

    
} // end of main method 
} // end of class