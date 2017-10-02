/*
* ParseTheTweet.java
* Author: Daniel Christensen
* Submission Date: 9/22/2017
*
* Purpose: This program interprets correctly formatted tweets,
* and presents the type of tweet, details of the tweet, location, latitude and longitude 
* all of which are included in the tweet provided that it is correctly formatted.
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
		String tweet = ""; //initializes the variable tweet
		String type;// declaration of variables for future use
		String detail;
		String location;
		String latitudeString;
		String longitudeString;
		double latitude;
		double longitude;
		
		tweet = theScanner.nextLine(); // assigns the variable tweet to the tweet input
		
		int start;
		int finish;
		
		start = tweet.indexOf('#') + 5;// finds first hashtag and creates a start index at the beginning of the ensuing string
		finish = tweet.indexOf(';');// finds the end of the information for a given hashtag
		
		type = tweet.substring(start, finish);// assigns the information after #typ to type
		type = type.trim();// removes excess blank space
		
		tweet = tweet.substring(finish+1);// deletes already processed part of tweet i.e. the semicolon and everything before it
		
		start = tweet.indexOf('#') + 5;
		finish = tweet.indexOf(';');
		
		detail = tweet.substring(start, finish);
		detail = detail.trim();
		
		tweet = tweet.substring(finish+1);
		
		start = tweet.indexOf('#') + 5;
		finish = tweet.indexOf(';');
		
		location = tweet.substring(start, finish);
		location = location.trim();
		
		tweet = tweet.substring(finish+1);
		
		start = tweet.indexOf('#') + 5;
		finish = tweet.indexOf(';');
		
		latitudeString = tweet.substring(start, finish);
		latitudeString = latitudeString.trim();
		
		tweet = tweet.substring(finish+1);
		
		start = tweet.indexOf('#') + 5;
		finish = tweet.indexOf(';');
		
		longitudeString = tweet.substring(start, finish);
		longitudeString = longitudeString.trim();
		
		tweet = tweet.substring(finish+1);
		
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble();//creates a double value for what was a string of numbers
		
        theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		
		type = type.toUpperCase();// formats the type to upper case as desired
		
		detail = detail.replace(',','-');// replaces commas with hyphens as desired
		location = location.replace(',', '-');
		
		System.out.println("Type:\t\t" + type);// prints the desired characteristics of the tweet
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t\t" + location);
		System.out.println("Latitude:\t\t" + latitude);
		System.out.println("Longitude:\t\t" + longitude);
		

	}

}
