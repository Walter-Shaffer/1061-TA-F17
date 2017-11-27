import java.util.Scanner;
public class Bagels {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Engine engine = new Engine();
		Player player = new Player();
		Validator validator = new Validator();
		System.out.println("Welcome!");
		System.out.println("Enter the number of digits to use:");
		engine.setNumDigits(keyboard.nextInt());
		engine.getNumDigits();
		engine.generateNewSecret();
		System.out.println(engine.convertNumToDigitArray());
		System.out.println("Enter the player's name:");
		player.getName();
		System.out.println("\n" + "Starting game # " + player.getGamesCompleted()+1);
		
		player.askForGuess();
		

	}

}
