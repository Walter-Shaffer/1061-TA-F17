/*
 * CreditCardPayOff.java
 * Author: Mitchell Lamb
 * Submission Date: 9/22/2017
 * 
 * Purpose: The purpose of this program is to compute and display the number of months
 * needed to pay off credit card debt after prompting the user for the principal,
 * the annual interest rate, and the monthly payment.
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
		
		double principal;
		double annualInterestRate;
		double monthlyPayment;
		double monthsNeededRaw;
		Double ceiling;
		int monthsNeeded;
		double totalAmount;
		double totalInterest;
		double overpayment;
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Principal:\t\t\t");
		principal = userInput.nextDouble();
		System.out.print("Annual Interest Rate (%):\t");
		annualInterestRate = userInput.nextDouble();
		System.out.print("Monthly Payment:\t\t");
		monthlyPayment = userInput.nextDouble();
		userInput.close();
		
		monthsNeededRaw = Math.log(monthlyPayment-(annualInterestRate/1200.0)*principal);
		monthsNeededRaw = Math.log(monthlyPayment)-monthsNeededRaw;
		monthsNeededRaw = monthsNeededRaw / Math.log((annualInterestRate/1200.0)+1.0);
		ceiling = Math.ceil(monthsNeededRaw);
		monthsNeeded = ceiling.intValue(); // Used ceiling as a Double so I could convert to an int value
		System.out.println("\nMonths Needed To Pay Off:\t" + monthsNeeded);
		
		totalAmount = monthsNeeded * monthlyPayment;
		totalInterest = totalAmount - principal;
		
		// Overpayment is equal to the rounded amount of months needed to pay off the debt
		// times the monthly payment, minus the actual amount of months needed to 
		// pay off the debt times the monthly payment.
		overpayment = (monthsNeeded * monthlyPayment)-(monthsNeededRaw * monthlyPayment);
		
		System.out.printf("Total Amount Paid:\t\t$%.2f%n",totalAmount);
		System.out.printf("Total Interest Paid:\t\t$%.2f%n",totalInterest);
		System.out.printf("Overpayment:\t\t\t$%.2f%n",overpayment);

	}

}


