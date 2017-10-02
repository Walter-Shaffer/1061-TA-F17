/*
* ParseTheTweet.java
* Author: Monica Hart
* Submission Date: 9/19/2017
*
* Purpose: This program scans a tweet entered for its type, 
* detail, location, latitude, and longitude.
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

		Scanner theScanner = new Scanner(System.in);
		
		String tweet = "";
		String type;
		String detail;
		String location;
		String latitudeString;
		String longitudeString;
		double latitude;
		double longitude;
		
		tweet = theScanner.nextLine();
		
		int start, finish;
		
		//type
		start = tweet.indexOf("#typ");
		finish = tweet.indexOf(";");
		type = tweet.substring(start+5, finish);
		type = type.trim();
		type = type.toUpperCase();
		
		tweet = tweet.substring(finish+1);
		
		//detail
		start = tweet.indexOf("#det");
		finish = tweet.indexOf(";");
		detail = tweet.substring(start+5, finish);
		detail = detail.trim();
		detail = detail.replace(',','-');
		
		tweet = tweet.substring(finish+1);
		
		//location
		start = tweet.indexOf("#loc");
		finish = tweet.indexOf(";");
		location = tweet.substring(start+5, finish);
		location = location.trim();
		location = location.replace(',','-');
		
		tweet = tweet.substring(finish+1);
		
		//latitudeString
		start = tweet.indexOf("#lat");
		finish = tweet.indexOf(";");
		latitudeString = tweet.substring(start+5, finish);
		latitudeString = latitudeString.trim();
		
		tweet = tweet.substring(finish+1);
		
		//longitudeString
		start = tweet.indexOf("#lng");
		finish = tweet.indexOf(";");
		longitudeString = tweet.substring(start+5, finish);
		longitudeString =longitudeString.trim();
		
		//latitude
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble();
		
		//longitude
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		
		//results
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);

	}

}
