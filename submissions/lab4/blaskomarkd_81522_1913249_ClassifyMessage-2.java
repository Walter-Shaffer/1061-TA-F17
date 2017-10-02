/*
* ClassifyMessage.java
* Author: Mark Blasko
* Submission Date: 09/26/17
* Purpose: The purpose of this program is to create messages based on categories such as:
Category, latitude, longitude, and message. The program provides more structure to
the messages ultimately leading to more effecient classification (of the message).
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
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
  public static enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String catString;
    String payload;
    double latitude;
    double longitude;
    boolean isInRange;
    MessageCategory category; //end of variable initialization

    final double south = 39.882343;
    final double north = 40.231315;
    final double west = -105.743511;
    final double east = -104.907864;

    System.out.println("Please enter a formatted message:");

    catString = keyboard.next(); //beginning of user input
    catString = catString.trim();
    latitude = keyboard.nextDouble();
    longitude = keyboard.nextDouble();
    payload = keyboard.nextLine();
    payload = payload.trim(); //end of user input

    if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")) {
      category = MessageCategory.ALERT;

    }
    else if (catString.equalsIgnoreCase("need")) {
      category = MessageCategory.NEED;

    }
    else if (catString.equalsIgnoreCase("offer")) {
      category = MessageCategory.OFFER;

    }
    else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
      category = MessageCategory.INFO;

    }
    else {
      category = MessageCategory.UNKNOWN;

    }

    if (latitude >= south && latitude <= north && longitude >= west && longitude <= east) {
      isInRange = true;

    }
    else {
      isInRange = false;
    } //End of if-else statements

    System.out.println("Category: \t" + category);
    System.out.println("Raw Cat: \t" + catString);
    System.out.println("Message: \t" + payload);
    System.out.println("Latitude: \t" + latitude);
    System.out.println("Longitude: \t" + longitude);
    System.out.println("In Range: \t" + isInRange);
    
    keyboard.close(); //end of scanner

  }

}
