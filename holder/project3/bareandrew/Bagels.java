import java.util.Scanner;
/*
* Bagels.java
* Author: Andrew Bare
* Submission Date: 11/3/17
*
* Purpose: This program runs the main function of a game like Pico
* Fermi Zilch
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
		//keyboard
		Scanner kb = new Scanner(System.in);
		Validator validate = new Validator();
		//Game Begins---------------------------------------------------------
		System.out.println("Welcome!");
		
		boolean gameTime = true;
		
		
		//Loop that runs for duration of game---------------------------------
		do
		{
			Engine game = new Engine();
			Player p = new Player();
			
			System.out.print("Enter the number of digits to use: ");
			game.setNumDigits(kb.nextInt());
			System.out.print("Enter the player's name: ");
			p.setName(kb.next());
			System.out.println(""); //Spacer
			
			boolean reset = false;
			//loop to continue the game with the same number of digits-------
			do
			{
				reset = false;
				String guess = new String();
				int moves = 0;	//number of moves completed
				
				System.out.println("Starting game #" +(p.getGamesCompleted()+1) + ".");
				
				//new secret number
				game.generateNewSecret();
//				for (int i = 0; i<game.getSecretNumber().length; i++)
//				{
//					System.out.print(game.getSecretNumber()[i]);
//				}
//				System.out.println("\n"); //Spacer
				
				//loop to run while guess is incorrect-----------------------
				boolean incorrect = true;
				while (incorrect)
				{
					guess = p.askForGuess();
					//make guess into an int array
					
//					System.out.println("Lengths:" + game.getSecretNumber().length 
//							+game.convertNumToDigitArray(guess).length
//							+game.getNumDigits());
					if (validate.validateGuess(game.getSecretNumber(), game.convertNumToDigitArray(guess), game.getNumDigits()))
						incorrect = false;
					moves++;
				}
				System.out.println("Congratulations! You won in " + moves + " moves.\n");
				p.updateStats(moves);//updates stats for player
				//Prints stats
				System.out.println("Statistics for " + p.getName() + ":");
				System.out.println("Games completed: "+ p.getGamesCompleted());
				System.out.println("Number of digits: "+ game.getNumDigits());
				System.out.println("Fastest win: "+ p.getFastestWin() + " guesses");
				//choice
				System.out.println("p- Play again");
				System.out.println("r- Reset game");
				System.out.println("q- Quit\n");
				System.out.print("What would you like to do? ");				
				
				String decision = kb.next();
				//decide what happens
				if (decision.equalsIgnoreCase("q"))
				{
					System.out.println("\nGoodbye!");
					System.exit(0);
				}
				else if (decision.equalsIgnoreCase("r"))
				{
					reset = true;
				}
				
			} while (reset == false);
			
		} while (gameTime);
		

	}

}
