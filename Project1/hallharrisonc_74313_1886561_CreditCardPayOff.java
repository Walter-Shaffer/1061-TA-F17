/*
* CreditCardPayOff.java
* Author: Harrison Hall
* Submission Date: 21 September 2017
*
* Purpose: This program takes input of principal borrowed,
* yearly interest, and the user's monthly payment to create
* informative payment information.
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

// Imports used libraries
import java.lang.Math;
import java.util.Scanner;
 
//Begin main code
public class CreditCardPayOff {

	public static void main(String[] args) {
		
		double months; //for use later
		
		Scanner input1 = new Scanner(System.in); //input for principal borrowed/loaned
		System.out.print("Principal: \t\t\t");
		double principal = input1.nextDouble();
		
		Scanner input2 = new Scanner(System.in); //input for annual interest rate
		System.out.print("Annual Interest Rate (%): \t");
		double annualInterestRate = input2.nextDouble();
		
		Scanner input3 = new Scanner(System.in); //input for the monthly payment
		System.out.print("Monthly Payment: \t\t");
		double monthlyPayment = input3.nextDouble();

		//close scanners
		input1.close();
		input2.close();
		input3.close();
		
		//calculates months using given formula
		months = (Math.log(monthlyPayment) - Math.log(monthlyPayment - (annualInterestRate * principal / 1200.0))) / (Math.log((annualInterestRate/1200.0) + 1.0));
		
		//rounds months up
		double monthsWhole = Math.ceil(months);
		
		//calculates various helpful information using given or derived formulas
		double totalAmountPaid = monthsWhole * monthlyPayment;
		double interestPaid = totalAmountPaid - principal;
		double overPayment = totalAmountPaid - (months * monthlyPayment);//easy peasy 
		
		//prints helpful information
		System.out.printf("\nMonths Needed To Pay Off: \t%.0f" , monthsWhole);
		System.out.printf("\nTotal Amount Paid: \t\t" + "$%.2f" , totalAmountPaid);
		System.out.printf("\nTotal Interest Paid: \t\t" + "$%.2f" , interestPaid);
		System.out.printf("\nOverpayment: \t\t\t$%.2f" , overPayment);
		
		//program ends
	}

}