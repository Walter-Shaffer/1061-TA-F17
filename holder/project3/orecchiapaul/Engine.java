/* 
 * 
 * Engine.java 
 * Author:  Paul Orecchia  
 * Submission Date:  10/31/17 
 * 
 * Purpose: The purpose of this program is to compute a random number for the game and convert the
 * guess into an array so it can be read by the Validator class.
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

	private int numDigits;
	private int[] secretNumber;
	private Random randomNumberGenerator;
	
	public int[] convertNumToDigitArray(String number){ //converts a string into an array. used to make the users guess match validator's requirements
		int[] x=new int[numDigits];
		for (int i=0;i<x.length;i++){
			String parse=number.substring(0,1);
			number=number.substring(0+1);
			x[i]=Integer.parseInt(parse);
			
		}
		return(x);
	}
	public int getNumDigits(){// returns the number of digits used for the game
		return numDigits;
	}
	public int[] getSecretNumber(){ //returns the value of the secret number
		return secretNumber;
	}
	public void generateNewSecret(){ //creates a new secret number
		secretNumber= new int[numDigits];
		for (int i=0;i<secretNumber.length;i++){
			secretNumber[i]=(int) (Math.random()*10);
		}			
	}
	public void setNumDigits(int numDigits){ //sets the value for the number of digits that will be used for the game
		this.numDigits=numDigits;
	
		}
	
}
