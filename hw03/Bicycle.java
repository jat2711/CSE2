////////////////////
// Joanna Targowski
// Bicycle Java Program
// My bicycle cylometer records different types of data.
// The program should calculate the distance traveled during the trip and the average miles per hour. 
//
//  first compile the program 
//      javac Bicycle.java
//  run the program
//      java Bicycle//

import java.util.Scanner;

// define a class
public class Bicycle{
    
//  add main method 
    public static void main(String[] args) {
    
    Scanner myScanner;
    myScanner=new Scanner (System.in);
    
    System.out.print("Enter the number of seconds on a cyclometer:");
    double nSeconds=myScanner.nextDouble();
    System.out.println("Enter the number of counts:");
    int nCounts=myScanner.nextInt();
    double sec=480; // The number of seconds it takes in the cyclometer.
    double counts=1561; // The number of counts in the cyclometer. 
    double wheelDiameter=27.0, // The bicycles wheel diameter.
    PI=3.14159, // The value of pi inorder to calculate the wheel diameter. 
    feetPerMile=5280, // The conversion used to go from feet to miles. 
    inchesPerFoot=12, // The conversion used to go from inches to feet.
    secondsPerMinute=60; // The conversion used to go from seconds to minutes.
    double totalDistance, averageMPH, roundTotalDistance, roundAverageMPH; // The total distance traveled and the average miles per hour.  

    

// (For each count, a rotation of the wheel travels 
//  the diameter in inches times PI)
    
    totalDistance=counts*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Calculates the total distance in miles. 
    averageMPH=totalDistance/(sec/secondsPerMinute/60); // The equation to calculates the average miles per hour of the trip.
    roundTotalDistance=Math.round(100*totalDistance); // The total rounded distance.
    roundAverageMPH=Math.round(100*averageMPH); // The rounded average miles per hour. 

// Print out the output data.                                                               
    System.out.println ("The total distance traveled was "+roundTotalDistance/100+" miles and it took "+(sec/secondsPerMinute)+" minutes.");
    System.out.println ("The average miles per hour was "+roundAverageMPH/100+" miles."); 

    }  // end of main method
} // end of class