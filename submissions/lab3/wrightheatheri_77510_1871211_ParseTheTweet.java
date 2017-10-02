/*
* CreditCardPayOff.java
* Author: Heather Wright
* Submission Date: September 19, 2017
*
* Purpose: This program takes input from the user, in the form of a tweet.
* It then sets start equal to the beginning of the phrase following 
* #typ and finish equal to index of ;. The string type is then given the
* text between start and finish. Type is then trimmed to remove blank space
* and made capital. Tweet is then set to the index following the ; or finish.
* This is then repeated for det, loc, lat, and lng. The system then 
* outputs the characters in each of these string which is the result. 
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
		
		int start;
		int finish;
		
		double latitude;
		double longitude;
		
		String type;
		String detail;
		String location;
		String latitudeString;
		String longitudeString;
		
		tweet = theScanner.nextLine();
			
		start = tweet.indexOf("#typ") + 5;
		finish = tweet.indexOf(";");
		type = tweet.substring(start, finish);
		type = type.trim();
		type = type.toUpperCase();
		tweet = tweet.substring(finish + 1);
		
		start = tweet.indexOf("#det") + 5;
		finish = tweet.indexOf(";");
		detail = tweet.substring(start, finish);
		detail = detail.trim();
		detail = detail.replace(',', '-');
		tweet = tweet.substring(finish + 1);
		
		start = tweet.indexOf("#loc") + 5;
		finish = tweet.indexOf(";");
		location = tweet.substring(start, finish);
		location = location.trim();
		location = location.replace(',', '-');
		tweet = tweet.substring(finish + 1);
		
		start = tweet.indexOf("#lat") + 5;
		finish = tweet.indexOf(";");
		latitudeString = tweet.substring(start, finish);
		latitudeString = latitudeString.trim();
		tweet = tweet.substring(finish + 1);
		
		start = tweet.indexOf("#lng") + 5;
		finish = tweet.indexOf(";");
		longitudeString = tweet.substring(start, finish);
		longitudeString = longitudeString.trim();
		tweet = tweet.substring(finish + 1);
		
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble();
		
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		
		System.out.println("Type:\t\t\t" + type);
		System.out.println("Detail:\t\t\t" + detail);
		System.out.println("Location:\t\t" + location);
		System.out.println("Latitude:\t\t" + latitude);
		System.out.println("Longitude:\t\t" + longitude);
		
		theScanner.close();
	}
	
}
