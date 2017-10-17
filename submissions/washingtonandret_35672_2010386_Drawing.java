import java.util.Scanner;
public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Creating Scanner object
	Scanner keyboard = new Scanner(System.in);
		

		
	//Declaring variables
		int stars = 0;
	// Prompting user for information
		System.out.print("Indicate the number of stars (>1):  ");
		stars = keyboard.nextInt();
		
		
		
		for(int i=1; i>=stars;i--){
			for(int j=1; j>=i; j++){
				System.out.println("*");
			}
			System.out.println();		
	}
		
		for(int i=1; i<=stars; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
}

	

