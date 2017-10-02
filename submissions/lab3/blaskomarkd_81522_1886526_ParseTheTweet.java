/*
* ParseTheTweet.java
* Author: Mark Blasko
* Submission Date: 09/20/17
* Purpose: The purpose of this program is to partly replicate the TtT method of "tweeting"
	to make "tweets" more easily found by computers. The program provides more structure to
	the "tweets" ultimately leading to more effecient classification by the computer. 
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
	public static void main(String[] args) {
		Scanner theScanner = new Scanner(System.in);
			String tweet = "";
			String type;
			String detail;
			String location;
			String latitudeString;
			String longitudeString;
			double latitude;
			double longitude;
		String text = theScanner.nextLine();
			tweet = text;
			//String temp = "Hello"; //temporary string for testing
			int start;
			int finish;
			start = tweet.indexOf("#typ") + 5;
			finish = tweet.indexOf(';');
			type = tweet.substring(start, finish);
			type = type.trim();
			tweet = tweet.substring(finish + 1);
			//End of Type
			start = tweet.indexOf("#det") + 5;
			finish = tweet.indexOf(';');
			detail = tweet.substring(start, finish);
			detail = detail.trim();
			tweet = tweet.substring(finish + 1);
			//End of Detail
			start = tweet.indexOf("#loc") + 5;
			finish = tweet.indexOf(';');
			location = tweet.substring(start, finish);
			location = location.trim();
			tweet = tweet.substring(finish + 1);
			//End of location
			start = tweet.indexOf("#lat") + 5;
			finish = tweet.indexOf(';');
			latitudeString = tweet.substring(start, finish);
			latitudeString = latitudeString.trim();
			tweet = tweet.substring(finish + 1);
			//End of Latitude
			start = tweet.indexOf("#lng") + 5;
			finish = tweet.indexOf(';');
			longitudeString = tweet.substring(start, finish);
			longitudeString = longitudeString.trim();
			tweet = tweet.substring(finish + 1);
			//End of longitude
			theScanner = new Scanner(latitudeString);
			latitude = theScanner.nextDouble();
			theScanner = new Scanner(longitudeString);
			longitude = theScanner.nextDouble();
			type = type.toUpperCase();

			detail = detail.replace(',', '-');
			location = location.replace(',', '-');
			theScanner.close();

			System.out.println("Type: \t\t\t" + type);
			System.out.println("Detail: \t\t" + detail);
			System.out.println("Location: \t\t" + location);
			System.out.println("Latitude: \t\t" + latitudeString);
			System.out.println("Longitude: \t\t" + longitudeString);


		}

}
