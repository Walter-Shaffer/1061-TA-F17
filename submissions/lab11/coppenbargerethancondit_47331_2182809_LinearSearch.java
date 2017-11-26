/**
* LinearSearch.java
* Author: Ethan Coppenbarger
* Submission Date: 11/14/2017
*
* Purpose: Search an input array for a string or double matching an argument
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

	public static void main(String[] args) {
		int pos;																// the position of the object if found
		int inputStartPos = 3;													// where the array is read from the arguments, defaults to position 3
		for(int i = 0; i < args.length; i++) {
			if(args[i].equals("-x")) {
				inputStartPos = i + 1;
			}
		}
		
		if(args[0].equals("-d")) {
			double toFind = Double.parseDouble(args[1]);						// get the value to search for as a double
			double[] x = new double[args.length - inputStartPos];				// make the array to search through
			for(int f = 0, g = inputStartPos; f < x.length; f++, g++) {			// fill the array to search through
				x[f] = Double.parseDouble(args[g]);
			}
			pos = getFirstIndex(toFind, x);										// call a function to get the position of x
			// print results
			System.out.print("java LinearSearch ");								
			for (int i = 0; i < args.length; i++) {
		         if (i > 0) {
		            System.out.print(" ");
		         }
		         System.out.print(args[i]);
		      }
			if(pos == -1) {
				System.out.println("\n" + toFind + " not found in x");
			} else {
				System.out.println("\n" + toFind + " found in x at index " + pos);
			}
		} else if(args[0].equals("-s")) {
			String toFind = args[1];											// get the value to search for as a string
			String[] x = new String[args.length - inputStartPos];				// make the array to search through
			for(int f = 0, g = inputStartPos; f < x.length; f++, g++) {			// fill the array to search through
				x[f] = args[g];
			}
			pos = getFirstIndex(toFind, x);										// call a function to get the position of x
			// print results
			System.out.print("java LinearSearch ");
			for (int i = 0; i < args.length; i++) {
		         if (i > 0) {
		            System.out.print(" ");
		         }
		         System.out.print(args[i]);
		      }
			if(pos == -1) {
				System.out.println("\n" + toFind + " not found in x");
			} else {
				System.out.println("\n" + toFind + " found in x at index " + pos);
			}
		}



	}

	public static int getFirstIndex(double item, double[] x) {					// get the first position where item appears in array x
		for(int i = 0; i < x.length; i++) {
			if(x[i] == item) {
				return i;
				}
		}
		return -1;																// return -1 if item not in x
	}
	public static int getFirstIndex(String item, String[] x) {					// get the first position where item appears in array x
		for(int i = 0; i < x.length; i++) {
			if(x[i].equals(item)) {
				return i;
				}
		}
		return -1;																// return -1 if item not in x
	}


}
