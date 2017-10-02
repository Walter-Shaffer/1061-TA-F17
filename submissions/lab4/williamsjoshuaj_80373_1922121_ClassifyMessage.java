/*
* ClassifyMessage.java
* Author: Joshua Williams
* Submission Date: 9/27/17
*
* Purpose: 
* 	This program will parse the text of a message supplied by the user,
*  it will identify the category of the message, and assign the value to a variable
* It will also identify the latitude and longitude of the message and determine
*  whether these are within the ranges specified in the program.
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
enum MessageCategory{NEED,OFFER,ALERT,INFO,UNKNOWN}
public class ClassifyMessage {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String catString,payload;
		double latitude,longitude;
		double south = 39.882343,north = 40.231315,west = -105.743511,east = -104.907864;
		boolean isInRange;
		MessageCategory category;//Variable Declaration 
		System.out.println("Please enter a formatted message:");
		
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		catString = catString.trim();
		payload = payload.trim(); //Retrieves the values each variable from the formatted message
		
		if(catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke"))
			category = MessageCategory.ALERT;
		else if(catString.equalsIgnoreCase("need"))
			category = MessageCategory.NEED;
		else if(catString.equalsIgnoreCase("offer"))
			category = MessageCategory.OFFER;
		else if(catString.equalsIgnoreCase("structure")|| catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac"))
			category = MessageCategory.INFO;
		else
			category = MessageCategory.UNKNOWN;//The above lines of if/else statements classify the Category based on the raw category string
		
		if((latitude >= south && latitude <= north) && (longitude >= west && longitude <= east))
			isInRange = true;
		else
			isInRange = false; // This if else statement determines if the longitude and latitude are in range and changes the boolean value accordingly
		
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);//These simple display the outputs in an organized manner
		
	}
}
