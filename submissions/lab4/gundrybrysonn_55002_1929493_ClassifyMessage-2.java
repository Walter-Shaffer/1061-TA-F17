/*
ClassifyMessage.java
Author: Bryson Gundry
Submission Date: 9/28/2017

Purpose: The purpose of this lab is to parse data out of a formatted message
using if  / then statements as well as the further use of the string class.

Statement of Academic Honesty:
The following code represents my own work. I have neither
received nor given inappropriate assistance. I have not copied
or modified code from any source other than the course webpage
or the course textbook. I recognize that any unauthorized
assistance or plagiarism will be handled in accordance
with the policies at Clemson University and the
policies of this course. I recognize that my work is based
on an assignment created by the School of Computing
at Clemson University. Any publishing or posting
of source code for this project is strictly prohibited
unless you have written consent from the instructor.
*/
import java.util.Scanner;
public class ClassifyMessage {
enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String catString, payload;
		double latitude, longitude;
		boolean isInRange;
		MessageCategory category;
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		catString = catString.trim();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		payload = payload.trim();
		
		if (catString.equalsIgnoreCase ("fire") || catString.equalsIgnoreCase(("smoke"))){
			category = MessageCategory.ALERT;
			System.out.println("Category:\tALERT");
		}
			
			else if (catString.equalsIgnoreCase("need")){
				category = MessageCategory.NEED;
				System.out.println("Category:\t\tNEED");
			}
			else if (catString.equalsIgnoreCase("offer")){
				category = MessageCategory.OFFER;
				System.out.println("Category:\t\tOFFER");
			}
				
			else if (catString.equalsIgnoreCase ("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")){
				category = MessageCategory.INFO;
				System.out.println("Category:\t\tINFO");
			}
		
			else{
				category = MessageCategory.UNKNOWN;
				System.out.println("Category:\t\tUNKNOWN");
			}
			System.out.println("Raw Cat:\t\t" + catString);
			System.out.println("Message:\t\t" + payload);
			System.out.println("Latitude:\t\t" + latitude);
			System.out.println("Longitude:\t\t" + longitude);
			
		if (latitude >= south && latitude <= north && longitude >= west && longitude <= east){
			isInRange = true;
			System.out.println("In Range:\t\t" + isInRange);
		}
			else{
				isInRange = false;
				System.out.println("In Range:\t\t" + isInRange);
				
				
			}
					
					
		}
	}


