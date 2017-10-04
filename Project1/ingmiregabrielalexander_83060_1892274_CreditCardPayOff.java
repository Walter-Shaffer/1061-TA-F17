

/*
* 
* CreditCardPayOff.java
* Gabe Ingmire
* 9/19/17
*
* Purpose: To compute the amount of
* months needed to pay off the creditcard debt.
* 
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

import java.text.DecimalFormat;
import java.util.*;
public class CreditCardPayOff {
            
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//create scanner//
		Scanner input = new Scanner(System.in);
		
		
		   //Enter Principal Amount owed on Credit Card//
		System.out.print("Enter Principal amount:\t ");
		double principal = input.nextDouble();
		
			//Enter annual interest rate next//
		System.out.print("Enter the annual interest rate(%): ");
		double interestRate = input.nextDouble();
			
			//obtain annual interest rate//
		double annualInterestRate = (interestRate);
		
			//Enter monthly payment//
		System.out.print("Enter Monthly Payment:\t ");
		double monthlyPayment = input.nextDouble();
		
			//Enter formula assigned monthsToPayOff
			// I created numerous variables to split up the calculation process//
		double monthsToPayOfff = Math.log(monthlyPayment); 
		double monthsToPayOffff = monthsToPayOfff - Math.log(monthlyPayment - annualInterestRate / 1200*principal);
		  //original  //
		double monthsToPayOff = (monthsToPayOffff) / Math.log(annualInterestRate/1200.0 + 1.0);		
			//floating//
		float MonthsToPayOff = (float) Math.ceil(monthsToPayOff);
		
		final DecimalFormat df2 = new DecimalFormat("#.##");
		
		//Type months needed to pay off//
		System.out.print("\nMonths needed to pay off: " + MonthsToPayOff);
		//Type total Amount Paid//
		System.out.print("\nTotal Amount Paid: $" + df2.format (monthlyPayment*monthsToPayOff));
		
		double totalInterest = (monthlyPayment*monthsToPayOff) - principal;
		//Type out Total Interest//
		System.out.print("\nTotal Interest: $" + df2.format(totalInterest));
		  
		//Formula over payment is double months to pay off sub. from floating Months times monthly payment//
		double overPayment = (MonthsToPayOff - monthsToPayOff)*monthlyPayment;
		System.out.print("\nOverpayment: $" + df2.format(overPayment));
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
