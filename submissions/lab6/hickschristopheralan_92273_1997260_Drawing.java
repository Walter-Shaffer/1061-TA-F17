import java.util.Scanner;
/*
 * Drawing.java
 * Author: Christopher Hicks
 * Submission Date 10/10/1994
 * 
 * Purpose: To validate user input, and practice using loops.
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
	
	public static void main(String[] args){
		//Scanner
		Scanner input = new Scanner(System.in);
		// Declare variable
	
		int a;
		int b;						//blank space for output
		int numberOfStars;
		int repeatNumber;
		
		//Ask for user input
		
		System.out.print("How many times do you want to repeat the figure?");
		repeatNumber = input.nextInt();
		
		//error code for repeat
		if (repeatNumber <= 0) {
			System.out.print("Invalid Input");
			System.exit(0);
		}
		System.out.print("Indicate the number of stars (>1) : ");
		numberOfStars = input.nextInt();
		
		//error code for number of stars
		if (numberOfStars <=0){
		System.out.print("Invalid Input");
		System.exit(0);
		}
		
		// Main Body loop
		do { 
			repeatNumber--;
		
			for (a = numberOfStars; a>=1; a--){  		//Stars in decending order
			for (b=1; b<=a; b++){			            //Blank space for output
			System.out.print("*");
			}
			System.out.println();
			}
			for (a = 1; a<= numberOfStars; a++){		//Stars in acending order
			for (b=1; b<=a; b++){						//Blank space for acending output
			System.out.print("*");
			}
			System.out.println();
			}
		} 
		while (repeatNumber >= 1);						//Loop back to begaining 
		
		}
		
		}
		
	