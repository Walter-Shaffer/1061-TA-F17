/* StarGraph.Java
* Author: Allison Tizik
* Submission Date: 10/19/17
* Purpose: The program calculates x and y values due to the 
* incremented change in x that is inputed.  It prints out the 
* amount of x and y values due to the size of the array that is inputted.
* The minimum x values which the program starts from it also inputted.
* From the inputted values it outputs x and y values and then rounds
* the y values down to the output stars for the number the y values 
* represents with each x, creating the star graph.
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
	
	
	
	Scanner input = new Scanner (System.in);
	
	//declaring variables
	int n;// the size of the array
	double minX; //minimum x value inputed
	float incrementX;// the increment between x values
	String star ="*";
	
	//recieveing inputs
	System.out.print("Please enter the number of x values to process: ");
	n = input.nextInt();
	
	if (n<= 0){//Report error if the x values are equal to or less than 0 to 
	System.out.print("The number of x values must be an integer greater than 0.");
	System.exit(0);
	}else{
		
	System.out.print("Enter a minimum value for x: ");
	minX = input.nextDouble();
	System.out.print("Enter the amount to increment x: ");
	incrementX = input.nextFloat();
	if (incrementX <=0){//report error if increment is less than or equal to 0
	System.out.print("The increment must be a decimal number greater than 0.");
	System.exit(0);
	}else{
	
	System.out.print("\nValues\n");//prints out header
	
	
	
	double x [] = new double [n]; // x arrays
	double y [] = new double [n]; // y arrays


	for (int i = 0; i<n; i++){ //allowing to get the x and y values for size of array (n)
	x [i]= minX + (incrementX *i); //receving the incremented x values
	y [i]= 20.0 * (Math.abs(Math.sin(x[i]))); //receving the y values with different x values
	System.out.printf("x: %.3f", x[i]); //printing out with correct decimals
	System.out.printf("\ty: %.3f", y[i]); //printing out with correct decimals
	System.out.print("\n");
	}//end of for loop
	
	System.out.print("\nGraph\n");//prints out header
	
	for (int j = 0; j < y.length; j++ ){ //creating grapth
	double yValues = Math.floor(y[j]);//rounding y values down
	System.out.print(":");
	for (int i = 0; i < yValues; i++){
	System.out.print(star); //printing out stars due to the value of y 
	}//end of nested for loop
	System.out.print("\n");
	}//end of for loop
	
	
	}
	}
}

}
