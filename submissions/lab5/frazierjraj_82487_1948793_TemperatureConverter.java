/*
* [TemperatureConverter].java
* Author: [Anthony Frazier]
* Submission Date: [10/3/17]
*
* Purpose:Prompts the user to enter a temperature in Fahrenheit and a
  temperature scale the user wants to convert it to. If both the temperature in Fahrenheit  and
  the temperature scale are valid, the program converts the temperature in Fahrenheit to 
  the specified temperature scale and displays the converted value.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagarism will be handled in accordance
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
	 Scanner keyboard =  new Scanner(System.in);
 
	 System.out.print("Enter the temperature in Fahrenheit: ");               
	 fahrenheit =  keyboard.nextDouble();  // Set a breakpoint here   
 
	 // Verify the user's input
	 //Since don't want it to be less than min fahrenheit, i changed the statement to less than
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
	 
	 //I fliped the comparison signs, becuase you want the value to be between 1 and 4, i also changed the and to an or
	 if (tempScale < 1 || tempScale > 4) {  // Second-if statement: Set a breakpoint here
		 System.out.println("Unknown temperature scale  -" +
		 					"  cannot do calculation. Bye");
	 }
	 else {
		 if (tempScale == 1) { // Set a breakpoint here
			 //because min fahrenheit is negative, you would subtract it to add them, i also added parentheses
			 convertedDegrees = (fahrenheit - MIN_FAHRENHEIT) *5/9;
			 tempScaleStr="Kelvin";
			 //I got rid of the or statement because you only want this to execute if it equals 2
		 } else if (tempScale == 2) { 
 			convertedDegrees = fahrenheit - MIN_FAHRENHEIT;  
 			tempScaleStr="Rankine";
 			
		 } else if (tempScale == 3) {
			 //I added parentheses to make sure it executes the subtraction first
			 convertedDegrees = (fahrenheit - 32) * 4/9; // Set a breakpoint here
			 tempScaleStr="Reaummur";
				 
		 } else{
			 //i fliped the ratio becuase it did not match the formula
			 convertedDegrees = (fahrenheit - 32) * 5/9; // Set a breakpoint here
			 tempScaleStr="Celsius";
		 }

		 System.out.println(fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees "+ tempScaleStr + ".");
	 }
 }
}