/*
* NetPay
* Author: Jeffrey Wang
* Submission Date: 9/12/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
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
		//variables
		double FEDERAL_TAX_PERCENT, STATE_TAX_PERCENT, SS_PERCENT,
		MEDICARE_PERCENT, PAY_PER_HOUR, grossPay, netPay, federalTax,
		stateTax, medicare, socialSecurity; int hoursPerWeek; 
		//assignments
		FEDERAL_TAX_PERCENT = 10;
		STATE_TAX_PERCENT = 4.5;
		SS_PERCENT = 6.2;
		MEDICARE_PERCENT = 1.45;
		PAY_PER_HOUR = 7.25;
		hoursPerWeek = 40;
		grossPay = hoursPerWeek*PAY_PER_HOUR;
		federalTax = (grossPay*FEDERAL_TAX_PERCENT)/100;
		stateTax = (grossPay*STATE_TAX_PERCENT)/100;
		socialSecurity = (grossPay*SS_PERCENT)/100;
		medicare = (grossPay*MEDICARE_PERCENT)/100;
		netPay = grossPay - (federalTax + stateTax + medicare + socialSecurity);
		//Scanner stuffs
		Scanner keyboard = new Scanner(System.in);
		System.out.println("To the nearest whole number, how many hours did you work this week?");
		hoursPerWeek = keyboard.nextInt();
		//print outs
		System.out.println("Hours per Week:\t\t" + hoursPerWeek);
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federalTax);
		System.out.println("State:\t\t\t" + stateTax);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);
	}

}
