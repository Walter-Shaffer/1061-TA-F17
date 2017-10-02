import java.util.Scanner;

/*
* NetPay.java
* Author: Hunter Singletary
* Submission Date: 09/13/2017
*
* Purpose: NetPay.java is a program I wrote in order to
* compute the Net Pay an individual would receive for
* minimum wage working a user-input amount of hours
* after taxes come out.
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
		Scanner input = new Scanner(System.in);
		double Federal_Tax_Percent = 10.0;
		double State_Tax_Percent = 4.5;
		double SS_Percent = 6.2;
		double Medicare_Percent = 1.45;
		double Pay_Per_Hour = 7.25;
		System.out.println("Please enter the amount of hours worked per week:");
		int hoursPerWeek = input.nextInt() ;
		double grossPay = (hoursPerWeek * Pay_Per_Hour);
		double federalTax = (grossPay * Federal_Tax_Percent) / 100.0;
		double stateTax = (grossPay * State_Tax_Percent) / 100.0;
		double medicare = (grossPay * Medicare_Percent) / 100.0;
		double socialSecurity = (grossPay * SS_Percent) / 100.0;
		double netPay = grossPay - (federalTax + stateTax + medicare + socialSecurity);
		
		System.out.println("Hours per Week:\t\t" + hoursPerWeek);
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal Tax:\t\t" + federalTax);
		System.out.println("State Tax:\t\t" + stateTax);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);
	}
}
