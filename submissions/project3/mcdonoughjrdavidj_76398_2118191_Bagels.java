/*
*Bagels.java
* Author:  David McDonough
* Submission Date:  November 3rd, 2017
* Purpose: Bagels main method that takes the info from engine, player, and validator
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
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
		Scanner keyboard = new Scanner (System.in);
		Player p = new Player();
		Engine e = new Engine();
		Validator v = new Validator();
		int loop = 0;
		
		System.out.println("Welcome!");//prints out welcome
		
		//main while loop
		while (loop < 1){
			int gameCount = 1;
			int attemptFastest = Integer.MAX_VALUE;		
			int loop2 = 0;
	
			e.setNumDigits(0);
			p.setName("");
			System.out.println(" ");
		
		
			while(loop2 < 1){
				int attempt= 1;
				e.generateNewSecret();
		
				e.convertNumToDigitArray("");
				System.out.println("Starting game #" + gameCount);
				
				
				p.askForGuess();
				
					//checks to see if guess was correct
					while(v.validateGuess(e.convertNumToDigitArray(""),p.getGuess(),e.getNumDigits())==false){
						p.askForGuess();
						attempt++;
			
					}
		
					System.out.println("Congratulations! You won in " + attempt + " moves.");
					
					//calculates the fastest attempt
					if(attemptFastest > attempt){
						attemptFastest=attempt;
					}
					else{
						attempt = attempt;
					}
		
					//prints out updated stats and what the user wants to do with the rest of the program
					System.out.println("Statistics for: " + p.getName());
					System.out.println("Games completed: " + gameCount);
					System.out.println("Number of digits: " + e.getNumDigits());
					System.out.println("Fastest win: " + attemptFastest + " guesses");
					System.out.println("p - play again");
					System.out.println("r - reset game");
					System.out.println("q - quit game\n\n");
					System.out.print("What would you like to do? ");
					gameCount++;
					String ans = keyboard.nextLine();
					
					if (ans.equals("q")){
						System.out.println("");
						System.out.println("Goodbye!");
						System.exit(0);
					}
					else if(ans.equals("p")){
						loop++;
						System.out.println(" ");
					}
					else if(ans.equals("r")){
						loop2++;
						loop = 0;
						System.out.println(" ");

					}
			}
		
		
		}

	}

}
