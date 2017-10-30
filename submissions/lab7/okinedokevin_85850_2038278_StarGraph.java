/*
* StarGraph.java
* Author: Kevin Okinedo
* Submission Date: 10/20/17
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program uses nested for loops and arrays to output statements depending on the user's input.
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
		
		Scanner keyboard = new Scanner(System.in);
		
		//variables for star graph
		int numX, starcount[];
		String star = "*";
		double increment, minimum;
		
		String starPoint[];
		
		//asking user for inputs
		System.out.println("Please enter the amount of x values to process.");
		numX = keyboard.nextInt();
		
		System.out.println("Enter a minimum value for x: ");
		minimum = keyboard.nextDouble();
		
		System.out.println("Enter the amount for the increment x: ");
		increment = keyboard.nextDouble();
		
		//error occurs when x-value is less than 1
		if (numX < 1)
		{
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		
		//error occurs when increment is less than or equal to 0
		if (increment<= 0)
		{
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		double [] x = new double[numX]; //X-arrays
		double [] y = new double[numX]; //Y-arrays
		
		for (double i = 0, a = minimum; i < x.length; i++){
			x[(int) i] = a;
			a += increment;
		}
		
		for(int i = 0; i < y.length; i++){
			y[i] = 20.0 * Math.abs(Math.sin(x[i]));
		}
			
		System.out.println("Values");
		
		for (int i = 0; i < x.length; i++){
			System.out.print("x: ");
			System.out.printf("%.3f", x[i]);
			System.out.print(", y: ");
			System.out.printf("%.3f", y[i]);
			System.out.println("");
		}
		
		System.out.println("Graph");
		for (int i = 0; i < x.length; i++){
			System.out.print(":");
			for (int c = 0; c < Math.floor(y[i]); c++){
				System.out.print(star);
			}
			System.out.println("");
		}
	}
}

