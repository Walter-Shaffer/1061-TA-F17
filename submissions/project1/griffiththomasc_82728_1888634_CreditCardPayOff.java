/*

* [CreditCardPayOff].java

* Author: [Thomas Griffith]

* Submission Date: [September 21, 2017]

*

* Purpose: This program allows you to see how many months it will take
*  you to pay off your credit card payments using the amount, interest 
*  and monthly payment and running an algorithm that uses the numbers you
*   give in an equation to determine months needed, the total amount you 
*   will pay, the interest you paid, and the overpayment.

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
		//This is where you recieve the value from the user for the variable principle 

		Scanner input1 = new Scanner(System.in);

		double principle = input1.nextDouble();

	


		//This is where you recieve the value from the user for the variable annualInterestRate

		Scanner input2 = new Scanner(System.in);

		double annualInterestRate = input2.nextDouble();

	


		//This is where you recieve the value from the user for the variable monthlyPayment

		Scanner input3 = new Scanner(System.in);

		double monthlyPayment = input3.nextDouble();
		
		System.out.printf("Principle: \t\t\t%.2f" , principle );
		System.out.println("");
		System.out.println("Annual Interest Rate (%): \t" + annualInterestRate );
		System.out.printf("Monthly Payment: \t\t%.2f" , monthlyPayment );
		System.out.println("");
		// This the the algorithm that puts the variable given above and calculates the months it would take to pay off the bill

		/* pseudocode: with the numbers received above you need to take the natural log of the monthly payments minus the natural

		* log of the montly payments minus the quantity interest rate divided by 1200.0 and that times the principle. All of that 

		* is divided by the quantity Interest Rate divided by 1200.0 added with one

		*/

		double amountEnd = ((Math.log(monthlyPayment) - Math.log(monthlyPayment - ((annualInterestRate/1200.0) * principle)))) / (Math.log((annualInterestRate/1200.0)+1.0));

		System.out.println("");

		  

		    //converts the amountEnd or the outcome of the equation above to the highest whole number near it

		  int monthTotal = (int) Math.ceil(amountEnd);

		  System.out.println("Months needed to pay off debt \t" + monthTotal);

		 

		  //Finds the total you will pay by multiplying the monthly payments and the total months calculated above

		  double totalPaid = monthTotal * monthlyPayment;

		  System.out.printf("Total Amount Paid: \t\t$%.2f" , totalPaid);

		 

		  System.out.println("");

		 

		  //Finds the total interest that you ended up paying over time by subtracting the principle from the totalPaid

		  double interestPaid = totalPaid - principle;

		  System.out.printf("Total Interest Paid: \t\t$%.2f", interestPaid);

		 

		  System.out.println("");

		  //Finds the OverPayment that you had to pay by finding the difference of the time able to pay off the debt with the total months needed to pay it off

		  double Overpayment = Math.abs(amountEnd - monthTotal)*monthlyPayment;

		  System.out.printf("OverPayment: \t\t\t$%.2f" , Overpayment );

	}

}
