/*
* ParseTheTweet.java
* Author: Karmen Brooks
* Submission Date: 9/22/17
*
* Purpose: Calculates number of months needed to repay credit card debt.
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
public class CreditCardPayoff {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Prompt user to enter Principal, Annual Interest, and Monthly Payment
		
		System.out.print("Principal: " + "\t" + "\t" + "\t");
			double Principal = input.nextDouble();
		System.out.print("Annual Interest Rate (%):" + "\t");
			double annualinterestRate = input.nextDouble();
		System.out.print("Monthly Payment:" + "\t" + "\t");
			double monthlyPayment = input.nextDouble();
	
		
		//Calculate number of months, total amount, and total interest
			
		double NUMBER_OF_MONTHS;
		double TOTAL_AMOUNT;
		double TOTAL_INTEREST;
		double OVERPAYMENT;
		
		//
		
		NUMBER_OF_MONTHS = (Math.log(monthlyPayment) -
				Math.log(monthlyPayment - (annualinterestRate/1200.0) * Principal)) /
				(Math.log((annualinterestRate/1200.0)+1.0));
		
		TOTAL_AMOUNT = Math.ceil(NUMBER_OF_MONTHS) * monthlyPayment;
		TOTAL_INTEREST = (TOTAL_AMOUNT - Principal);
		
		/*Subtract the actual amount paid (Total Amount Paid) from the amount that was
		 *supposed to be paid (Monthly Payment * Number of months taken to pay it off)
		 */
	
		OVERPAYMENT = TOTAL_AMOUNT - (monthlyPayment * NUMBER_OF_MONTHS);
		
		//
		
		System.out.println("");
		System.out.println("Months Needed To Pay Off:" + "\t" + Math.ceil(NUMBER_OF_MONTHS));
		System.out.println("Total Amount Paid:" + "\t" + "\t" + "$" + Math.round(TOTAL_AMOUNT * 100.0)/100.0);
		System.out.println("Total Interest Paid:" + "\t" + "\t" + "$" + Math.round(TOTAL_INTEREST * 100.0)/100.0);
		System.out.println("Overpayment:" + "\t" + "\t" + "\t" + "$" + Math.round(OVERPAYMENT * 100.0)/100.0);

	}

}
