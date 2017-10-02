/*
*ClassifyMessage.java
*Author: Caroline Ryan
*Submission Date: September 29, 2017
* 
*Purpose: The purpose of this assignment is to use the Scanner and String classes, 
*enum, multi branch and regular if-else statements. Using these the program will take
*an input from the user and return the output with organized variables. The outputs are
*decided by the input statement and goes through the multi branch if-else statment to 
*return the correct enum and information.
* 
* Statement of Academic Honesty:
*  
* The following code represents my own work. I have neither recieved nor given inappropriate
* assistance. I have not copied or modified code from any source other than the course webpage
* or the course textbook. I will recognize that nay unauthorized assistance or plagiarism
* will be handled in accordance with the policies at Clemson University and the policies
* of this course. I recognize that my work is based on an assignment created by the School of 
* Computing at Clemson University. Any publishing or posting of source code for this project
* is strictly prohibited unless you have written consent from the instructor.
*/
import java.util.Scanner;

public class ClassifyMessage {
	
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	public static void main(String[] args){
		//scanner
		Scanner keyboard = new Scanner(System.in);
		
		//input message
		System.out.println("Please enter a formatted message:");
		
		String catString = keyboard.next();
//		catString.trim();
		double latitude = keyboard.nextDouble();
        double longitude = keyboard.nextDouble();
		String payload = keyboard.next();
		payload.trim();
		boolean isInRange = false;
		
		//declare doubles
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		
		keyboard.close(); //close keyboard
		
		
		MessageCategory category = MessageCategory.valueOf(catString);
		
		
		System.out.print( "Category:" + category + "Raw Cat:" + catString + "Message:" + payload + "Latitude:" + latitude + "Longitude:" + longitude+ "In Range:" + isInRange);
		
		
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")){

			category = ClassifyMessage.MessageCategory.ALERT;
			System.out.print( "Category:" + category + "ALERT");

			} else if (catString.equalsIgnoreCase("need")){

			category = ClassifyMessage.MessageCategory.NEED;
			System.out.print( "Category:" + category + "NEED");

			} else if (catString.equalsIgnoreCase("offer")){

			category = ClassifyMessage.MessageCategory.OFFER;
			System.out.print( "Category:" + category + "OFFER");

			} else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo")||catString.equalsIgnoreCase("evac")){

			category = ClassifyMessage.MessageCategory.INFO;
			System.out.print( "Category:" + category + "INFO");

			} else {
			category = ClassifyMessage.MessageCategory.UNKNOWN;
			System.out.print( "Category:" + category + "UNKNOWN");
			}
		
//		if-else statement to det. whether latitude and longitude
//		are within geographical boundries
		
		if (latitude >= south && latitude <= north){
			if (longitude >= west && longitude <= east){
				isInRange = true;
			}
			} else { 
				isInRange = false;
			}
		

		}
	}


