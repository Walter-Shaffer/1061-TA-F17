/*
 * CreditCardPayOff.java
 * Author: Jacky Wong
 * Submission Date: 9/21/2017
 * 
 * Purpose: This is a program that computes the number of months it takes to pay
 * off credit card debt, given the principal, annual interest rate, and monthly payment by the user.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance
 * with the policies at Clemson university and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the School of Computing
 * at Clemson University. Any publishing or posting
 * of source code for this project is strictly prohibited
 * unless you have written consent from the instructor.
 */

// Import the required input and operation
import java.util.Scanner;
import java.lang.Math;

public class CreditCardPayOff {

	public static void main(String[] args) {
		
		// Create input and input variables
		Scanner keyboard = new Scanner(System.in);
		double principal, annualInterestRate, monthlyPayment;
		
		// Ask for inputs from user
		System.out.print("Principal:" + "\t" + "\t" + "\t");
		principal = keyboard.nextDouble();
		System.out.print("Annual Interest Rate (%):" + "\t");
		annualInterestRate = keyboard.nextDouble();
		System.out.print("Monthly Payment:" + "\t" + "\t");
		monthlyPayment = keyboard.nextDouble();
		keyboard.close();
		
		// Create all other necessary variables
		double monthsNeededToPayOff, totalAmountPaid, totalInterestPaid, overpayment;
		
		// Calculate the months needed to pay off debt
		monthsNeededToPayOff = (Math.log(monthlyPayment) - Math.log(monthlyPayment - (annualInterestRate / 1200.0) * principal)) / (Math.log((annualInterestRate/1200.0) + 1.0));
		int ceilingMonthsNeeded = (int)Math.ceil(monthsNeededToPayOff);
		
		// Calculate the totals paid and overpayment
		totalAmountPaid = monthlyPayment * ceilingMonthsNeeded;
		totalInterestPaid = totalAmountPaid - principal;
		// Overpayment is the difference between the total amount paid with and without the ceiling on the months needed to pay it off
		overpayment = totalAmountPaid - (monthlyPayment * monthsNeededToPayOff);
		
		// Display the results
		System.out.println("\n" + "Months Needed To Pay Off:" + "\t" + ceilingMonthsNeeded);
		System.out.printf("Total Amount Paid:\t\t$%.2f%n", totalAmountPaid);
		System.out.printf("Total Interest Paid:\t\t$%.2f%n", totalInterestPaid);
		System.out.printf("Overpayment: \t\t\t$%.2f%n", overpayment);
		
	}

}
