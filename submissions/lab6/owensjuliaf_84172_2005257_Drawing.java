/*
* Drawing.java
* Author: Julia Owens
* Submission Date: 10/10/2017
*
* Purpose: 
*
* Statement of Academic Honesty:
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
import java.util.Scanner;

public class Drawing {
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		System.out.print("How many times do you want to repeat the figure? ");
		int repeat= keyboard.nextInt();
		
		if (repeat< 1) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		System.out.print("Indicate the number of stars (>1): ");
		int numberOfStars= keyboard.nextInt();
		int originalNumber= numberOfStars;
		
		if (numberOfStars<= 1) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		while (repeat> 0) {
			while (numberOfStars>= 1){
				for (int triangle= 1; triangle<= numberOfStars; triangle++) {
					System.out.print("*");
				}
			if (numberOfStars> 1) {
				System.out.print("\n");
			}
			numberOfStars--;
			}
			while (numberOfStars<= originalNumber) {
			
			for (int triangle= 1; triangle<=numberOfStars; triangle++) {
				System.out.print("*");
			}
			System.out.print("\n");
			numberOfStars++;
		}
			repeat--;
			numberOfStars--;
		}
	}
}
