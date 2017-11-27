import java.util.Random;

/* 
 * File name: Engine.java
 * Author: Monica Hart
 * Submission Date: 11/3/2017
 *
 * This program does the following:
 * This program stores information and performs different functions 
 * based on the game in progress to be used in the Bagels.java file
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
 *
 */

public class Engine {
	
	//fields
	private int numDigits; //number of digits the user wishes to play with
	private int[] secretNumber; //secret number to guess
	private Random randomNumberGenerator = new Random();
	
	//converts a string number to an array of ints
	public int[] convertNumToDigitArray(String number){
		
		int count;
		char[] charArray = new char[number.length()];
		int[] digitArray = new int[number.length()];
		
		//convert string to char array
		for(count = 0; count < number.length(); count++){
			charArray[count] = number.charAt(count);
		}
		
		//parse ints from char array into int array
		for(count = 0; count < number.length(); count++){
			digitArray[count] = Integer.parseInt("" + charArray[count]);
		}
		return digitArray;
		
	}
	
	//return number of digits
	public int getNumDigits(){
		
		return numDigits;
		
	}
	
	//return secret number
	public int[] getSecretNumber(){
		
		return secretNumber;
		
	}
	
	//generate secret number
	public void generateNewSecret(){
		
		//generate number
		String secretNumberString = "" + randomNumberGenerator.nextInt((int)(Math.pow(10, numDigits) - Math.pow(10, numDigits - 1))) + (int)Math.pow(10, numDigits - 1);
		
		//create array for secret number
		secretNumber = new int[numDigits];
		int count;
		for (count = 0; count < numDigits; count++){
			secretNumber[count] = convertNumToDigitArray(secretNumberString)[count];
		}
		
	}
	
	//set number of digits
	public void setNumDigits(int numDigits){
		
		this.numDigits = numDigits;
		
	}

}
