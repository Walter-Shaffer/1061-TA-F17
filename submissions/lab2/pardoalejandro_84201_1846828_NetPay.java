
/*
* Author:  Alejandro Pardo
* Submission Date:  September 15
* Purpose: Assign values to variables and use arithmetic expressions
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

	public static void main(String [] args) {
		
		double FEDERAL_TAX_PERCENT = 10.00;
		
		double STATE_TAX_PERCENT = 4.5;
		
		double SS_PERCENT = 6.2;
		
		double MEDICARE_PERCENT = 1.45;
		
		double PAY_PER_HOUR = 7.25;
		
Scanner keyboard = new Scanner(System.in);	

   System.out.print("Hours Per Week:\t\t\t");	

	int hoursPerWeek;
	
	hoursPerWeek = keyboard.nextInt();
	
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
	
	netPay = grossPay - (federalTax + stateTax + medicare + socialSecurity);
	
	System.out.println("Gross Pay: \t\t\t"+grossPay);
	System.out.println("Net Pay: \t\t\t"+netPay);
	System.out.println("");
	System.out.println("Deductions");
	System.out.println("Federal Tax: \t\t\t"+federalTax);
	System.out.println("State Tax: \t\t\t"+stateTax);
	System.out.println("Social Security: \t\t"+ socialSecurity);
	System.out.println("Medicare: \t\t\t"+medicare);

	
	

	}
}

