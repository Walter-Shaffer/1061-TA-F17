/* Bagels.Java
* Author: Allison Tizik
* Submission Date: 11/2/17
* Purpose: This program is an game which you enter a number of digits
* you want to guess and your name. After that you guess numbers
* with the number of digits you answered. After each guess it will
* return either fermi, bagel, or pico. Fermi means that the number is
* right and in the right place. Pico means that the number is right but
* in the wrong place. Bagel means that none of the numbers are right.
* After the number guess is correct it will print the person's statistics
* and ask the person to play again.
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

import java.util.Scanner;
public class Bagels {

	public static void main(String[] args) {
		
		//declares variables
		Player playInfo = new Player();
		Engine engInfo = new Engine ();
		Scanner input = new Scanner(System.in);
		boolean check = false;
		
		//Display Game Statements
		while (check == false){//checks if the game should be continued
		boolean check2 = false;
		
		System.out.println("Welcome");
		
		//asks for name and number of digits. stores data
		System.out.print("Enter the number of digits to use: ");
		engInfo.setNumDigits(input.nextInt());
		System.out.print("Enter the player's name: ");
		playInfo.setName(input.next());
		
		while (check2 == false){ //checks if game should be continued
		boolean check3 = false;
		int numTillWin = 0;
		String playerChoice;
		//begins guessing
		System.out.println("\n");
		System.out.println("Starting game #" + (playInfo.getGamesCompleted() + 1));
		engInfo.generateNewSecret();
		
		while (check3 == false){//checks if game should be continued
		//checks if the digit is bagel, fermi, or pico
		int [] guess = engInfo.convertNumToDigitArray(playInfo.askForGuess());
		int [] secret = engInfo.getSecretNumber();
		int numDigits = engInfo.getNumDigits();
		boolean checkWin = Validator.validateGuess(secret, guess, numDigits);
		numTillWin++;
		if (checkWin == true){
			System.out.println("Congratulations! You won in " + numTillWin);
			check3 = true;
		}
		}
		//prints the stats of player
		playInfo.upateStats(numTillWin);
		System.out.println("");
		System.out.println("Statistcs for " + playInfo.getName());
		System.out.println("Games Completed: " + playInfo.getGamesCompleted());
		System.out.println("Number of Digits: " + engInfo.getNumDigits());
		System.out.println("Fastest Win: " + playInfo.getFastestWin()+ " guesses");
		//asks if player wants to play again, reset, or quit
		System.out.println("p - Play again\nr - Reset Game\nq - Quit");
		System.out.println("\nWhat would you like to do?");
		playerChoice = input.next();
		
		//checks for what the player input if they want to play again, reset of quit.
		if (playerChoice.equalsIgnoreCase("p")){
			System.out.print("");
		}else if (playerChoice.equalsIgnoreCase("r")){
			check2 = true;
			System.out.print("");
		}else if (playerChoice.equalsIgnoreCase("q")){
			System.out.println("\nGoodbye!");
			check = true;
			check2 = true;
		}
			
			
		}
		
}
		
		}
		}
	
		
		
	
