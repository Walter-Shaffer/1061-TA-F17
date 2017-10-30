/*
* StarGraph.java
* Author: Timothy Morse
* Submission Date: 18 October 2017
*
* Purpose: Program intakes a base x value, a value by which to increment, and how many times to increment
* by, and then outputs the numerical results of this and a truncated-value graph of 20|sin(x)|.
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
import java.lang.Math;
public class StarGraph {

	//A sin method.
	public static double sin(double d){
		return Math.sin(d);
	}
	
	//An absolute value method.
	public static double abs(double d){
		return Math.abs(d);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N  = 0;
		int xmin = 0;
		double increment = 0;
		System.out.print("Please enter the number of x values to process: ");
		N = scan.nextInt();
		if(N>0){//if N is greater than 0, proceed.
			System.out.print("Enter a minimum value for x: ");
			xmin = scan.nextInt();
			System.out.print("Enter the amount to increment x: ");
			increment = scan.nextDouble();
			double[] xvalues = new double[N];
			double[] yvalues = new double[N];
			xvalues[0] = xmin;
			System.out.println("\nValues:");
			//This is the bit where it does the math.
			for(int i = 0; i<N; i++){
				xvalues[i] = xmin + (increment * i);
				yvalues[i] = 20.0*abs(sin(xvalues[i]));
				System.out.println("x: "+xvalues[i]+", y: "+yvalues[i]);
			}
			System.out.println("\nGraphs:");
			//And this is the bit where it graphs it.s
			for(int i = 0;i<N;i++){
				System.out.print(":");
				for(int j = 0;j<Math.floor(yvalues[i]);j++){
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}else{
			System.out.println("Input was unrecognised.");
		}
	}
}
