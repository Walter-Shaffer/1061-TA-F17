/* Netpay.Java
* Author: Allison Tizik
* Submission Date: 9/14/17
* Purpose: The program calculates the different variables depending
* on the hours or work performed per week.
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
 
public class NetPay {
           public static void main(String[] args) {
                      Scanner input = new Scanner(System.in);
                     
// initializing variables
                      double FEDERAL_TAX_PERCENT = 10.00;
                      double STATE_TAX_PERCENT = 4.5;
                      double SS_PERCENT = 6.2;
                      double MEDICARE_PERCENT = 1.45;
                      double PAY_PER_HOUR = 7.25;
                      System.out.print("Hours Per Week:       ");
                      int hoursPerWeek =input.nextInt();
                     
// Declaring Variables
                      double grossPay, netPay, federalTax, stateTax, medicare, socialSecurity;
                     
// Computing Variables
                      grossPay = (hoursPerWeek * PAY_PER_HOUR);
                      federalTax = (grossPay * FEDERAL_TAX_PERCENT)/100;
                      stateTax = (grossPay * STATE_TAX_PERCENT)/100;
                      socialSecurity = (grossPay * SS_PERCENT)/100; 
                      medicare = (grossPay * MEDICARE_PERCENT)/100;
                      netPay = grossPay - (federalTax + stateTax + medicare + socialSecurity);
                     
// Display Results
                      System.out.println("Gross Pay:            " + grossPay);
                      System.out.println("Net Pay:              " + netPay);
                      System.out.println("\nDeductions");
                      System.out.println("Federal:              " + federalTax);
                      System.out.println("State:                " + stateTax);
                      System.out.println("Socal Security:       " + socialSecurity);
                      System.out.println("Medicare:             " + medicare);
           }
 
}