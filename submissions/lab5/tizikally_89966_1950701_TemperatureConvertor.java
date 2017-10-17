/* TemperatureConvertor.Java
* Author: Allison Tizik
* Submission Date: 10/3/17
* Purpose: The program converts different Fahrenheit temperatures into other 
* temperature degrees either Kelvin ,Rankine, Reaumur, or Celsius depending on 
* the input number that was put in 1,2,3, or 4. It asks you to input a number
* if it it smaller than -459.67 than it closes the program otherwise it runs 
* through the program to convert the temperature.
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
/**
 
File name: TemperatureConverter.java
 
  This program does the following:
  Prompts the user to enter a temperature in Fahrenheit and a
  temperature scale the user wants to convert it to. If both the temperature in Fahrenheit  and
  the temperature scale are valid, the program converts the temperature in Fahrenheit to
  the specified temperature scale and displays the converted value.
 
*/
 
import java.util.Scanner;
 
public class TemperatureConvertor{
          
public static void main(String[] args) {
          
            // Declare named constants.
          
            final double MIN_FAHRENHEIT = -459.67;
          
            // Declare the variables.
 
            double fahrenheit;
           double convertedDegrees = 0;
           int tempScale;
           String tempScaleStr="";
            // Creating the Scanner object
           Scanner keyboard =  new Scanner(System.in);
            System.out.print("Enter the temperature in Fahrenheit: ");              
            fahrenheit =  keyboard.nextDouble();  // Set a breakpoint here  
 
            // Verify the user's input
           if (fahrenheit < MIN_FAHRENHEIT) {   // first if-statement: Set a breakpoint here
                      System.out.print("The temperature must be greater than or equal to " + MIN_FAHRENHEIT);
                       System.exit(0);
           }
            System.out.print (
                                 "Enter the temperature scales you want to convert to:\n"+
                                  "1. Kelvin \n"+
                                 "2. Rankine \n"+
                                 "3. Reaumur \n"+
                                 "4. Celsius\n"+
                                 "Enter a temperature scale: ");
           tempScale = keyboard.nextInt();
          
            if (tempScale < 1 && tempScale > 4) {  // Second-if statement: Set a breakpoint here
                      System.out.println("Unknown temperature scale  -" +
                                                                            "  cannot do calculation. Bye");
           }
           else {
                      if (tempScale == 1) { // Set a breakpoint here
                                 convertedDegrees = (fahrenheit - MIN_FAHRENHEIT)*5/9; // change from plus to minus
                                 tempScaleStr="Kelvin";
                       } else if (tempScale == 2) {
                                 convertedDegrees = fahrenheit - MIN_FAHRENHEIT;  // change convertedDegrees to fahrenheit
                                tempScaleStr="Rankine";
                               
                       } else if (tempScale == 3) {
                                  convertedDegrees = (fahrenheit - 32.0) * 4/9; // Set a breakpoint here
                                 tempScaleStr="Reaumur"; // Change from Rankine to Reaumur
                                             
                       } else if (tempScale == 4) {
                                 convertedDegrees = (fahrenheit - 32.0) * 5/9; // Set a breakpoint here (switch 9/5 to 5/9)
                                 tempScaleStr="Celsius";
                      }
 
                      System.out.println(fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees "+ tempScaleStr + ".");
           }
}
}