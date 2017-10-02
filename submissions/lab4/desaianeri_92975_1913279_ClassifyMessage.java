/*
* [ClassifyMessage].java 
* Author: [Aneri Desai]
* Submission Date: [09/26/2017]
* 
* Purpose: In the lab we learned to use multibranch if else statements, use enumerations, boolean 
* 			variables and how to compare strings for equaiy
* 
*  Statement of Academic Honesty:
*  
*  The following code represent my own work. I have neither received nor given inappropriate assistance. 
*  I have not copied or modified code from any source other than the course webpage or the course textbook.
*  I recognize that any unauthorized assistance or plagiarism will be handled in accordance with the policies
*  at Clemson University and the policies of this course. I recognize that my work is based on an assignment 
*  created by the School of Computing at Clemson Univeristy. Any publishing or posting of source code for this 
*  project is strictly prohibited unless you have written consent from the instructor.  
*/

import java.util.Scanner; //import Scanner class
public class ClassifyMessage { 
	
	enum MessageCategory {ALERT,NEED, OFFER, INFO, UNKNOWN}; //declare enumerations

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in); //initialize Scanner class
		String catString; //declare variables String, double and boolean
		String payload;
		
		MessageCategory category;
		
		double latitude;
		double longitude;
		boolean isInRange;
		
		double south; //declare the variable double and initialize its value
		south = 39.882343;
		double north = 40.231315;
		north = 40.231315;
		double west;
		west = -105.743511;
		double east;
		east = -104.907864;
	
		System.out.println("Please enter a formatted message:"); //prompt the users to input the value
		
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		
		payload = payload.trim(); //use trim method
		
		
		//write multibranch if else statements and write the Syste.out.println to get the ouput
		
if (catString.equals("fire") || catString.equals("smoke")) { 
			System.out.println("\nCategory:\t\t\t" + MessageCategory.ALERT);
			System.out.println("Raw Cat:\t\t\t" + catString);
			System.out.println("Message:\t\t\t" + payload);
			System.out.println("Latitude:\t\t\t" + latitude);
			System.out.println("Longitude:\t\t\t" + longitude);
		} else if (catString.equals("need")){
			System.out.println("\nCategory:\t\t\t" + MessageCategory.NEED);
			System.out.println("Raw Cat:\t\t\t" + catString);
			System.out.println("Message:\t\t\t" + payload);
			System.out.println("Latitude:\t\t\t" + latitude);
			System.out.println("Longitude:\t\t\t" + longitude);
		} else if (catString.equals("offer")){
			System.out.println("\nCategory:\t\t\t" + MessageCategory.OFFER);
			System.out.println("Raw Cat:\t\t\t" + catString);
			System.out.println("Message:\t\t\t" + payload);
			System.out.println("Latitude:\t\t\t" + latitude);
			System.out.println("Longitude:\t\t\t" + longitude);
		} else if (catString.equals("structure") || catString.equals("photo") 
				|| catString.equals("road") ||catString.equals("evac")){
			System.out.println("\nCategory:\t\t\t" + MessageCategory.INFO);
			System.out.println("Raw Cat:\t\t\t" + catString);
			System.out.println("Message:\t\t\t" + payload);
			System.out.println("Latitude:\t\t\t" + latitude);
			System.out.println("Longitude:\t\t\t" + longitude);
		}else {
			System.out.println("\nCategory:\t\t\t" + MessageCategory.UNKNOWN);
			System.out.println("Raw Cat:\t\t\t" + catString);
			System.out.println("Message:\t\t\t" + payload);
			System.out.println("Latitude:\t\t\t" + latitude);
			System.out.println("Longitude:\t\t\t" + longitude);
		}
	
if (latitude >= south && latitude <= north && longitude >= west && longitude <= east) { //if else statement for latitude and logitude
					System.out.println("In Range:\t\t\t" + true);
		}else {
				System.out.println("In Range:\t\t\t" + false);
				
			 }
		}
	
	}