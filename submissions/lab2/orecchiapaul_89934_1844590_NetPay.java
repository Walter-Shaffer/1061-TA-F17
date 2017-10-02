/* 
 * 
 * NetPay.java 
 * Author:  Paul Orecchia  
 * Submission Date:  9/14/17 
 * 
 * Purpose: The purpose of this program is to calculate the 
 * net pay and deductions by inputing the hours per week
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
	
	public static final double FEDERAL_TAX_PERCENT=10.00;
	public static final double STATE_TAX_PPERCENT=4.5;
	public static final double SS_PERCENT=6.2;
	public static final double MEDICARE_PERCENT=1.45;
	public static final double PAY_PER_HOUR=7.25;
	
	public static void main(String[] args) {
		Scanner Keyboard= new Scanner(System.in);
		
		System.out.print("Hours per Week:\t\t");
		int hoursPerWeek=Keyboard.nextInt();
		double grossPay=hoursPerWeek*PAY_PER_HOUR;
		double stateTax=(grossPay*STATE_TAX_PPERCENT)/100;
		double medicare=(grossPay*MEDICARE_PERCENT)/100;
		double federalTax=(grossPay*FEDERAL_TAX_PERCENT)/100;
		double socialSecurity=(grossPay*SS_PERCENT)/100;
		double netPay=grossPay-(stateTax+medicare+federalTax+socialSecurity);
		System.out.println("Gross Pay:\t\t"+grossPay);
		System.out.println("Net Pay:\t\t"+netPay+"\n");
		System.out.println("Deductions");
		System.out.println("Federal:\t\t"+federalTax);
		System.out.println("State:\t\t\t"+stateTax);
		System.out.println("Social Security:\t"+socialSecurity);
		System.out.println("Medicare:\t\t"+medicare);
	}

}
