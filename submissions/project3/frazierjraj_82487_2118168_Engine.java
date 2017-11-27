/*
* [engine].java
* Author: [Anthony Frazier]
* Submission Date: [11/3/17]
*
* Purpose:Creates functions used in the main class that do things such as generate a random
* number, and convert a string of numbers to an integer array
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagarism will be handled in accordance
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
	
	
	//retrieves the number of digits
	public int getNumDigits(){
		return numDigits;
	}
	//sets the number of digits to its input parameter
	public void setNumDigits(int numDigits){
		this.numDigits = numDigits;
	}
	//runs through a string of numbers and fills an array with them
	public int[] convertNumToDigitArray(String num){
		int[] digits = new int[num.length()];
		for(int i = 0; i < digits.length;i++){
		digits[i] = Integer.parseInt(num.substring(i, i+1));	
		}
		return digits;
	}
	//runs random number generator to return a number with a lower bound
	public void generateNewSecret(){
		//by adding the minimum it makes sure it will never be below this, while making sure the number generator only
		//generates numbers that are in between max and min, makes sure it will never be over the max
		int newSecretNumber = (int)(Math.pow(10,numDigits-1) + randomNumberGenerator.nextInt((int)((Math.pow(10,numDigits)-1)-(Math.pow(10,numDigits-1)))));
		String secretNumberString ="" + newSecretNumber;
		int[] nSecretNumber =convertNumToDigitArray(secretNumberString);
		this.secretNumber = nSecretNumber;
	}
	//returns secret number
	public int[] getSecretNumber(){
		return this.secretNumber;
	}
}
