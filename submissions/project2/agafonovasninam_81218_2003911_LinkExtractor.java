/*
* LinkExtractor.java
* Author:  Nina Agafonovas
* Submission Date:  October 12, 2017
* Purpose: Given a URL from the user, parse that web page's HTML, and retrieve hyperlinks 
* in the HTML based on their file type.
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified 
* code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
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
		int testURL;
		String URLinput = "";
		int LinkType;
		int LinkFlag;
		String webpage;
		String extension;

		while (true) {

			do {
				// Print this statement and assign input to variable

				System.out.println("Enter a URL to read from (include the http:// or https://), or type Q to quit:");
				System.out.print(">>");

				URLinput = keyboard.next();
				
				// If the user types Q, exit and re-prompt

				if (URLinput.startsWith("q") || (URLinput.startsWith("Q"))) {

					System.out.println("Goodbye!");
					System.exit(0);

				}

				// if user input is valid assign flag 1.

				if (URLinput.startsWith("http://") || (URLinput.startsWith("https://"))) {
					testURL = 1;
					}

				// Otherwise, everything else assigns the flag 0.

				else {

					testURL = 0;

					System.out.println("\nInput was unrecognized.");

				}

				

				// Continue to do this loop while the flag equals 0.

			} while (testURL == 0);

			boolean ValidLinkType;

			do {

				

				System.out.println("\nEnter the type of link to look for (1-5):");

				System.out.println(

						"\n1. Images (PNG, JPG, BMP, GIF) \n2. Documents (DOC, TXT, PDF) \n3. Hypertext (HTM, HTML) \n4. All Links \n5. Quit");

				System.out.print(">>");

				LinkType = keyboard.nextInt();

				ValidLinkType = LinkType >= 1 && LinkType <= 4;


				if (LinkType == 5) {

					System.out.println("Goodbye!");

					System.exit(0);

				}

			} while (!ValidLinkType); // perform all this until the boolean is

										// false


			System.out.println("\nSearching: " + URLinput);
			

			Fetch.fetchURL(URLinput); // Retrieving page contents

			webpage = Fetch.fetchURL(URLinput);

			if (webpage.startsWith("$error$")) {

				if (LinkType == 4){

				System.out.println("Searching for: all links");

				}
				System.out.println(webpage.substring("$error$".length()));

			}

				else if (LinkType == 1){

					System.out.println("Searching for: images" );

			}

				else if (LinkType == 2){

					System.out.println("Searching for: documents");

				}

				else if (LinkType == 3){

					System.out.println("Searching for: hypertext");

				}

				else if (LinkType == 4){

					System.out.println("Searching for: all links");

				}

			System.out.println("");
			int start = 0;
			int finish = 0;
			String ImagesLink = "";
			int count = 0;
			String lower = "";

			while ((start != -1) && (finish != -1)) {


				start = webpage.indexOf("href=\"") + 6;

				finish = webpage.indexOf("\"", start);

				if ((start != -1) && (finish != -1)) {  // make sure index isn't -1 when it runs out of links to search before continuing

					ImagesLink = webpage.substring(start, finish);

					webpage = webpage.substring(finish);

					lower = ImagesLink.toLowerCase(); // to compare lower case link with the lower case extensions 

				
					if ((LinkType == 1) && (lower.endsWith("jpg") || lower.endsWith("png")

						|| lower.endsWith("bmp") || lower.endsWith("gif")))

				{
					count++;

					System.out.println(count + ". " + ImagesLink);
				}

				else if ((LinkType == 2) && (lower.endsWith("doc") || lower.endsWith("txt")    //Repeat for link type 2 to search for docs

					|| lower.endsWith("pdf")))
				{
					count++;
					System.out.println(count + ". " + ImagesLink);
				}

				else if ((LinkType == 3) && (lower.endsWith("htm") || lower.endsWith("html")  // Repeat for link type three
					))
				{
					count++;
					System.out.println(count + ". " + ImagesLink);

				}

				else if (LinkType == 4) 
					{
						count++;
						System.out.println(count + ". " + ImagesLink);
				}}}

			System.out.println("\nNumber of links found: " + count);  //needs to go outside of the while loop after it finishes looking for links

			System.out.println("");

		
		}

	}

		}

