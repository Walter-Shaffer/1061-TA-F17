
/*
* Engine.java
* Author:  Alejandro Pardo
* Submission Date:  November 2
* Purpose: The engine class is in charge of creating a random number and converting the number into a digit array.
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance
* with the policies at Clemson University and the
* policies of this course. I recognize that my work is based
* on an assignment created by the School of Computing
* at Clemson University. Any publishing or posting
* of source code for this project is strictly prohibited
* unless you have written consent from the instructor.
*/
import java.util.Random;

public class Engine {
	private int numDigits;
	private int[] secretNumber;
	private Random randomNumberGenerator = new Random();

	public int[] convertNumToDigitArray(String numberGiven) { // convert the
																// String of
																// numbers into
																// an array of
																// numbers
		int[] Array = new int[numberGiven.length()];
		for (int a = 0; a < numberGiven.length(); a++) {
			Array[a] = Integer.parseInt(numberGiven.substring(a, a + 1)); // as
																			// substring
																			// ends
																			// with
																			// -1,
																			// have
																			// to
																			// add
																			// +1
		}
		return Array;
	}

	public int getNumDigits() { // return num of digits
		return this.numDigits;
	}

	public int[] getSecretNumber() { // returns the secret number
		return this.secretNumber;
	}

	public void generateNewSecret() { // using the random class, it will
										// generate a new number
		secretNumber = new int[numDigits];
		this.secretNumber[0] = randomNumberGenerator.nextInt(9) + 1; // because
																		// the
																		// first
																		// number
																		// cannot
																		// generate
																		// 0,
		// we want the boundaries to be from 1 to 9
		for (int i = 1; i < numDigits; i++) {
			this.secretNumber[i] = randomNumberGenerator.nextInt(10); // the
																		// next
																		// number
																		// can
																		// be
																		// from
																		// 0-9
		}
	}

	public void setNumDigits(int parameter) { // sets parameter of the num
		this.numDigits = parameter;

	}
}