/*
 * CreditCardPayOff.java
 * Author: Madison Hammond
 * Submission Date: Sept. 13, 2017
 * 
 * Purpose: Compute and display the number of months 
 * needed to pay off credit card debt
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
 * 
 */

import java.util.Scanner;

public class CreditCardPayOff {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter principal amount:");
		double principal = keyboard.nextDouble();
		
		System.out.println("Enter the annual interest rate:");
		double annualInterestRate = keyboard.nextDouble();
		
		System.out.println("Enter monthly payment:");
		double monthlyPayment = keyboard.nextDouble();
		
		double monthsPayOff1 = (Math.log(monthlyPayment) - Math.log(monthlyPayment - 
								(annualInterestRate/1200.0)*principal))/
								Math.log((annualInterestRate/1200.0)+1.0);
		int monthsPayOff2 = (int)Math.ceil(monthsPayOff1);
		double totalAmount = monthlyPayment * monthsPayOff2;
		double totalInterest = totalAmount - principal;
		double overpay = totalAmount - (monthlyPayment * monthsPayOff1);
		
		System.out.printf("Principal:                 \t%.2f", principal);
		System.out.println(" ");
		System.out.println("Annual Interest Rate (%): \t" + annualInterestRate);		
		System.out.printf("Monthly Payment:           \t%.2f", monthlyPayment);
		System.out.println(" ");
		System.out.println("\nMonths Needed To Pay Off:\t" + monthsPayOff2);
		System.out.printf("Total Amount Paid:         \t$%.2f", totalAmount);
		System.out.println(" ");
		System.out.printf("Total Interest Paid:       \t$%.2f", totalInterest);
		System.out.println(" ");
		System.out.printf("Overpayment:               \t$%.2f", overpay);

	}

}
