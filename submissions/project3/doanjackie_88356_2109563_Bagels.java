/* 
 * Bagels.java 
 * Author:  Jackie Doan  
 * Submission Date:  11/2/17 
 * 
 * Purpose:
 * This program is used as the game incorporating
 * Player.java and Engine.java to play the game of
 * Pico, Fermi, Bagel
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

	public static void main(String[] args){
		
		//Variable initialization
		int i,j,l,m,n,moves = 0;
		int[] playerGuess, secretNum;
		String playAgain, guess;
		
		System.out.println("Welcome!");
		//Stage 1 loop
		do{
			l = 1;
			System.out.print("Enter the Number of digits to use: ");
			Engine engine = new Engine();
			Player player = new Player();
			engine.setNumDigits(player.numInput());
			System.out.print("Enter the player's name: ");
			player.setName(player.input());
			System.out.println();
			//beginning of game and Stage 2 loop
			do{
				i = 1;
				engine.generateNewSecret();
				System.out.println("Starting game #" + (player.getGamesCompleted() + 1));
				//the user inputs guesses
				do{
					j = 1;
					System.out.print("Enter your guess: ");
					//checks length of guess
					do{
						n = 1;
						guess = player.askForGuess();
						if(guess.length() != engine.getNumDigits()){
							System.out.print("The number inputed was not of correct length"
								+ "\nGuess Again. ");
							n = 0;
						}
					} while (n == 0);
					playerGuess = engine.convertNumToDigitArray(guess);
					secretNum = engine.getSecretNumber();
					Validator.validateGuess(secretNum,
							playerGuess, engine.getNumDigits());
					moves++;
					//checks correct guess
					for(int k = 0;k < playerGuess.length;k++){
						if(playerGuess[k] != secretNum[k]){
							j = 0;
						}
					}
				} while (j == 0);
				player.updateStats(moves);
				System.out.print("Congratulations! You won in " + moves + " moves.\n"
						+ "\nStatistics for "+ player.getName() + ":"
						+ "\nGames completed: " + player.getGamesCompleted()
						+ "\nNumber of digits: " + engine.getNumDigits()
						+ "\nFastest win: " + player.getFastestWin() + " guesses"
						+ "\np - Play again\n" + "r - Reset game\n" + "q - Quit\n"
						+ "\nWhat would you like to do? ");
				moves = 0;
				//Checks user for repeat program at which stage
				do{
					m = 1;
					playAgain = player.input();
					if(playAgain.equalsIgnoreCase("p")){
						i = 0;
					}
					else if(playAgain.equalsIgnoreCase("r")){
						l = 0;
					}
					else if(playAgain.equalsIgnoreCase("q")){
						System.out.println("\nGoodbye!");
						System.exit(0);
					}
					else{
						System.out.print("Input was not recognized. \nTry Again.");
						m = 0;
					}
				} while (m == 0);	
				System.out.println();
			} while (i == 0);
		} while (l == 0);
	}
}