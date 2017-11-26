
/** @formatter:off
* LinearSearch.java
* Author: John Hollowell
* Submission Date: 11/16/2017
*
* Purpose: Use command line arguments to search in a list for a specific provided element.
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
* @formatter:on
*/

public class LinearSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int listStart = 3; // The list of values starts with the fourth argument

		int index;

		switch(args[0]) {
			case "-d":
				double searchD = Double.parseDouble(args[1]);

				// Create array, and add arguments to it
				double[] xD = new double[args.length - listStart];
				for (int i = listStart; i < args.length; i++) {
					xD[i - listStart] = Double.parseDouble(args[i]);
				}

				index = getFirstIndex(searchD, xD);
				// If item was found
				if (index >= 0) {
					exitWithMessage(searchD + " found in x at index " + index);
				}
				else {
					exitWithMessage(searchD + " not found in x");
				}
				break;


			case "-s":
				String searchS = args[1];

				// Create array, and add arguments to it
				String[] xS = new String[args.length - listStart];
				for (int i = listStart; i < args.length; i++) {
					xS[i - listStart] = args[i];
				}

				index = getFirstIndex(searchS, xS);
				// If item was found
				if (index >= 0) {
					exitWithMessage(String.format("%s found in x at index %d", searchS, index));
				}
				else {
					exitWithMessage(String.format("%s not found in x", searchS));
				}
				break;
		}


	}

	/**
	 * @param item
	 *            element to find in the array
	 * @param x
	 *            array in which to find [item]
	 * @return the index of [item] in [x]. returns -1 if not found
	 */
	public static int getFirstIndex(double item, double[] x) {

		for (int i = 0; i < x.length; i++) {
			if (item == x[i]) return i;
		}
		return -1;
	}

	/**
	 * @param item
	 *            element to find in the array
	 * @param x
	 *            array in which to find [item]
	 * @return the index of [item] in [x]. returns -1 if not found
	 */
	public static int getFirstIndex(String item, String[] x) {

		for (int i = 0; i < x.length; i++) {
			if (item.equals(x[i])) return i;
		}
		return -1;
	}

	/**
	 * This method displays an exit message and exits the JVM, using the optional
	 * exit code if provided.
	 * 
	 * @param message
	 *            The message sent to System.out
	 * @param code
	 *            Optional exit code. When omitted, sends exit code of 0
	 */
	public static void exitWithMessage(String message, int... code) {

		System.out.println(message);
		System.exit(code.length > 0 ? code[0] : 0);
	}
}
