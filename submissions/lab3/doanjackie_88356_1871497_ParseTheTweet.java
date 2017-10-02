/* 
 * ParseTheTweet.java 
 * Author:  Jackie Doan  
 * Submission Date:  Sept 19, 2017 
 * 
 * Purpose:
 * This program is designed with the purpose of breaking down
 * "tweets" using "hashtags" in order to easily classify the "tweets".
 * 
 * Statement of Academic Honesty:
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
		
		String tweet = new String("");
		String type = "";
		String detail = "";
		String loc = "";
		String latString = "";
		String longString = "";
		double latitude, longitude;
		
		tweet = theScanner.nextLine();
		
		int start, finish;
		
		start = tweet.indexOf("#typ") + 5;
		finish = tweet.indexOf(";");
		type = tweet.substring(start, finish);
		type = type.trim();
		tweet = tweet.substring(finish + 1);
		
		start = tweet.indexOf("#det") + 5;
		finish = tweet.indexOf(";");
		detail = tweet.substring(start, finish);
		detail = detail.trim();
		tweet = tweet.substring(finish + 1);
		
		start = tweet.indexOf("#loc") + 5;
		finish = tweet.indexOf(";");
		loc = tweet.substring(start, finish);
		loc = loc.trim();
		tweet = tweet.substring(finish + 1);
		
		start = tweet.indexOf("#lat") + 5;
		finish = tweet.indexOf(";");
		latString = tweet.substring(start, finish);
		latString = latString.trim();
		tweet = tweet.substring(finish + 1);
		
		start = tweet.indexOf("#lng") + 5;
		finish = tweet.indexOf(";");
		longString = tweet.substring(start, finish);
		longString = longString.trim();
		tweet = tweet.substring(finish + 1);
		
		theScanner = new Scanner(latString);
		latitude = theScanner.nextDouble();
		
		theScanner = new Scanner(longString);
		longitude = theScanner.nextDouble();
		
		type = type.toUpperCase();
		
		detail = detail.replace(',' , '-');
		loc = loc.replace(',' , '-');
		
		System.out.println("Type: \t\t" + type);
		System.out.println("Detail: \t" + detail);
		System.out.println("Location: \t" + loc);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		theScanner.close();
	}

}
