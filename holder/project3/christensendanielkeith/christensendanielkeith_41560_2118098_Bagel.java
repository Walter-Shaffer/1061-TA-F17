import java.util.Scanner;

/*
* Bagel.java
* Author: Daniel Christensen
* Submission Date: 11/3/2017
*
* Purpose: This is the main method for the game of pico fermi bagel.
* Using both the Player and Engine classes, this class 
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

public class Bagel {

	public static void main(String[] args) {
		System.out.println("Welcome!");//welcome message
		
		Scanner keyboard = new Scanner(System.in);
		
		boolean reset = true;
		
		while(reset == true) {
			
			Player p = new Player();
			Engine e = new Engine();
			
			System.out.print("Enter the Number of digits to use: ");
			int digits = keyboard.nextInt();
			e.setNumDigits(digits);
			
			System.out.print("Enter the player's name: ");
			String name = keyboard.next();
			p.setName(name);
			System.out.println("");
			
			boolean replay = true;
			
			while(replay==true) {
				
				int thisGame = p.getGamesCompleted()+1;
				System.out.println("Starting game #"+ thisGame);
				
				e.generateNewSecret();//creates new secret
				int[] secret = e.getSecretNumber();
				
				boolean gameCompleted = false;
				
				int moves = 0;
				
				while (gameCompleted == false) {//when this loop is finished, the current game will end
					
					String guess = p.askForGuess();
					int[] Guess = e.convertNumToDigitArray(guess);
					
					if(Validator.validateGuess(secret,Guess,digits)) {
						moves++;
						//Validator.validateGuess(secret,Guess,digits);
						gameCompleted = true;
					}
					else {
						moves++;
						//Validator.validateGuess(secret,Guess,digits);
					}
					
				}//the game is over
				p.updateStats(moves);
				
				System.out.println("Congratulations!  You won in "+moves+" moves.");
				System.out.println("");
				
				System.out.println("Statistics for "+name+":");
				System.out.println("Games completed: "+p.getGamesCompleted());
				System.out.println("Number of digits: "+e.getNumberOfDigits());
				System.out.println("Fastest win: "+p.getFastestWin());
				System.out.println("p - Play again");
				System.out.println("r - Reset game");
				System.out.println("q - Quit");
				System.out.println("What would you like to do? ");
				
				String decision = keyboard.next();
				
				if(decision.equalsIgnoreCase("q")) {
					System.out.println("Goodbye!");
					keyboard.close();
					System.exit(0);
				}
				else {
					if(decision.equalsIgnoreCase("r")) {
						replay = false;
					}
				}
				System.out.println("");
				
			}
			
		}
		

	}

}


