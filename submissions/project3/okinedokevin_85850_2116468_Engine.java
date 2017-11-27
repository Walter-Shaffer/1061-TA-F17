/*
* Engine.java
* Author: Kevin Okinedo
* Submission Date: 11/03/17
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program stores data and actions related to the game.
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
	
	private int numDigits;
	private int[] secretNumber;
	private Random randomNumberGenerator;
	
	//Converts a number (as a String) to an array of integers.
	public int[] convertNumToDigitArray(String number)
	{
		int[] numberArray = new int[numDigits];
		int digit = 0, numberVar = 0;
		
		numberVar = Integer.parseInt(number);
		
		for (int i = (getNumDigits() - 1); i >= 0; i--)
		{
			digit = (numberVar %10);
			numberVar = (numberVar /10);
			numberArray[i] = digit;
		}
		
		return numberArray;
	}
	
	//Returns the number of digits.
	public int getNumDigits()
	{
		return this.numDigits;
	}
	
	//Returns the secret number.
	public int[] getSecretNumber()
	{
		return this.secretNumber;
	}
	
	//Changes the secretNumber field to a random number in the range 10n-1 and 10n-1.
	public void generateNewSecret()
	{
		int lowerBound = (int) (Math.pow(10, this.numDigits -1)), upperBound = (int) (Math.pow(10, (this.numDigits)) -1);
		int secretNum, digit;
		int[] numberArray = new int[getNumDigits()];
		this.randomNumberGenerator = new Random();		
		
		while (true)
		{
			secretNum = (this.randomNumberGenerator.nextInt(upperBound));
			secretNum = secretNum + lowerBound;
			
			if (secretNum > upperBound)
			{
				secretNum -= lowerBound;
			}
			//
			//
			System.out.println("TESTING MODE, SECRET NUMBER : " + secretNum);
			//
			//
			if (secretNum < upperBound && secretNum > lowerBound)
			{
				break;
			}
		}
		
		for (int j = (getNumDigits() -1); j >= 0; j--)
		{
			digit = (secretNum %10);
			secretNum = (secretNum /10);
			numberArray[j] = digit;
		}
		
		secretNumber = numberArray;		
	}
	
	//Sets the number of digits to the input parameter.
	public  void setNumDigits(int numberOfDigits)
	{
		numDigits = numberOfDigits;
	}

}
