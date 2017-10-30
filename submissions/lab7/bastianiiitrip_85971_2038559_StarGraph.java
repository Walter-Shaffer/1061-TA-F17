import java.util.Scanner;

/*
* CPSC-1060.java
* Author: Trip Bastian
* Submission Date: October 20, 2017
*
* Purpose: To have a program that is able to loop, calculate, and
* 			graph the sin function given certain user inputs.
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
public class StarGraph {
	public static void main(String[] args) {
		 Scanner userIn =  new Scanner(System.in);
		 //User input and error analysis
		 System.out.print("Please enter the number of x values to process: ");
		 int nValue = userIn.nextInt();
		 if (nValue <= 0){
			 System.out.println("The number of x values must be an integer greater than 0");
			 System.exit(0);
		 }
		 System.out.print("Enter a minimum value for x: ");
		 double minimum = userIn.nextDouble();
		 System.out.print("Enter the amount to increment x: ");
		 double increment = userIn.nextDouble()*1000;
		 int fixedIncrement = (int) increment;
		 increment = (double) fixedIncrement/1000;
		 if (increment < 0){
			 System.out.println("The increment must be a decimal number greater than 0.");
			 System.exit(0);
		 }
		 //Array creation
		 double[] xValues = new double[nValue];
		 double[] yValues = new double[nValue];
		 for(int i=0; i < nValue; i++){
			 xValues[i] = minimum+(increment*i);
		 }
		 double yCastThis;
		 for(int i=0; i < nValue; i++){
			 //Complicated math to truncate a double.
			 yCastThis = Math.abs(Math.sin(xValues[i]))*20000;
			 int yCasting = (int) yCastThis;
			 double yCasted = (double) yCasting/1000;
			 yValues[i] = yCasted;
		 }
		 System.out.println("");
		 //Output Values
		 System.out.println("Values");
		 for(int i=0;i < nValue; i++){
			 System.out.println("x: "+xValues[i]+", y: "+yValues[i]);
		 }
		 //Graph Printing
		 System.out.println("");
		 System.out.println("Graph");
		 int starLength;
		 for(int i=0;i < nValue; i++){
			 starLength = (int) yValues[i];
			 System.out.print(":");
			 for(int j=0;j<starLength;j++){
				 System.out.print("*");
			 }
			 System.out.println("");
		 }
	}
}