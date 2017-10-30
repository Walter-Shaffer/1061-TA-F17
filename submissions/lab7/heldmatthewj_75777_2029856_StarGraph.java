
/*
* StarGraph.java
* Author: Matthew Held
* Submission Date: 10-19-17
*
* Purpose:
* The purpose of this program is to print to the console
* the x values, y values, and a graph representing the function
* y = 20.0 * |sin(x)| based on input from the user.
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
 
public class StarGraph {
 
       public static void main(String[] args) {
             
              //Declare Variables
              int numberOfValues;
              double xMin, xIncrement;
             
              //Create Scanner Object
              Scanner keyboard = new Scanner(System.in);
             
              //Prompt User For Information
              System.out.print("Please enter the number of x values to process: ");
              numberOfValues = keyboard.nextInt();
             
              //Check Input
              if (numberOfValues <= 0) {
                   
                    System.out.println("The number of x values must be an integer greater than 0.");
                    System.exit(0);
                   
              }
             
              //Prompt User For Information
              System.out.print("Enter a minimum value for x: ");
              xMin = keyboard.nextDouble();
             
              //Prompt User For Information
              System.out.print("Enter the amount to increment x: ");
              xIncrement = keyboard.nextDouble();
             
              //Check Input
              if (xIncrement <= 0) {
                   
                    System.out.println("The increment must be a decimal number greater than 0.");
                    System.exit(0);
                   
              }
             
              //Declare Arrays
              double[] xValues = new double[numberOfValues];
              double[] yValues = new double[numberOfValues];
             
              //Assign Values For Arrays
              for (int i = 0; i < xValues.length; i++) {
                   
                    xValues[i] = xMin + (xIncrement * i);
                    yValues[i] = 20.0 * Math.abs(Math.sin(xValues[i]));
                   
              }
             
              //Print Values To Console
              System.out.println();
              System.out.println("Values");
              for (int i = 0; i < xValues.length; i++) {
                   
                    System.out.print("x: ");
                    System.out.printf("%.3f", xValues[i]);
                    System.out.print(", y: ");
                    System.out.printf("%.3f", yValues[i]);
                    System.out.println();
                   
              }
             
              //Print Graph To Console
              System.out.println();
              System.out.println("Graph");
              for (int i = 0; i < xValues.length; i++) {
                   
                    System.out.print(":");
                    for (int j = 0; j < ((int)yValues[i]); j++) {
                          
                           System.out.print("*");
                          
                    }
                   
                    System.out.println();
                   
              }
             
       }
 
}
