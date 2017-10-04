 /*
 * CreditCardPayOff.java
 * Author: Dayvon Polite
 * Submission Date: 9/15/2017
 *
 * Purpose: The program takes in user input in order to 
 * calculate various values regarding Credit Card Debt
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

 		Scanner Credit = new Scanner(System.in);
 		double PRINCIPAL = 0;
 		double AIR = 0; 	//Annual Interest rate
 		double MP = 0; 		//Monthly Payment
 		double MonthsNeeded = 0; //Months Needed to Pay
 	    int MonthsNeededCeil = 0; //Ceiling of MonthsNeeded
 		double TAP = 0; //Total Amount Paid and also an unintended pun
 		double TIP = 0; //Total Interest Paid
 		double OP = 0; //Overpayment

 		System.out.println("What's the principal?");
 		PRINCIPAL = Credit.nextDouble();
 		System.out.println("What's Annual Interest Rate?");
 		AIR = Credit.nextDouble();
 		System.out.println("What are you paying monthly?");
 		MP = Credit.nextDouble();
 		Credit.close();
 		MonthsNeeded = ((Math.log(MP)-Math.log(MP-AIR/1200.0*PRINCIPAL))/(Math.log(AIR/1200.0+1.0)));
 		MonthsNeededCeil = (int) Math.ceil(MonthsNeeded);
 		TAP = MonthsNeededCeil * MP;
 		TIP = TAP-PRINCIPAL;
		
		/*
		*To Keep In Mind:OP uses both the double and int value of the months needed 
		*and the only value relevent to calculating payment is Monthly Payment (interest is included in total amount paid).
		*
		*Use varibles for total amount paid, MonthsNeeded/MonthsNeededCeil, monthly payment, and overpayment
		*Since overpayment is more than what was required to pay, we need to take the difference from the total amount paid
		*The the int or double of monthsneeded has to be multiplied by monthly payment (use double since it gives the correct overpayment)
		*Set overpayment = total amount paid-(monthsneeded)(monthly payment)
		*Remember to format to the hundreths place
		*/
		
 		OP  = TAP-MonthsNeeded*MP; 
 	
 		System.out.printf("%s\t\t\t%.2f\n%s\t%.2f\n%s\t\t%.2f","Principal:",PRINCIPAL,"Annual Interest Rate (%):",AIR, "Monthly Payment:", MP);
 		System.out.printf("\n\n%s\t%d\n%s\t\t%s%.2f\n%s\t\t%s%.2f\n%s\t\t\t%s%.2f", "Months Needed To Pay Off:", MonthsNeededCeil, "Total Amount Paid:","$",TAP, "Total Interest Paid:","$" ,TIP, "Overpayment:","$" ,OP);
 		
 	}
 }