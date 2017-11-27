
/*
* [Bagles].java
* Author: [Thomas Griffith]
* Submission Date: [November, 3 2017]
*
* Purpose: The purpose of the Bagels class for project 3 is to be the
*  main method for all the other classes Engine, Player and Validator
*  that will then run trough the program as it calls methods from the other classes.
*   this game will allow you to guess a number randomly created by the amount of digits
*   this can be monitored by "fermi" "Pico" "bagel" to see how your output is with the correct answer
*   you can restart, play again and quit. you have your own data name fastest win and others to see how you do
*  
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
		// values to help run and keep track of where the game at when playing
		int gamescomleted = 0;
		int trys = 0;
		int fastWin = Integer.MAX_VALUE;
		boolean playAgain = false;
		boolean response = false;
		// the other classes being initiated
		Player player1 = new Player();
		Engine engine1 = new Engine();
		Validator validator = new Validator();

		boolean reset = false;

		Scanner UserInput = new Scanner(System.in);

		System.out.println("Welcome!");
		do {
			// calls for digis and name
			System.out.print("Enter the number of digits to use: ");
			int digits = UserInput.nextInt();
			engine1.setNumDigits(digits);
			System.out.print("Enter player's name: ");
			String name = UserInput.next();
			player1.setName(name);
			System.out.println();
			do {
				// gets a new secret number
				engine1.generateNewSecret();

				gamescomleted = gamescomleted + 1;
				System.out.println("Starting game #" + (gamescomleted));
				do {

					trys++;
					int[] secret = engine1.getSecretNumber();

					String playerstringGuess = player1.askForGuess();
					// convert method in engine
					
					int[] playerGuess = engine1.convertNumToDigitArray(playerstringGuess);

					response = validator.validateGuess(secret, playerGuess, digits);

				} while (response == false);

				if (response == true) {
					System.out.println("Congratulations! You won in " + trys + " moves.");
					System.out.println(" ");
					System.out.println("Statistics for " + name + ":");
					System.out.println("Games completed: " + gamescomleted);
					System.out.println("Number of digits: " + digits);
					if (trys < fastWin) {
						fastWin = trys;
					}
					System.out.println("Fastest win: " + fastWin);
					System.out.println("p - Play again");
					System.out.println("r - Reset game");
					System.out.println("q - Quit");
					System.out.println("");
					System.out.print("What would you like to do? ");
					
					String hi = UserInput.next();
					System.out.println("");
					if (hi.equalsIgnoreCase("p")) {
						playAgain = true;

					}
					if (hi.equalsIgnoreCase("r")) {
						reset = true;
						gamescomleted = 0;
					}
					if (hi.equalsIgnoreCase("q")) {
						System.out.println("");
						System.out.println("GoodBye!");
						System.exit(0);

					}
					// set the repeat do while loops for game and get player
					// stats to update
					// correctly then im good and add comment and the top name
					// class and honor thing
				}
			} while (playAgain == true);
			// do while loop to play again

			if (reset == true) {
				gamescomleted = 0;
				trys = 0;
				fastWin = Integer.MAX_VALUE;
				// do while reset loop
			}
		} while (reset == true);

	}

}