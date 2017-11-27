/*
* Engine.java
* Author: Michael Grimsley
* Submission Date: 10/31/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
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
import java.util.Random;

public class Engine {
int[] secretNumber; //variable that holds the number we are trying to guess in an array 
int numDigits; //how big the number we are trying to guess should be also should be the length of seceretNumber
Random randomNumberGenerator = new Random(); //for generating random numbers

//converts a number in string input to an array of digits in the same order
public int[] convertNumToDigitArray(String num){
	int[] guess = new int[this.numDigits];
	for (int i = 0; i < this.numDigits; i++){
	guess[i] = Character.getNumericValue(num.charAt(i));
	}
	return guess;
}
//returns the number of digits the player choose 
public int getNumDigits(){
	return this.numDigits;
}
//returns the array that hold secertNumber
public int[] getSecretNumber(){
	return this.secretNumber;
}
//generated a new secret number 
public void generateNewSecret(){
	this.secretNumber = new int[this.numDigits];
	this.secretNumber[0] = (randomNumberGenerator.nextInt(8)+1);
	System.out.println(this.secretNumber[0]);
	for (int i = 1; i < this.numDigits; i++){
	this.secretNumber[i] = (randomNumberGenerator.nextInt(9));
	System.out.println(this.secretNumber[i]);
	}
}
//sets instance variable numDigits
public void setNumDigits(int numDigits){
	this.numDigits = numDigits;
}
}
