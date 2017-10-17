
/*
* Drawing.java
* Author:  Nina Agafonovas
* Submission Date:  October 12, 2017
* Purpose: Use loops and nested loops to display patterns given user input.
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
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
		Scanner keyboard = new Scanner(System.in);

		int numberOfStarsInput = 0;
		int x = 0; // outer loop
		int y = 0; // inner loop
		int z = 0; //way outer loop
		int TimesDisplayed;

		System.out.print("How many times do you want to repeat the figure? ");

		TimesDisplayed = keyboard.nextInt();

			if (TimesDisplayed <1){				

				System.out.println("Invalid Input");
				System.exit(0);
			}

		System.out.print("Indicate the number of stars (>1): "); // prompt for input
		numberOfStarsInput = keyboard.nextInt(); // assign input to variable

		if (numberOfStarsInput <1){				

			System.out.println("Invalid Input");
			System.exit(0);

		}

		for (z = TimesDisplayed; z >= 1; z--) {

			for (x = numberOfStarsInput; x >= 1; x--) { // number of stars
														// (where the stars will
														// start (user input),
														// where they will
														// end, and decrement)
				for (y = 1; x >= y; y++) { // prints the stars
					System.out.print("* ");
				}

				System.out.println(" ");
			}
			for (x = 1; x <= numberOfStarsInput; x++) { // the new start is
														// going to be the finish
														// of the first loop,
														// and run until the max
														// number (user input)
				for (y = 1; x >= y; y++) {
					System.out.print("* ");
				}

				System.out.println(" ");
			}
		}
	}

}
