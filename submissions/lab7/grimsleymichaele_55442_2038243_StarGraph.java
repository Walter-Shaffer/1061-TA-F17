/*
* StarGraph.java
* Author: Michael Grimsley
* Submission Date: 10/20/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
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
public static void main(String agrs[]){

	Scanner keyboard = new Scanner(System.in);
//inputs
System.out.println("Enter a value for 'N':");
	int n = keyboard.nextInt();
System.out.println("Enter a value for 'x':");
	int x = keyboard.nextInt();
System.out.println("Enter an incriment for 'x':");
	double xInc = keyboard.nextDouble();

	if (n <= 0 || xInc <= 0){
		//Error
		System.out.println("Incorrect Input");
		System.exit(0);
	}else{
	//Make arrays
	double[] yRay = new double[n];
	double[] xRay = new double[n];
	//Populate the x-Ray & y-Ray
	//And output
		System.out.println("Values");
		for (int i = 0; i < n; i++ ){
		xRay[i] = x + (xInc*i);
		yRay[i] = 20.0 * (Math.abs( Math.sin(xRay[i]) ) );
		System.out.printf("x: %.3f, y: %.3f\n",xRay[i], yRay[i]);
		
		}
		//For loop for graph 
		System.out.println("Graph");
		for (int q = 0 ; q < n ; q++){
		int star = (int)Math.floor(yRay[q]);
		System.out.print(":");
			//nested for loop
			for (int j = 0 ; j < star ; j++){
				System.out.print("*");
			}
		System.out.print("\n");
		}
	}

	keyboard.close();
}
}
