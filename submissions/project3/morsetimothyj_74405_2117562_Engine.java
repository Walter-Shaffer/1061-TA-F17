/*
* Engine.java
* Author: Timothy Morse
* Submission Date: Oct 29, 2017
*
* Purpose: Handles engine functions for Pico, Fermi, Bagel
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
import java.lang.Math;
public class Engine {
 int numDigits = 0;
 int[] secretNumber;
 Random randomNumberGenerator = new Random();
 
 //returns the secret number as an array of ints from a String
 public int[] convertNumToDigitArray(String number){
	 int[] toReturn = new int[numDigits];
	 for(int i = 0;i<number.length();i++){
		 toReturn[i] = Integer.valueOf(""+number.charAt(i)); 
	 }
	 return toReturn;
 }
 //returns the number of digits
 public int getNumDigits(){
	 
	 return numDigits;
 }
 //returns the secret number as an array of ints
 public int[] getSecretNumber(){
	 return secretNumber;
 }
 //generates a new secret number
 public void generateNewSecret(){
	 secretNumber = new int[numDigits];
	 for(int i = 0; i<numDigits; i++){
		 int randVal = randomNumberGenerator.nextInt(10);
		 secretNumber[i]=randVal;
	 }
 }
 //sets this.numDigits to the input
 public void setNumDigits(int numDigits){
	 this.numDigits = numDigits;
 }
}
