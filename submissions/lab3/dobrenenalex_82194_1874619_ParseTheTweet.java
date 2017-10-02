/* ParseTheTweet.java 
 * Author:  Alex Dobrenen 
 * Submission Date:  [Submission date here]  
 * Purpose: A brief paragraph description of the 
 * program. What does it do? Use methods of the String class to process messages similar to TtT 
 * tweets (the data is made from real TtT data but it has been altered to suit the lab)
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

//Imports
import java.util.Scanner;

public class ParseTheTweet 
{
	//Main
	public static void main(String[] args) 
	{
		//Scanner
		Scanner theScanner = new Scanner(System.in);
		
		//Vars
		String tweet = "";
		String type, detail, location, latitudeString, longitudeString;
		double latitude, longitude;
		int start, finish;
		
		//Input
		System.out.println("Please enter your tweet:");
		tweet = theScanner.nextLine();
		
		//Indexing
		start = tweet.indexOf("#typ") + 5;
		finish = tweet.indexOf(";");
		
		//Extraction of Strings
		type = tweet.substring(start, finish);
		type.trim();

		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#det") + 4;
		finish = tweet.indexOf(";");
		detail = tweet.substring(start, finish);
		detail.trim();

		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#loc") + 4;
		finish = tweet.indexOf(";");
		location = tweet.substring(start, finish);
		location.trim();

		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#lat") + 4;
		finish = tweet.indexOf(";");
		latitudeString = tweet.substring(start, finish);
		latitudeString.trim();

		tweet = tweet.substring(finish + 1);
		start = tweet.indexOf("#lng") + 4;
		finish = tweet.indexOf(";");
		longitudeString = tweet.substring(start, finish);
		longitudeString.trim();

		tweet = tweet.substring(finish + 1);
		
		//Extraction of Doubles
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble();
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		
		//String Clean Up
		type = type.toUpperCase();
		detail = detail.replace(',', '-');
		location = location.replace(',', '-');
		
		//Output of Information
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail: \t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Logitude:\t" + longitude);
		
	}//End Main

}//End Class