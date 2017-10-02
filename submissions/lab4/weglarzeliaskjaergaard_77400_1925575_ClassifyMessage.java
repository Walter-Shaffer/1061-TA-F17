/*
* ClassifyMessage.java
* Author: Elias Weglarz
* Submission Date: 9/28/17
*
* Purpose: Classify messages based on the information given in the message using if else statements
* and the String class. 
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
		Scanner keyboard = new Scanner (System.in);
		String catString, payload;
		double latitude, longitude;
		boolean isInRange;
		MessageCategory category;
		
		double south, north, east, west;
		//double values of directions
		south = 39.882343;
		north = 40.231315;
		west = -105.743511;
		east = -104.907864;
		
		//the reading in of the doubles and strings
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		keyboard.close();
		
		catString = catString.trim();
		
		payload = payload.trim();
		
		//if else statements related to category determination
		if ((catString.equalsIgnoreCase("smoke")) || (catString.equalsIgnoreCase("fire"))){
			category = MessageCategory.ALERT;
			System.out.println("Category:\t ALERT");
		}		
			else	if	(catString.equalsIgnoreCase("need")){
			category = MessageCategory.NEED;
			System.out.println("Category:\t NEED");
			}
				else 	if	(catString.equalsIgnoreCase("offer")){
				category = MessageCategory.OFFER;
				System.out.println("Category:\t OFFER");
				}
					else	if ((catString.equalsIgnoreCase("structure")) || (catString.equalsIgnoreCase("road")) || (catString.equalsIgnoreCase("photo")) || (catString.equalsIgnoreCase("evac"))){
					category = MessageCategory.INFO;
					System.out.println("Category:\t INFO");
					}	
		else{
			category = MessageCategory.UNKNOWN; 
			System.out.println("Category:\t UNKNOWN");
		}
		
		//ending print statements
		System.out.println("Raw Cat: \t" + " " + catString);
		System.out.println("Message: \t" + " " + payload);
		System.out.println("Latitude: \t" + " " + latitude);
		System.out.println("Longitude: \t" + " " + longitude);
		
		//if else statements regarding whether isInRange is true or false based on longitude and
		//latitude
			if ((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east)){
				isInRange = true;
				System.out.println("In Range:\t true");
			}
			else{
					isInRange = false;
					System.out.println("In Range:\t false");
				}
			
	}
}