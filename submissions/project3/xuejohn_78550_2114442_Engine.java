/*
 * Engine.java
 * Author: John Xue
 * Submission Date: Nov. 2, 2017
 *
 * Purpose: Core function of the "Pico, Fermi, Bagel"
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

import java.util.Random;
import java.lang.Math;

public class Engine {
	/* Declare various private variables */
	private int numDigits = 0;
	private int[] secretNumber = new int[]{0};
	private Random randomNumberGenerator = new Random();
	
	/* Convert String number into an array and return the array */
	public int[] convertNumtoDigitArray(String number) {
		int[] x = new int[number.length()];
		for (int i = 0; i < number.length(); i++) {
			x[i] = number.charAt(i);
		}
		return x;
	}
	
	/* Return the number of digits for secret */
	public int getNumDigits() {
		return numDigits;
	}
	
	/* Return the secret number as an array */
	public int[] getSecretNumber() {
		return secretNumber;
	}
	
	/* Generate a random number based on the range parameter
	 * (dependent on the number of digits), convert int into
	 * int array, and set that array as the secret number
	 */
	public void generateNewSecret() {
		int min = (int) Math.pow(10, numDigits - 1);
		int max = (int) Math.pow(10, numDigits) - 1;
		int num = randomNumberGenerator.nextInt(max - min + 1) + min;
		secretNumber = convertNumtoDigitArray("" + num);
	}
	
	/* Sets the number of digits for secret */
	public void setNumDigits(int numDigits) {
		this.numDigits = numDigits;
	}
}
