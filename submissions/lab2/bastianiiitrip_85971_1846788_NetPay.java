/*
* CPSC-1060.java
* Author: Trip Bastian
* Submission Date: September 14, 2017
*
* Purpose: To calculate the gross and net pay received after taxes 
*          have already been calculated. 
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
		//Declaring initial tax rates
		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;
		//Output1
		System.out.println("------------------------------");
		System.out.println("----------Overview------------");
		System.out.println("------------------------------");
		System.out.print("Hours per Week:\t\t");
		//Input how many hours worked
		Scanner keyboard=new Scanner(System.in);
		int hoursPerWeek = keyboard.nextInt();
		//Computing calculations
		double grossPay = hoursPerWeek*PAY_PER_HOUR;
		double federalTax = grossPay*FEDERAL_TAX_PERCENT/100;
		double stateTax = grossPay*STATE_TAX_PERCENT/100;
		double socialSecurity = grossPay*SS_PERCENT/100;
		double medicare = grossPay*MEDICARE_PERCENT/100;
		double netPay = grossPay - medicare - socialSecurity - stateTax - federalTax;
		//Output2
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println("------------------------------");
		System.out.println("----------Deductions----------");
		System.out.println("------------------------------");
		System.out.println("Federal:\t\t" + federalTax);
		System.out.println("State:\t\t\t" + stateTax);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);
	}
}