/* 
 * CreditCardPayOff.java 
 * Author:  Jackie Doan  
 * Submission Date: Friday, September 15, 2017
 * 
 * Purpose:
 * This program is designed with the purpose to the time it takes to pay off
 * credit card debt after being given the principal, annual interest rate,
 * and monthly payment. This program also tells how much you paid how much was
 * interest and how much you overpayed.
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
		double monthPay, annualInterestRate, principal;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Principal: \t\t\t");
		principal = keyboard.nextDouble();
		
		Scanner intRate = new Scanner(System.in);
		System.out.print("Annual Interest Rate (%): \t");
		annualInterestRate = intRate.nextDouble();
		
		Scanner month = new Scanner(System.in);
		System.out.print("Monthly Payment: \t\t");
		monthPay = month.nextDouble();
		
		System.out.println();
		
		double annIntRate = annualInterestRate / 1200.0;
		double monPay = (Math.log(monthPay));
		double denom = (Math.log(annIntRate + 1.0));
		double logVar = (Math.log(monthPay - (annIntRate * principal)));
		double payOff = (monPay - logVar) / denom;
		
		int payOffDay = (int) Math.ceil(payOff);
		System.out.println("Months Needed To Pay Off: \t" + payOffDay);
		
		double totalPay =  payOffDay * monthPay;
		System.out.println("Total Amount Paid: \t\t$" + String.format("%.2f", totalPay));
		
		double intPay = (totalPay - principal) * 100;
		double totIntPay = (Math.round(intPay));
		double totalIntPay = totIntPay / 100;
		System.out.println("Total Interest Paid \t\t$" + String.format("%.2f", totalIntPay));
		
		/*
		 * First use the unrounded time it takes to pay off the debt
		 * and multiply that by the monthly payment
		 * the subtract that from the rounded amount
		 */
		double pay = payOff * monthPay;
		double overPay = totalPay - pay;
		double rOverPay = overPay * 100;
		double reOverPay = Math.round(rOverPay);
		double realOverPay = reOverPay / 100;
		System.out.println("Overpayment: \t\t\t$" + String.format("%.2f", realOverPay));
	}

}
