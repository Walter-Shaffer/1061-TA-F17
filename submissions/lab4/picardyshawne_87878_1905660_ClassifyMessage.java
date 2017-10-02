/*
* ClassifyMessage.java
* Author: Shawn Picardy	
* Submission Date: 9/25/17
*
* Purpose: This program uses enumerations and if-else statements to classify short messages
* using keywords within the message. It can be used to sort tweets into 
* categories that could be used by local officials for reactionary/emergency purposes.
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
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}	
	public static void main(String[] args) {
		
		// Create Scanner Object
		Scanner keyboard = new Scanner(System.in);
		
		// Initialize variables
		String catString, payload;
		double latitude, longitude;
		boolean isInRange;
		MessageCategory category;		
		
		double south = 39.882343;  // southernmost latitude
		double north = 40.231315;  // northernmost latitude
		double west = -105.743511; // westernmost longitude
		double east = -104.907864; // easternmost longitude
		
		// Prompt user for formatted input
		System.out.print("Please enter a formatted message:\n");
		catString = keyboard.next();
		catString = catString.trim(); // might be unnecessary to use .trim()
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		payload = payload.trim();	
		
		keyboard.close(); // close Scanner
		
		// determine message categories
		if(catString.equalsIgnoreCase("fire"))
			category = MessageCategory.ALERT;
		else if(catString.equalsIgnoreCase("smoke"))
			category = MessageCategory.ALERT;
		else if(catString.equalsIgnoreCase("need"))
			category = MessageCategory.NEED;
		else if(catString.equalsIgnoreCase("offer"))
			category = MessageCategory.OFFER;
		else if(catString.equalsIgnoreCase("structure"))
			category = MessageCategory.INFO;
		else if(catString.equalsIgnoreCase("road"))
			category = MessageCategory.INFO;
		else if(catString.equalsIgnoreCase("photo"))
			category = MessageCategory.INFO;
		else if(catString.equalsIgnoreCase("evac"))
			category = MessageCategory.INFO;
		else category = MessageCategory.UNKNOWN;
		
		
		// Assess the geographic boundaries using an if-else statement
		if(latitude >= south && latitude <= north && longitude >= west && longitude <= east) 
			isInRange = true;	
		else isInRange = false;
		
		// Display formatted output
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		

	}

}
