////////////////////
// Joanna Targowski
// Time Padding Java Program 
// My program prompts the user to enter an positive integer giving the number of seconds that have passed during the day.
// Then it will display the time in conventional form. 
//
//  first compile the program 
//      javac TimePadding.java
//  run the program 
//      java TimePadding

import java.util.Scanner;

//define  class
public class TimePadding{
    
//  add main method 
        public static void main(String[] args) { 
            
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        
        System.out.println("Enter a positive integer giving the number that have passed during the day.");  // Asks the user to enter a positive integer. 
        int totalSec=myScanner.nextInt();
        // Starting calculations. 
        int sec, totalMin, min, hours; // Declaring variables.
        sec=totalSec%60; // Leftover seconds
        totalMin=totalSec/60; // The total minutes.
        min=totalMin%60; // Leftover minutes. 
        hours= totalMin/60; // The amount of hours.
        
        // Print out following statement.

        if (sec<10 && min<10) {
                System.out.println("The time is " +hours+":0" +min+":0"+sec); 
        }
        if (sec<10 && !(min<10)) {
                System.out.println("The time is " +hours+":" +min+":0"+sec); 
        }
        if (!(sec<10) && min<10) {
                System.out.println("The time is " +hours+":0" +min+":"+sec); 
        }
        if (sec>=10 && min>=10) {
                System.out.println("The time is " +hours+":" +min+":"+sec); 
        }
        
} // end of main method 
} // end of class