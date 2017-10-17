/* Drawing.Java
* Author: Allison Tizik
* Submission Date: 10/10/17
* Purpose: The program draws stars shrinking and growing.
* Two questions are asked to get inputs which helps the program 
* decide how long and how wide the drawing should be. The inputs
* are placed into the variables and through for statements it
* draws inverted triangle then reverted triangle depending on the 
* amount of times the program was told to repeat and the number of
* stars it was indicated to draw.
* 
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
                      // TODO Auto-generated method stub
        	   	//declaring variables and recieveing inputs
                      Scanner input = new Scanner (System.in);
                      System.out.print("How many times do you want to repeat the figure? ");
                      int figure = input.nextInt();
                      System.out.print("Indicate the number of stars (>1): ");
                      int stars = input.nextInt();
                      System.out.println("");
                      
                    if (stars>1){ //make sure input is greater than 1
                     for (int c =0; c<figure; c++){ // allows for the repeating of the figure
                      for (int i=0; i<stars; i++){ // right triangle 
                                 for (int j=0; j<stars-i; j++){
                                            System.out.print("*");
                                 }
                                 System.out.println();
                      }
                     for (int a=stars-1; a>0; a--){ //inverted triangle
                    	 for (int b=-1; b<stars-a; b++){
                    		 System.out.print("*");
                    	 }
                    	 System.out.println();
                     }
             
                     }
                     }else {
        	   System.out.println("Invalid Input"); // if input is less than or equal to 1 for stars
                     }
           }
 
}