 /*
 * NetPay.java
 * Author: Dayvon Polite
 * Submission Date: 9/15/2017
 *
 * Purpose: The program is to compute the gross and net pay of a 
 * person based on their hours worked, hourly wage, and withholdings
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

			double grossPay, netPay, federalTax, stateTax, medicare, socialSecurity = 0;
			double FEDERAL_TAX_PERCENT = 10.00;
			double STATE_TAX_PERCENT =	 4.5;
			double SS_PERCENT		 =	 6.2;
			double MEDICARE_PERCENT  = 	 1.45;
			double PAY_PER_HOUR		 =   7.25;
			int hoursPerWeek = 40;

			Scanner keyboard = new Scanner(System.in);

			System.out.printf("%s", "How many hours do you work per week?");
			hoursPerWeek = keyboard.nextInt();
			keyboard.close();

			grossPay = hoursPerWeek * PAY_PER_HOUR;
			federalTax = (grossPay * FEDERAL_TAX_PERCENT)/100.0;
			stateTax = (grossPay * STATE_TAX_PERCENT)/100.0;
			socialSecurity = (grossPay * SS_PERCENT)/100.0;
			medicare = (grossPay * MEDICARE_PERCENT)/100.0;
			netPay = grossPay-(federalTax + stateTax + medicare + socialSecurity);
			
			System.out.println("Hours per week:\t\t" + hoursPerWeek + "\nGross Pay:\t\t" + grossPay + "\nNet Pay:\t\t" + netPay + "\n\nDeductions" + "\nFederal:\t\t" + federalTax + "\nState:\t\t\t" + stateTax + "\nSocial Security\t\t" + socialSecurity + "\nMedicare:\t\t" + medicare);
		}

	}