import java.util.Scanner;

/*
 * CreditCardPayOff
 * Author: Christopher Hicks
 * Submission Date 9/18/17
 * 
 * Purpose: Learn how to, declare and initialize variables,
 *  declare constants, assign values, and add basic comments.
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

public class CreditCardPayOff {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// Principal
		System.out.println("Please enter your ammount owed. Example 5000.00");
		double principal = input.nextDouble();
		
		// Annual Interest Rate
		System.out.print("Please enter your Annual Intrest Rate. Example 5.50%");
		double annual_Interest_Rate = input.nextDouble();
		
		// Monthly Payment
		System.out.println("Monthly Payment");
		double monthly_Payment = input.nextDouble();
		
		// Formulas
		// Top
		double Top = Math.log10(monthly_Payment)- Math.log10( monthly_Payment - (annual_Interest_Rate/1200.0)* principal);
		// Bottom
		double Bottom = Math.log10((annual_Interest_Rate/1200.0)+1);
		// Combined
		double Months = Math.ceil(Top/Bottom);
		//Total Amount + Intrest
		double total_Paid = Math.ceil(Months)* monthly_Payment;
		//Intrest Amount
		double total_Interest = total_Paid - principal;
		// Overpay
		double over_Pay =(total_Paid - ((Top/Bottom) * monthly_Payment));
		
		
		//Print Output
		System.out.printf("Principal:\t\t\t%.2f%n" , principal);
		System.out.println("Annual Interest Rate(%):\t" + annual_Interest_Rate);
		System.out.printf("Monthly Payment:\t\t%.2f\n" , monthly_Payment);
		
		System.out.printf("\nMonths Needed To Pay Off:\t%.0f%n" , Months );
		System.out.printf("Total Amount Paid:\t\t$%.2f%n" , total_Paid );
		System.out.printf("Total Intrest Paid:\t\t$%.2f%n" , total_Interest );
		System.out.printf("OverPayment:\t\t\t$%.2f" , over_Pay);
		
		
		
		
	}

}
