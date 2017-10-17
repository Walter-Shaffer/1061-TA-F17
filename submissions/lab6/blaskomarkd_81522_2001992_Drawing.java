/*
* Drawing.java
* Author: Mark Blasko
* Submission Date: 10/12/17
* Purpose: The purpose of this program is to use for loops
to display different sequences of stars.
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
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

  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("How many times do you want to repeat the figure? ");
    int display = input.nextInt();
    if (display < 1) {
      System.out.println("Invalid Input");
      System.exit(0);
    }

    System.out.print("Indicate the number of stars (>1): ");
    int numberOfStars = input.nextInt();
    int first = 0;
    int second = 0;
    int amount = 0;

    for (amount = 1; amount <= display; amount++) {

    for (first = numberOfStars; first >= 1; first--) {
      for (second = 1; first >= second; second++) {
        System.out.print("* ");
} //end of inner for
        System.out.println(" ");
      }


      for (first = 1; first <= numberOfStars; first++) {
        for (second = 1; first >= second; second++) {
         System.out.print("* ");
       } //end of inner for
       System.out.println(" ");
     }
} //end of outer for loop


  } //end of main

} //end of class
