/*
* Bagels.java
* Author: Andrew Padgett
* Submission Date:
*
* Purpose: Bagels class calls on methods from Engine, Player,
* 		   and Validator and uses various loops and logic statements
* 		   to create a game where the user must guess a random
* 		   number of an inputed length and is provided feedback
* 		   after every guess.
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


//import scanner class
//
import java.util.Scanner;

public class Bagels {
	
	public static void main(String[] args) {
		
		//create Scanner object keyboard
		//
		Scanner keyboard = new Scanner(System.in);
		
		//create object game for Engine class
		//
		Engine game = new Engine();
		
		System.out.println("Welcome!");
		
		//loops when player enters "r" to reset game when correct number is guessed
		//
		boolean resetGame = true;
		while (resetGame == true){
			
			//creates new player object when game is reset so statistics are also reset
			//
			Player player = new Player();
			System.out.print("Enter the number of digits to use: ");
			
			//game object calls on setNumDigits to read how long secret number should be
			//
			game.setNumDigits(keyboard.nextInt());
			System.out.print("Enter the player's name: ");
			
			//player object calls on setName to read in new player name
			//
			player.setName(keyboard.next());
			
			//loops when player enters "p" to play again with 
			//same player when correct number is guessed
			//
			boolean playAgain = true;
			
			//int i used to label game number
			//
			int i = 1;
			while (playAgain == true){
				
				System.out.println("\nStarting game #" + i);
				
				//game object calls on generateNewSecret to create new secret number
				//
				game.generateNewSecret();
				
				//loop counts moves to win and ends when validateGuess returns true
				//
				boolean correctAnswer = false;
				for (int movesToWin = 1; correctAnswer == false; movesToWin++){
					correctAnswer = Validator.validateGuess(game.getSecretNumber(), game.convertNumToDigitArray(player.askForGuess()), game.getNumDigits());
					if (correctAnswer == true){
						
						//player object calls on updateStats
						//
						player.updateStats(movesToWin);
						
						//print out statistics for player object
						//
						System.out.println("Congratulations! You won in " + movesToWin + " moves.");
						System.out.println("\nStatistics for " + player.getName());
						System.out.println("Games completed: " + player.getGamesCompleted());
						System.out.println("Number of digits: " + game.getNumDigits());
						System.out.println("Fastest win: " + player.getFastestWin());
					}
					else;			
				}
				
				//prints options once game is completed
				//
				System.out.println("p - Play again");
				System.out.println("r - Reset game");
				System.out.println("q - Quit");
				
				//if statement determines what choice is entered and sets booleans resetGame and playAgain accordingly
				//
				boolean validChoice = false;
				while(validChoice == false){
					System.out.print("\nWhat would you like to do? ");
					char finishChoice = keyboard.next().charAt(0);
					if (finishChoice == 'p'){
						resetGame = false;
						playAgain = true;
						validChoice = true;
						System.out.println("");
					}
					else if (finishChoice == 'r'){
						playAgain = false;
						resetGame = true;
						validChoice = true;
						System.out.println("");
					}
					else if (finishChoice == 'q'){
						playAgain = false;
						resetGame = false;
						validChoice = true;
						System.out.println("\nGoodbye!");
						keyboard.close();
						System.exit(0);
					}
					else{
						System.out.println("Please enter valid choice.");
						validChoice = false;
					}
				}
				
				//increments game number by 1
				//
				i++;			
			}			
		}		
	}	
}
