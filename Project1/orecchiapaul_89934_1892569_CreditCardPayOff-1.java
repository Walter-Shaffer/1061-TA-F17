/* 
 * 
 * CreditCardPayOff.java 
 * Author:  Paul Orecchia  
 * Submission Date:  9/22/17 
 * 
 * Purpose: The purpose of this program is to calculate the
 * months needed to pay off, the total amount paid, the total 
 * interest paid, and the overpayment by inputting the 
 * principal, interest rate and monthly payment.
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
		Scanner Keyboard= new Scanner(System.in);
		
		// lines 35-40 ask for the user to input the three variables
		System.out.print("Principal:\t\t\t"); 
		double principal=Keyboard.nextDouble();
		System.out.print("Annual Interest Rate (%):\t");
		double annualInterestRate=Keyboard.nextDouble();
		System.out.print("Monthly Payment:\t\t");
		double monthlyPayment=Keyboard.nextDouble();
		// the users inputs are put through the equation on lines 42-44 
		double monthsNeededToPayOff= (Math.log(monthlyPayment)-
			Math.log(monthlyPayment-(annualInterestRate/1200.0)*principal))/
			(Math.log((annualInterestRate/1200.0)+1.0));
		//lines 46-47 monthsNeededToPay is converted from a double to an integer and is displayed
		int monthsNeededToPayOffInt=(int)Math.ceil(monthsNeededToPayOff);
		System.out.println("\nMonths Needed To Pay Off:\t"+monthsNeededToPayOffInt);
		// the last three variables are calculated and displayed on screen
		double totalAmountPaid= monthsNeededToPayOffInt*monthlyPayment;
		System.out.printf("Total Amount Paid:\t\t$%.2f",totalAmountPaid);
		double totalInterestPaid=totalAmountPaid-principal;
		System.out.printf("\nTotal Interest Paid:\t\t$%.2f",totalInterestPaid);
		double overpayment=(monthsNeededToPayOffInt-monthsNeededToPayOff)*monthlyPayment;
		System.out.printf("\nOverpayment:\t\t\t$%.2f",overpayment);
		Keyboard.close();
	}

}
