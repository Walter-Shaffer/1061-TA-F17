/*
* NetPay.java
* Author: Karmen Brooks
* Submission Date: 9/16/17
*
* Purpose: This program calculates the net pay of a person based
* on applied tax, hours worked, and pay per hour.
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
			
		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;
		
		Scanner keyboard = new Scanner(System.in);
		int hoursPerWeek;
		System.out.print("Hours Per Week:" + "\t" + "\t");
		hoursPerWeek = keyboard.nextInt();
		
		double grossPay;
		double netPay;
		double federalTax;
		double stateTax;
		double medicare;
		double socialSecurity;
			
			
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federalTax = (grossPay * FEDERAL_TAX_PERCENT) / 100;
		stateTax = (grossPay * STATE_TAX_PERCENT) / 100;
		medicare = (grossPay * MEDICARE_PERCENT) / 100;
		socialSecurity = (grossPay * SS_PERCENT) / 100;
		netPay = grossPay - (federalTax + stateTax + medicare + socialSecurity);
		
		String g="Gross Pay:";
		String n="Net Pay:";
		String f="Federal:";
		String s="State:";
		String ss="Social Security:";
		String m="Medicare:";
		
		System.out.println(g + "\t" +"\t" + grossPay);
		System.out.println(n + "\t" + "\t" + netPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println(f + "\t" + "\t" + federalTax);
		System.out.println(s + "\t" + "\t" +"\t" + stateTax);
		System.out.println(ss + "\t" + socialSecurity);
		System.out.println(m + "\t" + "\t" + medicare);
		

	}

}
