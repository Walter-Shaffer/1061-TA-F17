/*
* CreditCardPayOff.java
* Author: Joshua Williams
* Submission Date: 9/18/2017
*
* Purpose: 
* 	The program recieves the values of three variables from the 
* user (The Principal, The Annual Interest Rate, and the Monthly Payment). 
* It then uses those variables to calculate the months needed to pay off 
* the credit card, the total amount paid, the interest paid, and the over payment.
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
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double principal,annualInterestRate, monthlyPayment,monthsToPayOffDouble,totalAmountPaid,totalInterestPaid,overPayment;
		int monthsToPayOffInt;
		
		System.out.print("Principal:\t\t\t");//Prompt the user for principal, annual interest rate, and monthly payment
		principal = keyboard.nextDouble();
		System.out.print("Annual Interest Rate (%):\t");
		annualInterestRate = keyboard.nextDouble();
		System.out.print("Monthly Payment:\t\t");
		monthlyPayment = keyboard.nextDouble();
		keyboard.close();//Closing the scanner, as it is no longer used to avoid the resource leak warning
		
		monthsToPayOffDouble = (Math.log(monthlyPayment)-Math.log(monthlyPayment-((annualInterestRate/1200.0)*principal)))/(Math.log((annualInterestRate/1200.0)+1.0));
		monthsToPayOffInt = (int) Math.ceil(monthsToPayOffDouble);
		totalAmountPaid = monthlyPayment * monthsToPayOffInt;
		totalInterestPaid = totalAmountPaid-principal;//Calculates the variables using the given formulas
		//The over payment would be the Total Amount that you Paid to the Credit Card Company minus the Exact Amount the Credit Card Company Recieved.
		//The Exact Amount the Credit Card Company Recieved would be calculated by multiplying the amount paid monthly by the exact result (not the ceiling) of the months to pay off formula. 
		overPayment = totalAmountPaid-(monthlyPayment*monthsToPayOffDouble);
		
		System.out.println("\nMonths Needed To Pay Off:\t" + monthsToPayOffInt);
		System.out.printf("Total Amount Paid:\t\t$%.2f\n", totalAmountPaid);
		System.out.printf("Total Interest Paid:\t\t$%.2f\n", totalInterestPaid);
		System.out.printf("Overpayment:\t\t\t$%.2f", overPayment);//outputting the variables onto the console in the correct format
	}
}
