/* 
 *  CreditCardPayOff.java
 *  Author:  Monica Hart
 *  Submission Date:  9/14/2017
 *
 *  Purpose: This program computes the number of months needed
 *  to pay off an amount of credit card debt entered as well as
 *  the total amount paid after that number of months, total 
 *  interes paid after that number of months, and amount of 
 *  overpayment.
 *  
 *  Statement of Academic Honesty:
 *  
 *  The following code represents my own work. I have neither
 *  received nor given inappropriate assistance. I have not copied
 *  or modified code from any source other than the course webpage
 *  or the course textbook. I recognize that any unauthorized
 *  assistance or plagiarism will be handled in accordance
 *  with the policies at Clemson University and the
 *  policies of this course. I recognize that my work is based
 *  on an assignment created by the School of Computing
 *  at Clemson University. Any publishing or posting
 *  of source code for this project is strictly prohibited
 *  unless you have written consent from the instructor.   
 */

import java.util.Scanner;

public class CreditCardPayOff {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//user prompts
		System.out.print("Principal:\t\t\t");
		double principal = input.nextDouble();
		System.out.print("Annual Interest Rate (%):\t");
		double interestRate = input.nextDouble();
		System.out.print("Monthly Payment:\t\t");
		double monthlyPayment = input.nextDouble();
		
		//months needed to pay off debt 
		double monthsNeededExact = (Math.log(monthlyPayment)-Math.log(monthlyPayment - 
		(interestRate / 1200.0) * principal)) / Math.log((interestRate / 1200.0) + 1.0);
		int monthsNeeded = (int)Math.ceil(monthsNeededExact);
		
		//total amount paid
		double amount = monthsNeeded * monthlyPayment;
		
		
		//total interest paid
		double interest = amount - principal;
		
		//overpayment
		//total amount paid - (monthly payment * the exact # of months needed not in integer form)
		double overpayment = amount - (monthlyPayment * monthsNeededExact);
		
		//results
		System.out.println("\nMonths Needed To Pay Off:\t" + monthsNeeded);
		System.out.printf("Total Amount Paid:\t\t$%1.2f\n", amount);
		System.out.printf("Total Interest Paid:\t\t$%1.2f\n", interest);
		System.out.printf("Overpayment:\t\t\t$%1.2f", overpayment);
	}

}
