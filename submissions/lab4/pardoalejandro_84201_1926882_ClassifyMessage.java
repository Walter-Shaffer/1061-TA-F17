import java.util.Scanner;

/*
* Author:  Alejandro Pardo
* Submission Date:  9/28/2017
* Purpose: Separate user's input into different categories.
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

public class ClassifyMessage {
	
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	public static void main (String [] args){

	Scanner keyboard = new Scanner(System.in);
	
	String catString;
	String payload;
	double latitude;
	double longitude;
	boolean isInRange;
	MessageCategory category;
	
	
	double south = 39.882343;
	double north = 40.231315;
	double west = -105.743511;
	double east = -104.907864;
	
	System.out.println("Please enter a formatted message: ");
	
	//the next lines of codes will gather what line belong to what variable//
	catString = keyboard.next();
	
	latitude = keyboard.nextDouble();
	
	longitude = keyboard.nextDouble();
	
	payload = keyboard.nextLine();
	
	payload = payload.trim();
	
	catString = catString.trim();
	
	if (catString.equalsIgnoreCase("fire") || catString.equalsIgnoreCase("smoke")){
		category = MessageCategory.ALERT;}
	//this statement tells that if the first word in the statement is fire//
		//the category variable will print out ALERT//
	
	else if (catString.equalsIgnoreCase("need")){ 
		category = MessageCategory.NEED;}
	
	
	
	//these else if statements change the category variable depending on first word in the statement//
	else if (catString.equalsIgnoreCase("offer")){ 
		category = MessageCategory.OFFER;}
	
	
	
	
	else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road")||catString.equalsIgnoreCase("photo")||catString.equalsIgnoreCase("evac")){
		category = MessageCategory.INFO;
	}else{
	category = MessageCategory.UNKNOWN;}
	//the next if-else statement has to check if the latitude and longitude meet the conditions//

	
	
	if ((latitude>=south && north>=latitude) && (longitude>=west && east>=east)){
		isInRange = true;}
	else{
		isInRange = false;}
	
	//the next System.out.println will print the output for the if else statements above//
	System.out.println("Category:\t"+category);
	System.out.println("Raw Cat:\t"+catString);
	System.out.println("Message:\t"+ payload);
	System.out.println("Latitude:\t"+ latitude);
	System.out.println("Longitude:\t"+longitude);
	System.out.println("In Range:\t"+isInRange);
	}





}
			

	
	
	
	

