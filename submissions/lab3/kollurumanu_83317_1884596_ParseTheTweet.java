/* 
 * ParseTheTweet.java
 * Author : Manu Kolluru
 * Submission Date: 9/22 /17
 * Purpose : To use the string class in tweets.
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

	public static void main (String [] args){
		
		Scanner theScanner = new Scanner (System.in);
		
		String tweet = "";
		
		String type;
		String detail;
		String location;
		String latitudeString ;
		String longitudeString;
		double latitude;
		double longitude;
		
		System.out.println("Enter a tweet");
		tweet = theScanner.nextLine();
		
		//store start and end indexes of substrings
		int start;
		int finish;
		// type
		start = tweet.indexOf("#typ") + 5 ;
		
		finish = tweet.indexOf(";");
		
		tweet.trim ();
		
		type = tweet.substring(start, finish);
		
		
		tweet = tweet.substring(finish +1);
		
		// detail
		start = tweet.indexOf("#det") + 5 ;
		
		finish = tweet.indexOf(";");
		
		
		tweet.trim ();
		detail = tweet.substring(start, finish);
		
		
		tweet = tweet.substring(finish +1);
		
		//location
		start = tweet.indexOf("#loc") + 5 ;
		
		finish = tweet.indexOf(";");
		
		
		tweet.trim ();
		location = tweet.substring(start, finish);
		
		tweet = tweet.substring(finish +1);
		
		//LAtitude String
		start = tweet.indexOf("#lat") + 5 ;
		
		finish = tweet.indexOf(";");
		
		
		tweet.trim ();
		
		latitudeString = tweet.substring(start, finish);
		
		tweet = tweet.substring(finish +1);
		
		//Longitude String
		start = tweet.indexOf("#lng") + 5 ;
		
		finish = tweet.indexOf(";");
		
		
		tweet.trim ();
		longitudeString = tweet.substring(start, finish);
		
		
		tweet = tweet.substring(finish +1);
		
		// get doubles for scanner
		theScanner = new Scanner (longitudeString);
		longitude = theScanner.nextDouble();
		
		// get doubles for latitude
		theScanner = new Scanner (latitudeString);
		latitude = theScanner.nextDouble();
		
		
		
		//print statements
		System.out.println("Type : "+ "\t" + "\t" + type.toUpperCase());
		System.out.println("Detail :"+ "\t" + detail.replace(",", "-") );
		System.out.println("Location :" + "\t"+ location.replace("," , "-") );
		System.out.println("Latitude :" + "\t" +latitude);
		System.out.println("Longitude :" + "\t" +longitude);
		
		
		

		
	}
}
