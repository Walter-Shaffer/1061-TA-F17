/*
 * CreditCardPayOff.java
 * Author: John Xue
 * Submission Date: Sept. 21, 2017
 *
 * Purpose: Compute and display the number of months needed to
 * pay off credit card debt, given the principal, annual interest
 * rate, and monthly payments. The program also computes and displays
 * total amount and interest paid, and overpayments.
 *
 * Statement of Academic Honesty:
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized assistance
 * or plagiarism will be handled in accordance with the policies at
 * Clemson University and the policies of this course. I recognize that my
 * work is based on an assignment created by the School of Computing at
 * Clemson University. Any publishing or posting of source code
 * for this project is strictly prohibited unless you have written
 * consent from the instructor.
 */

import java.util.Scanner;

public class CreditCardPayOff {
	public static void main(String[] args) {
		// Gather keyboard input from user
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Principal:\t\t\t");
		double principal = keyboard.nextDouble();
		System.out.print("Annual Interest Rate (%):\t");
		double annualInterestRate = keyboard.nextDouble();		
		System.out.print("Monthly Payment:\t\t");
		double monthlyPayment = keyboard.nextDouble();
		keyboard.close();
		
		// Find the number of months needed to pay off the principal
		// 2 variables needed for exact length of time and nearest ceiling month (in int)
		double monthsNeededD = ( Math.log(monthlyPayment) - Math.log(monthlyPayment - ( annualInterestRate * principal ) / 1200.0) ) / Math.log(annualInterestRate / 1200.0 + 1.0);
		int monthsNeededI = (int) Math.ceil(monthsNeededD);
		
		// Compute the rest of the math based off of the months needed to pay off
		double totalAmountPaid = monthsNeededI * monthlyPayment;
		double totalInterestPaid = totalAmountPaid - principal;
		
		/* Overpayment pseudocode
		 * 1. Find the difference between the ceiling number of the months needed to pay off
		 *    and the exact number of months needed to pay off.
		 * 2. Multiply the output achieved in step 1 with the monthly payment.
		 */
		double overPayment = ( monthsNeededI - monthsNeededD ) * monthlyPayment;
		
		// Print results, rounding the dollar amounts to the nearest cent
		System.out.println("\nMonths Needed to Pay Off:\t" + monthsNeededI);
		System.out.printf("Total Amount Paid:\t\t$%.2f\n", totalAmountPaid);
		System.out.printf("Total Interest Paid:\t\t$%.2f\n", + totalInterestPaid);
		System.out.printf("Overpayment:\t\t\t$%.2f", overPayment);
	}

}
