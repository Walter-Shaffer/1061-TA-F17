/*
* CreditCardPayOff.java
* Author: Patrick Coffee
* Submission Date: 9/21/17
*
* Purpose: A brief paragraph description of the
* program. What does it do? It calculates the months needed, total amount paid, total interest
* paid, and the overpayment based on several factors.
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
import java.lang.*;

public class CreditCardPayOff 
{

	public static void main(String[] args)
	{
	System.out.print("Principal:\t\t\t");
		Scanner keyboard = new Scanner(System.in);
			double principal;
				principal = keyboard.nextDouble();
			
	System.out.print("Annual Interest Rate: (%)\t");
		Scanner keyboard2 = new Scanner(System.in);
			double annualinterestrate;
				annualinterestrate = keyboard2.nextDouble();
				
	System.out.print("Monthly Payment:\t\t");
		Scanner keyboard3 = new Scanner(System.in);
			double monthlyPayment;
				monthlyPayment = keyboard3.nextDouble();
				
	double MONTHS_NEEDED_TO_PAY_OFF = (java.lang.Math.log(monthlyPayment) - (java.lang.Math.log(monthlyPayment - (annualinterestrate/1200.0) * principal))) / (java.lang.Math.log(annualinterestrate/1200.0 +1.0));
	int monthsNeededToPayOff = (int) Math.ceil(MONTHS_NEEDED_TO_PAY_OFF);
	double totalAmountPaid = Math.ceil(MONTHS_NEEDED_TO_PAY_OFF) * (monthlyPayment);
		// Just as a helpful comment, It took me forever to figure out how to calculate overpayment.
		// But when I finally did, the feeling was indescribable. 
		// The overpayment is calculated by what you actually paid minus what you should have paid.
	double overpayment = (totalAmountPaid) - (MONTHS_NEEDED_TO_PAY_OFF * monthlyPayment);	
	double totalInterestPaid = (totalAmountPaid - principal);
	
		System.out.println();
		System.out.print("Months Needed To Pay Off:\t" + (monthsNeededToPayOff));
		System.out.println();
		System.out.printf("Total Amount Paid:\t\t$" + ("%.2f") , (totalAmountPaid));
		System.out.println();
		System.out.printf("Total Interest Paid:\t\t$" + ("%.2f") , (totalInterestPaid));
		System.out.println();
		System.out.printf("Overpayment:\t\t\t$" + ("%.2f") , overpayment);
		
	}
}
