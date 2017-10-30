import java.util.Scanner;
/*
* LinkExtractor.java
* Author: Joshua Williams
* Submission Date: 10/12/2017
*
* Purpose: 
* 	The program receives a link from user input. It then uses Fetch to extract the raw HTML code from the link. It then asks
* the user what type of links the program should search for (the user will enter a number between 1-5).  It then extracts the
* aforementioned type of links from the raw HTML and lists and counts them, printing the links that the program found and displaying
* the number of links that it found of the aforementioned type. The program will repeat this process (up to 20 times) until the user
* decides to quit the program by either typing a string starting with q on the first program or by typing 5 on the second prompt.
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
		while (true) {// Creating the main loop, that goes on indefinitely until System.exit(0) is reached in the code
			String userURL = "", pageContents = "", linkString = "", OutputString = "\n";
			// The above line declares the Strings used for intermediary processing
			Scanner keyboard = new Scanner(System.in);
			boolean repeatUserInput = false;
			int userInputInt, startIndex = 0, lastIndex = 0, numberOfLinks = 0;
			//The above integers are used for String processing and userInput and Output
			
			do {//This while loop loops until the program receives valid user input
				System.out.println("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit:");
				userURL = keyboard.next();//This gets the URL from the user
				if (userURL.startsWith("http://"))
					repeatUserInput = false;
				else if (userURL.startsWith("https://"))
					repeatUserInput = false;
				else if (userURL.startsWith("Q") || userURL.startsWith("q")) {
					System.out.println("Goodbye!");
					System.exit(0);
				} else {
					repeatUserInput = true;
					System.out.println("\nInput was unrecognized.");//The above if/else loop checks to see what the user inputed, and responds accordingly
				}
			} while (repeatUserInput);

			do {//This will repeat until the user inputs a number between 1 and 5
				System.out.println("\nEnter the type of link to look for (1-5):");
				System.out.println("\n1. Images (PNG, JPG, BMP, GIF)");
				System.out.println("2. Documents (DOC, TXT, PDF) ");
				System.out.println("3. Hypertext (HTM, HTML)");
				System.out.println("4. All Links");
				System.out.println("5. Quit");
				userInputInt = keyboard.nextInt();
			} while (userInputInt > 5 || userInputInt < 1);
			if (userInputInt == 5) {//If the user input is 5 then it quits, else the program moves on to the next step
				System.out.println("Goodbye!");
				System.exit(0);
			} else {//This just displays the Searching text and what it's searching for
				System.out.println("\nSearching " + userURL);
				if (userInputInt == 1) {
					System.out.println("Searching for: images");
				} else if (userInputInt == 2) {
					System.out.println("Searching for: documents");
				} else if (userInputInt == 3) {
					System.out.println("Searching for: hypertext");
				} else if (userInputInt == 4) {
					System.out.println("Searching for: all links");
				}
				pageContents = Fetch.fetchURL(userURL);
				//This grabs the page contents, originally I had this before the searching print statements, 
				//but it made more sense to have this at the end since it requires some time to grab the contents of the page
			}
			if (!pageContents.startsWith("$error$")) {//The below processing code only runs if fetch didn't receive an error
				while (pageContents.substring(lastIndex).indexOf("href=\"") != -1) {//This while loop runs until the program doesn't find a href in pageContents
					linkString = "";
					startIndex = pageContents.substring(lastIndex).indexOf("href=\"") + 6;//This starts the below loop at the point where the link starts
					int counter = 0;//This just counts how many letters the while loop below goes over to keep track of where the program is at
					while (pageContents.charAt(startIndex + counter) != '\"') {//Until this for loop hits a quotation mark every character is added to link string
						linkString += pageContents.charAt(startIndex + counter);
						counter++;
					}
					pageContents = pageContents.replaceFirst("href=", "");
					//After the link is found the first href= is deleted from pageContents so the link is not found a second time
					if (userInputInt == 1) {
						if (linkString.toLowerCase().endsWith(".png") || linkString.toLowerCase().endsWith(".jpg")
								|| linkString.toLowerCase().endsWith("gif")
								|| linkString.toLowerCase().endsWith(".bmp")) {
							numberOfLinks++;
							OutputString += numberOfLinks + ". " + linkString + "\n";
						}
					} else if (userInputInt == 2) {
						if (linkString.toLowerCase().endsWith(".doc") || linkString.toLowerCase().endsWith(".txt")
								|| linkString.toLowerCase().endsWith(".pdf")) {
							numberOfLinks++;
							OutputString += numberOfLinks + ". " + linkString + "\n";
						}
					} else if (userInputInt == 3) {
						if (linkString.toLowerCase().endsWith(".htm") || linkString.toLowerCase().endsWith(".html")) {
							numberOfLinks++;
							OutputString += numberOfLinks + ". " + linkString + "\n";
						}
					} else if (userInputInt == 4) {
						numberOfLinks++;
						OutputString += numberOfLinks + ". " + linkString + "\n";
					}//The above else if just decides if the link found is a type of the link that the program was searching for and if it is, the program displays it
				}
				System.out.println(OutputString);
				System.out.println("Number of Links Found: " + numberOfLinks + "\n");
			} else {//If fetch received an error then it displays the error and loops back to the top
				System.out.println("\n" + pageContents.substring(7) + "\n");
			}
		}
	}
}