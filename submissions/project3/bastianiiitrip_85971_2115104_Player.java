import java.util.Scanner;
public class Player {
	private String name;
	private int fastestWin;
	private int gamesCompleted;
	private Scanner keyboard;
	public String askForGuess(){
		return keyboard.next();
	}
	public String getName(){
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
		if (fastestWin == 0){
			fastestWin = numberOfMovesTakenToWin;
		}
		else if(numberOfMovesTakenToWin < fastestWin){
			fastestWin = numberOfMovesTakenToWin;
		}
	}
}
