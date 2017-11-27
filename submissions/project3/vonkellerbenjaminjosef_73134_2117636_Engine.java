//Engine.java
//Author: Benjamin VonKeller
//Submission Date: 11/3/2017
//Purpose: This class file will do the inner working of the random number generator and convert the secret numbers and guesses to digit arrays.
//Statement of Academic Honesty:
//The following code represents my own work. I have neither
//received nor given inappropriate assistance. I have not copied
//or modified code from any source other than the course webpage
//or the course textbook. I recognize that any unauthorized
//assistance or plagiarism will be handled in accordance
//with the policies at Clemson University and the
//policies of this course. I recognize that my work is based
//on an assignment created by the School of Computing
//at Clemson University. Any publishing or posting
//of source code for this project is strictly prohibited
//unless you have written consent from the instructor.
import java.util.Random;

public class Engine {
private int numDigits;
private int[] secretNumber;
private Random randomNumberGenerator = new Random();

public  int[] convertNumToDigitArray(String number) {
	int [] guess = new int[number.length()];
	for (int i = 0; i < number.length(); i++) {
		guess[i] = Integer.parseInt(number.substring(i, i+1));
	}
	return guess;
}

public int getNumDigits() {
	return numDigits;
}

public int[] getSecretNumber() {
	return secretNumber;
}
public void generateNewSecret() {
	secretNumber = new int[numDigits];
	double upper = Math.pow(10,  numDigits) -1;
	double lower = Math.pow(10, numDigits - 1);
	int lowerBound = (int)lower;
	int upperBound = (int)upper;
	int randomNum = randomNumberGenerator.nextInt((upperBound - lowerBound) + 1) + lowerBound;
	int[] randomArray = new int[numDigits];
	String rand = Integer.toString(randomNum);
	for (int i = 0; i < numDigits; i++) {
		String sub = rand.substring(i, i+1);
		randomArray[i] = Integer.parseInt(sub);
	}
	secretNumber = randomArray;
}

public void setNumDigits(int numDigits) {
	this.numDigits = numDigits;
}
}
