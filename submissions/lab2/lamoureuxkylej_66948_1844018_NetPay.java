/*
* NetPay.java
* Author: Kyle Lamoureux
* Submission Date: 9/19/17
*
* Purpose: To compute a person’s gross and net pay based on their hourly wage, hours
worked, and several withholdings.
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

public class NetPay {

	public static void main(String[] args) {
		
		double Federal_Tax_Percent = 10.00;
		double State_Tax_Percent = 4.50;
		double SS_Percent = 6.20;
		double Medicare_Percent = 1.45;
		double Pay_Per_Hour = 7.25;
		
		int hoursPerWeek;
		
		double grossPay;
		double netPay;
		double federalTax;
		double stateTax;
		double medicare;
		double socialSecurity;
	
		hoursPerWeek = 40;
		grossPay = hoursPerWeek * Pay_Per_Hour;
		federalTax = (grossPay * Federal_Tax_Percent) / 100;
		stateTax = (grossPay * State_Tax_Percent) / 100;
		socialSecurity = (grossPay * SS_Percent) / 100;
		medicare = (grossPay * Medicare_Percent) /100;
		netPay = grossPay - federalTax - stateTax - medicare - socialSecurity;
		
		System.out.println("Hours per Week:\t\t" + hoursPerWeek);
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federalTax);
		System.out.println("State:\t\t\t" + stateTax);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);
		
	}

}
