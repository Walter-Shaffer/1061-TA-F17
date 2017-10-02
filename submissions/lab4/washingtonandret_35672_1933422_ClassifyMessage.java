/*
* ClassifyMessage.java
* Author: Andre Washington
* Submission Date: 9/28/17
*
* Purpose: To parse the message with if else statements and decision statements
*
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
				// TODO Auto-generated method stub
			
			Scanner keyboard = new Scanner(System.in);
				
			String catString;	// The raw text of the message's category
			String payload;		// The primary content of the message
			double latitude; 	// The latitude indicated in the message
			double longitude;	// The longitude indicated in the message
			boolean isInRange;	// A "flag" indicating whether the latitude and 
								// longitude values are within bounds
			MessageCategory category; 	// This message's category
			
			double south = 39.882343;	// southernmost latitude
			double north = 40.231315;	// northernmost latitude
			double west = -105.743511;	// westernmost longitude
			double east = -104.907864;	// easternmost longitude
			System.out.print("Please enter a formatted message: ");
			catString = keyboard.next();
			
			if (catString == "fire" || catString == "smoke"){
					category = MessageCategory.ALERT;}
				else if (catString == "need"){
					category = MessageCategory.NEED;}
				else if (catString == "offer"){
					category = MessageCategory.OFFER;}
				else if (catString.equalsIgnoreCase("strucuture") || catString.equalsIgnoreCase("road")|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")){
					category = MessageCategory.INFO;}
				else 
					category = MessageCategory.UNKNOWN;
			
			catString = catString.trim();	// Trim any leading or trailing white spaces
			latitude = keyboard.nextDouble();
			longitude = keyboard.nextDouble();
			payload	= keyboard.nextLine();
			payload = payload.trim();		// Trim any leading or trailing white spaces
			
			
			System.out.println("Category: \t\t " + category);
			System.out.println("Raw Cat: \t\t " + catString);
			System.out.println("Message: \t\t " + payload);
			System.out.println("Latitude: \t\t " + latitude);
			System.out.println("Longitude: \t\t " + longitude);
			
			
			
			if ((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east)) {
				isInRange = true;}
				else isInRange = false;
			
			System.out.println("In Range: \t\t " + isInRange);
				
			}
			
		
	}
