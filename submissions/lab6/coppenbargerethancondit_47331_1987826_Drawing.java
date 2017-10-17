/**
* Drawing.java
* Author: Ethan Coppenbarger
* Submission Date: 10/10/2017
*
* Purpose: Draw a triangle based on input
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
		// variables
		Scanner keyboard =  new Scanner(System.in);
		int starsInput = 0;
		int repeats = 0;
		
		// get and validate input
		// repeats
		System.out.print("How many times do you want to repeat the figure? ");
		if (keyboard.hasNextInt() == false) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		repeats = keyboard.nextInt();
		if (repeats <= 0) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		//stars
		System.out.print("Enter number of stars (>1): ");
		if (keyboard.hasNextInt() == false) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		starsInput = keyboard.nextInt();
		if (starsInput <= 0) {
			System.out.println("Invalid Input");
			System.exit(0);
		}

		keyboard.close();
		
		// loop
		for (; repeats > 0; repeats--) {
			for (int stars = starsInput; stars > 0; stars--) {
				for (int i = stars; i >= 0; i--) {
					if (i > 0) {
						System.out.print("*");
					} else {
						System.out.println();
					}
				}
			}
			for (int stars = 1; stars <= starsInput; stars++) {
				for (int i = stars; i >= 0; i--) {
					if (i > 0) {
						System.out.print("*");
					} else {
						System.out.println();
					}
				}
			}
		}

	}

}
