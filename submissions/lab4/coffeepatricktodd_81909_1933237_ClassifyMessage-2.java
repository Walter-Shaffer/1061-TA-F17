/*
* ClassifyMessage.java
* Author: Patrick Coffee
* Submission Date: 9/29/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* It accepts messages and parses the text of a user specified message, identifies the
* category of the message, and assigns this value to a variable.
* 
* 
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
	enum MessageCategory{ 
		NEED, OFFER, ALERT, INFO, UNKNOWN;

		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.out.println("Please enter a formatted message: ");	

	double longitude;
	double latitude;
	String catString = new String("");
	String payload = new String("payload");
	boolean isInRange;
	MessageCategory category;
	
		double SOUTH = 39.882343; //Declare double variables SOUTH, NORTH, WEST, EAST.
		double NORTH = 40.231315;
		double WEST = -105.743511;
		double EAST = -104.907864;
	
	
	Scanner keyboard = new Scanner(System.in);
	catString = keyboard.next();
	latitude = keyboard.nextDouble();
	longitude = keyboard.nextDouble();
	payload = keyboard.nextLine();
			payload.trim();
			catString.trim();
	
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")){		//Creating an if else loop
			category = MessageCategory.ALERT;
		} else if (catString.equalsIgnoreCase("need")){
			category = MessageCategory.NEED;
		} else if (catString.equalsIgnoreCase("offer")){
			category = MessageCategory.OFFER;
		} else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")){
			category = MessageCategory.INFO;
		} else 
			category = MessageCategory.UNKNOWN;
		{
			
			if (latitude >= SOUTH && latitude <= NORTH && 
					longitude >= WEST && longitude <= EAST)
				isInRange = true;
			else 
				isInRange = false;
			}
		
	System.out.println("Category:\t " + category);
	System.out.println("Raw Cat:\t " + catString);
	System.out.println("Message:\t" + payload);
	System.out.println("Latitude:\t " + latitude);
	System.out.println("Longitude:\t " + longitude);
	System.out.println("In Range:\t " + isInRange);
		}
		
}

