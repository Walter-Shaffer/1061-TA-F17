/*
 * [NetPay].java 
 * Author: [Aneri Desai]
 * Submission Date: [09/19/2017]
 * 
 * Purpose: In the lab we are going to learn how to declare and initialize variables, declare constants, assign 
 *values to the variables and constants and learn how to write basic arithmatic expression in java. 
 * 
 *  Statement of Academic Honesty:
 *  
 *  The following code represent my own work. I have neither received nor given inappropriate assistance. 
 *  I have not copied or modified code from any source other than the course webpage or the course textbook.
 *  I recognize that any unauthorized assistance or plagiarism will be handled in accordance with the policies
 *  at Clemson University and the policies of this course. I recognize that my work is based on an assignment 
 *  created by the School of Computing at Clemson Univeristy. Any publishing or posting of source code for this 
 *  project is strictly prohibited unless you have written consent from the instructor.  
 */
import java.util.Scanner;

public class NetPay{
	public static void main(String[ ] args ) {
		
		//Declaring the constants

		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2; 
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		//Create Scanner object

		Scanner keyboard = new Scanner(System.in);
				
		System.out.print("Enter the number of hours per week: "); //prompt the use to give hours per week value
				
		int hoursPerWeek = keyboard.nextInt(); //add read statement
				
		//Declare variables and write formulas
				
		double grossPay = hoursPerWeek * PAY_PER_HOUR;
		double federalTax = (grossPay * FEDERAL_TAX_PERCENT)/100;
		double stateTax = (grossPay * STATE_TAX_PERCENT)/100;
		double socialSecurity = (grossPay * SS_PERCENT)/100;
		double medicare = (grossPay * MEDICARE_PERCENT)/100;
		double deductions = - federalTax - stateTax - medicare - socialSecurity;
		double netPay = grossPay + deductions;

		//Write the println statement to get the values from the formulas

		System.out.println("\nHours per Week:\t\t\t" + hoursPerWeek); //\t for the extra space. \n for new line
		System.out.println("Gross Pay:\t\t\t" + grossPay);
		System.out.println("Net Pay:\t\t\t" + netPay);
		System.out.println(""); //add space before deductions
		System.out.println("Deductions");
		System.out.println("Federal:\t\t\t" + federalTax);
		System.out.println("State:\t\t\t\t" + stateTax );
		System.out.println("Social Security:\t\t" + socialSecurity );
		System.out.println("Medicare:\t\t\t" + medicare);
		
		}

}