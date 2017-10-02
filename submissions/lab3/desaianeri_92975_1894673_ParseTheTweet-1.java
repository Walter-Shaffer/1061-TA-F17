/*
* [ParseTheTweet].java 
* Author: [Aneri Desai]
* Submission Date: [09/22/2017]
* 
* Purpose: In the lab we learned different methods of string like indexOf(), trim, and replace and how to get output. Also we learned to declare the variable in String
* 			and how to make string read output from the keyboard. We also learned the new methods of the Scanner class and how is it used/ 
* 
*  Statement of Academic Honesty:
*  
*  The following code represent my own work. I have neither received nor given inappropriate assistance. 
*  I have not copied or modified code from any source other than the course webpage or the course textbook.
*  I recognize that any unauthorized assistance or plagiarism will be handled in accordance with the policies
*  at Clemson University and the policies of this course. I recognize that my work is based on an assignment 
*  created by the School of Computing at Clemson Univeristy. Any publishing or posting of source code for this 
*  project is strictly prohibited unless you have written consent from the instructor.  
*/
import java.util.Scanner;  //import Scanner class

public class ParseTheTweet {
	public static void main(String[] args){
		
		Scanner theScanner = new Scanner(System.in);
		
		String tweet = ""; //declare variables with String and double
		String type;
		String detail;
		String location;
		String latitudeString;
		String longitudeString;
		double latitude;
		double longitude;
		
		System.out.print("Enter the Tweet:"); //add print statement to print enter the tweet 
		tweet = theScanner.nextLine(); 
		
		int start; //declare integer
		int finish;
		
		start = tweet.indexOf("#typ")+5; 
		finish = tweet.indexOf(";");
		type = tweet.substring(start, finish); 
		type = type.trim();
		tweet = tweet.substring(finish+1); //get the output of tweet in type
		
		start = tweet.indexOf("#det")+5; 
		finish = tweet.indexOf(";");
		detail = tweet.substring(start, finish);
		detail = detail.trim();
		tweet = tweet.substring(finish+1); //get the output of tweet in detail
		
		start = tweet.indexOf("#loc")+5;
		finish = tweet.indexOf(";");
		location = tweet.substring(start,finish);
		location = location.trim();
		tweet = tweet.substring(finish+1); //get the output of tweet in location
	
		start = tweet.indexOf("#lat")+5;
		finish = tweet.indexOf(";");
		latitudeString = tweet.substring(start,finish);
		latitudeString = latitudeString.trim();
		tweet = tweet.substring(finish+1); //get the output of tweet in latitude
		
		start = tweet.indexOf("#lng")+5;
		finish = tweet.indexOf(";");
		longitudeString = tweet.substring(start,finish);
		longitudeString = longitudeString.trim();
		tweet = tweet.substring(finish+1); //get the output of tweet in longitude
		
	
		type = type.toUpperCase();        //uppercase method
		detail = detail.replace(',','-'); //replace method for detail and location
		location = location.replace(',','-'); 
		
		theScanner = new Scanner(latitudeString); //use theScanner object to read direcly from the keyboard
		latitude = theScanner.nextDouble();
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		
	
		System.out.println("Type:\t\t\t" + type); //get the output
		System.out.println("Detail:\t\t\t"+detail);
		System.out.println("Location:\t\t"+location);
		System.out.println("Latitude:\t\t"+latitude);
		System.out.println("Longitude:\t\t" + longitude);
		
		}

}
