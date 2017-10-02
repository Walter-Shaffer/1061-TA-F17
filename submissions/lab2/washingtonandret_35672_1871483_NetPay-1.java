/*
* NetPay.java
* Author: Andre Washington
* Submission Date: 9/18/17
*
* Purpose: This program is designed where someone can put their financial
* information into the system so you could correctly calculate the funds 
* in which that person has recieved. Those funds include: Federal and State
* tax percent, social security and medicare percent and the pay per hour
* which all help find the deductions and gross pay aslo. Which is done by a 
* set of written equations. 
*
*
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
		public static void main(String[] arg) {
		Scanner keyboard = new Scanner(System.in);
	
		
			double FEDERAL_TAX_PERCENT = 10.0;
			double STATE_TAX_PERCENT    = 4.5;
			double SS_PERCENT           = 6.2;
			double MEDICARE_PERCENT     = 1.45;
			double PAY_PER_HOUR         = 7.25;
			
			System.out.println("Enter ther number of hours per week: ");
			int hoursPerWeek = keyboard.nextInt();
			
			
			double grossPay = (hoursPerWeek * PAY_PER_HOUR);	
			double federalTax = (grossPay * FEDERAL_TAX_PERCENT) / 100;
			double stateTax = (grossPay * STATE_TAX_PERCENT) / 100;
			double socialSecurity = (grossPay * SS_PERCENT) / 100;
			double medicare = (grossPay * MEDICARE_PERCENT) / 100;
			double netPay = grossPay - (federalTax + stateTax + medicare + socialSecurity);
			
				System.out.println("Hours per Week: " + hoursPerWeek);
				System.out.println("Gross Pay: " + grossPay);
				System.out.println("Net Pay: " + netPay);
				System.out.println(" ");
				System.out.println("Deductions");
				System.out.println("Federal: " + federalTax);
				System.out.println("State: " + stateTax);
				System.out.println("Social Security: " + socialSecurity );
				System.out.println("Medicare: " + medicare);
			
			
	}
}
