/*
 * Drawing.java
 * Author: John Xue
 * Submission Date: Oct. 10th, 2017
 *
 * Purpose: asks the user for an integer greater than 1 and displays
 * an inverted right triangle of stars whose sides have specified
 * number of stars.
 *
 * Statement of Academic Honesty:
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized assistance
 * or plagiarism will be handled in accordance with the policies at
 * Clemson University and the policies of this course. I recognize that my
 * work is based on an assignment created by the School of Computing at
 * Clemson University. Any publishing or posting of source code
 * for this project is strictly prohibited unless you have written
 * consent from the instructor.
 */
import java.util.Scanner;

public class Drawing {

	public static void main(String[] args) {
		// Read input
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("How many times do you want to repeat the figure? ");
		int figureNumber = keyboard.nextInt();
		if (figureNumber < 1) {
			System.out.printf("Invalid Input");
			keyboard.close();
			return;
		}
		System.out.printf("Indicate the number of stars (>1): ");
		int starNumber = keyboard.nextInt();
		if (starNumber < 2) {
			System.out.printf("Invalid Input");
			keyboard.close();
			return;
		}
		keyboard.close();
		
		// Draw the figure
		int i = 0;
		int j = 0;
		for (int k = 0; k < figureNumber; k++) {
			for (i = starNumber; i >= 1; i--) {
				for (j = i; j > 0; j--) {
					System.out.printf("*");
				}
				System.out.printf("\n");
			}
			for (i = 1; i <= starNumber; i++) {
				for (j = 0; j < i; j++) {
					System.out.printf("*");
				}
				System.out.printf("\n");
			}
		}
	}

}
