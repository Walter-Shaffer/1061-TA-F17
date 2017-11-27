/* bagels.java 
 * Author:  Alex Dobrenen 
 * Submission Date:  November 3
 * Purpose: A brief paragraph description of the 
 * program. What does it do? Plays the game 
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
 */

import java.util.Scanner;
public class bagels 
{
	public static void main(String[] args) 
	{
		/*Welcome!
		Welcome!
*Enter the number of digits to use: 2
*Enter the player's name: Kyle
*Starting game #1.
*Enter your guess: 12
*Bagel
*Enter your guess: 34
*Bagel
*Enter your guess: 56
*Fermi
*Enter your guess: 57
*Fermi
*Enter your guess: 58
*Fermi
*Enter your guess: 59
*Fermi Fermi
*Congratulations! You won in 6 moves.
*Statistics for Kyle:
*Games completed: 1
*Number of digits: 2
*Fastest win: 6 guesses
*p - Play again
*r - Reset game
*q - Quit
*What would you like to do? p
*/		
		player player1 = new player();
		Scanner input = new Scanner(System.in);
		engine engine1 = new engine();
		Validator validator1 = new Validator();
		String intake = "";
		boolean feedback = true;
		String guess = "";
		int[] guessInt;
		int moves = 0;
		
		System.out.println("Welcome!");
		
		do
		{
			System.out.println("Enter number of Digits:");
			engine1.setNumDigits(input.nextInt());
			
			System.out.print("Please enter your name: ");
			intake = input.next();
			player1.setName(intake);
			
			do
			{
				System.out.println("Starting Game #" + (player1.getGamesCompleted() + 1));
				engine1.generateNewSecret();
				//int[] tester = engine1.getSecretNumber();
				//for(int x = 0; x < tester.length; x++)
				//	System.out.print(tester[x]);
				//System.out.println();;
				
				do
				{
					guess = player1.askForGuess();
					guessInt = new int[engine1.getNumDigits()];
					guessInt = engine1.convertNumToDigitArray(guess);
					feedback = validator1.validateGuess(engine1.getSecretNumber(), 
						guessInt, engine1.getNumDigits());
					moves++;
				}while(feedback == false);
			
				System.out.println("Congrats, you won in " + moves + " moves.");
				player1.updateStats(moves);
				System.out.println("Games Completed: " + player1.getGamesCompleted());
				System.out.println("Number of Digits: " + engine1.getNumDigits());
				System.out.println("Fastest Win: " + player1.getFastestWin());
				System.out.println("p - play again");
				System.out.println("r - reset game");
				System.out.println("q - quit");
				System.out.println("What would you like to do?");
				intake = input.next();
				
				//Reset fields
				feedback = true;
				guess = "";
				moves = 0;
			}while(intake.charAt(0) == 'p');
		}while(intake.charAt(0) != 'q');
	}
}
