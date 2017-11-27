//Bagels.java
//Author: Benjamin VonKeller
//Submission Date: 11/3/2017
//Purpose: This is the main method. It will do all of the prompting and loop the game and call the different classes to play the game.
//Statement of Academic Honesty:
//The following code represents my own work. I have neither
//received nor given inappropriate assistance. I have not copied
//or modified code from any source other than the course webpage
//or the course textbook. I recognize that any unauthorized
//assistance or plagiarism will be handled in accordance
//with the policies at Clemson University and the
//policies of this course. I recognize that my work is based
//on an assignment created by the School of Computing
//at Clemson University. Any publishing or posting
//of source code for this project is strictly prohibited
//unless you have written consent from the instructor.
import java.util.Arrays;
import java.util.Scanner;
public class Bagels {

	public static void main(String[] args) {
		System.out.println("Welcome!");
		Scanner keyboard = new Scanner(System.in);
		String condition = "";
		do {
			condition = "";
			Player player1 = new Player();
			Engine engine = new Engine();
			Validator validator = new Validator();
			System.out.print("Enter the number of digits to use: ");
			engine.setNumDigits(keyboard.nextInt());
			System.out.println();
			System.out.print("Enter the name of the player: ");
			player1.setName(keyboard.next());
			int i = 0;
			int gameCount = 0;
			do {
				i = 0;
				engine.generateNewSecret();
				gameCount++;
				System.out.println("Starting game #" + gameCount);
				int moveCount = 0;
				do {
					System.out.print("Enter your guess: ");
					moveCount++;
					int[] guess = engine.convertNumToDigitArray(keyboard.next());
					System.out.println("");
					if (validator.validateGuess(engine.getSecretNumber(), guess, engine.getNumDigits())) {
					System.out.println("Congratulations! You won in " + moveCount + " moves.");
					i = 1;
					player1.updateStats(moveCount);
					System.out.println();
					System.out.println("Statistics for " + player1.getName() + ":");
					System.out.println("Games completed: " + player1.getGamesCompleted());
					System.out.println("Number of digits: " + engine.getNumDigits());
					System.out.println("Fastest win: " + player1.getFastestWin());
					System.out.println("p - Play again\nr - Reset game\nq - Quit");
					condition = keyboard.next();
					if (condition.equals("q")) {
						System.exit(0);
					}
				}
				}
				while (i == 0);
			}
			while (condition.equals("p"));
		}
		while (condition.equals("r"));
	}
}
