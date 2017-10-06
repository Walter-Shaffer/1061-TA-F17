/* CreditCardPayOff.Java
* Author: Allison Tizik
* Submission Date: 9/22/17
* Purpose: The program calculates the total amount paid the total
* interest paid and the overpayment using different algorithims.
* After submitting the principal which is the amount owed, the
* annual interest rate on the loan, and then the monthly payment plan;
* it caculates the months needed to pay off the loan rounded up. After
* finding how many months are needed to pay off the loan it can caculate the
* total amount paid, the total interest paid, and the overpayment. This allows
* for a quicker way to caculate credit card loan payments.
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
                      Scanner input = new Scanner(System.in);
 
//Initializing Variables and Receiving Inputs
                      System.out.println("Enter Principal:\t");
                      double principal = input.nextDouble();
                      System.out.println("Enter Annual Interest Rate:\t");
                      double annualInterestRate = input.nextDouble();
                      System.out.println("Enter Monthly Payment:\t");
                      double monthlyPayment = input.nextDouble() ;
                     
//Calculations
                      double monthsPayoff =(Math.log(monthlyPayment)-Math.log(monthlyPayment - (annualInterestRate/1200.0)*principal))/(Math.log((annualInterestRate/1200.0)+1.0));
                      int monthlyPaymentInt =(int) Math.ceil(monthsPayoff);
                      double totalPaid = (monthlyPaymentInt * monthlyPayment);
                      double totalInterest = ((monthlyPaymentInt * monthlyPayment)-(principal));
 
/*Calculation of over payment is the total amount paid subtracted by
*the amount of months needed to pay off the bill before it was rounded multiplied by
* the monthly payment
* ex. 7900-(78.9557 * 100) = 4.43
*/
                      double overpayment = (totalPaid -(monthsPayoff*monthlyPayment));
          
//Print out Statements
                      System.out.println("\nPrincipal:\t\t\t"+principal);
                      System.out.println("Annual Interest Rate (%):\t"+annualInterestRate);
                      System.out.println("Monthly Payment:\t\t"+monthlyPayment);
                      System.out.println("\nMonths Needed To Payoff:\t"+monthlyPaymentInt);
                      System.out.printf("Total Amount Paid:\t\t$%4.2f",totalPaid);
                      System.out.printf("\nTotal Interest Paid:\t\t$%4.2f", totalInterest);
                      System.out.printf("\nOverPayment:\t\t\t$%4.2f", overpayment);
           }
 
}