/*
* ClassifyMessage.java
* Author: David McDonough
* Submission Date: 9/28/17
*
* Purpose: uses an enumeration to determine the category of user inputed data. 
* Then outputs the specific category, the specific word the user inputed, and
* a the user inputed message at the end of the line. Also outputs user inputed
* latitude and longitude and determines if it is in a specific range.
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
* unless you have written consent*/

import java.util.Scanner;

public class ClassifyMessage {

	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String catString; //the raw text of the message's category
		String payload; //the primary content of the message
		double latitude; //the latitude indicated in the message
		double longitude; //the longitude indicated in the message
		boolean isInRange; //A "flag" indicating whether the latitude
						   //or longitude values are within bounds
		MessageCategory category; //the message's category
		double south = 39.882343; //southernmost latitude
		double north = 40.231315; //northernmost latitude
		double west = -105.743511; //westernmost longitude
		double east = -104.907864; //easternmost longitude
		
		//user inputs a message
		System.out.println("Please enter a formatted message: ");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		
		//determines which category the message is. Then outputs the
		//the raw text of the message's category and the primary content
		//of the message
		if (catString.equals("fire") || catString.equals("smoke"))
		{
			category = MessageCategory.ALERT;
			System.out.println("Category:\t " + category);
			System.out.println("Raw Cat:\t " + catString);
			System.out.println("Message:\t" + payload);
		}
		else if (catString.equals("need"))
		{
			category = MessageCategory.NEED;
			System.out.println("Category:\t " + category);
			System.out.println("Raw Cat:\t " + catString);
			System.out.println("Message:\t" + payload);
		}
		else if(catString.equals("offer"))
		{
			category = MessageCategory.OFFER;
			System.out.println("Category:\t " + category);
			System.out.println("Raw Cat:\t " + catString);
			System.out.println("Message:\t" + payload);
		}
		else if(catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac"))
		{
			category = MessageCategory.INFO;
			System.out.println("Category:\t " + category);
			System.out.println("Raw Cat:\t " + catString);
			System.out.println("Message:\t" + payload);
		}
		else
		{ 
			category = MessageCategory.UNKNOWN;
			System.out.println("Category:\t " + category);
			System.out.println("Raw Cat:\t " + catString);
			System.out.println("Message:\t" + payload);
		}
		
		//prints out user inputed latitude and longitude
		System.out.println("Latitude:\t " + latitude);
		System.out.println("Longitude:\t " + longitude);
		
		//determines if the user inputed latitude and longitude or within
		//the bounds of the hard coded latitude and longitude 
		if (latitude >= south && latitude <= north && longitude >= west && longitude <= east)
		{
			isInRange = true;
		}
		else
		{
			isInRange = false;
		}
		//outputs if the user inputed latitude and longitude
		//is true or false
		System.out.println("In Range:\t " + isInRange);
	}

}