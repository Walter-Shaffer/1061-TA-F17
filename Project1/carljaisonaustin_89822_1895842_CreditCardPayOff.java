/*
* CreditCardPayoff.java
* Author: Jay Carl
* Submission Date: 9/21/2017
*
* Purpose: Calculates the the current payment of a credit card to see its interest levels, whether or not more money is owed, and whether or not the bill is overpayed.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance
* with the policies at Clemson University and the
* policies of this course. I recognize that my work is based
* on an assignment created by the School of Computing
* at Clemson University. Any publishing or posting
* of source code for this project is strictly prohibited
* unless you have written consent from the instructor.
*/

 import java.util.Scanner;
 
public class CreditCardPayOff {
 
	public static void main(String[]args){
	Scanner leScanner = new Scanner(System.in); // Creates an input variable
	
 
	System.out.println("Please enter Principal: ");
	double principal = leScanner.nextDouble();
	System.out.println("Please enter Annual Interest Rate (%): ");
	double annualInterestRate = leScanner.nextDouble();
	System.out.println("Please enter Monthly Payment");
	double monthlyPayment = leScanner.nextDouble();
	// Creates variables based on an input
	
	double var1 = (Math.log(monthlyPayment)-Math.log(monthlyPayment-(annualInterestRate/1200.00*principal)))/Math.log((annualInterestRate/1200.00)+1.0);
    // raw number for the required amount of months to pay off the bill
	
    double var2 = Math.ceil(var1);
	//converts raw number of months into an integer of the next highest whole number
    
    double MonthsNeededtoPayOff = var2;
	//sets Months needed to pay off equal to the rounded integer 
    
    //formulas for acquiring total amounts payed and total interest payed
	double totalAmountPayed = (var2 * monthlyPayment);
	double totalInterestPayed = (totalAmountPayed - principal);
	
	
	//Subtracts the rounded version of monthlyPayment by the unrounded version of monthlyPayment
	double overPayment = (var2 * monthlyPayment) - (var1 * monthlyPayment);
	
	
			//output of Inputs
	System.out.println("Principal: \t \t \t" + " " + principal);
	System.out.println("annualInterestRate (%) : \t" + " " + annualInterestRate);
	System.out.println("monthlyPayment: \t\t" + " " + monthlyPayment);
	System.out.println(" ");
	System.out.println("Months Needed To Pay Off:\t " + MonthsNeededtoPayOff);
	System.out.printf("Total Amount Paid:\t\t $%.2f " , totalAmountPayed);
	System.out.printf("\nTotal Interest Paid:\t\t $%.2f " , totalInterestPayed);
	System.out.printf("\nOverPayment: \t \t  \t $%.2f " , overPayment);
	
	}
}
