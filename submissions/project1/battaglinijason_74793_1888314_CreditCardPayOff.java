/*
* CreditCardPayOff.java
* Author: [Jason Battaglini]
* Submission Date: [9/21/17]
*
* Purpose:This program will tell the use how many months
* it will take them to pay off their credit card debt.
* The months needed to pay off debt will be calculated after
* the user inputs the principal, annual interest rate,
* and the amount of the Monthly payment,
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
import java.lang.Math;
public class CreditCardPayOff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the principal: ");
		double principal= keyboard.nextDouble();
		System.out.println("Enter the annual interest rate: ");
		double annualInterestRate=keyboard.nextDouble();
		System.out.println("Enter the monthly payment: ");
		double monthlyPayment= keyboard.nextDouble();
		double payOff= (Math.log(monthlyPayment)-Math.log(monthlyPayment-(annualInterestRate/1200.0)*principal))/Math.log((annualInterestRate/1200.0)+1.0);
		//formula reformatted to work in java
		
		int a=(int)Math.ceil(payOff);
		//new int created to prevent errors
		
		double totalAmountPaid=(a*monthlyPayment);
		double totalInterestPaid=-1*(principal-totalAmountPaid);
		
		double overPayment=(totalAmountPaid-payOff*monthlyPayment);
		//(totalAmountPaid-payOff*monthlyPayment) is the formula 
		//for calculating the Overpayment.
		
		System.out.printf("Principal: \t\t\t%.2f\n",principal);
		System.out.printf("Annual Interest Rate: \t\t%.2f\n",annualInterestRate);
		System.out.printf("Monthly Payment: \t\t%.2f\n",monthlyPayment);
		System.out.println("Months Needed to Pay Off:\t" + a);
		System.out.printf("Total Amount Paid: \t\t$%.2f\n",totalAmountPaid);
		System.out.printf("Total Interest Paid: \t\t$%.2f\n",totalInterestPaid);
		System.out.printf("Overpayment: \t\t\t$%.2f\n", overPayment);
		
		
		


	}

}


