import java.util.Scanner;

/* 
 * File name: Bagels.java
 * Author: Monica Hart
 * Submission Date: 11/3/2017
 *
 * This program does the following:
 * This program sets up a game of Bagels and asks for the user
 * guesses, calling on the Engine, Player, and Validator files to
 * respond to the player's guess until they get the right answer,
 * and then print stats.
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
 *
 */

public class Bagels {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String whatNext; //p, r, or q - entered by user later
		
		//welcome
		System.out.println("Welcome!");
				
		do{
			
			//new player and engine objects
			Player player1 = new Player();
			Engine engine1 = new Engine();
			
			//enter number of digits
			System.out.print("Enter the number of digits to use: ");
			int numDigits = keyboard.nextInt();
			engine1.setNumDigits(numDigits);
			
			//enter player name
			System.out.print("Enter the player's name: ");
			player1.setName(keyboard.next());
			
			//start game
			do{
				
				int countMoves = 0; //counts number of moves taken each game
				
				System.out.println("\nStarting game #" + (player1.getGamesCompleted() + 1) + ".");
				
				engine1.generateNewSecret(); //generates new secret number
				String picoFermiBagel; //string containing pico/fermi/bagel and true or false
								
				do{
					
					//enter guess
					System.out.print("Enter your guess: ");
					int[] guess; //guess entered by user as array
					guess = engine1.convertNumToDigitArray(keyboard.next());
					
					//check guess
					picoFermiBagel = "" + Validator.validateGuess(engine1.getSecretNumber(), guess, engine1.getNumDigits());
					
					//print feedback
					if (picoFermiBagel.endsWith("true"))
						System.out.print(picoFermiBagel.substring(0, picoFermiBagel.indexOf("true")).trim());
					else
						System.out.print(picoFermiBagel.substring(0, picoFermiBagel.indexOf("false")).trim());
					countMoves++;
					
				}while(picoFermiBagel.endsWith("false"));
				
				//congratulations
				player1.updateStats(countMoves);
				System.out.println("Congratulations! You won in " + countMoves + " moves.");
				System.out.println("\nStatistics for " + player1.getName() + ":");
				System.out.println("Games completed: " + player1.getGamesCompleted());
				System.out.println("Number of digits: " + engine1.getNumDigits());
				System.out.println("Fastest win: " + player1.getFastestWin() + " guesses");
				
				//menu
				System.out.println("p - Play again");
				System.out.println("r - Reset game");
				System.out.println("q - Quit");
				System.out.print("\nWhat would you like to do? ");
				
				whatNext = keyboard.next(); //string of entered response
				System.out.println();
				
			}while(whatNext.equals("p")); //play again
			
			
		}while(whatNext.equals("r")); //reset game
		
		//quit
		System.out.println("Goodbye!");

	}

}
