/*
* [ParseTheTweet].java
* Author: [Andrew Padgett]
* Submission Date: [9/19/17]
*
* Purpose: Scans tweets written during disasters for important 
* 		   info marked by code words
* 		   that signify the beginning of specific information
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

import java.util.Scanner;				//import scanner

public class ParseTheTweet {

	public static void main(String[] args) {
		Scanner theScanner = new Scanner(System.in);		//create new scanner
		
		String tweet = "";					//declare strings and variables
		String type = "";
		String detail = "";
		String location = "";
		String latitudeString = "";
		String longitudeString = "";
		double latitude;
		double longitude;
		
		System.out.print("Enter Tweet: ");				//prompt user to enter tweet
		tweet = theScanner.nextLine();
		theScanner.close();								//close scanner
		
		int start = tweet.indexOf("#typ") + 5;			//parse tweets for important data
		int finish = tweet.indexOf(';');
		
		type = tweet.substring(start, finish);
		type = type.trim();
		
		tweet = tweet.substring(finish + 1);
		
		
		start = tweet.indexOf("#det") + 5;
		finish = tweet.indexOf(';');
		
		detail= tweet.substring(start, finish);
		detail = detail.trim();
		
		tweet = tweet.substring(finish + 1);
		
		
		start = tweet.indexOf("#loc") + 5;
		finish = tweet.indexOf(';');
		
		location = tweet.substring(start, finish);
		location = location.trim();
		
		tweet = tweet.substring(finish + 1);
		
		
		start = tweet.indexOf("#lat") + 5;
		finish = tweet.indexOf(';');
		
		latitudeString = tweet.substring(start, finish);
		latitudeString = latitudeString.trim();
		
		tweet = tweet.substring(finish + 1);

		
		start = tweet.indexOf("#lng") + 5;
		finish = tweet.indexOf(';');
		
		longitudeString = tweet.substring(start, finish);
		longitudeString = longitudeString.trim();
		
		tweet = tweet.substring(finish + 1);
		
		
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble();
		theScanner.close();
		
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		theScanner.close();
		
		System.out.println("\nType:\t\t" + type.toUpperCase());						//print output
		System.out.println("Detail:\t\t" + detail.replace(',', '-'));
		System.out.println("Location:\t" + location.replace(',', '-'));
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);

	}

}
