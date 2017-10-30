import java.util.Scanner;

public class StarGraph {
	/*
	* StarGraph.java
	* Author: Taylor Hennessy
	* Submission Date: 10/19/2017
	*
	* Purpose: This program prints out a graph made of stars.
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
	
	//scanner object to read 
	public static Scanner inputScanner = new Scanner(System.in);

	//main method
	public static void main(String[] args) {
		//variables for user input
		int arrayLength;
		double xMin;
		double xInc;
		
		//declare arrays for x and y values
		double[] xVals;
		double[] yVals;
		
		//declare variable to truncate 
		int chop;
	
		
		
		//ask for the size of the array
		System.out.print("Please enter the number of x values to process: ");
		//get array size
		arrayLength = inputScanner.nextInt();
		//if it's negative or 0
		if (arrayLength <= 0)
		{
			//print out error and quit
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		
		//ask for minimum x val
		System.out.print("Enter a minimum value for x: ");
		xMin = inputScanner.nextDouble();
		
		//ask for x increment val
		System.out.print("Enter the amount to increment x: ");
		//get xInc
		xInc = inputScanner.nextDouble();
		//if it's negative or 0
		if (xInc <= 0)
		{
			//print out error and quit
			System.out.println("The incement must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		//initialize arrays
		xVals = new double[arrayLength];
		yVals = new double[arrayLength];
		
		//print out values
		System.out.println("\nValues");
		
		//populate array
		for (int i = 0; i < arrayLength; i++)
		{
			xVals[i] = xMin + ((xInc)*i);
			yVals[i] = 20 * Math.abs(Math.sin(xVals[i]));
			System.out.printf("x: " + "%.3f",xVals[i]);
			System.out.printf(", y:" + "%.3f",yVals[i]);
			System.out.print("\n");
			
		}
		
		
		//print out graph
		System.out.println("\nGraph");
		//print stars
		for (int i = 0; i < arrayLength; i++)
		{
			//truncate y val
			chop = (int)yVals[i];
			
			System.out.print(":");
			//print stars
			for (int j = 0; j < chop; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}
