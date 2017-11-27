/*
* Bagels.java
* Author: Jack Maggard
* Submission Date: 10/31/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program is a game that randomly generates an integer and
* the user has to guess what the integer is. If they get one number right they are 
* told. Then they guess again until they get the whole number right. 
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
import java.util.Random;
import java.util.Scanner;

public class Bagels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine a = new Engine();
		Validator v = new Validator();
		//initialize new objects engine and validator
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Welcome!");
		int z = 0;
		//initialize boolean to control while loop
		while (z == 0) {
			Player b = new Player();//this is in a while loop because it could be a new person each time.
			System.out.print("Enter the number of digits to use: ");
			int digits = keyboard.nextInt();

			a.setNumDigits(digits);//setting numdigits instance variable for this engine object
			System.out.print("Enter the player's name: ");
			b.setName(keyboard.next());//setting players name
			int x = 0;//initialize another controlling boolean
			while (x == 0) {

				System.out.print("\nStarting game #" + (b.getGamesCompleted()+1) + ".\n");
				a.generateNewSecret();//generate new secret number
				int o = 0;
				int count = 1;
				while (o == 0) {
					String guess = b.askForGuess();//askforguess asks user for their guess
					if (Validator.validateGuess(a.getSecretNumber(), a.convertNumToDigitArray(guess),
							a.getNumDigits()) == true) {
						System.out.println("Congratulations! You won in " + count + " moves.\n");
						o += 1;
					}
					count = count + 1;//count is the new high score variable
				}
				b.updateStats(count - 1);//update stats to account for new high score and games completed increment by 1
				System.out.println("Statistics for " + b.getName() + ":");
				System.out.println("Games completed: " + b.getGamesCompleted());
				System.out.println("Number of digits: " + a.getNumDigits());
				System.out.println("Fastest win: " + b.getFastestWin() + " guesses");
				System.out.print("p - Play again\nr - Reset game\nq - Quit\n\nWhat would you like to do? ");
				String input = keyboard.next();
				System.out.println();
				if (input.equals("q")) {
					System.out.println("\nGoodbye!");
					System.exit(0);
				}
				if (input.equals("r")) {
					x+=1;
				}
			}

		}

	}

}
