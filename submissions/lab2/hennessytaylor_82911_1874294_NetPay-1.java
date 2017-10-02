import java.util.Scanner;
//double declarations and assignments of constants for calculations

	public class NetPay {
		
	/*
	* NetPay.java
	* Author: Taylor Hennessy
	* Submission Date: 9/14/2017
	*
	* Purpose: This program calculates an individual's gross & net pay,
	* as well as any deductions that apply, including federal & state tax,
	* and social security & medicare payments.
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
		
	//static variable declaration for constants for equations
		public static final double FEDERAL_TAX_PERCENT = 10.00;
		public static final double STATE_TAX_PERCENT = 4.5;
		public static final double SS_PERCENT = 6.2;
		public static final double MEDICARE_PERCENT = 1.45;
		public static final double PAY_PER_HOUR = 7.25;

		
	//main method
	public static void main(String[] args) {
		

		
		//double declarations for results of calculations
		double grossPay;
		double netPay;
		double federalTax;
		double stateTax;
		double medicare;
		double socialSecurity;
		
		//scanner object to read keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//integer declaration for user input
		int hoursPerWeek;
		
		//prompt for Hours
		System.out.println("Please Insert Hours Worked per Week:");
		
		//get int input
		hoursPerWeek = keyboard.nextInt();
		
		//calculate values based on the new hours value
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federalTax = (grossPay * FEDERAL_TAX_PERCENT)/100;
		stateTax = (grossPay * STATE_TAX_PERCENT)/100;
		socialSecurity = (grossPay * SS_PERCENT)/100;
		medicare = (grossPay * MEDICARE_PERCENT)/100;
		netPay = grossPay - (federalTax + stateTax + medicare + socialSecurity);

		//print results
		System.out.println("Hours per Week:\t\t\t" + hoursPerWeek);
		System.out.println("Gross Pay:\t\t\t" + grossPay);
		System.out.println("Net Pay:\t\t\t" + netPay + "\n");
		System.out.println("Deductions");
		System.out.println("Federal:\t\t\t" + federalTax);
		System.out.println("State:\t\t\t\t" + stateTax);
		System.out.println("Social Security:\t\t" + socialSecurity);
		System.out.println("Medicare:\t\t\t" + medicare);
	
	}
}
