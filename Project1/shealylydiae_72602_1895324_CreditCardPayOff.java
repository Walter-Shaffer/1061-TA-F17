import java.util.Scanner;
/*
 * CreditCardPayOff.java
 * Author: Lydia Shealy
 * Submission Date: 9/22/17
 * 
 * Purpose: to calculate the months needed to pay off, total amount paid, total interest paid, 
 * and overpayment to a credit card company by applying knowledge of variables, assignments, 
 * expressions, type casting, input and output, and basic algorithmic designs.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work, I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance 
 * with the policies at Clemson University and the 
 * policies of this course. I recognize that my work is based
 * on an assignment created by the School of Computing
 * at Clemson University. Any publishing or posting
 * of source code from this project is strictly prohibited 
 * unless you have written consent from the instructor. 
 */


public class CreditCardPayOff {
	

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double principal, annualInterestRate, monthlyPayment; //input variables from user 
		double totalAmountPaid, totalInterestPaid, overpayment; //output variables 
		
		//assigning values to these input doubles^
		System.out.print("Principal:\t\t\t");
		principal = keyboard.nextDouble();
		
		System.out.print("Annual Interest Rate(%):\t");
		annualInterestRate = keyboard.nextDouble();
		
		System.out.print("Monthly Payment:\t\t");
		monthlyPayment = keyboard.nextDouble();		
		keyboard.close();
		
		//months needed to pay off
		double monthsNeededRaw; //raw value of months needed
		int monthsNeededCeil; //ceiling value of months needed 
			
		//provided formula 
		monthsNeededRaw = (Math.log(monthlyPayment) - Math.log(monthlyPayment - (annualInterestRate/1200.0) * principal))/(Math.log((annualInterestRate/1200.0)+1.0));
		monthsNeededCeil = (int) Math.ceil(monthsNeededRaw);
		 
		//total amount paid is equal to the monthly payment and how many months you pay (ceiling)
		totalAmountPaid = (monthlyPayment * monthsNeededCeil);
		//total interest paid is total amount minus the principal 
		totalInterestPaid = (totalAmountPaid - principal); 
		
		//overpayment is the amount supposed to be paid (monthly * raw value of months needed) subtracted from amount paid
		overpayment = totalAmountPaid - (monthlyPayment * monthsNeededRaw); 
		
		//printing outputs 
		System.out.println("\nMonths Needed To Pay Off: \t" + monthsNeededCeil);
		System.out.printf("Total Amount Paid: \t\t$%.2f", totalAmountPaid);
		System.out.printf("\nTotal Interest Paid: \t\t$%.2f", totalInterestPaid);
		System.out.printf("\nOverpayment: \t\t\t$%.2f", overpayment);
		

	}

}
