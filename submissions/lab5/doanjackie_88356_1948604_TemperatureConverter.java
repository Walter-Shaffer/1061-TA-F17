/* 
 * TemperatureConverter.java 
 * Author:  Jackie Doan  
 * Submission Date:  10/3/17 
 * 
 * Purpose:
 * This program prompts a temperature in Fahrenheit and then asks which scale
 * the user wants to convert to. This will then display the temperature
 * in the new scale
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

public class TemperatureConverter{
	
 public static void main(String[] args) {
  	
  	 // Declare named constants.
	 
	 final double MIN_FAHRENHEIT = -459.67;
	 
	 // Declare the variables. 
 
	 double fahrenheit;
	 double convertedDegrees = 0; /**Initialized Variable with a number**/
	 int tempScale;
	 String tempScaleStr="";
 
	 // Creating the Scanner object
	 Scanner keyboard =  new Scanner(System.in);
 
	 System.out.print("Enter the temperature in Fahrenheit: ");               
	 fahrenheit =  keyboard.nextDouble();  // Set a breakpoint here   
 
	 // Verify the user's input
	 if (fahrenheit <= MIN_FAHRENHEIT) {   // first if-statement: Set a breakpoint here /**changed > to <= **/
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
	 
	 if (tempScale >= 1 && tempScale <= 4) {  // Second-if statement: Set a breakpoint here
		 /** Moved  else statement to the if statement **/
		 if (tempScale == 1) { // Set a breakpoint here
			 convertedDegrees = (fahrenheit - MIN_FAHRENHEIT) * 5/9; /**Added parenthesis around fahrenheit - minimum**/
			 tempScaleStr="Kelvin"; 
		 } else if (tempScale == 2 ) { /**got rid of the second half of || statement**/
 			convertedDegrees = fahrenheit - MIN_FAHRENHEIT;  /**Changed convertedDegrees to fahrenheit**/
 			tempScaleStr="Rankine";
 			
		 } else if (tempScale == 3) { 
			 convertedDegrees = (fahrenheit - 32) * 4/9; // Set a breakpoint here
			 tempScaleStr="Reamur"; /**Changed Rankine with Reamur**/
				 
		 } else {
			 convertedDegrees = (fahrenheit - 32) * 5/9; // Set a breakpoint here /**Changed 9/5 to 5/9**/
			 tempScaleStr="Celsius"; 
		 }

		 System.out.println(fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees "+ tempScaleStr + ".");
	 }
	 else {

		 System.out.println("Unknown temperature scale  -" +
					"  cannot do calculation. Bye");
	 }
 }
}