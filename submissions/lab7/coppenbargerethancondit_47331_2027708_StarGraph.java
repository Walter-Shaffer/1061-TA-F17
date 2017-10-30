/**
* StarGraph.java
* Author: Ethan Coppenbarger
* Submission Date: 10/19/2017
*
* Purpose: Print stars based on the function y = 20 * |sin(x)|
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
		// variables
		int size;
		double xmin;
		double increment;
		double currentXValue;
		Scanner keyboard =  new Scanner(System.in);
		
		// get user input
		System.out.print("Please enter the number of x values to process: ");
		size = keyboard.nextInt();
		if (size <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		xmin = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		increment = keyboard.nextDouble();
		if (increment <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		// create arrays
		double[] xValues = new double[size];
		double[] yValues = new double[size];
		
		// fill out x value array
		currentXValue = xmin;
		for (int f = 0; f < size; f++) {
			xValues[f] = currentXValue;
			currentXValue += increment;
		}
		
		for (int f = 0; f < size; f++) {
			yValues[f] = 20 * Math.abs( Math.sin(xValues[f]) );
		}
		
		// print values in x and y arrays
		System.out.println("\nValues");
		for (int f = 0; f < size; f++) {
			System.out.printf("x: %.3f, y: %.3f\n", xValues[f], yValues[f]);
		}
		
		// print graph of y
		System.out.println("Graph");
		for (int f = 0; f < size; f++) {
			System.out.print(":");
			for (double i = 0; i < Math.floor(yValues[f]); i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
					
	}

}
