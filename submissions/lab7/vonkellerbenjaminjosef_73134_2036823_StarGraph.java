import java.util.Scanner;
/*
 * StarGraph.java
 * Author: Benjamin VonKeller
 * Submission Date: 10/20/2017
 * 
 * Purpose: This program will take user input and print out a certain number of x-values and y-values for a static function and create a star graph mapping out the values.
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
public class StarGraph {

	public static void main(String[] args) {
		double x, y;
		System.out.println("Please enter the number of X values to process:");
		Scanner keyboard = new Scanner(System.in);
		int length = keyboard.nextInt();
		if (length > 0) {
			double[] xValues = new double[length];
			double[] yValues = new double[length];
			System.out.println("Enter a minimum value for x:");
			double minValue = keyboard.nextDouble();
			System.out.println("Enter the amount to increment x:");
			double increment = keyboard.nextDouble();
			if (increment > 0) {
				System.out.println();
				System.out.println("Values");
				x = minValue;
				for (int i = 0; i<length; i++){
					xValues[i] = x;
					yValues[i] = 20*(Math.abs(Math.sin(x)));
					x = x + increment;
					
				}
				for (int i = 0; i<length; i++){
					System.out.printf("x: " + "%1.3f" + " ", xValues[i]);
					System.out.printf("y: " + "%1.3f", yValues[i]);
					System.out.println();
				}
				System.out.println("Graph");
				for (int i = 0; i<length; i++) {
					y = yValues[i];
					System.out.print(":");
					for (double j = 0; j < (int)y; j++) {
						System.out.print("*");
					}
					System.out.println("");
				}
			}
			else {
				System.out.println("The increment must be a decimal number greater than 0.");
				System.exit(0);
			}
		}
		else {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
	}

}
