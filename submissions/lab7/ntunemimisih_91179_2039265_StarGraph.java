/*
* StarGraph.java
* Author: Mimi Ntune
* Submission Date: [Submission date here]
*
* Purpose:Compute x and y value from the user and a graphical representation of the function
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
	public static void main(String[] args){
	Scanner keyboard = new Scanner (System.in);
	
	// get them to put in x value
	System.out.print("Please Enter the number of x values to procsess: ");// is this the x value?????????
	int N = keyboard.nextInt();
	
	// temrinate if increment or x value less than or equal to zero
	if (N <= 0 ){
		System.out.println("The number of x values must be an integer greater than 0.");
		System.exit(0);
	}else{
		}
	
	// geth them to put in minimum x
	System.out.print("Enter a minimum value for x: ");
	double min = keyboard.nextDouble();
	// get them to put in the amount to increment x
	System.out.print("Enter the amount to increment x: ");
	double increment = keyboard.nextDouble();
	
	//terminate if increment is less than or equal to zero
	if (increment <= 0){
		System.out.println("The increment must be a decimal number greater than 0.");
		System.exit(0);
	}
	// array with x values
	double[] xv = new double[N];
	xv[0] = min;
	
	//array with y values
	double[] yv = new double[N];
		
	for (int count = 0; count < N; count++){
		for (int j = 0; j < xv[j]; j++){
		yv[count]= 20 * Math.abs(Math.sin(min));
		int num = 0;
		yv[num] +=1;
	}
  System.out.println("x: "+ xv + "y: " + yv );
	}
	}
}