/*
* NetPay.java
* Author: Harrison C Hall
* Submission Date: September 14, 2017
*
* Purpose: This program calculates taxes for various programs and 
* tells the user how much money will be allocated in different places. 
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

public class NetPay {

	public static void main(String[] args) {
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		double grossPay;
		double netPay;
		double federalTax;
		double stateTax;
		double medicare;
		double socialSecurity;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per week: " + "\t");
		int hoursPerWeek = keyboard.nextInt();
		
		
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federalTax = (grossPay * FEDERAL_TAX_PERCENT) / 100;
		stateTax = (grossPay * STATE_TAX_PERCENT) / 100;
		socialSecurity = (grossPay * SS_PERCENT) / 100;
		medicare = (grossPay * MEDICARE_PERCENT) / 100;
		netPay =  grossPay - (federalTax + stateTax + medicare + socialSecurity);
		
		System.out.println("Gross Pay: " + "\t" + "\t" + grossPay);
		System.out.println("Net Pay: " + "\t" + "\t" + netPay + "\n");
		
		
		System.out.println("Deductions");
		System.out.println("Federal tax: " + "\t" + "\t" + federalTax);
		System.out.println("State tax: " + "\t" + "\t" + stateTax);
		System.out.println("Social Security:" + "\t" + socialSecurity);
		System.out.println("Medicare: " + "\t" + "\t" + medicare);
	}
	
}
