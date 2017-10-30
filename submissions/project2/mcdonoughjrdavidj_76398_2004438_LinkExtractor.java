/*
* LinkExtractor.java
* Author:  David McDonough
* Submission Date:  October 12th, 2017
* Purpose: User inputed website is parsed through either looking for links associated with images, documents, hypertext, or all links. 
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied or modified code from any source other than the course webpage or the course textbook. I recognize that any unauthorized
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
	
	
	enum WebsiteCategory {IMAGES, DOCUMENTS, HYPERTEXT, ALL, QUIT, NOTHING}
	
	public static void main(String[] args) {
		int x = 0;
		int start = 0; 
		int finish;
		Scanner keyboard = new Scanner(System.in);
		WebsiteCategory category = WebsiteCategory.NOTHING;
		String catString = "";
		String parsedWebpage;
		do{ //main do loop that prompts the user to enter a website. If it is valid the loop will continue.
			int count = 0;
			System.out.println("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit:");
			String strURL = keyboard.nextLine();
			String webpage = Fetch.fetchURL(strURL);
			if (strURL.startsWith("http://") || strURL.startsWith("https://")) { //makes sure the website inputed is valid
			do { //do loop that prompts the user to enter the type of link to parse through
					System.out.println("");
					System.out.println("Enter the type of link to look for (1-5)\n\n1. Images (PNG, JPG, BMP, GIF)\n2. Documents (DOC, TXT, PDF)\n3. Hypertext (HTM, HTML)\n4. All Links\n5. Quit");
					catString = keyboard.nextLine();
					if (catString.equals("1")){ //if the user inputs 1, the program will parse through the website for images
						category = WebsiteCategory.IMAGES;
						System.out.println(webpage);
						String cat = "images";
						System.out.println("");
						System.out.println("Searching " + strURL);
						System.out.println("Searching for: " + cat);
						System.out.println("");
						finish = 1;
						start = 1;
						while (start != 0 && finish != -1){ //while loop that parses through the website for links associated with images
							finish = webpage.indexOf("<a href", start);
							start = webpage.indexOf("\"", finish) + 1;
							if (start != -1 && finish != -1){
								finish = webpage.indexOf("\"", start);
								parsedWebpage = webpage.substring(start, finish);
								if (parsedWebpage.toLowerCase().endsWith(".png") || parsedWebpage.toLowerCase().endsWith(".jpg") || parsedWebpage.toLowerCase().endsWith(".bmp") || parsedWebpage.toLowerCase().endsWith(".gif")){
									System.out.println(parsedWebpage);
									count++;
								}
							}
						}
						if (webpage.startsWith("$")){//error message displays if code starts with a $
							String errorMessage = webpage.substring(7);
							System.out.println(errorMessage);
							System.out.println("");
						}
						else {
							System.out.println("");
							System.out.println("Number of Links Found: " + count);//counts the amount of links that are parsed through
							System.out.println("");
						}
						x = 1;
					}
					else if (catString.equals("2")){//if user inputs a 2, the program will look for documents
						category = WebsiteCategory.DOCUMENTS;
						String cat = "documents";
						System.out.println("");
						System.out.println("Searching " + strURL);
						System.out.println("Searching for: " + cat);
						System.out.println("");
						finish = 1;
						start = 1;
						while (start != 0 && finish != -1){ // while loop to parse through website for links associated with documents
							finish = webpage.indexOf("<a href", start);
							start = webpage.indexOf("\"", finish) + 1;
							if (start != -1 && finish != -1){
								finish = webpage.indexOf("\"", start);
								parsedWebpage = webpage.substring(start, finish);
								if (parsedWebpage.toLowerCase().endsWith(".doc") || parsedWebpage.toLowerCase().endsWith(".txt") || parsedWebpage.toLowerCase().endsWith(".pdf")){
									System.out.println(parsedWebpage);
									count++;
								}
							}
						}
						if (webpage.startsWith("$")){//error message will display if webpage starts with $
							String errorMessage = webpage.substring(7);
							System.out.println(errorMessage);
							System.out.println("");
						}
						else {
							System.out.println("");
							System.out.println("Number of Links Found: " + count);//counts the amount of links the program parsed through
							System.out.println("");
						}
						x = 1;
					}
					else if (catString.equals("3")){//if user inputs 3, the program will parse through hypertext
						category = WebsiteCategory.HYPERTEXT;
						String cat = "hypertext";
						System.out.println("");
						System.out.println("Searching " + strURL);
						System.out.println("Searching for: " + cat);
						System.out.println("");
						finish = webpage.indexOf("<a href");
						finish = 1;
						start = 1;
						while (start != 0 && finish != -1){ // while loop that parses through webpage for hypertext
							finish = webpage.indexOf("<a href", start);
							start = webpage.indexOf("\"", finish) + 1;
							if (start != -1 && finish != -1){
								finish = webpage.indexOf("\"", start);
								parsedWebpage = webpage.substring(start, finish);
								if (parsedWebpage.toLowerCase().endsWith(".htm") || parsedWebpage.toLowerCase().endsWith(".html")){
									System.out.println(parsedWebpage);
									count++;
								}
							}
						}
						if (webpage.startsWith("$")){//error message displays if website begins with $
							String errorMessage = webpage.substring(7);
							System.out.println(errorMessage);
							System.out.println("");
						}
						else {
							System.out.println("");
							System.out.println("Number of Links Found: " + count);//counts the amount of links the program parsed through
							System.out.println("");
						}
						x = 1;
					}
					else if (catString.equals("4")){//if user inputs 4, the program will search for all links
						category = WebsiteCategory.ALL;
						String cat = "All Links";
						System.out.println("");
						System.out.println("Searching " + strURL);
						System.out.println("Searching for: " + cat);
						System.out.println("");
						finish = 1;
						start = 1;
						while (start != 0 && finish != -1){ //while loop that parses through website for all links
							finish = webpage.indexOf("<a href", start);
							start = webpage.indexOf("\"", finish) + 1;
							if (start != -1 && finish != -1){
								finish = webpage.indexOf("\"", start);
								parsedWebpage = webpage.substring(start, finish);
								System.out.println(parsedWebpage);
								count++;
							}
						}
						if (webpage.startsWith("$")){//error message displays if program begins with a $
							String errorMessage = webpage.substring(7);
							System.out.println(errorMessage);
							System.out.println("");
						}
						else {
							System.out.println("");
							System.out.println("Number of Links Found: " + count);//counts the amount of links the program parsed through
							System.out.println("");
						}
						x = 1;
					}
					else if (catString.equals("5")){//if user inputs 5, the program will display 'Goodbye!'
						System.out.println("Goodbye!");
						category = WebsiteCategory.QUIT;
						x = 1;
					}
					else{
						System.out.println("Invalid Number Entered.");
					}
				}while (x != 1);
			}
			else if (strURL.startsWith("q") || strURL.startsWith("Q")){//if user inputs a string that begins with 'q', regardless of case, the program will terminate
				System.out.println("Goodbye!");
				System.exit(0);
			}
			else{
				System.out.println("");
				System.out.println("Input was unrecognized.");//if anything other is inputed by user, the input will be unrecognized.
			}
		}while (category != WebsiteCategory.QUIT);
			
	}
}
	

