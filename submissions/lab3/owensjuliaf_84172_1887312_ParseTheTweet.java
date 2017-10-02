/*
* ParseTheTweet.java
* Author: Julia Owens
* Submission Date: 9/21/2017
*
* Purpose: To read information that follows hashtags and 
* convert it into a more readable list. 
*
* Statement of Academic Honesty:
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
public class ParseTheTweet
{
	public static void main(String[] args)
	{
		Scanner theScanner= new Scanner(System.in);
		String tweet;
		double latitude, longitude;
		String type, detail, location, latitudeString, longitudeString;
		System.out.println("Enter the tweet.");
		tweet= theScanner.nextLine();
		int start, finish;
		
		start= tweet.indexOf("#typ") + 5;
		finish= tweet.indexOf(";");
		type= tweet.substring(start, finish);
		type= type.trim();
		type= type.toUpperCase();
		System.out.println("\nType: " + type);
		tweet= tweet.substring(finish + 1);
		
		start= tweet.indexOf("#det") + 5;
		finish= tweet.indexOf(";");
		detail= tweet.substring(start, finish);
		detail= detail.trim();
		System.out.println("Details: " + detail);
		tweet= tweet.substring(finish + 1);
		
		start= tweet.indexOf("#loc") + 5;
		finish= tweet.indexOf(";");
		location= tweet.substring(start, finish);
		location= location.trim();
		System.out.println("Location: " + location);
		tweet= tweet.substring(finish + 1);
		
		start= tweet.indexOf("#lat") + 5;
		finish= tweet.indexOf(";");
		latitudeString= tweet.substring(start, finish);
		latitudeString= latitudeString.trim();
		tweet= tweet.substring(finish + 1);
		
		start= tweet.indexOf("#lng") + 5;
		finish= tweet.indexOf(";");
		longitudeString= tweet.substring(start, finish);
		longitudeString= longitudeString.trim();
		
		theScanner = new Scanner(latitudeString);
		latitude= theScanner.nextDouble();
		System.out.println("Latitude: " + latitude);
		
		theScanner = new Scanner(longitudeString);
		longitude= theScanner.nextDouble();
		System.out.println("Longitude: " + longitude);
	}

}