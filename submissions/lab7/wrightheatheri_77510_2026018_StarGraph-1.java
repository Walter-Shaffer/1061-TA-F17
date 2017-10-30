/*
* StarGraph.java
* Author: Heather Wright
* Submission Date: October 18, 2017
*
* Purpose: This program requests input from the user in terms
* of the number of values to process. This variable is  used to
* determine the length of the array. The second input is for the
* minimum x value which is the starting point for the sin graph.
* The last variable is the increment which says what value x 
* increases at. It uses these variables to create arrays which
* store the x and y values of a sin graph using the formula 
* provided in the lab pdf. These numbers are printed for the user
* in a table. Lastly the system prints out the number of stars 
* that would appear in the sin graph using nested for loops.
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
		int n;
		double xMin;
		double increment;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the number of x values to process: ");
		n = keyboard.nextInt();
		if(n <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum values for x: ");
		xMin = keyboard.nextDouble();
		System.out.print("Enter the amount to increment: ");
		increment = keyboard.nextDouble();
		if(increment <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		System.out.println("Values");
		double[] arrayX = new double[n];
		double[] arrayY = new double[n];
		for(int i = 0; i < n; i++) {
			arrayX[i] = (xMin + (i * increment)) ;
			System.out.printf("x: " + "%.3f" + ", ", arrayX[i]);
			arrayY[i] = 20.0 * Math.abs(Math.sin(arrayX[i]));
			System.out.printf("y: " + "%.3f" + "\n", arrayY[i]);
		}
		System.out.print("\nGraph");
		for(int i = 0; i < n; i++) {
			System.out.print("\n:");
			for(int j = 0; j < (int)arrayY[i]; j++) {
				System.out.print("*");
			}
		}
	}
}
