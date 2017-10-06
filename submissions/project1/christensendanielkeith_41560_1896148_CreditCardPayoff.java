/*
* CreditCardPayOff.java
* Author: Daniel Christensen
* Submission Date: 9/22/2017
*
* Purpose: Given the principal amount owed, annual interest rate, and monthly payment, 
*this program calculates and displays the months required to pay off the debt, amount of interest paid, and the amount of overpayment.
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
import java.text.*;

public class CreditCardPayoff {

	public static void main(String[] args) {
		
		
		
		Scanner keyboard = new Scanner(System.in);// creates scanner object
		
		System.out.println("Please enter the principal amount owed:");// prompts user input
		double principal = keyboard.nextDouble();// assigns user input to variable
		
		System.out.println("Please enter the annual interest rate:");
		double annualInterestRate = keyboard.nextDouble();
		
		System.out.println("Please enter the monthly payment amount:");
		double monthlyPayment = keyboard.nextDouble();
		
		double monthsNeededToPayOff = (Math.log(monthlyPayment) - Math.log(monthlyPayment - principal * (annualInterestRate)/1200.00))/(Math.log(((annualInterestRate)/1200.00)+1.00)); // uses given formula to calculate number of months required
		
		int monthsNeededInt = (int) Math.ceil(monthsNeededToPayOff);// rounds up to give an integer value for months required to pay off
		
		double totalAmountPaid = monthsNeededInt * monthlyPayment;
		
		double totalInterestPaid = totalAmountPaid - principal;
		
		double overpayment = totalAmountPaid - monthsNeededToPayOff*monthlyPayment;
		
		DecimalFormat money = new DecimalFormat("$#.##"); // creates format for currency values with 2 decimals and a dollar sign
		
		
		System.out.println("");
		System.out.println("Principal:\t\t\t" + money.format(principal));
		System.out.println("Annual Interest Rate (%) :\t" + annualInterestRate);
		System.out.println("Monthly Payment:\t\t" + money.format(monthlyPayment));
		System.out.println("");// gap between input and output
		System.out.printf("%s\n%s\n%s\n%s\n","Months Needed to Pay Off: \t" +  monthsNeededInt, "Total Amount Paid: \t\t" + money.format(totalAmountPaid),  "Total Interest Paid:\t\t" + money.format(totalInterestPaid), "Overpayment: \t\t\t" + money.format(overpayment) );// prints all outputs

	}

}
