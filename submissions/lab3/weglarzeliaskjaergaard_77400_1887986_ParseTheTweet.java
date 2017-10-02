/*
* ParseTheTweet.java
* Author: Elias Weglarz
* Submission Date: 9/21/17
*
* Purpose: Use methods to to process messages from twitter used in disaster relief to help locate
* those in need during natural disasters.
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
		double  latitude ,longitude;
		String tweet;
		int start ,finish;
		String type  ,detail ,location ,latitudeString ,longitudeString;
		tweet = theScanner.nextLine();
		
		start = tweet.indexOf('#')+ 5;
		finish = tweet.indexOf(';');
		type = tweet.substring(start ,finish); 
		type = type.trim();
		
		start = tweet.indexOf('#', finish) + 5;
		finish = tweet.indexOf(';', start);
		detail = tweet.substring(start ,finish);
		detail = detail.trim();

		start = tweet.indexOf('#', finish) + 5; 
		finish = tweet.indexOf(';', start);
		location = tweet.substring(start, finish);
		location = location.trim();
		
		start = tweet.indexOf('#', finish) + 5;
		finish = tweet.indexOf(';', start);
		latitudeString = tweet.substring(start ,finish);
		latitudeString = latitudeString.trim();
		
		start = tweet.indexOf('#', finish) + 5;
		finish = tweet.indexOf(';', start);
		longitudeString = tweet.substring(start ,finish);
		longitudeString = longitudeString.trim();
	
		type = type.toUpperCase();
		detail = detail.replace(',' ,'-');
		location = location.replace(',' ,'-');
		
		
		System.out.println("Type: \t \t" + type);
		System.out.println("Detail: \t" + detail);
		System.out.println("Location: \t" + location);
		System.out.println("Latitude: \t" + latitudeString);
		System.out.println("Longitude: \t" + longitudeString);
	}

}