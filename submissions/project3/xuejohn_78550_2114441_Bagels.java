/*
 * Bagels.java
 * Author: John Xue
 * Submission Date: Nov. 2, 2017
 *
 * Purpose: Main function for game "Pico, Fermi, Bagel" that incorporates
 * functionality in Player and Engine Class
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

public class Bagels {

	public static void main(String[] args) {
		
		/* Define various variables */
		Scanner keyboard = new Scanner(System.in);
		String choice = "";
		
		System.out.printf("Welcome!\n");
		do {
			/* Create Player and Engine objects */
			Player player = new Player();
			Engine engine = new Engine();

			/* Input game params */
			System.out.printf("Enter the number of digits to use: ");
			engine.setNumDigits(keyboard.nextInt());
			System.out.printf("Enter the player's name: ");
			player.setName(keyboard.next());
			
			/* Core functionality */
			do {
				/* Main game guessing */
				engine.generateNewSecret();
				System.out.printf("\nStarting game #" + (player.getGamesCompleted() + 1) + ".\n");
				boolean result = false;
				int tries = 0;
				do {
					result = Validator.validateGuess(engine.getSecretNumber(), 
							engine.convertNumtoDigitArray(player.askForGuess()), 
							engine.getNumDigits());
					tries += 1;
				} while (!result);
				System.out.printf("Congratulations! You won in %d moves.\n\n", tries);
				
				/* Display stats */
				player.updateStats(tries);
				System.out.printf("Statistics for %s:\n", player.getName());
				System.out.printf("Games completed: %d\n", player.getGamesCompleted());
				System.out.printf("Number of digits: %d\n", engine.getNumDigits());
				System.out.printf("Fastest Win: %d\n", player.getFastestWin());
				System.out.printf("p - Play again\nr - Reset game\nq - Quit\n\n");
				
				/* End of game decision */
				System.out.printf("What would you like to do? ");
				choice = keyboard.next();
				System.out.println();
			} while (choice.equalsIgnoreCase("p"));
			
		} while (choice.equalsIgnoreCase("r"));
		keyboard.close();
		System.out.printf("Goodbye!\n");
	}

}
