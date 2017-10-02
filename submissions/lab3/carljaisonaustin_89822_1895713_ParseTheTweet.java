
	/*
	* ParsetheTweet.java
	* Author: Jay Carl
	* Submission Date: 9/19/17
	*
	* Purpose: Adds an index of substrings so the string can be accounted for at a certain position to equal a variable.
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

		public static void main(String[]args) {
		
			
			
			
			
			Scanner theScanner = new Scanner(System.in);
			
			//scanner
			
			String tweet = " ";
			
			System.out.print("Enter your Tweet: ");
		    tweet = theScanner.nextLine();
			theScanner.close();
			
			//variables
			String type, detail, location, latitudeString, longitudeString ;
			double latitude, longitude;
			int start,finish; 
			
			
			
			start = tweet.indexOf("#typ" )+ 5 ;
			
			finish = tweet.indexOf(";");
			
			type = tweet.substring(start ,finish );
			
			type = type.trim();
			
			tweet = tweet.substring(finish + 1 );
			//applies index to substring type and extracts the tweet amongst the parameters , also sets up starting point in searching for the next value 
			
			start = tweet.indexOf("#det") + 5 ;
			finish = tweet.indexOf(";");
			detail = tweet.substring(start,finish);
			detail = detail.trim();
			tweet = tweet.substring( finish + 1);
			//adds index to substring detail and adds starting point in searching for the next value
			
			start = tweet.indexOf("#loc" ) + 5 ;
			
			finish = tweet.indexOf(";");
			
			location = tweet.substring(start,finish);
			
			location = location.trim();
			
			tweet = tweet.substring(finish + 1);
			// adds index to substring location and adds starting point in searching for the next value
			
			start = tweet.indexOf("#lat" )+ 5 ;
			
			finish = tweet.indexOf(";");
			
			latitudeString = tweet.substring(start,finish);
			
			latitudeString = latitudeString.trim();
		
			
			tweet = tweet.substring(finish + 1);
			// adds index to substring latitudeString and adds starting point in searching for the next value
			
			start = tweet.indexOf("#lng" ) + 5;
			
			finish = tweet.indexOf(";");
			
			longitudeString = tweet.substring(start,finish);
			
			longitudeString = longitudeString.trim();
			
			tweet = tweet.substring( finish + 1);
			//adds index to longitudeString and adds starting point in searching for the next value
			
			theScanner =  new Scanner(latitudeString);
			
			latitude = theScanner.nextDouble();
			theScanner.close();
			//next double input included in the latitudeString = latitude
			
			theScanner = new Scanner(longitudeString);
			longitude = theScanner.nextDouble();
			theScanner.close();
			//next double input included in the longitudeString = longitude
			
			type = type.toUpperCase(); //converts all type characters to upper case
			
			detail = detail.replace(',' , '-'); // converts all commas to hyphons
			
			location = location.replace(',' , '-'); // converts all commas to hyphons
			
			System.out.println("Type:" + "\t"  + type);
            System.out.println("Detail:" + "\t " + detail);
            System.out.println("Location:" + "\t " + location);
            System.out.println("Latitude:" + "\t " + latitude);
            System.out.println("Longitude:" + "\t " + longitude);
		}
	}

