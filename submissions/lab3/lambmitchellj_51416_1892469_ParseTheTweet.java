/*
 * ParseTheTweet.java
 * Author: Mitchell Lamb
 * Submission Date: 9/19/2017
 * 
 * Purpose: The purpose of this program is to make classifying tweets sent out during disasters more
 * easily, so the computer can find peoples' locations and what disaster is occurring.
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
		System.out.print("Enter a tweet:\t");
		String tweet = theScanner.nextLine();
		String type;
		String detail;
		String location;
		String latitudeString;
		String longitudeString;
		double latitude;
		double longitude;
		int start = tweet.indexOf("#typ");
		int finish = tweet.indexOf(";");
		type = tweet.substring(start+5, finish);
		type = type.trim();
		tweet = tweet.substring(finish+1);
		start = tweet.indexOf("#det");
		finish = tweet.indexOf(";");
		detail = tweet.substring(start+5, finish);
		detail = detail.trim();
		tweet = tweet.substring(finish+1);
		start = tweet.indexOf("#loc");
		finish = tweet.indexOf(";");
		location = tweet.substring(start+5, finish);
		location = location.trim();
		tweet = tweet.substring(finish+1);
		start = tweet.indexOf("#lat");
		finish = tweet.indexOf(";");
		latitudeString = tweet.substring(start+5, finish);
		latitudeString = latitudeString.trim();
		tweet = tweet.substring(finish+1);
		start = tweet.indexOf("#lng");
		finish = tweet.indexOf(";");
		longitudeString = tweet.substring(start+5, finish);
		longitudeString = longitudeString.trim();
		tweet = tweet.substring(finish+1);
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble();
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		type = type.toUpperCase();
		detail = detail.replace(',', '-');
		location = location.replace(',', '-');
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);

	}

}
