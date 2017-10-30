/*
 * LinkExtractor.java
 * Author: Mitchell Lamb
 * Submission Date: 10/13/2017
 * 
 * Purpose: The purpose of this program is to prompt the user for a URL, access the
 * web page associated with that URL, parse the page's HTML, and extract hyperlinks
 * present in the HTML. The program should let the user select the sort of links
 * (images, documents, other pages) to search for, and will display the links
 * to the user. The process of asking the user for a URL, accessing the page, and
 * printing extracted links should be repeated until the user chooses to quit.
 * 
 * Statement of Academic Honesty:
 * 
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

import java.util.Scanner;

public class LinkExtractor {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String strURL = ""; // URL that user inputs
		int linkType = 0; // Type of link user chooses
		int fetchCount = 0; // To ensure fetchURL is not called more than 20 times
		
		for(int i = 20; fetchCount<=i;fetchCount++) {
			
			int j = 1;
			while (j == 1) {
				
				// Prompt the user for URL input
				System.out.print("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit:\n>> ");
				strURL = keyboard.next();
				
				// If the user enters a phrase beginning with q or Q, the program terminates
				if ((strURL.charAt(0)=='q') || (strURL.charAt(0)=='Q')) { 
					System.out.print("Goodbye!");
					return;	
				}
				
				j=2; // Ending loop
			
				// If the URl input does not contain http, it repeats loop
				if (!strURL.contains("http")) {
					System.out.print("\nInput was unrecognized.\n");
					j=1;
				}
				
			}
			
			int k=1;
			// Prompt user for type of link
			while (k==1) {
				System.out.print("\nEnter the type of link to look for (1-5):\n");
				System.out.print("\n1. Images (PNG, JPG, BMP, GIF)");
				System.out.print("\n2. Documents (DOC, TXT, PDF)");
				System.out.print("\n3. Hypertext (HTM, HTML)");
				System.out.print("\n4. All links");
				System.out.print("\n5. Quit\n>> ");
				linkType = keyboard.nextInt();
				k=2; // Ending loop
				// If user enters number higher or lower than asked, the loop is repeated.
				if ((linkType>5) || (linkType<1)) {
					System.out.print("\nInvalid number entered.");
					k=1;
				}
			}
			
			// If user selects "Quit" from link choices
			if (linkType==5) {
				System.out.print("Goodbye!");
				return;
			}
			
			// Program uses fetchURL now
			System.out.print("\nSearching " + strURL + "\n");
			
			// Prints type of link being searched for
			if (linkType==1) {
				System.out.print("Searching for: images\n\n");
			} else if (linkType==2) {
				System.out.print("Searching for: documents\n\n");
			} else if (linkType==3) {
				System.out.print("Searching for: hypertext\n\n");
			} else if (linkType==4) {
				System.out.print("Searching for: all links\n\n");
			} 
			
			// Retrieve a web page and return its contents as a string. 
			String webpage = Fetch.fetchURL(strURL); 
			
			// If fetchURL encounters an error
			if (webpage.contains("$error$")) {
				if (webpage.contains("https")) {
					System.out.print("\njava.net.UnknownHostException: " + strURL.substring(8) + "\n\n");
				} else
					System.out.print("\njava.net.UnknownHostException: " + strURL.substring(7) + "\n\n");
			}
			
			int start=0; // Start of substring
			int finish=0; // End of substring
			int numberLinks=1; // Number of links printed
			
			start = webpage.indexOf("href=\""); // Find where link begins
			finish = webpage.indexOf("\">",start); // Find where link ends
			
			// If user selects images, program prints image links
			if (linkType==1) {
				while (start>=0) {
					String type = webpage.substring(start+6, finish);
					if (type.contains("\" >")) {
						finish = webpage.indexOf("\" >");
						type = webpage.substring(start+6, finish);
					}
					if (type.contains("\"  >")) {
						finish = webpage.indexOf("\"  >");
						type = webpage.substring(start+6, finish);
					}
					if (type.contains("png") || type.contains("jpg") || type.contains("bmp") || type.contains("gif")) {
						System.out.print(numberLinks + ". " + type + "\n");
						numberLinks++;
					}
					start = webpage.indexOf("href=\"",start+1);
					finish = webpage.indexOf("\">",start);
				}
			}
			
			// If user selects documents, program prints document links
			if (linkType==2) {
				while (start>=0) {
					String type = webpage.substring(start+6, finish);
					if (type.contains("\" >")) {
						finish = webpage.indexOf("\" >");
						type = webpage.substring(start+6, finish);
					}
					if (type.contains("\"  >")) {
						finish = webpage.indexOf("\"  >");
						type = webpage.substring(start+6, finish);
					}
					if (type.contains("doc") || type.contains("txt") || type.contains("pdf")) {
						System.out.print(numberLinks + ". " + type + "\n");
						numberLinks++;
					}
					start = webpage.indexOf("href=\"",start+1);
					finish = webpage.indexOf("\">",start);
				}
			}
			
			// If user selects hypertext, program prints hypertext links
			if (linkType==3) {
				while (start>=0) {
					String type = webpage.substring(start+6, finish);
					if (type.contains("\" >")) {
						finish = webpage.indexOf("\" >");
						type = webpage.substring(start+6, finish);
					}
					if (type.contains("\"  >")) {
						finish = webpage.indexOf("\"  >");
						type = webpage.substring(start+6, finish);
					}
					if (type.contains("htm") || type.contains("html")) {
						System.out.print(numberLinks + ". " + type + "\n");
						numberLinks++;
					}
					start = webpage.indexOf("href=\"",start+1);
					finish = webpage.indexOf("\">",start);
				}
			}
			
			// If user selects  all links, program prints all links
			if (linkType==4) {
				while (start>=0) {
					String type = webpage.substring(start+6, finish);
					if (type.contains("\" >")) {
						finish = webpage.indexOf("\" >");
						type = webpage.substring(start+6, finish);
					}
					if (type.contains("\"  >")) {
						finish = webpage.indexOf("\"  >");
						type = webpage.substring(start+6, finish);
					}
					System.out.print(numberLinks + ". " + type + "\n");
					numberLinks++;
					start = webpage.indexOf("href=\"",start+1);
					finish = webpage.indexOf("\">",start);
				}
			}
			
			// Program prints number of links printed
			System.out.print("\nNumber of Links Found: " + (numberLinks-1) + "\n\n");
			
			}
		
		keyboard.close(); // Closing the scanner
		
		}
}

