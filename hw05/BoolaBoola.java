////////////////////
// Joanna Targowski
// Boola Boola Java Program
// My program will consist of three boolean variables, combining the values, and asking the user to state the result of the expressions.
//
////  first compile the program 
//      javac BoolaBoola.java
//  run the program 
//      java BoolaBoola

import java.util.Scanner;

//define class
public class BoolaBoola {
    
//  add main method
        public static void main(String[] args) {
                
                String val1; 
                String val2;
                String val3;
                String com;
                String com1;
                
                boolean num1=true;
                boolean num2=true;
                boolean num3=true;
                boolean ans=true;
                
//  Created the string statement that the user sees.

                if(0==(int)(Math.random()*2))
                
                { 
                        val1="false";
                }
                else 
                {
                        val1="true";
                }
                
                  if(0==(int)(Math.random()*2))
                {       
                        val2= "true";
                }
                else 
                {
                        val2="false";
                }
                 
                  if(0==(int)(Math.random()*2))
                {
                        val3="false";
                }        
                else 
                {
                        val3="true";
                }
                 
                  if(0==(int)(Math.random()*2))
                {
                        com="||";
                }
                else 
                {       
                        com="&&";
                }
                 
                  if(0==(int)(Math.random()*2))
                {       com1="&&";
                }
                else 
                {
                        com1="||";
                }
        
        
        System.out.println("Does "+val1+com+val2+com1+val3 +"?");
        
        switch (val1) {
                case "true": num1=true;
                        break;
                case "false": num1=false;
                        break;
        } // end of val1 swtich statement
        
        switch (val2) {
                case "true": num1=true;
                        break;
                case "false": num2=false;
                        break;
        } // end of val2 switch statement
        
        switch (val3) {
                case "true": num3=true;
                        break;
                case "false": num3=false;
                        break;
        } // end of val3 switch statement
        
        switch (com) {
                case "&&": 
                switch (com1) {
                        case"&&": ans=num1&&num2&&num3;
                                break;
                        case "||": ans=num1&&num2||num3;
                                break;
                } // end of com1 switch statement 
                        break;
                        case "||":
                                switch (com1) {
                        case"&&": ans=num1||num2&&num3;
                                break;
                        case "||": ans=num1||num2||num3;
                                break;
        } // end of com1 switch statement (different)
        
        String userans;
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        
        userans=myScanner.next();
        int answer;
        
        if(ans)
        {
                answer=1;
        }
        else
        {
                answer=0;
        }
        
        switch (answer) {
                case 1:
        
        switch(userans) {
                default: System.out.println("Wrong. Try again.");
                                break;
                case "t": 
                case "T": 
                  System.out.println("Correct.");
                        break;
                case "f":
                case "F":
                  System.out.println("Wrong. Try again.");
                        break;
          
        } break;
        
          case 0:
                  switch(userans) {
                        default: System.out.println("Wrong. Try again.");
                                break;
                        case "t": 
                        case "T": 
                                System.out.println("Wrong.Try again.");
                                        break;
                        case "f":
                        case "F":
                                System.out.println("Correct.");
                                        break;
          
        } break;
        } // end of answer switch statement

        } // end of main method
} // end of class
}