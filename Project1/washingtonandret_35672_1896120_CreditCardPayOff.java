/*
* CreditCardPayOff.java
* Author: Andre Washington
* Submission Date: 9/22/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
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
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Principal: ");
		double principal = keyboard.nextDouble();
		System.out.println("Annual Interest Rate (%): ");
		double annualInterestRate = keyboard.nextDouble();
		System.out.println("Monthly: ");
		double monthlyPayment = keyboard.nextDouble();
		
		
		double monthsNeededToPayOff = ((Math.log(monthlyPayment) - (Math.log(monthlyPayment-(annualInterestRate/1200.00) * principal))) / (Math.log((annualInterestRate/1200.00) + 1.0)));
		
		int mnthsNeededToPayOff = (int) Math.ceil(monthsNeededToPayOff);
		System.out.printf("Months Needed To Pay Off:\t" + mnthsNeededToPayOff);
		System.out.println();
		//System.out.printf("Months Needed To Pay" , ".2f");
		
		double theTotalAmountPaid = Math.ceil(mnthsNeededToPayOff * monthlyPayment);
		System.out.printf("Total Amount Paid:\t\t" + Math.ceil(theTotalAmountPaid));
		System.out.println();
		// System.out.printf("Total Amount Paid: " , "%d.2f" , theTotalAmountPaid);
		
		double totalInterestPaid = theTotalAmountPaid - principal;
		System.out.printf("Total Interest Paid:\t\t" + totalInterestPaid);
		System.out.println();
		//System.out.printf("Total Interest Paid: " , "%d.2f"  , Math.ceil(totalInterestPaid));
		
		
		double overPayment = Math.ceil(mnthsNeededToPayOff * monthlyPayment) - (monthsNeededToPayOff * monthlyPayment);
		System.out.printf("Overpayment:\t\t\t$%.2f" , overPayment);
		System.out.println();
		//System.out.printf("Overpayment: " , overPayment );
		
		
		
	}

}
