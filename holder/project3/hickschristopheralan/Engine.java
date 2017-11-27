/*
 * Engine.java
 * Author: Christopher Hicks
 * Submission Date 10/31/2017
 * 
 * Purpose: To create multiple classes within one java project to practice
 * good java programing.
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
import java.util.Random;		// import for random number
import java.util.Scanner;

public class Engine {		// Start of engine class
	
	private int numDigits;		// number of digits to be used ie.2 or 3
	private int [] secretNumber;// hidden number for user to solve
	private Random randomNumberGenerator;// generates secret number
	
	
	public int [] convertNumToDigitArray(String number){//start of convertNumToDigitArray
		int [] numberArray = new int[numDigits];
		int digit = 0;
		int numberVariable = 0;
		
		numberVariable = Integer.parseInt(number);
		
		for (int i = 0; i < numberArray.length; i++){
			
			digit = (numberVariable % 10);
			numberVariable = (numberVariable/10);
			numberArray[i] = digit;
		}
		return numberArray;
	}//End of method
	
	public int getNumDigits(){// gets number of digits from user
		return this.numDigits;
	}//End of method
	
	public int[] getSecretNumber(){// stores secret number
		return this.secretNumber;
	}//End of method
	
	public void generateNewSecret(){// generates secret number and sets boundries for secret number
		int [] numberArray = new int[numDigits]; 
		this.randomNumberGenerator = new Random();

			for (int j = 0; j < numberArray.length; j++){ //loop to keep the secretNumber throughout the user input
				numberArray[j] = randomNumberGenerator.nextInt(9);
			}
			secretNumber = numberArray;
		
	
	}
	
	public void setNumDigits(int numberOfDigits){ 		//takes user input to store number of digits
		this.numDigits = numberOfDigits;
	}//End of method
	
}//End of class
