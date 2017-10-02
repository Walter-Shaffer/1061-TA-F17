/*
* NetPay.java
* Author: Anthony Hazelton
* Submission Date: September 15, 2017
*
* Purpose: A brief paragraph description of the
* program. This program calculates the net pay of an individual by requesting 
* the hours per week of an individual, taking into account the wage of the
* individual and calculating the gross pay. After calculating the gross pay,
* this program calculates the deductions (being federal, state, social security,
* and Medicare taxes) then subtracting these deductions from the gross pay to
* determine the net pay of the individual. 
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
		Scanner input = new Scanner(System.in);
		
		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;
		
		Scanner keyboard = new Scanner(System.in);

		
		System.out.print("Hours per week:\t\t ");
		int hoursPerWeek = input.nextInt ();
		
		double grossPay;
		double netPay;
		double federalTax;
		double stateTax;
		double medicare;
		double socialSecurity;
		
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federalTax = (grossPay * FEDERAL_TAX_PERCENT) / 100;
		stateTax = (grossPay * STATE_TAX_PERCENT) / 100;
		socialSecurity = (grossPay * SS_PERCENT) / 100;
		medicare = (grossPay * MEDICARE_PERCENT) / 100;
				
		netPay = (grossPay - (federalTax + stateTax + medicare + socialSecurity));
		
		System.out.println("Gross Pay:\t\t " + grossPay);
		System.out.println("Net Pay:\t\t " + netPay);
		System.out.println("\n");
		System.out.println("Deductions");
		System.out.println("Federal:\t\t " + federalTax);
		System.out.println("State:\t\t\t " + stateTax);
		System.out.println("Social Security:\t " + socialSecurity);
		System.out.println("Medicare:\t\t " + medicare);
		

	}

}
