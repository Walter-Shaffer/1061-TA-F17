//CreditCardPayoff.java
//Author: Benjamin VonKeller
//Submission Date: 9/12/2017
//Purpose: This program will determine the number of months necessary to pay off a credit card given the annual interest, amount owed, and the monthly payment.
//Statement of Academic Honesty:
//The following code represents my own work. I have neither
//received nor given inappropriate assistance. I have not copied
//or modified code from any source other than the course webpage
//or the course textbook. I recognize that any unauthorized
//assistance or plagiarism will be handled in accordance
//with the policies at Clemson University and the
//policies of this course. I recognize that my work is based
//on an assignment created by the School of Computing
//at Clemson University. Any publishing or posting
//of source code for this project is strictly prohibited
//unless you have written consent from the instructor.
import java.util.Scanner;
public class CreditCardPayOff {

	public static void main(String[] args) {
		double monthsNeeded, principal, annualInterest, monthlyPayment, naturalLogOfMonthlyPayment, interestRateOver1200, topSideFunction, lnTopSideFunction, numerator, denominator, bottomFunction, totalPayment, totalInterest, overpayment, realTotal;
		int monthsNeededCeil;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the principal on the card?");
		principal = keyboard.nextDouble();
		System.out.println("What is the annual interest rate?");
		annualInterest = keyboard.nextDouble();
		System.out.println("What is your monthly payment?");
		monthlyPayment = keyboard.nextDouble();
		naturalLogOfMonthlyPayment = Math.log(monthlyPayment);
		interestRateOver1200 = annualInterest/1200;
		topSideFunction = monthlyPayment - interestRateOver1200 * principal;
		lnTopSideFunction = Math.log(topSideFunction);
		numerator = naturalLogOfMonthlyPayment - lnTopSideFunction;
		bottomFunction = interestRateOver1200 + 1;
		denominator = Math.log(bottomFunction);
		monthsNeeded = numerator/denominator;
		monthsNeededCeil = (int)Math.ceil(numerator/denominator);
		totalPayment = monthsNeededCeil * monthlyPayment;
		totalInterest = totalPayment - principal;
		realTotal = monthsNeeded * monthlyPayment;
		overpayment = totalPayment - realTotal;
		System.out.printf("Principal:\t\t\t" + "$%1.2f", principal);
		System.out.println("");
		System.out.println("Annual Interest Rate(%):\t" + annualInterest);
		System.out.printf("Monthly Payment:\t\t" + "$%1.2f", monthlyPayment);
		System.out.println("");
		System.out.println("");
		System.out.println("Months Needed to Pay Off:\t" + monthsNeededCeil);
		System.out.printf("Total amount paid:\t\t$%1.2f", totalPayment);
		System.out.println("");
		System.out.printf("Total interest paid:\t\t$%1.2f", totalInterest);
		System.out.println("");
		System.out.printf("Overpayment:\t\t\t$%1.2f", overpayment);
	}

}
