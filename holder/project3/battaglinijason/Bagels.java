/*
* [Bagels].java
* Author: [Jason Battaglini]
* Submission Date: [11/03/17]
*
* Purpose: Plays the bagels game(guessing a random number).
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
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Player player = new Player();
		Engine engine = new Engine();
		boolean game = false;

		while(game!=true){
			System.out.println("Welcome!");
			System.out.print("Enter the number of digits to use: ");
			engine.setNumDigits(keyboard.nextInt());
			System.out.println(engine.getNumDigits());
			System.out.println("Enter the player's name: ");
			player.setName(keyboard.next());
			boolean playGame = false;
			int gameNum = 1;
			while(playGame!=true){
				System.out.println("\nStarting game #"+gameNum+".");
				boolean guessGame = false;
				engine.generateNewSecret();
				int guessNum = 1;
				while(guessGame!=true){
					int[] secret = engine.getSecretNumber();
					int[] guess = engine.convertNumToDigitArray(player.askForGuess());
					int numDigys = engine.getNumDigits();
					guessGame = Validator.validateGuess(secret,guess,numDigys);
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
					playGame = true;
				}else if(answer.equals("q")){
					playGame = true;
					game = true;
				}
			}
			
		}
	}

}
