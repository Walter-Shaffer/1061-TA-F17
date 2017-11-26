/*
* LinearSearch.java
* Author: Jacob Caldwell
* Submission Date: 11/17/2017
*
* Purpose: To search an array for a specified item using UNIX
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
	
	public static int getFirstIndex(double item, double[] x) {
		int firstIndex = -1;
		for (int i = 0; i < x.length; i++) {
			if (item == x[i]) {
				firstIndex = i - 3;
				i = x.length;
			}
		}
		return firstIndex;
	}
	
	public static int getFirstIndex(String item, String[] x) {
		int firstIndex = -1;
		for (int i = 3; i < x.length; i++) {
			if (item.equals(x[i])) {
				firstIndex = i - 3;
				i = x.length;
			}
		}
		return firstIndex;
	}
	
	public static void main(String[] args) {
		if (args[0].equals("-s")) {
			String item = args[1];
			if (args[2].equals("-x")) {
				int firstIndex = LinearSearch.getFirstIndex(item, args);
				if (firstIndex == -1) {
					System.out.println(item + "not found in x");
				}
				else {
					System.out.println(item + " found in x at index " + firstIndex);
				}
			}
			else {
				System.out.println("Error: please input a valid parameter");
			}
			System.exit(0);
		}
		
		if (args[0].equals("-d")) {
			double item = Double.parseDouble(args[1]);
			if (args[2].equals("-x")) {
				double[] dArgs = new double[args.length]; 
				for (int i = 3; i < args.length; i++) {
					dArgs[i] = Double.parseDouble(args[i]);
				}
				int firstIndex = LinearSearch.getFirstIndex(item, dArgs);
				if (firstIndex == -1) {
					System.out.println(item + "not found in x");
				}
				else {
					System.out.println(item + " found in x at index " + firstIndex);
				}
			}
			else {
				System.out.println("Error: please input a valid parameter");
			}
			System.exit(0);
		}
		
		else {
			System.out.println("Error: please input a valid parameter");
			System.exit(0);
		}
	}
	
}
