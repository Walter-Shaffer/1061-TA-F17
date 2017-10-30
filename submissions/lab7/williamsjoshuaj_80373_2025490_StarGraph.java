/*
* StarGraph.java
* Author: Joshua Williams
* Submission Date: 10/18/2017
*
* Purpose: 
* 	The program receives the size of the array the minimum value and the increment value from the user. 
* The program then calculates the x and y values using for loops and the formula provided.
* Then it displays those values and graphs those values using *'s and truncated numbers.
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
		int N;
		double xMin, xIncrement;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the number of x values to process: ");
		N = keyboard.nextInt();
		if (N <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		xMin = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		xIncrement = keyboard.nextDouble();
		if (xIncrement <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		double[] x = new double[N];
		double[] y = new double[N];
		System.out.println("\nValues");
		for (int i = 0; i < N; i++) {
			x[i] = xMin + xIncrement * i;
		}
		for (int i = 0; i < N; i++) {
			y[i] = 20.0 * Math.abs(Math.sin(x[i]));
		}
		for (int i = 0; i < N; i++) {
			System.out.printf("x: %.3f, y: %.3f\n",x[i],y[i]);
		}
		System.out.print("\nGraph");
		for(int i = 0; i < N; i++){
			System.out.print("\n:");
			for(int j = 0; j < (int) y[i]; j++){
				System.out.print("*");
			}
		}
	}
}
