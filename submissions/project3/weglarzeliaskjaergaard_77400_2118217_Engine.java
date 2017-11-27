/*
* Engine.java
* Author: Elias Weglarz
* Submission Date: 11/3/17
*
* Purpose: The core working class for the Bagels class to call upon to make a new number and set the number of digits
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

	private int numDigits;
	private int[] secretNumber;
	private Random randomNumberGenerator;
	
	//converts number to digit array
	public int[] convertNumToDigitArray(String number){
		int c = 0;
		int[] guess = new int[number.length()];
		for (int i = number.length() - 1; i >= 0; i--){
			c = Integer.parseInt(number);
			
			guess[i] = c;
		}
		return guess;
	}
	//gets the number of digits
	public int getNumDigits(){
		return numDigits;
	}
	//gets the secret number
	public int[] getSecretNumber(){
		return secretNumber;
	}
	//generates the new secret number 
	public void generateNewSecret(){
		secretNumber = new int[numDigits];
		double upper = Math.pow(10,  numDigits) -1;
		double lower = Math.pow(10, numDigits - 1);
		int low = (int)lower;
		int up = (int)upper;
		int random = randomNumberGenerator.nextInt((up - low) + 1) + low; 
		int [] rArray = new int[numDigits];
		String r = Integer.toString(random);
		for (int i = 0; i < numDigits; i++) {
			String s = r.substring(i, i + 1);
			rArray[i] = Integer.parseInt(s);
		}
		for (int k = 0; k < numDigits; k++){
			secretNumber[k] = rArray[k];
		}	
	}
	//sets the number of digits
	public void setNumDigits(int numDigits){
		this.numDigits = numDigits;
	}
	
}
