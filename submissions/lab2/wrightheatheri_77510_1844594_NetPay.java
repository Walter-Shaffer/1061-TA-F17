/*
* NetPay.java
* Author: Heather Wright
* Submission Date: September 14, 2017
*
* Purpose: The purpose of this program is to compute the gross 
* and net pay a person makes based on their hourly wages.
* This program requests the users input for the number of hours 
* they work per week. It is assumed that the user makes minimum 
* wage: 7.25. It then uses the inputed integer to calculate the your 
* gross pay and net pay per week. It also states the deductions
* you will receive due to federal, state, social, and 
* medicare taxes.
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
	
	public static final double FEDERAL_TAX_PERCENT = 10.00;
	public static final double STATE_TAX_PERCENT = 4.5;
	public static final double SS_PERCENT = 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25;
	
	public static void main(String[] args) {
		
		
		
		int hoursPerWeek;
		
		double grossPay;
		double netPay;
		double federalTax;
		double stateTax;
		double medicare;
		double socialSecurity;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter an integer value for the number of hours worked per week:");
		hoursPerWeek = keyboard.nextInt();
		
		
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federalTax = grossPay * FEDERAL_TAX_PERCENT / 100.0;
		stateTax = grossPay * STATE_TAX_PERCENT / 100.0;
		socialSecurity = grossPay * SS_PERCENT / 100.0;
		medicare = grossPay * MEDICARE_PERCENT / 100.0;
		netPay = grossPay - federalTax - stateTax- medicare - socialSecurity;
		
		System.out.println("Hours per Week:\t\t" + hoursPerWeek);
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t\t" + netPay);
		System.out.println(" ");
		System.out.println("Deducation");
		System.out.println("Federal:\t\t\t" + federalTax);
		System.out.println("State:\t\t\t" + stateTax);
		System.out.println("Social Security:\t\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);
		
		keyboard.close();
		
	}

}
