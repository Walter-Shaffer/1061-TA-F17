	/*CPSC1061.java
		 * Gabe Ingmire
		 * 9/14/2017
		 * 
		 * Intro to Primitives 
		 * Using declaritives
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
			
			Scanner keyboard = new Scanner(System.in);
				
			// TODO Auto-generated method stub
				 final double FEDERAL_TAX_PERCENT = 10.0;
				 final double STATE_TAX_PERCENT = 4.5;
				 final double SS_PERCENT = 6.2;
				 final double MEDICARE_PERCENT = 1.45;
				 final double PAY_PER_HOUR = 7.25;
				
	
				int hoursPerWeek;
				
				double grossPay;
				double netPay;
				double federalTax;
				double stateTax;
				double medicare;
				double socialSecurity;
				
				
				System.out.print("Enter Hours Per week:");
				hoursPerWeek = keyboard.nextInt();
				
				grossPay = (hoursPerWeek*PAY_PER_HOUR);
				federalTax = (grossPay*FEDERAL_TAX_PERCENT)/100;
				stateTax = (grossPay*STATE_TAX_PERCENT)/100;
				socialSecurity = (grossPay*SS_PERCENT)/100;
				medicare = (grossPay*MEDICARE_PERCENT)/100;
				netPay = grossPay - (federalTax + stateTax + medicare + socialSecurity);
				
				System.out.println("\n" + "Hours Per Week:" + "\t" + hoursPerWeek);
				System.out.println("Gross Pay:" + "\t" + grossPay);
				System.out.println("Net Pay:" + "\t" + netPay);
				System.out.println("\n" + "Deductions:");
				System.out.println("Federal:" + "\t" + federalTax); 
				System.out.println("State:" + "\t" + stateTax);
				System.out.println("Social Security:" + "\t" + socialSecurity);
				System.out.println("Medicare:" + "\t" + medicare);
			
				
				
				
				
				
		}
		
	}
				
				
				