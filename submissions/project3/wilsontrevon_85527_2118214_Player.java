import java.util.Scanner;

public class Player {
	private String name; //The first name of the player.
	private int fastestWin; // Like a high score. How quickly was the player able to guess the number?
	private int gamesCompleted; //The number of games that have been completed (and thus won).
	private Scanner keyboard1 = new Scanner(System.in); 
	//Used for user input in askForGuess(). This should be initialized once and reused for each call to askForGuess().
	
	public String getName(){
		return name;
	}
	public int getsFastestWin(){
		return fastestWin;
	}
	public int getGamesCompleted(){
		return gamesCompleted;
	}
	public String askForGuess(){
		System.out.print("Enter your guess: ");
		String guess = keyboard1.next();
		return guess;
	}
	public void setName(String name){
		this.name = name;
	}
	public void updateStats(int numberOfMovesTakenToWin){
		if(this.fastestWin > numberOfMovesTakenToWin){
			this.fastestWin = numberOfMovesTakenToWin;
		}
		this.gamesCompleted = this.gamesCompleted+1;
	}
	 
		
		
	}
	
													
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

