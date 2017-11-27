import java.util.Scanner;
/*
* Bagels.java
* Author: Joshua Williams
* Submission Date: 11/2/17
*
* Purpose: 
* 	This is the controller class with the main method for the game Pico, Fermi, Bagel.
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
public class Bagels {
	public static void main(String[] args) {
		//This is the main method that controls the flow of the game.
		Player player = new Player();
		Engine engine = new Engine();
		Scanner keyboard = new Scanner(System.in);
		String nextLoopInput = "";
		boolean nextLoop = true;
		System.out.println("Welcome!");
		System.out.print("Enter the number of digits to use: ");
		engine.setNumDigits(keyboard.nextInt());
		System.out.print("Enter the player's name: ");
		player.setName(keyboard.next());
		while (nextLoop) {
			System.out.println("\nStarting game #" + (player.getGamesCompleted() + 1));
			int moveCounter = 0;
			boolean guess = false;
			engine.generateNewSecret();
			while (!guess) {
				guess = Validator.validateGuess(engine.getSecretNumber(),
						engine.convertNumToDigitArray(player.askForGuess()), engine.getNumDigits());
				moveCounter += 1;
			}
			System.out.println("Congratulations!  You won in " + moveCounter + " moves.");
			player.updateStats(moveCounter);
			System.out.println("\nStatistics for " + player.getName() + ":");
			System.out.println("Games completed: " + player.getGamesCompleted());
			System.out.println("Number of digits: " + engine.getNumDigits());
			System.out.println("Fastest win: " + player.getFastestWin() + " guesses");
			System.out.println("p - Play again\nr - Reset game\nq - Quit\n");
			System.out.print("What would you like to do?");
			nextLoopInput = keyboard.next();
			if (nextLoopInput.equalsIgnoreCase("p")) {
				nextLoop = true;
			} else if (nextLoopInput.equalsIgnoreCase("r")) {
				player = new Player();
				engine = new Engine();
				System.out.print("\nEnter the number of digits to use: ");
				engine.setNumDigits(keyboard.nextInt());
				System.out.print("Enter the player's name: ");
				player.setName(keyboard.next());
				nextLoop = true;
			} else if (nextLoopInput.equalsIgnoreCase("q")) {
				nextLoop = false;
				System.out.println("\nGoodbye!");
			}
		}
	}
}
