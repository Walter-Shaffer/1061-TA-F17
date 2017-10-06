
import java.util.Scanner;

/* CreditCardPayOff.java
Author: Sean Meade
Submission Date: 9/21
Purpose:  To calculate the months needed to pay off a debt, 
the total amount paid, the total interest paid, and the 
overpayment of a payment plan when given the principal, annual 
interest rate, and monthly payment of that payment plan. 

Statement of Academic Honesty:
The following code represents my own work. I have neither
received nor given inappropriate assistance. I have not copied
or modified code from any source other than the course webpage
or the course textbook. I recognize that any unauthorized
assistance or plagiarism will be handled in accordance
with the policies at Clemson University and the
policies of this course. I recognize that my work is based
on an assignment created by the School of Computing
at Clemson University. Any publishing or posting
of source code for this project is strictly prohibited
unless you have written consent from the instructor.
*/
public class CreditCardPayOff {

    public static void main(String[] args) {
        double principal;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Principal:\t\t\t"); //Asks the user for the principal and reads it out. 
        principal = keyboard.nextDouble();
        double annualInterestRate;
        System.out.print("Annual Interest Rate (%):\t"); //Asks the user for the annual interest rate and reads it out. 
        annualInterestRate = keyboard.nextDouble();
        double monthlyPayment;
        System.out.print("Monthly Payment:\t\t"); //Asks the user for the monthly payment and reads it out. 
        monthlyPayment = keyboard.nextDouble();
        keyboard.close();

        double monthsFormula = ( (Math.log(monthlyPayment) - (Math.log(monthlyPayment - (annualInterestRate / 1200.0) * principal) ) 
                ) / (Math.log((annualInterestRate / 1200.0) + 1.0) ) ); //Calculates the months needed to pay off the debt based on previous inputs.
        int monthsNeeded  = (int) Math.ceil(monthsFormula); //Rounds up the previous computation, and turns the value into an integer.
        double totalAmountPaid = (Math.ceil(monthsNeeded) * monthlyPayment);
        double totalInterestPaid = (totalAmountPaid - principal);
        // The overpayment is equal to the difference between how much money the last monthly payment makes to the credit card company than is actually due. 
        double overpayment = (totalAmountPaid - (monthsFormula * monthlyPayment));

	       System.out.print("\nMonths Needed To Pay Off:\t" + monthsNeeded); 
	       System.out.printf("\nTotal Amount Paid:\t\t$%4.2f", totalAmountPaid); 
	       System.out.printf("\nTotal Interest Paid:\t\t$%4.2f", totalInterestPaid); 
	       System.out.printf("\nOverpayment:\t\t\t$%4.2f", overpayment);
    }

}
