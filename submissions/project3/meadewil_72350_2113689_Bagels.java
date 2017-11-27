import java.util.Scanner;

/* 
Bagels.java
Author: Sean Meade
Submission Date: 11/2
Purpose: The boss class that uses Player.java, Engine.java, and
Validator.java to play a number guessing game using input from 
the user. 

Statement of Academic Honesty:
The following code represents my own work. I have neither
received nor given inappropriate assistance. I have not copied
or modified code from any source other than the course webpage
or the course textbook. I recognize that any unauthorized 
assistance or plagiarism will be handled in accordance
with policies at Clemson University and the
policies of this course. I recognize that my work is based
on an assignment created by the School of Computing
at Clemson University. Any publishing or posting 
of source code for this project is strictly prohibited 
unless you have written consent from the instructor. 
*/
public class Bagels {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); //Activates the keyboard. 
		
		Player player1 = new Player(); //Creates the objects needed to access the other . 
		Engine engine1 = new Engine();
		Validator valid1 = new Validator();
		
		String output; //Creates the variable output needed for the loops. 
		
		System.out.print("Welcome!");
		
		do{ //Resets the entire game when prompted by the user. 
			player1 = new Player(); //Resets the player to the default values and asks the the user for how many digits they want to guess. 
			System.out.print("\nEnter the number of digits to use: ");
			engine1.setNumDigits(keyboard.nextInt());
		
			System.out.print("Enter the player's name: "); //Asks and records the player's name. 
			player1.setName(keyboard.next());
		
			do{ //Starts a new game for the same player. 
				engine1.generateNewSecret();
				
				boolean correct = false; //Creates a boolean to determine when the player has won. 
				int tries = 1; //Creates a new variables tries and sets it to 1 since the player will always need to guess at least once to win. 
			
				System.out.println("\nStarting game #" + (player1.getGamesCompleted() + 1) + "."); //Displays the number of the game being started by taking how many games the player has completed and adding one to it. 
		
		
				while(correct != true) { //Asks for a guess and displays the information the player needs until the player guesses correctly. 
					if( valid1.validateGuess(engine1.getSecretNumber(), engine1.convertNumToDigitArray(player1.askForGuess()), engine1.getNumDigits()) == true){
						correct = true;
						System.out.println("Congratulations! You won in " + tries + " moves.");
						player1.updateStats(tries); //Updates the stats of the player. 
					}
					else{
						tries++; //Increments tries by one if the player guesses wrong. 
					} 
				}//Prints out the player's name and statistics based on input the user gave previously. 
				System.out.println("\nStatistics for " + player1.getName() + ":");
				System.out.println("Games completed: " + player1.getGamesCompleted());
				System.out.println("Number of digits: " + engine1.getNumDigits());
				System.out.println("Fastest win: " + player1.getFastestWin() + " guesses");
				System.out.print("p - Play again\nr - Reset game\nq - Quit\n\nWhat would you like to do? ");
				output = keyboard.next();
				correct = false; //Resets the variable needed to run the validatation function. 
			}while(output.equalsIgnoreCase("p")); //Starts a new game for the same player if they enter "p".
		}while(output.equalsIgnoreCase("r")); //Resets the entire game if the user enters "r".
		
		if(output.equalsIgnoreCase("q")){ //Stops the program if the user enters "q".
			System.out.println("\nGoodbye!");
			System.exit(0);
		}
		
	keyboard.close(); //Closes the keyboard. 
	}

}