/*
* [StarGraph].java
* Author: [Spalding Latham]
* Submission Date: [10/20/2017]
*
* Purpose: This program takes user input of x values and increments and prints out the x and y values
* with a correspinding sin graph.
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
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Please enter the number of x values to process: ");
		int N = input.nextInt();
		if (N < 1){
			System.out.print("The number of x values must be an integer greater than 0.");
			System.exit(0);}
		
		
		System.out.print("Enter a minimum value for x: ");
		double min = input.nextDouble();
		
		
		System.out.print("Enter the amount to increment x: ");
		double increment = input.nextDouble();
		if (increment < .000000001){
			System.out.print("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		
		double[] xval = new double[N];
		double[] yval = new double[N];
		String[] x = new String[N];
		String[] y = new String[N];
		
		System.out.println("\nValues");
		
		for (int i = 0; i < N; i++){
		
			
			xval[i] = min;
			String xdecimal = String.format("%.3f", min); //format output to three decimals using a string
			x[i] = xdecimal;
			
			double siny = Math.round(20 * Math.sin(min)*1000.0)/1000.0; //sin part of equation
			double absval = (Math.abs(siny)); //absolute value part of equation
			yval[i] = absval; 
			String ydecimal = String.format("%.3f", absval); //format output to three decimals using a string
			y[i] = String.format("%.3f", yval[i]);
			
				

			
		    System.out.print("x: " + xdecimal + ", y: " + ydecimal);
			System.out.println();
			
			min = min + increment;}
		
		System.out.println();
		System.out.println("Graph");
		
		for (int j = 0; j < N; j++){
			
			double stars = yval[j]; 
			int star = (int)(stars);
			
			String asterix = "*";
			
			String repeated = new String(new char[star]).replace("\0",asterix); //function that prints the certain number of stars
			
			System.out.println(":" + repeated);
		
				
			}
			
		}
		
		
		
		
		

	}


