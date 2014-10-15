////////////////////
// Joanna Targowski
// Roulette Java Program
// My program will use a random number generator and calculate how many times I lose everything, the total amount of winnings, and
// how many times I earn a profit while playing Roulette. 
//
////  first compile the program 
//      javac Roulette.java
//  run the program 
//      java Roulette


//define class
public class Roulette {
    
//  add main method
        public static void main(String[] args) {


    double nPlayer= (int)(Math.random()*38); 
    int num1= 0;
    int num2=0;
    int wins=0;
    int loss=0;
    int profit=0;
    int totalwins=0;
 
 // The amount of times I play the game. 
 
    while (num2<1000) {
    
   // The outcome everytime it spins 100 times. 
  
    while (num1<100) {
        double spin=(int) (Math.random()*38); 
      
        if (nPlayer==spin) {
            wins ++;
          
        } // end of if statement
            num1++; 
    } // end of nested loop 
    
     if (wins>2) {
            totalwins++;
            profit=(-100+(wins*36));
        }
        else if (0<wins && wins<2) {
            profit+=(-100+(wins*36));
        } 
        else if (0==wins) {
            loss++;
            profit-=100;
        }
        
    num2++;
    wins=0; 
   
    } // end of loop
    
   System.out.println("The amount of total wins: " +totalwins);
   System.out.println("The amount of losses: " +loss);
   System.out.println("The total amount of profit: " +profit);
    
    
} // end of main method
} // end of class