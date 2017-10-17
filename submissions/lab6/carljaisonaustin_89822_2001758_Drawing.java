
/*
	* Drawing.java
	* Author: Jay Carl
	* Submission Date: 10/12/17
	*
	* Purpose: Uses for loops to create a certain number of right triangles. Creates a an upside down right triangle with a corresponding upright right triangle..
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

public class Drawing {

	public static void main(String[]args){
	
	//variables
	int starNumber;
	int stars;
	int repetitions;
	
	//user input
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Inidicate Number of stars greater than 1: ");
	starNumber = keyboard.nextInt();
	System.out.print("Indicate the amount of times you want to repetitions: " );
    repetitions = keyboard.nextInt();
	
	//Logic Statements to make stars
	if(starNumber > 1){
	 for(int c = 0; c <= repetitions; c++){ //Amount of Repetitions
		for(int i = starNumber; i > 0; i--){ //Amount of Rows
			for(int j= i; j > 0; j--){  //Amount of Stars Per Row
				System.out.print("*"); //Prints Upside down Right Triangle
				
			}
			System.out.println();
			}
		
		for(int a = 0; a < starNumber; a++){ 
			for(int b = 0; b <= a; b++){
				System.out.print("*"); //Prints right Triangle
				
			}
			System.out.println();
			}
		}			
		}
	else System.out.println("Invalid Input");
		
	}
	
}

