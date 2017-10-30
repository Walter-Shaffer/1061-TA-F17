/*
* StarGraph.java
* Author: [Jason Battaglini]
* Submission Date: [10/19/17]
*
* Purpose: This program, StarGraph, will generate and array x
* after the user inputs the minimum x value and value that x will
* increment by. The program will then use the values in the x array
* to fill the array y. Using the values in the y array, the 
* program will then make a graph of stars based off of the 
* whole number of the y values.
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
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Please enter the number of x values to process: ");
		int N=keyboard.nextInt();
		if (N<=0){
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		System.out.println("Enter a minimum value for x: ");
		double minimum=keyboard.nextDouble();
		System.out.println("Enter the amount to incriment x: ");
		double increment=keyboard.nextDouble();
		if (increment<=0){
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		//System.out.println(N);
		//System.out.println(minimum);
		//System.out.println(incriment);
		double x[]= new double[N];
		
		for(int i=1;i<x.length;i++){
			x[0]=minimum;
			x[i]=x[i-1]+increment;
			//loop to fill the x array
		}
		//x[0]=minimum;
		//System.out.println(x[0]);
		//System.out.println(x[1]);
		//System.out.println(x[2]);
		//System.out.println(x[9]);
		
		double y[]=new double[N];
		for (int z=0;z<y.length;z++)
			y[z]=20*(Math.abs(Math.sin(x[z])));
		//loop to calculate y values with the given x values
		System.out.println("Values");
		for(int c=0;c<N;c++){
			y[c]=Math.round(y[c]*1000.0)/1000.0;
			x[c]=Math.round(x[c]*1000.0)/1000.0;
			//rounds x and y to three decimal places for formatting
		
			//System.out.println(x[c]+"\t"+y[c]);
			System.out.printf("x: %.3f",x[c]);
			System.out.printf(", y: %.3f", y[c]);
			System.out.print("\n");
			//prints x and y formatted to three decimal places
			
			
		}
		System.out.println("\nGraph");
		for(int t=0;t<N;t++){
			 double v=y[t];
			 if (v>=0){
				 System.out.print(":");
				 //will print a : at the start of every line for formatting
			 }
			 for(double s=v;s>1;s--){
				 
				 
				 
				 System.out.print("*");
				 //determines the amount of stars to print
			 }
			System.out.println("");	 
			//empty space printed to start a new line
		}
			
				
				//int q[]=new int[10];
		//for(int p=0;p<q.length;p++)
			//q[p]=p+1;
		//System.out.println(q[9]);
		
		
		//double y[]=new double[0];
		
		
		

	}

}


