/*
* CreditCardPayOff.java
* Author: Heather Wright
* Submission Date: September 22, 2017
*
* Purpose: This program is used to calculate information for a 
* credit card. It prompts the user to input the principal amount, 
* interest rate, and the monthly payment. It then uses this
* information to calculate the number of months needed to 
* pay off the credit card debt. The ceiling number of months
* is then used to calculate the total amount paid to the credit
* card company and the total amount of interest paid. The
* overpayment is calculated using the number of months subtracted
* from the ceiling number of months multiplied by the monthly payment.
* This value represents the extra amount of money that was paid to the
* credit card company as the number of months must be rounded to a 
* whole month.
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
		
		Scanner input = new Scanner(System.in);
		
		int ceilMonthsNeeded;
		
		double monthsNeeded;
		double totalAmountPaid;
		double totalInterestPaid;
		double overpayment;
		
		System.out.print("Principal:\t\t\t");
		double principal = input.nextDouble();
		
		System.out.print("Annual Interest Rate (%):\t");
		double annualInterestRate = input.nextDouble();
		
		System.out.print("Monthly Payment:\t\t\t");
		double monthlyPayment = input.nextDouble();
		
		/* 
		* Algorithm uses the variables which are assigned to the user input 
		* to calculate the number of months needed to pay off the debt
		* monthsNeeded = (ln(monthlyPayment) - ln(monthlyPayment - (annualInterestRate / 1200.0) 
		* * principal))) / ln((annualInterestRate / 1200.0) + 1.0)
		*/
		monthsNeeded = (Math.log(monthlyPayment)
				- (Math.log(monthlyPayment - (annualInterestRate / 1200.0)
					* principal))) / Math.log((annualInterestRate / 1200.0 )
					+ 1.0);
		
		/* 
		* The ceiling method rounds up the months needed to a whole number. 
		* This is then converted to an integer and assigned to the variable 
		* ceilMonthsNeeded
		*/
		ceilMonthsNeeded = (int)Math.ceil(monthsNeeded);
		
		totalAmountPaid = ceilMonthsNeeded * monthlyPayment;
		
		totalInterestPaid = totalAmountPaid - principal;
		
		/* 
		* Overpayment is calculated by the double value for the months needed
		* subtracted from the integer ceiling value for the months needed.
		* This is then multiplied by the monthly payment to calculate the
		* the extra amount of money that the user is paying by rounding 
		* months needed to a whole number
		*/
		overpayment = (ceilMonthsNeeded - monthsNeeded) * monthlyPayment;
		
		System.out.println("");
		System.out.println("Months needed to pay off:\t" + ceilMonthsNeeded);
		System.out.printf("Total Amount Paid:\t\t$%4.2f\n", totalAmountPaid);
		System.out.printf("Total Interest Paid:\t\t$%4.2f\n", totalInterestPaid);
		System.out.printf("OverPayment:\t\t\t$%4.2f\n", overpayment);
		 
		
		input.close();
		
	}
	

}
