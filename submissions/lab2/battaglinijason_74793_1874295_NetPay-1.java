/*
* [NetPay].java
* Author: [Jason Battaglini]
* Submission Date: [9/19/17]
*
* Purpose: The purpose of this program is to tell the user how much 
* net pay they will receive in a week, 
* given how many hours they work in one week.The net pay is calculated by
* subtracting the amounts of various taxes given from the gross pay during the
* week.
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
		// TODO Auto-generated method stub
double FEDERAL_TAX_PERCENT=10.00;
double STATE_TAX_PERCENT=4.5;
double SS_PERCENT=6.2;
double MEDICARE_PERCENT=1.45;
double PAY_PER_HOUR=7.25;
Scanner keyboard= new Scanner(System.in);
System.out.println("Hours Per Week: \t");
int hoursPerWeek=keyboard.nextInt();
double grossPay=hoursPerWeek*PAY_PER_HOUR;
double federalTax=(grossPay*FEDERAL_TAX_PERCENT)/100;
double stateTax=(grossPay*STATE_TAX_PERCENT)/100;
double socialSecurity=(grossPay*SS_PERCENT)/100;
double medicare=(grossPay*MEDICARE_PERCENT)/100;
double netPay=(grossPay-(federalTax+stateTax+socialSecurity+medicare));
System.out.println("Hours per week:\t\t" +  hoursPerWeek);
System.out.println("Gross Pay: \t\t" + grossPay);
System.out.println("Net Pay: \t\t" + netPay);
System.out.println("Deductions \t\t");
System.out.println("Federal: \t\t" + federalTax);
System.out.println("State:\t\t\t" + stateTax);
System.out.println("Social Security:\t" + socialSecurity);
System.out.println("Medicare:\t\t" + medicare);


	}

}
