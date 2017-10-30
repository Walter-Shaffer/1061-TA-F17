/*
* StarGraph.java
* Author: Harrison Hall
* Submission Date: 19 October 2017
*
* Purpose: This program calculates 20*sinx given inputs for 
* increment amount, starting value, and number of iterations. It
* then graphs the values in stars. 
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
import java.math.*;

public class StarGraph {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); //This section asks for various user inputs
		System.out.print("Please enter the number of x values to process: ");
		int iterations = keyboard.nextInt(); 
		if (iterations <= 0){ //makes sure positive
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		keyboard = new Scanner(System.in);
		double startValue = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		keyboard = new Scanner(System.in);
		double increment = keyboard.nextDouble(); //make sure positive and not zero
		if (increment <= 0){
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		double xValues[] = new double[iterations]; //Creates arrays for values
		double yValues[] = new double[iterations];
		
		int i = 1; //this section iterates zeroith value for arrays
		xValues[0] = startValue;
		yValues[0] = Math.abs(20 * Math.sin(xValues[0])); //formula for yvalues
		System.out.print("\nValues");
		System.out.printf("\nx: %.3f", xValues[0]);
		System.out.printf(", y: %.3f", yValues[0]);
		
		while (i < (iterations)){ // This computes x and y values in array for all iterations
			xValues[i] = xValues[i - 1] + increment; //this is based on previous values. Could have easily been done other way.
			yValues[i] = Math.abs(20 * Math.sin(xValues[i])); //formula for y values
			System.out.printf("\nx: %.3f", xValues[i]);
			System.out.printf(", y: %.3f", yValues[i]);
			i++;
		}
		 //graph portion
		System.out.print("\n\nGraph");
		i = 0;
		int yStars[] = new int[iterations];
		while (i < (iterations)){ //This computes numbers of stars for each line
			System.out.print("\n:");
			yStars[i] = (int) yValues[i];
			int starTimes = 0;
			while (starTimes < yStars[i]){//prints stars for each line
				System.out.print("*");
				starTimes++;
			}
			i++;
		}
	}//program ends

}
