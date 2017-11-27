import java.util.Random;

public class Engine {

	private int numDigits;
	private int[] secretNumber = {0};
	private Random randomNumberGenerator;
	
	public void generateNewSecret(){
		double doubleNumDigits = (double) numDigits;
		double max = (Math.pow(10, doubleNumDigits))-1;
		double min = (Math.pow(10, doubleNumDigits-1));
		double range = (max - min) + 1;
		
		double doubleSecretNumber = (Math.random()*range) + min;
		
		int x = (int) doubleSecretNumber;
		String secretString = "" + x;
		for(int i = 0; i < secretNumber.length; i++){
			secretNumber[i] = secretString.charAt(i);
		}
		
	}
	
	public int[] convertNumToDigitArray(){
	return secretNumber;
	}
	
	public int getNumDigits(){
		
		return numDigits;
		
	}
	public void setNumDigits(int numDigits){
	
	this.numDigits = numDigits;
	
	}
	
}
