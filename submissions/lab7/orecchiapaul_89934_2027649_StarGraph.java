/* 
 * 
 * StarGraph.java 
 * Author:  Paul Orecchia  
 * Submission Date:  10/19/17 
 * 
 * Purpose: the purpose of this program is for the user input the number of values, the minimum x value
 * and the increment it will be raised by. The Program will them compute the y values and print out a graph.
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

public class StarGraph {

	public static void main(String[] args) {
		Scanner Keyboard= new Scanner(System.in);
		System.out.print("Please enter the number of x values to process: ");
		int N= Keyboard.nextInt();
		if (N<=0){ //if statement that determines if the users input is valid
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}else{
		}System.out.print("Enter a minimum value for x: ");
		double minimum=Keyboard.nextDouble();
		System.out.print("Enter the amount to increment x: ");
		double increment=Keyboard.nextDouble();
		if (increment<=0){ //if statement that determines if the users input is valid
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
			
		}else{
		}System.out.println("\nValues");
		Keyboard.close();
		double [] x=new double[N];
		double [] y=new double[N];
		int i=0;
		for (x[0]=minimum;i<x.length;i++){ //for loop used to calculate the y values based on x
			if (i==0){ //if else statement used to determine where or not this is the initial x value
				System.out.print("x: ");
				System.out.printf("%.3f",x[i]);
				System.out.printf(", ");
				y[i]=20.0*Math.abs(Math.sin(x[i]));
				System.out.print("y: ");
				System.out.printf("%.3f",y[i]);
				System.out.print("\n");
			}else{ //if its not the initial x the increment is added
				x[i]=x[i-1]+increment;
				if ((x[i]<=0.0001)&&(x[i]>=-.0001)){ //if statement used to check if x=0. if x=0 then 0 becomes positive
					x[i]=Math.abs(x[i]);	
					System.out.print("x: ");
					System.out.printf("%.3f",x[i]);
					System.out.printf(", ");
					y[i]=20.0*Math.abs(Math.sin(x[i]));
					System.out.print("y: ");
					System.out.printf("%.3f",y[i]);
					System.out.print("\n");
				}else{
					System.out.print("x: ");
					System.out.printf("%.3f",x[i]);
					System.out.printf(", ");
					y[i]=20.0*Math.abs(Math.sin(x[i]));
					System.out.print("y: ");
					System.out.printf("%.3f",y[i]);
					System.out.print("\n");
				}	
			}
		}	
		System.out.println("\nGraph");	
		for (i=0;N>i;i++){  //for statement that create the graph
			y[i]=(int) y[i];
			System.out.print(":");
			for (int j=0; j<y[i]; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
