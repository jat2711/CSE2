////////////////////
//Joanna Targowski
//Cyclometer Java Program
//My bicycle cyclometer records two kinds of data and the program should the distance and amount of time it takes for each trip.
//
//  first compile program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//

//  define a class
public class Cyclometer{
    
//  add main method
    public static void main(String[] args) {
    int secsTrip1=480; // The amount of seconds it takes for Trip 1.
    int secsTrip2=3220; // The amount od seocnds it takes for Trip 2.
    int countsTrip1=1561; // The amount of counts it takes for Trip 1.
    int countsTrip2=9037; // The amount of counts it takes for Trip 2.
    double wheelDiameter=27.0, // The bicycles wheel diameter. 
    PI=3.14159, // The value of pi inorder to calucate the diamater.
    feetPerMile=5280, // The conversion used to go from feet to miles.
    inchesPerFoot=12, // The conversion used to go from inches to feet.
    secondsPerMinute=60; // The conversion used to go from seconds to minutes.
    double distanceTrip1, distanceTrip2,totalDistance; // The distance traveled.
    
    System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.") ;
    System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and has "+countsTrip2+" counts.") ;
    

// (For each count, a rotation of the wheel travels
//the diamater in inches times PI)
distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Gives distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;
//Print out the output data.
System.out.println ("Trip 1 was "+distanceTrip1+" miles") ;
System.out.println ("Trip 2 was "+distanceTrip2+" miles") ;
System.out.println ("The total distance was "+totalDistance+" miles") ;
    }
}
