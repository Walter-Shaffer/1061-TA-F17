/*
* Engine.java
* Author: Andrew Padgett
* Submission Date: 
*
* Purpose: Engine class contains methods that perform functions relating
* 		   to the actual game, such as creating new secret numbers and
* 		   converting inputed guesses to arrays for comparison to secret
* 		   number.
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

//import Random class
//
import java.util.Random;

public class Engine {
	
	//declare private instance variables
	//
	private int numDigits;
	private int[] secretNumber;
	
	//create randomNumberGenerator object from Random class
	//
	private Random randomNumberGenerator = new Random();
	
	//converts a number as a string into an array of int values then returns that array
	//
	public int[] convertNumToDigitArray(String number){
		int[] guess = new int[numDigits];
		for (int i = 0; i < numDigits; i++){
			 guess[i] = Character.getNumericValue(number.charAt(i));
		}
			return guess; 
	}

	//return numDigits
	//
	public int getNumDigits(){
		return numDigits;
	}
	
	//return the pseudorandom secret number
	//
	public int[] getSecretNumber(){
		return secretNumber;
	}
	
	//generate an array of ints with random numbers 0-9
	//first index will have a random number 1-9
	//
	public void generateNewSecret(){
		for(int i = 0; i < numDigits; i++){
			if (i == 0)
				secretNumber[i] = randomNumberGenerator.nextInt(9 - 1 + 1) + 1;
			else
				secretNumber[i] = randomNumberGenerator.nextInt(9);
		}
	}
	
	//sets numDigits to user inputed number
	//creates secretNumber array of numDigits size
	//
	public void setNumDigits(int newNumDigits){
		numDigits = newNumDigits;
		secretNumber = new int[numDigits];
	}

}
