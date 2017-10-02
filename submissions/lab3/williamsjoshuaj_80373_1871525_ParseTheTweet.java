/*
* ParseTheTweet.java
* Author: Joshua Williams
* Submission Date: 9/19/17
*
* Purpose: 
* 	The program will allow the user to type in a formatted tweet. The program then breaks that tweet
* down into substrings and assigns those to seperate string variables for further manipulation.  It also
* converts strings that look like doubles into actual double variables by using the Scanner class
* so that they may be used as numbers in further code.
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
		String tweet = "";
		String type,detail,location,latitudeString,longitudeString;
		double latitude,longitude;
		int start,finish;
		Scanner theScanner = new Scanner(System.in);
		tweet = theScanner.nextLine();//Allowing the user to type in the tweet and assign that to tweet
		//Getting the value of type out of tweet through substring manipulation
		start = tweet.indexOf("#type") + 5;
		finish = tweet.indexOf(";");
		type = tweet.substring(start,finish);
		type = type.trim();
		tweet = tweet.substring(finish+1);
		//Getting the value of detail out of tweet through substring manipulation
		start = tweet.indexOf("#det") + 5;
		finish = tweet.indexOf(";");
		detail = tweet.substring(start,finish);
		detail = detail.trim();
		tweet = tweet.substring(finish+1);
		//Getting the value of location out of tweet through substring manipulation
		start = tweet.indexOf("#loc") + 5;
		finish = tweet.indexOf(";");
		location = tweet.substring(start,finish);
		location = location.trim();
		tweet = tweet.substring(finish+1);
		//Getting the value of latitudeString out of tweet through substring manipulation
		start = tweet.indexOf("#lat") + 5;
		finish = tweet.indexOf(";");
		latitudeString = tweet.substring(start,finish);
		latitudeString = latitudeString.trim();
		tweet = tweet.substring(finish+1);
		//Getting the value of longitudeString out of tweet through substring manipulation
		start = tweet.indexOf("#lng") + 5;
		finish = tweet.indexOf(";");
		longitudeString = tweet.substring(start,finish);
		longitudeString = longitudeString.trim();
		tweet = tweet.substring(finish+1);
		
		type = type.toUpperCase();
		detail = detail.replace(',', '-');
		location = location.replace(',', '-');
		
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble();
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		theScanner.close();
		
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
	}
}
