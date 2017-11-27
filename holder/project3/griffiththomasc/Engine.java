
/*
* [Engine].java
* Author: [Thomas Griffith]
* Submission Date: [November, 3 2017]
*
* Purpose: this class holds the data and actions the bagel 
* class needs to run by having the random number generator 
* give the computer the new number we guess
*  
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

import java.util.Random;
import java.util.*;

public class Engine {

	private int numDigits;
	// new random for the random number
	private Random randomNumberGenerator = new Random();
	// what hold the secret number by how many digits it is
	private int secretNumber[];

	public int[] convertNumToDigitArray(String a) {
		// for the guess of user from string to integer array
		int number = 0;

		int userQuess[] = new int[a.length()];

		for (int i = 0; i < a.length(); i++) {
			number = Integer.parseInt(a.substring(i, i + 1));
			userQuess[i] = number;

		}

		// System.out.print(userQuess[0]);

		return userQuess;
	}

	public int getNumDigits() {
		// number of digits the user wants to play with
		return numDigits;
	}

	public int[] getSecretNumber() {
		// gives the value of secret number
		return secretNumber;
	}

	public void generateNewSecret() {
		// makes random number
		int upper = (int) (Math.pow(10, this.numDigits) - 1);

		int lower = (int) Math.pow(10, (this.numDigits - 1));

		int number = randomNumberGenerator.nextInt(upper);
		while (number < lower) {
			number = randomNumberGenerator.nextInt(upper);
		}
	
		String stringNumber = Integer.toString(number);
		secretNumber = convertNumToDigitArray(stringNumber);

	}

	public void setNumDigits(int a) {
		// sets number of digits to play with
		numDigits = a;

	}
}