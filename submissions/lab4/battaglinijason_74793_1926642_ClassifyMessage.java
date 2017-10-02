/* 
*ClassifyMessage.java
*Author: Jason Battaglini
*Submission Date: 9/28/17
*
*Purpose: The purpose of this program is to parse formatted message
*using if statements and decision statements.
*
*Statement of Academic Honesty:
*
*The following code represents my own work. I have neither
*received nor given inappropriate assistance. I have not copied
*or modified code from any source other than the course webpage
*or the course textbook. I recognize that any unauthorized
*assistance or plagiarism will be handled  in accordance
*with the policies at CLemson University and the
*policies of this course. I recognize that my work is based
*on an assignment created by the School of Computing
*at Clemson University. Any publishing or posting
*of source code for this project is strictly prohibited
*unless you have written consent from the instructor.
*/
import java.util.Scanner;
public class ClassifyMessage {
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard= new Scanner(System.in);
String catString;
String payload;
double latitude;
double longitude;
boolean isInRange;
MessageCategory category;
double south= 39.882343;
double north= 40.231215;
double west= -105.743511;
double east= -104.907854;
System.out.println("Please enter a formatted message: ");
catString=keyboard.next();

//payload=keyboard.nextLine();
//latitude=keyboard.nextDouble();
//longitude=keyboard.nextDouble();

//payload=payload.trim();
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
	catString=catString.trim();
	//determines what category of message the tweet is.
	//System.out.println(catString);
	
	latitude=keyboard.nextDouble();
	//System.out.println(latitude);
	//sets value for latitude
	
	longitude=keyboard.nextDouble();
	//System.out.println(longitude);
	//sets value for longitude
	payload=keyboard.nextLine();
	//payload=payload.trim();
	//System.out.println(payload);
	//determines what the message of the tweet is
	
	System.out.println("Category: \t\t "+ category);
	
	System.out.println("Raw Cat: \t\t " + catString);
	
	System.out.println("Message: \t\t" + payload);
	
	System.out.println("Latitude: \t\t " + latitude);
	
	System.out.println("Longitude: \t\t " +longitude);
	
	if ((latitude >= south)	 && (latitude <=north)&&((longitude>=west)&&(longitude<=east)))
		isInRange=true;
	else isInRange=false;
	//will determine if the latitude/longitude given in the tweet are within
	//range of the given latitude/longitude determined earlier in the code.
	
		System.out.println("In Range:\t\t " + isInRange);





	}

}




