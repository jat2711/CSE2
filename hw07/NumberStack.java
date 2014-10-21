////////////////////
// Joanna Targowski
// Number Stack Java Program
// My program will prompt the user to enter an integer betwen 1 and 9.
// Then it will print out specific dsiplays that depend on the integer entered.
////  first compile the program 
//      javac NumberStack.java
//  run the program 
//      java NumberStack

import java.util.Scanner;

//define class
public class NumberStack {
    
//  add main method
        public static void main(String[] args) {

    Scanner myScanner;
    myScanner=new Scanner (System.in);
    
         System.out.println("Enter a number between 1 and 9");
         
            int x=myScanner.nextInt();
            int c;
            int i;
        for (x=1; x<10; x++) {
           System.out.println("-"); 
                for(c=0;c<x;c++){
                    System.out.println(+x);
            }
            //for (i=1;i<c;i++)
                        //System.out.println(+c);
            
        } // end of for loop
} // end of main method
}// end of public class