/* ClassifyMessage.Java
* Author: Allison Tizik
* Submission Date: 9/26/17
* Purpose: The program reads the structure of the message and
* produces outputs that allow for quick understanding of the message.
* By using the else if statements it can go through the message and produce
* the different important categories for message. Also using the else if statements
* it shows if the message is within the range. This program cuts down the message into
* 6 important outputs to be able to read the message in a more organized fashion.
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
public class ClassifyMessage {
           enum MessageCategory {NEED, OFFER, ALERT,INFO, UNKNOWN};
           public static void main(String[] args) {
                      // TODO Auto-generated method stub
           Scanner keyboard = new Scanner (System.in);
                     
//initializing variables
           String catString ;//The raw text of the message's category
           String payload; // The primary content of the message
           double latitude ; //The latitude indicated in the message
           double longitude; // The longitude indicated in the message
           boolean isInRange; //A "flag" indicating whether the latitude and
                                                                  // longitude values are within bounds
           MessageCategory category; // The message's category
           double south = 39.882343; //southernmost latitude
           double north = 40.231315; //nothernmost latitude
           double west = -105.743511;//western longitude
           double east = -104.907864; //easternmost longitude
          
           System.out.println("Please enter a formatted message:");
           catString = keyboard.next().trim();
          
//else if statements to declare message category
           if (catString.equalsIgnoreCase("fire")|| catString.equalsIgnoreCase("smoke")){
                      category = MessageCategory.ALERT;
                      }else if (catString.equalsIgnoreCase("need")){
                      category = MessageCategory.NEED;
                      }else if (catString.equalsIgnoreCase("offer")){
                      category = MessageCategory.OFFER;
                      }else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")){
                      category = MessageCategory.INFO;
                      }else {
                      category = MessageCategory.UNKNOWN;
                      }
 
           latitude = keyboard.nextDouble();
           longitude = keyboard.nextDouble();
//Figuring out if longitude and latitude is in the Range
// coming out with True or false
           if (latitude>= south & latitude<= north & longitude>=west & longitude<=east){
                      isInRange = true;
           }else{
                      isInRange = false;
           }
          
           payload = keyboard.nextLine().trim();
          
// Printing out Statements
           System.out.println("\nCategory:\t"+category);
           System.out.println("Raw Cat:\t"+catString);
           System.out.println("Message:\t"+payload);
           System.out.println("Latitude:\t"+latitude);
           System.out.println("Longitude:\t"+longitude);
           System.out.println("In Range:\t"+isInRange);
           }
 
}