import java.util.Scanner;

/*
* ClassifyMessage.java
* Author: Kyle Lamoureux
* Submission Date: 9/29/17
*
* Purpose: To parse various tweets for information.
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

public class ClassifyMessage {

	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		// Variables
		
		String catString;	//The raw text of the message's category
		String payload;		// The primary content of the message
		Double latitude;	// The latitude indicated in the message
		Double longitude;	// The longitude indicated in the message
		Boolean isInRange;	// A “flag” indicating whether the latitude and longitude values are within bounds
		MessageCategory Category; // The message's category
		
		// Geographic Boundaries
		
		Double south = 39.882343; 	//southernmost latitude
		Double north = 40.231315; 	//northernmost latitude
		Double west = -105.743511; 	//westernmost longitude
		Double east = -104.907864;	//easternmost longitude
		
		//UI
		
		System.out.println("Please enter a formatted message:");
		
		//Parsing User Input
		
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		
		catString = catString.trim();
		catString = catString.toLowerCase();
		payload = payload.trim();
		
		// Determine Message Category
		
		if (catString.equals("fire") || catString.equals("smoke"))
		
			Category = MessageCategory.ALERT;
			
		else if (catString.equals("need"))
			
			Category = MessageCategory.NEED;
		
		else if (catString.equals("offer"))
			
			Category = MessageCategory.OFFER;
		
		else if (catString.equals("structure") || catString.equals("road") || catString.equals("photo") || catString.equals("evac"))
			
			Category = MessageCategory.INFO;
		
		else{
			
			Category = MessageCategory.UNKNOWN;
			};
			
		// Evaluate Latitude & Longitude
		
			
		if (latitude >= south && latitude <= north && longitude >= west && longitude <= east)
			
			isInRange = true;
			
		else
			
			isInRange = false;
		
		// Results
		
		System.out.println("Category: \t" + Category);
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message: \t" + payload);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		System.out.println("In Range: \t" + isInRange);
		
		keyboard.close();
		
		
		
		
		}
			
	}