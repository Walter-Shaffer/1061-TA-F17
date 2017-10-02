import java.util.Scanner;
public class ParseTheTweet {

	public static void main(String[] args) {
		Scanner theScanner = new Scanner(System.in);
		String tweet = "";
		String type, detail, location, latitudeString, longitudeString;
		double latitude, longitude;
		tweet = theScanner.nextLine();
		int start, finish;
		start = tweet.indexOf('#') + 5;
		finish = tweet.indexOf(';');
		type = tweet.substring(start, finish);
		type = type.trim();
		start = tweet.indexOf('#', finish) + 5;
		finish = tweet.indexOf(';', start);
		detail = tweet.substring(start, finish);
		detail = detail.trim();
		start = tweet.indexOf('#', finish) + 5;
		finish = tweet.indexOf(';', start);
		location = tweet.substring(start, finish);
		location = location.trim();
		start = tweet.indexOf('#', finish) + 5;
		finish = tweet.indexOf(';', start);
		latitudeString = tweet.substring(start, finish);
		latitudeString = latitudeString.trim();
		start = tweet.indexOf('#', finish) + 5;
		finish = tweet.indexOf(';', start);
		longitudeString = tweet.substring(start, finish);
		longitudeString = longitudeString.trim();
		theScanner = new Scanner(latitudeString);
		latitude = theScanner.nextDouble();
		theScanner = new Scanner(longitudeString);
		longitude = theScanner.nextDouble();
		type = type.toUpperCase();
		detail = detail.replace(',', '-');
		location = location.replace(',', '-');
		
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail);
		System.out.println("Location:\t" + location);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		
	}

}
