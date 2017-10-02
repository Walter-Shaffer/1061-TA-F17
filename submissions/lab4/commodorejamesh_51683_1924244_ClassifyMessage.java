/*
 * CPSC 1060.java
 * Author: James H. Commodore
 * Purpose: Be able to use if-else and other branching statements.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. 
 * I have neither received nor given inappropriate assistance. I have not copied
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
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner keyboard = new Scanner (System.in) ;
		
		String catString ;
		String payLoad ;
		double latitude ;
		double longitude ;
		boolean isInRange ;
		
		MessageCategory category ;
		
		double south = 39.882343 ; 	//southernmost latitude
		double north = 40.231315 ; 	//northernmost latitude
		double west = -105.743511 ;	//westernmost longitude
		double east = -104.904964 ;	//easternmost longitude
		
		System.out.println("Please enter a formatted message:") ;
		
		catString = keyboard.next() ;
		latitude = keyboard.nextDouble() ;
		longitude = keyboard.nextDouble() ;
		payLoad = keyboard.nextLine() ;
		payLoad = payLoad.trim();
		
		if (catString.equals("fire")) 
			System.out.println("Category:" + "\t"+ "ALERT");
		else if (catString.equals("smoke"))
			System.out.println("Category:" + "\t" + "ALERT");
		else if (catString.equals("need"))
			System.out.println("Category:" + "\t" + "NEED") ;
		else if (catString.equals("offer"))
			System.out.println("Category:" + "\t" + "OFFER");
		else if (catString.equals("structure"))
			System.out.println("Category:" + "\t" +"INFO");
		else if (catString.equals("road"))
			System.out.println("Category:" + "\t" +"INFO");
		else if (catString.equals("photo"))
			System.out.println("Category:" + "\t" +"INFO");
		else {
			System.out.println("Category:" + "\t" +"UNKNOWN");
		}
		
		System.out.println("Raw Cat:" + "\t" + catString);
		System.out.println("Message:" + "\t" + payLoad);
		System.out.println("Latitude" + "\t" + latitude);
		System.out.println("Longitude" + "\t" + longitude);
		
		if (( latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east)) 
			System.out.println("In Range:" + "\t" + "true" );
		else {
			System.out.println("In Range:" + "\t" + "false");
		}
		// TODO Auto-generated method stub
	}

}
