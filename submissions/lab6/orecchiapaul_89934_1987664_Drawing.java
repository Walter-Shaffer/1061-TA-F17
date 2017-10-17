/* 
 * 
 * Drawing.java 
 * Author:  Paul Orecchia  
 * Submission Date:  10/10/17 
 * 
 * Purpose: The purpose of this project is to print a pattern of stars based on the input of the user.
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
		Scanner theScanner= new Scanner(System.in);
		System.out.print("How many times do you want to repeat the figure? ");
		int loops=theScanner.nextInt();
		if (loops<1){ //checks if the input is a valid number
			System.out.println("Invalid Input");
			System.exit(0);
		}else{ 
			System.out.print("Indicate the number of stars (>1): ");
			int stars=theScanner.nextInt();
			theScanner.close();
			int y=stars;
			if (stars<=1){ //checks if  stars is a valid input
				System.out.println("Invalid Input");
				System.exit(0);
			}else{ 
				for (int z=0;z<loops;z++){ //loop creates the first triangle
					for (int x=1; x<=stars; stars--){ //starts new line
						for (int starsH=stars-1; x<=starsH; starsH--){//prints the horizontal stars
							System.out.print("*");
						}
						System.out.println("*");
					}	
					for (int x=y; x>stars; stars++){ //this loop creates a reverse right triangle to complete the pattern
						for (int starsH=0; stars>starsH; starsH++){
							System.out.print("*");
						}
						System.out.println("*");
					}	
				}
			}	
		}
	}
}
