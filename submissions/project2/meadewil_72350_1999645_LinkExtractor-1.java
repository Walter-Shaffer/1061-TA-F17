import java.util.Scanner;

/* 
LinkExtractor.java
Author: Sean Meade
Submission Date: 10/11
Purpose: Asks the user for a link, decides if the link is a valid 
link or not, and if the link is valid it searches the source code 
for different kinds of links based on the user's choice. 

Statement of Academic Honesty:
The following code represents my own work. I have neither
received nor given inappropriate assistance. I have not copied
or modified code from any source other than the course webpage
or the course textbook. I recognize that any unauthorized 
assistance or plagiarism will be handled in accordance
with policies at Clemson University and the
policies of this course. I recognize that my work is based
on an assignment created by the School of Computing
at Clemson University. Any publishing or posting 
of source code for this project is strictly prohibited 
unless you have written consent from the instructor. 
*/
public class LinkExtractor {

	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in); //Sets up the Scanner.
		boolean validInput = false; //Sets a value so that the do while statement knows when to stop.
		
		while(validInput != true){ //Loops the program indefinitely.
			System.out.println("Enter a URL to read from with \"http://\" or \"https://\" or type Q to quit:"); //Asks the user for a valid URL and 
			String strURL = keyboard.next();
						
			if ( (strURL.indexOf("http://") == 0) | (strURL.indexOf("https://") == 0) ){ //Checks whether the given URL begins with http:// or https://	
				int type;
				boolean numberValid = false; //Declares boolean variable needed for second loop.
								
				while(numberValid == false){
					System.out.println("\nEnter the type of link to look for (1-5):\n\n1. Images (PNG, JPG, BMP, GIF)\n2. Documents (DOC, TXT, PDF)\n3. Hypertext (HTM, HTML)\n4. All Links\n5. Quit"); //Displays the user's options of what to search for and the number they need to input to search for it.
					type = keyboard.nextInt(); //Sets the variable "type" to a usable input.

					if (type == 1){ //Prints a different message depending on the input for type. 
					System.out.println("\nSearching " + strURL);
					System.out.println("Searching for: images\n");
					}
					else if (type == 2){
							System.out.println("\nSearching " + strURL);
							System.out.println("Searching for: documents\n");
					}
					else if (type == 3){
						System.out.println("\nSearching " + strURL);
						System.out.println("Searching for: hypertext\n");
					}
					else if (type == 4){
						System.out.println("\nSearching " + strURL);
						System.out.println("Searching for: all links\n");
					}
					
					String webpage = Fetch.fetchURL(strURL); //Retrieves page contents.
					if (webpage.indexOf("$error$") == 0) { //Checks to see if there was a problem with the invocation of fetchURL and prints an error message if there was. 
						webpage = webpage.substring(7);
						System.out.println(webpage + "\n");
						validInput = false; //Restarts the first loop. 
						numberValid = true; //Stops the next if statement from starting and stops the second loop statement. 
					}
					
					String link = ""; //Declares the needed variables.
					int start;
					int finish;
					int endLink;
					int end;
					int count = 1;
					String caseLink = "";
					
					if (numberValid == false) { //Bypasses the rest of the second loop if the number given was invalid. 
						if (type == 1){
							numberValid = true; //Stops the second loop.
							
							do {
								end = webpage.length();
								start = webpage.indexOf("<a href=") + 9;
								finish = webpage.indexOf("</a>") + 4;
								link = webpage.substring(start, finish); //Takes the link from between start and finish, and cuts the unnecessary description off. 
								endLink = link.indexOf("\"");
								link = link.substring(0,endLink);
								caseLink = link.toLowerCase(); //Ensures that the next if statement is not case sensitive. 
								
								if (caseLink.contains(".png") | caseLink.contains((".jpg").toLowerCase()) | caseLink.contains(".bmp") | caseLink.contains(".gif")){ //Prints out the link if it's an image. 
								System.out.println(count + ". " + link);
								count++;
								}
								webpage = webpage.substring(finish, end); //Cuts the link just found and everything before it off of the webpage in order to find the next link.
							} while (webpage.contains("<a href="));
						
							System.out.println("\nNumber of links found: " + (count - 1) + "\n");
						}
						else if (type == 2){
							numberValid = true;
							
							do {
								end = webpage.length();
								start = webpage.indexOf("<a href=") + 9;
								finish = webpage.indexOf("</a>") + 4;
								link = webpage.substring(start, finish);  
								endLink = link.indexOf("\"");
								link = link.substring(0,endLink);
								caseLink = link.toLowerCase();
								
								if (caseLink.contains(".doc") | caseLink.contains(".txt") | caseLink.contains(".pdf")){ //Prints out the link if it's a document. 
								System.out.println(count + ". " + link);
								count++;
								}
								webpage = webpage.substring(finish, end); 
							} while (webpage.contains("<a href="));
						
							System.out.println("\nNumber of links found: " + (count - 1) + "\n");
						}
						else if (type == 3){
							numberValid = true;
							
							do {
								end = webpage.length();
								start = webpage.indexOf("<a href=") + 9;
								finish = webpage.indexOf("</a>") + 4;
								link = webpage.substring(start, finish); 
								endLink = link.indexOf("\"");
								link = link.substring(0,endLink);
								caseLink = link.toLowerCase();
								
								if (caseLink.contains(".htm") | caseLink.contains(".html")){ //Prints out the link if it's a hypertext. 
								System.out.println(count + ". " + link);
								count++;
								}
								webpage = webpage.substring(finish, end); 
							} while (webpage.contains("<a href="));
						
							System.out.println("\nNumber of links found: " + (count - 1) + "\n");
						}
						else if (type == 4){
							numberValid = true;
							
							do {
								end = webpage.length();
								start = webpage.indexOf("<a href=") + 9;
								finish = webpage.indexOf("</a>") + 4;
								link = webpage.substring(start, finish);  
								endLink = link.indexOf("\"");
								link = link.substring(0,endLink);
								
								System.out.println(count + ". " + link); //Prints out all the links. 
								count++;

								webpage = webpage.substring(finish, end); 
							} while (webpage.contains("<a href="));
						
							System.out.println("\nNumber of links found: " + (count - 1) + "\n");
						}
						else if (type == 5){ //Exits the program if the number input is 5. 
							System.out.println("Goodbye!");
							System.exit(0);
						}
					}
				}
			}
			else if (strURL.indexOf("Q") == 0 | strURL.indexOf("q") == 0 ){ //Exits the program if the input contains the letter q. 
				System.out.println("Goodbye!");
				System.exit(0);
			}
			else
				System.out.println("\nInput was unrecognized");
		}
		keyboard.close(); //Closes the keyboard.
	}

}
