/*CreditCardPayOff.java


 * Zachary Smith
 * 9-19-17
 * This program takes a user inputed principal, annual 
 * interest rate, and monthly payment to find out the full
 * amount of months needed to pay everything off, the total
 * amount of money paid, the total amount of interest paid,
 * and the overpayment.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not 
 * copied or modified code from any other source other than 
 * the course webpage or the course textbook. I recognize that 
 * any unauthorized assistance or plagiarism will be handled in
 * accordance with the policies at Clemson University and the
 * policies of this course, I recognize that my work is based
 * on an assignment created by the School of Computing at 
 * Clemson University. Any publishing or posting of source
 * code for this project is strictly prohibited unless
 * you have written consent from the instructor.
 * 
 */

import java.util.Scanner;

public class CreditCardPayOff {

	public static void main(String[] args) {
		
		double principal, annualInterestRate, monthlyPayment, totalAmountPaid, totalInterestPaid, overPayment, lnMonthlyPay, lnSubtract, numerator, denominator, monthsNeeded, ceilingMonths;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("What is your principal?\t\t\t");
		
		principal = input.nextDouble();
		
		System.out.printf("What is your Annual Interest Rate?\t");
		
		annualInterestRate = input.nextDouble();
		
		System.out.printf("What is your monthly payment?\t\t");
		
		monthlyPayment = input.nextDouble();
		
		lnMonthlyPay = Math.log(monthlyPayment);
		
		lnSubtract = Math.log(monthlyPayment - (annualInterestRate / 1200.0) * principal);
		
		numerator = (lnMonthlyPay - lnSubtract);
		
		denominator = Math.log((annualInterestRate / 1200.0) + 1.0);
		
		monthsNeeded = numerator / denominator;
		
		ceilingMonths = Math.ceil(monthsNeeded);
		
		int roundedMonths = (int) ceilingMonths;
		
		totalAmountPaid = roundedMonths * monthlyPayment;
		
		totalInterestPaid = totalAmountPaid - principal;
		
		/* Pseudocode for OverPayment:
		 * 
		 * The rounded number of months needed to pay off the debt
		 * subtracted by the exact number of months needed to pay
		 * off the debt. This is then multiplied by the monthly 
		 * payment the user inputed to get the overpayment.
		 */
		
		overPayment = (ceilingMonths - monthsNeeded) * monthlyPayment;
		
		System.out.printf("Principal:\t\t\t\t%.2f\n",  principal);
		System.out.println("Annual Interest Rate (%):\t\t" + annualInterestRate);
		System.out.printf("Monthly Payment:\t\t\t%.2f\n",  monthlyPayment);
		System.out.println("Months Needed to Pay Off:\t\t" + roundedMonths);
		System.out.printf("Total Amount Paid:\t\t\t$%.2f\n", totalAmountPaid);
		System.out.printf("Total Interest Paid:\t\t\t$%.2f\n", totalInterestPaid);
		System.out.printf("Overpayment:\t\t\t\t$%.2f\n", overPayment);
	}

}

