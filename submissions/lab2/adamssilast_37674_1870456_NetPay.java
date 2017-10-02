
import java.util.Scanner;
public class NetPay
/*
* NetPay.java
* Author: Silas Adams
* Submission Date: 9/19/17
*
* Purpose: Compute a person's gross and net pay based on their hourly wage, hours worked, and several withholdings
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
{
public static void main(String args[]){
	
	double federal_tax_percent=10.00;
	double state_tax_percent=4.5;
	double ss_percent=6.2;
	double medicare_percent=1.45;
	double pay_per_hour=7.25;
	int hoursPerWeek;
	double grossPay;
	double netPay;
	double federalTax;
	double stateTax;
	double medicare;
	double socialSecurity;
	
	Scanner keyboard=new Scanner(System.in);
	System.out.print("Enter hours per week: ");
	hoursPerWeek=keyboard.nextInt();
	keyboard.close();
	
	grossPay=hoursPerWeek*pay_per_hour;
	federalTax=(grossPay*federal_tax_percent)/100;
	stateTax=(grossPay*state_tax_percent)/100;
	socialSecurity=(grossPay*ss_percent)/100;
	medicare=(grossPay*medicare_percent)/100;
	netPay=grossPay-(federalTax+stateTax+medicare+socialSecurity);
	
	System.out.println("Hours per Week:\t"+ hoursPerWeek);
	System.out.println("Gross pay:\t"+ grossPay);
	System.out.println("Net Pay:\t"+ netPay);
	System.out.println("\nDeductions");
	System.out.println("Federal:\t"+ federalTax);
	System.out.println("State:\t\t"+ stateTax);
	System.out.println("Social Security:"+ socialSecurity);
	System.out.println("Medicare:\t"+ medicare);
	
}
}
