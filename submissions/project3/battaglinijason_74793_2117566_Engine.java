
/*
* [Engine].java
* Author: [Jason Battaglini]
* Submission Date: [11/03/17]
*
* Purpose: Provides necessary methods and objects for the bagels class to run.
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
	private int[] secretNumber=new int[numDigits];
	private Random randomNumberGenerator=new Random();
	
	//converts the secret number to an array of single digits
	
	public int[] convertNumToDigitArray(String x){
		/*int numDigits=x.length();
		int[] convertNumToDigitArray= new int[numDigits];
		for(int i=0;i<numDigits;i++){
			
			convertNumToDigitArray[i]=x.charAt(i);
			//Character.getNumericValue(x.charAt(i));
		
		}
		return convertNumToDigitArray;*/
		int[] array = new int[x.length()];
		String[] ar = new String[x.length()];
		for(int j = 0; j < x.length(); j++){
			ar[j] = x.substring(j,j+1);
		}
		for(int i = 0; i < x.length(); i++){
			array[i] = Integer.parseInt(ar[i],10);
		}
		return array;
		
	}
	//generates a secret number of length numDigits
	public void generateNewSecret(){
	for(int i=0; i<numDigits; i++){
		secretNumber[i]=randomNumberGenerator.nextInt(10);
	}
	
	
	}
	//sets the secretNumber
	
	public void setSecretNumber(int[] secretNumber){
		this.secretNumber=secretNumber;
	}
	public void setNumDigits(int numDigits){
		this.numDigits=numDigits;
		this.secretNumber=new int[numDigits];
		
	}
	//returns the secretNumber
	public int[] getSecretNumber(){
		 for (int j=0; j<secretNumber.length; j++) //NULL
	     {
	         System.out.print("" + secretNumber[j]);
	    }
	    return secretNumber;
	}
	//returns the number of digits entered by the user in Bagels
	public int getNumDigits(){
		return numDigits;
	}
}


