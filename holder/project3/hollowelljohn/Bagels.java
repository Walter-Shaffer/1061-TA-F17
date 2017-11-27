import java.util.Scanner;

/** @formatter:off
* Bagels.java
* Author: John Hollowell
* Submission Date: 10/31/2017
*
* Purpose: A class that uses the Player, Engine, and Validator classes
* to implement a game of “Pico, Fermi, Bagel”.
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
* @formatter:on
*/

public class Bagels {

	private static int		game;
	private static Scanner	keyboard	= new Scanner(System.in);
	private static Player	p;
	private static Engine	e;

	/**
	 * @param args
	 *            unused
	 */
	public static void main(String[] args) {

		System.out.println("Welcome!");
		initGame();

		// The main loop controlling the flow of the game
		while (true) {
			runGame();
			printStatistics();

			System.out.println("p - Play again");
			System.out.println("r - Reset game");
			System.out.println("q - Quit");

			System.out.print("\nWhat would you like to do? ");
			String decision = keyboard.next().toLowerCase();
			if (decision.equals("q")) {
				keyboard.close();
				exitWithMessage("\nGoodbye!");
			}
			if (decision.equals("r")) {
				System.out.println();
				initGame();
				System.out.println();
			}

		}
	}

	/**
	 * Prepare objects and variables for a new game and player.
	 */
	public static void initGame() {

		game = 0;
		e = new Engine();
		p = new Player();

		System.out.print("Enter the number of digits to use: ");
		e.setNumDigits(keyboard.nextInt());

		System.out.print("Enter the player's name: ");
		p.setName(keyboard.next());


	}

	/**
	 * Controls the main execution of the game during play
	 */
	public static void runGame() {

		String guess;
		int moves = 0;
		game++;
		e.generateNewSecret();

		System.out.println("Starting game #" + game);


		do {
			moves++;
			System.out.print("Enter your guess: ");
			guess = keyboard.next();
		}
		while (!Validator.validateGuess(e.getSecretNumber(), e.convertNumToDigitArray(guess), e.getNumDigits()));
		System.out.printf("Congradulations! You won in %d moves.\n", moves);
		p.updateStats(moves);

	}

	/**
	 * Outputs game statistics to the standard output
	 */
	public static void printStatistics() {

		System.out.printf("\nStastistics for %s:\n", p.getName());
		System.out.printf("Games completed: %d\n", p.getGamesCompleted());
		System.out.printf("Number of digits: %d\n", e.getNumDigits());
		System.out.printf("Fastest win: %d guesses\n", p.getFastestWin());
	}

	/**
	 * This method displays an exit message and exits the JVM, using the optional
	 * exit code if provided.
	 * 
	 * @param message
	 *            The message sent to System.out
	 * @param code
	 *            Optional exit code. When omitted, sends exit code of 0
	 */
	public static void exitWithMessage(String message, int... code) {

		System.out.println(message);
		System.exit(code.length > 0 ? code[0] : 0);
	}

}
