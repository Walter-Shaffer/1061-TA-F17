
public class Bagels {
	
	/*
	* Bagels.java
	* Author: Taylor Hennessy
	* Submission Date: 11/3/2017
	*
	* Purpose: Class with the main method for the Pico, Fermi, Bagel game. 
	* 			Allows the user to play Pico, Fermi, Bagel with the computer.
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


	
	public static void main(String[] args) {

		String decision = "r";
		String guess = "guess";
		int moves = 0;
		
		//TO sEE IF CORRECT, CREATE NEW ARRAYS WITH THE SAME VALUES, AND 
		//COMPARE THEM????
		int[] theGuess;
		int[] theSecret;
		
		while (decision.equals("r")){
			decision = "p";
			//print out prompts and call on other methods
			System.out.println("Welcome!");
			System.out.print("Enter the number of digits to use: ");
			//call engine to set num digits
			Engine.setNumDigits(Integer.parseInt(Player.askForGuess()));
			System.out.print("Enter the player's name: ");
			Player.setName(Player.askForGuess());
		
		
			//actual game
			while (decision.equals("p"))
			{
				//call engine to make a new secret number
				Engine.generateNewSecret();
				//initialize the secret array
				theSecret = Engine.getSecretNumber();
				
				System.out.println("");
				System.out.println("Starting game #" + (Player.getGamesCompleted() + 1) + ".");
				
				//prompt for guess
				System.out.print("Enter your guess: ");
				guess = Player.askForGuess();
				//call validator
				//Validator.validateGuess(Engine.getSecretNumber(), Engine.convertNumToDigitArray(guess), Engine.getSecretNumber().length);
				//add to num of moves
				moves++;
				
				while (!(Validator.validateGuess(Engine.getSecretNumber(), Engine.convertNumToDigitArray(guess), Engine.getSecretNumber().length))){
					//prompt for guess
					System.out.print("Enter your guess: ");
					guess = Player.askForGuess();
					//call validator
					//Validator.validateGuess(Engine.getSecretNumber(), Engine.convertNumToDigitArray(guess), Engine.getSecretNumber().length);
					//add to num of moves
					moves++;
				}
				System.out.println("Congratulations! You won in " + moves + " moves.");
				System.out.print("");
				//update stats
				Player.updateStats(moves);
				//Print Stats
				System.out.println("Statistics for " + Player.getName() + ":");
				System.out.println("Games completed: " + Player.getGamesCompleted());
				System.out.println("Fastest Win: " + Player.getFastestWin());
				System.out.println("");
				
				//reset moves
				moves = 0;
				
				//Print Menu
				System.out.println("p - Play again");
				System.out.println("r - Reset game");
				System.out.println("q - Quit");
				System.out.println("");
				System.out.print("What would you like to do? ");
				decision = Player.askForGuess();
				System.out.println("");
			
			}
		}
		System.out.println("Goodbye!");
		System.exit(0);
		
	}

}
