/*

* [ParseTheTweet].java

* Author: [Thomas Griffith]

* Submission Date: [September 21, 2017]

*

* Purpose: This program will read tweets in disaster struck areas and will
*  take the tweet and convert it into Type, Detail, Location, Latitude, and
*   Longitude if the tweet follows the proper etiquette for the distress tweet.
*   In doing so, the tweet can be broken down into the paarts described above 
*   and a rescue could be initiated. 
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
		Scanner TheScanner = new Scanner(System.in);

		
		String Type;
		String Detail = "";
		String Location = "";
		String LatitudeString = "";
		String LongitudeString = "";
		double Latitude;
		double Longitude;
		int start;
		int finnish;
		String Tweets = "";
		Tweets = TheScanner.nextLine();
		//String Tweets =("#typ offer; #det free essential supplies 4 evacs pets.; #loc 2323 55th st, boulder; #lat 40.022; #lng -105.226;");
		
	
		
		 start = Tweets.indexOf("#typ");
		 finnish = Tweets.indexOf(";");
		 Type = Tweets.substring(start + 5, finnish);
		 Type = Type.toUpperCase();
		 System.out.println("Type: \t\t \t" + Type.trim());
		 Tweets = Tweets.substring(finnish +1);
	
		 
		 start = Tweets.indexOf("#det");
		 finnish = Tweets.indexOf(";");
		 Detail = Tweets.substring(start + 5, finnish);
		 Detail = Detail.replace(",", "-");
		 System.out.println("Detail: \t \t" + Detail.trim());
		 Tweets = Tweets.substring(finnish +1);
		
		 
		 start = Tweets.indexOf("#loc");
		 finnish = Tweets.indexOf(";");
		 Location = Tweets.substring(start + 5, finnish);
		 Location = Location.replace(",", "-");
		 System.out.println("Location: \t \t" + Location.trim());
		 Tweets = Tweets.substring(finnish +1);
		
		 
		 start = Tweets.indexOf("#lat");
		 finnish = Tweets.indexOf(";");
		 LatitudeString = Tweets.substring(start + 5, finnish);
		 System.out.println("Latitude: \t \t" + LatitudeString.trim());
		 Tweets = Tweets.substring(finnish +1);

		 
		 start = Tweets.indexOf("#lng");
		 finnish = Tweets.indexOf(";");
		 LongitudeString = Tweets.substring(start + 5, finnish);
		 System.out.println("Longitude: \t \t" + LongitudeString.trim());
		 Tweets = Tweets.substring(finnish +1);
		
		 
		 Scanner TheScanner1 = new Scanner(LatitudeString);
		 Latitude = TheScanner.nextDouble();
		 
		 Scanner TheScanner2 = new Scanner(LongitudeString);
		 Longitude = TheScanner2.nextDouble();
		
		 
	
	}

}
