/*
* [NetPay].java
* Author: [Anthony Frazier]
* Submission Date: [9/14/17]
*
* Purpose: This program calculates a persons taxes
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
public class netpay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double FEDERAL_TAX_PERCENT;
		final double STATE_TAX_PERCENT;
		final double SS_PERCENT;
		final double MEDICARE_PERCENT;
		final double PAY_PER_HOUR;
		double grossPay;
		double netPay;
		double federalTax;
		double stateTax;
		double medicare;
		double socialSecurity;
		
		
		FEDERAL_TAX_PERCENT = 10.00;
		STATE_TAX_PERCENT = 4.5;
		SS_PERCENT = 6.2;
		MEDICARE_PERCENT = 1.45;
		PAY_PER_HOUR = 7.25;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number of hours per week");
		int hoursPerWeek = input.nextInt();
		System.out.println(hoursPerWeek);
		
		grossPay = hoursPerWeek*PAY_PER_HOUR;
		federalTax = (grossPay*FEDERAL_TAX_PERCENT)/100;
		stateTax = (grossPay*STATE_TAX_PERCENT)/100;
		socialSecurity = (grossPay*SS_PERCENT)/100;
		medicare = (grossPay*MEDICARE_PERCENT)/100;
		netPay = grossPay-federalTax-stateTax-medicare-socialSecurity;
		
		System.out.println("Hours per Week:\t\t" + hoursPerWeek);
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println("\nDeductions");
		System.out.println("Federal: \t\t" + federalTax);
		System.out.println("State: \t\t\t" + stateTax);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);
		
	}

}
