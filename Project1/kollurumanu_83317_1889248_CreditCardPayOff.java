/* 
 * CreditCardPayOff.java
 * Author : Manu Kolluru
 * Submission Date: 9/22/17   
 * Purpose : To calculate persons gross and net pay based on wages
 * Statement of Academic Honesty:
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
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

	public static void main (String [] args){
		         
		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("Enter a principal amount : " +"\t" +"\t");
		double principal = sc.nextDouble();
		
		System.out.print("Enter Annual interest rate (%) : "  +"\t");
		double interest = sc.nextDouble();
		
		System.out.print("Enter monthly payment :" +"\t" +"\t" + "\t");
		double monthlyPayment = sc.nextDouble();
		
		double noMonths;
		noMonths = ((Math.log(monthlyPayment) - Math.log(monthlyPayment - (interest / 1200.00) * principal))/(Math.log((interest/1200.00) + 1.00)));
		
		
		
		int noMonthsCeil =  (int) Math.ceil(noMonths);
		
		System.out.println("  " + "\n" + "Months needed to pay off : " +  "\t" +  "\t"+ noMonthsCeil );
		
		//The total amount paid to the credit card company is the ceiling of the number of months needed to pay off the debt multiplied by the monthlyPayment payment.
		double totalAmount = (noMonthsCeil * monthlyPayment);
		System.out.printf("Total Amount paid : " +  "\t"+"\t" + "\t" + "$%4.2f" , totalAmount );	
				
		System.out.println("");
		//The total interest paid is simply the principal amount (which is provided by the user) subtracted from the total amount paid to the credit card company
		double totalInterest = (totalAmount - principal );
		System.out.printf("Total Interest paid : "+  "\t" +"\t" + "\t" + "$%4.2f" , totalInterest );
		System.out.println("");
		
		/*		OVERPAYMENT
		 * calculated by :
		 * 1. find the total amount when the no. of months is not rounded up
		 * 2.Subtract that amount from the "Total Amount Paid" 
		 */
		
		
		double overpayment ;
		overpayment = ((totalAmount - (noMonths * monthlyPayment)));
		
		System.out.printf("Overpayment : " +  "\t" +"\t" + "\t" + "\t" + "$%4.2f" , overpayment );

		
		System.out.println("");
		
		
	}
}
