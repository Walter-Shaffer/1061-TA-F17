/*
* NetPay.java
* Author: Kevin Okinedo
* Submission Date: 9/14/17
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program uses user input to calculate different variables such as gross pay and federal tax.
* Some variables are also calculated with equations in the code.
* It then displays the results with System.out.println statements.
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


double FEDERAL_TAX_PERCENT = 10.00; 

double STATE_TAX_PERCENT = 4.5;

double SS_PERCENT = 6.2;

double MEDICARE_PERCENT = 1.45;

double PAY_PER_HOUR = 7.25;

double grossPay, netPay, federalTax, stateTax, medicare, socialSecurity;


Scanner keyboard = new Scanner(System.in);


System.out.println("Enter the amount of hours per week:");

int hoursPerWeek = keyboard.nextInt();


grossPay = hoursPerWeek * PAY_PER_HOUR;

federalTax = ((grossPay * FEDERAL_TAX_PERCENT)/100);

stateTax = ((grossPay * STATE_TAX_PERCENT)/100);

socialSecurity = ((grossPay * SS_PERCENT)/100);

medicare = ((grossPay*MEDICARE_PERCENT)/100);

netPay = (grossPay - (federalTax + stateTax + medicare + socialSecurity));




System.out.println("Hours per Week:" + "\t\t" + hoursPerWeek);

System.out.println("GrossPay:" + "\t\t" + grossPay);

System.out.println("Net Pay:" + "\t\t" + netPay);

System.out.println(" ");

System.out.println("Deductions");

System.out.println("Federal:" + "\t\t" + federalTax);

System.out.println("State:" + "\t\t\t" + stateTax);

System.out.println("Social Security:" + "\t" + socialSecurity);

System.out.println("Medicine:" + "\t\t" + medicare);







}



}