/*
* CreditCardPayOff.java
* Author: Jack Maggard
* Submission Date: 9/17/2017]
*
* Purpose: A brief paragraph description of the
* program. What does it do?
*This program calculates the months it would take to pay off a credit card. 
*It requires three variables to be inputed by the user in order to calculate the 
*months, amount paid, interest paid, and overpayment.
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
import java.math.*;
import java.text.*;
import java.util.Scanner;
public class CreditCardPayOff {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner (System.in);
		System.out.print("Principal:\t\t\t");
		double princ=keyboard.nextDouble(); //getting variables from user
		System.out.print("Annual Interest Rate (%):\t");
		double interest=keyboard.nextDouble();
		System.out.print("Monthly Payment\t\t\t");
		double monthly=keyboard.nextDouble();
		System.out.println();
		double b1=interest/1200.0;
		double b2=b1*princ;
		double b3=monthly-b2;
		double bf=Math.log(monthly)-Math.log(b3);
		//Simplifying the math as much as possible allows for less mistakes since I am new to Java
		double c1=(interest/1200.0);
		double cf=Math.log(c1+1.0);
		//b denotes the numerator and its respective functions. c=the denominator
		double payOff=bf/cf;
		int payOff1=(int) Math.ceil(bf/cf);
		System.out.println("Months Needed To Pay Off:\t"+payOff1);
		double paid=monthly*payOff1;
		/* Since the months to pay off variable is a rounded up number, 
		 * I just took the difference of the raw double and int form of payoff 
		 * and multiplied that difference by the monthly rate. For instance, if the user pays 
		 * for 4 months but it only technically takes 3.6 months to pay off, the 
		 * user paid 2/5 of a monthly payment too much.
		 */
		double over1=monthly*(payOff1-payOff); 
		/*Interest was relatively easy to calculate because 
		 * I was given the starting value and a function to 
		 * determine the final value
		 */		
		System.out.printf("Total Amount Paid:\t\t$%4.2f", paid);
		System.out.println();
		System.out.printf("Total Interest Paid:\t\t$%4.2f", (paid-princ));
		System.out.println();
		System.out.printf("Overpayment:\t\t\t$%4.2f", over1);
		//examples of the printf method were found in the book

	}

}
