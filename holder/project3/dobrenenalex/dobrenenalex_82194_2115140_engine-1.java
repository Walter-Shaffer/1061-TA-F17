/* engine.java 
 * Author:  Alex Dobrenen 
 * Submission Date:  November 3
 * Purpose: A brief paragraph description of the 
 * program. What does it do? Encapsulates data and actions related to the actual game in progress.  
 * Statement of Academic Honesty:  
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
public class engine 
{
	//Vars
	private int numDigits = 0;
	private int[] secretNumber;
	private Random randomNumberGenerator = new Random();	
	//Methods
	//Convert a number to an array
	public int[] convertNumToDigitArray(String num)
	{
		int[] numArray = new int[num.length()];
		for(int x = 0; x < num.length(); x++)
		{
			char number = num.charAt(x);
			numArray[x] = number - 48;
		}
		return numArray;
	}
	//Returns number of digits
	public int getNumDigits()
	{
		return numDigits;
	}
	//Return secret number
	public int[] getSecretNumber()
	{
		return secretNumber;
	}
	//generates a new number
	public void generateNewSecret()
	{
		secretNumber = new int[numDigits];
		for(int x = 0; x < secretNumber.length; x++)
		{
			secretNumber[x] = randomNumberGenerator.nextInt(10);
		}
	}
	//Set number of digits
	public void setNumDigits(int num)
	{
		numDigits = num;
	}
}
