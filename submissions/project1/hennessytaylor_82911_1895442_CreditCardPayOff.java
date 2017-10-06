//import the scanner object and math class
import java.util.Scanner;
import java.math.*;

public class CreditCardPayOff {

	/*
	* CreditCardPayOff.java
	* Author: Taylor Hennessy
	* Submission Date: 9/21/2017
	*
	* Purpose: This program computes and displays the number 
	* of months needed to pay off credit card debt.
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
	//scanner object to read 
	public static Scanner inputScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		//----------------------------------VARIABLES-------------------------
		//create variables for holding input values
		double principal;
		double annualInterestRate;
		double monthlyPayment;
		
		//create variables for holding computations
		int monthsToPay;
		double rawMonthsToPay;
		double numerator;
		double denominator;
		double totalPaid;
		double totalInterestPaid;
		double overpayment;
		
		
		//-----------------------------------PROMPTS-------------------------
		//PROMPTS FOR INPUT VALUES
		System.out.println("Please enter the following data:");
		
		//Ask for the Principal
		System.out.print("Principal:\t\t\t\t");
		//stop and wait for data to assign
		principal = inputScanner.nextDouble();
		
		//Ask for the Interest Rate
		System.out.print("Annual Interest Rate (%):\t\t");
		//stop and wait for data to assign
		annualInterestRate = inputScanner.nextDouble();
		
		//Ask for the Monthly Payment
		System.out.print("Monthly Payment:\t\t\t");
		//stop and wait for data to assign
		monthlyPayment = inputScanner.nextDouble();
		
		//---------------------------------LET'S COMPUTE--------------------
		//number of months formula ! > separated into n/d chunks logically named n and d
		numerator = (Math.log(monthlyPayment)) - (Math.log(monthlyPayment - (((annualInterestRate)/1200.0)*(principal))));
		denominator = Math.log(((annualInterestRate)/1200.0)+1.0);
		rawMonthsToPay = (numerator)/(denominator);
		monthsToPay = (int)Math.ceil(rawMonthsToPay);
		
		//calculate total paid and total interest paid
		totalPaid = monthlyPayment * monthsToPay;
		totalInterestPaid = totalPaid - principal;
		
		//calculating overpayment
		//the difference between the exact months to pay, and the rounded months to pay, times monthly payment
		overpayment = (-1)*(rawMonthsToPay - monthsToPay)*(monthlyPayment);
		
		
		//----------------------------------LET'S PRINT--------------------
		 
		System.out.println("\nMonths Needed To Pay Off:\t\t" + Integer.toString(monthsToPay));
		System.out.printf("Total Amount Paid:\t\t\t$%.2f.%n", totalPaid);
		System.out.printf("Total Interest Paid:\t\t\t$%.2f.%n", totalInterestPaid);
		System.out.printf("Overpayment:\t\t\t\t$%.2f.%n", overpayment);

	}

}
