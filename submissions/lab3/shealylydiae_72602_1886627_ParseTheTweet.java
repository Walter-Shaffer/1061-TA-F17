
import java.util.Scanner;
/*
*ParseTheTweet.java
* Author: Lydia Shealy
* Submission Date: 9/21/17
*
* Purpose: Analyzes a tweet formatted in a certain structure and 
* gathers information from the tweet to aid in emergency response and inform
* the public quick information about the situation.
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
public class ParseTheTweet {

	public static void main(String[] args) {
		//String temp = "#typ offer; #det free essential supplies 4 evacs pets.; #loc 2323 55th st, boulder; #lat 40.022; #lng -105.226;";
		//test variable to read information
		
		Scanner theScanner = new Scanner(System.in);
		String tweet = "";
		tweet = theScanner.nextLine(); //from user
		theScanner.close();
		
		String type, detail, location, latitudeString, longitudeString;
		
		Double latitude, longitude; 
		int start, finish; 
		
		//for type
		start = tweet.indexOf("#typ") + 5; //starts the value for type
		finish = tweet.indexOf(';');		//ends the value for type
		type = tweet.substring(start, finish); //assigns type
		type = type.trim(); 	//trims any white space 
		System.out.println("Type: \t\t" + type.toUpperCase()); //prints type info in upper case
		tweet = (tweet.substring(finish+1)); //parses tweet so we can gather next set of info
		
		
		//for detail
		start = tweet.indexOf("#det") + 5;
		finish = tweet.indexOf(';');		
		detail = tweet.substring(start, finish);
		detail = detail.trim();
		detail = detail.replace(',','-'); //replaces commas with a dash to prevent any errors when further analyzing info
		System.out.println("Detail: \t" + detail);
		tweet = (tweet.substring(finish+1)); 
		
		
		//for location
		start = tweet.indexOf("#loc") + 5;
		finish = tweet.indexOf(';');		
		location = tweet.substring(start, finish);
		location = location.replace(',', '-');
		location = location.trim();		
		System.out.println("Location: \t" + location);
		tweet = (tweet.substring(finish+1)); 
		
		//for latitudeString
		start = tweet.indexOf("#lat") + 5;
		finish = tweet.indexOf(";");		
		latitudeString = tweet.substring(start, finish);
		latitudeString = latitudeString.trim();		
		System.out.println("Latitude: \t" + latitudeString);
		tweet = (tweet.substring(finish+1)); 
		//to get the double value from the latitude string
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble(); 
		theScanner.close();
		
		//for longitudeString
		start = tweet.indexOf("#lng") + 5;
		finish = tweet.indexOf(";");		
		longitudeString = tweet.substring(start, finish);
		longitudeString = longitudeString.trim();
		System.out.println("Longitude: \t" + longitudeString);
		tweet = (tweet.substring(finish+1)); 
		//to get the double value from the longitude string
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		theScanner.close();
		

	}

}
