/*
* Player.java
* Author: Timothy Morse
* Submission Date: Oct 29, 2017
*
* Purpose: Main funciton for Pico, Fermi, Bagel, handles the game at runtime
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
		Scanner keyboard = new Scanner(System.in);
		Player player = new Player();
		Engine engine = new Engine();
		boolean resetControl = false;

		while(resetControl!=true){
			System.out.println("Welcome!");
			System.out.print("Enter the number of digits to use: ");
			engine.setNumDigits(keyboard.nextInt());
			System.out.println(engine.getNumDigits());
			System.out.println("Enter the player's name: ");
			player.setName(keyboard.next());
			boolean playControl = false;
			int gameNum = 1;
			while(playControl!=true){
				System.out.println("\nStarting game #"+gameNum+".");
				boolean guessControl = false;
				engine.generateNewSecret();
				int guessNum = 0;
				while(guessControl!=true){
					int[] secret = engine.getSecretNumber();
					int[] guess = engine.convertNumToDigitArray(player.askForGuess());
					int numDigys = engine.getNumDigits();
					guessControl = Validator.validateGuess(secret,guess,numDigys);
					guessNum++;
				}	
				gameNum++;
				System.out.println("Congratulations! You won in "+guessNum+" moves.");
				player.updateStats(guessNum);
				System.out.print("Statistics for "+player.getName()+":\nGames Completed: "+player.getGamesCompleted()+"\nNumber of digits: "+engine.getNumDigits()+"\nFastest win: "+player.getFastestWin()+" guesses\np - Play again\nr - Reset game\nq - quit\n\nWhat would you like to do? ");
				String answer = keyboard.next();
				if(answer.equals("p")){
					//do nothing
				}else if(answer.equals("r")){
					playControl = true;
				}else if(answer.equals("q")){
					playControl = true;
					resetControl = true;
				}
			}
			
		}
	}

}
