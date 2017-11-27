import java.util.Random;

public class Engine {
	
	private int numDigits;
	private int[] secretNumber;
	private Random randomNumberGenerator = new Random();
	
	public int[] convertNumToDigitArray(String number) {
		int digitArray[] = new int[number.length()];
		for (int i = 0; i < number.length(); i++) {
			digitArray[i] = number.charAt(i) - 48;
		}
		return digitArray;
	}
	
	public int getNumDigits() {
		return numDigits;
	}
	
	public int[] getSecretNumber() {
		//System.out.println(secretNumber[0] + secretNumber[1] + secretNumber[2]);
		return secretNumber;
	}
	
	public void generateNewSecret() {
		int[] secret = new int[numDigits];
		for (int i = 0; i < numDigits; i++) {
			int randomInt = randomNumberGenerator.nextInt(10);
			secret[i] = randomInt;
		}
		secretNumber = secret;
	}
	
	public void setNumDigits(int numDigits) {
		this.numDigits = numDigits;
	}

}
