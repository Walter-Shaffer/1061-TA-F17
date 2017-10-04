 
/*
* CreditCardPayOff.java
* Author: Matthew Held
* Submission Date: 9-21-17
*
* Purpose:
* The purpose of this program is to calculate the months needed
* to pay off credit card debt, the total amount paid, the total
* interest paid, and the overpayment based on the user's input of
* their principal, annual interest rate, and monthly payment.
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
*
*/
 
import java.util.Scanner;
 
public class CreditCardPayOff {
 
       public static void main(String[] args) {
             
              //Declare Variables
              double principal, annualInterestRate, monthlyPayment;
              double doubleMonthsToPayDebt, totalAmountPaid, totalInterestPaid, overpayment;
              int intMonthsToPayDebt;
             
              //Create Scanner Object
              Scanner keyboard = new Scanner(System.in);
             
              //**Get User Information**
              //Principal
              System.out.print("Principal:\t\t\t");
              principal = keyboard.nextDouble();
             
              //Annual Interest Rate
              System.out.print("Annual Interest Rate (%):\t");
              annualInterestRate = keyboard.nextDouble();
             
              //Monthly Payment
              System.out.print("Monthly Payment:\t\t");
              monthlyPayment = keyboard.nextDouble();
             
             
              //Close Keyboard
              keyboard.close();
             
              //Calculate Number of Months to Pay Off Debt
              doubleMonthsToPayDebt = ((Math.log(monthlyPayment) - Math.log(monthlyPayment - (annualInterestRate / 1200.0) * principal)) / (Math.log((annualInterestRate / 1200.0) + 1.0)));
             
              intMonthsToPayDebt = (int)(Math.ceil(doubleMonthsToPayDebt));
             
              //Calculate Total Amount Paid
              totalAmountPaid = intMonthsToPayDebt * monthlyPayment;
             
              //Calculate Total Interest Paid
              totalInterestPaid = totalAmountPaid - principal;
             
              //Calculate Overpayment
              /*
              * 
              * Algorithm:
              * Take the raw value of the months to pay off the debt and subtract it from
              * the ceiling value of the months to pay off the debt, then multiply this value
              * by the monthly payment.
              *
              */
              overpayment = (intMonthsToPayDebt - doubleMonthsToPayDebt) * monthlyPayment;
              
              //Print To Console
              System.out.println();
              System.out.println("Months Needed To Pay Off:\t" + intMonthsToPayDebt);
              System.out.printf("Total Amount Paid:\t\t$%.2f%n", totalAmountPaid);
              System.out.printf("Total Interest Paid:\t\t$%.2f%n", totalInterestPaid);
              System.out.printf("Overpayment:\t\t\t$%.2f%n", overpayment);
             
       }
 
}
 