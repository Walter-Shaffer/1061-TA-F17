/*
 * ClassifyMessage.java
 * Author: Mitchell Lamb
 * - - - - -Submission Date: 9/19/2017
 * 
 * Purpose: The purpose of this program is to parse the text of a user specified message,
 * identify the category of the message, and assign the value to a variable declared to
 * be of type MessageCategory, as well as identify the latitude and longitude specified
 * in the message and determine whether they are within ranges defined elsewhere in the program.
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

import java.util.Scanner;

public class ClassifyMessage {
	
	enum MessageCategory{NEED, OFFER, ALERT, INFO, UNKNOWN}

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String catString; // Raw text of message's category
		String payload; // Primary content of message
		double latitude; // Latitude indicated in message
		double longitude; // Longitude indicated in message
		boolean isInRange; // "Flag" indicating whether latitude and longitude values are within bounds
		MessageCategory category; // Message's category
		double south = 39.882343; // southernmost latitude
		double north = 40.231315; // northernmost latitude
		double west = -105.743511; // westernmost longitude
		double east = -104.907864; // easternmost longitude
		System.out.print("Please enter a formatted message: \n");
		
		// Storing user input
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		payload = payload.trim();
		catString = catString.trim();
		
		// Categorizing catString
		if (catString.equals("fire") || catString.equals("smoke")) {
			category = MessageCategory.ALERT;
		} else if (catString.equals("need")) {
			category = MessageCategory.NEED;
		} else if (catString.equals("offer")) {
			category = MessageCategory.OFFER;
		} else if (catString.equals("structure") || catString.equals("road") || 
				catString.equals("photo") || catString.equals("evac")) {
			category = MessageCategory.INFO;
		} else {
			category = MessageCategory.UNKNOWN;
		}
		
		// Categorizing location
		if ((latitude >= south) && (latitude <= north)) {
			if ((longitude >= west) && (longitude <= east)) {
				isInRange = true;
			} else {
				isInRange = false;
			}
		} else {
			isInRange = false;
		}
		
		// Printing
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		}
	
	}


