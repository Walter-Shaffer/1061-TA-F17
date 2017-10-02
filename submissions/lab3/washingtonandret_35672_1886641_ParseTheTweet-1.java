/*
* PhraseTheTweet.java
* Author: Andre Washington
* Submission Date: 9/21/2017
*
* Purpose: This program is designed to take different 
* code and display it in a way that is easier for the
* user to read or understand.
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
public class ParseTheTweet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner theScanner = new Scanner(System.in);
		String tweet ="";
		
		String type;
		String detail;
		String location;
		String latitudeString;
		String longitudeString;
		double latitude;
		double longitude;
		System.out.print("Enter Tweet: ");
		
		tweet = theScanner.nextLine();
			
		int start;
		int finish;
		
		start = tweet.indexOf("#typ") + 5;
		finish = tweet.indexOf(";");
		type = tweet.substring(start , finish);
		type = type.trim();
		tweet = tweet.substring(finish+1);
		
		start = tweet.indexOf("#det") + 5;
		finish = tweet.indexOf(";");
		detail	= tweet.substring(start , finish);
		detail = detail.trim();
		tweet = tweet.substring(finish+1);
		
		start = tweet.indexOf("#loc") + 5;
		finish = tweet.indexOf(";");
		location = tweet.substring(start , finish);
		location = location.trim();
		tweet = tweet.substring(finish+1);
		
		start = tweet.indexOf("#lat") + 5;
		finish = tweet.indexOf(";");
		latitudeString = tweet.substring(start , finish);
		latitudeString = latitudeString.trim();
		tweet = tweet.substring(finish+1);
		
		start = tweet.indexOf("#lng") + 5;
		finish = tweet.indexOf(";");
		longitudeString = tweet.substring(start , finish);
		longitudeString = longitudeString.trim();
		tweet = tweet.substring(finish+1);
		
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble();
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		
		type = type.toUpperCase(); 
		detail = detail.replace("," , "-");
		location = location.replace(",", "-");
		
		System.out.println("Type: " + type);
		System.out.println("Detail: " + detail);
		System.out.println("Location: " + location);
		System.out.println("Latitude: " + latitude);
		System.out.println("Longitude: " + longitude);	
	}

}
