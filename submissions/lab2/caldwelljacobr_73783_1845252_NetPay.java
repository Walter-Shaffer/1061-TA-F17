/*
 * NetPay.java
 * Author: Jacob Caldwell
 * Submission Date: 
 * 
 * Purpose: Compute a person’s gross and net pay based on their hourly wage, hours
 * worked, and several withholdings.
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

public class NetPay {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;
		int hoursPerWeek = 30;
		double grossPay;
		double netPay;
		double federalTax;
		double stateTax;
		double medicare;
		double socialSecurity;
		
		System.out.println("What is the number of hours worked per week?");
		hoursPerWeek = keyboard.nextInt(); 
		
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federalTax = (grossPay * FEDERAL_TAX_PERCENT) / 100;
		stateTax = (grossPay * STATE_TAX_PERCENT) / 100;
		socialSecurity = (grossPay * SS_PERCENT) / 100;
		medicare = (grossPay * MEDICARE_PERCENT) / 100;
		netPay = grossPay - (federalTax + stateTax + medicare + socialSecurity);
		
		System.out.println("Hours per Week:" + "    " + hoursPerWeek);
		System.out.println("Gross Pay:" + "         " + grossPay);
		System.out.println("Net Pay:" + "           " + netPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal:" + "           " + federalTax);
		System.out.println("State:" + "             " + stateTax);
		System.out.println("Social Security:" + "   " + socialSecurity);
		System.out.println("Medicare:" + "          " + medicare);

	}

}
