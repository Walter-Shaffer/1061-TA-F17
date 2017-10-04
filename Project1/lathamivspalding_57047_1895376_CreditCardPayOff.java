/*
		* [CreditCardPayoff].java
		* Author: [Spalding Latham]
		* Submission Date: [09/22/2017]
		*
		* Purpose: This program takes user input to calculate the amount of
		* months needed to pay off credit card debt.
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
		
		
	
				
		    Scanner keyboard = new Scanner(System.in);
				
		    double principal;
		    double annualInterestRate;
		    double monthlyPayment;
		    double monthsToPay;
		    int monthsToPayCeil;
		    double numerator;
		    double denominator;
		    double totalAmountPaid;
		    double interest;
		    double shouldBePaid;
		    double overpayment;
		    
		    
		    System.out.print("Principal:\t\t\t");
				principal = keyboard.nextDouble();
			System.out.print("Annual Interest Rate (%):\t");
				annualInterestRate = keyboard.nextDouble();
			System.out.print("Monthly Payment:\t\t");
				monthlyPayment = keyboard.nextDouble();
			System.out.println(" ");
			 
			
			
			numerator = Math.log((monthlyPayment)-(((annualInterestRate)/1200.0))*principal);
			//To make the formula simpler to code, I rewrote part of the numerator as its own variable
			
			denominator = Math.log(((annualInterestRate)/1200.0)+1);		
			//I also rewrote the denominator as its own variable so that the months to pay off formula would be simpler
			
			monthsToPay = (((Math.log(monthlyPayment))-numerator)/denominator);
			//Since I rewrote part of the numerator and the denominator, this months to pay formula was much less confusing to make then writing it all out at once
			
			
			
			
			monthsToPayCeil = (int) Math.ceil(monthsToPay);
			//In order to calculate the ceiling of the months to pay, I declared a new int to store the value and use the ceiling function to calculate it
			
			totalAmountPaid = (monthsToPayCeil*monthlyPayment);
			
			System.out.println("Months Needed To Pay Off:\t" + monthsToPayCeil);
			
			System.out.printf("Total Amount Paid:\t\t" + "$" + "%.2f",totalAmountPaid);
			//In order to round the value to two decimal places I used printf and its %.#f function, where # is the amount of decimals you want
			
			System.out.println(" ");
			//Since I used printf instead of println, I had to make a new blank line to skip to the next line
			
			 
			
			
			
			interest = (totalAmountPaid - principal);
			
			System.out.printf("Total Interest Paid:\t\t" + "$" + "%.2f",interest);
			//In order to round the value to two decimal places I used printf and its %.#f function, where # is the amount of decimals you want
			
			System.out.println(" ");
			//Since I used printf instead of println, I had to make a new blank line to skip to the next line
			
			
			
			shouldBePaid = ((monthsToPay * monthlyPayment)); 
			//I made this variable to calculate the amount that would be paid without using the ceiling of the months to pay
			
			overpayment = (totalAmountPaid - shouldBePaid);
			//The overpayment was calculated by subtracting the amount you would pay without the ceiling from the amount you actually pay with the ceiling.
			
			System.out.printf("Overpayment:\t\t\t" + "$" + "%.2f",overpayment);
			//Since I used printf instead of println, I had to make a new blank line to skip to the next line
				
				
			keyboard.close();	
				
				
				
			

	


	}

}
