/*
* CPSC 1060.java
* Author: Mimi Ntune
* Submission Date: 9/19/2017
*
* Purpose: compute a person’s gross and net pay based on their hourly wage, hours
worked, and several withholdings
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
public static final double FEDERAL_TAX_PERCENT = 10.00; 
public static final double STATE_TAX_PERCENT = 4.5; 
public static final double SS_PERCENT = 6.2;
public static final double MEDICARE_PERCENT = 1.45;   
public static final double PAY_PER_HOUR = 7.25; 
		public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);	
			System.out.print("Hours Per Week: \t"); 
		int hoursPerWeek = keyboard.nextInt();
		double grossPay = hoursPerWeek * PAY_PER_HOUR; 
		double federalTax = (grossPay * FEDERAL_TAX_PERCENT) / 100;
		double stateTax = (grossPay* STATE_TAX_PERCENT) / 100; 
		double medicare = (grossPay * MEDICARE_PERCENT) / 100;
		double socialSecurity = (grossPay * SS_PERCENT)/ 100;	
		double netPay = grossPay - (federalTax + stateTax + medicare + socialSecurity); 
System.out.println("Gross Pay:      \t" + grossPay);
System.out.println("Net Pay:        \t" + netPay);
System.out.println("");
System.out.println("Deductions");
System.out.println("Federal Tax:    \t" + federalTax);
System.out.println("State Tax:      \t" + stateTax);
System.out.println("Medicare:       \t" + medicare);
System.out.println("Social Security: \t" + socialSecurity);
	}
}