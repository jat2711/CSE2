////////////////////
// Joanna Targowski
// Course Number Java Program
// My program will read in a 6 digit number, and will then print out the semester and year. 
//
//  first compile the program 
//      javac CourseNumber.java
//  run the program 
//      java CourseNumber

import java.util.Scanner;

//define  class
public class CourseNumber{
    
//  add main method 
        public static void main(String[] args) { 
            
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        
        System.out.println("Enter a six digit number giving the course semester."); // Asks the user to enter a six digit number.
        int digit=myScanner.nextInt();
        
        if (digit>186510 && digit<201440) {
                
                int digit1=(digit%10);
                int digit2=(digit/10)%10;
                int digit3=(digit/100)%10;
                int digit4=(digit/1000)%10;
                int digit5=(digit/10000)%10;
                int digit6=(digit/100000)%10;
                
        
        if (digit1==0) {
                switch(digit2) {
                        case 1: System.out.println("The course was offered in Spring semester of " +digit6+ +digit5+ +digit4+ +digit3);
                                break;
                        case 2: System.out.println("The course was offered in the Summer 1 semester of " +digit6+ +digit5+ +digit4+ +digit3);
                                break;
                        case 3: System.out.println("The course was offered in the Summer 2 semester of " +digit6+ +digit5+ +digit4+ +digit3);
                                break;
                        case 4: System.out.println("The course was offered in the Fall semester of " +digit6+ +digit5+ +digit4+ +digit3);
                                break;
                                
                } // end of switch statement
        }
        else {
                System.out.println(""+digit1 + digit2 + " is not a legitimate semester.");
                return; // This terminates the program because the number does not repsond to a semester.
        } // end of else statement
        
        } // end of first if statement
       else {
               System.out.println("The number you entered was outside the range.");
                return; // This terminates the program. 
       } // end of else statement
   
        


} // end of main method
} // end of class