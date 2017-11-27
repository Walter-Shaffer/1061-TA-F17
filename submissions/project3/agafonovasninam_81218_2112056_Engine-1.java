/*
* Engine.java
* Author:  Nina Agafonovas
* Submission Date:  November 2, 2017
* Purpose: This class contains the methods related to the actual game in progress.
* Honesty:
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

public class Engine {
	
	
private int numDigits;
private int[] secretNumber;
private Random randomNumberGenerator;
private int n1;



public int[] convertNumToDigitArray(String number){
	
	String NumString;	
	int[] NumArray = new int[number.length()];			//creates an array with the length of the string
	
	for (int i=0; i < number.length(); i++){
	
	NumArray[i] = Integer.parseInt(number.substring(i,i+1));	//convert string to integer, 
	
	}	
	return NumArray;
}

public int getNumDigits(){						//getter
	return this.numDigits;
}

public int[] getSecretNumber(){		
	return this.secretNumber;
}

public void generateNewSecret(){ 
	Random randomNumGenerator = new Random();  	//make a new object for the generator
		
	secretNumber = new int[numDigits]; 	
	this.secretNumber[0] = randomNumGenerator.nextInt(9)+ 1;	//nextInt is not exclusive so I added +1
	for (int i = 1; i< numDigits; i++){
		this.secretNumber[i] = randomNumGenerator.nextInt(10);
	}

	
}

public void setNumDigits(int n){
	numDigits = n;
	

}

}