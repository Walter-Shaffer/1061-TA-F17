
/*
* ParseTheTweet.java
* Author: Matthew Held
* Submission Date: 9-19-17
*
* Purpose:
* The purpose of this program is to process string objects
* in order to get pieces of information out of them.
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
*
*/
 
import java.util.Scanner;
 
public class ParseTheTweet {
 
       public static void main(String[] args) {
             
              //Create Scanner Object
              Scanner theScanner = new Scanner(System.in);
             
              //Declare Variables
              String tweet = "";
             
              String type, detail, location, latitudeString, longitudeString;
              double latitude, longitude;
             
              //Get User Information
              tweet = theScanner.nextLine();
             
              //Replace All ',' with '-'
              tweet = tweet.replace(',', '-');
             
              //**String Manipulation**
             
              int start, finish;
             
              //Type Tweet
              start = tweet.indexOf("#typ") + 5;
              finish = tweet.indexOf(";");
              type = tweet.substring(start, finish);
              type = type.trim();
              tweet = tweet.substring(finish + 1);
             
              //Make type All Caps
              type = type.toUpperCase();
             
              //Detail Tweet
              start = tweet.indexOf("#det") + 5;
              finish = tweet.indexOf(";");
              detail = tweet.substring(start, finish);
              detail = detail.trim();
              tweet = tweet.substring(finish + 1);
             
              //Location Tweet
              start = tweet.indexOf("#loc") + 5;
              finish = tweet.indexOf(";");
              location = tweet.substring(start, finish);
              location = location.trim();
              tweet = tweet.substring(finish + 1);
             
              //Latitude Tweet
              start = tweet.indexOf("#lat") + 5;
              finish = tweet.indexOf(";");
              latitudeString = tweet.substring(start, finish);
              latitudeString = latitudeString.trim();
              tweet = tweet.substring(finish + 1);
             
              //Longitude Tweet
              start = tweet.indexOf("#lng") + 5;
              finish = tweet.indexOf(";");
              longitudeString = tweet.substring(start, finish);
              longitudeString = longitudeString.trim();
              tweet = tweet.substring(finish + 1);
             
              //**Get Numerical Values For Latitude & Longitude**
             
              //Latitude
              theScanner = new Scanner(latitudeString);
              latitude = theScanner.nextDouble();
             
              //Longitude
              theScanner = new Scanner(longitudeString);
              longitude = theScanner.nextDouble();
             
             
              //Print To Console
              System.out.println("Type:\t\t" + type);
              System.out.println("Detail:\t\t" + detail);
              System.out.println("Location:\t" + location);
              System.out.println("Latitude:\t" + latitude);
              System.out.println("Longitude:\t" + longitude);
             
             
       }
 
}