/*
 * [Stargraph].java 
 * Author: [Aneri Desai]
 * Submission Date: [10/19/2017]
 * 
 * Purpose: In the lab we learned how to use 1-D array and how to initialize them. We also practice 
 * more of nested loops and and pattern that we did in last lab. 
 * 
 *  Statement of Academic Honesty:
 *  
 *  The following code represent my own work. I have neither received nor given inappropriate assistance. 
 *  I have not copied or modified code from any source other than the course webpage or the course textbook.
 *  I recognize that any unauthorized assistance or plagiarism will be handled in accordance with the policies
 *  at Clemson University and the policies of this course. I recognize that my work is based on an assignment 
 *  created by the School of Computing at Clemson Univeristy. Any publishing or posting of source code for this 
 *  project is strictly prohibited unless you have written consent from the instructor.  
 */
package lab7;
import java.math.*;				
public class StarGraph {				
public static void main (String[] args) {				
				
	double min;			//declare double and int variables
	double increment;			
	int i;			
	double k;			
				
	java.util.Scanner input = new java.util.Scanner(System.in);			
				
	System.out.print("Please enter the number of x values to process:");	//askd  for user input		
	int n = input.nextInt();			
				
	if( n>0) {			//if-else statement to set the criteria for user input
		System.out.print("Enter a minimum value for x:");		
		min = input.nextDouble();		
				
		System.out.print("Enter the amount to increment x:");		
		increment = input.nextDouble();		
		if(increment>0) {	
		System.out.println();
		System.out.println("Values");
				
		double [] x = new double[n];		//declare array
		double [] y = new double[n];		
		for(i=0;i<n;i++)	{	//for loop to get x and y values 
			if(i==0)	
			x[0]=min;	
			else 	
			x[i]=x[i-1]+increment;	
			y[i]=20.0*Math.abs(Math.sin(x[i]));	//y value formula 
			System.out.printf("x: %4.3f", x[i]);//printf to round to 3 decimal places
			System.out.print(",");
			System.out.printf("y: %4.3f", y[i]);	
			System.out.println();	
		}		
		for(i=0;i<n;i++)		//for loop to round down all the numbers in the graph
		{		
			y[i]=Math.floor(y[i]);	
				
		}		
		System.out.println();		
		System.out.println("Graph");	
		
		for(i = 0;i<n; i++) {		//for loop to get the graph
				System.out.print(":"); //outer loop
				double w=y[i];
				for(int q=0;q<w;q++) //inner loop
				System.out.print("*");
			System.out.println();	
			}		
				
		}else {		
			System.out.println("The increment must be a decimal number greater than 0.");	
		}		
				
	}else {			
			System.out.println("The number of x values must be an integer greater than 0.");	
	}
}
}