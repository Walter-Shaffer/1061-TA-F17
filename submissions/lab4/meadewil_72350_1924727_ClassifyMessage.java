import java.util.Scanner;
/* ClassifyMessage.java
Author: Sean Meade
Submission Date: 9/28
Purpose: The program takes an input string, breaks it up into
different parts, and reads those different parts out with their 
classification in front of them. 

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
public class ClassifyMessage {
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN} //Makes sure that "category" will only be one of these five values. 
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in); //Sets up the keyboard and variables needed. 
		String catString;
		String payload;
		double latitude;
		double longitude; 
		boolean isInRange;
		MessageCategory category;
		
		double south = 39.882343; //Sets up doubles needed so that the isInRange value is restricted to being inside these values.
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		
		System.out.println("Please enter a formatted message:"); //Asks for the message and breaks it up. 
		catString = keyboard.next();
		catString = catString.trim();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		payload = payload.trim();
		
		if ( catString.equalsIgnoreCase("fire") | catString.equalsIgnoreCase("smoke") ) //Decides what message category from the beginning to assign to "category."
			category = MessageCategory.ALERT;
		else if (catString.equalsIgnoreCase("need"))
			category = MessageCategory.NEED;
		else if (catString.equalsIgnoreCase("offer"))
			category = MessageCategory.OFFER;
		else if ( catString.equalsIgnoreCase("structure") | catString.equalsIgnoreCase("road") | catString.equalsIgnoreCase("photo") | catString.equalsIgnoreCase("evac")) 
			category = MessageCategory.INFO;
		else
			category = MessageCategory.UNKNOWN;
		
		if ( (latitude >= south) & (latitude <= north) & (longitude >= west) & (longitude <= east) ) //Checks to see if the given latitude and longitude are in the range of the doubles set up earlier. 
			isInRange = true;
		else 
			isInRange = false;
		
		System.out.println("Category:\t" + category); //Prints the needed information. 
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
		
		keyboard.close(); //Closes the keyboard. 
	}

}
