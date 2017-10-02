
/*
* NetPay.java
* Author: Daniel Christensen
* Submission Date: 9/19/2017
*
* Purpose: This code determines the net pay recieved after taxes, which is dependent upon the number of hours worked.
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
		
		Scanner keyboard = new Scanner(System.in);
		int hoursPerWeek;
		System.out.println("Please enter the number of hours worked:");
		hoursPerWeek = keyboard.nextInt();
		
		final double FEDERAL_TAX_PERCENT = 10;
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
		
		grossPay = PAY_PER_HOUR * hoursPerWeek;
		federalTax = grossPay*FEDERAL_TAX_PERCENT/100;
		stateTax = grossPay*STATE_TAX_PERCENT/100;
		medicare = grossPay*MEDICARE_PERCENT/100;
		socialSecurity = grossPay*SS_PERCENT/100;
		
		netPay = grossPay - federalTax - stateTax - medicare - socialSecurity;
		
		System.out.println("Hours Per Week:\t\t" + hoursPerWeek);
		System.out.println("Gross Pay:\t\t"  + grossPay);
		System.out.println("Net Pay:" + netPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federalTax);
		System.out.println("State:\t\t\t" + stateTax);
		System.out.println("Medicare:\t\t" + medicare);
		System.out.println("Social Security:\t" + socialSecurity);

	}

}


