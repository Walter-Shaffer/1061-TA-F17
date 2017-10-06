
/*
* CreditCardPayOff.java
* Author: Jeffrey Wang
* Submission Date: 9/18/2017
*
* Purpose: Finds the number of months needed to pay off credit card debt.
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
* hoursPerWeek = keyboard.nextInt();
* unless you have written consent from the instructor.
*/
import java.util.Scanner;
public class CreditCardPayOff {
	public static void main(String[] args) {
		//inputs
		Scanner keyboard = new Scanner(System.in);
		System.out.println("In dollars($), how much credit card debt have you managed to rack up?");
		double principal = keyboard.nextDouble();
		System.out.println("In percent(%), how much is your credit card's annual interest rate?");
		double annualInterestRate = keyboard.nextDouble();
		System.out.println("In dollars($), how much do you pay for each monthly payment?");
		double monthlyPayment = keyboard.nextDouble();
		//formula to get number of months
		double numberOfMonthsDouble =
		(Math.log(monthlyPayment) - Math.log(monthlyPayment - ((annualInterestRate / 1200.0) * principal))) / 
		Math.log((annualInterestRate/1200.0)+1.0);
		//int value of number of months
		int numberOfMonthsCeil = (int) Math.ceil(numberOfMonthsDouble);
		//additional assignments
		double totalAmountPaid = numberOfMonthsCeil * monthlyPayment;
		double totalInterestPaid = totalAmountPaid - principal;
		//
		//overpayment psuedocode:
		//true debt = number of months * monthly payment
		//overpayment = (ceiling of months * monthly payment) - true debt
		//
		//overpayment code
		double overpayment = totalAmountPaid - (numberOfMonthsDouble * monthlyPayment);
		//print statements
		System.out.println("Principal:\t\t\t" + principal);
		System.out.println("Annual Interest Rate (%):\t" + annualInterestRate);
		System.out.println("Monthly Payment:\t\t" + monthlyPayment);
		System.out.println("");
		System.out.println("Months Needed To Pay Off:\t" + numberOfMonthsCeil);
		System.out.printf("Total Amount Paid:\t\t$%01.2f\n", totalAmountPaid);
		System.out.printf("Total Interest Paid:\t\t$%01.2f\n", totalInterestPaid);
		System.out.printf("Overpayment:\t\t\t$%01.2f\n", overpayment);
	}

}
