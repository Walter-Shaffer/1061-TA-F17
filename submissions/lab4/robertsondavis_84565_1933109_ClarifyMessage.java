/*
 * ClarifyMessage.java
 * Author: Davis Robertson
 * Submission Date: 
 * 
 * Purpose: To be able to use enumerations and boolean
 * 			values in order to categorize tweets
 * 
 * Statement of Academic Honesty:
 * 
 *  The following code represents my own work. I have neither
 *  received nor given inappropriate assistance. I have not copied
 *  or modified code from any source other than the course webpage
 *  or the course textbook. I recognize that any unauthorized
 *  assistance or plagiarism will be handled in accordance
 *  with the policies at Clemson University and the
 *  policies of this course. I recognize that my work is based
 *  on an assignment created by the School of Computing
 *  at Clemson University. Any publishing or posting
 *  of source code for this project is strictly prohibited
 *  unless you have written consent from the instructor.
 */
import java.util.Scanner;
public class ClarifyMessage {
	
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKOWN}
	
	public static void main(String[] args) {
	Scanner keyboard = new Scanner (System.in);
	
	String catString; // The raw text of the message's categoy
	String payload; // The primary content of the message
	double latitude; // The latitude indicated in the message
	double longitude; // the longitude indicated in the message
	boolean isInRange; // A flag indicating whether latitude and
					   // longitude values are within bounds
	
	MessageCategory category;
	
	double south = 39.882343;
	double north = 40.231315;
	double west = -105.743511;
	double east = -104.907864;
	
	System.out.print("Please enter a formatted message:");
	
	catString = keyboard.next();
	catString = catString.trim();
	latitude = keyboard.nextDouble();
	longitude = keyboard.nextDouble();
	payload = keyboard.nextLine();
	payload = payload.trim();
	
	if (catString.equalsIgnoreCase("fire") == true || catString.equalsIgnoreCase("smoke") == true ) {
		category = MessageCategory.ALERT;
	} else if  (catString.equalsIgnoreCase("need") == true) {
		category = MessageCategory.NEED;
	} else if  (catString.equalsIgnoreCase("offer") == true) {
		category = MessageCategory.OFFER;
	} else if  (catString.equalsIgnoreCase("structure") == true || catString.equalsIgnoreCase("road") == true || catString.equalsIgnoreCase("photo") == true || catString.equalsIgnoreCase("evac") == true) {
		category = MessageCategory.INFO;
		
	}	else { category = MessageCategory.UNKOWN;
	
	}
	
	if ( (latitude>= south) & (latitude <=north) & (longitude >= west) & (longitude <+east)) {
	isInRange = true;
	
	} else { isInRange = false;
	
	System.out.println("Category:\t" + category);
	System.out.println("Raw Cat:\t" + catString);
	System.out.println("Message:\t" + payload);
	System.out.println("Latitude:\t" + latitude);
	System.out.println("Longitude:\t" + longitude);
	System.out.println("In Range: \t" + isInRange);
	}
	}
	
}  
