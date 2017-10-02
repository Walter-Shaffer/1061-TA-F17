
import java.util.Scanner;

public class ClassifyMessage {
	
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String catString; // The raw text of the message's category 
		String payload; // The primary content of the message
		double latitude; // latitude in the message 
		double longitude; // longitude in the message 
		boolean isInRange; // a "flag" indicating whether latitude and longitude are within bounds 
		MessageCategory category; // message's category
		
		double south = 39.882343; // southernmost latitude
		double north = 40.231315; // northernmost latitude
		double west = -105.743511; // westernmost longitude
		double east = -104.907864; // easternmost longitude
		
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		
		payload = payload.trim();
		catString = catString.trim();
		
		if (catString.equalsIgnoreCase("fire")  || catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		}
			else if (catString.equalsIgnoreCase("need")) {
				category = MessageCategory.NEED;
			}
			else if (catString.equalsIgnoreCase("offer")) {
				category = MessageCategory.OFFER;
			}
			else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || 
					catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
				category = MessageCategory.INFO;
			}
			else {category = MessageCategory.UNKNOWN;}
		
		if ((latitude >= south && latitude <= north) && (longitude >= west && longitude <= east)) {
			isInRange = true;
		}
			
			else {isInRange = false;}
		
		System.out.println("Category:\t " + category);
		System.out.println("Raw Cat:\t " + catString);
		System.out.println("Message:\t " + payload);
		System.out.println("Latitude:\t " + latitude);
		System.out.println("Longitude:\t " + longitude);
		System.out.println("In Range:\t " + isInRange);
	

			
		
		

	}
}

