/*
* [Bagels].java
* Author: [Anthony Frazier]
* Submission Date: [11/3/17]
*
* Purpose:Calls functions in order to play number guessing game
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagarism will be handled in accordance
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
		// TODO Auto-generated method stub
		//intro statement printed once
		System.out.println("Welcome!");
		//control variable for entire program
		boolean Continue = true;
		//control loop that runs program,will only stop when q is pushed at end
		while(Continue){
			//initializing new objects for the classes
			Engine engine = new Engine();
			Player player1 = new Player();
			Validator validator = new Validator();
			//number of games played,increased every time the program loops, declared here
			//so that when you push q 
			int numberOfGames = 0;
			//boolean controlling if the game should continue, and reset the number of games
			//won, and player name
			boolean running = true;
			
			System.out.print("Enter the number of digits to use: ");
			Scanner keyboard = new Scanner(System.in);
			//temporary variable to store the value of number of digits
			int numDigits = keyboard.nextInt();
			//passes the value of numdigits to the engine class
			engine.setNumDigits(numDigits);
			
			//same as above, passes value of players name to keyboard class
			System.out.print("Enter the player's name: ");
			player1.setName(keyboard.next());
			
			while(running){
				//creates an integer array of the secret number
				engine.generateNewSecret();
				//creates a new int array to store secret number
				int [] secretNumber;
				//passes memory address of engines secret number to the secret number in main
				secretNumber = engine.getSecretNumber();
				//increments the number of games
				numberOfGames++;
				System.out.println("Starting game #" + numberOfGames + ".");
				//controlling statement for loop that executes while user is guessing
				boolean incorrectGuess = true;
				int numberOfMoves = 0;
				while(incorrectGuess){
						//executes asks for guess function from player class
						String guess = player1.askForGuess();
						//takes guess and converts it to a digit array
						int[] aguess = engine.convertNumToDigitArray(guess);
						//increments number of moves
						numberOfMoves +=1;
						//runs validaor on secret number, using guess, and number of digits
						if(Validator.validateGuess(secretNumber, aguess, numDigits)){
							//stops loop asking for guesses
							incorrectGuess = false;
							//updates players stats
							player1.updateStats(numberOfMoves);
							System.out.println("Congratulations! You won in " + numberOfMoves + " moves.\n");
						}
						}
		
				boolean invalidAnswer= true;
				System.out.println("Statistics for " + player1.getName() + ":");
				System.out.println("Games competed: " + player1.gamesCompleted());
				System.out.println("Number of digits:" + engine.getNumDigits());
				System.out.println("Fatest win: " + player1.getFastestWin() +" guesses");
				//loop that runs until player inputs a valid response
				while(invalidAnswer){
					System.out.println("p - Play again\nr - Reset game\nq - Quit\n\nWhat would you like to do?");
					String answer = keyboard.next();
					if(answer.equalsIgnoreCase("q")){
						Continue = false;
						invalidAnswer= false;
						running =false;
						System.out.println("Goodbye!");
					}
					else if(answer.equalsIgnoreCase("p")){
						invalidAnswer =false;
					}
			else if(answer.equalsIgnoreCase("r")){
				invalidAnswer = false;
				running = false;
		}
		}
		}
	}
	}
}