/* 
 * Drawing.java 
 * Author:  Jackie Doan  
 * Submission Date: Tuesday October 10, 2017
 * 
 * Purpose:
 * This program is designed with the purpose of asking the user
 * how many stars they want and the amount of times they want to
 * draw it. Afterwards, the program will draw several triangles
 * that have a max length defined by user and iterated the amount
 * of times defined by user.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither 
 * received nor given inappropriate assistance. I have not copied 
 * or modified code from any source other than the course webpage 
 * or the course textbook. I recognize that any unauthorized 
 * assistance or plagiarism will be handled in accordance  
 * with the policies at Clemson University and the 
 * policies of this course. I recognize that my work is based 
 * on an assignment created by the School of Computing 
 * at Clemson University. Any publishing or posting 
 * of source code for this project is strictly prohibited 
 * unless you have written consent from the instructor.  
 */ 
import java.util.Scanner; //import resources

public class Drawing {
	
	public static void main(String[] args) {
		//Declare variable
		int iterations;
		int starNumber;
		int stars;
		
		//User input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many times do you want to repeat the figure? ");
		iterations = keyboard.nextInt();
		System.out.print("Indidcate the number of stars (>1): ");
		starNumber = keyboard.nextInt();
		
		//Check for valid input
		if (starNumber > 1) {
			//Iterations loop
			for (int j = iterations; j > 0; j--) {
				//Drawing the downward triangle
				for (int i = starNumber; i > 0; i--) {
					stars = i;
					while (stars > 0){
						System.out.print("*");
						stars--;
					}
					System.out.print("\n");
				}
				//Drawing the upward triangle
				for (int i = 1; i <= starNumber; i++) {
					stars = i;
					while (stars > 0) {
						System.out.print("*");
						stars--;
					}
					System.out.print("\n");
				}
			}
		}
		//Invalid user input
		else {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		//Close keyboard
		keyboard.close();
	}
}
