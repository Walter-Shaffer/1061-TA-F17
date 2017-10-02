
import java.util.Scanner;

public class ClassifyMessage {
	public	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
System.out.println("Please enter a formatted message:");
	String catString;
	String payLoad;
	double latitude;
	double longitude;
	boolean  isInRange;
	
	MessageCategory category;
	
	double south = 39.882343;
	double north = 40.231315;
	double west = -105.743511;
	double east = -104.907864;
	
	catString = keyboard.next();
	latitude = keyboard.nextDouble();
	longitude = keyboard.nextDouble();
	payLoad = keyboard.nextLine();
	boolean equals1 = catString.equalsIgnoreCase("fire");
	equals1 = catString.equalsIgnoreCase("smoke");
	boolean equals2 = catString.equalsIgnoreCase("need");
	boolean equals3 = catString.equalsIgnoreCase("offer");
	boolean equals4 = catString.equalsIgnoreCase("structure");
	equals4 = catString.equalsIgnoreCase("road");
	equals4 = catString.equalsIgnoreCase("photo");
	equals4 = catString.equalsIgnoreCase("evac");
if (equals1)
	category = MessageCategory.ALERT;
else if (equals2)
	category = MessageCategory.NEED;
	 else if (equals3)
		category = MessageCategory.OFFER;
	 	  else if (equals4)
	 		  category = MessageCategory.INFO;
	 	  	   else 
	 	  		   category = MessageCategory.UNKNOWN;

isInRange = (latitude >= south && latitude<= north && longitude >= west && longitude <= east);


	System.out.println("Category:\t" +category);
	System.out.println("Raw Cat:\t" +catString);
	System.out.println("Message:\t" +payLoad.trim());
	System.out.println("Latitude:\t" +latitude);
	System.out.println("Longitute:\t" +longitude);
	System.out.println("in Range:\t" +isInRange);
	
	keyboard.close();
}
}
