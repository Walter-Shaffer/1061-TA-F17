/*
* NetPay.java
* Author: Jay Carl
* Submission Date: 9/13/17
*
* Purpose: Calculates Net pay from Gross pay subtracted by deductions.
* User Inputs amount of hours per week to calculate Gross Pay.
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
	
	public static void main(String[]args){
	
	double Federal_Tax_Percent = 10.00;
	double State_Tax_Percent = 4.5;
	double SS_Percent= 6.2;
	double Medicare_Percent = 1.45;
	double Pay_Per_Hour = 7.25;
	
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Enter a Value for HoursPerWeek: ");
	int HoursPerWeek = keyboard.nextInt();
	
	double grossPay = (HoursPerWeek * Pay_Per_Hour);
	double federalTax = (grossPay * Federal_Tax_Percent)/100;
	double stateTax = (grossPay * State_Tax_Percent)/100;
	double medicare = (grossPay * Medicare_Percent)/100;
	double socialSecurity = (grossPay/SS_Percent)/100;
	double netPay = grossPay - (federalTax + stateTax + medicare + socialSecurity);
	
	System.out.println("Hours Per Week:   " + HoursPerWeek);
	System.out.println("Gross Pay:   " + grossPay);
	System.out.println("Net Pay:   " + netPay);
	
	System.out.println("Deductions");
	System.out.println("Federal:   " + federalTax);
	System.out.println("State:   " + stateTax);
	System.out.println("Social Security:   " + socialSecurity);
	System.out.println("Medicare:   " + medicare);
	
	}

}
