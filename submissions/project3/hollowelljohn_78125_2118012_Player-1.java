import java.util.Scanner;

/** @formatter:off
* Player.java
* Author: John Hollowell
* Submission Date: 10/31/2017
*
* Purpose: A Class to request, store, and retrieve the player variables
* (namely the player name and statistics).
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
* @formatter:on
*/

public class Player {

	// Instance Variables
	private String	name;
	private int		fastestWin		= Integer.MAX_VALUE;
	private int		gamesCompleted	= 0;
	private Scanner	keyboard;

	/**
	 * Request the guess from the user and return the entered value
	 * 
	 * @return the String entered by the user
	 */
	public String askForGuess() {

		keyboard = new Scanner(System.in);
		System.out.print("Enter your guess: ");
		return keyboard.next();
	}

	/**
	 * Retrieve the [name] variable from a given Player object
	 * 
	 * @return the object's [name] variable
	 */
	public String getName() {

		return this.name;
	}

	/**
	 * Sets the [name] variable of this Player object to the passed name variable.
	 * 
	 * @param name
	 */
	public void setName(String name) {

		this.name = name;
	}

	/**
	 * Retrieve the [fastestWin] variable from a given Player object
	 * 
	 * @return the object's [fastestWin] variable
	 */
	public int getFastestWin() {

		return this.fastestWin;
	}

	/**
	 * Retrieve the [gamesCompleted] variable from a given Player object
	 * 
	 * @return the object's [gamesCompleted] variable
	 */
	public int getGamesCompleted() {

		return this.gamesCompleted;
	}

	/**
	 * Updates the [gamesCompleted] and [fastestWin] variables of the given Player
	 * object
	 * 
	 * @param numberOfMovesTakenToWin
	 */
	public void updateStats(int numberOfMovesTakenToWin) {

		this.fastestWin = fastestWin > numberOfMovesTakenToWin ? numberOfMovesTakenToWin : fastestWin;
		this.gamesCompleted++;
	}
}
