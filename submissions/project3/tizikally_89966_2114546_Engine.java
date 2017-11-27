/* Engine.Java
* Author: Allison Tizik
* Submission Date: 11/3/17
* Purpose: The program generates a secret number for the 
* player to guess. From the guess the player inputs 
* it converts it to a string to be able to read 
* if the digit is correct or not. This allows
* the validator to see if it should return
* bagels, pico, or fermi.
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

	//declare variables
	private int numDigits; //number of digits the user wishes to play
	private int[] secretNumber; //the computer's secret number
	private Random randomNumberGenerator = new Random(); //an instance of Java's Random class
	
	//conversts a number to an array of integers
	public int[] convertNumToDigitArray(String number){
		char [] numToArray = number.toCharArray();
		int [] intArray = new int [numToArray.length];
		for ( int i = 0; i< numToArray.length; i++){
			intArray[i] = numToArray[i];
			
		}
		return intArray;
	}
	
	//returns number of digits
	public int getNumDigits(){
	int newNumDigits = this.numDigits;
	return newNumDigits;
	}
	
	//returns the secret number
	public int[] getSecretNumber(){
	int[]getSecNumber = this.secretNumber;
		return getSecNumber;
	}
	
	//changes the secret nuber fields to a random number in the integer range
	public void generateNewSecret(){
	double max = Math.pow(10, this.numDigits) -1;
	double min = Math.pow(10, this.numDigits-1);
	int newSecretNumber = (int)(randomNumberGenerator.nextInt((int) (max-min))+ min);
	this.secretNumber = convertNumToDigitArray(Integer.toString(newSecretNumber));
	}
	
	//sets the number of digits to the input parameter
	public void setNumDigits(int numDigits){
		int setNewNumDigits = numDigits;
		this.numDigits = setNewNumDigits;
	}
}
