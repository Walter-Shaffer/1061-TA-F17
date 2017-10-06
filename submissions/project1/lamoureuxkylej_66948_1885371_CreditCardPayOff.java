/*
* CreditCardPayOff.java
* Author: Kyle Lamoureux
* Submission Date: 9/22/17
*
* Purpose: To display the number of months needed to pay
* off credit card debt based on various user inputs.
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
		
	// Initialize Values
		
		double principal = 0;
		double monthlyPayment = 0;
		double annualInterestRate = 0;
		
	// User Interface and Inputs
		
		Scanner keyboard = new Scanner(System.in);
				
		System.out.print("Principle: ");
		principal = keyboard.nextDouble();
		System.out.print("Annual Interest Rate (%): ");
		annualInterestRate = keyboard.nextDouble();
		System.out.print("Monthly Payment: ");
		monthlyPayment = keyboard.nextDouble();
		System.out.print("");
		
		keyboard.close();
		
	//Equations for months to pay off and total value (decimal and rounded up)
		
		// Broken-down Equation
				
			double naturalMonthlyPayment = Math.log(monthlyPayment);
			double adjustedPayment = Math.log(monthlyPayment - (annualInterestRate/1200.0) * principal);
			double adjustedRate = Math.log((annualInterestRate/1200.0) + 1.0);
				
		double monthsNeededToPayOff = (naturalMonthlyPayment - adjustedPayment) / adjustedRate;
		int monthsNeededToPayOffRounded = (int)Math.ceil(monthsNeededToPayOff);
		
	/*
	 This was my original equation. The sheer amount of parenthesis made it too hard to find the errors in it so I broke it down into multiple parts.
	 double monthsNeededToPayOff = ((Math.log(monthlyPayment)) - (Math.log((monthlyPayment) - ((annualInterestRate/1200.0) * principal)))) / (Math.log(((annualInterestRate) /1200.0 )) + 1.0);
	*/
			
		
	//Formula for overpayment -- based on the difference of rounded up debt and actual debt -- and total payments
		
		double totalPayment = monthsNeededToPayOffRounded * monthlyPayment;	
		double totalInterest = (totalPayment - principal);
		double overpayment = (totalPayment - (monthsNeededToPayOff * monthlyPayment));
	
	//Results
		
		System.out.println("Months Needed to Pay Off: \t " + monthsNeededToPayOffRounded);
		System.out.printf("Total Amount Paid: \t\t $%.2f", totalPayment);
		System.out.println();
		System.out.printf("Total Interest Paid: \t\t $%.2f", totalInterest);
		System.out.println();
		System.out.printf("Overpayment: \t\t\t $%.2f", overpayment);
		
	}

}
