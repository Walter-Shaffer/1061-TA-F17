import java.util.Random;
/*
* Engine.java
* Author: Heather Wright
* Submission Date: November 3, 2017
*
* Purpose: This class contains numerous methods that help run 
* the game. It contains methods to set the number of digits as
* well as one that return that number. The method 
* convertNumToDigitArray converts and inputed string into a 
* array which contains a single digit for the digits in the string. 
* the generateNewSecretNumberClass creates a secret number that
* is between the parameters of the number of digits the user 
* requested. It calls upon the convertNumToDigitArray to convert
* that number into an array. This array is set to the instance variable 
* of secretNumber. Lastly the getSecretNumber returns the secret
* number array.
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
	
	public int[] convertNumToDigitArray(String guess) { //receives a numerical string and returns that as an array
		int j = Integer.parseInt(guess); //returns the integer in the string 
		int[] arrayGuess = new int[this.numDigits];//sets the array to have the correct length
		for(int i = numDigits -1; i >= 0; i--) { //sets each variable inside the array
			arrayGuess[i] = j % 10;
			j /= 10;
			}
		return arrayGuess; //returns the new array
	}
	public int getNumDigits() { //returns the number of digits
		return numDigits;
	}
	public int[] getSecretNumber() { //returns the secret number
		return secretNumber;
	}
	public void generateNewSecretNumber() { //generates a new secret number
		int lower = (int)Math.pow(10, numDigits - 1);
		int upper = (int)Math.pow(10, numDigits) - 1;
		int randomNumber = randomNumberGenerator.nextInt(upper);//generates a new number between 0 and the upper bound
			while(randomNumber < lower) { //if the random number is lower than the lower bound it prompts the random 
				//number to be created again until a proper one is created
				randomNumber = randomNumberGenerator.nextInt(upper);
			}
		String stringSecretNumber = "" + randomNumber; //converts the random number to an array
		this.secretNumber = convertNumToDigitArray(stringSecretNumber); //uses the converNumToDigitArray method to set the 
		// secret number as an array
	}
	public void setNumDigits(int numDigits) { //sets the number of digits 
		this.numDigits = numDigits;
	}
}
