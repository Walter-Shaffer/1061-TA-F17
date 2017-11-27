import java.util.Scanner;

public class Player {
	
	private String name;
	private int fastestWin = 999999999;
	private int gamesCompleted = 0;
	private Scanner keyboard = new Scanner(System.in);
	
	public String askForGuess() {
		return keyboard.nextLine();
	}
	
	public String getName() {
		return name;
	}
	
	public int getFastestWin() {
		return fastestWin;
	}
	
	public int getGamesCompleted() {
		return gamesCompleted;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void updateStats(int numberOfMovesTakenToWin) {
		if (numberOfMovesTakenToWin < fastestWin) {
			fastestWin = numberOfMovesTakenToWin;
		}
		gamesCompleted++;
	}
	
}
