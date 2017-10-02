/*
 * ParseTheTweet.java
 * Author: Jacky Wong
 * Submission Date: 9/21/17
 * 
 * Purpose: This is a program that processes a tweet and
 * displays the information in an easy-to-understand format.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance
 * with the policies at Clemson university and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the School of Computing
 * at Clemson University. Any publishing or posting
 * of source code for this project is strictly prohibited
 * unless you have written consent from the instructor.
 */

import java.util.Scanner;

public class ParseTheTweet {

	public static void main(String[] args){
		
		// Create a scanner class
		Scanner theScanner = new Scanner(System.in);
		
		// Declare variables
		String tweet = "";
		String type, detail, location, latitudeString, longitudeString = "";
		double latitude, longitude;
		
		// Read an input
		System.out.println("What is your tweet?" + "\n");
		tweet = theScanner.nextLine();
		
		// Declare more variables
		int start, finish;
		
		// Finding the values for the various 'hashtags'
		// type
		start = 5 + tweet.indexOf("#typ");
		finish = tweet.indexOf(";");
		type = tweet.substring(start, finish);
		type = type.trim();
		tweet = tweet.substring(finish + 1);
		
		// detail
		start = 5 + tweet.indexOf("#det");
		finish = tweet.indexOf(";");
		detail = tweet.substring(start, finish);
		detail = detail.trim();
		tweet = tweet.substring(finish + 1);
		
		// location
		start = 5 + tweet.indexOf("#loc");
		finish = tweet.indexOf(";");
		location = tweet.substring(start, finish);
		location = location.trim();
		tweet = tweet.substring(finish + 1);
		
		// latitudeString
		start = 5 + tweet.indexOf("#lat");
		finish = tweet.indexOf(";");
		latitudeString = tweet.substring(start, finish);
		latitudeString = latitudeString.trim();
		tweet = tweet.substring(finish + 1);
		
		//longitudeString
		start = 5 + tweet.indexOf("#lng");
		finish = tweet.indexOf(";");
		longitudeString = tweet.substring(start, finish);
		longitudeString = longitudeString.trim();
		tweet = tweet.substring(finish + 1);
		
		// Find the numerical values for latitude
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble();
		
		// Find the numerical values for longitude
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		
		// Make type all caps
		type = type.toUpperCase();
		
		// Replace commas with hypens in detail and location
		detail = detail.replace(",", "-");
		location = location.replace(",", "-");
		
		// Print all variables
		System.out.println("\n" + "Type:" + "\t" + "\t" + type);
		System.out.println("Detail:" + "\t" + "\t" + detail);
		System.out.println("Location:" + "\t" + location);
		System.out.println("Latitude:" + "\t" + latitude);
		System.out.println("Longitude:" + "\t" + longitude);
		
	}
	
}
