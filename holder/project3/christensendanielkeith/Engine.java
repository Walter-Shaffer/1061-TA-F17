
/*
* Engine.java
* Author: Daniel Christensen
* Submission Date: 11/3/2017
*
* Purpose: This program is the engine for the bagel class which, 
* after being provided with the desired number of digits, will 
* generate a random number for the game of pico fermi bagel.
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
	
	private int numberOfDigits;//instance variables
	private int[] secretNumber;
	
	public int[] convertNumToDigitArray(String number) {
		
		int[] numberArray = new int[number.length()];
		
		for(int i = number.length(); i>0; i--) {
			int j = number.length()-i;
			numberArray[j] = Integer.parseInt(number.substring(j, j+1));
		}
		return numberArray;
	}
	
	public int getNumberOfDigits() {
		return numberOfDigits;
	}
	
	public int[] getSecretNumber() {
		return secretNumber;
	}
	
	public void generateNewSecret(){
		
		int max = (int) Math.pow(10, numberOfDigits)-1;
		int min = (int) Math.pow(10, numberOfDigits-1);
		
		int newSecret = (int) (Math.random()*(max-min)+min);
		String secret = "" + newSecret;
		
		secretNumber = convertNumToDigitArray(secret);
		
	}
	
	public void setNumDigits(int numDigits) {
		numberOfDigits = numDigits;
	}

}




