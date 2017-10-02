/* ClassifyMessage.java
  Author: Emily Potts
  Submission Date: September 29, 2017 

  Purpose: The purpose of this program is to parse the tweet of user input
  to identify the category of the message and assign it to the MessageCategory type.
  The program also checks if the messages latitude and longitude is in range. 

  Statement of Academic Honesty:

  The following code represents my own work. I have neither
  received nor given inappropriate assistance. I have not copied
  or modified code from any source other than the course webpage
  or the course textbook. I recognize that any unauthorized
  assistance or plagiarism will be handled in accordance
  with the policies at Clemson University and the
  policies of this course. I recognize that my work is based
  on an assignment created by the School of Computing
  at Clemson University. Any publishing or posting
  of source code for this project is strictly prohibited
  unless you have written consent from the instructor. 
 */

import java.util.Scanner; 
	
public class ClassifyMessage {
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	public static void main(String[] args) {
		//Create Scanner class
		Scanner keyboard = new Scanner(System.in);
		
		//Declare variables
		String catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange; 
		MessageCategory category;
		
		//Declare constant variables 
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		
		//Prompt user for input 
		System.out.println("Please enter a formatted message: ");
		
		//Read in values from keyboard
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
				
		//Trim white spaces from inputed text
		payload = payload.trim();
		catString = catString.trim();
		
		//if else statement to match the right value in the catString and assign to category 
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) 
			category = MessageCategory.ALERT;
		else if (catString.equalsIgnoreCase("need"))
			category = MessageCategory.NEED;
		else if (catString.equalsIgnoreCase("offer"))
			category = MessageCategory.OFFER;
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac"))
			category = MessageCategory.INFO;
		else 
			category = MessageCategory.UNKNOWN;
		
		//if else statement to determine if message is in range 
		if ((latitude >= south) && (latitude<= north))
			if ((longitude >= west) && (longitude <= east))
				isInRange = true;
			else 
				isInRange = false;
		else 
			isInRange = false;
		
		//Display output 
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		
		}
	
}
