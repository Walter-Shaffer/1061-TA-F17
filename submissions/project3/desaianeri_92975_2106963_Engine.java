/*
 * [Engine].java 
 * Author: [Aneri Desai]
 * Submission Date: [11/1/2017]
 * 
 * Purpose: In the project I learned the how to use objects plus repeat all the stuff from beggining like loops, uml diagrams and many more methods. 
 * 
 *  Statement of Academic Honesty:
 *  
 *  The following code represent my own work. I have neither received nor given inappropriate assistance. 
 *  I have not copied or modified code from any source other than the course webpage or the course textbook.
 *  I recognize that any unauthorized assistance or plagiarism will be handled in accordance with the policies
 *  at Clemson University and the policies of this course. I recognize that my work is based on an assignment 
 *  created by the School of Computing at Clemson Univeristy. Any publishing or posting of source code for this 
 *  project is strictly prohibited unless you have written consent from the instructor.  
 */	
import java.util.Random;

public class Engine {

	private int numDigits = 0; //intialize the variables 
	private int[] secretNumber = {2};
	private Random randomNumberGenerator;

	public int[] convertNumToDigitArray(String number) { //converting 
		int arr[] = new int[number.length()];
		for (int i = 0; i < number.length(); i++) {
			arr[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
			}
		return arr;
		}

	public int getNumDigits() { //get method
		return numDigits;
	}

	public int[] getSecretNumber() { 
		return secretNumber;
	}

	public void generateNewSecret() { //generate random numbers 
		
		int minimum = (int) Math.pow(10, numDigits - 1); // minimum value with 2 digits is 10 (10^1)
		int maximum = (int) Math.pow(10, numDigits) - 1; // maximum value with 2 digits is 99 (10^2 - 1)
		Random random = new Random();
		int ran = minimum +random.nextInt((maximum-minimum)+1);
		String temp = Integer.toString(ran);
		secretNumber = new int[numDigits];
		for(int i = 0; i <temp.length(); i++) {
			//secretNumber[i] = temp.charAt(i)-'0';
			secretNumber[i] = Integer.parseInt(String.valueOf(temp.charAt(i)));
		}
	}

	public void setNumDigits(int numDigits) { //set numDigits
		this.numDigits = numDigits;
	}

}
