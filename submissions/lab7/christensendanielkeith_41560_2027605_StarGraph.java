/*
* StarGraph.java
* Author: Daniel Christensen
* Submission Date: 10/20/17
*
* Purpose: After receiving the desired number of x values, change in x, and minimum value for x, 
* this program prints an approximated graph of 20*sin(x) using stars.
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
		
		Scanner keyboard = new Scanner(System.in);// create scanner object
		
		System.out.printf("Please enter the number of x values to process: ");//prompt user for N
		final int N = keyboard.nextInt();//store N
		if (N>0) {//check if choice of N is valid
			
		}
		else {
			if (N==0) {
				System.out.println("ERROR: The number of x values entered is pointless....");//math dad joke
				System.exit(0);
			}
			else {
				System.out.println("ERROR: The number of x values must be strictly positive.");//actual error message
				System.exit(0);
			}
		}
		
		System.out.print("Enter a minimum value for x: ");//prompt for xmin
		final double xMin = keyboard.nextDouble();//store xmin
		
		
		System.out.print("Enter the amount to increment x (>0): ");//prompt for deltaX
		double deltaX = keyboard.nextDouble();//store deltaX
		
		keyboard.close();//get rid of pesky error notification
		
		System.out.println("");
		
		if(deltaX<=0) {//checks if deltaX is valid
			System.out.println("ERROR: increment value must be strictly positive");//error message
			System.exit(0);//terminate
		}
		
		double xArray[] = new double[N];//define arrays
		double yArray[] = new double[N];
		
		System.out.println("Values");
		
		
		for(int i = 0; i<N ; i++) {//this loop initializes the arrays
			xArray[i] = xMin+(i*deltaX);//xArray values
			yArray[i] = 20*Math.abs( Math.sin( xArray[i] ) );//yArray values
			System.out.printf("%s","x: ");//formatted output of values
			System.out.printf("%-3.3f", xArray[i]);
			System.out.printf("%s", ", y: ");
			System.out.printf("%-3.3f%n", yArray[i]);
			
			
		}
		
		System.out.println("");
		System.out.println("Graph");
		
		for (int i = 0; i<N; i++) {//this loop prints each line
			System.out.printf(":");//using colons as x axis
			for (int j = (int) yArray[i]; j>=0; j-- ) {//this loop prints the stars
				if (j==0) {
					System.out.printf("%s%n","");//creates new line at the end of the stars
				}
				else {
					System.out.printf("*");
				}
			}
		}
		
		

	}

}

