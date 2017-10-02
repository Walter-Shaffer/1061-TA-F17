/* ParseTheTweet.Java
* Author: Allison Tizik
* Submission Date: 9/21/17
* Purpose: The program reads the structure of the tweet 
* that is organized by the hashtags which allows for sifting 
* through tweets to find information needed.
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
                      Scanner input = new Scanner(System.in);
                      System.out.print("Enter a Tweet: ");
                      String tweet = input.nextLine();
//Initializing variables
                      String type;
                      String detail;
                      String location ;
                      String latitudeString ;
                      String longitudeString ;
                      double latitude;
                      double longitude;
                      int start, finish ;

//Declaring Strings                      
                      start = tweet.indexOf("#typ");
                      finish = tweet.indexOf(";");
                      type = tweet.toUpperCase().replace(',','-').substring(start+5,finish);
                     
                      start = tweet.indexOf("#det");
                      finish = tweet.indexOf(";", start);
                      detail = tweet.replace(',','-').substring(start+5,finish);
                     
                      start = tweet.indexOf("#loc");
                      finish = tweet.indexOf(";", start);
                      location = tweet.replace(',','-').substring(start+5,finish);
                     
                      start = tweet.indexOf("#lat");
                      finish = tweet.indexOf(";", start);
                      latitudeString = tweet.replace(',','-').substring(start+5,finish);
                     
                      start = tweet.indexOf("#lng");
                      finish = tweet.indexOf(";", start);
                      longitudeString = tweet.replace(',','-').substring(start+5,finish);
                     
//Changing String to Double                      
                      input = new Scanner (latitudeString);
                      latitude = input.nextDouble();
                      
                      input = new Scanner (longitudeString);
                      longitude =input.nextDouble();

//Printing Statements                      
                      System.out.println("\nType:\t\t"+type);
                      System.out.println("Detail:\t\t"+detail);
                      System.out.println("Location:\t"+location);
                      System.out.println("Latitude:\t"+latitude);
                      System.out.println("Longitude:\t"+longitude);
           }
 
}