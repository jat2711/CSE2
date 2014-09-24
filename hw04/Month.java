////////////////////
// Joanna Targowski
// Month Java Program
// My program will ask the user to enter an integer for the month.
// Then the program will display the number of days in the month.
//
//  first compile the program 
//      javac Month.java
//  run the program 
//      java Month

import java.util.Scanner;

//define  class
public class Month{
    
//  add main method 
        public static void main(String[] args) { 
            
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        
        System.out.println("Enter an int giving the number of the month (1-12) ");   // Check if the integer is entered for the month and it is in the required range.
        
        if (myScanner.hasNextInt()) {
        int nMonth=myScanner.nextInt();
        if (nMonth <1 || nMonth >12) {
                System.out.println("The value entered is not in the range");
                return; // This terminates the program.
        } 
        switch (nMonth) {
                case 1: System.out.println("January has 31 days.");
                        break;
                case 2: System.out.println("Please enter the year");
                        int Year=myScanner.nextInt(); // Declaring the year.
                        if (((Year % 4 == 0) && (Year % 100 != 0)) || (Year % 400 == 0)){
                                System.out.println("In this year February has 29 days.");
                        }               
                        else {
                                System.out.println("In this year February has 28 days."); 
                        }
                        break;
                case 3: System.out.println("March has 31 days.");
                        break;
                case 4: System.out.println("April has 30 days.");
                        break;
                case 5: System.out.println("May has 31 days.");
                        break;
                case 6: System.out.println("June has 30 days.");
                        break;
                case 7: System.out.println("July has 31 days.");
                        break;
                case 8: System.out.println("August has 31 days.");
                        break;
                case 9: System.out.println("September has 30 days.");
                        break;
                case 10: System.out.println("October has 31 days.");
                        break;
                case 11: System.out.println("November has 30 days.");
                        break;
                case 12: System.out.println("December has 31 days.");
                        break;
        
        } // end of the first switch statement
        } //end of the first if statement

        
        
        else {
                System.out.println("You did not enter an int");
                return; // This terminates the program. 
        }
       
} // end of main method 
} // end of class