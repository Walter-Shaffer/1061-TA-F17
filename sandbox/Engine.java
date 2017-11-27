import java.util.Random;

/** @formatter:off
* Engine.java
* Author: John Hollowell
* Submission Date: 10/31/2017
*
* Purpose: A Class to generate, store, and retrieve the secret number,
* as well as store and retrieve the number of digits.
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

public class Engine {

	// Instance Variables
	private int		numDigits;
	private int[]	secretNumber;
	private Random	randomNumberGenerator	= new Random();

	/**
	 * Given a string representation of a integer (e.g. "451"), this method returns
	 * an integer array of the individual characters of the number (e.g. [4,5,1]).
	 * 
	 * @param number
	 *            a string representation of a positive integer
	 * @return an int[] of each character in the passes String.
	 */
	public int[] convertNumToDigitArray(String number) {

		int[] returnArray = new int[number.length()];
		for (int i = 0; i < number.length(); i++) {
			returnArray[i] = Integer.parseInt(number.substring(i, i + 1));
		}
		return returnArray;
	}

	/**
	 * @return the current object's [numDigits] variable
	 */
	public int getNumDigits() {

		return numDigits;
	}

	/**
	 * Retrieve the current secretNumber;
	 * 
	 * @return the current object's [secreteNumber] variable
	 */
	public int[] getSecretNumber() {

		return secretNumber;
	}

	/**
	 * Uses the Random Class to generate a new [secretNumber] with a length of
	 * [numDigits]
	 */
	public void generateNewSecret() {

		secretNumber = new int[numDigits];

		// manually create the first digit so it is 1-9
		secretNumber[0] = randomNumberGenerator.nextInt(9) + 1;

		// Generate remaining digits 0-9
		for (int i = 1; i < numDigits; i++) {
			secretNumber[i] = randomNumberGenerator.nextInt(10);
		}
	}

	/**
	 * Sets the current object's [numDigits] variable to the passes value
	 * 
	 * @param numDigits
	 *            The number of digits the secretNumber and guesses will be.
	 */
	public void setNumDigits(int numDigits) {

		this.numDigits = numDigits;
	}
}
