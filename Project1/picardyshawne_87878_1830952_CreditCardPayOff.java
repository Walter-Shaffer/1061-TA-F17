/*
* CreditCardPayOff.java

* Author: Shawn Picardy
* Submission Date: 9/8/17
* 
* Purpose: The following application is designed to compute and display the
* number of months needed to pay off credit card debt while also yielding the total 
* amount paid, total interest paid, and the loan overpayment. It contains a number of
* variable assignment statements and input/output statements. The user is prompted
* to enter three figures: the principal balance, the annual interest rate, and the
* monthly payment. 
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

public class CreditCardPayOff {

	public static void main(String[] args) {
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter loan principal
		System.out.print("Principal:\t\t\t");
		double principal = input.nextDouble();
		
		// Prompt the user to enter the annual interest rate
		System.out.print("Annual Interest Rate (%):\t");
		double annualInterestRate = input.nextDouble();
		
		// Prompt the user to enter the monthly payment
		System.out.print("Monthly Payment:\t\t");
		double monthlyPayment = input.nextDouble();
		
		// Close Scanner object
		input.close();
		
		// Assign variables to user inputs
		double x, y, z;
		x = principal;
		y = annualInterestRate;
		z = monthlyPayment;
		
		// Compute number of months needed to pay off debt
		double k = Math.log((y / 1200.0) + 1);
		double monthsNeededToPayOffDebt = ((Math.log(z) - Math.log(z - ((y / 1200.0) * x))) / k);
		int ceilingOfMonthsNeeded = (int) Math.ceil(monthsNeededToPayOffDebt);
		
		
		// Display Months need to pay off debt; introduce the escape sequence "\n" to create a blank line in output
		System.out.println("\nMonths Needed To Pay Off:\t" + ceilingOfMonthsNeeded);
						
		// Compute total amount paid
		double totalAmountPaid = z * ceilingOfMonthsNeeded;
		
		// Display total amount paid
		System.out.printf("Total Amount Paid:\t\t$%4.2f\n", totalAmountPaid);
		
		// Compute total amount of interest paid
		double totalInterestPaid = totalAmountPaid - x;
		
		// Display total amount of interest paid
		System.out.printf("Total Interest Paid:\t\t$%4.2f\n", totalInterestPaid);
				
		// Compute Overpayment; The overpayment is the difference of total amount paid and total amount owed 
		double overpayment = totalAmountPaid - (monthsNeededToPayOffDebt * z);
		
		// Display Overpayment
		System.out.printf("Overpayment:\t\t\t$%4.2f\n", overpayment);	
				
		
	}

}

