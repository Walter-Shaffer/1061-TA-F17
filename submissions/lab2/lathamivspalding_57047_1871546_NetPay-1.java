
/*
* NetPay.java
* Author: Spalding Latham
* Submission Date: [9/13/2017]
*
* Purpose: This program calculates the actual pay you recieve from your 
* job by subtracting out taxes.
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
	
	

		
	double FEDERAL_TAX_PERCENT;
    double STATE_TAX_PERCENT;
	double SS_PERCENT;
	double MEDICARE_PERCENT;
	double PAY_PER_HOUR;
	
	double grossPay;
	double netPay;
	double federalTax;
	double stateTax;
	double medicare;
	double socialSecurity;
	
	int hoursPerWeek;
	hoursPerWeek = 40;
	
	Scanner keyboard= new Scanner(System.in);	
	
	System.out.print("Enter the number of hours per week:");
	hoursPerWeek = keyboard.nextInt();
	
	
		
	
	FEDERAL_TAX_PERCENT = 10.00;
	STATE_TAX_PERCENT = 4.5;
	SS_PERCENT = 6.2;
	MEDICARE_PERCENT = 1.45;
	PAY_PER_HOUR = 7.25;
	
	
	grossPay = hoursPerWeek * PAY_PER_HOUR;
	federalTax = (grossPay * FEDERAL_TAX_PERCENT)/ 100;
	stateTax = (grossPay * STATE_TAX_PERCENT)/ 100;
	socialSecurity = (grossPay * SS_PERCENT) / 100;
	medicare = (grossPay * MEDICARE_PERCENT) / 100;
	netPay = grossPay - (federalTax + stateTax + socialSecurity + medicare);
		
	System.out.println("Hours per Week: \t" +  hoursPerWeek);
	System.out.println("Gross Pay: \t" + grossPay);
	System.out.println("Net Pay: \t" + netPay);
	System.out.println(" ");
	System.out.println("Deductions");
	System.out.println("Federal: \t" + federalTax);
	System.out.println("State: \t" + stateTax);
	System.out.println("Medicare: \t" + medicare);
	System.out.println("Social Security: \t" + socialSecurity);
	
	

	}

}