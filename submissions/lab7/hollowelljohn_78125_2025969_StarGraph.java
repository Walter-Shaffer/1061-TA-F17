import java.util.Scanner;

/** @formatter:off
* StarGraph.java
* @author John Hollowell
* Submission Date: 10-19-2017
*
* @purpose Calculate and graph a sin function given the starting value, an increment value,
* and the number of values to calculate.
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

public class StarGraph {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declare/Initialize variables
		int size;
		double min, increment;
		Scanner keyboard = new Scanner(System.in);

		//Get and error-check values from user
		System.out.print("Please enter the number of x values to process: ");
		size = keyboard.nextInt();
		if (size <= 0) exitWithMessage("The number of x values must be an integer greater than 0.");

		System.out.print("Enter a minimum value for x: ");
		min = keyboard.nextDouble();

		System.out.print("Enter the amount to increment x: ");
		increment = keyboard.nextDouble();
		if (size <= 0) exitWithMessage("The increment must be a decimal number greater than 0.");

		double[] x = new double[size];
		double[] y = new double[size];

		//Fill arrays with values
		for (int i = 0; i < size; i++) {
			x[i] = min + (i * increment);
			y[i] = 20.0 * Math.abs(Math.sin(x[i]));
		}
		
		//Output raw values
		System.out.println("Values:");
		for (int i = 0; i < size; i++) {
			System.out.printf("x: %.3f, y: %.3f\n", x[i], y[i]);
		}
		
		//Output graph of numbers
		System.out.println("Graph");
		for (int i = 0; i < size; i++) {
			System.out.println(":" + stringMultiply("*", (int) y[i]));
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
	 * passed in the int. e.g. stringMultiply("word",4) would return
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
		for (int i = 0; i < times; i++) {
			retStr += string;
		}
		return retStr;
	}

}
