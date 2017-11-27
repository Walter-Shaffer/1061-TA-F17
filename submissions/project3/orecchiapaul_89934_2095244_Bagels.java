/* 
 * 
 * Bagels.java 
 * Author:  Paul Orecchia  
 * Submission Date:  10/31/17 
 * 
 * Purpose: The purpose of this program is to use the functions from 
 * the other classes to create a game.
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
		int moves=0;
		String loop;
		String guess;
		Scanner keyboard= new Scanner(System.in);
		Player p1= new Player();
		Engine e1= new Engine();
		Validator v1= new Validator();
		System.out.println("Welcome!");
			do{ //Start of loop used to restart the game if user inputs r
				System.out.print("Enter the number of digits to use: ");
				int n=keyboard.nextInt();
				e1.setNumDigits(n);
				System.out.print("Enter the player's name: ");
				String player=keyboard.next();
				p1.setName(player);
				do{  //start of loop used to play again if user inputs p
					e1.generateNewSecret();
					do{ //loop used to check if users guess is correct
						moves++;
						guess=p1.askForGuess();
						
					}while(v1.validateGuess(e1.getSecretNumber(),e1.convertNumToDigitArray(guess),e1.getNumDigits())==false);
					p1.updateStats(moves); //updates status based on how many moves it took to win
					System.out.println("Congratulations!  You won in "+moves+" moves\n");
					System.out.println("Statistics for "+p1.getName()+":");
					System.out.println("Games completed: "+p1.getGamesCompleted());
					System.out.println("Number of digits: "+e1.getNumDigits());
					System.out.println("Fastest win: "+p1.getFastestWin());
					System.out.println("p - Play again\nr - Reset game\nq - Quit\n");
					System.out.print("What would you like to do? ");
					loop=keyboard.next(); //takes users input to figure out whether they want to restart, play again, or quit
					if (loop.equals("q")){
						System.out.println("Goodbye!");
						System.exit(0);
					}else {
					}
				}while(loop.equals("p"));
			}while (loop.equals("r"));
		keyboard.close();
	}
}