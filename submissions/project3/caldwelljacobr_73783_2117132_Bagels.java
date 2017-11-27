import java.util.Scanner;

public class Bagels {

	public static void main(String[] args) {
		
		String option = "p";
		System.out.println("Welcome!");
		
		while (option.equalsIgnoreCase("q") == false) {
			Scanner keyboard = new Scanner (System.in);
			Engine Engine = new Engine();
			Player Player = new Player();
			option = "p";
			
			System.out.print("Enter the number of digits to use: " );
			int numDigits = keyboard.nextInt();
			if (numDigits < 1) {
				System.out.println("Error: number of digits must be at least 1");
			}
			else {
				Engine.setNumDigits(numDigits);
				System.out.print("Enter the player's name: ");
				String name = keyboard.next();
				Player.setName(name);
				//System.out.println(Engine.getNumDigits() + " " + Player.getName());
				//^^^ this would output what the player had just entered
				
				while (option.equalsIgnoreCase("r") == false) {
					Engine.generateNewSecret();
					int numberOfMoves = 0;
					System.out.println("Starting game #" + (Player.getGamesCompleted() + 1));
					boolean answer = false;
					while (answer == false) {
						System.out.print("Enter your guess: ");
						String guessString = Player.askForGuess();
						int[] guess = Engine.convertNumToDigitArray(guessString);
						answer = Validator.validateGuess(Engine.getSecretNumber(), guess, Engine.getNumDigits()); 
						numberOfMoves++;
						//the game itself, checking the input to the secret number
					}
					//After game has completed, it will output the updated stats for the player
					System.out.println("Congratulations! You won in " + numberOfMoves + " moves.");
					Player.updateStats(numberOfMoves);
					System.out.println("");
					System.out.println("Statistics for " + Player.getName() + ":");
					System.out.println("Games completed: " + Player.getGamesCompleted());
					System.out.println("Number of digits: " + Engine.getNumDigits());
					System.out.println("Fastest win: " + Player.getFastestWin());
					System.out.println("p - Play again");
					System.out.println("r - Reset game");
					System.out.println("q - Quit");
					System.out.println("");
					int error = -1;
					while (error == -1) {
						System.out.print("What would you like to do? ");
						//asks for whether the player wishes to play again, restart, or quit
						option = keyboard.next();
						if(option.equalsIgnoreCase("q")) {
							System.out.println("");
							System.out.println("Goodbye!");
							System.exit(0);
						}
						if (option.equalsIgnoreCase("r")) {
							error = 0;
						}
						if (option.equalsIgnoreCase("p")) {
							System.out.println("");
							error = 0;
						}
						else if (error == -1){
							System.out.println("Invalid input");
						}
					}
					System.out.println("");
				}
			}
		}
		
	}

}
