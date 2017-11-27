/*
* Engine.java
* Author: Harrison Hall
* Submission Date: November 1, 2017
*
* Purpose: This class has methods and variables related to the
* computational portion of the bagel game. 
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

import java.util.Random; //imports necessary libraries
import java.lang.Integer;

//import java.util.Arrays; //This was for testing purposes for printing secretNumber

public class Engine {
	
	private int numDigits;
	private int[] secretNumber;
	Random randomNumberGenerator = new Random(); //creates object of type random
	
	public int[] convertNumToDigitArray(String number){ //This converts a numerical string to an integer array
		int i = 0;
		int x = number.length();
		int numberArray[] = new int[number.length()];
		while (i < x){ //searches each place in the string for the number and applies to new array
			String numberSubstring = number.substring(0,1);
			numberArray[i] = Integer.parseInt(numberSubstring);
			number = number.substring(1);
			i++;
		}
		//Arrays.toString(numberArray); //This was for testing purposes for printing secretNumber
		return numberArray;
	}
	
	public int getNumDigits(){  //method returns the number of digits in the secret number.
		numDigits = secretNumber.length;
		return numDigits;
	}
	
	public int[] getSecretNumber(){ //returns secretNumber
		return secretNumber;
	}
	
	
	
	public void generateNewSecret(){ //This generates new secret number based on user input
		int newNumber = (int)(randomNumberGenerator.nextInt((int) ((Math.pow(10, this.numDigits) - 1) - (Math.pow(10, (this.numDigits - 1))) + 1)) + (Math.pow(10, (this.numDigits - 1))));
		//System.out.println(newNumber); //This was a check for testing
		int numberArray[] = new int[numDigits];
		int i = numDigits - 1;
		while (newNumber > 0){ //creates array for the new number
			numberArray[i] = (newNumber % 10);
			newNumber = newNumber / 10;
			i--;
		}
		
		secretNumber = numberArray;  
		//System.out.println(Arrays.toString(secretNumber));
	}
	
	public void setNumDigits(int digitCount){ //Sets the number of digits used as a generateNewSecret method
		this.numDigits = digitCount;
	}
		
}
