/*
 * ClassifyMessage.java
 * Author: John Xue
 * Submission Date: Sept. 28, 2017
 *
 * Purpose: Parse tweets in the "Tweak the Tweet" format
 * to classify short messages based on keywords
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

import java.util.Scanner;

enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}

public class ClassifyMessage {
	public static void main(String[] args) {
		// Declare various variables to parsing
		String catString, payload;
		double latitude, longitude;
		boolean isInRange;
		MessageCategory category;
		
		// Declare fixed boundaries for checking
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		
		// Input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next().trim();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine().trim();
		keyboard.close();
		
		// Check catString to categorize message type
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		} else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		} else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		} else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		} else {
			category = MessageCategory.UNKNOWN;
		}

		// Check if coordinates are within bounds
		if ((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <=east)) {
			isInRange = true;
		} else {
			isInRange = false;
		}

		// Print output	
		System.out.printf("Category:\t%s\n", category);
		System.out.printf("Raw Cat:\t%s\n", catString);
		System.out.printf("Message:\t%s\n", payload);
		System.out.printf("Latitude:\t%s\n", latitude);
		System.out.printf("Longitude:\t%s\n", longitude);
		System.out.printf("In Range:\t%b\n", isInRange);
	}
}
