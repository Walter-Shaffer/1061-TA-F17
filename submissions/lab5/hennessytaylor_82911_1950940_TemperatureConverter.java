/*

 File name: TemperatureConverter.java

  This program does the following:
  Prompts the user to enter a temperature in Fahrenheit and a
  temperature scale the user wants to convert it to. If both the temperature in Fahrenheit  and
  the temperature scale are valid, the program converts the temperature in Fahrenheit to 
  the specified temperature scale and displays the converted value.

*/

	/*
	* CreditCardPayOff.java
	* Author: Taylor Hennessy
	* Submission Date: 10/3/2017
	*
	* Purpose: Fix the code, so that the program performs as stated above.
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
	 
	 //originally accounted for anything more than 1 and less than 4,
	 //now accounts for anything less than one or more than 4, the correct range
	 if (tempScale < 1 || tempScale > 4) {  // Second-if statement: Set a breakpoint here
		 System.out.println("Unknown temperature scale  -" +
		 					"  cannot do calculation. Bye");
	 }
	 else {
		 if (tempScale == 1) { // Set a breakpoint here
			 //should subtract MIN_FAHRENHEIT rather than adding a negative (fixed)
			 //parenthesis added so that the operations execute in the correct order
			 convertedDegrees = (fahrenheit - MIN_FAHRENHEIT)*5/9;
			 tempScaleStr="Kelvin"; 
			 //originally also had || tempScale == 3, 
			 //this is removed to allow the next else if to be evaluated
		 } else if (tempScale == 2) { 
			 //formula fixed
 			convertedDegrees = fahrenheit + 459.67;  
 			tempScaleStr="Rankine";
 			
		 } else if (tempScale == 3) { 
			 //formula fixed, parenthesis added
			 convertedDegrees = (fahrenheit - 32) * 4/9; // Set a breakpoint here
			 //originally read "Rankine" -> changed to "Reaumur" as it should be
			 tempScaleStr="Reaumur";
			 
				 
		 } else {
			 //originally multiplying by 9/5, should be 5/9 (fixed)
			 convertedDegrees = (fahrenheit - 32) * 5/9; // Set a breakpoint here
			 tempScaleStr="Celsius";
		 }

		 System.out.println(fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees "+ tempScaleStr + ".");
	 }
 }
}