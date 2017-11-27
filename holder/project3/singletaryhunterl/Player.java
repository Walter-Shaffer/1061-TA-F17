import java.util.Scanner;
public class Player {

	private String name;
	private int fastestWin;
	private int gamesCompleted = 0;
	private Scanner keyboard;
	
	public String askForGuess(){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your guess:");
		String guess = keyboard.nextLine();
		return guess;	
	}
	
	public String getName(){
		Scanner keyboard = new Scanner(System.in);
		String name = keyboard.nextLine();
		return name;
	}
	
	public int getFastestWin(){
		return fastestWin;
	}
	
	public int getGamesCompleted(){
	return gamesCompleted;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void updateStats(int numberOfMovesTakenToWin){
		gamesCompleted++;
		if (numberOfMovesTakenToWin < fastestWin)
			fastestWin = numberOfMovesTakenToWin;
		
	}
}
