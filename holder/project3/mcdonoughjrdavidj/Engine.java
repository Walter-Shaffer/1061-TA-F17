/*
*Engine.java
* Author:  David McDonough
* Submission Date:  November 3rd, 2017
* Purpose: Engine generates secret number and converts number to digit array
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance
* with the policies at Clemson University and the
* policies of this course. I recognize that my work is based
* on an assignment created by the School of Computing
* at Clemson University. Any publishing or posting
* of source code for this project is strictly prohibited
* unless you have written consent from the instructor.
*/

import java.util.Random;
import java.util.Scanner;

public class Engine {

	private int numDigits;
	private int[] secretNumber; 
	private Random randomNumberGenerator = new Random();
	private int secretNum;
	
	//number of digits are returned
	public int getNumDigits(){
		
		return numDigits;
	}
	
	//secret number is generated using lower and upper bounds
	public void generateNewSecret(){
		double upperBound= Math.pow(10, numDigits-1);
		double lowerBound= Math.pow(10, numDigits)-1;
		int rand= randomNumberGenerator.nextInt(((int)upperBound - (int) lowerBound)+1) + (int) lowerBound;
		secretNum = rand;
		
	}
	
	//returns the secret number array
	public int[] getSecretNumber(){
		
		return secretNumber;
	}
	
	//set method that gets user inputed data for amount of digits to use
	public void setNumDigits(int num){
		Scanner keyboard= new Scanner(System.in);
		System.out.print("Enter number of digits to use: ");
		num = keyboard.nextInt();
		numDigits = num;
		
	}
	
	//makes an array for the secret number
	public int [] convertNumToDigitArray(String numString){
		int [] secretNumber=new int[numDigits];
		numString= " " + secretNum;
		int leng = numString.length();
		String temp;
		for(int i = 0;i < leng; i++){
			temp=numString.charAt(i) + "";
			int temps= Integer.parseInt(temp);
			secretNumber[i] = temps;
		}
		
		return secretNumber;
		
	}
	

}

