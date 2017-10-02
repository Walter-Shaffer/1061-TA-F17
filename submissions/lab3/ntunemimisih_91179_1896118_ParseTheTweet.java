/*
* CPSC 1060.java
* Author: Mimi Ntune
* Submission Date: 9/22/2017
*
* Purpose:  use methods of the String class to process messages similar to TtT tweets 
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
	public static void main(String[] args){ 
		Scanner theScanner = new Scanner(System.in);
		System.out.println("Compose Tweet: \t");
		String tweet = ("")+ theScanner.nextLine();
		String detail = null;
		String location = null;
		String latitudeString = null;
		String longitudeString = null;
		double latitude = theScanner.nextDouble();;
		double longitude = theScanner.nextDouble();

int start = tweet.indexOf("#type",5)+ detail.indexOf("#det", 5)+ location.indexOf("#loc", 5) +
latitudeString.indexOf("#lat",5) + longitudeString.indexOf("#lng",5);

int finish = tweet.indexOf(";")+ detail.indexOf(";") + location.indexOf(";")+
latitudeString.indexOf(";") + longitudeString.indexOf(";");


String type = tweet.substring(start, finish);
type.trim();
tweet.substring(finish+1);
detail.substring(finish+1);
location.substring(finish+1);
latitudeString.substring(finish+1);
longitudeString.substring(finish+1);
theScanner = new Scanner(latitudeString);
theScanner = new Scanner(longitudeString);

type.toUpperCase();
detail.replace(',', '-');
location.replace(',', '-');
System.out.println(tweet);
System.out.print("Type:      \t" + type);
System.out.print("Detail:    \t" + detail);
System.out.print("Location:  \t" + location);
System.out.print("Latitude:  \t" + latitude);
System.out.print("Longitude: \t" + longitude);
	}
}
