/**
* NetPay.java
* @author John Hollowell
* Submission Date: 09-12-2017
*
* @purpose Given the number of hours worked per week and some constants, this program calculated the different deductions, the gross pay, and the final net pay.
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
package lab2;

import java.util.Scanner;

public class NetPay {

	// Constants
	final static double	FEDERAL_TAX_PERCENT	= 10.00;
	final static double	STATE_TAX_PERCENT	= 4.5;
	final static double	SS_PERCENT			= 6.2;
	final static double	MEDICARE_PERCENT	= 1.45;
	final static double	PAY_PER_HOUR		= 7.25;

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		// Declaring Variable
		int hoursPerWeek;
		double grossPay, netPay, federalTax, stateTax, medicare, socialSecurity;
		Scanner keyboard = new Scanner(System.in);

		// Ingesting data from User
		System.out.print("Hours per Week:\t\t");
		hoursPerWeek = keyboard.nextInt();
		keyboard.close();

		// Calculating and setting Variable Values
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federalTax = (grossPay * FEDERAL_TAX_PERCENT) / 100.0;
		stateTax = (grossPay * STATE_TAX_PERCENT) / 100.0;
		socialSecurity = (grossPay * SS_PERCENT) / 100.0;
		medicare = (grossPay * MEDICARE_PERCENT) / 100.0;
		netPay = grossPay - medicare - stateTax - federalTax - socialSecurity;

		System.out.printf("Gross Pay:\t\t%f\n", grossPay);
		System.out.printf("Net Pay:\t\t%f\n\n", netPay);
		System.out.println("Deductions");
		System.out.printf("Federal:\t\t%f\n", federalTax);
		System.out.printf("State:\t\t\t%f\n", stateTax);
		System.out.printf("Social Scurity:\t\t%f\n", socialSecurity);
		System.out.printf("Medicare:\t\t%f\n", medicare);

	}
}
