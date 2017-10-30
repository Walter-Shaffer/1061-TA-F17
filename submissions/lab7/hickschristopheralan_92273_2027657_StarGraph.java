import java.util.Scanner;

/*
 * StarGraph.java
 * Author: Christopher Hicks
 * Submission Date 10/16/2017
 * 
 * Purpose: To validate user input, practice using loops, and arrays.
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
public class StarGraph {

	public static void main(String[] args) {
		
		// Array Size = N
		int N; 
		// Minimum Value for X
		double xMin;
		// Value by which X will be increased
		double xInc;
		
		//Scanner
		Scanner input = new Scanner(System.in);
		
		// Array Size for x values
		System.out.print("Please enter the number of x values to process:");						
		N = input.nextInt();					
		// true false statement to run error		
		if (N <= 0){	
			System.out.print("The number of x values must be an integer greater than 0.");		
			System.exit(0);																				
		}
		else { }
		
		// min value for x	
		System.out.print("Enter a minimum value for x:");											
		xMin = input.nextDouble();
			
		System.out.print("Enter the amount to increment x:");
		xInc = input.nextDouble();
		
		// true false statement to run error	
		if (xInc <= 0){
			System.out.print("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}	
		else{}
		
		double [] xValues = new double [(int) N]; 		//Create x array
		double [] yValues = new double [(int) N];		//Create y arrays
		
		System.out.print("\nValues");
		System.out.println("");
		
		//Start of For loop 1
		for (int a = 0; a < N; a++, xMin = xMin + xInc) {
			//X Values
			xValues[a] = xMin;
			// Formula	
			yValues [a] = 20.0 * Math.abs(Math.sin(xMin));										
														
			// Formula output
			System.out.print("x: ");															
			System.out.printf( "%.3f", xMin);
			System.out.print(", y: ");
			System.out.printf("%.3f", yValues [a]);
			System.out.print("\n");	
		}//End for loop 1
		
		System.out.println(" ");
		System.out.println("Graph");		// print line for graph
		
		int z = 0;	// declare z for loop
		// start of loop 2
		for (int b = 1; b <= N; b++) {
			System.out.print(':');
			//start of loop 2.1
			for (int c = 1; c <= (int) Math.floor(yValues[z]); c++){ 
			System.out.print("*");	
			}//end of loop 2.1
		
			System.out.println("");
			z++;
		}//end for loop 2
			
	}//end of main method

}//end of class
					
		
