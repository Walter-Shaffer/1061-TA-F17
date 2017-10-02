/*
* ParseTheTweet.java
* Author: Karmen Brooks
* Submission Date: 9/22/17
*
* Purpose: Reads a tweet inserted into keyboard and classifies it
* based on its type.
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
		String tweet = ("");
		
		String type = "Type:";
		String detail = "Detail:";
		String location = "Location:";
		String latitudeString = "Latitude:";
		String longitudeString = "Longitude:";
		double latitude;
		double longitude;
		
		tweet = theScanner.nextLine();
		
		int start;
		int finish;
		
		//
		
		start = tweet.indexOf("#typ" + 5);
		finish = tweet.indexOf(";");
		
		type = tweet.substring(start, finish);
		
		String newType= type.trim();
		tweet = tweet.substring(finish+1);
		
		//
		
		start = tweet.indexOf("#det" + 5);
		finish = tweet.indexOf(";");
		
		detail = tweet.substring(start, finish);
		
		String newDetail= detail.trim();
		tweet = tweet.substring(finish+1);
		
		//
		
		start = tweet.indexOf("#loc" + 5);
		finish = tweet.indexOf(";");
		
		location = tweet.substring(start, finish);
		
		String newLocation= location.trim();
		tweet = tweet.substring(finish+1);
		
		//
		
		start = tweet.indexOf("#lat" + 5);
		finish = tweet.indexOf(";");
		
		latitudeString = tweet.substring(start, finish);
		
		String newlatitudeString= latitudeString.trim();
		tweet = tweet.substring(finish+1);
		
		//
		
		start = tweet.indexOf("#lng" + 5);
		finish = tweet.indexOf(";");
		
		longitudeString = tweet.substring(start, finish);
		
		String newlongitudeString= longitudeString.trim();
		tweet = tweet.substring(finish+1);
		
		//
		
		theScanner = new Scanner(latitudeString);
			latitude = theScanner.nextDouble();
		
		theScanner = new Scanner(longitudeString);
			longitude = theScanner.nextDouble();
		
		type.toUpperCase();
		
		
		//
		
		System.out.println(newType + "\t" + type);
		System.out.println(newDetail.replace( ',', '-') + "\t" + detail);
		System.out.println(newLocation.replace( ',', '-') + "\t" + location);
		System.out.println(newlatitudeString + "\t" + latitude);
		System.out.println(newlongitudeString + "\t" + longitude);
		
		
	}

}