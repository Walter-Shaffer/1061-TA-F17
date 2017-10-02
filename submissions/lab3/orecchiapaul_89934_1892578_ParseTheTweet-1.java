/* 
 * 
 * ParseTheTweet.java 
 * Author:  Paul Orecchia  
 * Submission Date:  9/22/17 
 * 
 * Purpose: The purpose of this program is to format the tweet and print 
 * the information
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
		Scanner theScanner= new Scanner(System.in);
		
		String tweet="";
		tweet=theScanner.nextLine();
		
		int start=tweet.indexOf("#typ");
		int finish=tweet.indexOf(";");
		String type=tweet.substring(start+5,finish);
			type=type.toUpperCase();
		tweet=tweet.substring(finish+1);
		System.out.println("Type:\t\t" +type);
		
		start=tweet.indexOf("#det");
		finish=tweet.indexOf(";");
		String detail=tweet.substring(start+5,finish);
		detail=detail.replace(',','-');
		tweet=tweet.substring(finish+1);
		System.out.println("Detail:\t\t" +detail);
		
		start=tweet.indexOf("#loc");
		finish=tweet.indexOf(";");
		String location=tweet.substring(start+5,finish);
		location=location.replace(',','-');
		tweet=tweet.substring(finish+1);
		System.out.println("Location:\t" +location);
		
		start=tweet.indexOf("#lat");
		finish=tweet.indexOf(";");
		String latitudeString=tweet.substring(start+5,finish);
		tweet=tweet.substring(finish+1);
		
		start=tweet.indexOf("#lng");
		finish=tweet.indexOf(";");
		String longitudeString=tweet.substring(start+5,finish);
		tweet=tweet.substring(finish+1);
		
		theScanner = new Scanner(latitudeString); 
		double latitude= theScanner.nextDouble();
		System.out.println("Latitude:\t" +latitude);
		
		theScanner = new Scanner(longitudeString); 
		double longitude= theScanner.nextDouble();
		System.out.println("Longitude:\t" +longitude);

	}

}
