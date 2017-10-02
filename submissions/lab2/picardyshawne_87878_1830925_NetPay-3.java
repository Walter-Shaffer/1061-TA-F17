/*
* NetPay.java
* Author: Shawn Picardy
* Submission Date: 9/8/17
*
* Purpose: This program uses the hours per week worked to 
* compute taxes and pay: gross pay, net pay, federal tax, state tax, social security, and medicare. 
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
		
		// Declare named constants of type "double"
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		// Create Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompt user input for hours per week
		System.out.print("Enter number of hours per week: ");
		int hoursPerWeek = input.nextInt();
		
		//Close Scanner Object
		input.close();
		
		// Declare additional "doubles"
		double grossPay = hoursPerWeek * PAY_PER_HOUR;
		double federalTax = (grossPay * FEDERAL_TAX_PERCENT) / 100;
		double stateTax = (grossPay * STATE_TAX_PERCENT) / 100;
		double medicare = (grossPay * MEDICARE_PERCENT) / 100;
		double socialSecurity = (grossPay * SS_PERCENT) / 100;
		double netPay = grossPay - (federalTax + stateTax + medicare + socialSecurity);
		
		// Display output of variables to console
		System.out.println("Hours per Week:\t\t" + hoursPerWeek);
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println("\nDeductions");
		System.out.println("Federal:\t\t" + federalTax);
		System.out.println("State:\t\t\t" + stateTax);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);
		
		
		
	
			
		
		
		
				

	}

}
