/*
		* Engine.java
		* Author: Spalding Latham
		* Submission Date: [11/03/2017]
		*
		* Purpose: Encapsulates data and actions related to the actual game in progress. 
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
import java.util.*;
public class Engine {
	
	private int numDigits;
	private int[] secretNumber;
	private Random randomNumberGenerator;
	


	
	//returns the number of digits the player wants to use
	public int getNumDigits(){
		return numDigits;
		}
	
	
	//sets the number of digits to the input parameter
		public void setNumDigits(int numDigits){
			this.numDigits = numDigits;
			//System.out.print(numDigits);
		}
	
		
		
		//Converts a number (as a String) to an array of ints. 
		public int[] convertNumToDigitArray(String guess){
			//System.out.println(guess);
			int n = guess.length();
			int j;
			int[] newArray = new int[n];
 				
			//loop to store the String value as an array of integers
			for (j = 0; j < n; j++){
			newArray[j] = Integer.parseInt(guess.substring(j, j +1));
			//System.out.println(newArray[j]);
			
			}
			
			
		
			
			return newArray;}
		
		
		
	//Changes the secretNumber field to a random number in the range 10^(n-1) and 10^(n)-1.
		public void generateNewSecret(){
		//type casts the int numDigits to a double
		double doubleNumDigits = (double)numDigits; 
			
		//max value for the secret number
		double max = (Math.pow(10, doubleNumDigits))-1; 
		
		//min value for the secret number
		double min = Math.pow(10, doubleNumDigits-1);
			
		double range = (max - min) + 1;
			
		//gets a random number inside the range
		double doubleSecretNumber = (Math.random() * range) + min;
			
		//type cast the secret number from double to int
		int intSecretNumber = (int) doubleSecretNumber;
		
		//cast from int to string
		String stringSecretNumber = "" + intSecretNumber;
		//System.out.println("secret is " + stringSecretNumber);
		
		secretNumber = convertNumToDigitArray(stringSecretNumber);
		
		
		
		
		
		

	}	
	
	
		
	//getter method to get the secret number array
	public int[] getSecretNumber(){
		return secretNumber;}


		
		
	
	
	













}
