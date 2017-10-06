/*
* CreditCardaPayoff.java
* Author: Hunter Singletary
* Submission Date: 09/22/2017
*
* Purpose: A program to calculate the amount of time needed
* to pay off a bank loan, the total amount paid, amount
* of interest paid and overpayment based on user input 
* of principal, annual interest rate, and Monthly Payment.
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
		Scanner theScanner = new Scanner(System.in);
		double principal, AnnualInterestRate, MonthlyPayment, MonthsToPayRaw, TotalInterestPaid, TotalAmountPaid, Overpayment; 
		int MonthsToPayRound;
		
		System.out.println("Enter Principal Amount:");
		principal = theScanner.nextDouble();
		
		System.out.println("Enter Annual Interest Rate (%):");
		AnnualInterestRate = theScanner.nextDouble();
		
		System.out.println("Enter Monthly Payment:");
		MonthlyPayment = theScanner.nextDouble();
		
		MonthsToPayRaw = (Math.log(MonthlyPayment)-Math.log(MonthlyPayment-((AnnualInterestRate)/1200.0)*principal))/Math.log(((AnnualInterestRate)/1200.0)+1.0);
		MonthsToPayRound=(int)Math.ceil(MonthsToPayRaw);

		TotalAmountPaid = (MonthsToPayRound*MonthlyPayment);
		TotalInterestPaid = TotalAmountPaid-principal;
		
		// To calculate Overpayment, I simply found the difference of the int value of MonthsToPay
		//multiplied by MonthlyPayment and the Double Value of MonthsToPay times MonthlyPayment.
		
		Overpayment = (MonthsToPayRound*MonthlyPayment)-(MonthsToPayRaw*MonthlyPayment);
		
		System.out.println("Principal:\t\t\t\t$"+principal);
		System.out.println("Annual Interest Rate (%):\t\t"+AnnualInterestRate);
		System.out.println("MonthlyPayment\t\t\t\t$"+MonthlyPayment);
		System.out.println("");
		System.out.println("Months Needed To Pay Off:\t\t"+MonthsToPayRound);
		System.out.println("Total Amount Paid:\t\t\t$"+TotalAmountPaid);
		System.out.println("TotalInterestPaid\t\t\t$"+TotalInterestPaid);
		System.out.println("Overpayment:\t\t\t\t$"+Overpayment);
		

	}

}