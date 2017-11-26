/*
 * LinearSearch.java
 * Author: John Xue
 * Submission Date: Nov. 16, 2017
 *
 * Purpose: Search in an array for the first occurence of a specified
 * term
 *
 * Statement of Academic Honesty:
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized assistance
 * or plagiarism will be handled in accordance with the policies at
 * Clemson University and the policies of this course. I recognize that my
 * work is based on an assignment created by the School of Computing at
 * Clemson University. Any publishing or posting of source code
 * for this project is strictly prohibited unless you have written
 * consent from the instructor.
 */

import java.lang.Double;

public class LinearSearch {
	// Returns index number of double array x that matchs double item, else returns -1
	public static int getFirstIndex(double item, double[] x) {
		Double test = new Double(item);
		for (int i = 0; i < x.length; i++) {
			if (test.equals(x[i])) {
				return i;
			}
		}
		return -1;
	}
	
	// Returns index number of String array x that matchs String item, else returns -1
	public static int getFirstIndex(String item, String[] x) {
		for (int i = 0; i < x.length; i++) {
			if (item.equals(x[i])) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int y;
		// Init diff variable types for different args
		if (args[0].equals("-s")) {
			String item = args[1];
			String[] x = new String[args.length-3];
			for (int i = 3; i < args.length; i++) {
				x[i-3] = args[i];
			}
			y = getFirstIndex(item, x);
		} else if (args[0].equals("-d")) {
			double item = Double.parseDouble(args[1]);
			double[] x = new double[args.length-3];
			for (int i = 3; i < args.length; i++) {
				x[i-3] = Double.parseDouble(args[i]);
			}
			y = getFirstIndex(item, x);
		} else {
			y = -1;
		}
		// Outputs with various cases depending on string or double type
		if (y != -1) {
			if (args[0].equals("-s")) {
				System.out.printf("%s found in x at index %d\n", args[1], y);
			} else {
				if (args[1].indexOf('.') != -1 && args[1].charAt(args[1].length()-1) != '0') {
					System.out.printf("%s found in x at index %d\n", args[1], y);
				} else {
					System.out.printf("%.1f found in x at index %d\n", Double.parseDouble(args[1]), y);
				}
			}
		} else {
			if (args[0].equals("-s")) {
				System.out.printf("%s not found in x\n", args[1]);
			} else {
				if (args[1].indexOf('.') != -1 && args[1].charAt(args[1].length()-1) != '0') {
					System.out.printf("%s not found in x\n", args[1]);
				} else {
					System.out.printf("%.1f not found in x\n", Double.parseDouble(args[1]));
				}
			}
		}
	}
}
