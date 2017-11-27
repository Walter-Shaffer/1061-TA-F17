import java.util.Random;
/*
* Engine.java
* Author: Lydia Shealy
* Submission Date: 11/2/17
*
* Purpose: Represents the engine of the game. Sets the 
* length of the number you want to guess, generates a secret
* number, and converts the players guess to an array that 
* can be compared to the secret number. 
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
	//instance variables for an engine object
	private int numDigits; 
	private int[] secretNumber; 
	private Random randomNumberGenerator = new Random();
	
	//returns number of digits in secret number
	public int getNumDigits(){
		return numDigits; 		
	}
	
	//sets the number of digits based on input parameter
	public void setNumDigits(int numDigits){
		this.numDigits = numDigits; 
	}
	
	/** a test method to see values
	public String testValues(){
		return "The value of numDigits is " + this.numDigits;				
	}*/
	
	//gets the random number 
	public void generateNewSecret(){
		secretNumber = new int[numDigits]; 
		//generates a random 1 digit integer (range of (0,10)) for each numDigit
		for (int i = 0; i < numDigits; i++){
			secretNumber[i] = randomNumberGenerator.nextInt(10);
			
			//to prevent 0 from being in the first instance 
			if (secretNumber[0] == 0)
				i--; //goes back one to redo the instance 		
		}
	}
	
	//returns the secret number by assigning it to another array 
	public int[] getSecretNumber(){
		int[] secret = new int[numDigits]; 
		for (int i = 0; i < numDigits; i++){
			secret[i] = secretNumber[i]; 
		}
		return secret; 
	}
	
	//converts the first character in the number string to an integer
	// and assigns it to the array 
	//parses the number string to continue for each digit 
	public int[] convertNumToDigitArray(String number){
		int[] guess = new int[numDigits]; 
		for (int i = 0; i < numDigits; i++){
			guess[i] = Integer.parseInt(number.substring(0, 1)); 
			number = number.substring(1); 
		}
		return guess; 
	}

}
