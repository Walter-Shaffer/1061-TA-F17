/*
* ParseTheTweet.java
* Author: Ethan Coppenbarger
* Submission Date: 9/19/2017
*
* Purpose: Get data from tweets for disaster response by parsing hashtags.
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
		// declare variables
		Scanner theScanner = new Scanner(System.in);
		String tweet = "", type, detail, location, latitudeString, longitudeString;
		double latitude, longitude;
		int start, finish;
		

		// get tweet
		System.out.print("enter tweet: ");
		tweet = theScanner.nextLine();
		
		// find value of type
		start = tweet.indexOf("#typ") + 5;
		
		finish = tweet.indexOf(";");
		
		type = tweet.substring(start, finish);
		type = type.trim();
		
		// remove type
		tweet = tweet.substring(++finish, tweet.length());
		
	
		// find value of detail
		start = tweet.indexOf("#det") + 5;
				
		finish = tweet.indexOf(";");
				
		detail = tweet.substring(start, finish);
		detail = detail.trim();
				
		// remove detail
		tweet = tweet.substring(++finish, tweet.length());
		
		
		// find value of loc
		start = tweet.indexOf("#loc") + 5;
				
		finish = tweet.indexOf(";");
				
		location = tweet.substring(start, finish);
		location = location.trim();
				
		// remove location
		tweet = tweet.substring(++finish, tweet.length());
		
		
		// find value of latitude
		start = tweet.indexOf("#lat") + 5;
						
		finish = tweet.indexOf(";");
						
		latitudeString = tweet.substring(start, finish);
		latitudeString = latitudeString.trim();
						
		// remove latitude
		tweet = tweet.substring(++finish, tweet.length());
		
		
		// find value of longitude
		start = tweet.indexOf("#lng") + 5;
						
		finish = tweet.indexOf(";");
						
		longitudeString = tweet.substring(start, finish);
		longitudeString = longitudeString.trim();
						
		// remove longitude
		tweet = tweet.substring(++finish, tweet.length());
		
		
		// change latitude/longitude to double type
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble();
		
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		
		// change other variables to right format
		type = type.toUpperCase();
		detail = detail.replace(',', '-');
		
		// print results
		System.out.println("Type: \t\t" + type);
		System.out.println("Detail: \t" + detail);
		System.out.println("Location: \t" + location);
		System.out.println("Latitude: \t" + latitudeString);
		System.out.println("Longitude: \t" + longitudeString);
	}

}
