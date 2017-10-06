/*
 * [CreditCardPayOff].java 
 * Author: [Aneri Desai]
 * Submission Date: [09/19/2017]
 * 
 * Purpose: In the project, create a output of creditcard pay off using variables, assignments, expressions, type casting, and 
 * basic algorithm design. Apply your knowledge of what you learn so far and get the desired result for the examples shown.
 * 
 * Statement of Academic Honesty:
 *  
 * The following code represent my own work. I have neither received nor given inappropriate assistance. 
 * I have not copied or modified code from any source other than the course webpage or the course textbook.
 * I recognize that any unauthorized assistance or plagiarism will be handled in accordance with the policies
 * at Clemson University and the policies of this course. I recognize that my work is based on an assignment 
 * created by the School of Computing at Clemson Univeristy. Any publishing or posting of source code for this 
 * project is strictly prohibited unless you have written consent from the instructor.  
 */

import java.util.Scanner; //import Scanner class

public class CreditCardPayOff { //class name CreditCardPayOff
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //declare Scanner object input
		
		// Prompt the users to give principal amount, annual interest rate, and the monthly payment
		//declare variables

		System.out.print("Enter the principal amount, the amount of money owned on the credit card, e.g., $1234.50:" + "\t\t" ); //\t to give space 
		double principal = input.nextDouble(); //add read statement
		
		System.out.print("Enter the annual interest rate, e.g., 2.10%, (%):" + "\t\t\t\t\t\t\t");
		double annualInterestRate = input.nextDouble();
		
		System.out.print("Enter the monthly payment, e.g., $1988.00:" + "\t\t\t\t\t\t\t\t");
		double monthlyPayment = input.nextDouble();
		
		//months need to pay off formula and use math class for the ln function

		double monthsneededtopayoff  = ((Math.log(monthlyPayment) - Math.log(monthlyPayment - (annualInterestRate/1200.0) * principal)) / (Math.log((annualInterestRate/1200.0)+ 1.0)));
		int MonthsNeedToPayoff = (int) Math.ceil(monthsneededtopayoff); //declare the months need to pay off integer and use ceil method to round up the number
		
		double totalAmountPaid = Math.ceil(MonthsNeedToPayoff) * monthlyPayment;
		double totalInterestPaid = totalAmountPaid - principal;
		double overpayment = monthlyPayment * (MonthsNeedToPayoff - monthsneededtopayoff);
		
		//write println statement to get the output
		System.out.println("\nPrincipal:" + "\t\t\t\t\t" + principal ); //\n for the new line
		System.out.println("Annual Interest Rate (%):" + "\t\t\t" + annualInterestRate);
		System.out.println("Monthly Payment:" + "\t\t\t\t" + monthlyPayment);
		System.out.println("\nMonths Needed To Pay Off:" + "\t\t\t" + ((MonthsNeedToPayoff)));
		System.out.printf("Total Amount Paid:" + "\t\t\t\t" + "$%6.2f" , (totalAmountPaid)); //%6.2f to get the value to round up to 2 decimal point using pintf method
		System.out.printf("\nTotal Interest paid:" + "\t\t\t\t" +  "$%6.2f" , (totalInterestPaid));
		System.out.printf("\nOverpayment:\t\t\t\t\t" + "$%3.2f" , overpayment);
		
		

	}

}