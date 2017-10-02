/*
* CPSC-1060.java

* Author: Trip Bastian
* Submission Date: September 28, 2017
*
* Purpose: To take a string from a tweet and categorize it 
*          to make it easier to organize and sort the messages
*          into different categories.
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
	public enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	public static void main(String[] args) {
		//Declaring of Variables and assignments
		Scanner keyboard= new Scanner(System.in);
		String catString, payload;
		boolean isInRange;
		double South = 39.882343;
		double North = 40.231315;
		double West = -105.743511;
		double East = -104.907864;
		MessageCategory category;
		//Output/input
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next().trim();
		//Reading the message
		double latitude = keyboard.nextDouble();
		double longitude = keyboard.nextDouble();
		payload = keyboard.nextLine().trim();
		//Is it in range?
		if (South <= latitude && North >= latitude && West <= longitude && East >= longitude){
			isInRange = true;
		}
		else {
			isInRange = false;
		}
		//What kind of category is it?
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
			category = MessageCategory.UNKNOWN;
		}
		//Output Results
		System.out.println("Category:\t"+category);
		System.out.println("Raw Cat:\t"+catString);
		System.out.println("Message:\t"+payload);
		System.out.println("Latitude:\t"+latitude);
		System.out.println("Longitude:\t"+longitude);
		System.out.println("In Range:\t"+isInRange);
	}
}