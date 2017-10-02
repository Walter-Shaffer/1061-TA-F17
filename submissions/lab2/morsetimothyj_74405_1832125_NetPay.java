/*
* NetPay.java
* Author: Timothy Morse (hey! that's not a typo!)
* Submission Date: 11 Sept. 2017 (or 12 Sept. 2017,
* since I should make sure this runs on 32-bit.)
*
* Purpose: This program takes input from the user 
* (in this case, "Hours Per Week") and outputs
* gross and net pay, and the tax deductions.
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
* 
* (don't know if i need to "sign" or something, so here:
* -TJMorse)
*/
//Import the Scanner and PrintStream
import java.util.Scanner;
import java.io.PrintStream;
public class NetPay {

	public static void main(String[] args) {
		PrintStream pntr = new PrintStream(System.out);//I just prefer this way. Sorry if this breaks any rules!
		//Declarations
		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;
		int hoursPerWeek = 40;
		double grossPay = 0;
		double netPay = 0;
		double federalTax = 0;
		double stateTax = 0;
		double medicare = 0;
		double socialSecurity = 0;
		Scanner keyboard = new Scanner(System.in);
		//Perform the correct computations
		pntr.print("Hours per Week:\t\t");
		hoursPerWeek = keyboard.nextInt();
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federalTax = ((grossPay*FEDERAL_TAX_PERCENT)/100);
		stateTax = ((grossPay*STATE_TAX_PERCENT)/100);
		socialSecurity = ((grossPay*SS_PERCENT)/100);
		medicare = ((grossPay * MEDICARE_PERCENT)/100);
		netPay = grossPay - (federalTax+stateTax+medicare+socialSecurity);
		//Speak, my creation! (Output the results)
		pntr.println("Gross Pay: \t\t"+grossPay);
		pntr.println("Net Pay:\t\t"+netPay+"\n");
		pntr.println("Deductions");
		pntr.println("Federal:\t\t"+federalTax);
		pntr.println("State:\t\t\t"+stateTax);
		pntr.println("Social Security:\t"+socialSecurity);
		pntr.println("Medicare:\t\t"+medicare);

	}

}
