/*
*CreditCardPayOff.java
* Author:  David McDonough
* Submission Date:  September 19th
* Purpose: Calculates the amount of months needed to pay off credit card debt with interest.
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

public class CreditCardPayOff {

	public static void main(String[] args) {
		double rawPayOffMonths;
		int payOffMonths;
		double principle;
		double annualInterestRate;
		double monthlyPayment;
		double totalAmountPaid;
		double totalInterestPaid;
		double overpayment;
		
		Scanner input = new Scanner(System.in);
		
		//user inputs the principle, annual interest rate, and monthly payment
		System.out.println("Enter the Principle:");
		principle = input.nextDouble();
		System.out.println("Enter the Annual Interest Rate (%):");
		annualInterestRate = input.nextDouble();
		System.out.println("Enter the Monthly Payment:");
		monthlyPayment = input.nextDouble();
		
		//equation that calculates the raw (floating point) amount of months to pay off debt
		rawPayOffMonths = (Math.log(monthlyPayment) - Math.log(monthlyPayment - (annualInterestRate/1200.0) * principle))/(Math.log(annualInterestRate/1200.0 + 1.0));
		
		//the math.ceil function takes the long floating point number (rawPayOffMonths) and returns the
		//ceiling of the number. Type cast the double to an int so the output displays a whole number.
		payOffMonths = (int) Math.ceil(rawPayOffMonths);
		totalAmountPaid = payOffMonths * monthlyPayment;
		totalInterestPaid = totalAmountPaid - principle;
		
		//Taking the Total Amount Paid, which accounts for an entire month of payment (integer), minus the Raw 
		//payment, which accounts for a portion of a month's payment (floating-point)
		overpayment = totalAmountPaid - (rawPayOffMonths * monthlyPayment);
		
		//output for principle, annualInterestRate, and monthlyPayment are restated with correct amount of decimal places
		System.out.printf("Principal:\t\t\t%.2f%n", principle);
		System.out.println("Annual Interest Rate:\t\t" + annualInterestRate);
		System.out.printf("Monthly Payment:\t\t%.2f%n", monthlyPayment);
		
		//output for payOffMonths, totalAmountPaid, totalInterestPaid, and overpayment are displayed with correct amount
		//of decimal places
		System.out.println("\nMonths needed to pay off debt:\t" + payOffMonths); 
		System.out.printf("Total Amount Paid: \t\t$%.2f%n", totalAmountPaid);
		System.out.printf("Total Interest Paid: \t\t$%.2f%n", totalInterestPaid);
		System.out.printf("Overpayment: \t\t\t$%.2f%n", overpayment);
		
		
		
		

	}

}
