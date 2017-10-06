/*
* [CreditCardPayOff].java
* Author: [Andrew Padgett]
* Submission Date: [9/19/17]
*
* Purpose: Calculates and displays the number of months
* 		   needed to pay off credit card debt.
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
	public static void main(String[]args){
		
		double principal;            //declare variables
		double annualInterestRate;
		double monthlyPayment;
		double monthsNeededToPayOff;
		
		
		Scanner input = new Scanner(System.in);     //create a scanner object
		
		
		System.out.print("Principal:\t\t\t");		//print input requests
		principal = input.nextDouble();
		System.out.print("Annual Interest Rate(%):\t");
		annualInterestRate = input.nextDouble();
		System.out.print("Monthly Payment:\t\t");
		monthlyPayment = input.nextDouble();
		System.out.println("");
		
		input.close();						//close scanner
		
		double lnMonthlyPayment = Math.log(monthlyPayment);												//calculations
		double lnPrincipal = Math.log(monthlyPayment - (annualInterestRate / 1200.0) * principal);
		double lnAnnualInterestRate = Math.log((annualInterestRate / 1200.0)+1.0);
		monthsNeededToPayOff = (lnMonthlyPayment - lnPrincipal) / lnAnnualInterestRate;
		int roundedMonthsNeededToPayOff = (int) Math.ceil(monthsNeededToPayOff);
		double totalAmountPaid = monthsNeededToPayOff * monthlyPayment;
		double roundedTotalAmountPaid = roundedMonthsNeededToPayOff * monthlyPayment;
		double totalInterestPaid = roundedTotalAmountPaid - principal;
		
		/*
		 * Overpayment is simply the difference between what someone
		 * paid in rounded number of months and what they should have paid if
		 * the payment was based on days instead of months. So the algorithm is
		 * the total amount paid over the months minus the amount the person
		 * would have paid if it were based on days instead of months.
		 */
		double overpayment = roundedTotalAmountPaid - totalAmountPaid;
		
		
		System.out.println("Months Needed To Pay Off:\t" + roundedMonthsNeededToPayOff);				//print output
		System.out.printf("Total Amount Paid:\t\t$%4.2f", roundedTotalAmountPaid);
		System.out.printf("\nTotal Interest Paid:\t\t$%4.2f", totalInterestPaid);
		System.out.printf("\nOverpayment\t\t\t$%4.2f", overpayment);
		
		
	}

}
