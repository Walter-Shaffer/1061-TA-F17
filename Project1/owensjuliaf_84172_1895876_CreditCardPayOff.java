/*
* CreditCardPayoff.java
* Author: Julia Owens
* Submission Date: 9/22/2017
*
* Purpose: This program serves to calculate various sums relevant to paying off a credit card. 
*
* Statement of Academic Honesty:
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

public class CreditCardPayOff {
	public static void main(String[] args)
	{
		Scanner keyboard= new Scanner(System.in);
		System.out.print("Principal:\t\t\t");
		double principal= keyboard.nextDouble();
		System.out.print("Annual Interest Rate(%):\t");
		double annualInterestRate= keyboard.nextDouble();
		System.out.print("Monthly Payment:\t\t");
		double monthlyPayment= keyboard.nextDouble();
		double monthsNeeded, totalInterestPaid, totalAmountPaid, overpayment, x, numerator;
		x= annualInterestRate / 1200;
		numerator= Math.log(monthlyPayment) - Math.log(monthlyPayment - x * principal);
		monthsNeeded= numerator / Math.log(x + 1);
		int intMonths= (int) Math.ceil(monthsNeeded);
		totalAmountPaid= intMonths * monthlyPayment;
		totalInterestPaid= totalAmountPaid - principal;
		overpayment= (monthlyPayment * intMonths) - (monthlyPayment * monthsNeeded);
		
		System.out.println("\nMonths Needed To Pay Off:\t" + intMonths);
		System.out.print("Total Amount Paid:\t\t$");
		System.out.printf("%.2f", totalAmountPaid);
		System.out.print("\nTotal Interest Paid:\t\t$");
		System.out.printf("%.2f", totalInterestPaid);
		System.out.print("\nOverpayment:\t\t\t$");
		System.out.printf("%.2f", overpayment);
	}

}
