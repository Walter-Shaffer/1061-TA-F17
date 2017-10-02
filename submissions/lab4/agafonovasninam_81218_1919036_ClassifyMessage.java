/*

* ClassifyMessage.java

* Author:  Nina Agafonovas

* Submission Date:  September 27, 2017

* Purpose: Use an enumeration to parse the text of user input message to identify the category of the message.

* Honesty:

* The following code represents my own work. I have neither

* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized

* assistance or plagiarism will be handled in accordance
* 
* with the policies at Clemson University and the
* 
* policies of this course. I recognize that my work is based
* 
* on an assignment created by the School of Computing
* 
* at Clemson University. Any publishing or posting
* 
* of source code for this project is strictly prohibited
* 
* unless you have written consent from the instructor.
*/
import java.util.Scanner;
public class ClassifyMessage {
enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}

	

	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

	

	

		String catString;

		String payload;

		double latitude;

		double longitude;

		boolean isInRange;

		MessageCategory category;

		double south = 39.882343;

		double north = 40.231315;

		double west = -105.907864;

		double east = -104.907864;

	

		System.out.println("Please enter a formatted message:");

	

		catString = keyboard.next();

		catString = catString.trim();    		// take out leading and trailing white spaces 

		latitude = keyboard.nextDouble(); 		// bc latitude is declared double value

		longitude = keyboard.nextDouble();

		payload = keyboard.nextLine();

		payload = payload.trim();

	




		if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")){

				category = MessageCategory.ALERT;

					System.out.println("Category: \t"+ category);

				}

		else if (catString.equalsIgnoreCase("need")){

				category = MessageCategory.NEED;

					System.out.println("Category: \t"+ category);

				}

		else if (catString.equals("offer")){

					category = MessageCategory.OFFER;

						System.out.println("Category: \t" + category);

				}

		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") ||catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")){

						category = MessageCategory.INFO;

							System.out.println("Category: \t"+ category);

				}

		else {

			category = MessageCategory.UNKNOWN;

				System.out.println("Category: \t"+ category);

				}

		

		if ((latitude >= south && latitude <= north) && (longitude >= west && longitude <= east)){ // both cases must be true

				isInRange= true;

			}

				else {

					isInRange = false;

				}

				

			

		System.out.print("Raw Cat: \t" + catString);	

		System.out.print("\nMessage: \t" + payload);

		System.out.println("\nLatitude: \t" + latitude);

		System.out.println("Longitude: \t" + longitude);

		System.out.println("In Range: \t" + isInRange);

		

		

	}

}
