/*
* NetPay.java
* Author:  Nina Agafonovas
* Submission Date:  September 14, 2017
* Purpose: This program calculates Net Pay as well as tax deductions given the number of hours worked in a week.
* * Statement of Academic Honesty:
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

public class NetPay {

	public static void main(String[] args) {
		double Federal_Tax_Percent = 10.00;
		double State_Tax_Percent = 4.5;
		double Ss_Percent = 6.2;
		double Medicare_Percent = 1.45;
		double Pay_Per_Hour = 7.25;
		int hoursPerWeek;
		double grossPay;
		double netPay;
		double federalTax; 
		double stateTax;
		double medicare;
		double socialSecurity;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of hours per week:");
		int hoursPerWeek1 = keyboard.nextInt();
		grossPay = hoursPerWeek1 * Pay_Per_Hour;
		federalTax = (grossPay * Federal_Tax_Percent)/100;
		stateTax = (grossPay * State_Tax_Percent)/100;
		socialSecurity = (grossPay * Ss_Percent)/100;
		medicare = (grossPay * Medicare_Percent)/100; 
		netPay = grossPay - (federalTax + stateTax + medicare +socialSecurity);
		System.out.println("Hours Per Week:\t" +  hoursPerWeek1);
		System.out.println("Gross Pay: \t" + grossPay);
		System.out.println("Net Pay: \t" + netPay);
		System.out.println("\n\nDeductions");
		System.out.println("Federal: \t" + federalTax);
		System.out.println("State: \t\t" + stateTax);
		System.out.println("Social Security:" + socialSecurity);
		System.out.println("Medicare: \t" + medicare);
	}

}
