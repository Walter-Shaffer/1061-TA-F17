import java.util.Scanner;
/*
* LinkExtractor.java
* Author: Heather Wright
* Submission Date: October 13, 2017
*
* Purpose: This program prompts the user to input a link or press 
* Q to quit. If the user presses Q the program terminates. If the 
* user inputs an invalid URL the program will output an error message
* and reprompt the user to enter URL. Once the user enters a valid URL
* meaning it begins with http or https the program prompts the user to 
* input the number that matches the types of hypertext they are looking 
* for. If the user inputs a value greater than 5 or less than 1 the program 
* will print out invalid number and prompt the user to enter another number.
* Once the number is valid the program checks to see if the string 
* returned by fetch is valid, meaning it doesn't being with $error$. 
* If the string is not valid the program prints out the error message 
* and asks the user for another link. If the string is valid the string 
* is scanned and spliced and printed depending on the type of link the
* user requested. It prints out the links as well as the total number of
* the type of link it was searching for. Lastly the code will loop prompting
* the user for another link and repeating the process. 
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
public class LinkExtractor {
	public static void main(String[] args) {
		Scanner	keyboard = new Scanner(System.in);
		
		String website;
		String webpage;
		String link;
		Boolean error;
		int typeOfLink;
		int start;
		int linkStart;
		int linkFinish;
		int k = 0;
		int i;
		char Q;
		
		while(k <= 20) { // k increments after Fetch has been invoked this statement terminates the program after 20 attempts
			System.out.println("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit:");
			System.out.print(">> ");
			website = keyboard.next();
			Q = website.charAt(0);
			if(Q == 'Q' || Q == 'q') { //if the first letter input by the user is Q the program will terminate
				System.out.println("Goodbye!");
				System.exit(0);
			}
			if(website.length() >= 7 && (website.substring(0, 7).equalsIgnoreCase("http://") 
					|| website.substring(0, 8).equalsIgnoreCase("https://"))) { //if website beings with http:// or https:// which are valid inputs
				webpage = Fetch.fetchURL(website);
				k++;
				if((webpage.substring(0, 7).equalsIgnoreCase("$error$") == false)) { //if webpage doesn't start with $error$
					webpage = Fetch.fetchURL(website);
					start = webpage.indexOf("href=");
					webpage = webpage.substring(start);
					webpage = webpage.replace(' ', '>');
					error = false;
				}
				else { //if webpage does start with $error$
					error = true;
				}
				System.out.println("\nEnter the type of link to look for (1-5)\n");
				System.out.println("1. Images (PNG, JPG, BMP, GIF)");
				System.out.println("2. Documents (DOC, TXT, PDF)");
				System.out.println("3. Hypertext (HTM, HTML)");
				System.out.println("4. All Links");
				System.out.println("5. Quit");
				System.out.print(">> ");
				typeOfLink = keyboard.nextInt();
				while(typeOfLink > 5 || typeOfLink < 1) { // prints error message if input is incorrect and prompts user to enter a new input
					System.out.println("\nPlease enter a valid number");
					System.out.print(">> ");
					typeOfLink = keyboard.nextInt();
				} // if a valid number has been input (1-5)
				if(typeOfLink == 1) {
					i = 0;
					if(error == true) { //if the webpage started with $error$
						System.out.println("\nSearching " + website);
						System.out.println("Searching for: images\n");
						System.out.println(webpage.substring(7) + "\n");
					}
					else { //webpage doesn't start with $error$
						System.out.println("\nSearching " + website);
						System.out.println("Searching for: images\n");
						while(webpage.indexOf("href=") >= 0) { // href= is in webpage string
							linkStart = webpage.indexOf("href=") + 6; //beginning of the link
							linkFinish = webpage.indexOf("\">");
							link = webpage.substring(linkStart, linkFinish); //link doesnt start with href= it starts with HTTP so change this
							if(link.substring(link.length() - 4, link.length()).equalsIgnoreCase(".png") 
									|| link.substring(link.length() - 4, link.length()).equalsIgnoreCase(".jpg") 
									|| link.substring(link.length() - 4, link.length()).equalsIgnoreCase(".bmp") 
									|| link.substring(link.length() - 4, link.length()).equalsIgnoreCase(".gif")) {
									// searches link to see if it ends with the proper text for a image
								link = link.replace('>', ' ');
								System.out.println((i + 1) + ". " + link);
								webpage = webpage.substring(linkFinish + 2);
								i++;
							}
							else { //the link isn't an image
								webpage = webpage.substring(linkFinish + 2);
							}
						}
						System.out.println("\nNumber of Links Found: " + i + "\n");
					}
				}
				else if(typeOfLink == 2) {
					i = 0;
					if(error == true) {
						System.out.println("\nSearching " + website);
						System.out.println("Searching for: documents\n");
						System.out.println(webpage.substring(7) + "\n");
					}
					else {
						System.out.println("\nSearching " + website);
						System.out.println("Searching for: documents\n");
						while(webpage.indexOf("href=") >= 0) {
							linkStart = webpage.indexOf("href=") + 6;
							linkFinish = webpage.indexOf("\">");
							link = webpage.substring(linkStart, linkFinish); //link doesnt start with href= it starts with HTTP so change this
							if(link.substring(link.length() - 4, link.length()).equalsIgnoreCase(".doc") 
									|| link.substring(link.length() - 4, link.length()).equalsIgnoreCase(".txt")  
									|| link.substring(link.length() - 4, link.length()).equalsIgnoreCase(".pdf")) {
								link = link.replace('>', ' ');
								System.out.println((i + 1) + ". " + link);
								webpage = webpage.substring(linkFinish + 2);
								i++;
							}
							else {
								webpage = webpage.substring(linkFinish + 2);
							}
						}
						System.out.println("\nNumber of Links Found: " + i + "\n");
					}
				}
				else if(typeOfLink == 3) {
					i = 0;
					if(error == true) {
						System.out.println("\nSearching " + website);
						System.out.println("Searching for: hypertext\n");
						System.out.println(webpage.substring(7) + "\n");
					}
					else {
						System.out.println("\nSearching " + website);
						System.out.println("Searching for: hypertext\n");
						while(webpage.indexOf("href=") >= 0) {
							linkStart = webpage.indexOf("href=") + 6;
							linkFinish = webpage.indexOf("\">");
							link = webpage.substring(linkStart, linkFinish); //link does not start with href= it starts with HTTP so change this
							if(link.substring(link.length() - 4, link.length()).equalsIgnoreCase(".htm")
									|| link.substring(link.length() - 5, link.length()).equalsIgnoreCase(".html")) {
								link = link.replace('>', ' ');
								System.out.println((i + 1) + ". " + link);
								webpage = webpage.substring(linkFinish + 2);
								i++;
							}
							else {
								webpage = webpage.substring(linkFinish + 2);
							}
						}
						System.out.println("\nNumber of Links Found: " + i + "\n");
					}
				}
				else if(typeOfLink == 4) {
					i = 0;
					if(error == true) {
						System.out.println("\nSearching " + website);
						System.out.println("Searching for: all links\n");
						System.out.println(webpage.substring(7) + "\n");
					}
					else { 
						System.out.println("\nSearching " + website);
						System.out.println("Searching for: all links\n");
						while(webpage.indexOf("href=") >= 0) {
							linkStart = webpage.indexOf("href=") + 6;
							linkFinish = webpage.indexOf("\">");
							link = webpage.substring(linkStart, linkFinish); 
							link = link.replace('>', ' ');
							System.out.println((i + 1) + ". " + link);
							webpage = webpage.substring(linkFinish + 2);
							i++;
						}
						System.out.println("\nNumber of Links Found: " + i + "\n");
					}
				}
				else if(typeOfLink == 5) {
					System.out.println("Goodbye!");
					System.exit(0);
				}		
			}
			else { //when the URL is invalid
				System.out.println("\nInput was unrecognized.");
			}
		}	
		keyboard.close();
	}
}
			
		
	

