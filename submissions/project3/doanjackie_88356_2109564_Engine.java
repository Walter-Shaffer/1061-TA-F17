/* 
 * Engine.java 
 * Author:  Jackie Doan  
 * Submission Date:  11/2/17 
 * 
 * Purpose:
 * This program is used as the engine for the game.
 * Generates a number that is meant to be guessed.
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
	//variable initialization
	private int numDigits;
	private int[] secretNum;
	private Random randomNumberGenerator = new Random();
	String secret;
	//changes the string of numbers into a array of numbers
	public int[] convertNumToDigitArray(String number){
		int[] digits = new int[numDigits];
		String tempChange;
		for(int i=0;i < getNumDigits();i++){
			tempChange = number.substring(0,1);
			digits[i] = Integer.parseInt(tempChange);
			number = number.substring(1);
		}
		return digits;
	}
	//returns the number of digits
	public int getNumDigits(){
		return numDigits;
	}
	//returns the secret number
	public int[] getSecretNumber(){
		return secretNum;
	}
	public void generateNewSecret(){
		int min = (int) Math.pow(10, numDigits-1);
		int max = (((int) Math.pow(10, numDigits)) - 1);
		int theNum = randomNumberGenerator.nextInt(max - min + 1) + min;
		secret = "" + theNum;
		secretNum = convertNumToDigitArray(secret);
	}
	//sets the number of digits
	public void setNumDigits(int numDigits){
		this.numDigits = numDigits;
	}
	public String toString(){
		String print = "";
		for(int i = 0; i < this.secretNum.length;i++){
			print += ("" + secretNum[i]);
		}
		return print;
	}
}