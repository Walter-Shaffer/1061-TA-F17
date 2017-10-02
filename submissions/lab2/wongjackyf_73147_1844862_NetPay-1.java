/*
 * NetPay.java
 * Author: Jacky Wong
 * Submission Date: 9/14/17
 * 
 * Purpose: This is a program that computes a person's gross and net
 * pay, given their hourly wage, hours worked, and several withholdings.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance
 * with the policies at Clemson university and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the School of Computing
 * at Clemson University. Any publishing or posting
 * of source code for this project is strictly prohibited
 * unless you have written consent from the instructor.
 */

import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		// Create input
		Scanner keyboard = new Scanner(System.in);
		
		// Ask for input
		System.out.print("Hours per Week: " + "\t");
		int hoursPerWeek;
		hoursPerWeek = keyboard.nextInt();
		
		// Close keyboard
		keyboard.close();
		
		// Declare variables
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		double grossPay, netPay, federalTax, stateTax, medicare, socialSecurity;
		
		// Compute variables
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federalTax = (grossPay * FEDERAL_TAX_PERCENT) / 100;
		stateTax = (grossPay * STATE_TAX_PERCENT) / 100;
		socialSecurity = (grossPay * SS_PERCENT) / 100;
		medicare = (grossPay * MEDICARE_PERCENT) / 100;
		netPay = grossPay - federalTax - stateTax - medicare - socialSecurity;
		
		// Display results

		System.out.println("Gross Pay: " + "\t" + "\t" + grossPay);
		System.out.println("Net Pay: " + "\t" + "\t" + netPay);
		System.out.println("\n" + "Deductions");
		System.out.println("Federal: " + "\t" + "\t" + federalTax);
		System.out.println("State: " + "\t" + "\t" + "\t" + stateTax);
		System.out.println("Social Security: " + "\t" + socialSecurity);
		System.out.println("Medicare: " + "\t" + "\t" + medicare);

	}

}
