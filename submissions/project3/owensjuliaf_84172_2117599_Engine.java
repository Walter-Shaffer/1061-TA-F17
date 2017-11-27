/*
* Engine.java
* Author: Julia Owens
* Submission Date: 11/3/2017
*
* Purpose: A program that will play the guessing game Pico, Fermi, Bagel.
*
* Statement of Academic Honesty:
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
*
*/

import java.util.Random;
import java.util.Scanner;
public class Engine {
	private int numDigits;
	private int[] secretNumber;
	private Random randomNumberGenerator = new Random();
	Scanner keyboard = new Scanner(System.in);
	
	public int[] convertNumToDigitArray(String num) {
		int [] numToDigitArray = new int[num.length()];
		for (int i = 0; i < num.length(); i++) {
			numToDigitArray[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
		}
		return numToDigitArray;
	}
	// converts the string to an integer array
	
	public int getNumDigits() {
		return numDigits;
	}
	
	public int[] getSecretNumber() {
		return secretNumber;
	}
	
	public void generateNewSecret() {
		int min = (int)Math.pow(10, ((double)numDigits - 1));
		int max = (int)Math.pow(10, ((double)numDigits)) - 1;
		int newSecretWord = randomNumberGenerator.nextInt(max - min) + min;
		secretNumber = this.convertNumToDigitArray(String.valueOf(newSecretWord));
	}
	// generates a new secret number
	
	public void setNumDigits(int numDigits) {
		this.numDigits= numDigits; 
	}
	
	public void setSecretNumber(int[] numToDigitArray) {
		this.secretNumber= secretNumber;
	}
}
