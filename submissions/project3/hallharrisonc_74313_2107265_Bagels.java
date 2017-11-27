/*
* Bagels.java
* Author: Harrison Hall
* Submission Date: November 1, 2017
*
* Purpose: This program runs the "Bagel Game" across the validator, player,
* and engine classes. The game consists of user input trying to guess a 
* random number generated based on player choice. It is fun, try it. 
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

import java.util.Scanner; //for user input

public class Bagels {

	public static void main(String[] args) {
		//This will be the main function
		Player user = new Player(); //Create player and engine objects as user and computer
		Engine computer = new Engine();
		
		System.out.println("Welcome!");
		boolean keepGoing = true; //This will let the game loop continue.
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the number of digits to use: ");
		int digitCount = keyboard.nextInt(); 
		computer.setNumDigits(digitCount);//Sets number of digits
				
		System.out.print("Enter the player's name: ");
		keyboard = new Scanner(System.in);
		String userName = keyboard.nextLine();
		user.setName(userName); //Sets user name
		

		//Game (from Validator.java), This is a pretty straightforward loop
		System.out.println("\nStarting game #1."); //Starts game
		while (keepGoing) {	//keepGoing is true
			computer.generateNewSecret(); //Makes secret number
			int turnCount = 0;
			int[] numberGuess = new int[computer.getNumDigits()];
			boolean doItAgain = true;
			while (doItAgain){ //Loops for guesses
				turnCount++;
				String guess = user.askForGuess();
				numberGuess = computer.convertNumToDigitArray(guess);
				Validator.validateGuess(computer.getSecretNumber(), numberGuess, digitCount);
				int x = 0; // if not zero later, we know arrays are not equal
				for (int i = 0; i < digitCount; i++){
					if (numberGuess[i] != computer.getSecretNumber()[i]){ //this makes x not 0 if an integer does not line up... better methods tho
						x++;
					}
				}
				if (x == 0){
					doItAgain = false;
				}
			}
			
			keepGoing = true;
			System.out.println("Congratulations!  You won in " + turnCount + " moves.");
			user.updateStats(turnCount);
			
			//Print Statistics
			System.out.println("\nStatistics for " + user.getName() + ":");
			System.out.println("Games completed: " + user.getGamesCompleted());
			System.out.println("Number of digits: " + computer.getNumDigits());
			System.out.println("Fastest win: " + user.getFastestWin() + " guesses");
			
			
			//Menu
			while(keepGoing){
				keyboard = new Scanner(System.in);
				System.out.print("p - Play again\nr - Reset game\nq - Quit\n\nWhat would you like to do? ");
				String menuInput = keyboard.nextLine(); 
				if (menuInput.equalsIgnoreCase("p")){ //plays game again
					keepGoing = false; //restarts game
					System.out.println("\n\nStarting Game #" + (user.getGamesCompleted() + 1) + ".");
				}else if (menuInput.equalsIgnoreCase("r")){
					//resets game
					turnCount = 0;
					user.updateStats(1000000);
					keyboard = new Scanner(System.in);
					System.out.print("\nEnter the number of digits to use: ");
					digitCount = keyboard.nextInt(); //user input will always be valid for project
					computer.setNumDigits(digitCount);//Sets number of digits
							
					System.out.print("Enter the player's name: ");
					keyboard = new Scanner(System.in);
					userName = keyboard.nextLine();
					user.setName(userName); //Sets user name
					
					System.out.println("\nStarting game #1."); //Starts game
					keepGoing = false;
				}else if (menuInput.equalsIgnoreCase("q")){
					System.out.println("\nGoodbye!");
					System.exit(0); //quits
				} else{
					// N/A, so keepGoing = true
				}
			}
			keepGoing = true;
		}
	}
}
