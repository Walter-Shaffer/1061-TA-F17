/**
 * Drawing.java
 * Author: Jacky Wong
 * Submission Date: 10/12/2017
 * 
 * Purpose: Displays a pattern of stars based on user input, specifically
 * how many stars per row and how many times to repeat the pattern.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance
 * with the policies at Clemson university and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the School of Computing
 * at Clemson University. Any publishing or posting
 * of source code for this project is strictly prohibited
 * unless you have written consent from the instructor.
 */

// Import Scanner
import java.util.Scanner;

public class Drawing {

	public static void main(String[] args) {
		// Declare necessary variables
		int inputStars = 0, starsLeft, totalStars, repeatNum = 0;
		/**
		 * inputStars = original number of stars indicated by user input
		 * starsLeft = number of stars remaining in a line to print
		 * totalStars = total number of stars in a line
		 * repeatNum = how many times to repeat the figure
		 */
		
		// Ask for number of stars
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many times do you want to repeat the figure? ");
		repeatNum = keyboard.nextInt();
		if (repeatNum >= 1) {
			System.out.print("Indicate the number of stars (>1): ");
			inputStars = keyboard.nextInt();
			System.out.print("\n");
			totalStars = inputStars;									// Setting the total amount of stars needed to be printed to input
		}
		else {
			System.out.println("Invalid Input.");
			System.exit(0);
		}
		
		// Print stars
		if (repeatNum >= 1) {											/** Check if repeat input is valid*/
			for (int h = 0; h < repeatNum; h++) {
				if (inputStars > 1) {									/** Check if stars input is valid */
					totalStars = inputStars;							// Reseting stars to be printed back to original
					for (int i = totalStars; i > 0; i--) {				// Start loop that goes from inputed amount of stars to 1
						starsLeft = totalStars;							// Set the amount of stars that need to be printed to required amount
						for (int j = starsLeft; j > 0; j--) {			// Start loop that prints the actual stars within 1 line
							System.out.print("*");						// Print star
						}
						totalStars -= 1;								// Decrement the stars needed to be printed by 1
						System.out.print("\n");							// Start a fresh line
					}
					totalStars = 1;										// Set the amount of stars to be printed per line to 1
					starsLeft = 1;										// Set the amount of stars needed to be printed left to 1
					for (int k = 0; k < inputStars; k++) {				// Start loop that goes from 1 star to inputed amount
						while (starsLeft <= totalStars) {				// Start loop that prints the actual stars
							System.out.print("*");						// Print star
							starsLeft += 1;								// Increase the amount of stars to be printed by 1
						}
						System.out.print("\n");							// Start a fresh line
						totalStars += 1;								// Increase the stars in a line by 1
						starsLeft = 1;									// Reset the amount of stars that is printed per line to 1
					}
				}
				else if (inputStars <= 1) {								/** If number of stars input not valid */
					System.out.println("Invalid Input.");
					System.exit(0);
				}
			}

		}
		else if (repeatNum < 1) {										/** If number of repeat input not valid */
			System.out.println("Invalid Input.");
			System.exit(0);
		}
	}

}
