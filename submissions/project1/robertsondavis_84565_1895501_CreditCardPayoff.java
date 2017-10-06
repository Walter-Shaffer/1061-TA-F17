/*
* CreditCardPayoff.java
* Author: Davis Robertson
* Submission Date: 9/22/17
*
* Purpose: This program computes the months needed to pay off a credit card debt,
* given the monthly payment and interest rate.
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

public class CreditCardPayoff {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// Prompt User to enter Principal
		System.out.print("Enter Principal: $");
		double principal = input.nextDouble();
		// Prompt User to enter interest rate
		System.out.print("Enter Annual Interest Rate (%): ");
		double interestrate = input.nextDouble();
		// Prompt User to enter monthly payment
		System.out.print("Enter Monthly Payment: $");
		double monthlypayment = input.nextDouble();
		
		double a = Math.log(monthlypayment);    //Math log returns natural log of variables
		double b = Math.log(monthlypayment - (interestrate/1200.0) * principal);
		double c = Math.log((interestrate/1200.0) + 1.0);
		
		//Calculate months needed to pay off
		double monthsneeded;
		
		monthsneeded = ((a-b) / c);
		
		int monthsneededceiling = (int) Math.ceil(monthsneeded);
		double amountpaid = (monthsneededceiling * monthlypayment);
		double interestpaid = (amountpaid - principal);
		
		//Calculate overpayment. Overpayment is the rounded amount paid - the unrounded amount paid
		double amountoverpaid = (monthsneeded * monthlypayment);
		double overpayment = (amountpaid - amountoverpaid);
		
		//System Output
		System.out.println("Months Needed To Pay Off:\t" + monthsneededceiling);
		System.out.printf("Total Amount Paid:\t\t$%.2f\n", amountpaid);
		System.out.printf("Total Interest Paid:\t\t$%.2f\n", interestpaid);
		System.out.printf("Overpayment:\t\t\t$%.2f\n", overpayment);
		
		
		
		
		
		
		
	
		

	}

}
