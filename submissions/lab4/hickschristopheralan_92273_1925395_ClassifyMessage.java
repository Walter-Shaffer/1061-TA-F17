/*
 * ParseTheTweet.java
 * Author: Christopher Hicks
 * Submission Date 9/26/17
 * 
 * Purpose: Learn how to use enumerations and if-else statements.
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
	
	//Step 1 Import scanner
	import java.util.Scanner;
		
	public class ClassifyMessage {
	
	// Step 2 declare enumeration 
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	public static void main(String[] args) {
		
		
		// Step 3 SCANNER CLASS
		Scanner keyboard = new Scanner(System.in);
		
		// Step 4 Declare variables
		String catString;  // The raw text of the message's category
		String payload;    // the primary content of the message
		double latitude;   // the latitude indicated in the message
		double longitude;  // the longitude indicated in the message
		boolean isInRange; // A "flag" indicating whether the latitude and long values are within bounds
		MessageCategory  category;  // the message's category
		
		// Step 5 Additional values for boolean
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		
		// Step 6 Ask for user input
		System.out.println("Pleas enter a formatted message:");
		
		// Step 7 Use scanner to grab input 
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		
		// Step 8 Trim string
		payload = payload.trim();
		catString = catString.trim();
		
		// Step 9 if else statement
		if (catString.equalsIgnoreCase( "fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT; 
		
		}	else if (catString.equalsIgnoreCase("need")){
			category = MessageCategory.NEED;

		}	else if (catString.equalsIgnoreCase ("offer")){
			category = MessageCategory.OFFER;

		}	else if (catString.equalsIgnoreCase ("structure") && catString.equalsIgnoreCase("road")&& catString.equalsIgnoreCase ("photo") && catString.equalsIgnoreCase ("evac")){
		 	category = MessageCategory.INFO;	
		 	
		}	else {
			category = MessageCategory.UNKNOWN;	
		}
		// Step 10 isInRange
		if ((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east)){
			isInRange = true;	
			
		}	else {
			isInRange = false;
		}
		
		// Step 11 Print Output
			System.out.print("Category:\t" + category);
			System.out.print("\nRaw Cat:\t" + catString);
			System.out.print("\nMessage:\t" + payload);
			System.out.print("\nLatitude:\t" + latitude);
			System.out.print("\nLongitude:\t" + longitude);
			System.out.print("\nIn Range:\t" + isInRange);
			
	}

}