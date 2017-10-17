
import java.util.Scanner;
public class Drawing {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int repeat;
		System.out.println("How many times do you want to repeat the figure?");
		repeat = keyboard.nextInt();
		if (repeat < 0) { // temrinate program bcuz wrong input
			System.out.println("Invalid Input");
		 System.exit(0);

		} else {
		System.out.print("Indicate the number of stars (>1): "); // enter an integer greater than one 
		int stars = keyboard.nextInt();
		
		if (stars < 1){
		 System.out.println("Invalid Input");
		 System.exit(0); // terminate program because the dumbassses can't read and put a number less than one 
		}else if (stars >= 1){ 
			
		for ( int s = 1; s <=repeat; s++){ // what to do to repeat the drawing
			for ( int shape = stars;  shape >= 1; shape--){// change variable so the data doesn't change 
				System.out.print("*");
				for (int w = 1; w < shape; w++){ 
					System.out.print("*");
				}
				System.out.println();// space out to different lines
			}
		 for (int i = 1;i <= stars; i++){
			 System.out.print("*");
			 for (int w = 1; w < i; w++){
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		}
	}
		}
}
}