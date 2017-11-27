import java.util.Random;
public class Engine {
	private int numDigits;
	private int[] secretNumber;
	private Random randomNumberGenerator = new Random();
	public int[] convertNumToDigitArray(String number){
		int[] returning = new int[number.length()];
		for(int i=0;i<number.length();i++){
			returning[i] = Character.getNumericValue(number.charAt(i));
		}
		return returning;
	}
	public int getNumDigits(){
		return numDigits;
	}
	public int[] getSecretNumber(){
		return secretNumber;
	}
	public void generateNewSecret(){
		secretNumber = new int[numDigits];
		for(int i=0;i<numDigits;i++){
			secretNumber[i]=(randomNumberGenerator.nextInt(9)+1);
		}
	}
	public void setNumDigits(int numDigits){
		this.numDigits = numDigits;
	}
}