/*
* [Introduction to Java 1061].java
* Author:  [Trevon Wilson]
* Submission Date:  [9/19/17]
* Purpose: A brief paragraph description of the * program. What does it do?
* The purpose of the program is to depict tweets during a disaster that shows people's location. We will be using strings to show their location.
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
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
		String tweet = "";
		Scanner theScanner = new Scanner(System.in);
		String type = new String("");
		String detail = new String("");
		String location = new String("");
		String latitudeString = new String("");
		String longitudeString = new String("");
		double latitude;
		double longitude;
		
		tweet = theScanner.nextLine();
		int start;
		int finish;
		
		start = tweet.indexOf("#typ") + 5; 
		finish = tweet.indexOf(";");
		
		type = tweet.substring(start, finish);
		type = type.trim();
		
		tweet = tweet.substring(finish + 1);
		
		start = tweet.indexOf("#det") + 5; 
		finish = tweet.indexOf(";");
		
		detail = tweet.substring(start, finish);
		detail= detail.trim();
		
		tweet = tweet.substring(finish + 1);
		
		start = tweet.indexOf("#loc") + 5; 
		finish = tweet.indexOf(";");
		
		location = tweet.substring(start, finish);
		location = location.trim();
		
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
		latitude = Scanner.nextDouble();
		
		theScanner = new Scanner(longitudeString);
		longitude = Scanner.nextDouble();
		
		type = type.toUpperCase();
		
		detail = detail.replace(",", "-");
		location = location.replace(",", "-");
		
		System.out.println("type");
		System.out.println(detail);
		System.out.println(location);
		System.out.println(latitude);
		System.out.println(longitude);

	}

}
