/**
 * TemperatureConverter.java
 * Author: Jacky Wong
 * Submission Date: 10/3/2017
 * 
 * Purpose: Prompts the user to enter a temperature in Fahrenheit and a 
 * temperature scale the user wants to convert it to. If both the
 * temperature in Fahrenheit and the temperature scale are valid, the
 * program converts the temperature in Fahrenheit to the specified
 * temperature scale and displays the converted value.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance
 * with the policies at Clemson university and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the School of Computing
 * at Clemson University. Any publishing or posting
 * of source code for this project is strictly prohibited
 * unless you have written consent from the instructor.
 */

// Import the scanner
import java.util.Scanner;

public class TemperatureConverter{
	
 public static void main(String[] args) {
  	
  	 // Declare named constants.
	 
	 final double MIN_FAHRENHEIT = -459.67;
	 
	 // Declare the variables. 
 
	 double fahrenheit;
	 double convertedDegrees = 0; // Initialize the variable, since an 'uninitialized' error appeared
	 int tempScale;
	 String tempScaleStr="";
 
	 // Creating the Scanner object
	 Scanner keyboard =  new Scanner(System.in);
 
	 // Ask the user for an input
	 System.out.print("Enter the temperature in Fahrenheit: ");               
	 fahrenheit =  keyboard.nextDouble(); 
 
	 // Verify the user's input
	 if (fahrenheit < MIN_FAHRENHEIT) {   // first if-statement: Set a breakpoint here
		 System.out.print("The temperature must be greater than or equal to " + MIN_FAHRENHEIT);
		 System.exit(0);
	 }
 
	 // Ask the user for the temperature scale desired
	 System.out.print (
			 "Enter the temperature scales you want to convert to:\n"+ 
			 "1. Kelvin \n"+
			 "2. Rankine \n"+
			 "3. Reaumur \n"+
			 "4. Celsius\n"+
			 "Enter a temperature scale: ");
	 tempScale = keyboard.nextInt();
	 
	 // Check if the scale number is valid
	 if (tempScale < 1 || tempScale > 4) {  /* Second-if statement: Set a breakpoint here */ /** Changed the <> signs; opposite signs originally. **/
		 System.out.println("Unknown temperature scale  -" +
		 					"  cannot do calculation. Bye");
	 }
	 else { // If valid, convert the provided temperature via the scale requested
		 if (tempScale == 1) { // Set a breakpoint here
			 convertedDegrees = (fahrenheit - MIN_FAHRENHEIT) * 5/9; /** Changed + to -, due to MIN_FAHRENHEIT being negative; added () **/
			 tempScaleStr="Kelvin"; 
		 } else if (tempScale == 2) { /** Deleted unnecessary '|| tempScale == 3'**/
 			convertedDegrees = fahrenheit - MIN_FAHRENHEIT;  /** Changed + to -, due to MIN_FAHRENHEIT being negative **/
 			tempScaleStr="Rankine";
		 } else if (tempScale == 3) { 
			 convertedDegrees = (fahrenheit - 32) * 4/9; /* Set a breakpoint here*/ /** Added ()**/
			 tempScaleStr="Reaumur"; /** Reaumur, not a second Rankine **/
		 } else {
			 convertedDegrees = (fahrenheit - 32) * 5/9; /* Set a breakpoint here */ /** 9/5 to 5/9 **/
			 tempScaleStr="Celsius";
		 }

		 System.out.println(fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees "+ tempScaleStr + ".");
	 }
 }
}