/*
* LinkExtractor.java
* Author: Patrick Coffee
* Submission Date: 10/10/17
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* Parses the website and extracts links depending on user input
* 
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
	
		Scanner keyboard = new Scanner(System.in);		// Scanner Initialized
	
		String rawURL = "";
		String strURL = "";	
		String webpage = "";	
		int linkCount = 0;
		int linkNumber = 0;
		int beginning = 0;
		int finish = 0;
		boolean something;
		boolean valid = true;
				
		while(valid){ // Big while loop to repeat the whole thing if its required
			linkCount = 0;
			keyboard = new Scanner(System.in);
			System.out.println("Enter a URL to read from (include the \"http://\" or \"https://\")," +
				"or type Q to quit: " );
			System.out.print(">> ");	
			strURL = keyboard.nextLine();
		
			if(strURL.startsWith("Q") || strURL.startsWith("q")){
				System.out.print("Goodbye!");
				valid = false;
			} else if (strURL.startsWith("http://") || strURL.startsWith("https://")){
				
				System.out.println();
				System.out.println("Enter the type of link to look for (1-5)");
				System.out.println();
				System.out.println("1. Images (PNG, JPG, BMP, GIF) ");
				System.out.println("2. Documents (DOC, TXT, PDF) ");
				System.out.println("3. Hypertext (HTM, HTML)");
				System.out.println("4. All Links");
				System.out.println("5. Quit " );
			    System.out.print(">> ");
				linkNumber = keyboard.nextInt();
				// System.out.println("Hello World");
				
				System.out.println();
				System.out.println("Searching " + strURL);
				
			if (linkNumber == 1) { // If loop for looping through the words and such
				System.out.println("Searching for: images");
				System.out.println();
			}
			else if(linkNumber == 2) {
				System.out.println("Searching for: documents");
				System.out.println();
			}
			else if(linkNumber == 3) { 
				System.out.println("Searching for: hypertext");
				System.out.println();
			}
			else if(linkNumber == 4) {
				System.out.println("Searching for: all");
				System.out.println();
			}
				webpage = Fetch.fetchURL(strURL);
				
			while (webpage.indexOf("href=\"") != -1) { // while loop statement 
			
				//w = webpage.substring(beginning, finish);
				//e = webpage.substring(beginning, finish);
				
				beginning = webpage.indexOf("href=\"")+6; // variable names for variables
				finish = webpage.indexOf("\">");
				rawURL = webpage.substring(beginning);
				webpage = webpage.substring(beginning);
				finish = webpage.indexOf("\">");
				rawURL = rawURL.substring(0, finish);
				
				if(linkNumber == 1){ //If statement for finding and retrieving file names
					if ((rawURL.indexOf(".png")  != -1) || (rawURL.indexOf(".jpg") != -1) || (rawURL.indexOf(".bmp") != -1) || (rawURL.indexOf(".gif") != -1)) {
						linkCount++;
						System.out.println(linkCount + "." + rawURL);
						System.out.println();
					}
				}
				else if(linkNumber == 2){
					if ((rawURL.indexOf(".doc") != -1) || (rawURL.indexOf(".txt") != -1) || (rawURL.indexOf(".pdf") != -1)) {
						linkCount++;
						System.out.println(linkCount + "." + rawURL);
					
					}
				}
				else if(linkNumber == 3){
					 if ((rawURL.indexOf(".htm") != -1) || (rawURL.indexOf(".html") != -1)) {
						linkCount++;
						System.out.println(linkCount + "." + rawURL);
						
					 }
				}
				else if(linkNumber == 4){
					if ((rawURL.indexOf(".png") != -1) || (rawURL.indexOf(".jpg") != -1) || (rawURL.indexOf(".bmp") != -1) || (rawURL.indexOf(".gif") != -1) ||
					  (rawURL.indexOf(".doc") != -1) || (rawURL.indexOf(".txt") != -1) ||  (rawURL.indexOf(".pdf") != -1) || (rawURL.indexOf(".htm") != -1) || (rawURL.indexOf(".html") != -1)){
						linkCount++;
						System.out.println(linkCount + "." + rawURL);
						
					}
				}
				else if(linkNumber == 5){
					System.out.print("Goodbye!");
					System.exit(0);
				}
			}
			
		}
	}
}
}
