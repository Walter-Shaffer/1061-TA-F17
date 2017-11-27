/**
 * Bagels.java
 * Author: Jacky Wong
 * Submission Date: 11/3/2017
 * 
 * Purpose: This is the main program for the game "Pico, Fermi, Bagel."
 * Users will need to execute this to play the game.
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

import java.util.Scanner;

public class Bagels {

	public static void main(String[] args) {
		/** Declare variables */
		boolean resetGame = true, askGuess, playAgain;			// These correspond to the menu at the end of every game
		int digits, movesTaken = 1;
		int[] guessArray;
		String playerName = "", guessString = "", menuChoice = "";
		
		/** Create objects */
		Engine engine = new Engine();
		Validator validator = new Validator();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome!");
		
		/** Loop of game, includes entering digits */
		while (resetGame == true) {
			Player player = new Player();			// Has to be remade every time, resets scores
			
			System.out.print("Enter the number of digits to use: ");
			digits = keyboard.nextInt();
			engine.setNumDigits(digits);
			
			keyboard.nextLine();
			System.out.print("Enter the player's name: ");
			playerName = keyboard.nextLine();
			player.setName(playerName);
			
			System.out.print("\n");

			playAgain = true;
			
			while (playAgain == true) {
				/** Make new secret number to guess */
				engine.generateNewSecret();
				System.out.println("Starting game #" + (player.getGamesCompleted() + 1));
				
				askGuess = true;
				movesTaken = 1;
				
				while (askGuess == true) {
				
					guessString = player.askForGuess();
					guessArray = engine.convertNumToDigitArray(guessString);			// Convert the number input to array
					if (validator.validateGuess(engine.getSecretNumber(), guessArray, engine.getNumDigits()) == false) {
						askGuess = true;
						movesTaken += 1;
					}
					else {			// If the player wins
						System.out.println("Congratulations! You won in " + movesTaken + " moves.");
						player.updateStats(movesTaken);
					
						System.out.print("\n");
					
						System.out.println("Statistics for " + player.getName() + ":");
						System.out.println("Games completed: " + player.getGamesCompleted());
						System.out.println("Number of digits: " + engine.getNumDigits());
						System.out.println("Fastest win: " + player.getFastestWin() + " guesses");
						System.out.println("p - Play again\nr - Reset game\nq - Quit\n");
						System.out.print("What would you like to do? ");
						menuChoice = keyboard.nextLine();
					
						if (menuChoice.equals("p")) {		// Restarts, ask for new guess
							System.out.print("\n\n");
							askGuess = false;
							playAgain = true;
							resetGame = true;
						}
						else if (menuChoice.equals("r")) {	// Restarts, asks what digits
							System.out.print("\n\n");
							askGuess = false;
							playAgain = false;
							resetGame = true;
						}
						else if (menuChoice.equals("q")) {	// Quits
							System.out.print("\n");
							System.out.println("Goodbye!");
							System.exit(0);
						}
					}
				}
			}
		}
	}
}
