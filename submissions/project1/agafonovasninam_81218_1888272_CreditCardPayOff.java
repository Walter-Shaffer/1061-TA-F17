
/*
* CreditCardPayOff.java
* Author: Nina Agafonovas
* Submission Date: 21 September, 2017
* Purpose:This program calculates the number of months needed to pay off credit card debt, and the amount of overpayment.
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
		double principal;
		double monthlyPayment;
		double annualInterestRate ;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter principal amount:\t\t\t");
		principal = keyboard.nextDouble();
		System.out.print("Enter the annual interest rate (%):\t");
		annualInterestRate = keyboard.nextDouble();
		System.out.print("Enter the monthly payment:\t\t");
		monthlyPayment = keyboard.nextDouble();
		double MonthsNeededToPayOff;
		double numerator;
		double denominator;
		numerator = Math.log(monthlyPayment) - Math.log(monthlyPayment-(annualInterestRate/1200.0)*principal);
		denominator = Math.log((annualInterestRate/1200.0)+1.0);
		MonthsNeededToPayOff = numerator/denominator;
		int MonthsNeededToPayOffWholeNumber = (int)Math.ceil(MonthsNeededToPayOff);
		System.out.println("\nMonths Needed To Pay Off:\t\t" + MonthsNeededToPayOffWholeNumber);
		double totalPaid;
		totalPaid = monthlyPayment * MonthsNeededToPayOffWholeNumber;
		System.out.printf("Total Amount Paid:\t\t\t$%.2f",totalPaid);
		double totalInterestPaid;
		totalInterestPaid = totalPaid - principal;
		System.out.println();
		System.out.printf("Total Interest Paid:\t\t\t$%.2f",totalInterestPaid);
		double Overpayment;
		//The overpayment is the difference between the rounded number of months and the exact number of months  multiplied by 100.
		Overpayment = ( MonthsNeededToPayOffWholeNumber - MonthsNeededToPayOff ) * 100; 
		System.out.printf("\nOverpayment:\t\t\t\t$%.2f ",Overpayment);

	}

}
