/*
CreditCardPayOff.java
Author: Bryson Gundry
Submission Date: 9/21/2017

Purpose: The purpose of this lab is to compute and display the
number of months needed to pay off credit card debt. A formula
was used to find these months, and the overpay for it was
also found.
 
Statement of Academic Honesty:
The following code represents my own work. I have neither
received nor given inappropriate assistance. I have not copied
or modified code from any source other than the course webpage
or the course textbook. I recognize that any unauthorized
assistance or plagiarism will be handled in accordance
with the policies at Clemson University and the
policies of this course. I recognize that my work is based
on an assignment created by the School of Computing
at Clemson University. Any publishing or posting
of source code for this project is strictly prohibited
unless you have written consent from the instructor.
*/
import java.util.Scanner;

public class CreditCardPayOff {

	public static void main(String[] args) {
		double  principal, monthlyPayment, annualIntrestRate;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the principal?");
		principal = keyboard.nextDouble();
		
		System.out.println("What is the Annual Intrest Rate (%)?");
		annualIntrestRate = keyboard.nextDouble();
		
		System.out.println("What is the Monthly Payment?");
		monthlyPayment = keyboard.nextDouble();

		double eq, aye, bee, cee, dee, eee, ecks, why, zee, equ;
		aye = Math.log(monthlyPayment);
		bee = monthlyPayment; 
		cee = (annualIntrestRate/1200.0);
		dee = principal;
		ecks = Math.log(bee-cee*dee);
		equ = (aye-ecks)/Math.log(annualIntrestRate/1200.0+1.0);
		zee = Math.ceil(equ);
		double totalPaid = Math.ceil(equ) * monthlyPayment;
		double totalIntrest = totalPaid - principal;
		System.out.println("Principal:\t\t\t"	+ principal);
		System.out.println("Annual Interest Rate (%):\t" + annualIntrestRate);
		System.out.println("Monthly Payment:\t\t" + monthlyPayment);
		System.out.println(" ");
		System.out.println("Months Needed To Pay Off:\t" + zee);
		System.out.printf("Total Amount Paid:\t\t$%.2f", totalPaid);
		System.out.printf("\nTotal Interest Paid:\t\t$%.2f", totalIntrest);
		double overPayment = (Math.ceil(equ) - equ) * monthlyPayment;
		System.out.printf("\nOverpayment:\t\t\t$%.2f", overPayment);
		
		
		
		
		
	}

}
