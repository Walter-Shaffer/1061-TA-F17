/**

 File name: TemperatureConverter.java


  This program does the following:
  Prompts the user to enter a temperature in Fahrenheit and a
  temperature scale the user wants to convert it to. If both the temperature in Fahrenheit  and
  the temperature scale are valid, the program converts the temperature in Fahrenheit to 
  the specified temperature scale and displays the converted value.

*/
/*
* TemperatureConverter.java
* Author: Lydia Shealy
* Submission Date: 10/3/17
*
* Purpose: 
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

public class TemperatureConverter {
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
		 }//changed the > to a < because the fahrenheit needs to be greater so you shouldnt end the program when thats true
	 
		 System.out.print (
				 "Enter the temperature scales you want to convert to:\n"+ 
				 "1. Kelvin \n"+
				 "2. Rankine \n"+
				 "3. Reaumur \n"+
				 "4. Celsius\n"+
				 "Enter a temperature scale: ");
		 tempScale = keyboard.nextInt();
		 
		 //System.out.println(fahrenheit);
		 
		 if (tempScale < 1 || tempScale > 4) {  // Second-if statement: Set a breakpoint here
			 System.out.println("Unknown temperature scale  -" +
			 					"  cannot do calculation. Bye");
			 System.exit(0);
		 }// switched the '<' signs on both // probably need to exit program here 
		 //changed && to || because no one is going to meet both those conditions at once 
		 else {
			 if (tempScale == 1) { // Set a breakpoint here			 
				 convertedDegrees = (5.0/9.0)*(fahrenheit - MIN_FAHRENHEIT);
				 tempScaleStr = "Kelvin"; //errored due to 5 and 9 being integers therefore = 0 and changed the + to - bc need to add a negative number 
				 
			 } else if (tempScale == 2 /*|| tempScale == 3*/) { 
	 			convertedDegrees = fahrenheit - MIN_FAHRENHEIT;  //changed convertedDegrees to fahrenheit
	 			tempScaleStr="Rankine"; //removed 3 as an option for this because it prevents it going to reaumur and doesnt make sense 
	 			
			 } else if (tempScale == 3) { 
				 convertedDegrees = (fahrenheit - 32) * (4.0/9.0); // Set a breakpoint here
				 tempScaleStr="Reaumur"; //changed to doubles 
					 
			 } else {
				 convertedDegrees = (fahrenheit - 32) * (5.0/9.0); // Set a breakpoint here
				 tempScaleStr="Celsius"; //changed from 9/5 to 5/9 and made doubles
			 }

			 System.out.println(fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees "+ tempScaleStr + ".");
		 }
	 }
}
