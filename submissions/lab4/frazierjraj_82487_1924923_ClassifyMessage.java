/*
* [ParseTheTweet].java
* Author: [Anthony Frazier]
* Submission Date: [9/29/17]
*
* Purpose: This program parses messages and displays the categorized output.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagarism will be handled in accordance
* with the policies at Clemson University and the
* policies of this course. I recognize that my work is based
* on an assignment created by the School of Computing
* at Clemson University. Any publishing or posting
* of source code for this project is strictly prohibited
* unless you have written consent from the instructor.
*/

import java.util.Scanner;
public class ClassifyMessage {
	//The below line sets up an enumerator with the categories of need, offer, alert, info, and unknown
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKOWN}
	public static void main(String[] args) {
		//this calls the scanner so that I can accept user input
		Scanner keyboard = new Scanner(System.in);
		
		//here I am declaring my variables for later use
		String catString;
		String payload;
		
		double latitude;
		double longitude;
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		
		boolean isInRange;
		
		//This is declaring the value of category to be one of the values in the enumerator
		MessageCategory category;
		
		//this is accepting input for the variables of catString, latitude, longitude, and payload
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		
		keyboard.close();
		
		//This is eliminating any potential white space on the variables catString and payload
		catString = catString.trim();
		payload = payload.trim();
		
		/*
		 * The below conditional statement is checking the value of catstring to see if it matches
		 * any of the categories in the enumerator. If it does it assigns the category the corresponding
		 * value and then prints it out
		 */
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")){
			category = MessageCategory.ALERT;
			System.out.println("Category:\t" + category);
		}
		else if(catString.equalsIgnoreCase("need")){
			category = MessageCategory.NEED;
			System.out.println("Category:\t" + category);
		}
		else if(catString.equalsIgnoreCase("offer")){
			category = MessageCategory.OFFER;
			System.out.println("Category:\t" + category);
		}
		else if(catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")){
			category = MessageCategory.INFO;
			System.out.println("Category:\t" + category);
		}
		else {
			category = MessageCategory.UNKOWN;
			System.out.println("Category:\t" + category);
		}
		
		/*
		 * The conditional statement below checks the value of latitude and longitude to make sure
		 * it is in the acceptable range and if it is the boolean isInRange is set to true
		 */
		if (latitude >= south && latitude <= north && longitude >= west && longitude <= east){
			isInRange = true;
		}
		else {
			isInRange = false;
		}

		//This section prints out the various values that the program has processed
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		}
	}


