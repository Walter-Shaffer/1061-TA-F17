
import java.util.Scanner;

/*
* StarGraph.java
* Author: Andrew Bare
* Submission Date: 10/20/17
*
* Purpose: 
* 
* This program takes user input and creates a graph using the equation
* y = 20 (sin(x))
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
		//keyboard input
		Scanner kb = new Scanner(System.in);
		
		//Get user Input
		System.out.print("Please enter the number of x values to process: ");
		int xNumber = kb.nextInt();
		
		//check to make sure input is ok
		if (xNumber <=0)
		{
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		
		System.out.print("Enter the minumum value of x: ");
		double xMin = kb.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		double increment = kb.nextDouble();
		
		//check to make sure input is ok
		if (increment <=0)
		{
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		double[] xArray = new double[xNumber];
		double[] yArray = new double[xNumber];
		
		//fill the x array
		xArray[0] = xMin;
		for (int i = 1; i<xNumber; i++)
		{
			xArray[i] = xArray[i-1] + increment;
		}
		
		//fill the y array
		for (int i =0; i<xNumber; i++)
		{
			yArray[i] = 20.0 * Math.abs(Math.sin(xArray[i]));
		}
		//Values Statements
		System.out.println("");
		System.out.println("Values");
		for (int i =0; i<xNumber; i++)
		{
			//Print values			
			System.out.print("x: ");
			System.out.printf("%.3f", xArray[i]);
			System.out.print(", y: ");
			System.out.printf("%.3f", yArray[i]);
			System.out.println("");
			
		}
		
		//Graph
		System.out.println("");
		System.out.println("Graph");
		//builds vertically
		for (int i =0; i<xNumber; i++)
		{
			System.out.print(":");
			
			
			//builds horizontally
			for (int j =0; j < (int)yArray[i]; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
