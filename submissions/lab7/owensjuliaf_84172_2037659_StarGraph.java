/*
* StarGraph.java
* Author: Julia Owens
* Submission Date: 10/20/2017
*
* Purpose: To produce a set of x and y values based on given 
* information and then graph these values. 
*
* Statement of Academic Honesty:
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
		Scanner keyboard= new Scanner(System.in);
		int a= 0;
		System.out.print("Please enter the number of x values to process: ");
		int size= keyboard.nextInt();
		int originalSize= size;
		if (size<= 0){
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.print("Enter a minimum value for x: ");
		double xMin= keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		double increment= keyboard.nextDouble();
		if (increment<= 0){
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		while (size> 0){
			double[] x= new double[size];
			double[] y= new double[size];
			if (a== 0){
				System.out.println("\nValues");
			}
			for (a= 0; size> 0; size--, a++){
				x[a]= xMin + (a * increment);
				y[a]= (20.0 * Math.sin(x[a]));
				x[a]= (double) Math.round(x[a] * 1000) / 1000;
				y[a]= (double) Math.round(y[a] * 1000) / 1000;
				System.out.println("x: " + x[a] + ", y: " + y[a]);
				y[a]= (int) Math.abs(y[a]);
			}
			if (a>= size){
				System.out.println("\nGraph");
				
			}
			while (size<= originalSize){
				for (a= 0; a<= size; a++){
					if (y[a]<= 0){
						System.out.print("");
					}
					System.out.print(":");
					while (y[a]> 0){
						System.out.print("*");
						y[a] -= 1;
					}
					System.out.print("\n");
					size++;
					if (a== (originalSize - 1)){
						System.exit(0);
					}
				}
			}
		}
	}
}
