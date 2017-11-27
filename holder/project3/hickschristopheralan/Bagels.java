/*
 * Bagels.java
 * Author: Christopher Hicks
 * Submission Date 10/31/2017
 * 
 * Purpose: To create multiple classes within one java project to practice
 * good java programing.
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

public class Bagels {// Main Class

	public static void main(String[] args) {
		// welcome statment
		System.out.println("Welcome!");
		// boolean to use to continue the game
		boolean run = true;
		//Start of main while loop
		while (run){
			// pulls in all 3 classes
			Engine e1 = new Engine();
			Player p1 = new Player();
			Validator v1 = new Validator();
			// sets  varibles for use in future
			int numberOfGamesPlayed = 0;
			boolean continueRunning = true;
			// asks and recieves the input for numDigits
			System.out.print("Enter the number of digits to use: ");
			Scanner Input = new Scanner(System.in);
			int numDigits = Input.nextInt();
			e1.setNumDigits(numDigits);
			// Gets and stores player's name
			System.out.print("Enter the player's name: ");
			p1.setName(Input.next());
			//while loop to get and save secret number and update number of games played
			while(continueRunning){
				e1.generateNewSecret();
				int[] secretNumber;
				secretNumber = e1.getSecretNumber();
				numberOfGamesPlayed++;
				System.out.println("Starting game #" + numberOfGamesPlayed + ".");
				boolean incorrectGuess = true;
				int numberOfMovesToWin = 0;
				//While loop to actually play the game
				while(incorrectGuess){
					String guess = p1.askForGuess();
					int[] aGuess = e1.convertNumToDigitArray(guess);
					numberOfMovesToWin += 1; //takes the moves to win and adds them to keep records up to date
					// loop to compare secet number and compare user's guess
					//for(int i=0; i <secretNumber.length;i++){System.out.print("");
					//}// tests user inputs vs secret number by utilizing Validator class
					if (v1.validateGuess(secretNumber, aGuess, numDigits)){
						incorrectGuess = false;
						p1.updateStats(numberOfMovesToWin);
						System.out.println("Congratulations! You won in " + numberOfMovesToWin);	
					}
				}
			// print statments for after game
			System.out.println("Statistics for " + p1.getName()+ ":");
			System.out.println("Games completed: " + p1.getGamesCompleted());
			System.out.println("Number of digits: " + e1.getNumDigits());
			System.out.println("Fastes win: " + p1.getFastestWin());
			boolean invalidAnswers = true;
			// Loop for menu
			while(invalidAnswers){
				System.out.println("p - Play Again \nr - Reset Game\nq - Quit Game\n What would you like to do?");
				String userAnswer = Input.next();
				//loop for menu
				if (userAnswer.equalsIgnoreCase("q")){
					continueRunning = false;
					System.exit(0);
				}
				else if(userAnswer.equalsIgnoreCase("r")){
					run = true;
				}
				else if(userAnswer.equalsIgnoreCase("p")){;
					run = true;
				}
				else {System.exit(0);}
				
			}
			
			}
			
			
			
			
		}
				
	}
}
