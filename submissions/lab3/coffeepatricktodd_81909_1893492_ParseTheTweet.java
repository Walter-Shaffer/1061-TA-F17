/*
* ParseTheTweet.java
* Author: Patrick Coffee
* Submission Date: 9/19/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* It scans twitter using specific hashtags and locates 
* tweets that have something to do with emergencies.
* 
* 
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
		// TODO Auto-generated method stub
		
		Scanner theScanner = new Scanner(System.in);
		String tweet = "";
		tweet = theScanner.nextLine();
			String type = new String("type");
			String detail; new String("detail");
			String location; new String("location");
			String latitudeString; new String("latitudeString");
			String longitudeString; new String("longitudeString");
			
			double latitude;			
			double longitude;
			
		String readText = theScanner.nextLine();	
			int start;
			int finish;
			
				start = tweet.indexOf("#typ")+5;
				finish = tweet.indexOf(";");
				type = tweet.substring(start, finish);
				type.trim();
				tweet = tweet.substring(finish+1);
			
				start = tweet.indexOf("#det")+5;
				finish = tweet.indexOf(";");
				detail = tweet.substring(start, finish);
				detail.trim();
				tweet = tweet.substring(finish+1);
			
				start = tweet.indexOf("#loc") + 5;
				finish = tweet.indexOf(";");
				location = tweet.substring(start, finish);
				location.trim();
				tweet = tweet.substring(finish+1);
			
				start = tweet.indexOf("#lat") + 5;
				finish = tweet.indexOf(";");
				latitudeString = tweet.substring(start, finish);
				latitudeString.trim();
				tweet = tweet.substring(finish+1);
			
				start = tweet.indexOf("#lng") + 5;
				finish = tweet.indexOf(";");
				longitudeString = tweet.substring(start, finish);
				longitudeString.trim();
				tweet = tweet.substring(finish+1);
			
			theScanner = new Scanner(latitudeString);
			latitude = theScanner.nextDouble();
			theScanner = new Scanner(longitudeString);
			longitude = theScanner.nextDouble();
			
			type = type.toUpperCase();
			String s1 = detail;
			String replaceString = s1.replace(',','-');
			String s2 = location;
			String replaceString2 = s2.replace(',','-');
			
			System.out.print("Type:\t\t" + type);
			System.out.println();
			System.out.print("Detail:\t\t" + replaceString);
			System.out.println();
			System.out.print("Location: \t" + replaceString2);
			System.out.println();
			System.out.print("Latitude: \t" + latitude);
			System.out.println();
			System.out.print("Longitude: \t" + longitude);
	}

	

}
