import java.util.Random;

public class Engine {
	private int numDigits;
	private int[] secretNumber;
	private Random randomNumberGenerator;
	
	public void setNumDigits(int numDigits){
		this.numDigits = numDigits;
	}
	public int getNumDigits(){
		return numDigits;
	}
	public Random getRandomNumberGenerator(){
		return randomNumberGenerator;
	}
	public int[] convertNumToDigitArray(String number){
		int[] digitArray = new int [number.length()];
		for(int i = 0; i > number.length(); i++){
			digitArray[i] = number.charAt(i);
		}
		return digitArray;
	}
	public void generateNewSecret(){
		Bagels b = new Bagels();
		randomNumberGenerator = new Random();
		secretNumber = new int [numDigits];
		for(int i = 0; i < numDigits; i++){
			if(i == 0){
				secretNumber[i] = randomNumberGenerator.nextInt(9)+1;}
			else if (i != 0){
				secretNumber[i] = randomNumberGenerator.nextInt(10);
			}
		}
	}
	public int[] getSecretNumber(){
		return secretNumber;
	}
}
