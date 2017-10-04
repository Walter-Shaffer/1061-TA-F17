/*
* CreditCardPayOff.java
* Author:  Mark Blasko
* Submission Date:  09/20/2017
* Purpose: The purpose of this program is to calculate specific quantities associated with credit card payments.
These quantities include: The months needed to pay off credit card debt, total amount paid, total interest paid,
and overpayment amount.  These quantities are calculated by using values submitted by the user. These values
include: Principle payment, annual interest rate, and intended monthly payment.
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

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

      System.out.print("Principle: \t\t\t"); //Use print, rather than println, to align user input and console output
      double principleValue = input.nextDouble();

      System.out.print("Annual Interest Rate (%): \t");
      double rateValue = input.nextDouble();

      System.out.print("Monthly Payment: \t\t");
      double monthlyPay = input.nextDouble();
      //End of user input

      double monthlyLn = Math.log(monthlyPay); //Beginning of Formula
      double secondStep = Math.log(monthlyPay - (rateValue/1200.0) * principleValue);
      double divisor = Math.log((rateValue/1200.0) + 1);
      double monthsNeeded = (monthlyLn - secondStep) / (divisor);
      int intMonthsNeeded = (int) Math.ceil(monthsNeeded); //End of Formula

      System.out.println();
      System.out.println("Months Needed To Pay Off: \t" + intMonthsNeeded); //End of Months Needed to be payed off

      double totalPaid =  monthlyPay * intMonthsNeeded;
      System.out.printf("Total Amount Paid: \t\t$%4.2f", totalPaid); //End of Total Amount Paid
      System.out.println();

      double totalInterest = totalPaid - principleValue;
      System.out.printf("Total Interest Paid: \t\t$%4.2f", totalInterest); //End of Total Interest Paid
      System.out.println();
        /*
        Step 1: Declare variable "overpayment" as data type double
        Step 2: Set variable "overpayment" equal to overpayment formula
        Step 3: For the formula: Multiply intMonthsNeeded by monthlyPay
        Step 4: Then subtract product of intMonthsNeeded by monthlyPay
                by the product of monthsNeeded and monthlyPay to get overpayment amount
        */
      double overpayment = (intMonthsNeeded * monthlyPay) - (monthsNeeded * monthlyPay);
      System.out.printf("Overpayment: \t\t\t$%4.2f", overpayment);
      System.out.println();

  }


}
