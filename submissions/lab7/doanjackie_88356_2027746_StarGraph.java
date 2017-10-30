/* 
 * StarGraph.java 
 * Author:  Jackie Doan  
 * Submission Date:  10/19/17 
 * 
 * Purpose:
 * This programs is designed to help users graph
 * and write the table for the function
 * y = 20 * abs(sin(x)). This program also allows the
 * to input the amount of values, the minimum x value,
 * and the increment for the x value.
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
import java.util.Scanner; //import resources

public class StarGraph {

	public static void main(String[] args) {
		//Initialization of all variables needed
		Scanner keyboard = new Scanner(System.in);
		int n = 0;
		int stars;
		double increment;
		
		//user input of array length
		System.out.print("Please enter number of x values"
				+ " to process: ");
		n = keyboard.nextInt();
		
		//checks for valid user input
		if (n <= 0){
			System.out.println("The number of x values must"
					+ "be an interger greater than 0.");
			System.exit(0);
		}
		
		//creates arrays
		double[] xValue = new double[n];
		double [] yValue = new double [n];
		
		//user input of minimum and increment
		System.out.print("Enter a minimum value for x: ");
		xValue[0] = keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		increment = keyboard.nextDouble();
		
		//checks for valid user input
		if (increment <= 0){
			System.out.println("The increment must be a "
					+ "decimal number greater than 0");
			System.exit(0);
		}
		
		//create and list all the values
		System.out.println("\nValues");
		for (int i = 0; i < xValue.length; i++){
			if (i > 0) {
				xValue[i] = xValue[i-1] + increment;
			}
			yValue[i] = 20 * (Math.abs(Math.sin(xValue[i])));
			System.out.println("x: " + String.format("%.3f", xValue[i]) +
					", y: " + String.format("%.3f", yValue[i]));
		}
		
		//drawing the graph in stars
		System.out.println("\nGraph");
		for (int i = 0; i < yValue.length; i++){
			System.out.print(":");
			stars = (int) yValue[i];
			for (double s = 0; s < stars; s++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		keyboard.close();
	}

}
