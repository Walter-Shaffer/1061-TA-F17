
/*
* Drawing.java
* Author: Matthew Held
* Submission Date: 10-10-17
*
* Purpose:
* The purpose of this program is to draw a picture of stars
* based on the input of the user.
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
*
*/
 
import java.util.Scanner;
 
public class Drawing {
     
      public static void main(String[] args) {
           
            //Declare Scanner
            Scanner keyboard = new Scanner(System.in);
           
            //Declare Variables
            int drawingsDisplayed;
            int starsDisplayed;
            int starCounter;
           
            //Get User Input For Number Of Drawings
            System.out.print("How many times do you want to repeat the figure? ");
            drawingsDisplayed = keyboard.nextInt();
           
            //Check Value Of drawingsDisplayed
            if (drawingsDisplayed < 1) {
                 
                  //Display Error Message & Quit Program
                  System.out.println("Invalid Input");
                  System.exit(0);
                 
            }
           
            //Get User Input For Number Of Stars
            System.out.print("Indicate the number of stars (>1): ");
            starsDisplayed = keyboard.nextInt();
            starCounter = starsDisplayed;
           
            //Check Value Of starsDisplayed
            if (starsDisplayed < 1) {
                 
                  //Display Error Message & Quit Program
                  System.out.println("Invalid Input");
                  System.exit(0);
                 
            }
           
            //Used For Formatting
            System.out.println();
           
            //Loop For Displaying Drawings
            for (int k = 0; k < drawingsDisplayed; k++) {
                 
                  //Loop For Triangle
                  for (int i = starCounter; i > 0; i--) {
                       
                        //Loop For Single Line Of Stars
                        for (int j = 0; j < i; j++) {
                             
                              System.out.print("*");
                             
                        }
                       
                        System.out.println();
                       
                  }
                 
                  //Loop For Inverted Triangle
                  for (int i = 1; i < starCounter + 1; i++) {
                       
                        //Loop For Single Line Of Stars
                        for (int j = 0; j < i; j++) {
                             
                              System.out.print("*");
                             
                        }
                       
                        System.out.println();
                       
                  }
                 
            }
           
      }
     
}