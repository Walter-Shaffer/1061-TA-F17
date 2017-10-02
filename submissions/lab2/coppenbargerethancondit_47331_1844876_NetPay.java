/*
* NetPay.java
* Author: Ethan Coppenbarger
* Submission Date: 9/14/2017
*
* Purpose: Compute gross and net pay from hourly wage, hours worked, and 
* withholdings.
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

// import classes
import java.util.Scanner;

public class NetPay {
	
	
	public static void main(String[] args) {
		// Various constants
		final double FEDERAL_TAX_PERCENT = 10.00; // Federal tax
		final double STATE_TAX_PERCENT = 4.5;     // State tax
		final double SS_PERCENT = 6.2;            // Social security
		final double MEDICARE_PERCENT = 1.45;     // Medicare
		final double PAY_PER_HOUR = 7.25;         // Hourly wage
		
		// declare variables
		int hoursPerWeek;   	   					  // hours worked per week
		
		double grossPay;        					  // amount earned before any tax
		double netPay;         					      // amount earned after tax
		double federalTax;      					  // amount taken by federal taxes
		double stateTax;      					      // amount taken by state taxes
		double medicare;         					  // amount taken by medicare
		double socialSecurity;   					  // amount taken by social security
		
		Scanner keyboard = new Scanner(System.in);	  // get keyboard input
		
		//user input
		System.out.println("Enter number of hours worked per week:");              // ask for hours/week
		hoursPerWeek = keyboard.nextInt();											  // assign input to variable1
		
		// compute variables
		grossPay = hoursPerWeek * PAY_PER_HOUR;                                       // compute gross pay from hours worked and hourly wage
		federalTax = (grossPay * FEDERAL_TAX_PERCENT) / 100;                          // compute amount taken by federal tax
		stateTax = (grossPay * STATE_TAX_PERCENT) / 100;                              // compute amount taken by federal tax
		socialSecurity = (grossPay * SS_PERCENT) / 100;                               // compute amount taken by social security
		medicare = (grossPay * MEDICARE_PERCENT) / 100;                               // compute amount taken by medicare
		netPay = grossPay - federalTax - stateTax - socialSecurity - medicare;        // compute wages after taxes
		
		// print to console
		System.out.println("Hours per Week:\t\t" + hoursPerWeek);
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay + "\n");
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federalTax);
		System.out.println("State:\t\t\t" + stateTax);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);

	}

}
