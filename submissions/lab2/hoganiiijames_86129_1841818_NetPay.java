import java.util.Scanner;
/*
* NetPay.java
* Author: James Hogan
* Submission Date: 9/13/2017
*
* Purpose: Finds someone's netpay based off their hourly pay, their hours per week, and taxes.
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
public class NetPay 
{
	public static final double FEDERAL_TAX_PERCENT = 10.00;
	public static final double STATE_TAX_PERCENT = 4.5;
	public static final double SS_PERCENT = 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25;
	public static void main (String[] args)
	{
		int hoursPerWeek = 40;
		double grossPay = 0;
		double netPay = 0;
		double federalTax = 0;
		double stateTax = 0;
		double medicare = 0;
		double socialSecurity = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many hours a week do you work?");
		hoursPerWeek = input.nextInt();
		
		grossPay = (hoursPerWeek * PAY_PER_HOUR);
		federalTax = (grossPay * FEDERAL_TAX_PERCENT)/ 100;
		stateTax = (grossPay * STATE_TAX_PERCENT)/100;
		socialSecurity = (grossPay * SS_PERCENT)/100;
		medicare = (grossPay * MEDICARE_PERCENT)/100;
		netPay = (grossPay - federalTax - stateTax - medicare - socialSecurity);
		
		System.out.println("Hours per week: \t" + hoursPerWeek);
		System.out.println("Gross Pay: \t\t" + grossPay);
		System.out.println("Net Pay: \t\t" + netPay + "\n");
		System.out.println("Deductions");
		System.out.println("Federal: \t\t" + federalTax);
		System.out.println("State: \t\t\t" + stateTax);
		System.out.println("Social Security: \t" + socialSecurity);
		System.out.println("Medicare: \t\t" + medicare);
	
	}
}
