/*
 * NetPay.java
 * Author: Elizabeth Turner
 * Submission Date: September 22, 2017
 * 
 * Purpose: To compute the number of months needed to pay
 * pay off credit card debt
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
 * unless you have written consent from the instructor
 */

import java.util.Scanner;
public class CreditCardPayOff {

	public static void main(String[] args) {
		
		double principal;
		double annualInterestRate;
		double monthlyPayment;
		double monthsNeeded;
		int monthsNeededCeiling;
		double totalAmountPaid;
		double totalInterestPaid;
		double overpayment;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the Principal Amount:\t\t");
		principal = keyboard.nextDouble( );
		
		System.out.print("Enter the Annual Interest Rate (%):\t");
		annualInterestRate = keyboard.nextDouble( );
		
		System.out.print("Enter the Monthly Payment:\t\t");	
		monthlyPayment = keyboard.nextDouble( );
		
		double a = Math.log(monthlyPayment);
		double b = Math.log(monthlyPayment-(annualInterestRate/1200.0)*principal);
		double c = Math.log((annualInterestRate/1200.0)+1.0);
		
		monthsNeededCeiling = (int) Math.ceil((a - b)/c);
		monthsNeeded = (a-b)/c;
		totalAmountPaid = monthsNeeded*monthlyPayment;
		totalInterestPaid = totalAmountPaid-principal;
		overpayment = (monthsNeededCeiling * monthlyPayment) - (monthsNeeded * monthlyPayment);
		
	
		System.out.println("\nPrincipal:\t\t\t\t" + principal);
		System.out.println("Annual Interest Rate (%):\t\t" + annualInterestRate);
		System.out.println("Monthly Payment:\t\t\t" + monthlyPayment + "\n");
		
		System.out.print("Months Needed To Pay Off:\t\t" + monthsNeededCeiling + "\n");
		System.out.print("Total Amount Paid:\t\t\t" + "$");
		System.out.printf("%.2f", totalAmountPaid);
		System.out.println("");
		System.out.print("Total Interest Paid:\t\t\t" + "$");
		System.out.printf("%.2f", totalInterestPaid);
		System.out.println("");
		System.out.print("Overpayment:\t\t\t\t" + "$");
		System.out.printf("%.2f", overpayment);
		
		
		
		

	}

}
