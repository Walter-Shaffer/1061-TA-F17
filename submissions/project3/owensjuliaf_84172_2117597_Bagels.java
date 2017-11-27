/*
* Bagels.java
* Author: Julia Owens
* Submission Date: 11/3/2017
*
* Purpose: A program that will play the guessing game Pico, Fermi, Bagel.
*
* Statement of Academic Honesty:
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
*
*/

import java.util.Arrays;
import java.util.Scanner;
public class Bagels {
	static boolean correct;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		String playAgain = "";
		int[] userGuesses;
		int numberOfMoves= 0;
		int numDigits;
		int numberOfGames = 1;
		System.out.println("Welcome!");
		Player user = new Player();
		System.out.print("Enter the number of digits to use: ");
		numDigits = keyboard.nextInt();
		String playerName = keyboard.nextLine();
		
		if (playAgain.equalsIgnoreCase("r") || user.getGamesCompleted() == 0) {
			System.out.print("Enter the player's name: ");
			playerName = keyboard.nextLine();
			System.out.print("\n");user.setName(playerName);
		}
		do {
			if (playAgain.equalsIgnoreCase("r")) {
				System.out.println("Enter the number of digits to use: ");
				numDigits = keyboard.nextInt();
				numberOfGames++;
			}
		// requests information from the player
			
		System.out.println("Starting game #" + numberOfGames);
		Engine engine = new Engine();
		engine.setNumDigits(numDigits);
		engine.getSecretNumber();
		engine.generateNewSecret();
		int [] secretNumber = engine.getSecretNumber();
		correct = false;

		do {
			numberOfMoves++;
			String guess= user.askForGuess();
			engine.convertNumToDigitArray(guess);
			Validator check = new Validator();
			check.validateGuess(secretNumber,engine.convertNumToDigitArray(guess) , numDigits);
			//checks the players guesses
			
			if(Arrays.equals(engine.convertNumToDigitArray(guess), secretNumber)) {
				correct = true;
				System.out.println("Congratulations! You won in " + numberOfMoves + " moves");
				user.updateStats(numberOfMoves);
				System.out.println("Statistics for " + user.getName());
				System.out.println("Games completed: " + numberOfGames);
				System.out.println("Number of digits: " + engine.getNumDigits());
				System.out.println("Fastest win: " + user.getFastestWin() + " guesses");
				System.out.println("p - Play again");
				System.out.println("r - Reset game");
				System.out.println("q - Quit");
				System.out.println("What would you like to do?");
				playAgain = keyboard.nextLine();
				numberOfGames++;
			}
			// displays the stats 
			
			if(playAgain.equals("r")) {
					
			}
			
			if(playAgain.equals("q")) {
				System.exit(0);
			}
			
			if(playAgain.equals("p")) {
					
			}
		}
		
		while(correct == false); 
		}
		
		while(playAgain.equals("p") || playAgain.equals("r"));
	}
}
