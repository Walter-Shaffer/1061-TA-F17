/*
* ClassifyMessage.java
* Author: Karmen Brooks
* Submission Date: 9/28/17
*
* Purpose: Categorizes tweets based on keywords.
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
* at Clemson University. Any publishing or posting of source
* code for this project is strictly prohibited
* unless you have written consent from the instructor.
*/

import java.util.Scanner;

public class ClassifyMessage {
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String catString = "";
		String payload = "";
		
		double latitude;
		double longitude;
		double south = 39.882343;
		double east = -104.907864;
		double west = -105.743511;
		double north = 40.231315;
		
		//
		
		System.out.println("Please enter a formatted message:");
		
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		
		//
		
		MessageCategory category;
		
		if (catString.equalsIgnoreCase("fire"))
			category = MessageCategory.ALERT;
		else if (catString.equalsIgnoreCase("smoke")) 
			category = MessageCategory.ALERT;
		else if (catString.equalsIgnoreCase("need"))
			category = MessageCategory.NEED;
		else if (catString.equalsIgnoreCase("offer"))
			category = MessageCategory.OFFER;
		else if (catString.equalsIgnoreCase("structure"))
			category = MessageCategory.INFO;
		else if (catString.equalsIgnoreCase("road"))
			category = MessageCategory.INFO;
		else if (catString.equalsIgnoreCase("photo"))
			category = MessageCategory.INFO;
		else if (catString.equalsIgnoreCase("evac"))
			category = MessageCategory.INFO;
		else
			category = MessageCategory.UNKNOWN;
		
		//
		
		boolean isinRange;
		
		if (latitude >= south && latitude <= north && longitude >= west && longitude <= east) {
			isinRange = true;
		}
		else
			isinRange = false;
		
		//
		
		System.out.println("");
		System.out.println("Category:" + "\t" + category);
		System.out.println("Raw Cat:" + "\t" + catString);
		System.out.println("Message:" + "\t" + payload.trim());
		System.out.println("Latitude:" + "\t" + latitude);
		System.out.println("Longitude:" + "\t" + longitude);
		System.out.println("In Range:" + "\t" + isinRange);
		
		}
		

	}