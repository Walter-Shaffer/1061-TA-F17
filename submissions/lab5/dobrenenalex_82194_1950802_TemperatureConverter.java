/**

 File name: TemperatureConverter.java

  This program does the following:
  Prompts the user to enter a temperature in Fahrenheit and a
  temperature scale the user wants to convert it to. If both the temperature in Fahrenheit  and
  the temperature scale are valid, the program converts the temperature in Fahrenheit to 
  the specified temperature scale and displays the converted value.

*/

/* Project1CreditCardPayoff.java 
 * Author:  Alex Dobrenen 
 * Submission Date:  10-6-17  
 * Purpose: A brief paragraph description of the 
 * program. What does it do? Corrected Program
 * Statement of Academic Honesty:  
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
 
	 double fahrenheit = 0.0;
	 double convertedDegrees = 0.0;
	 int tempScale = 0;
	 String tempScaleStr = "";
 
	 // Creating the Scanner object
	 Scanner keyboard =  new Scanner(System.in);
 
	 System.out.print("Enter the temperature in Fahrenheit: ");               
	 fahrenheit =  keyboard.nextDouble();  // Set a breakpoint here   
 
	 // Verify the user's input
	 //Exiting with faren > min means if the input is correct then it exits, changed to <
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
	 
	 //If and else needs to be swapped and add =s
	 if (tempScale >= 1 && tempScale <= 4) {  // Second-if statement: Set a breakpoint here
		 if (tempScale == 1) { // Set a breakpoint here
			 //Fixed conversion calc
			 convertedDegrees = (fahrenheit + 459.67) * (5.0/9.0);
			 tempScaleStr="Kelvin"; 
		 } else if (tempScale == 2) { 
			//Fixed conversion calc
			convertedDegrees = fahrenheit + 459.67;  
 			tempScaleStr="Rankine";
 			
		 } else if (tempScale == 3) { 
			//Fixed conversion calc
			 convertedDegrees = (fahrenheit - 32) * (4.0/9.0); // Set a breakpoint here
			 tempScaleStr= "Reamur";
				 
		 } else {
			//Fixed conversion calc
			 convertedDegrees = (fahrenheit - 32.0) * (5.0/9.0); // Set a breakpoint here
			 tempScaleStr="Celsius";
		 }
		 //Moved this into the if statement so it doesn't run when you put an invalid tempScale
		 System.out.println(fahrenheit + " degrees Fahrenheit is " 
		 			+ convertedDegrees + " degrees "+ tempScaleStr + ".");
	 }
	 else {
		 System.out.println("Unknown temperature scale  -" +
					"  cannot do calculation. Bye");
	 	}
	 }
 }
