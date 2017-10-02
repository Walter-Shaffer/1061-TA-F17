/*
* CPSC 1060.java

* Author: Mimi Ntune
* Submission Date: 9/29/2017
*
* Purpose: create a java enumeration that lists several message categories
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
	enum MessageCategory { NEED, OFFER, ALERT, INFO, UNKNOWN }
public static void main(String[] args ){
	Scanner keyboard = new Scanner(System.in);
    String catString; // message's category
	String payload;  // primary content of message
	double longitude;  //given in message
	double latitude;     // given in message 
	boolean isInRange;  // see if person is within bounds
	MessageCategory category;  // message's category
	
	double south = 39.882343;  // southernmost
	double north = 40.231315;  // northernmost
	double west = -105.743511;  // westernmost
	double east = -104.907864;  // easternomst
	
	
	System.out.print("Please enter a formatted message ");
	catString = keyboard.next();
	//System.out.print(catString);
	latitude = keyboard.nextDouble();
	//System.out.println(latitude);
	longitude = keyboard.nextDouble();
	//System.out.print(longitude);
	payload = keyboard.nextLine();
	//System.out.print(payload);
      payload.trim(); // Remove white spaces
	
	if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")){
		category = MessageCategory.ALERT;
	}
	else if (catString.equalsIgnoreCase("need")){
		category = MessageCategory.NEED;
	}		
	else if (catString.equalsIgnoreCase("offer")){
		category = MessageCategory.OFFER;
	}
	else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")){
		category = MessageCategory.INFO;
	}
	else {
		category= MessageCategory.UNKNOWN;
	}
	
	if ((latitude >= south && latitude <= north) && (longitude >= west && longitude <= east)){
		isInRange = true;
	}
		else {
			isInRange = false;
		} 
	System.out.print("Category: \t" + category + "\n");
	System.out.print("Raw Cat:  \t" + catString + "\n");
	System.out.print("Message:  \t" + payload.trim() +  "\n");
	System.out.print("Latitude: \t" + latitude + "\n");
	System.out.print("Longitude:\t" + longitude +  "\n");
	System.out.print("In Range: \t" + isInRange);
	}
		}
	
  
