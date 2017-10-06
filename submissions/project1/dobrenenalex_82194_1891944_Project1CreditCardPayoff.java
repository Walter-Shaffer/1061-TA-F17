/* Project1CreditCardPayoff.java 
 * Author:  Alex Dobrenen 
 * Submission Date:  [Submission date here]  
 * Purpose: A brief paragraph description of the 
 * program. What does it do? Compute  and  display  the  number  of  months  
 * needed  to  pay  off credit card debt.
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

//Imports
import java.util.Scanner;

//Class Start
public class Project1CreditCardPayoff 
{
	
	//Main 
	public static void main(String[] args) 
	{
		//Scanner
		Scanner inputScanner = new Scanner(System.in);
		
		//Variables
		double owed = 0.0;
		double interestRate = 0.0;
		double monthlyPay = 0.0;
		double monthsD = 0.0;
		int monthsI = 0;
		double totalPaid = 0.0;
		double totalInterestPaid = 0.0;
		double overPay = 0.0;
		
		//Algorithm
		//Inputs
		//interest /100 before moving on
		System.out.print("Principle: \t\t\t");
		owed = inputScanner.nextDouble();
		System.out.print("Annual Interest Paid(%):\t");
		interestRate = inputScanner.nextDouble();
		System.out.print("Monthly Payment:\t\t");
		monthlyPay = inputScanner.nextDouble();
		
		//Math
		//(ln(monthPay) - ln(monthPay-((intrest/1200.0)x owed)) / (ln((intrest/1200)+1))
		//Months to pay off (Double) * rate
		//Months to pay off (int) * rate
		//Subtract the 2 = overpay
		//Total interest = monthD * rate - owed
		
		monthsD = ((Math.log(monthlyPay) - Math.log(monthlyPay - ((interestRate/1200.0) * owed))))
				/ (Math.log((interestRate/1200)+1.0));
		
		monthsI = (int) Math.ceil(monthsD);
		
		totalPaid = monthsI * monthlyPay;
		
		totalInterestPaid = totalPaid - owed;
		
		overPay = (monthsI * (monthlyPay)) - (monthsD * (monthlyPay));
		
		//Output
		System.out.println("Months Needed to Pay Off: \t" + monthsI);
		System.out.print("Total Ammount Paid: \t\t$");
		System.out.printf("%.2f",totalPaid);
		System.out.println();
		System.out.print("Total Interest Paid: \t\t$");
		System.out.printf("%.2f",totalInterestPaid);
		System.out.println();
		System.out.print("Overpay: \t\t\t$");
		System.out.printf("%.2f",overPay);
		System.out.println();
		
	}// End Main

}//End class
