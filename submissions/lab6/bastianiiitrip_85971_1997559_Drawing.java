import java.util.Scanner;

/*
* CPSC-1060.java

* Author: Trip Bastian
* Submission Date: October 11, 2017
*
* Purpose: To practice loops and nested loops. 
* 			To have the user input various commands so that they 
* 			receive the appropriate number of stars in the selected 
* 			number of patterns.
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
		 Scanner userIn =  new Scanner(System.in);
		 System.out.print("How many times do you want to repeat the figure? ");
		 int startPattern = userIn.nextInt();
		 if (startPattern <1){
			 System.out.println("Invalid input");
			 System.exit(0);
		 }
		 int pattern = startPattern;
		 System.out.print("Indicate the number of stars (>1): ");
		 int startStars = userIn.nextInt();
		 if (startStars <1){
			 System.out.println("Invalid input");
			 System.exit(0);
		 }
		 int stars = startStars;
		 int maxStars = startStars;
		 int linesDone = 0;
		 boolean decline = true;
		 while (pattern > 0){
			 stars = startStars;
			 maxStars = startStars;
			 linesDone = 0;
			 while (decline == true){
				 System.out.println();
				 while (stars > 0){
					 System.out.print("*");
					 stars--;
				 }
				 linesDone++;
				 if (linesDone == startStars){
					 decline = false;
				 }
				 maxStars--;
				 stars = maxStars;
			 }
			 stars = 0;
			 maxStars = 1;
			 linesDone = 0;
			 while (decline == false){
				 System.out.println();
				 while (stars < maxStars){
					 System.out.print("*");
					 stars++;
				 }
				 linesDone++;
				 if (linesDone == startStars){
					 decline = true;
				 }
				 maxStars++;
				 stars = 0;
			 }
			 pattern--;
		 }
	}
}