/*
* StarGraph.java
* Author: Elias Weglarz
* Submission Date: 10/20/17
*
* Purpose: Take user input values and create a table of x and y values and then make a graph
* based on the table
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
		int amountX, variable;
		double minimum, increment;
	
		
		System.out.println("Enter number of x values:");
		amountX = keyboard.nextInt();
		if (amountX <= 0){
			System.out.println("The number of x values must be an integer greater than 0");
			System.exit(0);
		}
		System.out.println("Enter minimum value for x");
		minimum = keyboard.nextDouble();
		
		System.out.println("Enter amount to increment x by:");
		increment = keyboard.nextDouble();
		
		if (increment <= 0){
			System.out.println("The increment must be a decimal number greater than 0");
			System.exit(0);
			
		}
		double[] xMinArray = new double[amountX];
		double[] yArray = new double[amountX];
		System.out.println("");
		System.out.println("Values:");
		for (int i=0; i < xMinArray.length; i++){
			xMinArray[i] = minimum + i * increment;
		
		System.out.printf("x: %.3f" , xMinArray[i]);
		yArray[i] = 20.0 * Math.abs(Math.sin(xMinArray[i]));
		System.out.printf(", y: %.3f" , yArray[i]);
		System.out.println("");
		}
		
		System.out.println("");
		System.out.println("Graph:");
		
		for (int k=0; k < xMinArray.length; k++){
			System.out.print(":");
			variable = (int) yArray[k];
			for (int j=0; j < variable; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}
