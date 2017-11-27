/* Player.Java
* Author: Allison Tizik
* Submission Date: 11/3/17
* Purpose: The program gets the name, the guesses from the player,
* the fastest win the player has had, and the number of games the 
* player has completed. From that it updates that stats of the player
* to be returned to the bagels method.
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

import java. util.Scanner; 
public class Player {

		//declares variables
		private String name = ""; //first name of the player
		private int fastestWin = Integer.MAX_VALUE; // how quickly the player was able to the guess the number
		private int gamesCompleted; //the number of games that have been played
		private Scanner keyboard = new Scanner (System.in); //scanner used for askForGuess
	
		//using keyboard field, the guess is read in from keyboard
		public String askForGuess (){
			System.out.print("Enter your guess: ");
			String guess = keyboard.next();
			return guess;
		}
		
		//returns the player's name
		public String getName (){
			String NewName= name;
			return NewName;
		}
		
		//returns the fastest win
		public int getFastestWin(){
			int newFastWin = fastestWin;
			return newFastWin;
		}
		
		//returns the number of games completed
		public int getGamesCompleted(){
			int numGamesCompleted = this.gamesCompleted;
		return numGamesCompleted;	
		}
		
		//sets the player's name
		public void setName(String name){
		String UserName = name;
			this.name = UserName;	
		}

		//updates the gamesCompleted and fastestWin field after each game is finished
		public void upateStats(int numberOfMovesTakenToWin){
			gamesCompleted++;
			if (numberOfMovesTakenToWin <fastestWin){
				fastestWin = numberOfMovesTakenToWin;
			}
		}
			
		
}



