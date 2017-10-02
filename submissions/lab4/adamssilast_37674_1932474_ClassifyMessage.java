import java.util.Scanner;
/*
* ClassifyMessage.java
* Author: Silas Adams
* Submission Date: September 9, 2017
*
* Purpose:Parse the text of a user specified message, identify the category of the message, and assign this value to a variable (category)
*declared to be of type MessageCategory (only values from the enumeration can be assigned to the
*variable). You will also identify the latitude and longitude specified in the message and determine
whether these are within ranges defined elsewhere in the program. 
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
public class ClassifyMessage {
	enum MessageCategory{NEED, OFFER, ALERT, INFO, UNKNOWN}
	public static void main(String[] args) {
		String catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;
		double south=39.882343;
		double north=40.231315;
		double west=-105.743511;
		double east=-104.907864;
		

		Scanner keyboard=new Scanner(System.in);
		System.out.println("Please enter a formatted message: ");
		catString=keyboard.next();
		latitude=keyboard.nextDouble();
		longitude=keyboard.nextDouble();
		payload=keyboard.nextLine();
		keyboard.close();

		
		payload=payload.trim();
		if (catString.equalsIgnoreCase("fire")||catString.equals("smoke")){
			category=MessageCategory.ALERT;}
			else if(catString.equalsIgnoreCase("need"))
			category=MessageCategory.NEED;
			else if(catString.equalsIgnoreCase("offer"))
			category=MessageCategory.OFFER;
			else if(catString.equalsIgnoreCase("structure")||catString.equalsIgnoreCase("road")||catString.equalsIgnoreCase("photo")||catString.equalsIgnoreCase("evac"))
			category=MessageCategory.INFO;
			else{
			category=MessageCategory.UNKNOWN;	
				}
		if (((latitude>=south)&&(latitude<=north))&&((longitude>=west)&&(longitude<=east)))
		{
			isInRange=true;
		}
		else
			isInRange=false;
		
		System.out.println("Category:\t"+ category);
		System.out.println("Raw Cat:\t"+catString );
		System.out.println("Message:\t"+payload);
		System.out.println("Latitide:\t"+ latitude);
		System.out.println("Longitude:\t"+ longitude);
		System.out.println("In Range:\t"+ isInRange);
	}
	


	}


