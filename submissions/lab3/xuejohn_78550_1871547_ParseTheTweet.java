/*
 * ParseTheTweet.java
 * Author: John Xue
 * Submission Date: Sept. 19, 2017
 *
 * Purpose: Parse tweets in the "Tweak the Tweet" format
 * in order to extract crucial information.
 *
 * Statement of Academic Honesty:
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized assistance
 * or plagiarism will be handled in accordance with the policies at
 * Clemson University and the policies of this course. I recognize that my
 * work is based on an assignment created by the School of Computing at
 * Clemson University. Any publishing or posting of source code
 * for this project is strictly prohibited unless you have written
 * consent from the instructor.
 */

import java.util.Scanner;

public class ParseTheTweet {
	public static void main(String[] args) {
		Scanner theScanner = new Scanner(System.in);
		String tweet = theScanner.nextLine();
		theScanner.close();
		
		String type;
		String detail;
		String location;
		String latitudeString;
		String longitudeString;
		double latitude;
		double longitude;
		int start, finish;
		
		//type
		start = tweet.indexOf("#typ") + 5;
		finish = tweet.indexOf(";");
		type = tweet.substring(start,finish).trim().toUpperCase();
		tweet = tweet.substring(finish+1);
		
		// detail
		start = tweet.indexOf("#det") + 5;
		finish = tweet.indexOf(";");
		detail = tweet.substring(start,finish).trim().replace(",", "-");
		tweet = tweet.substring(finish+1);
		
		// location
		start = tweet.indexOf("#loc") + 5;
		finish = tweet.indexOf(";");
		location = tweet.substring(start,finish).trim().replace(",", "-");
		tweet = tweet.substring(finish+1);
		
		// latitude
		start = tweet.indexOf("#lat") + 5;
		finish = tweet.indexOf(";");
		latitudeString = tweet.substring(start,finish).trim();
		tweet = tweet.substring(finish+1);
		
		// longitude
		start = tweet.indexOf("#lng") + 5;
		finish = tweet.indexOf(";");
		longitudeString = tweet.substring(start,finish).trim();
		tweet = tweet.substring(finish+1);
		
		// convert from string to double
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble();
		theScanner.close();
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		theScanner.close();
		
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
	}
}
