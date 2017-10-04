/*
* CreditCardPayOff.java
* Author: Elias Weglarz
* Submission Date: 9/21/17
*
* Purpose: Compute and display the number of months needed to pay
off credit card debt.
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
		
		double PRINCIPAL , ANNUAL_INTEREST_RATE , MONTHLY_PAYMENT , TOTAL_AMOUNT_PAID = 0, TOTAL_INTEREST_PAID , OVERALL_PAYMENT;
		
		double monthsNeededToPay , overpayment;
		int monthsNeeded;
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("What is the principal?");
		PRINCIPAL = keyboard.nextDouble ();
		
		System.out.println("What is the annual interest rate?");
		ANNUAL_INTEREST_RATE = keyboard.nextDouble ();
		
		System.out.println("What is your monthly payment");
		MONTHLY_PAYMENT = keyboard.nextDouble ();
		keyboard.close();
		
		monthsNeededToPay =(Math.log(MONTHLY_PAYMENT)- Math.log(MONTHLY_PAYMENT-(ANNUAL_INTEREST_RATE / 1200.0) * PRINCIPAL)) / Math.log((ANNUAL_INTEREST_RATE / 1200.0) + 1.0);

		monthsNeeded = (int)Math.ceil(monthsNeededToPay);
		
		TOTAL_AMOUNT_PAID = monthsNeeded * MONTHLY_PAYMENT;
		
		TOTAL_INTEREST_PAID = TOTAL_AMOUNT_PAID - PRINCIPAL;
		
		
//		TOTAL_AMOUNT_PAID = Math.ceil(TOTAL_AMOUNT_PAID);
//		TOTAL_INTEREST_PAID = Math.ceil(TOTAL_INTEREST_PAID);

		
		//to calculate overpayment you subtract the months needed ceiling minus the months needed
		// to pay and then multiply that result by the monthly payment
		overpayment = (monthsNeeded - monthsNeededToPay) * MONTHLY_PAYMENT;
		
	
		System.out.println("Principal: \t \t \t" + PRINCIPAL);
		System.out.println("Annual Interest Rate (%): \t" + ANNUAL_INTEREST_RATE);
		System.out.println("Monthly Payment: \t \t" + MONTHLY_PAYMENT);
		System.out.println(" ");
		System.out.println(" ");
		System.out.printf("Months Needed To Pay Off: \t %.0f", monthsNeededToPay);
		System.out.println(" ");
		System.out.printf("Total Amount Paid: \t \t $" + "%.2f", TOTAL_AMOUNT_PAID);
		System.out.println(" ");
		System.out.printf("Total Interest Paid: \t \t $" + "%.2f", TOTAL_INTEREST_PAID);
		System.out.println(" ");
		System.out.printf("Overpayment: \t \t \t $" + "%.2f", overpayment );
		System.out.println(" ");
	
	}
}