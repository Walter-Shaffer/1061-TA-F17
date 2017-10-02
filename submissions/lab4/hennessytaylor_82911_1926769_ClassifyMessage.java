import java.util.Scanner;
public class ClassifyMessage {
	/*
	* CreditCardPayOff.java
	* Author: Taylor Hennessy
	* Submission Date: 9/28/2017
	*
	* Purpose: Identifies a category, latitude, and longitude of a given formatted message.
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
	
	//create enumeration for categories
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	//scanner object to read 
	public static Scanner keyboard = new Scanner(System.in);
	
	//main method
	public static void main(String[] args) {
		
		//variables to hold data of message
		String message;
		String catString;
		String payload;
		String latString;
		String longString;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;
		
		//variables including boundaries for messages
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		
		//variables on where to start and finish (always start at beginning)
		int start = 0;
		int finish;
		
		//prompt user to enter message
		System.out.println("Please enter a formatted message:");
		
		//read in value of message
		message = keyboard.nextLine();
		
		//find the end of category
		finish = message.indexOf(" ");
		
		//get the category string
		catString = message.substring(0, finish);
		
		//cut down message
		message = message.substring(finish + 1, message.length());
		
		//find the end of latitude
		finish = message.indexOf(" ");
		
		//read in latitude
		latString = message.substring(0, finish);
		
		//cut down message
		message = message.substring(finish + 1, message.length());
		
		//find the end of longitude
		finish = message.indexOf(" ");
		
		//read in longitude
		longString = message.substring(0, finish);
				
		//cut down message
		message = message.substring(finish + 1, message.length());

		//set keyboard to read in latitude string
		keyboard = new Scanner(latString);
		
		//read in latitude
		latitude = keyboard.nextDouble();
		
		//set keyboard to read in longitude string
		keyboard = new Scanner(longString);
		
		//read in latitude
		longitude = keyboard.nextDouble();
		
		
		//decide what category should be
		if (catString.equalsIgnoreCase("FIRE")||catString.equalsIgnoreCase("SMOKE"))
				{
					category = MessageCategory.ALERT;
				}
		else if (catString.equalsIgnoreCase("NEED"))
		{
			category = MessageCategory.NEED;
		}
		else if (catString.equalsIgnoreCase("OFFER"))
		{
			category = MessageCategory.OFFER;
		}
		else if (catString.equalsIgnoreCase("STRUCTURE")||catString.equalsIgnoreCase("ROAD")||catString.equalsIgnoreCase("PHOTO")||catString.equalsIgnoreCase("EVAC"))
		{
			category = MessageCategory.INFO;
		}
		else 
		{
			category = MessageCategory.UNKNOWN;
		}
		
		
		//decide if it is in range or not 
		if ((latitude >= south)&& (latitude <= north) && (longitude >= west)&&(longitude<=east))
		{
			isInRange = true;
		}
		else
		{
			isInRange = false;
		}
		
		//print out results
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + message);
		System.out.println("Latitude:\t" + latString);
		System.out.println("Longitude:\t" + longString);
		System.out.println("In Range:\t" + isInRange);

	}

}
