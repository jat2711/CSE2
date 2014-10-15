////////////////////
// Joanna Targowski
// Enigma0 Java Program
//
//  first compile the program 
//      javac Enigma0.java
//  run the program 
//      java Enigma0


import java.util.Scanner;

public class Enigma0{
    
  public static void main(String arg []){
     Scanner myScanner; 
     myScanner=new Scanner (System.in);
    
    System.out.print("Enter an int- ");
    
    if(myScanner.hasNextInt()){
      int n=myScanner.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      int n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8,n=myScanner.nextInt();
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  } // end of main method
} // end of class

/* Error report:
 *   Expand this comment:   On line 35 variable n was not intitialized (Had to intialize n therefore I equaled it to the scanner.) 
 *                          Scanner first had to be declared. 
 *   Explain the error(s) that occurred here, and then fix them
 */

