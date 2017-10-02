/*
	* ClassifyMessage.java
	* Author: Jay Carl
	* Submission Date: 9/28/17
	*
	* Purpose: Classifies a tweet into a certain category based on input.
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

enum messageCategory{NEED,OFFER, ALERT, INFO, UNKNOWN}

public class ClassifyMessage {

	public static void main(String[]args){
		
		Scanner keyboard = new Scanner(System.in);
		
		String catString;// The raw text of the message’s category
		String payload; // The primary content of the message
		
		double latitude;  // The latitude indicated in the message
		double longitude; // The longitude indicated in the message
		
		boolean isInRange; // A “flag” indicating whether the latitude and
		//longitude values are within bounds
		
		messageCategory category; // The message’s category
		
		double south = 39.882343; // southernmost Latitude
		double north = 40.231315;// northernmost Latitude
		
		double west = -105.743511; // westernmost Latitude
		double east = -104.907864; //easternmost Latitude		
		
		System.out.println("Please enter a formatted message: ");
		
		catString = keyboard.next();
		catString = catString.trim(); // next input equals string catString
		
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble(); // next double input equals latitude then longitude
		
		payload = keyboard.nextLine();
		payload.trim();  // the rest of the line equals the string payload
		
		if(catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke"))
		{category = messageCategory.ALERT;}
		else if(catString.equalsIgnoreCase("need"))
			{category = messageCategory.NEED;}	
		else if(catString.equalsIgnoreCase("offer"))
		{category = messageCategory.OFFER;}
		else if(catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac"))
		{category = messageCategory.INFO;}
		else
		{category = messageCategory.UNKNOWN;} // if the catString equals the intended string, set catString to the connected message category. If not, keeps on moving down to test the rest of the cases.
		
		if((latitude >= south + latitude && south + latitude <= north) && (longitude >= west + longitude && west + longitude <= east))
			 isInRange = true;
			else
			 isInRange = false; // sets parameters for the boolean value isInRange

			System.out.println("Category: \t" + category);	
			System.out.println("Rawcat: \t" + catString);
			System.out.println("Message:\t" + payload);
			System.out.println("Latitude: \t" + latitude);
			System.out.println("Longitude: \t" + longitude);
			System.out.println("In Range: \t" + isInRange);
		}
				
			}