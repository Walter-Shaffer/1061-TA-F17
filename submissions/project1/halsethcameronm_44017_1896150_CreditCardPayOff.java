/*
 * CreditCardPayOff.java
 * Author: Cameron Halseth
 * Submission Date: 9/22/2017
 * 
 * Purpose: The purpose of this program is to apply knowledge of variables,
 * assignments, expressions, type casting, input, output, and basic 
 * algorithm design. This program is used specifically to compute and display
 * the number of months needed to pay off credit card debt, along with further
 * relevant calculations.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither 
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized 
 * assistance or plagiarism will be handed in accordance
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

		Scanner input = new Scanner(System.in);
		
		// Declare variables
		double principal;
		double annualInRate;
		double monthlyPayment;
		double doubMonthNeedPayOff;
		int inMonthNeedPayOff;
		double totAmountPaid;
		double totInPaid;
		double overpayment;
		
		// Prompt user for principal
		System.out.print("Enter a value for principal: ");
		principal = input.nextDouble();
		
		// Prompt user for annual interest rate
		System.out.print("Enter a percent value for annual interest rate: ");
		annualInRate = input.nextDouble();
		
		// Prompt user for monthly payment
		System.out.print("Enter a value for monthly payment: ");
		monthlyPayment = input.nextDouble();
		
		// Calculate individual natural logarithms
		double ln1 = Math.log(monthlyPayment);
		double ln2 = Math.log(monthlyPayment - (annualInRate/1200.0) * principal);
		double ln3 = Math.log((annualInRate/1200.0) + 1.0);
		
		// Perform calculations
		doubMonthNeedPayOff = (ln1 - ln2) / ln3;
		inMonthNeedPayOff = (int)Math.ceil(doubMonthNeedPayOff);
		totAmountPaid = inMonthNeedPayOff * monthlyPayment;
		totInPaid = totAmountPaid - principal;
		
		/* Compute overpayment,
		 * algorithm = raw value for months needed to pay off (floating-point)
		 * subtracted from ceiling of months needed to pay off (integer) and then
		 * multiplied by 100
		 */
		overpayment = (inMonthNeedPayOff - doubMonthNeedPayOff) * 100;
				
		// Produce formatted output
		System.out.println("Principal:\t\t\t" + principal);
		System.out.println("Annual Interest Rate:\t\t" + annualInRate);
		System.out.println("Monthly Payment:\t\t" + monthlyPayment);
		System.out.println("\nMonths Needed To Pay Off:\t" + inMonthNeedPayOff);
		System.out.printf("Total Amount Paid:\t\t$%4.2f", totAmountPaid);
		System.out.printf("\nTotal Interest Paid:\t\t$%4.2f", totInPaid);
		System.out.printf("\nOverpayment:\t\t\t$%2.2f", overpayment);
		
		
	}

}
