import java.util.Scanner;

/*
 * NetPay.java
 * Author: Christopher Hicks
 * Submission Date 9/12/17
 * 
 * Purpose: Learn how to, declare and initialize variables,
 *  declare constants, assign values, and add basic comments.
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
public class NetPay {
	
	public static void main(String[] args) {
		// Declare variables
		final double FEDERAL_TAX_PERCENT = 10.00;
		//Federal_Tax_%
		final double STATE_TAX_PERCENT = 4.5;
		//State_Tax_%
		final double SS_PERCENT = 6.2;
		//SS_%
		final double MEDICARE_PERCENT = 1.45;
		//Medicare_%
		final double PAY_PER_HOUR = 7.25;
		//Pay_Per_Hour
		
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//INPUT
		System.out.print("Please Enter Hours Per Week Worked. ie., 40");
		int hoursPerWeek = input.nextInt();
		
		// Variables 
		double grossPay = (hoursPerWeek * PAY_PER_HOUR);
		double federalTax = ((grossPay * FEDERAL_TAX_PERCENT)/100);
		double stateTax = ((grossPay * STATE_TAX_PERCENT)/100);
		double medicare = ((grossPay * MEDICARE_PERCENT)/100);
		double socialSecurity = ((grossPay * SS_PERCENT)/100);
		double netPay = (grossPay-federalTax-stateTax-medicare-socialSecurity);
		
		//Output
		System.out.print("\n Hours Per Week:\t" + hoursPerWeek);
		System.out.print("\n Gross Pay:\t\t" + grossPay);
		System.out.print("\n Net Pay:\t\t" + netPay);
		System.out.print("\n");
		System.out.print("\n Deductions");
		System.out.print("\n Federal:\t\t" + federalTax);
		System.out.print("\n State:\t\t\t" + stateTax);
		System.out.print("\n Social Security:\t" + socialSecurity);
		System.out.print("\n Medicare:\t\t" + medicare);
	}

}
