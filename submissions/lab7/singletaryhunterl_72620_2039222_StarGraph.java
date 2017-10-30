/* Drawing.java
		* Author: Hunter Singletary
		* Submission Date: [10/20/2017]
		*
		* Purpose: A program that scans user input values and puts them into a chart.
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
public class StarGraph {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the amount of x values to process:\t");		//Prompts the user for an amount of x values to process and then scans user input
		int N = input.nextInt();
		if (N <= 0){
			System.out.print("The number of x values must be an integer greater than 0.");  //if the user enters a number that is not greater than 0, the program will terminate
			System.exit(0);
		}
		
		System.out.print("Enter a minimum value for x:\t");		//Prompts user for a starting value of x
		double x = input.nextDouble();

		System.out.print("Enter the amount to increment:\t");		//Prompts user for a value for x to be incremented by each time the program loops.
		double increment = input.nextDouble();
		if (increment <= 0){
			System.out.print("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}		
		double[] xArray = new double[N];		//Creates two arrays of size N, which the user specified earlier.
		double[] yArray = new double[N];
		
		
		System.out.println("Values");		//A loop that prints the values of x, then gets y by using the Sine function. it also increments x by variable "increment" until the loop ends
		for (int i = 0; i < N; i++){
			xArray[i] = x;
			System.out.print("x: "+ xArray[i]);
			yArray[i] = 20.0 * Math.abs(Math.sin(xArray[i]));
			System.out.println("\ty: " + yArray[i]);
			x = x+increment;	
		}
	}

}
