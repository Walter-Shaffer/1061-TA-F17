
import java.util.Random;
import java.util.Scanner;

public class Engine {

	private int numDigits;
	private int[] secretNumber; //=new int[numDigits];
	private Random randomNumberGenerator=new Random();
	private int secretNum;
	
	//Returns number of digits
	public int getNumDigits(){
		
		return numDigits;
	}
	
	//Generates a new secret number
	public void generateNewSecret(){
		secretNumber = new int[numDigits];
		double min= Math.pow(10, numDigits-1);
		double max= Math.pow(10, numDigits)-1;
		
		//Creates a random number between the values max and min
		
		int rand= randomNumberGenerator.nextInt(((int)max- (int) min)+1)+(int) min;
		
		int r [] = convertNumToDigitArray(Integer.toString(rand));
		
		for (int k = 0; k < numDigits; k++){
		
			secretNumber[k] = r[k];
		}
		
		
	}
	
	//Gets the secret number array
	public int[] getSecretNumber(){
		
		return secretNumber;
	}
	
	//Sets the number of digits for the array
	public void setNumDigits(int num){
		Scanner keyboard= new Scanner(System.in);
		System.out.print("Enter number of digits to use: ");
		num= keyboard.nextInt();
		numDigits=num;
		
	}
	
	//Converts the secret number to an array
	public int [] convertNumToDigitArray(String numString){
		System.out.println(numString);
		int [] anything=new int[numDigits];
		int leng=numString.length();
		String temp;
		for(int i=0;i<leng;i++){
			temp=numString.substring(i,i+1);
			
			int temps= Integer.parseInt(temp);
			anything[i]=temps;
		}
		
		return anything;
		
	}
	

}



