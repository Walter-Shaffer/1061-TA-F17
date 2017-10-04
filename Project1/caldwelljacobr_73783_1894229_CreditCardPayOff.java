/*
* CreditCardPayOff.java
* Author: Jacob Caldwell
* Submission Date: 09/22/2017
*
* Purpose: Calculate how long it will take to pay off a payment
* depending on a given principal, annual interest rate, and monthly
* payment.
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
		Scanner response = new Scanner(System.in);
		double principal;
		double annualInterestRate;
		double monthlyPayment;
		double monthsNeededGross;
		double totalAmountPaid;
		double totalInterestPaid;
		double overpayment;
		
		System.out.println("What is your principal?");
		principal = response.nextDouble();
		
		System.out.println("What is your annual interest rate (%)?");
		annualInterestRate = response.nextDouble();
		
		System.out.println("What is your monthly payment?");
		monthlyPayment = response.nextDouble();
		
		monthsNeededGross = (Math.log(monthlyPayment) - (Math.log(monthlyPayment - (annualInterestRate / 1200.0) * principal))) / 
				Math.log((annualInterestRate / 1200.0) + 1.0); 
		// Function to create the raw amount of months required to pay off the credit card without raising the ceiling
		
		double monthsNeededRaw = Math.ceil(monthsNeededGross);
		// monthsNeededGross is the exact value and monthsNeededRaw is the upper ceiling of that value
		int monthsNeeded = (int) monthsNeededRaw;
		// This is used to convert the double value to an integer
		
		totalAmountPaid = monthsNeededRaw * monthlyPayment;
		totalInterestPaid = totalAmountPaid - principal;
		// This overpayment equation subtracts the amount that is owed from the amount paid
		overpayment = totalAmountPaid - (monthsNeededGross * monthlyPayment);
		
		totalAmountPaid = Math.round(totalAmountPaid * 100);
		totalAmountPaid = totalAmountPaid / 100;
		totalInterestPaid = Math.round(totalInterestPaid * 100);
		totalInterestPaid = totalInterestPaid /100;
		overpayment = Math.round(overpayment * 100.00) / 100.00;
		/* This equation allows the totalAmountPaid, totalInterestPaid, and verpayment values to round to the nearest 
		 * hundreths place by multiplying it by 100, rounding it, then dividing it by 100 */
		
		//printf function used to make the double variables that are currency precisely 2 decimal places
		System.out.printf("Principal: \t \t \t%1.2f" , principal);
		System.out.println("");
		System.out.println("Annual Interest Rate (%): \t" + annualInterestRate);
		System.out.printf("Monthly Payment: \t \t%1.2f" , monthlyPayment);
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Months Needed To Pay Off: \t" + monthsNeeded);
		System.out.printf("Total Amount Paid: \t \t$%1.2f" , totalAmountPaid);
		System.out.println("");
		System.out.printf("Total Interest Paid: \t \t$%1.2f" , totalInterestPaid);
		System.out.println("");
		System.out.printf("Overpayment: \t \t \t$%1.2f" , overpayment);
		
	}

}
