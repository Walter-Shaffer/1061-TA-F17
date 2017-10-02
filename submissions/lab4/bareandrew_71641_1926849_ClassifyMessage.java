import java.util.Scanner;
/*
* ClassifyMessage.java
* Author: Andrew Bare
* Submission Date: 9/29/17
*
* Purpose: 
* 
* This program will parse through a user specified message 
* classify the message, and break down the parts of the tweet
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

public class ClassifyMessage {
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}

	public static void main(String[] args) {
		//This is the Scanner for input
		Scanner kb = new Scanner(System.in);
		
		//input variables
		String catString, payload;
		double latitude, longitude;
		boolean isInRange;
		MessageCategory category;
		
		//double variables given
		final double south = 39.882343;	//southernmost latitude
		final double north = 40.231315;	//northernmost latitude
		final double west = -105.743511;	//Westernmost longitude
		final double east = -104.907864;	//Easternmost longitude
		
		System.out.println("Please enter a formatted message:\t");
		
		//gets input from a specifically formatted text input
		catString = kb.next().trim();
		latitude = kb.nextDouble();
		longitude = kb.nextDouble();
		payload = kb.nextLine().trim();
		
		//decision structure to assign the right category based on the tweet contents
		if (catString.equalsIgnoreCase("fire")|| catString.equalsIgnoreCase("smoke"))
			category = MessageCategory.ALERT;
		else if (catString.equalsIgnoreCase("need"))
			category = MessageCategory.NEED;
		else if (catString.equalsIgnoreCase("offer"))
			category = MessageCategory.OFFER;
		else if (catString.equalsIgnoreCase("structure")|| catString.equalsIgnoreCase("road") ||catString.equalsIgnoreCase("photo")||catString.equalsIgnoreCase("evac"))
			category = MessageCategory.INFO;
		else
			category = MessageCategory.UNKNOWN;
		
		//is the latitude and longitude within range?
		isInRange = false; //initially set it false, will change if in range
		if (latitude >=south && latitude <= north)
		{
			if (longitude >= west && longitude <=east)
				isInRange = true;	//only changes if it's in range
		}
		
		//Print Statements		
		System.out.print("Category:\t");
		System.out.println(category);
		System.out.print("Raw Cat:\t");
		System.out.println(catString);
		System.out.print("Message:\t");
		System.out.println(payload);
		System.out.print("Latitude:\t");
		System.out.println(latitude);
		System.out.print("Longitude:\t");
		System.out.println(longitude);
		System.out.print("in Range:\t");
		System.out.println(isInRange);
		
//		System.out.println(catString);
//		System.out.println(payload);
//		System.out.println(latitude);
//		System.out.println(longitude);		
	}

}
