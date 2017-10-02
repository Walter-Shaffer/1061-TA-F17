/*
* [ParseTheTweet].java
* Author: [Anthony Frazier]
* Submission Date: [9/21/17]
*
* Purpose: This program parses tweets for specific information.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagarism will be handled in accordance
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
		String type = "";
		String detail = "";
		String location = "";
		String latitudeString = "";
		String longitudeString = "";		
		Double latitude;
		Double longitude;
		int start;
		int finish;
		
		System.out.print("Enter Tweet");
		tweet = theScanner.nextLine();
		
		start = tweet.indexOf("#typ") + 5;
		finish = tweet.indexOf(";");
		type = tweet.substring(start,finish);
		type = type.trim();
		tweet = tweet.substring(finish + 1);
		type = type.toUpperCase();
		System.out.println("\nType: \t\t" + type);
		//System.out.println(tweet);
		
		start = tweet.indexOf("#det") + 5;
		finish = tweet.indexOf(";");
		detail = tweet.substring(start,finish);
		detail = detail.trim();
		tweet = tweet.substring(finish + 1);
		detail = detail.replace(",","-");
		//System.out.println(tweet);
		System.out.println("Detail:\t\t" + detail);
		
		start = tweet.indexOf("loc") + 4;
		finish = tweet.indexOf(";");
		location = tweet.substring(start,finish);
		location = location.trim();
		tweet = tweet.substring(finish + 1);
		//System.out.println(tweet);
		location = location.replace(",","-");
		System.out.println("Location:\t" + location);
		
		start = tweet.indexOf("#lat") + 5;
		finish = tweet.indexOf(";");
		latitudeString = tweet.substring(start,finish);
		latitudeString = latitudeString.trim();
		tweet = tweet.substring(finish + 1);
		//System.out.println("Latitude:\t" + latitudeString);
		//System.out.println(tweet);
		
		start = tweet.indexOf("#lng") + 5;
		finish = tweet.indexOf(";");
		longitudeString = tweet.substring(start,finish);
		longitudeString = longitudeString.trim();
		tweet = tweet.substring(finish + 1);
		//System.out.println("Longitude:\t" + longitudeString);
		//System.out.println(tweet);
		
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble();
		System.out.println("Latitude:\t" + latitude);
		
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		System.out.println("Longitude: \t" + longitude);
		
		//theScanner = new Scanner(latitudeString);
		// TODO Auto-generated method stub

	}

}
