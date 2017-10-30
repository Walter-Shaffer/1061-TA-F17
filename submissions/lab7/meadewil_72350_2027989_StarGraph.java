import java.util.Scanner;

/* 
LinkExtractor.java
Author: Sean Meade
Submission Date: 10/19
Purpose: Asks the user for a number of x and y values to calculate
as well as how the user wants the values to be calculated. Then 
it lists the values out next to each other and prints a bar graph
made of stars based on the x and y values. 

Statement of Academic Honesty:
The following code represents my own work. I have neither
received nor given inappropriate assistance. I have not copied
or modified code from any source other than the course webpage
or the course textbook. I recognize that any unauthorized 
assistance or plagiarism will be handled in accordance
with policies at Clemson University and the
policies of this course. I recognize that my work is based
on an assignment created by the School of Computing
at Clemson University. Any publishing or posting 
of source code for this project is strictly prohibited 
unless you have written consent from the instructor. 
*/
public class StarGraph {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the number of x values to process: "); //Asks the user for how many x and y values they want and assigns that number to N. 
		int N = keyboard.nextInt();
		if (N <= 0){ //Checks to make sure N is greater than 0 and prints an error message is it is not. 
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);		
		}
		
		System.out.print("Enter a minimum value for x: "); //Asks the user what x value they want the program to begin with and assigns it to Xmin. 
		double Xmin = keyboard.nextDouble();
		
		System.out.print("Enter the amount to increment x: "); //Asks the user for how they want x to change and assigns that value to increment. 
		double increment = keyboard.nextDouble();
		if (increment <= 0){ //Checks that the variable increment is greater than 0 and prints an error message if it is not. 
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		double[] x = new double[N]; //Creates the needed arrays and variable. 
		double[] y = new double[N];
		int i;
		
		x[0] = Xmin; //Assigns Xmin to the first place in the x array, and gives every other place the sum of the value in the place before it and the increment the user chose. 
			for (i = 1; i < N; i++){
				x[i] = x[i - 1] + increment;
				
			}
		for (i = 0; i < N; i++){ //Calculates the y values based on the x values and assigns them to the correct places. 
			y[i] = 20.0 * Math.abs(Math.sin (x[i]) );
		}
		
		System.out.println("\nValues"); //Lists out the values side by side with each other to three decimal places each. 
		for (i = 0; i < N; i++){
		System.out.printf("x: %-1.3f, ", x[i]);
		System.out.printf("y: %-1.3f", y[i]);
		System.out.print("\n");
		}
		
		System.out.println("\nGraph"); //Prints out the bar graph with i number of rows. Each row has stars equal to the value of the y array at the place i with the decimal places removed. 
		for(i = 0; i < N; i++){ //Ensures the number of rows is equal to i. 
			int v = (int)y[i]; //Assigns v to the truncated y value in the array. 
			System.out.print(":"); 
			for(v--; v >= 0; v--){ //Prints a number of stars equal to the value of v. 
			System.out.print("*");
			}
			System.out.print("\n"); //Starts the next line. 
		}
		
	keyboard.close(); //Closes the keyboard. 
	}

}
