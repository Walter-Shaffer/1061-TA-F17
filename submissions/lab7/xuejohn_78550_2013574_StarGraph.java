/*
 * StarGraph.java
 * Author: John Xue
 * Submission Date: Oct. 14, 2017
 *
 * Purpose: print out the values of y = 20.0 * |sinx| as a table
 * and print a graphical representation with asterisks
 * 
 * Statement of Academic Honesty:
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized assistance
 * or plagiarism will be handled in accordance with the policies at
 * Clemson University and the policies of this course. I recognize that my
 * work is based on an assignment created by the School of Computing at
 * Clemson University. Any publishing or posting of source code
 * for this project is strictly prohibited unless you have written
 * consent from the instructor.
 * 
 */

import java.util.Scanner;
import java.lang.Math;

public class StarGraph {
	public static void main(String[] args) {
		int arraySize;
		double minX, stepX;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Please enter the number of x values to process: ");
		arraySize = keyboard.nextInt();
		if (arraySize <= 0) {
			System.out.printf("The number of x values must be an integer greater than 0.");
			keyboard.close();
			return;
		}
		System.out.printf("Enter a minimum value for x: ");
		minX = keyboard.nextDouble();
		System.out.printf("Enter the amount to increment x: ");
		stepX = keyboard.nextDouble();
		if (stepX <= 0) {
			System.out.printf("The increment must be a decimal number greater than 0.");
			keyboard.close();
			return;
		}
		keyboard.close();
		
		double[] valueX = new double[arraySize];
		double[] valueY = new double[arraySize];
		
		System.out.printf("\nValues\n");
		double j = minX;
		for (int i = 0; i < arraySize; i++, j+=stepX) {
			valueY[i] = 20.0 * Math.abs(Math.sin(j));
			valueX[i] = j;
			System.out.printf("x: %.3f, y: %.3f\n", valueX[i], valueY[i] );
		}
		
		System.out.printf("\nGraph\n");
		for (int i = 0; i < arraySize; i++) {
			System.out.printf(":");
			for (int k = (int)valueY[i]; k > 0; k--){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
	}
}
