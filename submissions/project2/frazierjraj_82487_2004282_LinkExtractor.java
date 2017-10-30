import java.util.Scanner;
/*
* [LinkExtractor].java
* Author: [Anthony Frazier]
* Submission Date: [10/12/2017]
*
* Purpose: This program takes user input of a url, determines if it is a valid url, and retrieves
* all of the links of the page, it then asks the user to input a number from 1 to 5 of which
* links they want, and displays said links.
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
		// TODO Auto-generated method stub
		//variable declaration
		String url = "";
		int fetchCount = 0;
		boolean continueProgram = true;
		String page = "";
		Scanner input = new Scanner(System.in);
		//the controling while loop that affect the entire program from here on
		while(continueProgram && fetchCount <= 20){
			boolean invalidUrl = true;
			boolean moreLinks = true;
			boolean invalidNumber = true;
			int typeNumber = 0;
			int end = 0;
			int linkStart = 0;
			
		while(invalidUrl && continueProgram){
			System.out.println("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit:");
			url = input.next();
			//this is taking input for the url from the user and then only running if it starts with http or https
			if (url.startsWith("http") || url.startsWith("https")){
				//tells the while loop it doesn't need to run again
				invalidUrl = false;
				//runs fetch on the url
				page = Fetch.fetchURL(url);
				fetchCount += 1;
				//only runs if the number entered is invalid and the user has not input quit
				if(invalidNumber && continueProgram){
					System.out.println("\nEnter the type of link to look for (1-5):\n");
					System.out.println("1. Images (PNG, JPG, BMP, GIF)");
					System.out.println("2. Documents (DOC, TXT,  PDF)");
					System.out.println("3. Hypertext (HTM, HTML)");
					System.out.println("4. All Links");
					System.out.println("5. Quit");
					typeNumber = input.nextInt();
					//chekcs to make sure number entered is between 1 and 5
					if(typeNumber >= 1 && typeNumber <= 5){
						invalidNumber = false;
						//the conditional statements check the user input and matches it with the corresponding
						//messages while also checking for an error message, parses error message by looking at the seventh index and then printing
						if(typeNumber == 1){
							System.out.println("\nSearching " + url);
							System.out.println("Searching for: images\n");
							if(page.startsWith("$error$")){
								String errorMessage = page.substring(7);
								System.out.println("\n" + errorMessage + "\n");
								invalidUrl = true;
								invalidNumber = true;
							}
					}
						else if(typeNumber == 2){
							System.out.println("\nSearching " + url);
							System.out.println("Searching for: documents\n");
							if(page.startsWith("$error$")){
								String errorMessage = page.substring(7);
								System.out.println("\n" + errorMessage + "\n");
								invalidUrl = true;
								invalidNumber = true;
							}
					}
						else if(typeNumber == 3){
							System.out.println("\nSearching " + url);
							System.out.println("Searching for: hypertext\n");
							if(page.startsWith("$error$")){
								String errorMessage = page.substring(7);
								System.out.println("\n" + errorMessage + "\n");
								invalidUrl = true;
								invalidNumber = true;
							}
							}
						else if(typeNumber == 4){
							System.out.println("\nSearching " + url);
							System.out.println("Searching for: all links\n");
							if(page.startsWith("$error$")){
								String errorMessage = page.substring(7);
								System.out.println("\n" + errorMessage + "\n");
								invalidUrl = true;
								invalidNumber = true;
							}
						}
					}
				}
			}
			//checks to see if user inputs a string beginning with q and if they did stops the program
			else if(url.toLowerCase().startsWith("q")){
				continueProgram = false;
				System.out.println("Goodbye!");
			}
			//this is if the url is not q or a valid input, and repeats the loop to ask again
			else{
				invalidUrl = true;
				System.out.println("Input was unrecognized");
		
			}
		}
		// only executes if the program should continue, sets start of code to the index of href in order to ignore comments
		if(continueProgram){
			int startOfCode = page.indexOf("href");
			page = page.substring(startOfCode);
		}
		int numberOfLinks = 1;
		//check user input and determines which urls it should print, finds urls by looking for begining http and end "
		//loops through the fetch output and parses the urls out of it and prints requested ones 
		while(moreLinks && continueProgram){
			int begining = page.indexOf("http://");
			page = page.substring(begining);
			end = page.indexOf("\"");
			String link = page.substring(0,end);
			if(typeNumber == 1){
				if(link.toLowerCase().endsWith("png") || link.toLowerCase().endsWith("jpg") || link.toLowerCase().endsWith("bmp") || link.toLowerCase().endsWith("gif")){
					System.out.println(numberOfLinks + ". " + link);
					numberOfLinks += 1;
				}
			}
			else if(typeNumber == 2){
				if (link.toLowerCase().endsWith("doc") || link.toLowerCase().endsWith("txt") || link.toLowerCase().endsWith("pdf")){
					System.out.println(numberOfLinks + ". " + link);
					numberOfLinks += 1;
				}
			}
			else if(typeNumber == 3){
				if(link.toLowerCase().endsWith("htm") || link.toLowerCase().endsWith("html")){
					System.out.println(numberOfLinks + ". " + link);
					numberOfLinks += 1;
				}
			}
			else if(typeNumber == 4){
				System.out.println(numberOfLinks + ". " + link);
				numberOfLinks += 1;
			}
			else if(typeNumber == 5){
				continueProgram = false;
				System.out.println("Goodbye!");
			}
			linkStart = page.indexOf("http://", end);
			if (linkStart >= 0){
				page = page.substring(linkStart);
				}
			//if there are no more links the program ends and prints the number of links it found
			else if(continueProgram){
				moreLinks = false;
				numberOfLinks -= 1;
				System.out.println("\nNumber of links found: " + numberOfLinks + "\n");
				}
			}
		}
	}
}