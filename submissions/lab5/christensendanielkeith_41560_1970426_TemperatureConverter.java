
/**
File name: TemperatureConverter.java
This program does the following:
Prompts the user to enter a temperature in Fahrenheit and a
temperature scale the user wants to convert it to. If both the 
temperature in Fahrenheit  and
the temperature scale are valid, the program converts the temperature in 
Fahrenheit to
the specified temperature scale and displays the converted value.
*/

/*
*TemperatureCpnverter.java
* Author: Daniel Christensen
* Submission Date: 10/3/2017
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
 
 // Declare the variables.
 
 double fahrenheit;
 double convertedDegrees;
 int tempScale;
 String tempScaleStr="";
 
 // Creating the Scanner object
 
 Scanner keyboard =  new Scanner(System.in);
 
 System.out.print("Enter the temperature in Fahrenheit: ");
 
 fahrenheit =  keyboard.nextDouble(); 
 
 // Verify the user's input
 
 if (fahrenheit < MIN_FAHRENHEIT) {   
     System.out.print("The temperature must be greater than or equal to " + MIN_FAHRENHEIT);// need to have this statement on one line
     System.exit(0);
 }
 
 System.out.print ("Enter the temperature scales you want to convert to:\n"+"1. Kelvin \n"+"2. Rankine \n"+"3. Reaumur \n"+"4. Celsius\n"+"Enter a temperature scale: ");




 tempScale = keyboard.nextInt();
 
 keyboard.close();// literally only did this to get rid of error message
 
 if (tempScale < 1 || tempScale > 4) {  
     System.out.println("Unknown temperature scale  -" +"  cannot do calculation. Bye");
     System.exit(0);
 }
 else {
	 if (tempScale == 1) { 
     convertedDegrees = (fahrenheit - MIN_FAHRENHEIT)*5/9;//
     tempScaleStr="Kelvin";
     } 
     else 
	     if (tempScale == 2) {// temp scales 2 and 3 have different conversions so we need separate if statements
              convertedDegrees = fahrenheit - MIN_FAHRENHEIT;// replace convertedDegrees with fahrenheit
              tempScaleStr="Rankine";
         } 
	     else {
		     if (tempScale == 3) {
                 convertedDegrees = (fahrenheit - 32) * 4/9; // we need parentheses here and 
                 tempScaleStr="Reaumur";// must i really explain this one
             } 
		     else {// if 1<=tempscale<=4 && tempscale!=1,2,3, then tempscale = 4
			     convertedDegrees = (fahrenheit - 32) * 5/9; // 5/9 not 9/5; we need parentheses here for order of operations
                 tempScaleStr="Celsius";
             }
	     }   
 System.out.println(fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees "+ tempScaleStr + ".");// need this on one line 
 }
}
}
