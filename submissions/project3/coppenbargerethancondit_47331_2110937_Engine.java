/*
* Engine.java
* Author: Ethan Coppenbarger
* Submission Date: 11/02/2017
*
* Purpose: 	This class contains data and actions for the game in 
* 			progress, including the method to generate a new
* 			secret number and methods for getting the data in
* 			the game
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

public class Engine {
	//fields
	private int numDigits;
	private int[] secretNumber;
	Random randomNumberGenerator = new Random();
	
	//methods
	
	// convert a string of integers to an array of integers
	public int[] convertNumToDigitArray(String s) {
		int[] intArray = new int[s.length()];
		
		for (int f = 0; f < s.length(); f++) {
			intArray[f] = Integer.parseInt(String.valueOf(s.charAt(f)));
		}
		return intArray;
	}
	
	// get the number of digits of an integer
	public int getNumDigits() {
		return numDigits;
	}
	
	// get the secret number
	public int[] getSecretNumber() {
		return secretNumber;
	}
	
	// generate a new secret number
	public void generateNewSecret() {
		secretNumber = new int[numDigits];
		for (int f = 0; f < secretNumber.length; f++) {
			secretNumber[f] = 1 + randomNumberGenerator.nextInt(9);
		}
	}
	
	// set number of digits
	public void setNumDigits(int i) {
		numDigits = i;
	}
}
