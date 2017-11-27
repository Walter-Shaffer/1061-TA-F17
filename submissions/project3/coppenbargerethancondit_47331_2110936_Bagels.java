/*
* Bagels.java
* Author: Ethan Coppenbarger
* Submission Date: 11/02/2017
*
* Purpose: 	This program runs the game Pico, Fermi, Bagel with the 
* 			Engine, Player, and Validator classes
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

public class Bagels {

	public static void main(String[] args) {
		// create objects for necessary classes
		Scanner keyboard = new Scanner(System.in);
		Engine engine = new Engine();
		Validator validator = new Validator();
		Player player = new Player();
		
		// variables
		boolean isCorrect = false;
		boolean playing = true;
		int moves = 0;
		char playAgain = '-';
		
		System.out.println("Welcome!");
		do {
			if (playAgain != 'p') {																// ask for new user info if they are not a returning one
				player = new Player();
				System.out.print("Enter the number of digits to use: ");
				engine.setNumDigits(keyboard.nextInt());
				System.out.print("Enter the player's name: ");
				player.setName(keyboard.next());
			}
			engine.generateNewSecret();															// create a new "secret number" which the user will try to guess
			System.out.println("\nStarting game #" + (player.gamesCompleted() + 1));
			while (isCorrect != true) {															
				moves += 1;
				isCorrect = validator.validateGuess(engine.getSecretNumber(), 					
						engine.convertNumToDigitArray(player.askForGuess()), 					// ask the player for their guess and compare it to the secret number 
						engine.getNumDigits());													// as long as they have not guessed correctly
			}
			System.out.println("Congratulations! You won in " + moves + " moves.\n");			// print out a statement on user winning
			player.updateStats(moves);

			System.out.println("Statistics for " + player.getName());							// print statistics
			System.out.println("Games completed: " + player.gamesCompleted());					// "
			System.out.println("Number of digits: " + engine.getNumDigits());					// "
			System.out.println("Fastest win: " + player.getFastestWin());						// "
			System.out.println("p - Play again\nr- Reset game\nq - Quit\n");					// ask user whether to play again
			System.out.println("What would you like to do? ");
			playAgain = keyboard.next().charAt(0);
			moves = 0;																			// reset variables for game
			isCorrect = false;																	// "
			if (playAgain == 'q') {
				System.out.println("Goodbye!");
				playing = false;
			}
		} while (playing);
	}
}
