/*
 * Player.java
 * Author: John Xue
 * Submission Date: Nov. 2, 2017
 *
 * Purpose: Methods to retrieve game parameters for "Pico, Fermi, Bagel"
 * and update statistics
 *
 * Statement of Academic Honesty:
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized assistance
 * or plagiarism will be handled in accordance with the policies at
 * Clemson University and the policies of this course. I recognize that my
 * work is based on an assignment created by the School of Computing at
 * Clemson University. Any publishing or posting of source code
 * for this project is strictly prohibited unless you have written
 * consent from the instructor.
 */

import java.util.Scanner;
import java.lang.Integer;

public class Player {
	/* Declare various private variables */
	private String name = "";
	private int fastestWin = Integer.MAX_VALUE;
	private int gamesCompleted = 0;
	private Scanner keyboard = new Scanner(System.in);
	
	/* Retrieve input for a guess */
	public String askForGuess() {
		System.out.print("Enter your guess: ");
		String guess = keyboard.next();
		return guess;
	}
	
	/* return the name of Player object */
	public String getName() {
		return name;
	}
	
	/* return the fastest number of wins for Player object */
	public int getFastestWin() {
		return fastestWin;
	}
	
	/* return the number of games completed for Player object */
	public int getGamesCompleted() {
		return gamesCompleted;
		
	}
	
	/* Set the name of Player object to local String name */
	public void setName(String name) {
		this.name = name;
	}
	
	/* Update the statistics at the end of each game */
	public void updateStats(int numberOfMovesTakenToWin) {
		gamesCompleted += 1;
		if (numberOfMovesTakenToWin < fastestWin) {
			fastestWin = numberOfMovesTakenToWin;
		}
	}
}
