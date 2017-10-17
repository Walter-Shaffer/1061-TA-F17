/**
 * 
 * TemperatureConverter.java 
 * Author:  Paul Orecchia  
 * Submission Date:  10/3/17 
 * 
 * Purpose: Asks the user to input a number for fahrenhiet. Then it asks the user to choose 
 * between four different temperature scales. if the user inputed valid inputs then the program should convert. 
 * If not then the program will print an error message to the user and terminate the program.
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
	 double convertedDegrees=0 ;
	 int tempScale;
	 String tempScaleStr="";
 
	 // Creating the Scanner object
	 Scanner keyboard =  new Scanner(System.in);
 
	 System.out.print("Enter the temperature in Fahrenheit: ");               
	 fahrenheit =  keyboard.nextDouble();   
 
	 
	 if (fahrenheit < MIN_FAHRENHEIT) {   //used to check is the users input is valid
		 System.out.print("The temperature must be greater than or equal to " + MIN_FAHRENHEIT);
		 System.exit(0);
 
	 }else System.out.print (
			 "Enter the temperature scales you want to convert to:\n"+ 
			 "1. Kelvin \n"+
			 "2. Rankine \n"+
			 "3. Reaumur \n"+
			 "4. Celsius\n"+
			 "Enter a temperature scale: ");
	 tempScale = keyboard.nextInt();
		 
		 if (tempScale == 1) { 
			 convertedDegrees = (fahrenheit - MIN_FAHRENHEIT)*5/9; //Fahrenheit to Kelvin formula
			 tempScaleStr="Kelvin"; 
			
		 } else if (tempScale == 2) { 
 			convertedDegrees = fahrenheit - MIN_FAHRENHEIT; //Fahrenheit to Rankine formula 
 			tempScaleStr="Rankine";
 			
		 } else if (tempScale == 3) { 
			 convertedDegrees = (fahrenheit - 32) * 4/9; // Fahrenheit to Reaumur formula
			 tempScaleStr="Reaumur";
			 
		 }else if (tempScale == 4) {
			 convertedDegrees = (fahrenheit - 32) * 5/9; // Fahrenheit to Celsius formula
			 tempScaleStr="Celsius";
		 } else {
				 System.out.println("Unknown temperature scale  -" +
				 					"  cannot do calculation. Bye");
				 
				 System.exit(0);
				//only used if used input an invalid number
		 }

		 System.out.println(fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees "+ tempScaleStr + ".");
	 }
 }

