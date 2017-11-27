
import java.util.Scanner;

/*
* Player.java
* Author: Daniel Christensen
* Submission Date: 11/3/2017
*
* Purpose: This program stores player data and statistics for 
* the user executing the bagel class which are used to put on display.
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

public class Player {

	private String name;//declare instance variables of Player object
	private int fastestWin;
	private int gamesCompleted;
	
	Scanner keyboard = new Scanner(System.in);//create Scanner object
	
	public String askForGuess() {
		System.out.print("Enter your guess: ");
		String guess = keyboard.next();
		return guess;
	}
	
	public String getName() {//returns player name
		return this.name;
	}
	
	public int getFastestWin() {//returns fastest win
		return this.fastestWin;
	}
	
	public int getGamesCompleted() {//returns games completed 
		return this.gamesCompleted;
	}
	
	public void setName(String name) {//sets name to specified new name
		this.name = name;
	}
	
	public void updateStats(int numberOfMovesTakenToWin) {//updates stats at the end of each game
		this.gamesCompleted++;
		if(this.fastestWin==0) {
			this.fastestWin=numberOfMovesTakenToWin;
		}
		else {
		if(numberOfMovesTakenToWin<this.fastestWin) {
				this.fastestWin=numberOfMovesTakenToWin;
			}
		}
	}
		
	
	
}



