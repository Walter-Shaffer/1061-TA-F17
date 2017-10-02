/*
* [Introduction to Java 1061].java
* Author:  [Trevon Wilson]
* Submission Date:  [9/17/17]
* Purpose: A brief paragraph description of the * program. What does it do?
* The purpose of the program is to declare variables and calculate the netpay of a workers paycheck. We will also be declaring constants. The program should be able to write statements to perform basic outputs and inputs. And lastly the program should be to assign bales to variables involving arithmetic expressions.
* Statement of Academic Honesty:
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
			final double FEDERAL_TAX_PERCENT = 10.00;
			final double STATE_TAX_PERCENT = 4.5;
			final double SS_PERCENT = 6.2;
			final double MEDICARE_PERCENT = 1.45;
			final double PAY_PER_HOUR = 7.25;

			
			
			//Scanner input = new Scanner(System.in);
			//System.out.print("Enter number of hours worked: 40 ");
			
			int hoursPerWeek = 40;
	
			double grossPay = (hoursPerWeek * PAY_PER_HOUR);
			double federalTax = (grossPay * FEDERAL_TAX_PERCENT / 100);
			double stateTax = (grossPay * STATE_TAX_PERCENT / 100);
			double socialSecurity = (grossPay * SS_PERCENT / 100);
			double medicare = (grossPay * MEDICARE_PERCENT / 100);
			double netPay = (grossPay - federalTax - stateTax - medicare - socialSecurity);

			System.out.println("Hours Per Week: " + hoursPerWeek );
			System.out.println("Gross Pay: " + grossPay);
			System.out.println("Net Pay: " + netPay + "\n");
			
			System.out.println("Deductions" );
			System.out.println("Federal: " + federalTax);
			System.out.println("State: " + stateTax);
			System.out.println("Social Security: " + socialSecurity);
			System.out.println("Medicare: " + medicare);
			
	
	
			
			//input.close();

	}

}
