/*
* File name: TemperatureConverter.java
* Author: Heather Wright
* Submission Date: October 4, 2017
*
* Purpose:  This program does the following:
* Prompts the user to enter a temperature in Fahrenheit and a
* temperature scale the user wants to convert it to. If both 
* the temperature in Fahrenheit  and the temperature scale are 
* valid, the program converts the temperature in Fahrenheit to 
* the specified temperature scale and displays the converted value.
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

public class TemperatureConverter{
	
 public static void main(String[] args) {
  	
  	 // Declare named constants.
	 
	 final double MIN_FAHRENHEIT = -459.67;
	 
	 // Declare the variables. 
 
	 double fahrenheit;
	 double convertedDegrees;
	 int tempScale;
	 String tempScaleStr="";
 
	 // Creating the Scanner object
	 Scanner keyboard = new Scanner(System.in);
	 
	 System.out.print("Enter the temperature in Fahrenheit: ");               
	 fahrenheit = keyboard.nextDouble();  // Set a breakpoint here   
 
	 // Verify the user's input
	 if (fahrenheit < MIN_FAHRENHEIT) {   // change to the > to < as this should only output if fahrenheit is less than the min fahrenheit
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
	 
	 if (tempScale < 0 || tempScale > 5) {  //must change the boolean to tempScale < 0 or tempScale > 5, so that the number 1 through 4 are included. 
		 System.out.println("Unknown temperature scale  -" +
		 					"  cannot do calculation. Bye");
	 }
	 else {
		 if (tempScale == 1) { // Set a breakpoint here
			 convertedDegrees = (fahrenheit - MIN_FAHRENHEIT) * (5.0 / 9.0); //must convert all fractions to doubles so they produce double results
			 tempScaleStr="Kelvin"; 
		 } else if (tempScale == 2) { 
 			convertedDegrees = fahrenheit - MIN_FAHRENHEIT;  // also must switch all signs as MIN_FAHRENHEIT is a negative value
 			tempScaleStr="Rankine"; 
 			
		 } else if (tempScale == 3) { 
			 convertedDegrees = (fahrenheit - 32) * (4.0 / 9.0); // Set a breakpoint here
			 tempScaleStr="Reaumur"; // change Rankine to Reaumur as that is the temperature scale
				 
		 } else {
			 convertedDegrees = (fahrenheit - 32) * (5.0 / 9.0); // Set a breakpoint here
			 tempScaleStr="Celsius";
		 }

		 System.out.println(fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees "+ tempScaleStr + ".");
	 }
 }
}