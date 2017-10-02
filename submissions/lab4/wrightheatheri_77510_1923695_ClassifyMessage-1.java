/*
* ClassifyMessage.java
* Author: Heather Wright
* Submission Date: September 28, 2017
*
* Purpose: This program receives input from the user in the form
*  of a tweet. These tweets are then classifies based on keywords
* in their text. It sorts the messages using an if statement by
* keywords or phrases in the tweets and assigning them to Unknown
* if none of the keywords match. The last section checks if the 
* longitude and latitude are within the boundaries of isInRange.
* Lastly, the program out puts the results in an orderly fashion.
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
	
	public static final double south = 39.882343;
	public static final double north = 40.231315;
	public static final double west = -105.743511;
	public static final double east = -104.907864;
	
	public static void main(String[] args) {
		
		String catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		keyboard.close();
		
		catString = catString.trim();
		payload = payload.trim();
		
		if(catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		}
			else if(catString.equalsIgnoreCase("need")) {
				category = MessageCategory.NEED;
			}
			else if(catString.equalsIgnoreCase("offer")) {
				category = MessageCategory.OFFER;
			}
			else if(catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road")
					|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
				category = MessageCategory.INFO;
			}
			else {
				category = MessageCategory.UNKNOWN;
			}
		if((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east)) {
			isInRange = true;
		}
			else {
				isInRange = false;
			}
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t\t" + catString);
		System.out.println("Message:\t\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
	
	}
}
