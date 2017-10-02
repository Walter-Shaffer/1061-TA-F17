/*
* [Introduction to Java 1061].java
* Author:  [Trevon Wilson]
* Submission Date:  [9/17/17]
* Purpose: A brief paragraph description of the * program. What does it do?
* The purpose of the program is to declare variables and calculate the netpay of a workers paycheck. We will also be declaring constants. The program should be able to write statements to perform basic outputs and inputs. And lastly the program should be to assign bales to variables involving arithmetic expressions.
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
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
		Scanner keyboard = new Scanner(System.in);
		
		String catString = new String("");
		// The raw text of the message's category
		String payload = new String("");
		// The primary content of the message
		double latitude;
		// The latitude indicated in the message
		double longitude;
		// The longitude indicated in the message
		boolean isInRange;
		// A "flag" indicating whether the latitude and
		// longitude values are within bounds
		
		MessageCategory category;
		
		double south = 39.882343;
		// southernmost latitude
		double north = 40.231315;
		// northernmost latitude
		double west = -105.743511;
		// westernmost longitude
		double east = -104.907864;
		// easternmost longitude
		
		System.out.println("Please enter a formatted messsage:");
		
		catString = keyboard.next().trim();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine().trim();
		
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		}
		else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}
		else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || 
				catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		}
		else 
		{ category = MessageCategory.UNKNOWN;}

		
		if ((latitude >= south) && (latitude <= north) && 
			(longitude >= west) && (longitude <= east)) {
			
		isInRange = true;
		}
		else {
			isInRange = false;
		}
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message: \t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
	}

}
