/*
		* ClassifyMessage.java
		* Author: Spalding Latham
		* Submission Date: [9/29/2017]
		*
		* Purpose: This program takes an input tweet of someone in danger and the resulting output
		* is an easy to read description of there whereabouts, problems, etc.
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


public class ClassifyMessage {

	
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	
	
	public static void main(String[] args) {
	
		
		
		Scanner keyboard = new Scanner(System.in);
		//Set up scanner for user input

		String catString;
		
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;
		double south;
		double north;
		double east;
		double west;
		
		
		south = 39.882343;
		north = 40.231315;
		east = -104.907864;
	    west = -105.743511;
	
	    
	    System.out.println("Please enter a formatted message: ");
	    //take user input
	   
	    catString = keyboard.next();
	    //take the first string the user inputs and assign to variable catString
	    latitude = keyboard.nextDouble();
	    //take the latitude
	    longitude = keyboard.nextDouble();
	    //take the longitude
	    payload = keyboard.nextLine().trim();
	    //take the rest of the input, trim the white space, and assign to variable payload
	    
	    if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke" )){ 
	    	category = MessageCategory.ALERT; }
	    else
	    if (catString.equalsIgnoreCase("need"))
	        category = MessageCategory.NEED;
	    else 
	    if (catString.equalsIgnoreCase("offer"))
	    	category = MessageCategory.OFFER;
	    else 
	    if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac"))
	    	category = MessageCategory.INFO;
	    else category = MessageCategory.UNKNOWN;
	    //using an if-else statement to parse the message and decide what type of alert it is, ignoring case
	    
	    if ((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east)){
	      isInRange = true;}
	    else isInRange = false;
	    //using another if-else statement to decide whether or not the person is in range
	    
	    System.out.println("Category: \t"  + category);
	    System.out.println("Raw Cat: \t" + catString);
	    System.out.println("Message:\t" + payload);
	    System.out.println("Latitude: \t" + latitude);
	    System.out.println("Longitude: \t" + longitude);
	    System.out.println("In Range: \t" + isInRange);
	    
	    
	   keyboard.close();
	    
	    
	    
	
	
	
	
	
	
	
	
	
	
	
	}

}
