//import the scanner
import java.util.Scanner;

//beginning of class
public class ParseTheTweet {

	/*
	* ParseTheTweet.java
	* Author: Taylor Hennessy
	* Submission Date: 9/21/2017
	*
	* Purpose: This program gathers data from a tweet and separates 
	* it into separate data categories based on its tag (which 
	* indicates the type of data it is).
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
	//scanner object to read 
	public static Scanner theScanner = new Scanner(System.in);
	
	
	//main method
	public static void main(String[] args) {
		
		//------------------------------VARIABLES----------------------
		//tweet variable
		String tweet = "";
		
		//tweet data variables
		String type;
		String detail;
		String location;
		String latitudeString;
		String longitudeString;
		double latitude;
		double longitude;
		
		//integers to store start and end indexes for substrings
		int start;
		int finish;
		
		//---------------------------------CODE------------------------
		
		//prompt for tweet
		System.out.println("Please enter tweet data:");
		
		//give a value to the tweet (using the scanner, get it from the user)
		tweet = theScanner.nextLine();
		
		
		//TYPE
		//get the start and end of the type 
		start = tweet.indexOf("#typ") + 5;
		finish = tweet.indexOf(";");
		
		//assign the substring to type
		type = tweet.substring(start, finish);
		type = type.trim();
		
		//cut down tweet using the substring, starting after the semicolon
		tweet = tweet.substring((finish + 1));
		
		
		//DETAIL
		//get the start and end of the detail 
		start = tweet.indexOf("#det") + 5;
		finish = tweet.indexOf(";");
		
		//assign the substring to detail
		detail = tweet.substring(start, finish);
		detail = detail.trim();
		
		//cut down tweet using the substring, starting after the semicolon
		tweet = tweet.substring((finish + 1));
	
		
		//LOCATION
		//get the start and end of the location 
		start = tweet.indexOf("#loc") + 5;
		finish = tweet.indexOf(";");
		
		//assign the substring to location
		location = tweet.substring(start, finish);
		location = location.trim();
		
		//cut down tweet using the substring, starting after the semicolon
		tweet = tweet.substring((finish + 1));
		
		
		//LATITUDE
		//get the start and end of the latitude 
		start = tweet.indexOf("#lat") + 5;
		finish = tweet.indexOf(";");
		
		//assign the substring to latitudeString
		latitudeString = tweet.substring(start, finish);
		latitudeString = latitudeString.trim();
		
		//cut down tweet using the substring, starting after the semicolon
		tweet = tweet.substring((finish + 1));
		
		
		//LONGITUDE
		//get the start and end of the longitude 
		start = tweet.indexOf("#lng") + 5;
		finish = tweet.indexOf(";");
		
		//assign the substring to longitudeString
		longitudeString = tweet.substring(start, finish);
		longitudeString = longitudeString.trim();
		
		//cut down tweet using the substring, starting after the semicolon
		tweet = tweet.substring((finish + 1));
		
		
		//LATITUDE AND LONGITUDE DOUBLES
		//LATITUDE
		//assign scanner latitude string
		theScanner = new Scanner(latitudeString);
		//use the scanner to scan for a double through the string
		latitude = theScanner.nextDouble();
		
		//LONGITUDE
		//assign scanner longitude string
		theScanner = new Scanner(longitudeString);
		//use the scanner to scan for a double through the string
		longitude = theScanner.nextDouble();
		
		
		//REPLACE DETAIL AND LOCATION COMMAS
		//use replace method to replace , with - in detail and location
		detail = detail.replace(",", "-");
		location = location.replace(",", "-");
		
		//----------------------------------PRINTING-------------------------
		System.out.println("Type: \t\t\t\t" + type);
		System.out.println("Detail: \t\t\t" + detail);
		System.out.println("Location: \t\t\t" + location);
		System.out.println("Latitude: \t\t\t" + latitudeString);
		System.out.println("Longitude: \t\t\t" + longitudeString);
		
	}
}
