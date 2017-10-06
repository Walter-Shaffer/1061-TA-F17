/*
* [CreditCardPayOff].java
* Author: [Anthony Frazier]
* Submission Date: [9/21/2017]
*
* Purpose: This program takes user input for principal,interest rate, and monthly
* payment in order to compute how many months it takes to pay off the debt, the
* total amount paid, the interest paid, and the overpayment.
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
		// Here I declare all my variables
		double principal;
		double annualIntrestRate;
		double monthlyPayment;
		double monthsToPayOff;
		double interestPaid;
		double totalPaid;
		
		//Here I initialize the scanner and take input for principal amount
		Scanner input = new Scanner(System.in);
		System.out.print("Enter principal amount:\t\t ");
		principal = input.nextDouble();
		
		//Here I take input for the annual interest rate
		System.out.print("Enter Intrest Rate percentage:\t ");
		annualIntrestRate = input.nextDouble();
		
		//Here I take input for the monthly payment
		System.out.print("Enter monthly payment:\t\t ");
		monthlyPayment = input.nextDouble();
		
		input.close();
		
		/*Here I apply the formula to compute the months to pay off we
		 * were given. I do this by splitting the formula into a 
		 * numerator and a denominator, computing them separately, and then
		 * dividing them. After this I create a new variable and assign it the ceil
		 * of the months to pay off.
		 */
		double numerator = Math.log(monthlyPayment)-Math.log(monthlyPayment-(annualIntrestRate/1200.0)*principal);
		double denominator = Math.log((annualIntrestRate/1200.0) + 1);
		monthsToPayOff = numerator/denominator;
		double monthsToPayOffFinal = Math.ceil(monthsToPayOff);
		System.out.println("\nMonths needed to pay off:\t " + monthsToPayOffFinal);
		
		//Here I compute the total amount paid by multiplying months by monthly payment
		totalPaid = monthsToPayOffFinal * monthlyPayment;
		System.out.printf("Total amount paid:\t\t $%4.2f",totalPaid);
		
		//Here i compute interest paid by subtracting the total paid from the principal
		interestPaid = totalPaid - principal;
		System.out.printf("\nIntrest paid:\t\t\t $%4.2f",interestPaid);
		
		/*This next section is where the program computes overpayment
		 * First I initialize the overPayment variable as double, and
		 * then I took the ceiling value of months to pay off, that is
		 * the months to pay off rounded up, and subtracted the 
		 * unrounded number of months to pay off from it. This would
		 * give me the portion of a month that dosn't actually need
		 * to be paid. I then multiplied this by the monthly payment
		 * to get my overpayment value.
		*/
		double overPayment = (monthsToPayOffFinal - monthsToPayOff);
		overPayment = overPayment * monthlyPayment;
		System.out.printf("\nOverPayment:\t\t\t $%4.2f",overPayment);
	}

}
