import java.util.Random;
/*
* Engine.java
* Author: Joshua Williams
* Submission Date: 11/2/17
*
* Purpose: 
* 	This controls the behind the scenes in the game Pico, Fermi, Bagel.
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
public class Engine {
	private int numDigits;
	private int[] secretNumber;
	private Random randomNumberGenerator = new Random();

	public int[] convertNumToDigitArray(String number) {
		//This method converts a number as a String to a number stored in an int array
		int[] guessArray = new int[number.length()];
		for (int i = 0; i < number.length(); i++) {
			guessArray[i] = Integer.parseInt("" + number.charAt(i));
		}
		return guessArray;
	}

	public int getNumDigits() {
		//This method returns the variable numDigits
		return numDigits;
	}

	public int[] getSecretNumber() {
		//This method returns the variable secretNumber
		return secretNumber;
	}

	public void generateNewSecret() {
		//This method generates a new secret number in a specified range
		secretNumber = new int[numDigits];
		String randomNumber = "";
		randomNumber = Integer.toString(randomNumberGenerator.nextInt((int)Math.pow(10, numDigits)-(int)Math.pow(10, numDigits-1)) + (int)Math.pow(10, numDigits-1));
		for (int i = 0; i < numDigits; i++) {
			secretNumber[i] = randomNumber.charAt(i) - '0';
		}
	}

	public void setNumDigits(int numDigits) {
		//This number assigns numDigits to the parameter numDigits
		this.numDigits = numDigits;
	}
}
