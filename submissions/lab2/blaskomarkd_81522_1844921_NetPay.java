/*
* [Class name here].java
* Author: [Your name here]
* Submission Date: [Submission date here]
*
* Purpose: A brief paragraph description of the
* program. What does it do?
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
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Please enter hours worked per week: ");
    int hoursPerWeek = keyboard.nextInt();
    final double FEDERAL_TAX_PERCENT = 10.00;
    final double STATE_TAX_PERCENT = 4.5;
    final double SS_PERCENT = 6.2;
    final double MEDICARE_PERCENT = 1.45;
    final double PAY_PER_HOUR = 7.25;
    double grossPay = hoursPerWeek * PAY_PER_HOUR;
    double federalTax = (grossPay * FEDERAL_TAX_PERCENT) / 100;
    double stateTax = (grossPay * STATE_TAX_PERCENT) / 100;
    double medicare = (grossPay * MEDICARE_PERCENT) / 100;
    double socialSecurity = (grossPay * SS_PERCENT) / 100;
    double netPay = grossPay - (federalTax + stateTax + medicare + socialSecurity);
    System.out.println();
    System.out.println("Hours per Week: \t" + hoursPerWeek);
    System.out.println("Gross Pay: \t\t" + grossPay);
    System.out.println("Net Pay: \t\t" + netPay);
    System.out.println();
    System.out.println("Deductions");
    System.out.println("Federal:  \t\t" + federalTax);
    System.out.println("State:  \t\t" + stateTax);
    System.out.println("Social Security: \t" + socialSecurity);
    System.out.println("Medicare:   \t\t" + medicare);
    keyboard.close();


  }

}
