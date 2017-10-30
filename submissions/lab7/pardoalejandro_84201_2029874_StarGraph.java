/*
* StarGraph.java
* Author:  Alejandro Pardo
* Submission Date:  October 19
* Purpose: This program will calculate the values of x and y according to the user's input and print stars according to y's magnitude 
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
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
		Scanner input = new Scanner(System.in); //gets input from user

		System.out.print("Please enter the number of x values to process: ");
		int SIZE = input.nextInt();
		if (SIZE <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0); //if size of array is less than 0 print error message
		}

		System.out.print("Enter the minimum value for x: ");
		double minimum = input.nextDouble(); //input where the user wants the x values to start

		System.out.print("Enter the amount to increment x: ");
		double increment = input.nextDouble();
		if (increment <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		} //the input of how much you want the x to increase by. if less than 0 print out error message

		double[] XArray = new double[SIZE];
		double[] YArray = new double[SIZE]; 
		// y and x arrays

		System.out.println("");
		System.out.println("Values");

		for (int i = 0; i < SIZE; i++) {
			XArray[i] = minimum + (increment * i); // this increases x array by the increment given by the user
			YArray[i] = (20 * Math.abs(Math.sin(XArray[i]))); // according to the x array, it will print out the y array
			System.out.println("x: " + String.format("%.3f", XArray[i]) + ", y: " + String.format("%.3f", YArray[i]));
		}

		System.out.println("");
		System.out.println("Graph");

		for (int j = 0; j < SIZE; j++) {
			System.out.print(":"); //print the colon according to the size of the array
			int tmp = (int) YArray[j]; // cuts the double into a int.
			for (int x = 0; x < tmp; x++) { //print the asterisks according to the magnitude of the y array
				System.out.print("*");
			}
			System.out.println(); 
			//brings down the graph to the next line.
		}

	}
}