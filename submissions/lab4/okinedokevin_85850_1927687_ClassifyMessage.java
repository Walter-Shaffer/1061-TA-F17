/*
* ClassifyMessage.java
* Author: Kevin Okinedo
* Submission Date: 9/28/17
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program uses methods of the String class to output formatted text through using the user input.
* Double and String variables store the input and String variables are concatenated with text for the output.
* 
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

enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
		//declaring enumeration MessageCategory
public class ClassifyMessage {

	public static void main(String[] args) {
		
		
		MessageCategory category;
		
		String payload, catString;
		double latitude, longitude;
		boolean isInRange;
		//declare variables
		
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		//set variables to values
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		//take input from user
		
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		
		payload = payload.trim();
		
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
		
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo"))
		{
			category = MessageCategory.INFO;
		}
		
		else 
		{
			category = MessageCategory.UNKNOWN;
		}
		//compare strings
		
		
		
		
		
		if ((latitude >= south && latitude <= north) && (longitude >= west && longitude <= east))
				{
					isInRange = true;
				}
		
		else
		{
			isInRange = false;
		}
		//compare double values
		
		System.out.println("Category:" + "\t" + category);
		System.out.println("Raw Cat:" + "\t" + catString);
		System.out.println("Message:" + "\t" + payload);
		System.out.println("Latitude:" + "\t" + latitude);
		System.out.println("Longitude:" + "\t" + longitude);
		System.out.println("In Range:" + "\t" + isInRange);
		//prints out values
	}

}
