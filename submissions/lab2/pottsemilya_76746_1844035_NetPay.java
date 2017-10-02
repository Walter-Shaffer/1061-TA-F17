/* NetPay.java
  Author: Emily Potts
  Submission Date: September 19, 2017 

  Purpose: This program asks the user for input of hours they work 
  per week and then computes their gross pay and net pay
  after all kinds of tax deductions. 


  Statement of Academic Honesty:

  The following code represents my own work. I have neither
  received nor given inappropriate assistance. I have not copied
  or modified code from any source other than the course webpage
  or the course textbook. I recognize that any unauthorized
  assistance or plagiarism will be handled in accordance
  with the policies at Clemson University and the
  policies of this course. I recognize that my work is based
  on an assignment created by the School of Computing
  at Clemson University. Any publishing or posting
  of source code for this project is strictly prohibited
  unless you have written consent from the instructor. 
 */

import java.util.Scanner;
public class NetPay {

	public static void main(String[] args) {
		
		//Create scanner object
		Scanner keyboard = new Scanner(System.in);
		
		
		//Declared variables for constant tax percents
		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45; 
		double PAY_PER_HOUR = 7.25; 
		
		//Declared variable for user input 
		int hoursPerWeek; 
		
		//Declared variables for values computed 
		double grossPay;
		double netPay;
		double federalTax;
		double stateTax;
		double medicare;
		double socialSecurity; 
		double totalTaxes; 
		
		//ask user for input of hours per week 
		System.out.print("Enter the number of hours per week: ");
		hoursPerWeek = keyboard.nextInt(); 
		
		//Computations for tax values 
		grossPay = hoursPerWeek * PAY_PER_HOUR; 
		federalTax = grossPay * FEDERAL_TAX_PERCENT / 100; 
		stateTax = grossPay * STATE_TAX_PERCENT / 100; 
		socialSecurity = grossPay * SS_PERCENT / 100; 
		medicare = grossPay * MEDICARE_PERCENT /100; 
		
		//Adding together all taxes 
		totalTaxes = federalTax + stateTax + medicare + socialSecurity; 
		//Computing net pay
		netPay = grossPay - totalTaxes; 
		
		//display results
		System.out.println("Hours per Week:\t\t" +  hoursPerWeek);
		System.out.println("Gross Pay:\t\t" +  grossPay);
		System.out.println("Net Pay:\t\t" +  netPay);
		System.out.println("\nDeductions");
		System.out.println("Federal:\t\t" + federalTax);
		System.out.println("State:\t\t\t"+ stateTax);
		System.out.println("Social Security:\t"+ socialSecurity);
		System.out.println("Medicare:\t\t"+ medicare);
		
	}

}
