import java.util.Scanner;
/*
* Bagels.java
* Author: Lydia Shealy
* Submission Date: 11/2/17
*
* Purpose: Controls and executes the game. Calls any 
* method needed to do this. 
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
		boolean gameStart = true; //to be true for as long as the program is running
		boolean willContinue = true; //controls the loop that starts the game
		boolean gamePlaying = true; //controls the loop of each individual game
		
		Scanner keyboard = new Scanner(System.in); 
		int[] guess; //holds the guessing number to be compared to the secret number with the validator
		//int[] secret; 
		int numberOfGuesses = 0; //counts the number of guesses it takes to guess the secret number 
		
		System.out.println("Welcome!"); 
		
		while (gameStart){ //the entire program, first loop 
			willContinue = true; //makes sure that willContinue is set so that the game can be played
			System.out.print("Enter the number of digits to use: ");
			Engine eng1 = new Engine(); //creates an engine object 
			eng1.setNumDigits(keyboard.nextInt()); //sets the length of the secret number
			
			if (eng1.getNumDigits()<=1){ //makes sure that the secret number is at least 2, loops back to "enter a number" if true 
				System.out.println("You need a number 2 or greater.");
			}
			else{	// if it passes that then the game continues 	
						
				System.out.print("Enter the player's name: ");
				Player player1 = new Player(); //creates a player object
				player1.setName(keyboard.next()); //assigns the player a name
				System.out.println( ); 
			
				while (willContinue){ //second loop, controls the session of the current player  
					gamePlaying = true; //makes sure that this is true so the game can continue 
					System.out.println("Starting game #" + (player1.getGamesCompleted() + 1) + "." ); //shows the current game number 
					eng1.generateNewSecret(); //creates the secret number 
					
					numberOfGuesses = 0; // makes sure the number of guesses is zero for each game 
					
					while(gamePlaying){ //each individual game by player
						
						System.out.print("Enter your guess: "); 
						guess = new int[eng1.getNumDigits()]; //array to hold each number in the guess 
						guess = eng1.convertNumToDigitArray(keyboard.next()); //grabs the user's guess and converts it to an array 
					
						boolean equal = Validator.validateGuess(eng1.getSecretNumber(), guess, eng1.getNumDigits()); //boolean to see whether or not the numbers are the same
					
						if (equal){ //if they are the same then this individual game ends 
							gamePlaying = false; 
						}
						numberOfGuesses++; //counts up for each guess 
					}
					//displaying the stats of the game and the player 
					player1.updateStats(numberOfGuesses);	
					System.out.println("Congratulations! You won in " + numberOfGuesses + " moves.");
					System.out.println();
					System.out.println("Statistics for " + player1.getName() + ":");
					System.out.println("Games completed: " + player1.getGamesCompleted());
					System.out.println("Number of digits: " + eng1.getNumDigits());
					System.out.println("Fastest win: " + player1.getFastestWin() + " guesses");
					System.out.println("p - Play again \nr - Reset game \nq - Quit");
					System.out.println( );
					//asks to continue the current player, or create a new player (reset), or quit the game 
					System.out.print("What would you like to do? ");
					String playingChoice = keyboard.next(); 
					
					if (playingChoice.equalsIgnoreCase("r")){//exits to the first loop (gameStart)
						willContinue = false; 
					}
					else if(playingChoice.equalsIgnoreCase("p")){//exits to the second loop (willContinue)
						willContinue = true;//makes sure all the values are correct to continue 
						gamePlaying = true; 
					}
					else{ //exits all loops and exits the program 
						gameStart = false; 
						System.out.println( );
						System.out.println("Goodbye!");
						keyboard.close(); 
						System.exit(0);
					}	
					System.out.println( );
					System.out.println( );
				}
			
			}
		
		}
		keyboard.close(); 
	}
}
