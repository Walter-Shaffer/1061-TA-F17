/* CreditCardPayOff.java
  Author: Emily Potts
  Submission Date: September 22, 2017 

  Purpose: The purpose of Credit Card Pay Off is to compute 
  and then display the number of months it will take to pay 
  off a credit card debt based on the principle, annual interest rate, 
  and monthly payment amounts inputed by the user. It also computes the overpayment.

  Statement of Academic Honesty:

  The following code represents my own work. I have neither
  received nor given inappropriate assistance. I have not copied
  or modified code from any source other than the course webpage
  or the course textbook. I recognize that any unauthorized
  assistance or plagiarism will be handled in accordance
  with the policies at Clemson University and the
  policies of this course. I recognize that my work is based
  on an assignment created by the School of Computing
  at Clemson University. Any publishing or posting
  of source code for this project is strictly prohibited
  unless you have written consent from the instructor. 
 */

import java.util.Scanner; 

public class CreditCardPayOff {

	public static void main(String[] args) {
		//Create Scanner object 
		Scanner keyboard = new Scanner(System.in);
		
		//Variables prompted from user
		double principle;
		double annualInterestRate;
		double monthlyPayment;
		
		//Variables for final results
		double monthsNeededToPayOff;
		int monthsNeededToPayOffCeiling;
		double totalAmountPaided;
		double totalInterestPaided;
		double overpayment; 
		
		//Ask user for all inputs 
		System.out.print("Enter the amount of money owed on credit card (principle): ");
		principle = keyboard.nextDouble(); 
		System.out.print("Enter the annual interest rate (as percent): ");
		annualInterestRate = keyboard.nextDouble();
		System.out.print("Enter the monthly payment: ");
		monthlyPayment = keyboard.nextDouble();
		
		
		//Months needed to pay off credit card calculation
		monthsNeededToPayOff = ((Math.log(monthlyPayment)- Math.log(monthlyPayment - (annualInterestRate/1200.0) * principle)) / Math.log((annualInterestRate/1200.0) +1.0));
		
		//Calculation output made to ceiling integer
		monthsNeededToPayOffCeiling = (int) Math.ceil(monthsNeededToPayOff);
		
		//Calculation of total amount needed to pay to credit card company
		totalAmountPaided = monthsNeededToPayOffCeiling * monthlyPayment;
		
		//Calculation of total interest paid to credit card company 
		totalInterestPaided = totalAmountPaided - principle; 
		
		/*Pseudocode for getting overpayment calculation 
		1. Calculate the difference between the ceilinged month number 
		and the not ceiling month number 
		(This tells us how far into the previous month the payment was covered and
		therefore what decimal part of the month was over paid)
		2. Multiply the previous total by the monthly payment 
		3. Get overpayment 
		*/
		
		//Calculation of Overpayment
		overpayment = ((monthsNeededToPayOffCeiling - monthsNeededToPayOff) * monthlyPayment );
		
		//Display user inputs
		System.out.println("\nPrinciple:\t\t\t" + principle);
		System.out.println("Annual Interest Rate (%):\t" + annualInterestRate);
		System.out.println("Monthly Payment:\t\t" + monthlyPayment);
		
		//Display results of computations 
		System.out.println("\nMonths Needed To Pay Off:\t" + monthsNeededToPayOffCeiling);
		System.out.printf("Total Amount Paided:\t\t$%4.2f", totalAmountPaided);
		System.out.printf("\nTotal Interst Paided:\t\t$%4.2f", totalInterestPaided);
		System.out.printf("\nOverpayment:\t\t\t$%4.2f", overpayment);

	}

}
