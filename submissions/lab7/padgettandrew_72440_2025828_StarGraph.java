/*
* StarGraph.java
* Author: Andrew Padgett
* Submission Date: 10/18/17
*
* Purpose: Program takes user inputed data to create arrays of x and y values, 
* 		   then creates a graph made of stars.
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

import java.util.Scanner;		//import scanner

public class StarGraph {

	public static void main(String[] args) {
		
		int numberOfValues;			//initialize user inputed values
		double minimumValue;
		double increment;
		
		Scanner keyboard = new Scanner (System.in);			//create new scanner "keyboard"
		System.out.print("Please enter the number of x values to process: ");		//ask user for number of x values to process
		numberOfValues = keyboard.nextInt();		// assign next integer entered to numberOfValues
		
		if (numberOfValues <= 0){		//if statement decides if value is greater than zero
			System.out.println("The number of x values must be an integer greater than 0.");		//quits if number is less than zero
			System.exit(0);
		}
		else;
		
		double[] xValues = new double[numberOfValues];		//create arrays for x and y values with length entered by user
		double[] yValues = new double[numberOfValues];
		System.out.print("Enter a minimum value for x: ");		//ask user for beginning number
		minimumValue = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");		//ask user for amount to increment each x value by
		increment = keyboard.nextDouble();
		
		keyboard.close();			//close keyboard scanner
		
		if (increment <= 0){		//if statement decides if value is greater than zero
			System.out.println("The increment must be a decimal number greater than 0.");		//quits if less than zero
			System.exit(0);
		}
		else;
		
		System.out.println("\nValues");
		
		for (int i = 0; i < xValues.length; i++){		//loop inputs x values into array until length entered by user is reached
			xValues[i] = minimumValue + (increment * i);
		}
		for (int i = 0; i < yValues.length; i++)		//loop inputs y values into array
			yValues[i] = 20.0 * Math.abs(Math.sin(xValues[i]));
		for (int i = 0; i <xValues.length; i++){		//loop prints out x and y values and formats values to 3 decimals
			System.out.printf("x: %.3f",  xValues[i]);
			System.out.print(", ");
			System.out.printf("y: %.3f%n",  yValues[i]);
		}
		System.out.println("\nGraph");
		
		for (int i = 0; i < numberOfValues; i++){		//loop creates graph
			System.out.print(":");
			int j = (int)Math.floor(yValues[i]);		//type cast floor of y values to integer type
			for (int k = 0; k < j; k++){		//loop star until k = y values for each position in array
				System.out.print("*");
			}
			System.out.println("");
			
		}
			
		

	}

}
