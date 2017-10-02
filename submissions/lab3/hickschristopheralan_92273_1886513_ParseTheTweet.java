
/*
 * ParseTheTweet.java
 * Author: Christopher Hicks
 * Submission Date 9/20/17
 * 
 * Purpose: Learn how to, declare and initialize strings. 
 * Learn how to use the scanner class.
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

	// Scanner
	import java.util.Scanner;
	
	public class ParseTheTweet {

	public static void main(String[] args) {
		
		

		// Scanner
		Scanner theScanner = new Scanner(System.in);
		
		// tweet
		String tweet = ("") + theScanner.nextLine();
		
		// Variables
		String type = ("#typ");
		String detail = ("#det");
		String location = ("#loc");
		String latitudeString = ("#lat");
		String longitudeString = ("#lng");
		
		// Integers
		int start = tweet.indexOf("#typ") + 5;
		int finish = tweet.indexOf(";");
		
		// Extract Start and Finish
		type = tweet.substring(start, finish);
		tweet = tweet.substring(finish+1) ;
		
		//String Tweet
		type = type.trim();
		tweet = tweet.trim();
		
		//String Detail
		start = tweet.indexOf("#det") + 5;
		finish = tweet.indexOf(";");
		detail = tweet.substring(start,finish);
		tweet = tweet.substring(finish+1);
		
		
		//String Location
		start = tweet.indexOf("#loc") + 5;
		finish = tweet.indexOf(";");
		location = tweet.substring(start,finish);
		tweet = tweet.substring(finish+1);
		
		
		//String latitude
		start = tweet.indexOf("#lat") + 5;
		finish = tweet.indexOf(";");
		latitudeString = tweet.substring(start,finish);
		tweet = tweet.substring(finish+1);
	
		
		//String longitude
		start = tweet.indexOf("#lng") + 5;
		finish = tweet.indexOf(";");
		longitudeString = tweet.substring(start,finish);
		tweet = tweet.substring(finish+1);
		
		
		//String TYPE UPPER CASE
		type = type.toUpperCase();
		
		//FORMATING OUTPUT 
		String replaceDetail = detail.replace(",","-");
		String replaceLocation = location.replace(",","-");
		
		//String latitude
		theScanner = new Scanner(latitudeString);
		double latitude = theScanner.nextDouble();
		theScanner.close();
		
		//String longitude
		theScanner = new Scanner(longitudeString);
		double longitude = theScanner.nextDouble();
		theScanner.close();
		
		//OUTPUT 
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + replaceDetail);
		System.out.println("Location:\t" + replaceLocation);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		
		
		
		
		
		
		
		
		
	}

	
		
	}
	
	
	