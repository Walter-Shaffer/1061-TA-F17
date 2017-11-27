/*
* Engine.java
* Author: Mark Blasko
* Submission Date: 11/2/17
* Purpose: The purpose of the program is to use the Engine class to run the mastermind game
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

  private int numDigits; //Essentially the range of numbers to guess between i.e 3 = 100 to 999, 2 = 10 to 99
  private int[] secretNumber;
  private Random randomNumberGenerator = new Random();

  public void setNumDigits(int numDigits) { //sets number of digits

    this.numDigits = numDigits;
  }

  public int getNumDigits() { //returns number of digits user wishes to play with

    return this.numDigits;
  }

  public void generateNewSecret() { //used to initialize secretNumber
    this.secretNumber = new int[this.numDigits];
    int upperBound = (int)(Math.pow(10, this.numDigits) - 1);
    int lowerBound = (int)(Math.pow(10, (this.numDigits-1)));

    for (int i = 0; i < secretNumber.length; i++) { //Loop through and fill secretNumber with random numbers
    this.secretNumber[i] = randomNumberGenerator.nextInt(upperBound - lowerBound) + lowerBound;
      this.secretNumber[i] = this.secretNumber[i] % 10;
      if (this.secretNumber[0] == 0) {
      this.secretNumber[0] = this.secretNumber[0] + 1;
    }
  }


}

  public int[] convertNumToDigitArray(String number) { //Takes number as string and creates array

    int[] convert = new int[number.length()];

    for (int i = 0; i < number.length(); i++) {

      convert[i] = Integer.parseInt(number.substring(i, i + 1)); //check to further parse string
  }

    return convert;
  }

    public int[] getSecretNumber() { //gets number randomNumberGenerator creates
      return this.secretNumber;
    }


}
