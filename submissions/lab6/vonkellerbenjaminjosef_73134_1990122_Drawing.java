import java.util.Scanner;
/*
* Drawing.java
* Author: Benjamin VonKeller
* Submission Date: 10/10/2017
*
* Purpose: Draw reverse right triangles with parameters given by the user.
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
public class Drawing {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int input;
		System.out.println("How many times would you like to repeat the figure?");
		int count = keyboard.nextInt();
		System.out.println("Indicate the number of stars (>1):");
		input = keyboard.nextInt();
		if (input > 1) {
			while (count > 0) {
				int idek = input;
				while (idek >= 1){
					for (int i = idek; i > 0; i-- ) {
						System.out.print("*");
					}
					idek = idek - 1;
					System.out.println("");
				}
				while (idek < input) {
					for (int i = idek+1; i > 0; i--){
						System.out.print("*");
					}
					idek = idek + 1;
					System.out.println("");
				}
				count--;
			}
		}
		else {
			System.out.println("Invalid Input");
		}

	}

}
