/*

* [ClassifyMessage].java

* Author: [Thomas Griffith]

* Submission Date: [September 28, 2017]

*

* Purpose: This program will read messages and parse the message 
* into different sections declared Category, raw cat, message, 
* latitude, longitude and if it is in range. In doing so, This 
* program will have the action and location of your distress signal, or in this case message.
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
		enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	public static void main(String[] args) {
	
		
		Scanner keyboard = new Scanner(System.in);

		String castString;

		String payload;

		double latitude;

		double longitude;

		boolean isInRange;

		MessageCategory category = null;


		double south = 39.882343;

		double north = 40.231315;

		double west = -105.743511;

		double east = -104.907864;

 // The variables above are to categorize the users input into category, raw cat, message, latitude longitude inrange




		System.out.println("Please enter a formatted message:");




		castString = keyboard.next();

		latitude = keyboard.nextDouble();

		longitude = keyboard.nextDouble();

		payload = keyboard.nextLine();
// the variables above call on the users input and splits it up into the following order to get the correct input needed

		
		// The following if and else if statements will call on the first variable that took the users input and categorizes the word with the enumerator at the top
		if (castString.equals("smoke")){

		String Category;


		category = category.ALERT;


		System.out.println("Category:\t" + category);

		}

		else if (castString.equals("offer")){

		String Category;

		category = category.OFFER;

		System.out.println("Category:\t" + category);

		}

		else if (castString.equals("structure")){

		String Category;

		category = category.INFO;

		System.out.println("Category:\t" + category);

		}

		else if (castString.equals("wind")){

		String Category;

		category = category.UNKNOWN;

		System.out.println("Category:\t" + category);

		}

		else if (castString.equals("fire")){

		String Category;

		category = category.ALERT;

		System.out.println("Category:\t" + category);

		}

		else if (castString.equals("evac")){

		String Category;

		category = category.INFO;

		System.out.println("Category:\t" + category);


		}

		else if (castString.equals("nofire")){

		String Category;

		category = category.UNKNOWN;

		System.out.println("Category:\t" + category);

		}

		else if (castString.equals("photo")){

		String Category;

		category = category.INFO;

		System.out.println("Category:\t" + category);

		}

		else if (castString.equals("info")){

		String Category;

		category = category.UNKNOWN;

		System.out.println("Category:\t" + category);

		}

		else if (castString.equals("need")){

		String Category;

		category = category.NEED;

		System.out.println("Category:\t" + category);

		}

		else if (castString.equals("open")){

		String Category;

		category = category.UNKNOWN;

		System.out.println("Category:\t" + category);

		}

		else {

		System.out.println("Please Try Again Incorrect Input");

		}

		

// this prints out the output that has been collected by the users input
		System.out.println("Raw Cat:\t" + castString);

		System.out.println("Message:\t" + payload);

		System.out.println("Latutide:\t" + latitude);

		System.out.println("Longitude:\t" + longitude);

// this is a if statement to see if the emergency is in range with the boundaries of south north west and east
		if( (latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east)){

		isInRange = true;

		System.out.println("In Range\t" + isInRange);

		}
// Here it prints if the emergency is in range or it is to far to receive help
		else{

		isInRange = false;

		System.out.println("In Range\t" + isInRange);

		}
		
		
	}
}
