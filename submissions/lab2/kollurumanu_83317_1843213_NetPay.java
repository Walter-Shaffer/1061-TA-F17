/* 
 * NetPay.java
 * Author : Manu Kolluru
 * Submission Date: 9/  /17
 * Purpose : To calculate persons gross and net pay based on wages
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
	public static final double FEDERAL_TAX_PERCENT = 10.00;
	public static final double STATE_TAX_PERCENT = 4.5;
	public static final double SS_PERCENT = 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25;
	public static void main (String [] args){
	
	Scanner sc = new Scanner (System.in);
	
	int hoursPerWeek;
	System.out.println("Enter a number for the number of hours per week");
	hoursPerWeek = sc.nextInt();
	double grossPay, netPay, federalTax, stateTax, medicare, socialSecurity;
	
	
	
	grossPay = hoursPerWeek * PAY_PER_HOUR;
	
	federalTax= (grossPay * FEDERAL_TAX_PERCENT)/100;
	
	stateTax = (grossPay * STATE_TAX_PERCENT)/100;
	
	socialSecurity = (grossPay * SS_PERCENT)/100;
	
	medicare = (grossPay * MEDICARE_PERCENT)/100;
	
	netPay = grossPay - federalTax - stateTax - socialSecurity - medicare;
	
	System.out.println("Hours per week : "  + "\t" + hoursPerWeek + "\n" +"GrossPay : " + "\t"  + "\t"+ grossPay);
	System.out.println("Net pay : " + "\t" + "\t" + netPay);
	
	System.out.println(" " + "\n" + "Deductions");
	System.out.println("Federal : " + "\t" + "\t"+ federalTax);
	System.out.println("State : " + "\t" + "\t"+ stateTax);
	System.out.println("Social Security : " + "\t" +  socialSecurity);
	System.out.println("Medicare : " + "\t" + "\t"+ medicare);
	
	
	
	
	}

}