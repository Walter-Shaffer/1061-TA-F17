/*
* Classifymessage.java
* Author: Ethan Coppenbarger
* Submission Date: 9/--/2017
*
* Purpose: Classify a message based on certain types.
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
		// variables
		Scanner keyboard = new Scanner(System.in);
		String catString, payload;
		double latitude, longitude, south = 39.882343, north = 40.231315, west = -105.743511, east = -104.907864;
		boolean isInRange;
		MessageCategory category;
		
		// take and format user input
		System.out.print("Please enter a formatted message: ");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		payload = payload.trim();
		catString = catString.trim();
		//System.out.print(catString + "\n" + String.valueOf(latitude) + "\n" +  String.valueOf(longitude) + "\n" +  payload); // test variables 
		
		// assign category
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		} else if (catString.equalsIgnoreCase("need")){
			category = MessageCategory.NEED;
		} else if (catString.equalsIgnoreCase("offer")){
			category = MessageCategory.OFFER;
		} else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")){
			category = MessageCategory.INFO;
		} else {
			category = MessageCategory.UNKNOWN;
		}
		
		// check whether lat and long are in range 
		if (latitude >= south && latitude <= north && longitude >= west && longitude <= east) {
			isInRange = true;
		} else {
			isInRange = false;
		}
		
		// output
		System.out.println("Category: \t" + category);
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message: \t" + payload);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		System.out.println("In Range: \t" + isInRange);
			

	}

}
