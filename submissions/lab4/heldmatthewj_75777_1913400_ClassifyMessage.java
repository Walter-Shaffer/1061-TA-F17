
/*
* ClassifyMessage.java
* Author: Matthew Held
* Submission Date: 9-26-17
*
* Purpose:
* The purpose of this program is to take a formatted message,
* identify the individual pieces of information in it, decide
* the category of the message, decide if the location is in range,
* and print the results to the user.
*
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
 
public class ClassifyMessage {
 
       enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN};
      
       public static void main(String[] args) {
             
              //Create Scanner Object
              Scanner keyboard = new Scanner(System.in);
             
              //Declare Variables
              String catString, payload;
              double latitude, longitude;
              boolean isInRange;
              MessageCategory category;
             
              final double north = 40.231315;
              final double south = 39.882343;
              final double east = -104.907864;
              final double west = -105.743511;
             
              //Display Prompt To User
              System.out.println("Please enter a formatted message:");
             
              //**Gather Message Information**
              //catString
              catString = keyboard.next();
              catString = catString.trim();
             
              //latitude
              latitude = keyboard.nextDouble();
             
              //longitude
              longitude = keyboard.nextDouble();
             
              //payload
              payload = keyboard.nextLine();
              payload = payload.trim();
             
             
              //Decide The Message Category
              if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
                    category = MessageCategory.ALERT;
              } else if (catString.equalsIgnoreCase("need")) {
                    category = MessageCategory.NEED;
              } else if (catString.equalsIgnoreCase("offer")) {
                    category = MessageCategory.OFFER;
              } else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
                    category = MessageCategory.INFO;
              } else {
                    category = MessageCategory.UNKNOWN;
              }
             
              //Decide If The Location Is In Range
              if ((latitude >= south && latitude <= north) && (longitude >= west && longitude <= east)) {
                    isInRange = true;
              } else {
                    isInRange = false;
              }
             
              //Display To Console
              System.out.println("Category:\t" + category);
              System.out.println("Raw Cat:\t" + catString);
              System.out.println("Message:\t" + payload);
              System.out.println("Latitude:\t" + latitude);
              System.out.println("Longitude:\t" + longitude);
              System.out.println("In Range:\t" + isInRange);
             
       }
 
}
