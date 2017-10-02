/* ClassifyMessage.java 
 * Author:  Alex Dobrenen 
 * Submission Date:  9-28-17  
 * Purpose: A brief paragraph description of the 
 * program. What does it do? classify  short  messages  (like tweets) 
 * based on keywords in the message
 * Statement of Academic Honesty:  
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
//Imports
import java.util.Scanner;

//Class Start
public class ClassifyMessage 
{
	//Enumeration
	enum MessageCategory{NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	//Main Start
	public static void main(String[] args) 
	{
		//Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Variables
		String catString = "";
		String payload = "";
		double latitude = 0.0;
		double longitude = 0.0;
		boolean isInRange = false;
		MessageCategory catagory;
		String input = "";
		
		//Boundaries
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		
		//Input
		System.out.print("Please Eneter a Formated message: ");
		input = keyboard.nextLine();
		Scanner theInput = new Scanner(input);
		
		//Breakdown
		catString = theInput.next();

		latitude = theInput.nextDouble();

		longitude = theInput.nextDouble();

		payload = theInput.nextLine();
		payload.trim();

		
		//Catagory
		if((catString.equalsIgnoreCase("fire")) || (catString.equalsIgnoreCase("smoke")))
		{
			catagory = MessageCategory.ALERT;
		}
		else
		{
			if(catString.equalsIgnoreCase("need"))
			{
				catagory = MessageCategory.NEED;
			}
			else
			{
				if(catString.equalsIgnoreCase("offer"))
				{
					catagory = MessageCategory.OFFER;
				}
				else
				{
					if((catString.equalsIgnoreCase("structure")) 
					|| (catString.equalsIgnoreCase("road")) 
					|| (catString .equalsIgnoreCase("photo")) 
					|| (catString.equalsIgnoreCase("evac")))
					{
						catagory = MessageCategory.INFO;
					}
					else
					{
						catagory = MessageCategory.UNKNOWN;
					}
				}
			}
		}

		//Geography
		if((latitude >= south) && (latitude <= north))
		{
			if((longitude >= west) && (longitude <= east))
			{
				isInRange = true;
			}
		}
		else
		{
			isInRange = false;
		}

		//Output
		System.out.println("Catagory: \t" + catagory);
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		System.out.println("In Range: \t" + isInRange);
		
	}//Main End

}//Class End
