/*
* CreditCardPayoff.java
* Author: Ethan Coppenbarger
* Submission Date: 9/21/2017
*
* Purpose: For a credit card debt, find months to pay off, amount paid, interest paid, and overpayment.
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

// imports
import java.util.Scanner;
public class CreditCardPayoff {

	public static void main(String[] args) {
		// variables
		float principal, interestRate, monthlyPayment, amountPaid, interestPaid, overpayment;
		double payOffMonthsRaw, payOffMonths;
		int payOffMonthsPrint;
		Scanner input = new Scanner(System.in);
		
		// ask user for input
		System.out.print("Principal:\t\t\t ");
		principal = input.nextFloat();
		System.out.print("Annual Interest Rate (%):\t ");
		interestRate = input.nextFloat();
		System.out.print("Monthly Payment:\t\t ");
		monthlyPayment = input.nextFloat();
		input.close();
		
		// find months to pay off debt
		payOffMonthsRaw = (Math.log(monthlyPayment) - Math.log(
						monthlyPayment - ((interestRate/1200.0) * principal))
						)/Math.log(interestRate/1200.0 + 1.0);
		payOffMonths = Math.ceil(payOffMonthsRaw);
		payOffMonthsPrint = (int) payOffMonths;
		
		// find total amount paid
		amountPaid = ((float) Math.ceil(payOffMonths)) * monthlyPayment;
		
		// find interest paid
		interestPaid = amountPaid - principal;
		
		// find overpayment
		overpayment = ((float)(payOffMonths - payOffMonthsRaw)) * monthlyPayment;
		
		// print output
		System.out.println("\nMonths Needed to Pay Off:\t $" + payOffMonthsPrint);
		System.out.printf("Total Amount Paid:\t\t $%.2f\n", amountPaid);
		System.out.printf("Total Interest Paid:\t\t $%.2f\n", interestPaid);
		System.out.printf("Overpayment:\t\t\t $%.2f\n", overpayment);


	}

}
