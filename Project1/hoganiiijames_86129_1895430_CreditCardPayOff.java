/*
* CreditCardPayOff.java
* Author: James Hogan
* Submission Date: 9/22/2017
*
* Purpose: Calculates and prints information about the amount 
* of time it will take to pay off a credit card, with the amount of interest paid, 
* the total amount paid, and the overpayment based off the principal, annual interest rate, and monthly payments.
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
public class CreditCardPayOff 
{
	public static void main(String[] args)
	{
		double principal = 0.00;
		double annualInterestRate = 0.00;
		double monthlyPayment = 0.00;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Principal: \t\t\t");
		principal = input.nextDouble();
		System.out.print("Annual Interest Rate (%): \t");
		annualInterestRate = input.nextDouble();
		System.out.print("Monthly Payment: \t\t");
		monthlyPayment = input.nextDouble();
		
		
		double monthsToPayOff = (Math.log(monthlyPayment)-Math.log(monthlyPayment-(annualInterestRate/1200)*principal))/Math.log((annualInterestRate/1200)+1.0);
		int monthsNeeded = (int) (Math.ceil(monthsToPayOff));
		double totalAmountPaid = monthsNeeded * monthlyPayment;
		double interestPaid = ((monthsNeeded * monthlyPayment) - principal);
		
		/*This calculates the overpayment. Since the amount of months needed is always rounded up, 
		*it takes the actual rounded up amount of time needed to pay off the card (monthsNeeded) and multiplies 
		*it by the monthly payment to get the amount actually payed, and then it subtracts from that number the exact
		*decimal amount of months it should have taken times the amount payed per month. This is the additional amount
		*of interest paid because of the amount of months needed being rounded up.
		*/
		double overpayment = (monthsNeeded * monthlyPayment)-(monthsToPayOff * monthlyPayment);
		
		System.out.println("\n" + "Months Needed to Pay Off:\t" + monthsNeeded);
		System.out.printf("Total Amount Paid: \t\t$%2.2f \n" , totalAmountPaid);
		System.out.printf("Total Interest Paid: \t\t$%2.2f \n" , interestPaid);
		System.out.printf("Overpayment: \t\t\t$%2.2f" , overpayment );
		 
		
	   
	     
	
	}
}
