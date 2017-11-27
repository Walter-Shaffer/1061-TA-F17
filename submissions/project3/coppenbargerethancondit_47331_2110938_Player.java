/*
* Bagels.java
* Author: Ethan Coppenbarger
* Submission Date: 11/02/2017
*
* Purpose: 	This class stores data about the player and gets their
* 			input
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

public class Player {
	//fields
	private String name;							// name of player
	private int fastestWin = Integer.MAX_VALUE;		// how quickly player guessed number
	private int gamesCompleted = 0;					// number of games completed
	Scanner keyboard = new Scanner(System.in);		// user input
	
	
	// get players guess
	public String askForGuess() {
		System.out.println("Enter your guess: ");
		return keyboard.next();
	}
	// get players name
	public String getName() {
		return name;
	}
	// get fastest win
	public int getFastestWin() {
		return fastestWin;
	}
	// get games completed
	public int gamesCompleted() {
		return gamesCompleted;
	}
	
	// set players name
	public void setName(String s) {
		name = s;
	}
	
	// update gamesCompleted and fastestWin after game
	public void updateStats(int winTime) {
		gamesCompleted += 1;
		if (winTime < fastestWin) {
			fastestWin = winTime;
		}
	}
}
