import java.util.Scanner;
/*
* StarGraph.java
* Author: Jack Maggard
* Submission Date: 10/19/2017]
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program takes a few inputs from the user and solves a math equation for each x value, 
* incrementing that value by a decimal value inputted in the beginning.  
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
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);//importing scanner to read input
		System.out.print("Enter the number of x values to process: ");
		int values = keyboard.nextInt();//getting number of values from user
		if (values > 0) {//ensuring input meets requirement
			System.out.print("Enter a minimum value for x: ");
			double minx = keyboard.nextDouble();//starting x value
			System.out.print("Enter the amount to increment x: ");
			double increment = keyboard.nextDouble();//amount x will increase with each loop
			if (increment > 0) {//increment must be greater than 0 to run 
				double[] y = new double[values];//initializing arrays
				double[] x = new double[values];//size of array is amount of x values
				x[0] = minx;//presetting starting number to the 0 index of x array
				System.out.println("Values");
				for (int i = 0; i < values; i++) {
					double temp = 20 * Math.sin(x[i]);//getting sin of the x
					y[i] = Math.abs(temp);//takes absolute value of the sin of x
					System.out.print("x: " + String.format("%.3f", x[i]) + ", y: " + String.format("%.3f", y[i]) + "\n");
					if (i < values - 1)
						x[i + 1] = x[i] + increment;//increasing the x value by the increment
				}
				System.out.println();
				System.out.println("Graph");//start of graph
				for (int i = 0; i < values; i++) {//for loop for making the :'s
					System.out.print(":");
					for (int j = 0; j < Math.floor(y[i]); j++) {//for loop that prints the amount of stars
						System.out.print("*");
					}
					System.out.println();
				}
			} else {//if increment input does not fit criteria 
				System.out.println("The increment must be a decimal number greater than 0.");
				System.exit(0);
			}
		} else {//if x values input does not fit criteria
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}

	}

}
