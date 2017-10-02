/*ClassifyMessage.java


 * Zachary Smith
 * 9-26-17
 * This program takes a user inputed message, and divides the 
 * messages up by what type of message they are, either a need, 
 * offer, alert, info, or unknown. The program then lists the 
 * keyword that made this decision, and the rest of the words
 * in the message. The program then takes the user inputed
 * latitude and longitude, and determines whether these inputs
 * are within range of a predetermined area.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not 
 * copied or modified code from any other source other than 
 * the course webpage or the course textbook. I recognize that 
 * any unauthorized assistance or plagiarism will be handled in
 * accordance with the policies at Clemson University and the
 * policies of this course, I recognize that my work is based
 * on an assignment created by the School of Computing at 
 * Clemson University. Any publishing or posting of source
 * code for this project is strictly prohibited unless
 * you have written consent from the instructor.
 * 
 */

import java.util.Scanner;

public class ClassifyMessage {
	
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String catString, payload;
		double latitude, longitude;
		boolean isInRange;
		MessageCategory category ;
		
		double south, north, west, east;
		
		south = 39.882343;
		
		north = 40.231315;
		
		west = -105.743511;
		
		east = -104.907864;
		
		System.out.println("Please enter a formatted message:");
		
		catString = keyboard.next();
		
		latitude = keyboard.nextDouble();
		
		longitude = keyboard.nextDouble();
		
		payload = keyboard.nextLine();
		
		payload = payload.trim();
		
		catString = catString.trim();
		
		catString = catString.toLowerCase();
		
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke"))
		{
			category = MessageCategory.ALERT;
		}
		
		else if (catString.equalsIgnoreCase("need"))
		{
			category = MessageCategory.NEED;
		}
		
		else if (catString.equalsIgnoreCase("offer"))
		{
			category = MessageCategory.OFFER;
		}
		
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac"))
		{
			category = MessageCategory.INFO;
		}
		
		else
		{
			category = MessageCategory.UNKNOWN;
		}

		if((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east))
		{
			isInRange = true;
		}
		else
		{
			isInRange = false;
		}
		
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		
		
	}

}
