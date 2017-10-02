/*
* ParseTheTweet.java
* Author: Kevin Okinedo
* Submission Date: 9/21/17
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program uses methods of the String class to output formatted text through using the user input.
* Double and String variables store the input and String variables are concatenated with text for the output.
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
		
		String type, detail, location, latitudeString, longitudeString;
		double latitude, longitude;
		int finish, start;
		
	
		String tweet = " ";
		
		System.out.println("Enter tweet:");
		tweet = theScanner.nextLine();
		theScanner.close();
		
		start = tweet.indexOf("#typ") + 5;
		finish = tweet.indexOf(";");
		type = tweet.substring(start, finish);
		type = type.trim();
		tweet = tweet.substring(finish+1);

		start = tweet.indexOf("#det") + 5;
		finish = tweet.indexOf(";");
		detail = tweet.substring(start, finish);
		detail = detail.trim();
		tweet = tweet.substring(finish+1);

		start = tweet.indexOf("#loc") + 5;
		finish = tweet.indexOf(";");
		location = tweet.substring(start, finish);
		location = location.trim();
		tweet = tweet.substring(finish+1);
	
		start = tweet.indexOf("#lat") + 5;
		finish = tweet.indexOf(";");
		latitudeString = tweet.substring(start, finish);
		latitudeString = latitudeString.trim();
		tweet = tweet.substring(finish+1);

		start = tweet.indexOf("#lng") + 5;
		finish = tweet.indexOf(";");
		longitudeString = tweet.substring(start, finish);
		longitudeString = longitudeString.trim();
		tweet = tweet.substring(finish+1);
		
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble();
		type = type.toUpperCase();
		theScanner.close();
	
	
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		detail = detail.replace("," ,"-");
		location = location.replace("," ,"-");
		theScanner.close();
		
		System.out.println("Type:" + "\t\t" + type);
		System.out.println("Detail:" + "\t\t" + detail);
    	System.out.println("Location:" + "\t" + location);
    	
		System.out.println("Latitude:" + "\t" + latitude);
		System.out.println("Longitude" + "\t" + longitude);
		
		
	}

}

