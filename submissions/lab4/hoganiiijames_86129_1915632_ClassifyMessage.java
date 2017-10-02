import java.util.Scanner;
public class ClassifyMessage 
{
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String catString = "";
		String payload = "";
		double latitude = 0;
		double longitude = 0;
		boolean isInRange;
		MessageCategory category;
		double south = 39.882343;
		double north = 40.231315;
		double west = -105.743511;
		double east = -104.907864;
		//category latitude longitude payload
		System.out.println("Please enter a formatted message: ");
		catString = input.next();
		latitude = input.nextDouble();
		longitude = input.nextDouble();
		payload = input.nextLine();
		
		if(catString.equalsIgnoreCase("fire")||catString.equalsIgnoreCase("smoke"))
			category = MessageCategory.ALERT;
		else
			if(catString.equalsIgnoreCase("need"))
				category = MessageCategory.NEED;
			else
				if(catString.equalsIgnoreCase("offer"))
					category = MessageCategory.OFFER;
				else
					if(catString.equalsIgnoreCase("structure")||catString.equalsIgnoreCase("road")||catString.equalsIgnoreCase("photo")||catString.equalsIgnoreCase("evac"))
						category = MessageCategory.INFO;
					else
						category = MessageCategory.UNKNOWN;
		if(((latitude >= south) && (latitude <= north)) && ((longitude >= west) && (longitude <= east)))
			isInRange = true;
		else
			isInRange = false;
		
		System.out.println("Category: \t" + category);
		System.out.println("Raw Cat: \t" + catString);
		System.out.println("Message: \t" + payload);
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
		System.out.println("In Range: \t" + isInRange);
		
	}

}