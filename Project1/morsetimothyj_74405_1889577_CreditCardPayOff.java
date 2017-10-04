/* CreditCardPayOff.java
* Author: Timothy Morse
* Submission Date: 21 Sept 2017
*
* Purpose: The program intakes a set of data on someone's credit card
* debt and outputs how long it will take them too pay off, how much
* they pay, and overpayment.
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

//imports
import java.io.PrintStream;
import java.lang.Math;
import java.util.Scanner;

public class CreditCardPayOff {

	//This function just returns the natural log of a function.
	public static double ln(double i)
	{
		double toReturn = Math.log(i);
		return toReturn;
	}
	public static void main(String[] args) {
		//"Declarations"
		//Some things needed a user input value, so I just got those in the same step as declaring other things.
		PrintStream pntr = new PrintStream(System.out);
		Scanner scn = new Scanner(System.in);
		pntr.print("Principal:\t\t\t");
		double principal = scn.nextDouble();
		pntr.print("Annual Interest Rate (%):\t");
		double annualInterestRate = scn.nextDouble();
		pntr.print("Monthly Payment:\t\t");
		double monthlyPayment = scn.nextDouble();
		pntr.println("");
		
		//Computations
		double monthsToPayOff = (ln(monthlyPayment)-ln(monthlyPayment-((annualInterestRate/1200.0)*principal)))/(ln((annualInterestRate/1200.0)+1.0));
		int monthsPayOffCeiling = (int) Math.ceil(monthsToPayOff);
		double totalAmountPaid= monthsPayOffCeiling * monthlyPayment;
		double totalInterestPaid = totalAmountPaid - principal;
		/*Overpayment is the "total amount paid" 
		*(monthly payment * rounded months to pay off)
		*minus "exact amount to pay"
		*(monthly payment * exact months to pay off).
		*I spent like three hours with a calculator
		*fudging numbers to figure this out.
		*/
		double overpayment = totalAmountPaid - (monthlyPayment*monthsToPayOff);
		pntr.printf("Months Needed To Pay Off:\t%d\n", monthsPayOffCeiling);
		pntr.printf("Total Amount Paid:\t\t$%.2f\n", totalAmountPaid);
		pntr.printf("Total Interest Paid:\t\t$%.2f\n", totalInterestPaid);
		pntr.printf("Overpayment:\t\t\t$%.2f", overpayment);
		scn.close();//Make the IDE happy
	}

		
	}
