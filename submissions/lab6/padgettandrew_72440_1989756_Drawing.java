/*
* Drawing.java
* Author: Andrew Padgett
* Submission Date: 10/10/17
*
* Purpose: program draws patterns of stars of a user inputed size and loops
* 		   those patterns a user inputed number of times
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

import java.util.Scanner;			//import scanner

public class Drawing {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);		//create scanner "keyboard"
		
		int i;
		
		System.out.print("How many times do you want to repeat the figure? ");		//prompt user for number of repetitions
		int repetitions = keyboard.nextInt();
		if (repetitions < 1){								//if statement determines whether or not input is valid
			System.out.println("Invalid Input");
			System.exit(0);
		}
		System.out.print("Indicate the number of stars (>1): ");		//prompt user for size of pattern
		int numberOfStars = keyboard.nextInt();
		if (numberOfStars < 1){					//if statement determines whether or not input is valid
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		System.out.println("");
		
		keyboard.close();
		
		for(int k = repetitions; k > 0; k--){			//loop that repeats entire pattern a number of times
			for(i = numberOfStars; i > 0; i--){			//loop that creates pattern
				for (int j = 0; j < i; j++){
					System.out.print("*");
				}
				System.out.println("");
			}
			for(i = 0; i < numberOfStars; i++){			//loop that creates inverted pattern
				for (int j = 0; j <= i; j++){
					System.out.print("*");
				}
				System.out.println("");
			}

		}

	}

}