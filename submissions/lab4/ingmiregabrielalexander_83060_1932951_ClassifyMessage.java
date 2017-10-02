
/*
* ClassifyMessage.java
* Author:Gabe Ingmire
* Submission Date:9/26/2017
*
* Purpose: Define enumerations and use boolean values as 
* well as strings and decision statements.
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
import java.util.*;
public class ClassifyMessage {

	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		String Payload = new String("");
		String catString = new String(""); //the raw text of the message's category
		double latitude; //The latitude indicated in the message
		double longitude;//The longitude indicated in the message
		boolean isInRange; //longitude and latitude are in bounds
		
		MessageCategory category; // The message’s category
	
		
		
		
		double south = 39.882343; //southern most latitude
		double north = 40.231315; // northern most latitude
		double west = -105.743511; // western most longitude
		double east = -104.907864; // eastern most longitude
		
		System.out.print("Please enter a formatted message: ");
		
		catString = keyboard.next().trim();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		Payload = keyboard.next().trim();
		
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT; 
		}
		else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}
		else if(catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("evac") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo")) {
		   		category = MessageCategory.INFO;
		}
		else 
		{category = MessageCategory.UNKNOWN;}
		
		
		if ((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east)){ 
			isInRange = true;	
		}
		else {
			isInRange = false;
			
		}
		
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message: \t" + Payload);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		System.out.println("In Range: \t" + isInRange);
		
		
	}
	
}