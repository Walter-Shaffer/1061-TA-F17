import java.util.Scanner;

/*
* Author:  Alejandro Pardo
* Submission Date:  September 22
* Purpose: This java code will allow you to figure out how many months it will take for you to pay off your credit card.
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

public class CreditCardPayOff {

	public static void main(String [] args) {
	
	double Principal;
	double AnnualInterestRate;
	double MonthlyPayment;
	
 Scanner input = new Scanner(System.in);
   System.out.print("Principal:\t\t\t");   
   Principal = input.nextDouble();
  
   System.out.print("Annual Interest Rate (%):\t");
   AnnualInterestRate = input.nextDouble();
   
   System.out.print("Monthly Payment:\t\t");
   MonthlyPayment = input.nextDouble();
   
   System.out.println(" ");
   
   double MonthsNeededToPayOff;
   double TotalAmountPaid;
   double TotalInterestPaid;
   double Overpayment;
   
  double numerator;
  double denominator;
  
  numerator = (Math.log(MonthlyPayment)-Math.log(MonthlyPayment-((AnnualInterestRate/1200.0)*Principal)));
  denominator = (Math.log((AnnualInterestRate/1200.0)+1.0));
  
MonthsNeededToPayOff = numerator/denominator;

int MonthsNeededToPayOffRounded = (int)Math.ceil(MonthsNeededToPayOff);

System.out.println("Months Needed To Pay Off:\t" +MonthsNeededToPayOffRounded);
   
   TotalAmountPaid = MonthsNeededToPayOffRounded * MonthlyPayment;
   
  System.out.printf("Total Amount Paid:\t\t$%.2f", TotalAmountPaid);
  System.out.println( );
  
TotalInterestPaid = TotalAmountPaid - Principal;
		
System.out.printf("Total Interest Paid:\t\t$%.2f",TotalInterestPaid);		

System.out.println( );
		
	Overpayment = (MonthsNeededToPayOffRounded * MonthlyPayment) - (MonthsNeededToPayOff * MonthlyPayment);


	
System.out.printf("Overpayment:\t\t\t$%.2f", Overpayment);

	}	
  }
