import java.util.Scanner;

/*
* CreditCardPayOff.java
* Author: Andrew Bare
* Submission Date: 9/22/17
*
* Purpose: 
* 
* This program takes user input for their credit card
* and then calculates how many months it will take to pay it off,
* the total amount they will pay, how much extra (interest) they paid,
* and how much they overpaid due to the ceiling feature of a monthly calculation
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
public class CreditCardPayOff {

	public static void main(String[] args) {
		//for Keyboard Input
		Scanner kb = new Scanner(System.in);
		
		//All Double Variables
		double principal, interestRate, payment, monthsToPay, totalAmount, totalInterest, overpay;
		//int value to hold ceiling values of months to pay
		int intMonthsToPay;
		double tempCeil;	//temp variable for ceiling transfer
		
		//Prompt for inputs in order
		System.out.print("Principal:\t\t\t");
		principal = kb.nextDouble();		
		System.out.print("Annual Interest Rate (%):\t");
		interestRate = kb.nextDouble();
		System.out.print("Monthly Payment:\t\t");
		payment = kb.nextDouble();
		
		//calculate the Months needed to Pay off and turn to integer
		monthsToPay = (Math.log(payment)- (Math.log(payment-(interestRate/1200.0)*principal)))/Math.log((interestRate/1200.0)+1.0);
		tempCeil = Math.ceil(monthsToPay);
		intMonthsToPay = (int)tempCeil; 
		
		//calculate the total paid
		totalAmount = intMonthsToPay*payment;
		
		//calculate interest paid
		totalInterest = totalAmount-principal;
		
		//calculate overpayment
		/*
		 * First Calculate how much the ceiling rounded up
		 * (subtract the ceiling amount from the actual amount)
		 * Then take that fraction of a month and find how much
		 * it's worth with your monthly payment
		 * (multiply the fraction of a month by the monthly payment)
		 */
		overpay = (intMonthsToPay-monthsToPay)*payment;
		
		//Print Results
		System.out.println("");		//Spacer
		System.out.print("Months Needed To Pay Off:\t");
		System.out.println(intMonthsToPay);
		System.out.print("Total Amount Paid:\t\t");
		System.out.printf("$%4.2f",totalAmount);
		System.out.println("");		//Spacer
		System.out.print("Total Interest Paid:\t\t");
		System.out.printf("$%4.2f",totalInterest);
		System.out.println("");		//Spacer
		System.out.print("Overpayment:\t\t\t");
		System.out.printf("$%4.2f",overpay);
		
	}

}


