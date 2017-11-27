import java.util.*;


public class Engine {
	
	/*
	* Engine.java
	* Author: Taylor Hennessy
	* Submission Date: 11/3/2017
	*
	* Purpose: Engine class for the Pico, Fermi, Bagel game. Allows the
	* 			user to play Pico, Fermi, Bagel with the computer.
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
	
	private static int numDigits = 2;
	private static int[] secretNumber;
	private static Random randomNumberGenerator = new Random();
	
	//convert the string to an array
	public static int[] convertNumToDigitArray(String s){
		//create an array to return
		 int[] array = new int[numDigits];
		 int guess = Integer.parseInt(s);
		 int index = 0;
		 
		 //fill it with int values by getting the char at the index
		 for (int i = numDigits; i > 0; i--){
			 array[index] = (int) (((guess % (Math.pow(10, i))) - (guess % (Math.pow(10, i - 1))))/(Math.pow(10, i-1)));
			 index++;
		 }
		return array;
	}
	
	// return the number of digits
	public static int getNumDigits(){
		return numDigits;
	}

	// return the secret number
	public static int[] getSecretNumber(){
		int[] secnum = new int[secretNumber.length];
		
		for (int i = 0; i < secretNumber.length; i++){
			secnum[i] = secretNumber[i];
		}
		
		return secnum;
	}
	
	// make a new secret number
	public static void generateNewSecret(){
		secretNumber = new int[numDigits]; 
		//fill it with int values by looping through array
		 for (int i = 0; i < numDigits; i++){
			 secretNumber[i] = randomNumberGenerator.nextInt(10);
		 }
	}
	
	// mutates the number of digits
	public static void setNumDigits(int num){
		numDigits = num;
		
	}
}
