/*
* ClassifyMessage.java
* Author: Andrew Padgett
* Submission Date: [9/26/17]
*
* Purpose: parse tweet for specific info and print those chunks of info
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

import java.util.Scanner;					//import scanner

public class ClassifyMessage {
	
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN};			//declare enum variables
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);				//create scanner "keyboard"
		
		String catString;			//the raw text of the message's category
		String payload;				//the primary content of the message
		double latitude;			//the latitude indicated in the message
		double longitude;			//the longitude indicated in the message
		boolean isInRange;			//a "flag" indicating whether the latitude and longitude values are within bounds
		
		double south = 39.882343;	//southernmost latitude
		double north = 40.231315;	//northernmost latitude
		double west = -105.734511;	//westernmost longitude
		double east = -104.907864;	//easternmost longitude
		
		System.out.println("Please enter a formatted message:");		//prompt input
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		keyboard.close();
		
		if (catString.equalsIgnoreCase ("fire") || catString.equalsIgnoreCase("smoke")){		//if-else statement determines category
			MessageCategory category = MessageCategory.ALERT;
			System.out.println("Category:\t" + category);
		}
		else if (catString.equalsIgnoreCase("need")){
			MessageCategory category = MessageCategory.NEED;
			System.out.println("Category:\t" + category);
		}
		else if (catString.equalsIgnoreCase("offer")){
			MessageCategory category = MessageCategory.OFFER;
			System.out.println("Category:\t" + category);
		}
		else if (catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("structure") ||
				catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")){
			MessageCategory category = MessageCategory.INFO;
			System.out.println("Category:\t" + category);
		}
		else{
			MessageCategory category = MessageCategory.UNKNOWN;
			System.out.println("Category:\t" + category);
		}
		
		
		if (latitude >= south && latitude <= north && longitude >= west && longitude <= east){		//if-else statement determines if location is within boundaries
			isInRange = true;
		}
		else{
			isInRange = false;
		}
		
		payload = payload.trim();		//trim payload string
		
		System.out.println("Raw Cat:\t" + catString);		//print output
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		
	}

}
