/*ParseTheTweet.java


 * Zachary Smith
 * 9-19-17
 * This program sifts through user submitted "tweets" in order to 
 * find important information such as type, details, location, and 
 * the latitude and longitude of the information. The program also
 * substitutes commas for hyphens in order to make the information
 * easier to process.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not 
 * copied or modified code from any other source other than 
 * the course webpage or the course textbook. I recognize that 
 * any unauthorized assistance or plagiarism will be handled in
 * accordance with the policies at Clemson University and the
 * policies of this course, I recognize that my work is based
 * on an assignment created by the School of Computing at 
 * Clemson University. Any publishing or posting of source
 * code for this project is strictly prohibited unless
 * you have written consent from the instructor.
 * 
 */

import java.util.Scanner;

public class ParseTheTweet {

	public static void main(String[] args) {
		Scanner theScanner = new Scanner(System.in);
		
		String type, detail, location, latitudeString, longitudeString;
		
		double latitude, longitude;
		
		int start, finish;
		
		String tweet = "";
		
		System.out.println("Enter in your tweet: ");
	
		
		tweet = theScanner.nextLine();
	
		//type
		
		start = tweet.indexOf("#typ") + 5;
		
		finish = tweet.indexOf(";");
		
		type = tweet.substring(start, finish);
		
		type = type.trim();
		
		type = type.toUpperCase();
		
		tweet = tweet.substring(finish + 1);
		
		
		// detail
		
		start = tweet.indexOf("#det") + 5;
		
		finish = tweet.indexOf(";", start);
		
		detail = tweet.substring(start, finish);
		
		detail = detail.trim();
		
		detail = detail.replace("," , "-");
		
		tweet = tweet.substring(finish + 1);
		
		//location
		
		start = tweet.indexOf("#loc") + 5;
		
		finish = tweet.indexOf(";" , start);
		
		location = tweet.substring(start, finish);
		
		location = location.trim();
		
		location = location.replace("," , "-");
		
		tweet = tweet.substring(finish + 1);
		
		//latitudeString
		
		start = tweet.indexOf("#lat") + 5;
		
		finish = tweet.indexOf(";" , start);
		
		latitudeString = tweet.substring(start, finish);
		
		latitudeString = latitudeString.trim();
		
		tweet = tweet.substring(finish + 1);
		
		// longitudeString
		
		start = tweet.indexOf("#lng") + 5;
		
		finish = tweet.indexOf(";" , start);
		
		longitudeString = tweet.substring(start, finish);
		
		longitudeString = longitudeString.trim();
		
		tweet = tweet.substring(finish + 1);
		
		// latitude
		
		theScanner = new Scanner(latitudeString);
		
		latitude = theScanner.nextDouble();
		
		//longitude
		
		theScanner = new Scanner(longitudeString);
		
		longitude = theScanner.nextDouble();
		
		
		System.out.println("Type: \t\t" +  type);
		
		System.out.println("Detail: \t" + detail);
		
		System.out.println("Location: \t" + location);
		
		System.out.println("Latitude: \t" + latitude);
		
		System.out.println("Longitude: \t" + longitude);

	}

}