import java.util.Scanner;

/*
* ClassifyMessage.java
* Author: Jack Maggard
* Submission Date: 9/25/2017]
*
* Purpose: A brief paragraph description of the
* program. What does it do?
*This program takes a statement inputed by the user and parses it. 
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
public class ClassifyMessage {
enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner (System.in);
		String catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;
		double south=39.882343;
		double north=40.23115;
		double west=-105.743511;
		double east=-104.907864;
		System.out.println("Please enter a formatted message:");
		catString=keyboard.next();
		latitude=keyboard.nextDouble();
		longitude=keyboard.nextDouble();
		payload=keyboard.nextLine();
		System.out.println(catString+""+latitude+""+longitude+""+payload);
		payload=payload.trim();
		catString=catString.trim();
		if (catString.equalsIgnoreCase("fire")||catString.equalsIgnoreCase("smoke"))
			category=MessageCategory.ALERT;
		
		else if (catString.equalsIgnoreCase("need"))
			category=MessageCategory.NEED;
		
		else if (catString.equalsIgnoreCase("offer"))
			category=MessageCategory.OFFER;
		
		else if (catString.equalsIgnoreCase("structure")||catString.equalsIgnoreCase("road")||catString.equalsIgnoreCase("photo")||catString.equalsIgnoreCase("evac"))
			category=MessageCategory.INFO;
		else 
			category=MessageCategory.UNKNOWN;
		
		if (latitude>=south&&latitude<=north&&longitude>=west&&longitude<=east)
			isInRange=true;
		else
			isInRange=false;
		System.out.println("Category:\t"+category);
		System.out.println("Raw Cat:\t"+catString);
		System.out.println("Message:\t"+payload);
		System.out.println("Latitude:\t"+latitude);
		System.out.println("Longitude:\t"+longitude);
		System.out.println("In Range:\t"+isInRange);
	
	}

}
