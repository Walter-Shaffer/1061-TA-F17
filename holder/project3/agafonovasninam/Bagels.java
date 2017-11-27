/*
* Bagels.java
* Author:  Nina Agafonovas
* Submission Date: November 2, 2017
* Purpose: This is the driver class that executes to play the game.
* Honesty:
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

		int gameNum = 0;
		int moves;
		int guess;
		String input;

		Scanner keyboard = new Scanner(System.in);
		Engine engineObject = new Engine();		//Engine object	
		Player playerObject = new Player();		//Player Object

		System.out.print("Welcome!");
		do{
			
		
		System.out.print("\nEnter the number of digits to use: ");
		int n = keyboard.nextInt(); 								// assign n
		engineObject.setNumDigits(n);								// call engine to set n to Num Digits

		System.out.print("Enter the player's name: ");
		System.out.println("");
		String name = keyboard.next();
		playerObject.setName(name);

		do {
			gameNum++;
			System.out.println("\nStarting game #" + gameNum );
			engineObject.generateNewSecret(); 				// based on n
															// generate random number
			
		
			
			
			boolean response = false;
			int numberOfMovesTakenToWin = 0; 	//initially 0

			while (!response) {					//This will always be false until response is validated and becomes true --> will exit the loop.

																						// no need to ask for guess and read in from keyboard bc player
																						// object already does it
				String NumString = playerObject.askForGuess();
				int[] s = engineObject.getSecretNumber();								//once you get a value you must put it somewhere (assign it to int []s)
				int[] playerGuess = engineObject.convertNumToDigitArray(NumString);		// turn string number into an array string number into an array
																					
				response = Validator.validateGuess(s, playerGuess, n); //Call on validator class to compare the user guess to random number
				numberOfMovesTakenToWin++;
			}
				playerObject.updateStats(numberOfMovesTakenToWin);
				System.out.println("Congratulations! You won in " + numberOfMovesTakenToWin + " moves.");
				System.out.println("\nStatistics for " + playerObject.getName() + ":");
				System.out.println("Games completed: " + playerObject.getGamesCompleted());
				System.out.println("Number of digits: " + engineObject.getNumDigits());
				System.out.println("Fastest win: " + playerObject.getFastestWin() + " guesses");
				System.out.println("p - Play again");
				System.out.println("r - Reset game");
				System.out.println("q - Quit");

				System.out.print("\nWhat would you like to do?" );
				input = keyboard.next();
				if (input.equalsIgnoreCase("q")){
					System.out.println("Goodbye!");
					System.exit(0);
				}
				
		}while (input.equalsIgnoreCase("p"));
		
		}while (input.equalsIgnoreCase("r"));
	}
}

