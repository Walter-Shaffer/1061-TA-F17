import java.util.Random;

/* 
Engine.java
Author: Sean Meade
Submission Date: 11/2
Purpose: Generates and keeps track of the secret number the 
player needs to guess for the Bagels game using input given
by the user.

Statement of Academic Honesty:
The following code represents my own work. I have neither
received nor given inappropriate assistance. I have not copied
or modified code from any source other than the course webpage
or the course textbook. I recognize that any unauthorized 
assistance or plagiarism will be handled in accordance
with policies at Clemson University and the
policies of this course. I recognize that my work is based
on an assignment created by the School of Computing
at Clemson University. Any publishing or posting 
of source code for this project is strictly prohibited 
unless you have written consent from the instructor. 
*/
public class Engine {

	private int numDigits; //Declares the instance variables. 
	private int[] secretNumber = new int[numDigits];
	Random randomNumberGenerator = new Random();
	
	public int[] convertNumToDigitArray(String number){ //Converts any string to a number the size given by the player. 
		int[] digitArray = new int[numDigits];
		for (int i = 0; i < numDigits; i++){
			digitArray[i] = (Integer.parseInt(number.substring(i, i + 1)));
		}
		return digitArray;
	}
	
	public int getNumDigits(){ //Returns the numDigits instance variable. 
		return numDigits;
	}
	
	public int[] getSecretNumber(){ //Returns the secretNumber instance variable. 
		return secretNumber;
	}
	
	public void generateNewSecret(){ //Generates a new random secret number based on how many digits the player wants it to be. 
		secretNumber = new int [numDigits];
		for (int i = 0; i < numDigits; i++){
			secretNumber[i] = randomNumberGenerator.nextInt(10);
		}
	}
	
	public void setNumDigits(int digits){ //Sets the instance variable numDigits to the input. 
		numDigits = digits;
	}
	
}
