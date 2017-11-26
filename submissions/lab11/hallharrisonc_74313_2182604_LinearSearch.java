/*
* LinearSearch.java
* Author: Harrison C Hall
* Submission Date: October 31, 2017
*
* Purpose: Program searches for items linearly through 1D arrays via
* command line and returns position or -1 for not found.  
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

import java.lang.*;

public class LinearSearch {

	public static void main(String[] args) {
		if (args[0].equals("-s")){ //parseing for strings
		    String xstring = args[1]; //finds the string to search for
		    String[] args2 = new String[args.length-3]; //creates new string array with new strings without the first 3
			for (int i = 0; i<args2.length; i++){
				args2[i] = args[i+3];
			}
			
			if (getFirstIndex(xstring, args2) == -1) { //implements method to check
				System.out.println(xstring + " not found in x");
			} else {
				System.out.println(xstring + " found in x at index " + (getFirstIndex(xstring, args2)));
			}
			
		} else if (args[0].equals("-d")){ //parseing for doubles
		    double xdouble = Double.parseDouble(args[1]); //finds double to parse
		    double[] args2 = new double[args.length];
			args2[0] = 0;
			args2[1] = 0;
			args2[2] = 0;
			for (int i = 3; i<args2.length; i++){ //parses for doubles and saves to array
				args2[i] = Double.parseDouble(args[i]);
			}
			
			if (getFirstIndex(xdouble, args2) == -1) { //implements method to check
				System.out.println(xdouble + " not found in x");
			} else {
				System.out.println(xdouble + " found in x at index " + (getFirstIndex(xdouble, args2)));
			}
			
		} else { // just in case nothing works
			System.out.println("Wrong. False. Bad. Try again.");
		}
		

	}
	
	public static int getFirstIndex(double item, double[] x){
		for (int i = 3; i < x.length; i++){
			if (x[i] == item){
				return i - 3;
			}
		}
		return -1;
	}
	
	public static int getFirstIndex(String item, String[] x){
		for (int i = 0; i < x.length; i++){
			if (x[i].equals(item)){
				return i;
			}
		}
		return -1;
	}

}