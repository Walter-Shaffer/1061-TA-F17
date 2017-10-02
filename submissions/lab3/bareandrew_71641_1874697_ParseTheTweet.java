
/*
* ParseTheTweet.java
* Author: Andrew Bare
* Submission Date: 9/22/17
*
* Purpose: This program accepts a simple numerical input of hours
* and calculates how much money the user would receive after taxes
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
		
		/*
		 * type: String
		o detail: String
		o location: String
		o latitudeString: String
		o longitudeString: String
		o latitude: double
		o longitude: double
		 */
		
		//Variabes to hold individual parts of tweet
		String type, detail, location, strLatitude, strLongitude;
		double latitude, longitude;
		
		//test variable for ease
		final String TEST = "#typ offer; #det free essential supplies 4 evacs pets.; #loc 2323 55th st, boulder; #lat 40.022; #lng -105.226;";
		//tweet = TEST;
		tweet = theScanner.nextLine();
		
		//replace commas
		tweet = tweet.replace(',', '-');
		
		//ints for substrings
		int start, finish;
		
		//Get the Type
		start = tweet.indexOf("#typ") +5;
		finish = tweet.indexOf(";");
		type = tweet.substring(start, finish);
		type = type.trim();
		type = type.toUpperCase();
		//new value of tweet
		tweet = tweet.substring(finish+1);
		
		//Get the Details
		start = tweet.indexOf("#det") +5;
		finish = tweet.indexOf(";");
		detail = tweet.substring(start, finish);
		detail = detail.trim();		
		//new value of tweet
		tweet = tweet.substring(finish+1);
		
		//Get the location
		start = tweet.indexOf("#loc") +5;
		finish = tweet.indexOf(";");
		location = tweet.substring(start, finish);
		location = location.trim();		
		//new value of tweet
		tweet = tweet.substring(finish+1);
		
		//Get the Latitude
		start = tweet.indexOf("#lat") +5;
		finish = tweet.indexOf(";");
		strLatitude = tweet.substring(start, finish);
		strLatitude = strLatitude.trim();		
		//new value of tweet
		tweet = tweet.substring(finish+1);
		
		//Get the Latitude
		start = tweet.indexOf("#lng") +5;
		finish = tweet.indexOf(";");
		strLongitude = tweet.substring(start, finish);
		strLongitude = strLongitude.trim();		
		//new value of tweet
		tweet = tweet.substring(finish+1);		
		
		//get a double value from the string
		theScanner=new Scanner(strLatitude);
		latitude = theScanner.nextDouble();
		//get a double value from the string
		theScanner=new Scanner(strLongitude);
		longitude = theScanner.nextDouble();
		
//		//practice
//		System.out.println("Extracted");
//		System.out.println(type);
//		System.out.println("Now it is");
//		System.out.println(tweet);
		
		//Print Statements
		System.out.print("Type:\t\t");
		System.out.println(type);
		System.out.print("Detail:\t\t");
		System.out.println(detail);
		System.out.print("Location:\t");
		System.out.println(location);
		System.out.print("Latitude:\t");
		System.out.println(latitude);
		System.out.print("Longitude:\t");
		System.out.println(longitude);
	}

}
