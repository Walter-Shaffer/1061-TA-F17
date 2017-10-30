/*
* LinkExtractor.java
* Author: Alejandro Pardo
* Submission Date:  October 12
* Purpose: This program will extract and parse URl links from websites according to the user's demands.
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance
* with the policies at Clemson University and the
* policies of this course. I recognize that my work is based
* on an assignment created by the School of Computing
* at Clemson University. Any publishing or posting
* of source code for this project is strictly prohibited
* unless you have written consent from the instructor.
*/import java.util.Scanner;

public class LinkExtractor {

	static public void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); //gets the system input

		while (true) { // most outer while loop
			String answer = "";
			int decision = 0;

			while (!answer.startsWith("http://") && !answer.startsWith("https://")) { //if the input starts with one the two 
				//requested URLs then the program continues
				System.out.println(
						"Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit:");
				System.out.print(">> ");
				answer = keyboard.next();
				String answerCase = answer.toLowerCase(); // the user can use lower or upper case input
				if (answerCase.startsWith("q")) {
					System.out.println("Goodbye!");
					System.exit(0);
					//if user doesn't want to use the program anymore, the program ends
				}
				if((!answerCase.startsWith("q"))&&(!answer.contains("http://") && !answer.contains("https://"))){	
					System.out.println("");
					System.out.println("Input was unrecognized");}
					//if the user does not use the recognized URL or quits the program send an output of unrecognized input.
			}
			while (decision < 1 || decision > 5) {

				if (answer.startsWith("http://") || answer.startsWith("https://")) {
					System.out.println("");
					System.out.println("Enter the type of link to look for (1-5):");
					System.out.println("");
					System.out.println("1. Images (PNG, JPG, BMP, GIF)");
					System.out.println("2. Documents (DOC, TXT, PDF)");
					System.out.println("3. Hypertext (HTM, HTML)");
					System.out.println("4. All Links");
					System.out.println("5. Quit");
					//it gives the user option to choose between (1-5)
					System.out.print(">> ");
					decision = keyboard.nextInt();
					if (decision == 5) {
				System.out.println("Goodbye!");
				System.exit(0);}
					//if the decision is 5, the system ends.
					System.out.println("");
				
				
			}

			
			}
			System.out.println("Searching " + answer);

			if (decision == 1) {
				System.out.println("Searching for: images");
				System.out.println("");
			}
			if (decision == 2) {
				System.out.println("Searching for: documents");
				System.out.println("");
			}
			if (decision == 3) {
				System.out.println("Searching for: hypertext");
				System.out.println("");
			}
			if (decision == 4) {
				System.out.println("Searching for: all links");
				System.out.println("");
				//depending on the users decision, the above statement is used to 
				//clarify what type of link the user is searching for
			}

			String webpage = Fetch.fetchURL(answer);
			if (webpage.startsWith("$error$")) {
				//this fetches the URL
				System.out.println(webpage.substring(7));
				System.out.println("");
			}

			int start = 0;
			int finish = 0;
			String URL = "";
			String lower = "";
			int count = 0;
			//the parsing begins
			while ((start > -1) && (finish > -1)) {

				start = webpage.indexOf("href=\"") + 6;//this indicates where the URL should begin
				finish = webpage.indexOf("\"", start);//this indicates where the URL should end
				if ((start > -1) && (finish > -1)) {
					URL = webpage.substring(start, finish);

					lower = URL.toLowerCase();//makes the URl case insensitive  
					webpage = webpage.substring(finish + 1); //grabs the next URL after ending the previous one

					if ((decision == 1) && (lower.endsWith("png") || lower.endsWith("jpg") || lower.endsWith("bmp")
							|| lower.endsWith("gif"))) {
						//if user chooses image, the URL should have the previous endings
						count++;
						System.out.println(count + ". " + URL);
					}

					if ((decision == 2) && (lower.endsWith("doc") || lower.endsWith("txt") || lower.endsWith("pdf"))) {
						//if user chooses documents, the URL should have the previous endings
						count++;
						System.out.println(count + ". " + URL);
					}

					if ((decision == 3) && (lower.endsWith("htm") || lower.endsWith("html"))) {
						//if user chooses hypertext, the URL should have the previous endings
						count++;
						System.out.println(count + ". " + URL);
					}

					if (decision == 4) {
						//if user chooses all links, the URL should have all the previous endings
						count++;
						System.out.println(count + ". " + URL);
					}
				}
				
			}
			if(count>0){
			System.out.println("");
			System.out.println("Number of Links Found: " + count);// used to tell the user how many links were found
			System.out.println("");}
		}
	}
}
