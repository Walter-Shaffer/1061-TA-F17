/*
 * ParseTheTweet.java 
 * Author: Davis Robertson
 * Submission Date: 9/22/17
 * 
 * Purpose: To gain full understanding of the different
 * functions of the string class.
 * 
 * Statement of Academic Honesty:
 * 
 *  The following code represents my own work. I have neither
 *  received nor given inappropriate assistance. I have not copied
 *  or modified code from any source other than the course webpage
 *  or the course textbook. I recognize that any unauthorized
 *  assistance or plagiarism will be handled in accordance
 *  with the policies at Clemson University and the
 *  policies of this course. I recognize that my work is based
 *  on an assignment created by the School of Computing
 *  at Clemson University. Any publishing or posting
 *  of source code for this project is strictly prohibited
 *  unless you have written consent from the instructor. 
 */
import java.util.Scanner;
public class ParseTheTweet {
	

	public static void main(String[] args) {
		Scanner theScanner = new Scanner(System.in);
		
		String tweet = "";
		String type;
		String location;
		String detail;
		String latitudeString;
		String longitudeString;
		double latitude;
		double longitude;
		int start;
		int finish;
		
		tweet = theScanner.nextLine();
	    
		start = tweet.indexOf("#typ") + 5;
		finish = tweet.indexOf(";");
		type = tweet.substring(start,finish);
		type = type.trim();
		tweet = tweet.substring(finish+1);
		
		start = tweet.indexOf("#det") + 5;
		finish = tweet.indexOf(";");
		detail = tweet.substring(start,finish);
		detail = detail.trim();
		tweet = tweet.substring(finish+1);
		
		start = tweet.indexOf("#loc") + 5;
		finish = tweet.indexOf(";");
		location = tweet.substring(start,finish);
		location = location.trim();
	    tweet = tweet.substring(finish+1);
	    
		
		start = tweet.indexOf("#lat") + 5;
		finish = tweet.indexOf(";");
		latitudeString = tweet.substring(start,finish);
		latitudeString = latitudeString.trim();
		tweet = tweet.substring(finish+1);
		
		start = tweet.indexOf("#lng") + 5;
		finish = tweet.indexOf(";");
		longitudeString = tweet.substring(start,finish);
		longitudeString = longitudeString.trim();
		tweet = tweet.substring(finish+1);
		
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble();
		
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		
		
		System.out.println("Type:\t\t" + type.toUpperCase());
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
	}

}


