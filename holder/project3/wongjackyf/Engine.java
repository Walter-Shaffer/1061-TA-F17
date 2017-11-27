/**
 * Engine.java
 * Author: Jacky Wong
 * Submission Date: 11/3/2017
 * 
 * Purpose: This part of the "Pico, Fermi, Bagel" game.
 * This contains the necessary code in order to actually run the game
 * itself.
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

import java.util.Random;

public class Engine {
	
	/** Instance variables */
	private int numDigits;
	private int[] secretNumber;
	Random randomNumberGenerator = new Random();
	
	public int[] convertNumToDigitArray(String number) {
		int[] input = new int[number.length()];			// Make temporary array to store input as an array
		for (int i = 0; i <= number.length() - 1; i++) {
			input[i] = number.charAt(i) - 48;			// -48 is to account for the ASCII values of numbers
		}
		return input;
	}
	
	public int getNumDigits() {
		return numDigits;
	}
	
	public int[] getSecretNumber() {
		return secretNumber;
	}
	
	public void generateNewSecret() {
		int lowerBound = (int)(Math.pow(10, numDigits - 1));		// Typecasting because Math.pow() returns double
		int upperBound = (int)(Math.pow(10, numDigits)) - 1;
		int newNumber = randomNumberGenerator.nextInt(upperBound - lowerBound) + lowerBound;
		int[] arrayNumber = new int[numDigits];			// Temporary array to generate a new number
		for (int j = numDigits - 1; j >= 0; j--) {
			arrayNumber[j] = newNumber % 10;
			newNumber = newNumber / 10;
		}
		secretNumber = arrayNumber;						// Reassigns the temporary array to secretNumber[]
	}
	
	public void setNumDigits(int numDigits) {
		this.numDigits = numDigits;
	}
}
