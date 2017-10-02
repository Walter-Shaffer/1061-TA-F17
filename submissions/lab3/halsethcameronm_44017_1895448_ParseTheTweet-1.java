/*
 * ParseTheTweet.java
 * Author: Cameron Halseth
 * Submission Date: 9/22/2017
 * 
 * Purpose: The purpose of this program is to practice working with the
 * String class. Specific skills for this program include declaring,
 * initializing, and assigning variables of type String, as well as using
 * methods of the String class to perform string processing.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither 
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized 
 * assistance or plagiarism will be handed in accordance
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
		
		// Prompt the user to enter a tweet
		System.out.print("Enter a tweet: ");
		tweet = theScanner.nextLine();
		int start;
		int finish;
		
		// Steps for type
		start = tweet.indexOf("#typ");
		start = start + 5;
		finish = tweet.indexOf(';');
		type = tweet.substring(start, finish);
		type = type.trim();
		tweet = tweet.substring(finish + 1);
		
		// Steps for detail
		start = tweet.indexOf("#det");
		start = start + 5;
		finish = tweet.indexOf(';');
		detail = tweet.substring(start, finish);
		detail = detail.trim();
		tweet = tweet.substring(finish + 1);
		
		// Steps for location
		start = tweet.indexOf("#loc");
		start = start + 5;
		finish = tweet.indexOf(';');
		location = tweet.substring(start, finish);
		location = location.trim();
		tweet = tweet.substring(finish + 1);
		
		// Steps for latitude string
		start = tweet.indexOf("#lat");
		start = start + 5;
		finish = tweet.indexOf(';');
		latitudeString = tweet.substring(start, finish);
		latitudeString = latitudeString.trim();
		tweet = tweet.substring(finish + 1);
		
		// Steps for longitude string
		start = tweet.indexOf("#lng");
		start = start + 5;
		finish = tweet.indexOf(';');
		longitudeString = tweet.substring(start, finish);
		longitudeString = longitudeString.trim();
		tweet = tweet.substring(finish + 1);
		
		// Obtain numerical value for latitude
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble();
		
		// Obtain numerical value for longitude
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		
		// Modify output appearance for type, detail, and location
		type = type.toUpperCase();
		detail = detail.replace(',', '-');
		location = location.replace(',', '-');
		
		// Produce formatted output
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		
	}

}
