/**
* ParseTheTweet.java
* @author John Hollowell
* Submission Date: TODO
*
* @purpose request a formatted string from the user and display the separated data and tags
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declare variables
		String tweet, type, detail, location, latitudeString, longitudeString;
		double latitude, longitude;
		int start, finish;

		//Init Variables
		tweet = "";

		// Create Scanner object for System input
		Scanner theScanner = new Scanner(System.in);
		System.out.print("Tweet Text: ");
		tweet = theScanner.nextLine();
		theScanner.close();


		// Start parsing tweet text
		// Parse type
		start = tweet.indexOf("#typ") + 5; // 5 = "#typ ".length();
		finish = tweet.indexOf(';');
		type = tweet.substring(start, finish).trim();
		tweet = tweet.substring(finish + 1); // remove type tag and data from tweet string

		// Parse detail
		start = tweet.indexOf("#det") + 5; // 5 = "#det ".length();
		finish = tweet.indexOf(';');
		detail = tweet.substring(start, finish).trim();
		tweet = tweet.substring(finish + 1); // remove detail tag and data from tweet string

		// Parse location
		start = tweet.indexOf("#loc") + 5; // 5 = "#loc ".length();
		finish = tweet.indexOf(';');
		location = tweet.substring(start, finish).trim();
		tweet = tweet.substring(finish + 1); // remove location tag and data from tweet string

		// Parse latitudeString
		start = tweet.indexOf("#lat") + 5; // 5 = "#lat ".length();
		finish = tweet.indexOf(';');
		latitudeString = tweet.substring(start, finish).trim();
		tweet = tweet.substring(finish + 1); // remove latitude tag and data from tweet string

		// Parse longitudeString
		start = tweet.indexOf("#lng") + 5; // 5 = "#lng ".length();
		finish = tweet.indexOf(';');
		longitudeString = tweet.substring(start, finish).trim();
		tweet = tweet.substring(finish + 1); // remove longitude tag and data from tweet string

		// Parse latitudeString to double
		// Equivalent to longitude = Double.parseDouble(longitudeString);
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble();
		theScanner.close();

		// Parse latitudeString to double
		// Equivalent to latitude = Double.parseDouble(latitudeString);
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		theScanner.close();

		// convert type to upper case
		type = type.toUpperCase();

		// Replace commas with dashes in detail and location
		detail = detail.replace(',', '-');
		location = location.replace(',', '-');


		// Output data
		System.out.printf("Type:\t\t%s\n", type);
		System.out.printf("Detail:\t\t%s\n", detail);
		System.out.printf("Location:\t%s\n", location);
		System.out.printf("Latitude:\t%s\n", latitude);
		System.out.printf("Logitude:\t%s\n", longitude);
	}

}
