/*
* ParseTheTweet.java
* Author: Timothy Morse
* Submission Date: 18 Sept 2017
*
* Purpose: The program intakes a specially formatted tweet, parses
* it, and then reprints it as a more easily legible set of information.
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
		//Declarations
		Scanner theScanner = new Scanner(System.in);
		String tweet = "";
		String type = "";
		String detail = "";
		String location = "";
		String latitudeString = "";
		String longitudeString = "";
		double latitude = 0.0;
		double longitude = 0.0;
		//Input
		System.out.print("Please type tweet to parse: ");
		tweet = theScanner.nextLine();
		//Processing
		int start = 0;
		int finish = 0;
		start = tweet.indexOf("#typ")+5;
		finish = tweet.indexOf(";");
		type = tweet.substring(start, finish);
		type = type.trim();
		type = type.toUpperCase();
		tweet = tweet.substring(finish+1);

		start = tweet.indexOf("#det")+5;
		finish = tweet.indexOf(";");
		detail = tweet.substring(start, finish);
		detail.trim();
		detail = detail.replace(',', '-');
		tweet = tweet.substring(finish+1);

		start = tweet.indexOf("#loc")+5;
		finish = tweet.indexOf(";");
		location = tweet.substring(start, finish);
		location.trim();
		location = location.replace(',', '-');
		tweet = tweet.substring(finish+1);

		start = tweet.indexOf("#lat")+5;
		finish = tweet.indexOf(";");
		latitudeString = tweet.substring(start, finish);
		latitudeString.trim();
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble();
		tweet = tweet.substring(finish+1);

		start = tweet.indexOf("#lng")+5;
		finish = tweet.indexOf(";");
		longitudeString = tweet.substring(start, finish);
		longitudeString.trim();
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		tweet = tweet.substring(finish+1);
		//Output
		System.out.printf("Type:\t\t%s%nDetail:\t\t%s%nLocation:\t%s%nLatitude:\t%s%nLongitude:\t%s%n", type, detail, location, latitudeString, longitudeString);
	}

}
