/*
* StarGraph.java
* Author: Andre Washington
* Submission Date: 10/19/17
*
* Purpose:
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
//Importing Java Scanner
import java.util.Scanner;
public class StarGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
	double xDigit, yDigit;
	int xMin;
	double xIncrement;
	
		
		System.out.print("Please enter the number of x vaules to process: ");
		xDigit = keyboard.nextDouble();
	if (xDigit <= 0){
		System.out.print("The number of x values must be an integer greater than 0.");
		System.exit(0);
	}
		
	else{
	System.out.print("Enter a minimum value for x: ");
		xMin = keyboard.nextInt();
		
		System.out.print("Enter the amount to increment x: ");
		xIncrement = keyboard.nextInt();
	
		xDigit = 0 ;
		System.out.println("\nDigits");
			
		
	for(int i = 0; i < 10; i++){
			//System.out.print("The increment must be a decimal greater than 0.");
		yDigit = 20 * Math.abs(Math.sin(xDigit));
		System.out.println("x: " + xDigit + ",y: " + yDigit);
		xDigit = xDigit + xIncrement;
	}
	System.out.print("\nGraph");
	}
	
	String[] StarGraph = new String[xDigit];
	for(int i = 0; i <= xDigit; i++){
		StarGraph[i] = "*";
		System.out.print(StarGraph);
	}
	char[size]graph;
		System.out.println(graph);
	if (xDigit <= 0){
		System.out.println("The number of x values must be an integer greater than 0.");
	}
	else{
		System.out.println("Enter a minimum value of x: ");
		xMin = keyboard.nextInt();
		System.out.print("Enter the amount of increment x: ");
		xIncrement = keybord.nextInt();
	if (xIncrement <= 0){
		System.out.println("The increment must be a decimal greater than 0.");
	}
	}
	
	
	
	
	
	
	
	}	
		
}
