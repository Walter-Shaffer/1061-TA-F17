/*
 * CPSC 1060.java
 * Author: James H. Commodore
 * Purpose: Practice working with variables and Java's primitive data types. Perform basic output and inputs.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. 
 * I have neither received nor given inappropriate assistance. I have not copied
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


import java.util.Scanner ;


public class netpay1 {

	private static Scanner keyboard;

	public static void main(String[] args) {
			
		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT   = 4.5;
		double SS_PERCENT          = 6.2;
		double MEDICARE_PERCENT    = 1.45;
		double PAY_PER_HOUR		   = 7.25;
		
		int hoursPerWeek = 45 ;
		double grossPay ;
		double netPay ;
		double federalTax ;
		double stateTax ;
		double medicare ;
		double socialSecurity ;
		
		keyboard = new Scanner (System.in);
		System.out.println("Enter the number of hours per Week") ;
		hoursPerWeek = keyboard.nextInt() ;
		
		
		
		
		grossPay = hoursPerWeek * PAY_PER_HOUR ; 
		federalTax = ( ( grossPay * FEDERAL_TAX_PERCENT ) / 100 ) ;
		stateTax = ( ( grossPay * STATE_TAX_PERCENT ) / 100 ) ;
		socialSecurity = ( ( grossPay * SS_PERCENT) / 100) ;
		medicare = ( ( grossPay * MEDICARE_PERCENT) / 100) ;
		netPay = ( ( grossPay ) - (federalTax + stateTax + medicare + socialSecurity) ) ;
		 
		System.out.printf("Hours Per Week:" + "\t" + "%d" + "\n", hoursPerWeek) ;
		System.out.printf("Gross Pay:" + "\t" + "%f" + "\n", grossPay) ;
		System.out.printf("Net Pay:" + "\t"	+ "%f"	+ "\n" , netPay) ;
		
		System.out.printf("Deductions" + "\t" + "\n") ;
		System.out.printf("Federal:" + "\t" + "%f" + "\n" , federalTax ) ;
		System.out.printf("State:" + "\t" + "\t" + "%f" + "\n" , stateTax ) ;
		System.out.printf("Social Security:"+  "%f" + "\n" , socialSecurity) ;
		System.out.printf("Medicare:" + "\t" + "%f" + "\n" , medicare) ;
		
		
		

		// TODO Auto-generated method stub

	}

}
