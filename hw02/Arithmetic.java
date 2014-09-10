////////////////////
// Joanna Targowski
// Arithmetic Java Program
// Purpose: To compute the cost of the items that I purchased at walmart with the PA sales tax included.
//
//  first compile program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic//

//  define a class
public class Arithmetic{
    
//  add main method
    public static void main (String[] args) {
    int nSocks=3; // The number of pairs of socks.
    double sockCost$=2.58; // The cost per pairs of socks. ('S' is part of the variable name)
    double totalSockCost$=7.74; // The total cost of socks.
    int nGlasses=6; // The number of drinking glasses.
    double glassCost$=2.29; // The cost per glass.
    double totalGlassCost$=13.74; // The total cost of drinking glasses.
    int nEnvelopes=1; // The number of boxes of envelopes.
    double envelopeCost$=3.25; // The cost of each box of envelopes.
    double totalEnvelopeCost$=3.25; // The total cost of the boxes of envelopes.
    double taxPercent=0.06; // The PA sales tax.
    double totalCost, totalSalesTax;
    
    System.out.println("The cost of one sock is " +(sockCost$)+".");
    System.out.println("The cost of one drinking glass "+(glassCost$)+".");
    System.out.println("The cost of one box of envelopes is "+(envelopeCost$)+".");
    System.out.println("The total cost of socks without tax was "+(totalSockCost$)+".");
    System.out.println("The total cost of drinking glasses without tax was "+(totalGlassCost$)+".");
    System.out.println("The total cost of envelopes without tax was "+(totalEnvelopeCost$)+".");
    System.out.println("The total cost is "+(totalSockCost$+totalGlassCost$+totalEnvelopeCost$)+".");
    System.out.println("The total sales tax is "+(totalSockCost$*taxPercent+totalGlassCost$*taxPercent+totalEnvelopeCost$*taxPercent)+".");
    
    totalCost=totalSockCost$+totalGlassCost$+totalEnvelopeCost$; //The total cost of items.
    totalSalesTax=totalSockCost$*taxPercent+totalGlassCost$*taxPercent+totalEnvelopeCost$*taxPercent; // The total sales tax.

    System.out.println("The total cost of items with tax "+(totalCost+totalSalesTax)+".");
    
    }
    
}