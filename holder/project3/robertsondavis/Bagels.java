
import java.util.Scanner;
public class Bagels {

	//The main method will call on the classes
	public static void main(String[] args) {
		Scanner keyboard=new Scanner (System.in);
		//creates instances of each class
		Player p= new Player();
		Engine e= new Engine();
		Validator v=new Validator();
		int loop=0;
		System.out.println("Welcome!");
		
		//The main loop
		while (loop<1){
			int gameCount=1;
			int attemptFastest=Integer.MAX_VALUE;		
			int loop2=0;
			//This prompts the user and sets the number of digits
			e.setNumDigits(0);
			//This prompts the user and sets the name
			p.setName("");
			System.out.println(" ");
		
			//This is the loop that will run if the player does not want to reset the game
			while(loop2<1){
				int attempt=1;
				
				//This function will generate a new secret number
				e.generateNewSecret();
		
				//This function converts the number to an array
				e.convertNumToDigitArray("");
				System.out.println("Starting game #"+gameCount);
				
		
				//This loop will keep running until the user guesses the correct number 
					while(v.validateGuess(e.getSecretNumber(),e.convertNumToDigitArray(p.askForGuess()) ,e.getNumDigits())==false){
						attempt++;
			
					}
		
		
					System.out.println("Congratulations! You won in "+attempt+" moves.");
					
					//These conditions will set attemptFastest to the fastest attempt
					if(attemptFastest>attempt){
						attemptFastest=attempt;
					}
					else{
						attempt=attempt;
					}
		
					
					System.out.println("Statistics for: "+p.getName());
					System.out.println("Games completed: "+gameCount);
					System.out.println("Number of digits: "+e.getNumDigits());
					System.out.println("Fastest win: "+attemptFastest+" guesses");
					System.out.println("p - play again");
					System.out.println("r - reset game");
					System.out.println("q - quit game\n\n");
					System.out.print("What would you like to do? ");
					gameCount++;
					String ans= keyboard.nextLine();
					//Ans determines if the program will run again
					if (ans.equals("q")){
						System.out.println("");
						System.out.println("Goodbye!");
						System.exit(0);
					}
					else if(ans.equals("p")){
						loop++;
						System.out.println(" ");
					}
					else if(ans.equals("r")){
						loop2++;
						loop=0;
						System.out.println(" ");

					}
			}
		
		
		}

	}

}



