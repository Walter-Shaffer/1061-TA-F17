/*NetPay.java

 * Zachary Smith
 * 9-19-17
 * This program computes a person's gross pay and
 * net pay based on their hourly wages, hours worked,
 * the federal tax, state tax, social security, and medicare.
 * The program also shows how much money was deducted from
 * their gross pay.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not 
 * copied or modified code from any other source other than 
 * the course webpage or the course textbook. I recognize that 
 * any unauthorized assistance or plagiarism will be handled in
 * accordance with the policies at Clemson University and the
 * policies of this course, I recognize that my work is based
 * on an assignment created by the School of Computing at 
 * Clemson University. Any publishing or posting of source
 * code for this project is strictly prohibited unless
 * you have written consent from the instructor.
 * 
 */
import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		double Federal_Tax_Percent = 10.0;
		
		double State_Tax_Percent = 4.5;
		
		double SS_Percent = 6.2;
		
		double Medicare_Percent = 1.45;
		
		double Pay_Per_Hour = 7.25;
		
		int hoursPerWeek;
		
		double grossPay, netPay, federalTax, stateTax, medicare, socialSecurity;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter in the amount of hour worked.");
		
		hoursPerWeek = input.nextInt();
		
		grossPay = hoursPerWeek * Pay_Per_Hour;
		
		federalTax = (grossPay * Federal_Tax_Percent) / 100;
		
		stateTax = (grossPay * State_Tax_Percent) / 100;
		
		socialSecurity = (grossPay * SS_Percent) / 100;
		
		medicare = (grossPay * Medicare_Percent) / 100;
		
		netPay = grossPay - (federalTax + stateTax + medicare + socialSecurity);
		
		System.out.println("Hours per Week:\t\t" + hoursPerWeek);
		
		System.out.println("Gross Pay:\t\t" + grossPay);
		
		System.out.println("Net Pay:\t\t" + netPay);
		
		System.out.println("Deductions:\t\t");
		
		System.out.println("Federal Tax:\t\t" + federalTax);
		
		System.out.println("State Tax:\t\t" + stateTax);
		
		System.out.println("Social Security:\t" + socialSecurity);
		
		System.out.println("Medicare:\t\t" + medicare);
		
		
	}

}
