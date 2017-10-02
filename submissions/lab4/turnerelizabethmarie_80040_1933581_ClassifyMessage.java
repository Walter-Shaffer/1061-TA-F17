/*
 * ClassifyMessage.java
 * Author: Elizabeth Turner
 * Submission Date: September 29, 2017
 * 
 * Purpose: !!!!!!!!!!!!!!!!!!!!!!!
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
 * unless you have written consent from the instructor
 */


import java.util.EnumSet;
import java.util.Scanner;

enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
public class ClassifyMessage {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;
		
		double south;
		double north;
		double west;
		double east;
		
		south = 39.882343;
		north = 40.231315;
		west = -105.743511;
		east = -104.907864;
		
	
		System.out.println("Please enter a formatted message:");	
		catString =(""); 
	
		catString = keyboard.next();
		System.out.println("Raw Category:\t" + catString);
		
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		
		payload = keyboard.nextLine();
		System.out.println("Message:\t" + payload.trim());
		
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		
		if (latitude >= south && latitude <= north && longitude >= west && longitude <= east)
			isInRange = true;
		else
			isInRange = false;
		
		System.out.println("In Range:\t" + isInRange);
		
	
		
	
		
	
		
		
		
		
		
		
		
		
		

	}

}
