/*
 * StarGraph.java
 * Author: Monica Hart
 * Submission Date: 10/19/2017
 *
 * Purpose: This program lists an inputed number of values for
 * x and the sine values for those x values. Then the program 
 * prints a star graph of the sine values.
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
		
		//ask for size N of the array
		System.out.print("Please enter the number of x values to process: ");
		int N = keyboard.nextInt();
		
		//check value
		if (N > 0){
		
			//ask for minimum x value
			System.out.print("Enter a minimum value for x: ");
			double xMin = keyboard.nextDouble();
			
			//ask for increment for x
			System.out.print("Enter the amount to increment x: ");
			double xIncrement = keyboard.nextDouble();
			
			//check value
			if (xIncrement > 0){
				
				double[] xValues = new double[N];
				double[] yValues = new double[N];
				
				int count;
				
				//get x values
				for (count = 0; count < N; count++){
					
					xValues[count] = xMin + (count * xIncrement);
					
				}
				
				//get y values
				for (count = 0; count < N; count++){
					
					yValues[count] = 20.0 * Math.abs(Math.sin(xValues[count]));
					
				}
				
				//print values
				System.out.println("\nValues");
				for (count = 0; count < N; count++){
					
					System.out.printf("x: %1.3f", xValues[count]);
					System.out.printf(", y: %1.3f\n", yValues[count]);
					
				}
				
				//print graph
				System.out.print("\nGraph");
				int graphCount;
				for (graphCount = 0; graphCount < N; graphCount++){
					
					System.out.print("\n:");
				
					for (count = 0; count < (int)yValues[graphCount]; count++){
					
						System.out.print("*");
					
					}
				
				}
				
			}
			else {
				
				System.out.println("The increment must be a decimal number greater than 0.");
				
			}
		
		}
		else{
			
			System.out.println("The number of x values must be an integer greater than 0.");
			
		}
		
	}

}
