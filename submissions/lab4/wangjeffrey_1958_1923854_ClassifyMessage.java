
/*
* ClassifyMessage.java
* Author: Jeffrey Wang
* Submission Date: 9/19/2017
*
* Purpose: Classifies messages
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
		//things being defined
		Scanner keyboard = new Scanner(System.in);
		String catString, payload;
		double latitude, longitude, south, north, west, east;
		boolean isInRange;
		int finish;
		MessageCategory category;
		south = 39.882343;
		north = 40.231315;
		west = -105.743511;
		east = -104.907864;
		//parsing
		System.out.println("Please enter a formatted message:");
		payload = keyboard.nextLine().trim();
		finish = payload.indexOf(" ");
		catString = payload.substring(0, finish);
		payload = payload.substring(finish).trim();
		finish = payload.indexOf(" ");
		latitude = Double.parseDouble(payload.substring(0, finish));
		payload = payload.substring(finish).trim();
		finish = payload.indexOf(" ");
		longitude = Double.parseDouble(payload.substring(0, finish));
		payload = payload.substring(finish).trim();
		//category decisions
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")){
			category = MessageCategory.ALERT;
			} else if (catString.equalsIgnoreCase("need")) {
				category = MessageCategory.NEED;
			} else if (catString.equalsIgnoreCase("offer")) {
				category = MessageCategory.OFFER;
			} else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") 
					|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
				category = MessageCategory.INFO;
			} else {
				category = MessageCategory.UNKNOWN;
			}
		
		//isInRange decisions
		if (latitude >= south & latitude <= north & longitude >= west & longitude <= east) {
			isInRange = true;
		} else {
			isInRange = false;
		}
		
		//print outs
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longituge:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		
		}
	}
