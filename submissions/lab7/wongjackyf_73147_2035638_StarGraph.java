/**
 * StarGraph.java
 * Author: Jacky Wong
 * Submission Date: 10/20/17
 * 
 * Purpose: Calculates values produced from a function, from a
 * user's input values of number of entries, a minimum value, and
 * an increment. Also prints stars for the floor of every y value
 * produced.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance
 * with the policies at Clemson university and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the School of Computing
 * at Clemson University. Any publishing or posting
 * of source code for this project is strictly prohibited
 * unless you have written consent from the instructor.
 */

/** Import scanner */
import java.util.Scanner;

public class StarGraph {

	public static void main(String[] args) {
		
		/** Create variables */
		int sizeArray;
		double xMin, xIncrement;
		
		/** Create scanner */
		Scanner keyboard = new Scanner(System.in);
		
		/** Ask for variables */
		System.out.print("Please enter the number of x values to process: ");
		sizeArray = keyboard.nextInt();
		// Check if the number of values is greater than 0
		if (sizeArray <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		xMin = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		xIncrement = keyboard.nextDouble();
		// Check if increment is greater than 0
		if (xIncrement <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
			
		/** Create arrays */
		double[] xVal = new double[sizeArray];
		double[] yVal = new double[sizeArray];
		int[] numStars = new int[sizeArray];
		
		/** Assign values to arrays */
		xVal[0] = xMin;
		// Calculate x values
		for (int i = 1; i <= sizeArray - 1; i++) {
			xVal[i] = xVal[i - 1] + xIncrement;
		}
		// Calculate y values
		for (int j = 0; j <= sizeArray - 1; j++) {
			yVal[j] = 20.0 * Math.abs(Math.sin(xVal[j]));
		}
		// Calculate number of stars for each y value
		for (int l = 0; l <= sizeArray - 1; l++) {
			numStars[l] = (int)yVal[l];
		}
		
		/** Print vales for arrays */
		System.out.println("\nValues");
		// Print all x and y values
		for (int k = 0; k <= sizeArray - 1; k++) {
			System.out.println("x: " + String.format("%.3f", xVal[k]) +
							 ", y: " + String.format("%.3f", yVal[k]));
		}
		System.out.print("\nGraph\n");
		// Print stars
		for (int m = 0; m <= sizeArray - 1; m++) {
			System.out.print(":");
			for (int n = 0; n <= numStars[m] - 1; n++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
