/*
* [Bagels].java
* Author: [Trevon Wilson]
* Submission Date: [11/3/2017]
*
* Purpose: To create a game called Pico, Fermi, Bagel. We have to create different classes
* using methods, arrays, and everything we have learned to make the game run correctly.
*
* Statement of Academic Honesty:
* 
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

	public static int numberOfDigits;
	public static String playerName;
	public static void main(String[] args){
		
		boolean reset = true;
		System.out.println("Welcome!");
		Scanner keyboard1 = new Scanner(System.in);
		Engine engine = new Engine();
		Player player = new Player();
		
		while(reset == true){ //Option for resetting the game
		
			System.out.print("Enter number of digits to use: ");
			numberOfDigits = keyboard1.nextInt();
			engine.setNumDigits(numberOfDigits);
			
			System.out.print("Enter player's name: ");
			playerName = keyboard1.next();
			player.setName(playerName);
			
			boolean play = true;
			while(play == true){
				for(int countGames = 1; countGames > 0; countGames++){
					System.out.println("");
					System.out.println("Starting game #" + countGames);
					
					int guessCount = 0;
					int totalGuessCount;
					
					boolean goBack = true;
					while (true){
						engine.generateNewSecret();
						while (goBack == true){
							totalGuessCount = guessCount;
							String guess = player.askForGuess();
							
					int [] secret1 = engine.getSecretNumber();
					int [] guess2 = engine.convertNumToDigitArray(guess);
					int numDigits = engine.getNumDigits();
					
					Validator v = new Validator();
					if(Validator.validateGuess(secret, guess2, numDigits)==false){
						guessCount++;
						goBack = true;
					}
					else if ((Validator.validateGuess(secret, guess2, numDigits))){
						countGames++; goBack=false;
						System.out.println("Congratulations! You Won in " + guessCount + "moves!");
						if(totalGuessCount < guessCount){
							totalGuessCount = player.getsFastestWin();
						}
						else{guessCount = player.getsFastestWin();}
						
						System.out.println("Statistics for" + player.getName());
						System.out.println("Games Completed" + countGames);
						System.out.println("Number of digits" + engine.getNumDigits());
						System.out.println("Fastest win:" + player.getsFastestWin());
						
						System.out.println("p - Play Again" + "\n"+" r - Reset Game" + "\n"+" q - Quit" + "\n");
						
						System.out.print("What would you like to do?");
						String userDo = keyboard1.next();
						if(userDo.startsWith("q") || userDo.startsWith("Q")){
							System.out.println("Goodbye!");
							System.exit(0);
						}
						else if(userDo.startsWith("p")){
							play = true;
						if(userDo.startsWith("r")){
							
							play = false;
							reset = true;}
						}
						}
					}
						}
					}
				}
			}
	}

}
