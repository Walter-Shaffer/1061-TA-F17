
/*
* StarGraph.java
* Author: Jacob Caldwell
* Submission Date: 10/20/2017
*
* Purpose: To ask the user for values and to solve a function and 
* create a star graph based upon user input.
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
		System.out.print("Please enter the number of x values to process: ");
		int N = input.nextInt();
		
		if (N < 1){
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		
		System.out.print("Enter a minimum value for x: ");
		double xMin = input.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		double increment = input.nextDouble();
		
		if (increment <= 0){
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		double xValue[] = new double[N];
		double yValue[] = new double[N];
		
		xValue[0] = xMin;
		
		for (int i = 1; i < N; i++) {
			xValue[i] = xValue[i - 1] + increment;
		}
		
		for (int i = 0; i < N; i++) {
			yValue[i] = 20.0 * Math.abs(Math.sin(xValue[i]));
		}
		
		System.out.println("Values");
		for (int i = 0; i < N; i++) {
			System.out.println("x: " + String.format("%.3f", xValue[i]) + ", y: " + String.format("%.3f", yValue[i]));
		}
		
		System.out.println("");
		System.out.println("Graph");
		
		for (int i = 0; i < N; i++) {
			int yStars = (int)yValue[i];
			System.out.print(":");
			for (int star = 0; star < yStars; star++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
