/* Drawing.java
		* Author: Hunter Singletary
		* Submission Date: [10/13/2017]
		*
		* Purpose: A program to draw a right triangle once inverted and once normally, with user input amount of stars
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
import java.util.Scanner;
public class Drawing {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("How many times do you want to repeat the figure?");
		int Repeat = input.nextInt();
		System.out.println("Indicate the number of Stars (>1):");
		int Stars = input.nextInt();
		int row=Stars;
		if (Stars <= 0){					//if-else statement to display an error message
			System.out.println("Invalid Input");	//or continue the program
			System.exit(0);
		} 
		else{
		for (int k = Repeat; k > 0; k--){
			for (int i = row; i > 0; i--){
				System.out.print('\n');
				for (int j = 0; i - j >0; j++){
					System.out.print("*");
				}
			}for(int i = row; i > 0; i-- ){
				System.out.print('\n');
				for(int j = i; row - j >= 0 ; j++){
					System.out.print('*');
				}
			}  
		}
		}
	} 
}