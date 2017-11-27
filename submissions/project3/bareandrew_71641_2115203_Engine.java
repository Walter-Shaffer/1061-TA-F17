import java.util.Random;
/*
* Engine.java
* Author: Andrew Bare
* Submission Date: 11/3/17
*
* Purpose: 
* This program runs the background of a game like Pico
* Fermi Zilch. It contains all the data needed to run the game
* set secret number required for the game, and 
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
	//Instance Variables
	private int numDigits;
	private int[] secretNumber;
	private Random randomNumberGenerator = new Random();
	
	//converts the given string into an array of integers
	public int[] convertNumToDigitArray (String s)
	{
		int[] digits = new int[s.length()];
		//loop to fill int array
		for (int i = 0; i<s.length(); i++)
		{
			digits[i] = Integer.parseInt(s.substring(i, i+1));
			
//			System.out.println(digits[i]+","); //Spacer
		}
		return digits;
	}
	
	//gets the number of digits
	public int getNumDigits()
	{
		return numDigits;
	}
	
	//returns the secret number
	public int[] getSecretNumber()
	{
		return secretNumber;
	}
	
	//utilizes the random class to get a secret number
	public void generateNewSecret()
	{
		secretNumber = new int[numDigits];
		//System.out.print(randomNumberGenerator.nextInt(9));
		for (int i = 0; i<secretNumber.length; i++)
		{
			if (i == 0)
				secretNumber[0] =1+ randomNumberGenerator.nextInt(9);
			else
				secretNumber[i] = randomNumberGenerator.nextInt(10);
		}
	}
	
	//sets the number of digits
	public void setNumDigits(int num)
	{
		if (num>0)
			numDigits = num;
		
	}
	

}
