/**
 * LinkExtractor.java
 * Author: Jacky Wong
 * Submission Date: 10/12/2017
 * 
 * Purpose: Prints links present in a webpage given by 
 * a user inputed URL.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance
 * with the policies at Clemson university and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the School of Computing
 * at Clemson University. Any publishing or posting
 * of source code for this project is strictly prohibited
 * unless you have written consent from the instructor.
 */

/** Get scanner */
import java.util.Scanner;

public class LinkExtractor {

	public static void main(String[] args) {
		
		/** Initialize variables */
		String strURL = "", webpage = "", links = "", currentLink = "", lowerCurrentLink = "";
		int start, finish, type = 0, numberLinks = 0, listNumber = 1;
		boolean proceed = false; 			// Determines whether program is okay to proceed
		boolean restart = true; 			// Determines whether the outermost loop will be restarted
		
		/** Begin outermost loop */
		while (restart == true) {
			strURL = "";					// Clear the user-given URL
			
			/** Ask for URL or to quit */
			while (proceed == false) {
				links = "";					// Clear the list of links
				numberLinks = 0;			// Reset the number of links found to zero
				listNumber = 1;				// Reset the list number to one
				Scanner keyboard = new Scanner(System.in);
				System.out.println("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit:");
				strURL = keyboard.nextLine();
				if (strURL.startsWith("http://") || strURL.startsWith("https://")) {
					webpage = Fetch.fetchURL(strURL);
					proceed = true;			// Don't allow the while loop to continue
				}
				else if (strURL.startsWith("q") || strURL.startsWith("Q")) {
					System.out.println("Goodbye!");
					System.exit(0);
				}
				else {
					System.out.println("\n" + "Input was unrecognized.");
					proceed = false;		// Allow the while loop to continue
				}
			}
			
			proceed = false;				// Resets whether a loop will continue looping
			
			/** Ask for the type of link to search for */
			while (proceed == false) {
				Scanner keyboard = new Scanner(System.in);
				System.out.println("\n" + "Enter the type of link to look for (1-5):");
				System.out.println("\n" + "1. Images (PNG, JPG, BMP, GIF)");
				System.out.println("2. Documents (DOC, TXT, PDF)");
				System.out.println("3. Hypertext (HTM, HTML)");
				System.out.println("4. All Links");
				System.out.println("5. Quit");
				type = keyboard.nextInt();
				if (type == 1) {
					System.out.println("\n" + "Searching " + strURL);
					System.out.println("Searching for: images");
					proceed = true;
				}
				else if (type == 2) {
					System.out.println("\n" + "Searching " + strURL);
					System.out.println("Searching for: documents");
					proceed = true;
				}
				else if (type == 3) {
					System.out.println("\n" + "Searching " + strURL);
					System.out.println("Searching for: hypertext");
					proceed = true;
				}
				else if (type == 4) {
					System.out.println("\n" + "Searching " + strURL);
					System.out.println("Searching for: all links");
					proceed = true;
				}
				else if (type == 5) {
					System.out.println("Goodbye!");
					System.exit(0);
				}
				else {
					System.out.println("Input was unrecognized.");
					proceed = false;
				}
			}
			
			proceed = false;

			/** Fetch URL, forming a string */
			/** If there is an error with fetch.java */
			if (webpage.startsWith("$error$")) {
				start = 7+ webpage.indexOf("$error$");
				webpage = webpage.substring(start);
				System.out.println("\n" + webpage + "\n");
			}
			/** If no error */
			else {
				while (webpage.indexOf("a href") > 0) {								// Makes sure there is still links to be found
					if (type == 1) {
						start = 8 + webpage.indexOf("a href=\"");					// Marks the start of a URL
						webpage = webpage.substring(start);							// Shrinks the webpage string to start with the URL
						finish = webpage.indexOf("\"");								// Marks the end of a URL
						currentLink = webpage.substring(0, finish);					// Sets the link under question into its own string
						currentLink = currentLink.trim();							// Makes sure there are no spaces around the link
						lowerCurrentLink = currentLink.toLowerCase();				// Ensures that any file extension with weird capitalization will be a nonissue
						if (lowerCurrentLink.contains(".png") || lowerCurrentLink.contains(".jpg") || lowerCurrentLink.contains(".bmp") || lowerCurrentLink.contains(".gif")) {
							links = links + "\n" + listNumber + ". " + currentLink;		// Adds the link under question to the list of links
							numberLinks += 1;										// Increments the number of corrects links found by one
							listNumber += 1;										// Increments the number of the list by one
						}
						webpage = webpage.substring(finish + 1);					// Sets the webpage string to start after the link in question
					}
					else if (type == 2) {
						start = 8 + webpage.indexOf("a href=\"");
						webpage = webpage.substring(start);
						finish = webpage.indexOf("\"");
						currentLink = webpage.substring(0, finish);
						currentLink = currentLink.trim();
						lowerCurrentLink = currentLink.toLowerCase();
						if (lowerCurrentLink.contains(".doc") || lowerCurrentLink.contains(".txt") || lowerCurrentLink.contains(".pdf")) {
							links = links + "\n" + listNumber + ". " + currentLink;
							numberLinks += 1;
							listNumber += 1;
						}
						webpage = webpage.substring(finish + 1);
					}
					else if (type == 3) {
						start = 8 + webpage.indexOf("a href=\"");
						webpage = webpage.substring(start);
						finish = webpage.indexOf("\"");
						currentLink = webpage.substring(0, finish);
						currentLink = currentLink.trim();
						lowerCurrentLink = currentLink.toLowerCase();
						if (lowerCurrentLink.contains(".htm") || lowerCurrentLink.contains(".html")) {
							links = links + "\n" + listNumber + ". " + currentLink;
							numberLinks += 1;
							listNumber += 1;
						}
						webpage = webpage.substring(finish + 1);
					}
					else if (type == 4) {
						start = 8 + webpage.indexOf("a href=\"");
						webpage = webpage.substring(start);
						finish = webpage.indexOf("\"");
						currentLink = webpage.substring(0, finish);
						currentLink = currentLink.trim();
						links = links + "\n" + listNumber + ". " + currentLink;
						numberLinks += 1;
						listNumber += 1;
						webpage = webpage.substring(finish + 1);
					}
				}
				
				/** Print links */
				System.out.print(links + "\n");
				System.out.print("\n" + "Number of Links Found: " + numberLinks + "\n\n");
			}

		} /** End of outermost loop */
	} 

}
