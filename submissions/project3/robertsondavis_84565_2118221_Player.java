
import java.util.Arrays;
import java.util.Scanner;
public class Player {
	
	private String name;
	private int fastestWin;
	private int gamesCompleted;
	private int[] guess;
	private String guess1;
	
	private Scanner keyboard= new Scanner(System.in);
	
	//Takes the user's guess
	public String askForGuess(){
		System.out.print("Enter guess: ");
		guess1= Integer.toString(keyboard.nextInt());
		
		int[]guessArray = new int[guess1.length()];
		String d;
		for(int i=0;i<guess1.length();i++){
			d = guess1.substring(i, i+1);
			int temp= Integer.parseInt(d);

			guessArray[i]=temp;
		}
		String arrayString = Arrays.toString(guessArray);
		
		return arrayString;
	}
	
	//Returns the name
	public String getName(){
		String name2= name;
		return name2;
	}
	
	//Returns the fastest win
	public int getFastestWin(){
		int attempt=0;
		
		if(fastestWin>attempt){
			fastestWin=attempt;
		}
		else{
			attempt=attempt;
		}
		
		return fastestWin;
	}
	
	//Returns the games completed
	public int getGamesCompleted(){
		
		
		return gamesCompleted;
	}
	
	//Sets the name of the user
	public void setName(String nametemp){
		System.out.print("Enter name here: ");
		nametemp=keyboard.nextLine();
		
		
		name=nametemp;
	}
	
	//updates the games completed
	public void updateStats(){
		gamesCompleted++;
		int attempt=0;
		attempt++;
	}
	

}

