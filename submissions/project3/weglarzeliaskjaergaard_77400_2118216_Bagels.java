
import java.util.Scanner;
public class Bagels {

	public static void main(String[] args) {
		System.out.println("Welcome!");
		Scanner keyboard = new Scanner(System.in);
		String c = "";
		do {
			c = "";
			Player p = new Player();
			Engine e = new Engine();
			Validator validate = new Validator();
			System.out.print("Enter the number of digits to use: ");
			e.setNumDigits(keyboard.nextInt());
			System.out.println();
			System.out.print("Enter the name of the player: ");
			p.setName(keyboard.next());
			int x = 0;
			int count = 0;
			do {
				x = 0;
				e.generateNewSecret();
				count++;
				System.out.println("Starting game #" + count + ".");
				int moves = 0;
				do {
					System.out.print("Enter your guess: ");
					moves++;
					int[] guess = e.convertNumToDigitArray(keyboard.next());
					System.out.println("");
					if (validate.validateGuess(e.getSecretNumber(), guess, e.getNumDigits())) {
					System.out.println("Congratulations! You won in " + moves + " moves.");
					x = 1;
					p.updateStats(moves);
					
					System.out.println("");
					
					System.out.println("Statistics for " + p.getName() + ":");
					
					System.out.println("Games completed: " + p.getGamesCompleted());
					
					System.out.println("Number of digits: " + e.getNumDigits());
					System.out.println("Fastest win: " + p.getFastestWin());
					System.out.println("p - Play again\nr - Reset game\nq - Quit");
					c = keyboard.next();
					
					if (c.equals("q")) {
						System.exit(0);
					}
				}
				}
				while (x == 0);
			}
			while (c.equals("p"));
		}
		while (c.equals("r"));
	}
}
