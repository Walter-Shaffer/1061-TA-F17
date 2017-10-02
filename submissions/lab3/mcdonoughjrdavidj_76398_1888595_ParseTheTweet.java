/*
* ParseTheTweet.java
* Author: David McDonough
* Submission Date: 9/21/17
*
* Purpose: reads a tweet and outputs important information from specific hashtags.
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
* unless you have written consent*/

import java.util.Scanner;

public class ParseTheTweet {

	public static void main(String[] args) {
		String tweet = " ";
		String type;
		String detail;
		String location;
		String latitudeString;
		String longitudeString;
		double latitude;
		double longitude;
		int start, finish;
		
		Scanner theScanner = new Scanner(System.in);
		
		System.out.println("Enter the tweet: ");
		tweet = theScanner.nextLine();
		
		start = tweet.indexOf("#") + 5;
		finish = tweet.indexOf(";");
		type = tweet.substring(start,finish);
		type = type.toUpperCase();
		System.out.println("Type:\t\t" + type);
		tweet = tweet.substring(finish + 1);
		
		start = tweet.indexOf("#") + 5;
		finish = tweet.indexOf(";");
		detail = tweet.substring(start, finish);
		detail = detail.replace(',', '-');
		System.out.println("Detail:\t\t" + detail);
		tweet = tweet.substring(finish + 1);
		
		start = tweet.indexOf("#") + 5;
		finish = tweet.indexOf(";");
		location = tweet.substring(start,finish);
		location = location.replace(',', '-');
		System.out.println("Location:\t" + location);
		tweet = tweet.substring(finish + 1);
		
		start = tweet.indexOf("#") + 5;
		finish = tweet.indexOf(";");
		latitudeString = tweet.substring(start, finish);
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble();
		System.out.println("Latitude:\t" + latitude);
		tweet = tweet.substring(finish + 1);
		
		start = tweet.indexOf("#") + 5;
		finish = tweet.indexOf(";");
		longitudeString = tweet.substring(start,finish);
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		System.out.println("Longitude:\t" + longitude);


	}

}

