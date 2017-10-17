/*
* Drawing.java
* Author: Timothy Morse
* Submission Date: 10 October 2017
*
* Purpose: The program intakes how many times to draw the figure and the maximum number of stars to draw, and then draws
* a right triangle upside-down, then right-side up, however many times the user desires.
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
		//Declarations
		Scanner scan = new Scanner(System.in);
		int stars = 0;
		int repeats = 0;
		//Get the value for repeats (how many times to print the triangles
		System.out.print("How many times do you want to repeat the figure? ");
		repeats = scan.nextInt();
		if(repeats>0){//checks if repeats is a valid value
			//Get value for stars (maximum length of he triangle sides)
			System.out.print("Indicate the number of stars (>1): ");
			stars = scan.nextInt();
			
			if(stars>0){//if stars is also a valid value
				System.out.println("");//blank line
				for(int i = 0; i<repeats; i++){//print the triangles [repeats] number of times
					for(int j = stars;j>0;j--){//print the upside down triangle
						for(int k = j;k>0;k--){
							System.out.print("*");
						}
						System.out.print("\n");
					}
					for(int j = 0; j<stars; j++){//print the right-side up triangle
						for(int k = -1; k<j; k++){
							System.out.print("*");
						}
						System.out.print("\n");
					}
				}
			}else{//Print an error if stars<1
				System.out.println("Invalid Input");
			}
		}else{//Print an error if repeats<1
			System.out.println("Invalid Input");
		}
		

	}

}
