/*
* CPSC-1060.java
* Author: Trip Bastian
* Submission Date: September 20, 2017
*
* Purpose: To take a tweet as a single string and to separate it
* 		   into it's own components of location, purpose, and
* 		   message.
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
		//Declaring Variables
		String type;
		Double latitude, longitude;
		//Initialize Scanner and assign the input to Tweet
		Scanner theScanner=new Scanner(System.in);
		String tweet = "";
		tweet = theScanner.nextLine();
		//Parsing Type
		int start = tweet.indexOf("#typ")+5;
		int finish = tweet.indexOf(";");
		type = tweet.substring(start, finish);
		type = type.trim().toUpperCase();
		System.out.println("Type:\t\t"+type);
		tweet = tweet.substring(finish+1);
		//Parsing Details
		start = tweet.indexOf("#det")+5;
		finish = tweet.indexOf(";");
		type = tweet.substring(start, finish);
		type = type.trim().replace(',', '-');;
		System.out.println("Detail:\t\t"+type);
		tweet = tweet.substring(finish+1);
		//Parsing Location
		start = tweet.indexOf("#loc")+5;
		finish = tweet.indexOf(";");
		type = tweet.substring(start, finish);
		type = type.trim().replace(',', '-');
		System.out.println("Location:\t"+type);
		tweet = tweet.substring(finish+1);
		//Configuring the scanner for doubles
		//Parsing Latitude
		start = tweet.indexOf("#lat")+5;
		finish = tweet.indexOf(";");
		type = tweet.substring(start, finish);
		type = type.trim();
		System.out.println("Latitude:\t"+type);
		tweet = tweet.substring(finish+1);
		//Parsing Longitude
		start = tweet.indexOf("#lng")+5;
		finish = tweet.indexOf(";");
		type = tweet.substring(start, finish);
		type = type.trim();
		System.out.println("Longitude:\t"+type);
	}
}