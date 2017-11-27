
/*
* Bagels.java
* Author: Jack Maggard
* Submission Date: 10/31/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program is a game that randomly generates an integer and
* the user has to guess what the integer is. If they get one number right they are 
* told. Then they guess again until they get the whole number right. 
* 
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

	// TODO Auto-generated method stub
	private int numDigits;
	private int[] secretNumber;
	private Random randomNumberGenerator = new Random();

	// converts the inputed string number to an int array
	public int[] convertNumToDigitArray(String number) {
		int[] nums = new int[getNumDigits()];
		for (int i = 0; i < number.length(); i++) {
			nums[i] = Character.getNumericValue(number.charAt(i));
		}
		return nums;

	}

	// returns the numDigits instance variable
	public int getNumDigits() {
		return numDigits;

	}

	// returns secret number instance variable
	public int[] getSecretNumber() {
		return secretNumber;

	}

	// this method creates a new secret integer that is the same length as the
	// numDigits
	public void generateNewSecret() {
		secretNumber = new int[getNumDigits()];
		for (int i = 0; i < getNumDigits(); i++) {
			if (i==0){
				this.secretNumber[i] = randomNumberGenerator.nextInt(9) + 1;
			}
			else{
				this.secretNumber[i] = randomNumberGenerator.nextInt(10);

			}
		}

	}

	// sets numDigits instance variable
	public void setNumDigits(int numDigits) {
		this.numDigits = numDigits;

	}

}
