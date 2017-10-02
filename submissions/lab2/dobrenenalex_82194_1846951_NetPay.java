/* NetPay.java 
 * Author:  Alex Dobrenen 
 * Submission Date:  [Submission date here]  
 * Purpose: A brief paragraph description of the 
 * program. What does it do? Compute a person’s gross and net pay based on their hourly wage, hours worked, 
 * and several withholdings.
 * Statement of Academic Honesty:  
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
 * */ 

import java.util.Scanner;

public class NetPay //Class Start
{
	//Constants
	public static final double FEDERAL_TAX_PERCENT = 10.00;
	public static final double STATE_TAX_PERCENT = 4.5;
	public static final double SS_PERCENT = 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25;
	
	public static void main(String[] args) //Main Start
	{
		//Variables
		int hoursPerWeek = 0;
		double grossPay = 0.0;
		double netPay = 0.0;
		double federalTax = 0.0;
		double stateTax = 0.0;
		double medicare = 0.0;
		double socialSecurity = 0.0;
		double totalTax = 0.0;
		
		//Scanner
		Scanner keyBoard = new Scanner(System.in);
		
		//Input
		System.out.print("Hours Per Week:\t\t");
		hoursPerWeek = keyBoard.nextInt();
		
		//Calculations
		grossPay = hoursPerWeek * PAY_PER_HOUR * 1.0;
		federalTax = (grossPay * FEDERAL_TAX_PERCENT)/100.0;
		stateTax = (grossPay * STATE_TAX_PERCENT)/100.0;
		socialSecurity = (grossPay * SS_PERCENT)/100.0;
		medicare = (grossPay * MEDICARE_PERCENT)/100.0;
		totalTax = federalTax + stateTax + medicare + socialSecurity;
		netPay = grossPay - totalTax;
		
		//Output
		System.out.println("Gross Pay:\t\t$" + grossPay);
		System.out.println("Net Pay:\t\t$" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:\t\t$" + federalTax);
		System.out.println("State:\t\t\t$" + stateTax);
		System.out.println("Social Security:\t$" + socialSecurity);
		System.out.println("Medicare:\t\t$" + medicare);
	} //End Main

}//End Class
