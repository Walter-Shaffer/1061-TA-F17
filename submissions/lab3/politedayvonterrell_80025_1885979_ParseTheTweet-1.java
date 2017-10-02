 /*
 * ParseTheTweet.java
 * Author: Dayvon Polite
 * Submission Date: 9/21/2017
 *
 * Purpose: Read a single TtT tweet from input and manipulate and print the text to the screen
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

 		Scanner theScanner = new Scanner(System.in);
 		
 		String tweet = "";
 		String type, detail, location, latitudeString, longitudeString;
 		double latitude, longitude;
 		int start, finish,start_1,finish_1,start_2,finish_2,start_3,finish_3,start_4,finish_4;

 		tweet = theScanner.nextLine();
 		start = tweet.indexOf(0) + 5; // 5 - 1 = 4
 		finish = tweet.indexOf(";");
 		type = tweet.substring(start,finish);
 		type = type.trim();
 		type = type.toUpperCase();
 		tweet = tweet.substring(finish + 1);
 		
 		tweet = tweet.trim();
 		start_1 = tweet.indexOf(0) + 5;
 		finish_1 = tweet.indexOf(';');
 		detail = tweet.substring(start_1,finish_1);
 		detail = detail.trim();
 		detail = detail.replace(",","-");
 		tweet = tweet.substring(finish_1 + 1);
 		
 		tweet = tweet.trim();
 		start_2 = tweet.indexOf(0) + 5;
 		finish_2 = tweet.indexOf(';');
 		location= tweet.substring(start_2,finish_2);
 		location = location.trim();
 		location = location.replace(",","-");
 		tweet = tweet.substring(finish_2 + 1);
 		
 		tweet = tweet.trim();
 		start_3 = tweet.indexOf(0) + 5;
 		finish_3 = tweet.indexOf(';');
 		latitudeString= tweet.substring(start_3,finish_3);
 		latitudeString = latitudeString.trim();
 		tweet = tweet.substring(finish_3 + 1);
 		
 		tweet = tweet.trim();
 		start_4 = tweet.indexOf(0) + 5;
 		finish_4 = tweet.indexOf(';');
 		longitudeString= tweet.substring(start_4,finish_4);
 		longitudeString = longitudeString.trim();
 		tweet = tweet.substring(finish_4 + 1);
 		
 		theScanner = new Scanner(latitudeString);
 		latitude = theScanner.nextDouble();
 		theScanner = new Scanner(longitudeString);
 		longitude = theScanner.nextDouble();
 		
 		System.out.println("Type:\t\t" + type + "\nDetail:\t\t" + detail + "\nLocation:\t" + location + "\nLatitude:\t" + latitude + "\nLongitude\t" + longitude);
 	
 	}
 }