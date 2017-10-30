import java.util.Scanner;

/*
 * LinkExtractor.java
 * Author: John Xue
 * Submission Date: Oct. 12, 2017
 *
 * Purpose: Prompts user for a URL, accesses the web page,
 * and extract different types of links present in HTML.
 * 
 * Statement of Academic Honesty:
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized assistance
 * or plagiarism will be handled in accordance with the policies at
 * Clemson University and the policies of this course. I recognize that my
 * work is based on an assignment created by the School of Computing at
 * Clemson University. Any publishing or posting of source code
 * for this project is strictly prohibited unless you have written
 * consent from the instructor.
 */

public class LinkExtractor {
	public static void main(String[] args) {
		// A while true loop will continue to run until return function
		while (true) {
			// Init all the variables you need to use
			int start = 0;
			int finish = 0;
			int numberLinks = 0;
			int linkType = 0;
			String url = "";
			String urlData;
			
			// Read input for url
			Scanner keyboard = new Scanner(System.in);
			// Check for correct format
			while (!(url.contains("https://") || url.contains("http://"))) {
				System.out.println("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit:");
				System.out.print(">> ");
				url = keyboard.nextLine();
				// Check for q at the beginning
				if (url.toLowerCase().charAt(0) == 'q') {
					System.out.println("Goodbye!");
					keyboard.close();
					return;
				} else if (!(url.contains("https://") || url.contains("http://"))) {
					System.out.println("\nInput was unrecognized.");
				}
			}
			String data = Fetch.fetchURL(url);
			
			// Read input for type of links to search for
			// Checking whether linkType is b/t 1 and 5
			while (!(linkType > 0 && linkType < 6)) {
				System.out.println("\nEnter the type of link to look for (1-5):\n");
				System.out.println("1. Images (PNG, JPG, BMP, GIF)");
				System.out.println("2. Documents (DOC, TXT, PDF)");
				System.out.println("3. Hypertext (HTM, HTML)");
				System.out.println("4. All links");
				System.out.println("5. Quit");
				System.out.print(">> ");
				linkType = keyboard.nextInt();
			}
			
			// Check for different options
			if (linkType == 1) {
				System.out.println("\nSearching " + url);
				System.out.println("Searching for: images\n");
			} else if (linkType == 2) {
				System.out.println("\nSearching " + url);
				System.out.println("Searching for: documents\n");
			} else if (linkType == 3) {
				System.out.println("\nSearching " + url);
				System.out.println("Searching for: hypertext\n");
			} else if (linkType == 4) {
				System.out.println("\nSearching " + url);
				System.out.println("Searching for: all links\n");
			} else if (linkType == 5) {
				System.out.println("Goodbye!");
				keyboard.close();
				return;
			}
			
			// Prints error message if the "$error" substring is detected
			if (data.substring(0,7).equalsIgnoreCase("$error$")) {
				System.out.println(data.substring(7) + "\n");
			} else {
				// Main parser
				do {
					start = data.indexOf("href=") + 6;
					data = data.substring(start);
					finish = data.indexOf("\"");
					urlData = data.substring(0, finish);

					if (linkType == 1 && urlData.length() > 4 && (urlData.substring(urlData.length() - 4).equalsIgnoreCase(".png")
							|| urlData.substring(urlData.length() - 4).equalsIgnoreCase(".jpg")
							|| urlData.substring(urlData.length() - 4).equalsIgnoreCase(".bmp")
							|| urlData.substring(urlData.length() - 4).equalsIgnoreCase(".gif"))) {
						numberLinks++;
						System.out.println(numberLinks + ". " + urlData);
					} else if (linkType == 2 && urlData.length() > 4 && (urlData.substring(urlData.length() - 4).equalsIgnoreCase(".doc")
							|| urlData.substring(urlData.length() - 4).equalsIgnoreCase(".txt")
							|| urlData.substring(urlData.length() - 4).equalsIgnoreCase(".pdf"))) {
						numberLinks++;
						System.out.println(numberLinks + ". " + urlData);
					} else if (linkType == 3 && urlData.length() > 4 && (urlData.substring(urlData.length() - 4).equalsIgnoreCase(".htm")
							|| urlData.substring(urlData.length() - 5).equalsIgnoreCase(".html"))) {
						numberLinks++;
						System.out.println(numberLinks + ". " + urlData);
					} else if (linkType == 4 && urlData.length() > 1) {
						numberLinks++;
						System.out.println(numberLinks + ". " + urlData);
					}
				} while (data.contains("href="));
				System.out.println("\nNumber of Links Found: " + numberLinks + "\n");
			}
		}
	}
	
}
