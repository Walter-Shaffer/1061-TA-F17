/*
*  CreditCardPayOff.java
* Author: Kevin Okinedo
* Submission Date: 9/22/17
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program uses methods of the String class to output formatted text through using the user input.
* Double and String variables store the input and String variables are concatenated with text for the output.
* Different formulas are used to calculate different variables for the output.
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
		
		double principal, interest, mpayment, paid, interestPaid, overpayment;
		//variables initialized
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter principal:");
		principal = input.nextDouble();
		
		System.out.println("Please enter interest rate:");
		interest = input.nextDouble();
		
		System.out.println("Please enter monthly payment:");
		mpayment = input.nextDouble();
		//variables assigned to input values
		
		System.out.println("Principal:" + "\t\t\t" + " " +  principal);
		System.out.println("Annual Interest Rate (%):" + "\t" + " " +  interest);
		System.out.println("Monthly Payment:" + "\t\t" + " " + mpayment);
		
		
		double months1 = (Math.log(mpayment)-Math.log(mpayment-(interest/1200.00*principal)))/Math.log((interest/1200.0)+1.0);
		//calculates months needed to pay off
		
		double months2 = Math.ceil(months1);
		//rounds the value up
		
		int monthsNeededToPayOff = (int) months2;
		
		paid = mpayment * monthsNeededToPayOff;
		
		interestPaid = (paid - principal);
		//interest paid is calculated and assigned to variable
		
		overpayment = (months2 * mpayment) - (months1 * mpayment);
		//calculates overpayment
		//overpayment = ((amonut of months (rounded) * monthly payment) - (amount of months *monthly payment))
		
		System.out.println(" ");
		System.out.println("Months Needed To Pay Off:" + "\t" + " " + monthsNeededToPayOff);
		System.out.printf("\nTotal Amount Paid:\t\t $%.2f" , paid);
		System.out.printf("\nTotal Interest Paid:\t\t $%.2f" , interestPaid);
		System.out.printf("\nOverpayment:\t\t\t $%.2f" , overpayment);
	}

}
