/* 
 * ClassifyMessage.java 
 * Author:  Jackie Doan  
 * Submission Date:  Sept 26, 2017 
 * 
 * Purpose:
 * This program is designed with the purpose of breaking down
 * messages and classifying them into categories and determining
 * if the location of the message is within the range of a
 * specified latitude and longitude.
 * 
 * Statement of Academic Honesty:
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

//import Scanner
import java.util.Scanner;

public class ClassifyMessage {
	//Make a type of variable with specified outputs
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}

	public static void main(String[] args) {
		
		//input keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//variable intialization
		String catString = "";
		String payload = "";
		double latitude, longitude;
		boolean isInRange;
		MessageCategory category;
		double south, north, west, east;
		
		//directions of range
		south = 39.882343;
		north = 40.231315;
		west = -105.743511;
		east = -104.907864;
		
		//get values
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		payload = payload.trim();
		
		//categorization
		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")){
			category = MessageCategory.ALERT;
		} else if (catString.equalsIgnoreCase("need")){
			category = MessageCategory.NEED;
		} else if (catString.equalsIgnoreCase("offer")){
			category = MessageCategory.OFFER;
		} else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")){
			category = MessageCategory.INFO;
		} else {
			category = MessageCategory.UNKNOWN;
		}
		
		//Check Range
		if (latitude >= south && latitude <= north && longitude >= west && longitude <= east){
			isInRange = true;
		}
		else
			isInRange = false;
					
		//print statements
		System.out.println("Category: \t" + category);
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message: \t" + payload);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		System.out.println("In Range: \t" + isInRange);
	}

}
