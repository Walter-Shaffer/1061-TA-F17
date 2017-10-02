/*
* ParseTheTweet.java
* Author: James Hogan
* Submission Date: 9/19/2017
*
* Purpose: ParseTheTweet extracts information from the tweet and prints the available data in a readable format
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
public class ParseTheTweet 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String tweet = "";
		String type = "";
		String detail = "";
		String location = "";
		String latitudeString = "";
		String longitudeString = "";
		double latitude = 0;
		double longitude = 0;
		int start = 0;
		int finish = 0;
		
		tweet = input.nextLine();
		start = tweet.indexOf("#typ")+5;
		finish = tweet.indexOf(";");
		type = tweet.substring(start, finish);
		type.trim();
		tweet = tweet.substring(finish +1);
		start = tweet.indexOf("#det")+5;
		finish = tweet.indexOf(";");
		detail = tweet.substring(start, finish);
		detail.trim();
		tweet = tweet.substring(finish +1);
		start = tweet.indexOf("#loc")+5;
		finish = tweet.indexOf(";");
		location = tweet.substring(start, finish);
		location.trim();
		tweet = tweet.substring(finish +1);
		start = tweet.indexOf("#lat")+5;
		finish = tweet.indexOf(";");
		latitudeString = tweet.substring(start, finish);
		latitudeString.trim();
		tweet = tweet.substring(finish +1);
		start = tweet.indexOf("#lng")+5;
		finish = tweet.indexOf(";");
		longitudeString = tweet.substring(start, finish);
		longitudeString.trim();
		tweet = tweet.substring(finish +1);
		
		input = new Scanner(latitudeString);
		latitude = input.nextDouble();
		
		input = new Scanner(longitudeString);
		longitude = input.nextDouble();
		
		type = type.toUpperCase();
		detail = detail.replace(',', '-');
		location = location.replace(',', '-');
		
		System.out.println("Type: \t\t" + type + "\n" + "Detail: \t" + detail + "\n" + "Location: \t" + location + "\n" + "Latitude: \t" + latitude + "\n" + "Longitude: \t" + longitude);
	}
}
