/* 
* CreditCardPayOff.java 
* Author:  Jacob Strickland 
* Submission Date:  12 September 2017 
* 
* Purpose: Displays the number of months needed to pay off
* credit card debt, along with monetary expenses.
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
import java.math.*;
public class CreditCardPayOff {
	public static void main(String[] args) {
		
		// Here I'm just going to go ahead and set up the variables.
		double principal, interestRate, monthlyPayment, totalMoneyPaid;
		double totalInterestPaid, overpayment, monthsToPayOffDouble;
		int monthsToPayOffInt;
		
		// Here I'm just getting the user input.
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Principal:\t\t\t");
		principal = keyboard.nextDouble();
		System.out.print("Annual Interest Rate (%):\t");
		interestRate = keyboard.nextDouble();
		System.out.print("Monthly Payment:\t\t");
		monthlyPayment = keyboard.nextDouble();
		System.out.println("");
		
		keyboard.close();
		
		// This is where I start computing all the calculations.
		monthsToPayOffDouble = ( Math.log(monthlyPayment) - Math.log((monthlyPayment - (interestRate / 1200.0) * principal)) )
		/ ( Math.log((interestRate / 1200.0) + 1.0) );
		monthsToPayOffInt = (int)Math.ceil(monthsToPayOffDouble);
		totalMoneyPaid = monthsToPayOffInt * monthlyPayment;
		totalInterestPaid = totalMoneyPaid - principal;
		// Here, I calculate the overpayment by subtracting the payment found with the exact amount of months
		// from the payment found with the rounded version.
		overpayment = totalMoneyPaid - (monthsToPayOffDouble * monthlyPayment);
		
		// Here is where I start outputting all the data by printing a statement, then the formatted output.
		System.out.print("Months Needed To Pay Off:\t");
		System.out.printf("%d%n", monthsToPayOffInt);
		System.out.print("Total Amount Paid:\t\t$");
		System.out.printf("%2.2f%n", totalMoneyPaid);
		System.out.print("Total Interest Paid:\t\t$");
		System.out.printf("%2.2f%n", totalInterestPaid);
		System.out.print("Overpayment:\t\t\t$");
		System.out.printf("%2.2f%n", overpayment);
		
	}

}
