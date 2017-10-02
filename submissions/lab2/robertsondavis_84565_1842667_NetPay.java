import java.util.Scanner;
public class NetPay {
	public static void main (String[] args) {
    /*
     * NetPay.Java
     * Author: Davis Robertson
     * Submission Date: September 13th, 2017
     * 
     * Purpose: This program takes the hours of work put in a week, and, using several different
     * variables, calculates the Gross and Net Pay of the job, as well as show you how much of
     * it was deducted and from where (in taxes)
     * 
     * Statement of Academic Honesty:
     * 
     * The following code represents my own work. I have neither received nor given inappropriate 
     * assistance. I have not copied or modified code from any source other than the course 
     * webpage or the course textbook. I recognize that any unauthorized assistance or 
     * plagiarism will be handled in accordance with the policies at Clemson University and 
     * the policies of this course. I recognize that my work is based on an assignment created
     * by the School of Computing at Clemson University. Any publishing or posting of source
     * code for this project is strictly prohibited unless you have written consent from the 
     * instructor.
     */
	Scanner input = new Scanner(System.in);
	System.out.print("Hours per Week:\t\t");
	
		int hoursPerWeek = input.nextInt();
		
	double FEDERAL_TAX_PERCENT = 10.00;
	double STATE_TAX_PERCENT = 4.5;
	double SS_PERCENT = 6.2;
	double MEDICARE_PERCENT = 1.45;
	double PAY_PER_HOUR = 7.25;
	
	double grossPay = (hoursPerWeek * PAY_PER_HOUR);
	double federalTax = (grossPay * FEDERAL_TAX_PERCENT)/100;
	double stateTax = (grossPay * STATE_TAX_PERCENT)/100;
	double medicare = (grossPay * MEDICARE_PERCENT)/100;
	double socialSecurity = (grossPay * SS_PERCENT)/100;
	double netPay = (grossPay - federalTax - stateTax - socialSecurity - medicare);
	
	System.out.println("Gross Pay:\t\t" + hoursPerWeek * PAY_PER_HOUR);
	System.out.println("Net Pay:\t\t" + netPay);
	System.out.println("\nDeductions");
	System.out.println("Federal:\t\t" + federalTax);
	System.out.println("State:\t\t\t" + stateTax);
	System.out.println("Social Security:\t" + socialSecurity);
	System.out.println("Medicare:\t\t" + medicare);
	
	
	
	}

}
