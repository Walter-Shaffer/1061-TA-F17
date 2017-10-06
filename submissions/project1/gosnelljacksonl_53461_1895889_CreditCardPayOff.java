/* [CPSC 1060].java 
 * Author:  [Jackson_Gosnell]  
 * Submission Date:  [9/22/17] 
 * 
 * Purpose: A brief paragraph description of the 
 * program. What does it do? 
 * Statement of Academic Honesty:
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
		// TODO Auto-generated method stub
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Principal:\t");
	double principal = keyboard.nextDouble();
	
	System.out.println("Annual Interest Rate(/):\t");
	double annualInterestRate = (keyboard).nextDouble();

	
	System.out.println("Monthly Payment:\t");	
	double monthlyPayment = keyboard.nextDouble();
	
	
	double monthsNeededToPayOff = ((Math.log(monthlyPayment)-(Math.log(monthlyPayment-((annualInterestRate/1200.00)* principal))))/(Math.log((annualInterestRate/1200.00)+1.0)));
	
	
	System.out.println("Months Needed To Pay Off:\t" + Math.round(monthsNeededToPayOff));
	monthsNeededToPayOff = (monthsNeededToPayOff);
	
	
	double totalAmountPaid = Math.ceil(monthsNeededToPayOff) * monthlyPayment;

	
	System.out.println("Total Amount Paid:\t\t$" + totalAmountPaid + "0");
		
	
	double totalInterestPaid = totalAmountPaid - principal;
	
	System.out.println("Total InterestPaid:\t\t$" + totalInterestPaid + "0");
	
	double overpayment = (((Math.ceil(monthsNeededToPayOff)-monthsNeededToPayOff))*(monthlyPayment));
	System.out.printf("Overpayment:\t\t\t$%.2f" , overpayment);
	

	}

}
