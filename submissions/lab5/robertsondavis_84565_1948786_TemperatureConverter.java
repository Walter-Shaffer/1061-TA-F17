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
	 double convertedDegrees;
	 int tempScale;
	 String tempScaleStr="";
 
	 // Creating the Scanner object
	 Scanner keyboard =  new Scanner(System.in);
 
	 System.out.print("Enter the temperature in Fahrenheit: ");               
	 fahrenheit =  keyboard.nextDouble();  // Set a breakpoint here   
 
	 // Verify the user's input
	 if (fahrenheit < MIN_FAHRENHEIT) {   // Changed the greater than sign to the less than sign due to it being the minimum, not the maximum
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
	 
	 if (tempScale < 1 || tempScale > 4) {  // the && operation was used when it's impossible to have something both less than 1 and greater than 4. it was changed to the || operator
		 System.out.println("Unknown temperature scale  -" +
		 					"  cannot do calculation. Bye");
	 }
	 else {
		 if (tempScale == 1) { // Set a breakpoint here
			 convertedDegrees = (fahrenheit + 459.67)*5/9; //Min_fahrenheit is a negative value so adding it would result in a negative value. changed to positive
			 tempScaleStr="Kelvin"; 
		 } else if (tempScale == 2) { 
 			convertedDegrees = fahrenheit + 459.67;  //converted degrees is not initialized as a variable so it can't be grouped with another string
 			tempScaleStr="Rankine";
 			
		 } else if (tempScale == 3) { 
			 convertedDegrees = (fahrenheit - 32) * 4/9; // Same as line 68
			 tempScaleStr="Reaumur";
				 
		 } else {
			 convertedDegrees = (fahrenheit - 32) * 5/9; // Had to change the equation to prioritize the subtraction first
			 tempScaleStr="Celsius";
		 }

		 System.out.println(fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees "+ tempScaleStr + ".");
	 }
 }
}
