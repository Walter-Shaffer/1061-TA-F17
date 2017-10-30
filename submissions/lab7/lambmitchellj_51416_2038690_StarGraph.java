/*
 * StarGraph.java
 * Author: Mitchell Lamb
 * Submission Date: 10/20/2017
 * 
 * Purpose: The purpose of this program is to prompt the user for the size N of the array,
 * a minimum value for x, and an increment for x, and then the program calculates the
 * value of y, and once the loops are finished, print a simple graph of the function.
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
		
		int N; // Size of array
		double xmin; // Minimum value for x
		double xinc; // Increment value by which x is increased
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the number of x values to process: "); // Prompt user for N
		N = keyboard.nextInt();
		if (N<=0) { // If input N is less than or equal to 0, terminate
			System.out.print("The number of x values must be an integer greater than 0.");
			keyboard.close();
			return;
		}
		
		System.out.print("Enter a minimum value for x: "); // Prompt user for xmin
		xmin = keyboard.nextDouble();
		
		System.out.print("Enter the amount to increment: "); // Prompt user for increment
		xinc = keyboard.nextDouble();
		if (xinc<=0) { // If increment input is less than or equal to 0, terminate
			System.out.print("The increment must be a decimal place greater than 0.");
			keyboard.close();
			return;
		}
		
		double[] xvalues = new double[N]; // Array for x values
		double[] yvalues = new double[N]; // Array for y values
		int j=0; // For allowing input of values into certain location in array
		
		System.out.print("\nValues");
		xvalues[0]=xmin; // Setting first value of x value array equal to xmin
		for (int i=0; N>i; i++) {
			xvalues[j] = xvalues[0]+(j*xinc); // Increment addition with number of loops
			yvalues[j] = 20.0 * Math.abs(Math.sin(xvalues[j])); // Calculating y value
			System.out.printf("\nx: %.3f, y: %.3f",xvalues[j],yvalues[j]); // Printing array values
			j++; // Loop finished
		}
		
		j=0; // Resetting number of loops
		System.out.print("\n\nGraph");
		for (int i=0; N>i; i++) {
			System.out.print("\n:");
			yvalues[j] = Math.floor(yvalues[j]); // Truncating y value in array
			for (int k=0; yvalues[j]>k; k++) {
				System.out.print("*"); // Printing asterisks, loops based on truncated y value
			}
			j++; // Loop finished
		}
		
		keyboard.close();

	}

}
