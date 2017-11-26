/*
* Person.java
* Author:  Alejandro Pardo
* Submission Date:  November 16
* Purpose:  this class uses linear search to locate the first index of an item in an input array x
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
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
		int index = -1;
		for (int i = 0; i < x.length; i++) {
			if (item == x[i] && (index == -1)) {

				index = i;
			}
		}
		return index;
	}

	public static int getFirstIndex(String item, String[] x) {
		int index = -1;
		for (int a = 0; a < x.length; a++) {
			if (item.equals(x[a]) && (index == -1)) {

				index = a;
			}
		}

		return index;

	}

	public static void main(String[] args) {
		String item = "";
		Double doubleitem = 0.0;
		String[] StringArray = new String[args.length - 3];
		double[] DoubleArray = new double[args.length - 3];

		if (args[0].equals("-s")) {
			item = args[1];

			for (int m = 3; m < args.length; m++) {

				StringArray[m - 3] = args[m];

			}

		}
		if (args[0].equals("-s")) {
			if (getFirstIndex(item, StringArray) != -1) {
				System.out.println(item + " found in x at index " + getFirstIndex(item, StringArray));
			} else {
				System.out.println(item + " not found in x");
			}
		}

		if (args[0].equals("-d")) {
			doubleitem = Double.parseDouble(args[1]);

			for (int c = 3; c < args.length; c++) {

				DoubleArray[c - 3] = Double.parseDouble(args[c]);

			}

		}
		if (args[0].equals("-d")) {
			if (getFirstIndex(doubleitem, DoubleArray) != -1) {
				System.out.println(doubleitem + " found in x at index " + getFirstIndex(doubleitem, DoubleArray));
			} else {
				System.out.println(doubleitem + " not found in x");

			}
		}

	}
}