
import java.util.Random;
 
/*
* Engine.java
* Author: Matthew Held
* Submission Date: 11-2-17
*
* Purpose:
* The purpose of this class is to encapsulate the data and actions
* related to the actual game in progress.
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
*
* I Agree
*
*/
 
public class Engine {
      
       //Declare Variables
       private int numDigits;
       private int[] secretNumber;
       private Random randomNumberGenerator = new Random();
      
       /*
       * Converts a number (as a String) to an array of ints.
       */
       public int[] convertNumToDigitArray(String strNum) {
             
              //Declare Variables
              int strLength = strNum.length();
              int[] intArray = new int[strLength];
             
              //Parse Through String Input & Put Into Integer Array
              for (int i = 0; i < strLength; i++) {
                   
                    intArray[i] = (int)(strNum.charAt(i));
                   
              }
             
              //Return Value
              return intArray;
             
       }
      
       /*
       * Returns the number of digits.
       */
       public int getNumDigits() {
             
              //Return Value
              return numDigits;
             
       }
      
       /*
       * Returns the secret number.
       */
       public int[] getSecretNumber() {
             
              //Return Value
              return secretNumber;
             
       }
      
       /*
       * Changes the secretNumber field to a random number.
       */
       public void generateNewSecret() {
             
              //Get Random Number With Correct Digits
              int intRand = randomNumberGenerator.nextInt((int)(Math.pow(10, numDigits) - Math.pow(10, numDigits - 1))) + (int)Math.pow(10, numDigits - 1);
             
              //Set To String
              String strRand = String.valueOf(intRand);
             
              //Set Value
              secretNumber = convertNumToDigitArray(strRand);
             
       }
      
       /*
       * Sets the number of digits to the input parameter.
       */
       public void setNumDigits(int digits) {
             
              //Set Value
              numDigits = digits;
             
       }
      
}