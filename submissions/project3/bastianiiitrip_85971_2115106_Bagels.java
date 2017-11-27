import java.util.Scanner;

/*
* CPSC-1060.java
* Author: Trip Bastian
* Submission Date: November 2, 2017
*
* Purpose: To use classes and methods to simulate the game Pico Fermi Bagel.
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
		Engine engine = new Engine();
		Player player = new Player();
		Validator validator = new Validator();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome!");
		boolean reset = false;
		while(1==1){
			System.out.print("Enter number of digits to use: ");
			engine.setNumDigits(keyboard.nextInt());
			System.out.print("Enter the player's name: ");
			player.setName(keyboard.next());
			boolean onGoingGame = true;
			while( onGoingGame == true){
				System.out.println("\nStarting game #"+(player.getGamesCompleted()+1));
				boolean solved = false;
				int moves=0;
				engine.generateNewSecret();
				while(solved ==false){
					System.out.print("Enter your guess: ");
					solved = validator.validateGuess(engine.getSecretNumber(), engine.convertNumToDigitArray(keyboard.next()), engine.getNumDigits());
					moves++;
				}
				player.updateStats(moves);
				System.out.println("Congratulations! You won in "+moves+" moves.\n");
				System.out.print("Statistics for "+player.getName()+":\nGames completed: "+player.getGamesCompleted()+"\nNumber of digits: "+engine.getNumDigits()+"\nFastest win: "+player.getFastestWin()+" guesses\np - Play again\nr - Reset game\nq - Quit\n\nWhat would you like to do? ");
				String input = keyboard.next();
				if(input.equalsIgnoreCase("q")){
					System.out.println("Goodbye!");
					System.exit(0);
				}
				else if (input.equalsIgnoreCase("r")){
					onGoingGame = false;
				}
				else if (input.equalsIgnoreCase("p")){
				}
			}
		}
	}
}