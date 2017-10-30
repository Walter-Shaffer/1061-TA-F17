/*
* StarGraph.java
* Author: Lydia Shealy
* Submission Date: 10/19/17
*
* Purpose: This program calculates the sine * 20 of an x value 
* entered by the user and then incremented a certain number of times, 
* and then graphs the y values calculated in a simple graph made of 
* *s.
* 
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
		Scanner keyboard = new Scanner(System.in); 
		
		//gets input from user 
		System.out.print("Please enter the number of x values to process: ");
		int length = keyboard.nextInt(); 
		if (length <= 0){
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		
		System.out.print("Enter a minimum value for x: ");
		double xMin = keyboard.nextDouble(); 
		
		System.out.print("Enter the amount to increment x: ");
		double increment = keyboard.nextDouble(); 
		if (increment <= 0){
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		//System.out.println(length);
		//System.out.printf("%.3f", xMin); ///THIS DISPLAYS 3 DECIMAL POINTS 
		//System.out.printf("%,.3f", xMin); // this also works
		//System.out.println(xMin);
		//System.out.println(increment);
		
		double[] x = new double[length];
		double[] y = new double[length]; 
		
		int i = 0; 
		x[i] = xMin; 
		//NEED TO USE MATH.ABS TOO *********************
		y[i] = Math.abs(Math.sin(xMin)) * 20.0; 
		//System.out.println(y[i]);
		//System.out.println(x[i]);
		i++;
		
		while ( i < length){
			x[i] = x[i-1] + increment; 
			y[i] = 20.0 * Math.abs(Math.sin(x[i])); 
			i++; 
		}
		
		//System.out.printf("x: %.3f, ", x[i]);
		//System.out.printf("y: %.3f " , y[i]); 
		
		System.out.println( ); 
		System.out.println("Values");
		
		i = 0;
		while (i < length){
			System.out.printf("x: %.3f, ", x[i]);
			System.out.printf("y: %.3f " , y[i]); 
			System.out.println( );
			i++;
		}
		
		System.out.println( );
		System.out.println("Graph");
		int k; 
		i = 0; 
		int j = 0; 
		while (i < length){
			k = (int) y[i];
			System.out.print(":");
			j=0; 
			while (j<k){
				if (k!=0){
					//System.out.print(k); 
					System.out.print("*");					 	
				}
				j++;
			}
			/*for (int j = i; j <= k && j>0; j++){
				//System.out.print(k);
				System.out.print("*");
			}*/
			System.out.println( ); 
			i++; 
			//j++; 
		}
		keyboard.close(); 

	}

}
