/*
* Drawing.java
* Author: Patrick Coffee
* Submission Date: 10/11/17
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* It provides a way to input a number of stars and the program prints out that number in a pyramid formation.
* 
* 
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

public class Drawing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize Scanner 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for number of times
		System.out.print("How many times do you want to repeat the figure? ");
		int repeat = input.nextInt();
		
		// Make the first if statement loop
		if (repeat <= 1) {
				System.out.print("Invalid Input");
				System.exit(0);
		}
		
		// Prompt the user for input
		System.out.print("Indicate the number of stars (>1): ");
		int star = input.nextInt();
		System.out.println();
		
		// Make the nested for loops
		for (int r = 1; r <= repeat; r++) {
			for (int c = star; c > 0 ; c--) {
				
				for (int d = 0; d < c ; d++) {
					System.out.print("*");
				}
			
				System.out.println("");
			}
		
			for (int c = 1; c <= star; c++) {
			
				for (int d = 0; d < c; d++) {
					System.out.print("*");
				}
			
				System.out.println("");
			}
		}
	}
}
