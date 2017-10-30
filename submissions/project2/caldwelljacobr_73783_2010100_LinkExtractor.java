
/*
* LinkExtractor.java
* Author: Jacob Caldwell
* Submission Date: 10/13/2017
*
* Purpose: Asks for a URL from the user and determines the links within that URL
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
		
		int instanceQ = -1;
		while (instanceQ != 0) { 
			Scanner keyboard = new Scanner(System.in);
			int start;
			int finish;
			String strURL;
			int strInt = -1;
			String beginURL = "";
			
			System.out.println("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit:");
			strURL = keyboard.nextLine();
			strURL = strURL.trim();
			instanceQ = strURL.indexOf("q");
			// if index of q = 0, then that means the program begins with the char q, causing the program to quit
	
			if (instanceQ == 0) {
				System.out.println("Goodbye!");
				System.exit(0);
			}
			else{
				start = strURL.indexOf("h");
				finish = strURL.indexOf("/") + 2;
				if (start >= 0){
					beginURL = strURL.substring(start, finish);
				}
				if (!beginURL.equalsIgnoreCase("http://") && !beginURL.equalsIgnoreCase("https://")) {
					System.out.println("");
					System.out.println("Input was unrecognized");
					// ensures that the user inputs a valid URL
				}
				else {
					String webpage = Fetch.fetchURL(strURL);
					if (webpage.indexOf("$error$") != -1){
						System.out.println("");
						System.out.println("java.net.UnknownHostException: AnUnknownHost");
						System.out.println("");
					}
					else {	
						while (strInt < 1 || strInt > 5){
							System.out.println("");
							System.out.println("Enter the type of link to look for (1-5):");
							System.out.println("");
							System.out.println("1. Images (PNG, JPG, BMP, GIF)");
							System.out.println("2. Documents (DOC, TXT, PDF)");
							System.out.println("3. Hypertext (HTM, HTML)");
							System.out.println("4. All Links");
							System.out.println("5. Quit");
							strInt = keyboard.nextInt();
						
							if (strInt == 5) {
								System.out.println("Goodbye!");
								System.exit(0);
								// causes the program to end
							}
							if (strInt < 1 || strInt > 4) {
								System.out.println("Invalid Number Entered");
								// ensures the user inputs a valid digit within the range of 1-5
							}
							else {
								System.out.println("Searching " + strURL);
								String type;
								if (strInt == 1) {
									type = "images";
									System.out.println("Searching for: " + type);
								}
								if (strInt == 2) {
									type = "documents";
									System.out.println("Searching for: " + type);
								}
								if (strInt == 3) {
									type = "hypertext";
									System.out.println("Searching for: " + type);
								}
								if (strInt == 4) { 
									type = "all links";
									System.out.println("Searching for: " + type);
								}
								
								int end = webpage.indexOf("href");
								int count = 0;
								
								String excess = webpage.substring(0, end);
								webpage = webpage.replace(excess, "");
								// removes html references from the program
								while (webpage.indexOf("http") != -1) {
									excess = webpage.substring(0, webpage.indexOf("http"));
									webpage = webpage.replace(excess, "");
									start = webpage.indexOf("http");
									finish = webpage.indexOf("\"");
									String link = webpage.substring(start, finish);
									link = link.trim();
									// extracts each link from the html
									
									// the int the user enters determines the links that will be searched for	
									if (strInt == 1){
										if (link.toLowerCase().indexOf(".png".toLowerCase()) != -1) {
											count++;
											System.out.println(count + ". " + link);
										}
										if (link.toLowerCase().indexOf(".jpg".toLowerCase()) != -1) {
											count++;
											System.out.println(count + ". " + link);
										}
										if (link.toLowerCase().indexOf(".bmp".toLowerCase()) != -1) {
											count++;
											System.out.println(count + ". " + link);
										}
										if (link.toLowerCase().indexOf(".gif".toLowerCase()) != -1) {
											count++;
											System.out.println(count + ". " + link);
										}
									}
									if (strInt == 2){
										if (link.toLowerCase().indexOf(".doc".toLowerCase()) != -1) {
											count++;
											System.out.println(count + ". " + link);
										}
										if (link.toLowerCase().indexOf(".txt".toLowerCase()) != -1) {
											count++;
											System.out.println(count + ". " + link);
										}
										if (link.toLowerCase().indexOf(".pdf".toLowerCase()) != -1) {
											count++;
											System.out.println(count + ". " + link);
										}
									}
									if (strInt == 3) {
										if (link.toLowerCase().indexOf(".htm".toLowerCase()) != -1) {
											count++;
											System.out.println(count + ". " + link);
										}
										if (link.toLowerCase().indexOf(".html".toLowerCase()) != -1) {
											count++;
											System.out.println(count + ". " + link);
										}
									}
									if (strInt == 4){
										count++;
										System.out.println(count + ". " + link);
									}
									
									webpage = webpage.replaceFirst(link, "");
									webpage = webpage.trim();		
								}
								
								System.out.println("");	
								System.out.println("Number of Links Found: " + count);
								System.out.println("");
								
							}
				
						}
					}
				}
			}
		}

	}

}
