/*
* StarGraph.java
* Author: Mark Blasko
* Submission Date: 10/20/17
* Purpose: The purpose of this program is to 
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

public class StarGraph {

  public static void main(String [] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Please enter the number of x values to process: ");
    int numberOfValues = input.nextInt();

    System.out.print("Enter a minimum value for x: ");
    double x_Min = input.nextDouble();

    System.out.print("Enter the amount to increment x: ");
    double xInc = input.nextDouble();

    if (numberOfValues <= 0 || xInc <= 0) {
      System.out.println("Error");
      System.exit(0);

    }

    double[] xNumberAmount = new double[numberOfValues];
    double[] yNumberAmount = new double[numberOfValues];


    int x = numberOfValues;
    int y = numberOfValues;
    double z = x_Min; //added for second increment in for loop

    System.out.println("\nValues");

    for (x = 0; x < xNumberAmount.length; x++, z += xInc) {

      xNumberAmount[x] = z;
      yNumberAmount[x] = (20 * Math.abs(Math.sin(xNumberAmount[x])));

      System.out.println("x: " + String.format("%.3f", xNumberAmount[x]) + ", " + "y: " + String.format("%.3f", yNumberAmount[x]));
      //Used to format to three decimal places
      }

    System.out.println("\nGraph");

    for (x = 0; x < xNumberAmount.length; x++) {

      int graphLines = (int) yNumberAmount[x];
      System.out.print(":");

      for (y = 1; y < graphLines; y++) {
       if (graphLines != 0) { //To prevent star from printing twice
        System.out.print("*");
      }
        else {
          System.out.println();
        }
      }
      if (graphLines != 0) { //to prevent from double printing
      System.out.println("*");
    }
      else {
        System.out.println();
      }

  }



  } //End of Main


} //End of Class