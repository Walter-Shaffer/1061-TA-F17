/*
* StarGraph.java
* Author:  Nina Agafonovas
* Submission Date:  October 19, 2017
* Purpose: Use loops and one dimensional arrays to calculate values and display them in a graph.
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

		// Declare variables
		int n;
		int starsNumber[];
		double Xmin;
		double Xincrement = 0;
		
		
		

		Scanner keyboard = new Scanner(System.in);

		// Get number of x values, x minimum, and increment
		System.out.print("Please enter the number of x values to process: ");
		n = keyboard.nextInt();
		// If the number of x values is zero or negative, then terminate.
		if (n <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		// 
		System.out.print("Enter a minimum value for x: ");
		Xmin = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		Xincrement = keyboard.nextDouble();
		

		// If the increment is zero or negative, then terminate.
		if (Xincrement <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		System.out.println("\nValues");
		// declare arrays x and y
		double x[] = new double[n];
		double y[] = new double[n];
		
		
		// Calculate x and y
			for (int i = 0; i < n; i++) 
			{
			x[i] = Xmin + (i * Xincrement);
			y[i] = (20 * (Math.abs(Math.sin(x[i]))));

			// Print arrays, use print f to display values with 3 decimal places
			System.out.printf("\nx: %.3f", x[i]);
			System.out.printf(", y: %.3f", y[i]);
			}
			
	
	// Outer for loop to print the boundaries of the graph 
		System.out.println();
		System.out.println("\nGraph");
			
	for (int k = 0; k < n; k++) {
		System.out.print(": ");
		// y values will be whole numbers, so truncate by typecasting,
		int Yshort = (int)y[k];
		
		
		//inner for loop to print the correct number of stars.
		for (int j = 0; j < Yshort; j++){
		System.out.print("*");
	}
	
		System.out.println();
	}	
		
		
		
			}
		

			}			
