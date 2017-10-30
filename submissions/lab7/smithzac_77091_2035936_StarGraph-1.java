/*StarGraph.java


 * Zachary Smith
 * 10-20-17
 * This program takes a user inputed number of x values, the
 * minimum x value, and the increment at which the x-value
 * changes, and solves for the y-value of the given equation.
 * It also prints out the appropriate number of stars for
 * each y-value.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not 
 * copied or modified code from any other source other than 
 * the course webpage or the course textbook. I recognize that 
 * any unauthorized assistance or plagiarism will be handled in
 * accordance with the policies at Clemson University and the
 * policies of this course, I recognize that my work is based
 * on an assignment created by the School of Computing at 
 * Clemson University. Any publishing or posting of source
 * code for this project is strictly prohibited unless
 * you have written consent from the instructor.
 * 
 */

import java.util.Scanner;

public class StarGraph {
	
	public static void main(String[] args) {
		
		int N = 0;
		
		double xMin, y;
		
		double increment;
		
		String character = "*";
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the number of x values to process: ");
		
		N = keyboard.nextInt();
		
		if(N <= 0) // cancels program if the number of x values is less than or equal to 0
		{
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		
		System.out.print("Enter a minimum value for x: ");
		
		xMin = keyboard.nextDouble();
		
		System.out.print("Enter the amount to increment x: ");
		
		increment = keyboard.nextDouble();
		
		double [] xArray = new double[N];
		
		double [] yArray = new double[N];
		
		if((increment <= 0)) // cancels program if the increment is less than or equal to 0
		{
			System.out.println("The increment must be a decimal greater than 0.");
			System.exit(0);
		}
		else
		{
			System.out.println("Values");
			
			y = 20.0 * Math.abs(Math.sin(xMin));
			
			System.out.printf("x: %.3f", xMin); // prints out beginning x and y values
			
			System.out.printf(", y: %.3f\n", y);
			
			for(int i = 0; i < (N - 1); i++)
			{
				xMin = xMin + increment;
				
				xArray [i] = xMin;
				
				yArray [i] = 20.0 * Math.abs(Math.sin(xArray[i]));

				System.out.printf("x: %.3f", xArray[i]); // prints out the rest of the x and y values
				
				System.out.printf(", y: %.3f\n", yArray[i]);
				
			}
			
			System.out.println("\nGraph");
			
			int [] intYArray = new int[yArray.length]; //truncates the numbers in the array by converting to a int
			for(int i = 0; i < intYArray.length; i++)
			{
				intYArray[i] = (int) yArray[i];
			}
			
			int intY = (int) y; //truncates the starting number by converting to a int
			
			// prints out the stars in the right shape
			
			if(intY == 0)
			{
				System.out.println(": ");
			}
			else
			{
				System.out.println(String.format(": %0" + intY + "d", 0).replace("0", character));
			}
			for(int i = 0; i < (N - 1); i++)
			{
				if(intYArray[i] == 0)
				{
					System.out.println(": ");
					
				}
				else
				{
					System.out.println(String.format(": %0" + intYArray[i] + "d", 0).replace("0", character));
				}
				
					
			}
			
		}
		

	}

}