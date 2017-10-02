/*
* NetPay.java
* Author:  Caroline Ryan
* Submission Date:  September 19, 2017
* Purpose: A brief paragraph description of the * program. What does it do?
* This program takes the hours worked in a week. It multiplies the gross pay by the specfic percent of each deduction from the gross pay. The program then subracts all of the deductions from gross pay to get the net pay. 
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance
* with the policies at Clemson University and the
* policies of this course. I recognize that my work is based
* on an assignment created by the School of Computing
* at Clemson University. Any publishing or posting
* of source code for this project is strictly prohibited
* unless you have written consent from the instructor.
*/

import java.util.Scanner;

public class NetPay{
	public static void main(String[] args) {
		
		/*constants declared and initialized*/
		public final double FEDERAL_TAX_PERCENT = 10.00;
		public final double STATE_TAX_PERCENT = 4.5;
		public final double SS_PERCENT = 6.2;
		public final double MEDICARE_PERCENT = 1.45;
		public final double PAY_PER_HOUR = 7.25;
		
		Scanner keyboard = new Scanner(System.in;
		System.out.print("Enter hours");
		int hoursPerWeek =  keyboard.nextInt();
		
		double grossPay;
		double netPay;
		double federalTax;
		double stateTax;
		double medicare;
		double socialSecurity;
		
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federalTax = (grossPay * FEDERAL_TAX_PERCENT) / 100;
		stateTax = (grossPay * STATE_TAX_PERCENT) / 100;
		socialSecurity = (grossPay * SS_PERCENT) / 100;
		medicare = (grossPay * MEDICARE_PERCENT) / 100;
		netPay = grossPay - (federalTax + stateTax + medicare + socialSecurity);
		
		System.out.print ln("Hours per week:" + hoursPerWeek);
		System.out.print ln("Gross Pay:" + grossPay);
		System.out.print ln("Net Pay:" +  netPay);
		System.out.print ln("Deductions");
		System.out.print ln("Federal:" + federalTax);
		System.out.print ln("State:" +  stateTax);
		System.out.print ln("Social Security:" + socialSecurity);
		System.out.print ln("Medicare:" +  medicare);
		

		
	}
}