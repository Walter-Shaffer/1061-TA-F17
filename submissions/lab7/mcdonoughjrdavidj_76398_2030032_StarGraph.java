
/*
*StarGraph.java
* Author:  David McDonough
* Submission Date:  October 19th
* Purpose: Use two different arrays, populate them using user inputed data, then display a graph using the values in the y array.
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

public class StarGraph {

	public static void main(String[] args) {
		double xMin;
		int N;
		double xIncrement;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter the numbers of x values to process: ");// user
																				// inputs
																				// amount
																				// of
																				// values
																				// for
																				// the
																				// array
		N = keyboard.nextInt();

		if (N <= 0) {// if statement that terminates the program if amount of
						// values is equal to or less than zero
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

		System.out.println("Enter a minimum amount for x: ");// a user inputed
																// minimum for
																// the x values
																// to start at
		xMin = keyboard.nextDouble();

		System.out.println("Enter the amount to increment x: ");// user inputed
																// number to
																// increment the
																// minimum
		xIncrement = keyboard.nextDouble();

		if (xIncrement <= 0) {// if statement that terminates the program if the
								// increment inputed is less than or equal to
								// zero
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}

		double[] xValueArray = new double[N];// array to hold x values
		double[] yValueArray = new double[N];// array to hold y values
		System.out.println("Values ");
		for (int i = 0; i < N; i++) {// for loop that increments the x values
										// and computes the y values. Populates
										// both arrays.
			xValueArray[i] = (xMin + (i * xIncrement));
			System.out.printf("x: %.3f", xValueArray[i]);
			System.out.print(",");
			yValueArray[i] = 20 * Math.abs(Math.sin(xValueArray[i]));
			System.out.printf(" y: %.3f ", yValueArray[i]);
			System.out.println("");

		}
		System.out.println("");
		System.out.println("Graph");
		for (int i = 0; i < N; i++) {// for loop that takes the y values and
										// outputs them as stars in a 'graph'.
			System.out.print(":");
			for (int j = 0; j < (int) yValueArray[i]; j++) {
				System.out.print("*");
			}
			
			System.out.println("");

		}

	}
}
