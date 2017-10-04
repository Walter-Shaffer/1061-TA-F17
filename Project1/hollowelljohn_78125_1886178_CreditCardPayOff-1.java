/**
* CreditCardPayoff.java
* @author John Hollowell
* Submission Date: 
*
* Purpose: This program—given the principal, APR, and monthly payment—will
*	calculate the number of months required to pay off the debt, the total
*	amount paid, the total amount of interest paid, and the amount paid over
*	the mathematical payment end (due to paying in whole month increments).
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

	public static void main(String[] args) {


		// Use Scanner to ingest user values from Stdin
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Principal:\t\t\t");
		double principal = inputScanner.nextDouble();
		System.out.print("Annual Interest Rate (%):\t");
		double apr = inputScanner.nextDouble();
		System.out.print("Monthly Payment:\t\t");
		double monthlyPayment = inputScanner.nextDouble();
		inputScanner.close();

		// Complete the calculations and store in variables
		double numMonths = (Math.log(monthlyPayment) - Math.log(monthlyPayment - (apr / 1200.0) * principal)) / (Math.log((apr / 1200.0) + 1.0)); // number of months needed to pay off debt
		int numMonthsCeil = (int) Math.ceil(numMonths); // the integer of the number of months (ceiling)
		double total = numMonthsCeil * monthlyPayment; // the total amount of money paid
		double interest = total - principal;
		// Overpayment = (integer months x monthly payment) - (floating months x monthly
		// payment)
		double overpay = (numMonthsCeil * monthlyPayment) - (numMonths * monthlyPayment);


		System.out.printf("\nMonths Needed To Pay Off:\t%d\n", numMonthsCeil);
		System.out.printf("Total Amount Paid:\t\t$%.2f\n", total);
		System.out.printf("Total Interest Paid:\t\t$%.2f\n", interest);
		System.out.printf("Overpayment:\t\t\t$%.2f\n", overpay);

	}


}
