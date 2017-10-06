/*
* CreditCardPayOff.java
* Author: Ronald (Trip) Bastian
* Submission Date: 22 September 2017
*
* Purpose: Do demonstrate our proficiency in the Java language by calculating 
* 		   how long it'll take to pay off a credit card from user inputs.
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
		//Getting the Inputs
		Scanner input = new Scanner(System.in);
		System.out.print("Principal:\t\t\t");
		double principal = input.nextDouble();
		System.out.print("Annual Interest Rate (%):\t");
		double interest = input.nextDouble();
		System.out.print("Monthly Payment:\t\t");
		double payments = input.nextDouble();
		//Calculating the number of months needed and other things
		double monthsNeeded = (Math.log(payments)-Math.log(payments-(interest/1200)*principal))/(Math.log((interest/1200)+1));
		int monthsProper = (int) monthsNeeded + 1;
		double overpayment = Math.floor(((monthsProper*payments)-(monthsNeeded*payments))*100)/100;
		double amountPaid = monthsProper*payments;
		double interestPaid = Math.floor((amountPaid-principal)*100)/100;
		//Output
		System.out.println("");
		System.out.println("Months Needed to Pay Off:\t"+monthsProper);
		System.out.println("Total Amount Paid:\t\t$"+amountPaid);
		System.out.println("Total Interest Paid:\t\t$"+interestPaid);;
		System.out.println("Overpayment:\t\t\t$"+overpayment);
	}
}