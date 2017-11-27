
/*
* Bagels.java
* Author:  Alejandro Pardo
* Submission Date:  November 2
* Purpose: The class bagels calls methods from engine and player and contains the main method that runs the game
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

public class Bagels {

	public static void main(String[] args) {
		int games = 0;
		Scanner keyboard = new Scanner(System.in);

		Engine engine = new Engine(); // object in order to call methods from
										// engine
		Player player = new Player();// object in order to call methods from
										// pleyer
		Validator validator = new Validator();
		int number = 0;
		System.out.println("Welcome!");
		String decision = "";

		System.out.print("Enter the number of digitis to use: "); // how many
																	// digits
																	// the user
																	// wants to
																	// use
		number = keyboard.nextInt();
		engine.setNumDigits(number); // calls setNumDigits methods from engine

		System.out.print("Enter the player's name: ");// getting the name of the
														// user
		String actualname = keyboard.next();
		player.setName(actualname);
		player.getName();

		System.out.println("");
		while (true) { // main loop for play again
			games++;
			System.out.println("Starting game #" + games);

			engine.generateNewSecret();

			int MovesTaken = 0;
			boolean answer = false;

			while (answer == false) {
				String numberguessed = player.askForGuess(); // ask the user
																// whatever
																// guess they
																// want to enter
				MovesTaken++;
				int[] secretnum = engine.getSecretNumber();

				int[] numg = engine.convertNumToDigitArray(numberguessed);

				answer = validator.validateGuess(secretnum, numg, engine.getNumDigits());

			}
			// print statistics
			player.updateStats(MovesTaken);
			System.out.println("Congratulations! You won in " + MovesTaken + " moves");
			System.out.println("");
			System.out.println("Statistics for " + player.getName() + ":");
			System.out.println("Games completed: " + games);
			System.out.println("Number of digits: " + number);
			System.out.println("Fastest win: " + player.getFastestWin() + " guesses");
			System.out.println("p - Play again");
			System.out.println("r - Reset game");
			System.out.println("q - Quit");
			System.out.println("");
			System.out.print("What would you like to do? ");
			decision = keyboard.next();
			if (decision.equals("q")) {// if user chooses q, it ends
				System.out.println("");
				System.out.println("Goodbye!");
				System.exit(0);
			}
			if (decision.equals("p")) {// if they choose p, it goes back up to
										// the main loop.
				System.out.println("");
				System.out.println("");

			}

			if (decision.equals("r"))
			// if they choose r, ill print the next code the go back up to the
			// main loop.
			{
				System.out.print("Enter the number of digitis to use: ");
				int numberagain = keyboard.nextInt();
				engine.setNumDigits(numberagain);

				System.out.print("Enter the player's name: ");
				String actualnameagain = keyboard.next();
				player.setName(actualnameagain);
				player.getName();
				System.out.println("");
			}

		}
	}
}