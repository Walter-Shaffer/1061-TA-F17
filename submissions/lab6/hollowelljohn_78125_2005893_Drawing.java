import java.util.Scanner;

/** @formatter:off
* Drawing.java
* @author John Hollowell
* Submission Date: 10/10/2017
*
* @purpose Display right triangles (upright and inverted) with side lengths
* of the given length. this is two triangles are repeated the number of times
* input by the user.
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

public class Drawing {

	/**
	 * @param args
	 *
	 */
	public static void main(String[] args) {

		// Initialize scanner object
		Scanner keyboard = new Scanner(System.in);
		int sideLength, iterations;

		// Get side length
		System.out.print("Indicate the number of stars (>1): ");
		sideLength = keyboard.nextInt();

		// Validate input
		if (sideLength <= 1) {
			keyboard.close();
			exitWithMessage("Invalid Input");
		}

		// Get number of iterations
		System.out.print("How many times do you want to repeat the figure? ");
		iterations = keyboard.nextInt();

		// Validate input
		if (iterations < 1) exitWithMessage("Invalid Input");

		for (int i = 0; i < iterations; i++) {

			// Top triangle
			for (int l = 0; l < sideLength; l++) {
				System.out.println(stringMultiply("*", sideLength - l));
			}

			// bottom triangle
			for (int l = (sideLength - 1); l >= 0; l--) {
				System.out.println(stringMultiply("*", sideLength - l));
			}
		}
		keyboard.close();

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

	/**
	 * This method concatenates the passes String with itself the number of times
	 * passed in the int. e.g. stringMultipy("word",4) would return
	 * "wordwordwordword"
	 * 
	 * @param string
	 *            the input string
	 * @param times
	 *            the number of times to concat the string
	 * @return [string] concatenated with itself [times] times
	 */
	public static String stringMultiply(String string, int times) {
		String retStr = "";
		for (int i=0;i<times;i++) {
			retStr += string;
		}
		return retStr;
	}

}
