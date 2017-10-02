/*
 * ClassifyMessage.java
 * Author: Cameron Halseth
 * Submission Date: 9/29/2017
 * 
 * Purpose: The purpose of this program is to build on skills involving the use
 * if-else and multi-branch statements along with enumerations, boolean variables,
 * and string comparison. This program is to produce correctly formatted output
 * when given a correct user-entered sample message.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither 
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized 
 * assistance or plagiarism will be handed in accordance
 * with the policies at Clemson University and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the School of Computing
 * at Clemson University. Any publishing or posting
 * of source code for this project is strictly prohibited
 * unless you have written consent from the instructor.
 */

import java.util.Scanner;

public class ClassifyMessage {
	
	enum MessageCategory{NEED, OFFER, ALERT, INFO, UNKNOWN}

	public static void main(String[] args) {
		
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
		
		System.out.print("Please enter a formatted message: ");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		catString = catString.trim();
		payload = payload.trim();
		
		if((catString.equals("fire")) || (catString.equals("smoke"))){
		
	}


}
}