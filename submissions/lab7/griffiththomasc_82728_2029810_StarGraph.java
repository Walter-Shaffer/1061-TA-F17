/*
* [StarGraph].java
* Author:Thomas
* Submission Date: October 19, 2017
*
* Purpose: This project is designed for the user to input an x value
*  and how many he wants and the incremets in x to be plugged in a function
*   of y so that you get points for each x value and graph the y values
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

		int Xmax;

		//gets the number of x values it should have while still >0

		System.out.print("Please enter the number of x values to process:");

		Xmax = keyboard.nextInt();

		if(Xmax<=0){

		System.out.println("The number of x values must be an integer greater than 0.");

		System.exit(0);

		}


		//what x value should begin can be any number

		System.out.print("Enter a minimum value for x:");

		double Xmin = keyboard.nextDouble();

		//gets the number of x value increment it should have while still >0

		double Xinc;


		System.out.print("Enter the amount to increment x:");

		Xinc = keyboard.nextDouble();

		if(Xinc<=0){

		System.out.println("The increment must be a decimal number greater than 0.");

		System.exit(0);

		}

		 



		double y;


		System.out.println("");

		System.out.println("Values");

		double ValueOfX [] = new double [Xmax];

		double ValueOfY [] = new double [Xmax];

		for (int i = 0; i< Xmax; i++){


		ValueOfX [i] = (Xmin + 0.0000);


		int test;

		for(test = 0; test <1; test++){


		y = 20.0 * Math.abs( Math.sin(Xmin));

		ValueOfY [i] = (y + 0.000);



		}

		test = 0;



		Xmin = Xmin + Xinc;


		}

		for (int i = 0; i< Xmax; i++){

		System.out.printf("x: %1.3f" , ValueOfX[i]);

		System.out.print(", ");


		int test;

		for(test = 0; test <1; test++){

		System.out.printf("y: %1.3f" , ValueOfY[i]);

		System.out.println("");

		}

		}


		System.out.println("");

		System.out.println("Graph");



		for (int x = 0; x < Xmax; x++){

		System.out.print(":");

		for (int t = 0; t < Math.floor(ValueOfY[x]); t++){

		System.out.print("*");

		}


		System.out.println("");

		}


		}







}
