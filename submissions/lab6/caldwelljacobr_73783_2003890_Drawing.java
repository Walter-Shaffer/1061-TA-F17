
/*
* Drawing.java
* Author: Jacob Caldwell
* Submission Date: 10/20/2017
*
* Purpose: To use loops to solve problems such as drawing patterns dependent upon user input
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
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many times do you want to repeat the figure? ");
		int reps = input.nextInt();
	
		if (reps > 1) {
			
			System.out.print("Indicate the number of stars (>1): ");
			int inStars = input.nextInt();
		
			System.out.print("");
			int stars = inStars;
		
			if (stars > 1){
				System.out.println("");
				while (reps > 0){
					int row;
					int column;
					for (row = 0; row < stars; stars--) {
						for (column = 0; column < stars; column++) {
							System.out.print("*");
						}
						System.out.println("");
					}
					stars = inStars;
					for (row = 0; row < stars; row++) {
						for (column = 0; column <= row ; column++) {
							System.out.print("*");
						}
						System.out.println("");
					}
					reps--;
				}
			}
			else {
				System.out.println("Invalid Input");
			}
		}
		else {
			System.out.println("Invalid Input");
		}
	}

}
