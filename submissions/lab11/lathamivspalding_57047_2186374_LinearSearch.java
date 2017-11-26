/*
* [LinearSearch].java
* Author: [Spalding Latham]
* Submission Date: [11/17/2017]
*
* Purpose: This program uses linear search to locate the first index of an item in an input array x.
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

public class LinearSearch {
	

	//returns the first index of a String inside of a String array	
	public static int getFirstIndex(String item, String[] x){
	
		int i = 0;
		
		
		while((i < x.length)){	
			
			if(item.equals(x[i])){
				
				return i;
			}
			i++;
		}
		
		return -1;
	}	
	
	

		
		

		
	
	//returns first index of item in the double array x
	public static int getFirstIndex(double item, double[] x){

		int i = 0;
	
		
		while(i < x.length){
			
			if(item ==(x[i])){
				return i;
			}
			
			i++;
			
		}
		
	return -1;
				
		
	}	
	



		
		
		
		
		
		
	
	
		

	
public static void main(String[] args){

	
	//section of code for String input
	if (args[0].equals("-s")){
		
		String[] x = new String[args.length - 3];
		String item = args[1];
	
		//loop to initialize x
	for (int i = 3, j = 0; i < args.length; i++, j++){
			x[j] = args[i];
		}
	
	
	int index = getFirstIndex(item, x);
	
	//if-else statement that prints the correct output
	if (index == -1){
		System.out.println(item + " not found in x");
	} else {
		System.out.println(item + " found in x at index " + index);
		}
	
	}	
		
	
	
	
	//section of code for double input
	else if (args[0].equals("-d")){
		
		double item = Double.parseDouble(args[1]);
		double[] x = new double [args.length - 3];
		
		//double to hold converted String
		double convert;
		
		//loop to initialize array x with double values converted from Strings
		for (int i = 3, j = 0; i < args.length; i++, j++){
			convert = Double.parseDouble(args[i]);
			x[j] = convert;
		}	
		
		
		int index = getFirstIndex(item, x);
		
		//if-else statement to print the correct output
		if (index == -1){
			System.out.println(item + " not found in x");
		} else {
		System.out.println(item + " found in x at index " + index);	
		}
		
	
	
	}


	
	
	
	
	
	
	
	
	}

}
