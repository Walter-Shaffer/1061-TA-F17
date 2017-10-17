/*
* TemperatureConverter.java
* Author: Patrick Coffee
* Submission Date: 10/5/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* Prompts the user to enter a temperature in Fahrenheit and a
* temperature scale the user wants to convert it to. If both the temperature in Fahrenheit  and
* the temperature scale are valid, the program converts the temperature in Fahrenheit to 
* the specified temperature scale and displays the converted value.
* 
* 
* 
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

public class TemperatureConverter{
	
 public static void main(String[] args) {
  	
  	 // Declare named constants.
	 
	 final double MIN_FAHRENHEIT = -459.67;
	 // Checking the output: System.out.println(MIN_FAHRENHEIT);
	 
	 // Declare the variables. 
 
	 double fahrenheit;
	 double convertedDegrees;
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
	 
	 if (tempScale < 1 || tempScale > 4) {  // Second-if statement: Set a breakpoint here 
		 // changed > to < and < to > in the if statement
		 System.out.println("Unknown temperature scale  -" +
		 					"  cannot do calculation. Bye");
	 }
	 else {
		 if (tempScale == 1) { // Set a breakpoint here
			 convertedDegrees = (fahrenheit - MIN_FAHRENHEIT) * 5/9;
			 tempScaleStr="Kelvin"; 
			 // Changed the + to a - , because two negatives equal a positive.
		 } else if (tempScale == 2) { 
 			convertedDegrees = fahrenheit - MIN_FAHRENHEIT;  // I changed convertedDegrees to fahrenheit in order to keep it consistent. 
 			tempScaleStr="Rankine"; 
		 } else if (tempScale == 3) { 
			 convertedDegrees = (fahrenheit - 32) * 4/9; // Set a breakpoint here
			 tempScaleStr="Reaumur"; // Changed Rankine to Reaumur
			// System.out.println(fahrenheit - 32); 
			// System.out.println(convertedDegrees);
		 } else {
			 convertedDegrees = (fahrenheit - 32) * 5/9; // Set a breakpoint here
			 tempScaleStr="Celsius";
		 }

		 System.out.println(fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees "+ tempScaleStr + ".");
	 }
 }
}