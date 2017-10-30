/*
* LinkExtractor.java
* Author: Andrew Padgett
* Submission Date: 10/12/17
*
* Purpose: Program allows user to input any valid website that it will then parse for specific links
* 		   based on what links the user tells it to search for. They are then numbered and printed out
* 		   and the program loops back to the beginning to allow another website to be inputed for parsing.
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

import java.util.Scanner;		//import scanner

public class LinkExtractor {
	
	public static void main(String[] args) {
		
		String website;					//declare variables
		int hyperlinkChoice = 0;
		boolean runProgram = true;
		
		while (runProgram == true){			//loop repeats entire program when the end is reached
			runProgram = true;
			Scanner keyboard = new Scanner (System.in);			//create scanner "keyboard"
			System.out.println("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit:");			//prompt user for website
			System.out.print(">> ");
			website = keyboard.nextLine();
			boolean validHtml = false;		//declare booleans for next loops
			boolean validChoice = false;
			
				while(validHtml == false) {		//nested loop that loops when user enters invalid input
					if (website.startsWith("http://") || (website.startsWith("https://"))){			//if statement determines if user inputs valid website or if user wants to quit the program
						validHtml = true;
						runProgram = true;
					}
					else if (website.startsWith("q") || website.startsWith("Q")){
						System.out.println("Goodbye!");
						System.exit(0);
					}
					else{
						validHtml = false;
						System.out.println("\nInput was unrecognized.");			//prompts user for new website if previous website was invalid
						System.out.println("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit:");
						System.out.print(">> ");
						website = keyboard.nextLine();
					}
				}
					
				while (validChoice == false){		//loops back when invalid number is entered
					System.out.println("\nEnter the type of link to look for (1-5):");		//prints out options for what links should be printed out
					System.out.println("\n1. Images (PNG, JPG, BMP, GIF)");
					System.out.println("2. Documents (DOC, TXT, PDF)");
					System.out.println("3. Hypertext (HTM, HTML)");
					System.out.println("4. All Links");
					System.out.println("5. Quit");
					System.out.print(">> ");
					hyperlinkChoice = keyboard.nextInt();
					
					String html = Fetch.fetchURL(website);		//declares string site and fetches the website html to be placed in site

						int beginning = html.indexOf("href");
					
						if (hyperlinkChoice == 1){		//if statement parses html for specific links based on what number the user inputs
							System.out.println("");
							System.out.println("Searching " + website);
							System.out.println("Searching for: images");		//print what program is searching for
							System.out.println("");
							int i = 0;		//int i tells loop when there are no more links to parse
							int j = 1;		//int j number each link when printed
							validChoice = true;		//tells validChoice loop to not loop
							
							if(html.contains("$error$")){			//if statement determines if the website entered is a real website
								int errorStart = html.indexOf("$") + 7;		//prints error statement if website is not valid
								html = html.substring(errorStart);
								System.out.println(html);
								validChoice = true;
							}
							else{
								html = html.substring(beginning);			//cuts everything out of the html before the first link
								while(i >= 0){		//while href is found, loop
									int start = html.indexOf("href") + 6;		//parse out every link in the html code
									int end = html.indexOf("\"", start);
									String found = html.substring(start, end);
									html = html.substring(end + 1);			//cut out the last link so parsing goes through the following links
									if (found.endsWith(".jpg") || found.endsWith(".png") || found.endsWith(".gif") || found.endsWith(".bmp")){		//if statement prints out only those links that end with picture file extensions
										System.out.println(j + ". " + found);																		//print out single link
										j++;																										//j + 1 for numbering each link
									}
									i = html.indexOf("href");				//when html.indexOf("href") returns anything less than 0, loops will end
								}
								System.out.println("\nNumber of Links Found: " + (j - 1));		//prints out total number of links found
							}
						}
						else if (hyperlinkChoice == 2){		//same code but parses for links with document files extensions
							System.out.println("");
							System.out.println("Searching " + website);
							System.out.println("Searching for: documents");
							System.out.println("");
							int i = 0;
							int j = 1;
							validChoice = true;
							
							if(html.contains("$error$")){
								int errorStart = html.indexOf("$") + 7;
								html = html.substring(errorStart);
								System.out.println(html);
								validChoice = true;
							}
							else{
								html = html.substring(beginning);
								while(i >= 0){
									int start = html.indexOf("href") + 6;
									int end = html.indexOf("\"", start);
									String found = html.substring(start, end);
									html = html.substring(end + 1);
									if (found.endsWith(".doc") || found.endsWith(".pdf") || found.endsWith(".txt")){
										System.out.println(j + ". " + found);
										j++;
									}
									i = html.indexOf("href");
								}
								System.out.println("\nNumber of Links Found: " + (j - 1));
							}
						}				
						else if (hyperlinkChoice == 3){		//same code but parses for links with website files extensions
							System.out.println("");
							System.out.println("Searching " + website);
							System.out.println("Searching for: hypertext");
							System.out.println("");
							int i = 0;
							int j = 1;
							validChoice = true;
							
							if(html.contains("$error$")){
								int errorStart = html.indexOf("$") + 7;
								html = html.substring(errorStart);
								System.out.println(html);
								validChoice = true;
							}
							else{
								html = html.substring(beginning);
								while(i >= 0){
									int start = html.indexOf("href") + 6;
									int end = html.indexOf("\"", start);
									String found = html.substring(start, end);
									html = html.substring(end + 1);
									if (found.endsWith(".htm") || found.endsWith(".html")){
										System.out.println(j + ". " + found);
										j++;
									}
									i = html.indexOf("href");
								}
								System.out.println("\nNumber of Links Found: " + (j - 1));
							}
						}
						else if (hyperlinkChoice == 4){		//same code but parses for all links
							System.out.println("");
							System.out.println("Searching " + website);
							System.out.println("Searching for: all links");
							System.out.println("");
							int i = 0;
							int j = 1;
							validChoice = true;
							
							if(html.contains("$error$")){
								int errorStart = html.indexOf("$") + 7;
								html = html.substring(errorStart);
								System.out.println(html);
								validChoice = true;
							}
							else{
								html = html.substring(beginning);
								while(i >= 0){
									int start = html.indexOf("href") + 6;
									int end = html.indexOf("\"", start);
									String found = html.substring(start, end);
									html = html.substring(end + 1);
									System.out.println(j + ". " + found);
									j++;
									i = html.indexOf("href");
								}
								System.out.println("\nNumber of Links Found: " + (j - 1));
							}
						}					
						else if (hyperlinkChoice == 5){		//when 5 is entered, prints out "Goodbye!" and terminates program
							System.out.println("Goodbye!");
							System.exit(0);
						}
						else{		//if 1-5 is not entered, program returns back to printing out the five options
							System.out.println("Please enter a valid choice");
							validChoice = false;
						}
				}
			System.out.println("");			//helps format correct spacing in output
		}		
	}	
}