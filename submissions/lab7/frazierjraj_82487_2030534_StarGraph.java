import java.util.Scanner;
public class StarGraph {
	/*
	* [StarGraph].java
	* Author: [Anthony Frazier]
	* Submission Date: [10/20/17]
	*
	* Purpose:Prompts the user to enter a number for x and a number for y and then uses them in the equation
	* y=20*|sin(x)|.
	*
	* Statement of Academic Honesty:
	*
	* The following code represents my own work. I have neither
	* received nor given inappropriate assistance. I have not copied
	* or modified code from any source other than the course webpage
	* or the course textbook. I recognize that any unauthorized
	* assistance or plagarism will be handled in accordance
	* with the policies at Clemson University and the
	* policies of this course. I recognize that my work is based
	* on an assignment created by the School of Computing
	* at Clemson University. Any publishing or posting
	* of source code for this project is strictly prohibited
	* unless you have written consent from the instructor.
	*/
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int numberOfValues = 0;
	double xMinimum = 0;
	double incrementAmount = 0; 
	boolean validArrayNumber = false;
	boolean validIncrementAmount = false;
	
	System.out.println("Please enter the number of x values to process: ");
	numberOfValues = input.nextInt();
	if(numberOfValues > 0){
		validArrayNumber = true;
	}
	else{
		System.out.println("The number of x values must be an integer greater than 0.");
	}
	if(validArrayNumber){
	System.out.println("Enter a minimum value for x: ");
	xMinimum = input.nextDouble();
	System.out.println("Enter the amount to increment x: ");
	incrementAmount = input.nextDouble();
	if(incrementAmount > 0){
		validIncrementAmount = true;
	}
	else{
		System.out.println("The increment must be a decimal number greater than 0.");
	}
	if(validIncrementAmount){
		double [] xValues = new double[numberOfValues];
		xValues[0] = xMinimum;
		for(int i = 1; i < xValues.length; i++){
			xValues[i] = xValues[i - 1] + incrementAmount;
		}
		double [] yValues = new double[numberOfValues];
		for(int i = 0; i < yValues.length; i++){
			yValues[i] = 20*Math.abs(Math.sin(xValues[i]));
		}
		for(int i = 0; i <yValues.length; i++){
			System.out.printf("x: %.3f, y: %.3f\n", xValues[i], yValues[i]);
		}
		System.out.println("Graph");
		for(int i = 0;i < numberOfValues; i++){
			System.out.print(":");
			for(int l = 0; l < (int)yValues[i]; l++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	}
	}
}