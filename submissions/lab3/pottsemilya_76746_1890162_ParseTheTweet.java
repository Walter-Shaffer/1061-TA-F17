/* ParseTheTweet.java
  Author: Emily Potts
  Submission Date: September 22, 2017 

  Purpose: The purpose of Parse the Tweet is to look through a string and 
  display, based on # indicators of each type, the part of the string that 
  matches with each heading. 

  Statement of Academic Honesty:

  The following code represents my own work. I have neither
  received nor given inappropriate assistance. I have not copied
  or modified code from any source other than the course webpage
  or the course textbook. I recognize that any unauthorized
  assistance or plagiarism will be handled in accordance
  with the policies at Clemson University and the
  policies of this course. I recognize that my work is based
  on an assignment created by the School of Computing
  at Clemson University. Any publishing or posting
  of source code for this project is strictly prohibited
  unless you have written consent from the instructor. 
 */

import java.util.Scanner;

public class ParseTheTweet {

	public static void main(String[] args) {
		//Create Scanner Object
		Scanner theScanner = new Scanner(System.in);
		
		//String that holds the tweet entered by user
		String tweet = "";
		
		//Variables to store info about tweets
		String type;
		String detail;
		String location;
		String latitudeString;
		String longitudeString;
		double latitude;
		double longitude;
		
		//int variables to store indicies of substrings
		int start;
		int finish;
		
		//Get input from user
		tweet = theScanner.nextLine();
		
		//TYPE
		//assigns start and finish the first and last index of tweets type 
		start = tweet.indexOf("#typ");
		start = start + 5; 
		finish = tweet.indexOf(";");
		//sets type to be equal where it starts and ends indicated by #typ
		type = tweet.substring(start, finish);
		//gets rid of whitespace characters on either end of string
		type = type.trim();
		//resets tweet so it will read from the beginning by deleting the part just read (type)
		tweet = tweet.substring(finish + 1);
		
		//DETAIL
		//assigns start and finish the first and last index of tweet detail 
		start = tweet.indexOf("#det");
		start = start + 5; 
		finish = tweet.indexOf(";");
		//sets detail to be equal where it starts and ends indicated by #det
		detail = tweet.substring(start, finish);
		//gets rid of whitespace characters on either end of string
		detail = detail.trim();
		//resets tweet so it will read from the beginning by deleting the part just read (detail)
		tweet = tweet.substring(finish + 1);
		
		//LOCATION  
		//assigns start and finish the first and last index of tweet location  
		start = tweet.indexOf("#loc");
		start = start + 5;
		finish = tweet.indexOf(";");
		//sets location to be equal where it starts and ends indicated by #loc
		location = tweet.substring(start, finish);
		//gets rid of whitespace characters on either end of string
		location = location.trim();
		//resets tweet so it will read from the beginning by deleting the part just read (location)
		tweet = tweet.substring(finish + 1);
		
		//LATITUDE STRING
		//assigns start and finish the first and last index of tweets type 
		start = tweet.indexOf("#lat");
		start = start + 5;
		finish = tweet.indexOf(";");
		//sets latitude to be equal where it starts and ends indicated by #lat
		latitudeString = tweet.substring(start, finish);
		//gets rid of whitespace characters on either end of string
		latitudeString = latitudeString.trim();
		//resets tweet so it will read from the beginning by deleting the part just read (latitude)
		tweet = tweet.substring(finish + 1);
		
		//LONGITUDE STRING
		//assigns start and finish the first and last index of tweets type 
		start = tweet.indexOf("#lng");
		start = start + 5;
		finish = tweet.indexOf(";");
		//sets longitude to be equal where it starts and ends indicated by #lng
		longitudeString = tweet.substring(start, finish);
		//gets rid of whitespace characters on either end of string
		longitudeString = longitudeString.trim();
		//resets tweet so it will read from the beginning by deleting the part just read (longitude)
		tweet = tweet.substring(finish + 1);
		
		//get numerical values from strings and read in floating point values for both
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble();
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		
		//make type values all upper case
		type = type.toUpperCase();
		
		//remove any commas from detail and location variables
		detail = detail.replace(",", "-");
		location = location.replace(",", "-");
		
		//display output
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude\t" + latitude);
		System.out.println("Longitude\t" + longitude);
		
	}

}
