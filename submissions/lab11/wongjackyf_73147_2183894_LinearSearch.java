/**
 * LinearSearch.java
 * Author: Jacky Wong
 * Submission Date: 11/16/2017
 * 
 * Purpose: Performs a linear search through an array given a string
 * or double to look for, via command line arguments.
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


public class LinearSearch {

	public static int getFirstIndex(double item, double[] x) {
		int indexAt = Integer.MAX_VALUE;		// If any reasonable index of x has item, this allows a valid comparison.
		for (int i = 0; i <= x.length - 1; i++) {		// Goes through each in x
			if ((x[i] == item) && (i < indexAt)) {		// Checks equality
				indexAt = i;
			}
			
		}
		if (indexAt == Integer.MAX_VALUE) {		// If nothing in x is found in item
			return -1;
		}
		else {		// If anything in x equals item
			return indexAt;
		}
	}
	
	public static int getFirstIndex(String item, String[] x) {
		int indexAt = Integer.MAX_VALUE;		// If any reasonable index of x has item, this allows a valid comparison.
		for (int j = 0; j <= x.length - 1; j++) {		// Goes through each in x
			if ((x[j].equals(item)) && (j < indexAt)) {		// Checks equality
				indexAt = j;
			}
		}
		if (indexAt == Integer.MAX_VALUE) {		// If nothing in x is found in item
			return -1;
		}
		else {		// If anything in x equals item
			return indexAt;
		}
	}
	
	public static void main(String[] args) {
		if (args[0].equals("-s")) {		// If user searches for a string
			String[] tempArray = new String[args.length - 3];		// -3 accounts for "-s [item] -x"
			for (int k = 0; k <= args.length - 4; k++) {		// Creates an array to allow a comparison between item
				tempArray[k] = args[k + 3];
			}
			if (getFirstIndex(args[1], tempArray) == -1) {		// If indexAt = -1; no item in x
				System.out.println(args[1] + " not found in x");
			}
			else {
				System.out.println(args[1] + " found in x at index " + getFirstIndex(args[1], tempArray));
			}
		}
		else if (args[0].equals("-d")) {		// If user searches for a double
			double[] tempArray = new double[args.length - 3];		// -3 accounts for "-d [item] -x"
			for (int m = 0; m <= args.length - 4; m++) {		// Creates an array to allow a comparison between item
				tempArray[m] = Double.valueOf(args[m +3]);
			}
			if (getFirstIndex(Double.valueOf(args[1]), tempArray) == -1) {		// If indexAt = -1; no item in x
				System.out.println(args[1] + " not found in x");
			}
			else {
				System.out.println(args[1] + " found in x at index " + getFirstIndex(Double.valueOf(args[1]), tempArray));
			}
		}
	}
}
