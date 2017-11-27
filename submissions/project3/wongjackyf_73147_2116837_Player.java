/**
 * Player.java
 * Author: Jacky Wong
 * Submission Date: 11/3/2017
 * 
 * Purpose: This is part of the "Pico, Fermi, Bagel" game.
 * This contains the code that is associated with the user
 * playing the game.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance
 * with the policies at Clemson university and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the School of Computing
 * at Clemson University. Any publishing or posting
 * of source code for this project is strictly prohibited
 * unless you have written consent from the instructor.
 */

import java.util.Scanner;

public class Player {

	/** Instance variables */
	private String name;
	private int fastestWin = Integer.MAX_VALUE;
	private int gamesCompleted = 0;
	Scanner keyboard = new Scanner(System.in);
	
	public String askForGuess() {
		System.out.print("Enter your guess: ");
		String guess = keyboard.nextLine();
		return guess;
	}
	
	public String getName() {
		return name;
	}
	
	public int getFastestWin() {
		return fastestWin;
	}
	
	public int getGamesCompleted() {
		return gamesCompleted;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void updateStats(int numberOfMovesTakenToWin) {
		this.gamesCompleted += 1;
		if (numberOfMovesTakenToWin < this.fastestWin) {
			this.fastestWin = numberOfMovesTakenToWin;			// Replaces old high score with new
		}
	}
	
}
