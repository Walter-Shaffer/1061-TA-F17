/*
* LinkExtractor.java
* Author: Ethan Coppenbarger
* Submission Date: 10/12/2017
*
* Purpose: Find links of a certain type in a webpage
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
		// variables
		boolean validURL = false;
		String URL;																												// this is the raw URL
		Scanner keyboard = new Scanner(System.in);
		int linkType = 0;																										// this is the type of link we are looking for
		int totalLinks = 0;																										// this is the total number of links
		
		
		// get user input
		do {								
			System.out.print("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit: "); 		// user enters URL
			URL = keyboard.next();
			if (URL.toLowerCase().charAt(0) == 'q') { 																			// check to see if user asked to quit
				System.out.println("Goodbye!");
				System.exit(0);
			}
			else if (URL.length() < 8) {																						// return error if link is too short to be a url
				System.out.println("Input was unrecognized.");
			}
			else if ((URL.substring(0, 7).equals("http://")) || (URL.substring(0, 8).equals("https://"))) {						// check for valid URL
				validURL = true;
				linkType = 0;
				while (validURL == true) {
					// ask for what links to look for
					while (linkType < 1 || linkType > 5) {
						System.out.println("Enter the type of link to look for (1-5): \n");										// ask for link type until a valid type is entered
						System.out.println("1. Images (PNG, JPG, BMP, GIF)");
						System.out.println("2. Documents (DOC, TXT, PDF)");
						System.out.println("3. Hypertext (HTM, HTML)");
						System.out.println("4. All Links");
						System.out.println("5. Quit");
						linkType = keyboard.nextInt();
					}
					
					// tell user what if being searched for
					if (linkType == 1) {
						System.out.println("Searching " + URL);
						System.out.println("Searching for: images\n");
					}
					else if (linkType == 2) {
						System.out.println("Searching " + URL);
						System.out.println("Searching for: documents\n");
					}
					else if (linkType == 3) {
						System.out.println("Searching " + URL);
						System.out.println("Searching for: hypertext\n");
					}
					else if (linkType == 4) {
						System.out.println("Searching " + URL);
						System.out.println("Searching for: all links\n");
					}
					else if (linkType == 5) {
						System.out.println("Goodbye!");
						System.exit(0);
					}
					// retrieve web page contents
					String webpage = Fetch.fetchURL(URL);																		
					String webpageFormatted = webpage.toLowerCase();
					
					// check for error in webpage if correctly formatted
					if (webpage.substring(0, 7).equals("$error$")) {															
						System.out.println(webpage.substring(7));
						validURL = false;
					}
					
					// look for links of format <a href="..." in webpage
					for (int i = 0; i <= webpage.length() - 9; i++) {
						// find link start
						if (webpageFormatted.substring(i, i+8).equals("<a href=")) {
							// loop through link text
							for (int f = i+9; webpageFormatted.charAt(f) != '"'; f++) {
								// find link end based on file type
								if (linkType == 1 && (webpageFormatted.substring(f, f+4).equals(".png") || webpageFormatted.substring(f, f+4).equals(".jpg") || webpageFormatted.substring(f, f+4).equals(".bmp") || webpageFormatted.substring(f, f+4).equals(".gif"))) {
									totalLinks += 1;
									System.out.printf("%d. ", totalLinks);
									System.out.print(webpage.substring(i+9, f+4) + "\n");
								}
								else if (linkType == 2 && (webpageFormatted.substring(f, f+4).equals(".doc") || webpageFormatted.substring(f, f+4).equals(".txt") || webpageFormatted.substring(f, f+4).equals(".pdf"))) {
									totalLinks += 1;
									System.out.printf("%d. ", totalLinks);
									System.out.print(webpage.substring(i+9, f+4) + "\n");
								}
								else if (linkType == 3 && (webpageFormatted.substring(f, f+4).equals(".htm") || webpageFormatted.substring(f, f+5).equals(".html"))) {
									totalLinks += 1;
									if (webpage.substring(f, f+5).equals("html")) {
										System.out.printf("%d. ", totalLinks);
										System.out.print(webpage.substring(i+9, f+5) + "\n");
									}
									else {
										System.out.printf("%d. ", totalLinks);
										System.out.print(webpage.substring(i+9, f+4) + "\n");
									}
								}
								else if ((linkType == 4) && (webpageFormatted.charAt(f+5) == ('"'))) {
									totalLinks += 1;
									System.out.printf("%d. ", totalLinks);
									System.out.print(webpage.substring(i+9, f+5) + "\n");
								}
							}
						}
					}
					
					System.out.println("");
					// print the total number of links, if a valid input was entered earlier
					if (validURL == true) {
						System.out.printf("Number of Links Found: %d\n", totalLinks);
					}
					
					// reset the loop's condition variable and the link counter for loop restart
					validURL = false;
					totalLinks = 0;
				}
			}
			// print error message if an invalidly formatted input is entered
			else {
				System.out.println("Input was unrecognized.");
			}
		} while (validURL == false);
		keyboard.close();
	}

}
