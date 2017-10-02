import java.util.Scanner;

/** @formatter:off
* ClassifyMessage.java
* @author John Hollowell
* Submission Date: 9/26/2017
*
* @purpose Take a formatted string and convert it to different data types and
* use if statements to validate that a location is in the specified range.
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

public class ClassifyMessage {

	enum MessageCategory {
		NEED, OFFER, ALERT, INFO, UNKNOWN
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declare Variables
		String catString, payload;
		double latitude, longitude;
		boolean isInRange = false;
		MessageCategory category;

		// Declare Constants
		final double north = 40.231315;
		final double south = 39.882343;
		final double west = -105.743511;
		final double east = -104.907864;

		// Get User Input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message: ");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine().trim();
		keyboard.close();

		// Convert catString into category enum values
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke"))
			category = MessageCategory.ALERT;
		else if (catString.equalsIgnoreCase("need"))
			category = MessageCategory.NEED;
		else if (catString.equalsIgnoreCase("offer"))
			category = MessageCategory.OFFER;
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac"))
			category = MessageCategory.INFO;
		else
			category = MessageCategory.UNKNOWN;

		// set isInRange of location isInRegion
		if (latitude >= south && latitude <= north) {
			if (longitude >= west && longitude <= east) {
				isInRange = true;
			}
		}

		// Output
		System.out.printf("Category:\t%s\n", category);
		System.out.printf("Raw Cat:\t%s\n", catString);
		System.out.printf("Message:\t%s\n", payload);
		System.out.printf("Latitude:\t%f\n", latitude);
		System.out.printf("Longitude:\t%f\n", longitude);
		System.out.printf("In Range:\t%b\n", isInRange);

	}

}
