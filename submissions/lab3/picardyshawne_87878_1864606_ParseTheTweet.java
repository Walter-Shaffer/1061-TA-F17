/*
* ParseTheTweet.java

* Author: Shawn Picardy
* Submission Date: 09/18/17 
* 
* Purpose: This program is intended to receive input tweets with hashtags and 
* pull the appropriate information from strings in order to classify the 
* tweets more effectively.
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
		
		// Create Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Initialize and declare and empty string to store "Tweet Input"
		String tweet = "";
		
		// Prompt user for tweet to be stored
		System.out.print("Submit a tweet: ");
		tweet = input.nextLine();
						
		// Close Scanner Object
		input.close();
				
		// Demarcate substring with index constraints for Type
		int start = tweet.indexOf("#typ") + 5;
		int finish = tweet.indexOf(';');
		String type = tweet.substring(start, finish);
		type = type.trim();
		
		// Demarcate substring with index constraints for Detail
		int startDet = tweet.indexOf("#det") + 5;
		int finishDet = tweet.indexOf(';', startDet);
		String detail = tweet.substring(startDet, finishDet);
		detail = detail.trim();
		
		// Demarcate substring with index constraints for Location
		int startLoc = tweet.indexOf("#loc") + 5;
		int finishLoc = tweet.indexOf(';', startLoc);
		String location = tweet.substring(startLoc, finishLoc);
		location = location.trim();
		
		// Demarcate substring with index constraints for Latitude
		int startLatString = tweet.indexOf("#lat") + 5;
		int finishLatString = tweet.indexOf(';', startLatString);
		String latitudeString = tweet.substring(startLatString, finishLatString);
		latitudeString = latitudeString.trim();
		
		// Demarcate substring with index constraints for Longitude
		int startLngString = tweet.indexOf("#lng") + 5;
		int finishLngString = tweet.indexOf(';', startLngString);
		String longitudeString = tweet.substring(startLngString, finishLngString);
		longitudeString = longitudeString.trim();	
		
		// Obtain numerical value for Latitude from string
		Scanner theScanner = new Scanner(latitudeString);
		double latitude = theScanner.nextDouble();
		theScanner.close();
		
		// Obtain numerical value for Longitude from string
		Scanner theScannerLng = new Scanner(longitudeString);
		double longitude = theScannerLng.nextDouble();
		theScannerLng.close();	
				
		// Display formatted output
		System.out.println("\nType:\t\t" + type.toUpperCase());
		System.out.println("Detail:\t\t" + detail.replace(',', '-'));
		System.out.println("Location:\t" + location.replace(',', '-'));
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		
		
		

		
		
		
		

	}

}
