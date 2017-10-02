/*
* ParseTheTweet.java
* Author: Kyle Lamoureux
* Submission Date: 9/19/17
*
* Purpose: To parse various tweets for information.
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
		
		// Setting Parameters and User Interface
		
		Scanner theScanner = new Scanner(System.in);
		System.out.print("Enter your tweet: ");
		
		String tweet = "";
		tweet = theScanner.nextLine();
		String type = "#typ";
		String detail = "#det";
		String location = "#loc";
		String latitudeString = "#lat";
		String longitudeString = "lng";
		Double latitude = 0.0;
		Double longitude = 0.0;
		
		int start;
		int finish;
		
		//Identify Type
		
		int Index = tweet.indexOf(type);
		start = Index + 5;
		int SemiIndex = tweet.indexOf(";");
		finish = SemiIndex;
		
		String substring = tweet.substring(start, finish);
		System.out.println("Type: \t\t" + substring.toUpperCase());
		
		
		//Identify Details
		
		Index = tweet.indexOf(detail);
		start = Index + 5;
		SemiIndex = tweet.indexOf(";", SemiIndex +1);
		finish = SemiIndex;
		
		substring = tweet.substring(start, finish);
		System.out.println("Detail: \t" + substring.replace(",", "-"));
		
		//Identify Location
		
		Index = tweet.indexOf(location);
		start = Index + 5;
		SemiIndex = tweet.indexOf(";", SemiIndex + 1);
		finish = SemiIndex;
				
		substring = tweet.substring(start, finish);
		System.out.println("Location: \t" + substring.replace(",", "-"));
		
		//Identify Latitude
		
		Index = tweet.indexOf(latitudeString);
		start = Index + 5;
		SemiIndex = tweet.indexOf(";", SemiIndex + 1);
		finish = SemiIndex;
		
		substring = tweet.substring(start, finish);
		
		theScanner = new Scanner(substring);
		latitude = theScanner.nextDouble();
						
		System.out.println("Latitude: \t" + latitude);
		
		//Identify Longitude
		
		Index = tweet.indexOf(longitudeString);
		start = Index + 5;
		SemiIndex = tweet.indexOf(";", SemiIndex + 1);
		finish = SemiIndex;
				
		substring = tweet.substring(start, finish);
				
		theScanner = new Scanner(substring);
		longitude = theScanner.nextDouble();
								
		System.out.println("Longitude: \t" + longitude);
		
		
		
		
	}

}