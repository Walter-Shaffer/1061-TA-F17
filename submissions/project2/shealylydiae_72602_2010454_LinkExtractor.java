/*
* LinkExtractor.java
* Author: Lydia Shealy
* Submission Date: 10/13/17
*
* Purpose: This program extracts the html of a website, and then parses
* the html to get the links in the website. It then lists the link based on 
* what the user selected to search for (like images or documents) by parsing 
* the html after extracting each link. 
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

	
		Scanner keyboard = new Scanner(System.in);
		
		boolean willContinue = true; //determines whether the program will continue or not 
		boolean invalidLinkChoice = true; //did they pick a link to search for or not (if they have not this is true)
		boolean validHost = false; //for printing out Number Links or like the exception
		boolean invalidHost = true; //for the same thing as above 
		String strURL; //holds original url 
		String searchingFor; 
		int linkOption, category; //defined by 1, 2, 3, 4 based on options 
		
		int start, finish, typeStart; //defines the bounds of the link and the link file type 
		int i; 
		int numberOfLinks;
		
		String fileType, fileLink; //fileType is for evaluating what category the file type falls under and fileLink is for printing out the parsed link
	 
		
				
		do{		//main loop, requests user for a url or terminates program by exiting loop
			
			System.out.println("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit:");
			System.out.print(">> ");
			
			strURL = keyboard.next();
						
			
			//determines input of user as a valid url or exit command 
			if (strURL.startsWith("Q") || strURL.startsWith("q")){
				willContinue = false;	//will end the do loop when the condition is evaulated 		
			}
			else if (strURL.startsWith("http://") || strURL.startsWith("https://")){
				willContinue = true; 
				do{	
					System.out.println( );
					System.out.println("Enter the type of link to look for (1-5)"
							+ "\n"
							+ "\n1. Images (PNG, JPG, BMP, GIF)"
							+ "\n2. Documents (DOC, TXT, PDF)"
							+ "\n3. Hypertext (HTM, HTML)"// file type for HTML might be messed up
							+ "\n4. All Links"
							+ "\n5. Quit");
				
					System.out.print(">> ");
					linkOption = keyboard.nextInt(); 
					
					System.out.println( );
				
					if (linkOption > 5 || linkOption < 1){
						System.out.println("\nInvalid Number Entered."); 
					}
					else if (linkOption == 5) {
						invalidLinkChoice = false;  
						willContinue = false; 
						validHost = false; 
						invalidHost = false;
					}
					else {
						invalidLinkChoice = false; 
						
						if (linkOption == 1)
							searchingFor = " images";
						else if (linkOption == 2)
							searchingFor = " documents";
						else if (linkOption == 3)
							searchingFor = " hypertext"; 
						else 
							searchingFor = " all links";
					
					
					System.out.println("Searching " + strURL);
					System.out.println("Searching for:" + searchingFor);
					
					}
					//System.out.println(linkOption);//checks link option 
					//System.out.println("Link option is not " + invalidLinkChoice); 
					
				}while(invalidLinkChoice); 
				
				
				String webpage = Fetch.fetchURL(strURL); 
				//System.out.println(webpage); //displays the html, what will need to be parsed and sorted 
				/////////////////////////////////////////////////////////////////////////////////////////
				//for unknownhost need to print out the webpage (make a separate decision for this)
				
				i = 1; 
				if (willContinue || validHost)
					System.out.println( );
				
					
								
				while (webpage.contains("href=") && willContinue){
					start = webpage.indexOf("href=") + 6; //grabs the beginning of the link from the html (they all start with href=, and by adding 6 this removes the "href="" from the string
				//	finish = webpage.indexOf(">", start) - 1; //grabs the end of the link by grabbing the first '>' from the start of it, subtracting 1 takes away the ending "
					finish = webpage.indexOf("\"", start); 
					
					typeStart = webpage.indexOf("\"", start) - 4; //changed from 4 to 5 
					fileType = webpage.substring(typeStart, finish);
					fileLink = webpage.substring(start,finish);
					
					
					//fileType.contains("doc"); // i could use this instead of equals ignore case and have my typeStart go to contain 4 spots so i can include HTML (all the others only have 3) 
					//could do a toUpperCase or toLowerCase before to ensure there are no conflicts with case type 		
					//////////////////////////////////////////////////////////////////////////////////////////////
					//fileType.toLowerCase();
					////System.out.println(fileType);
					//fileType.toLowerCase().contains("png");
					//categorizes the filetype 
					if (fileType.toLowerCase().contains("png") || fileType.toLowerCase().contains("jpg") || fileType.toLowerCase().contains("bmp") || fileType.toLowerCase().contains("gif")){
						category = 1;  
					}
					else if (fileType.toLowerCase().contains("doc") || fileType.toLowerCase().contains("txt") || fileType.toLowerCase().contains("pdf")){
						category = 2;
					}
					else if (fileType.toLowerCase().contains("htm") || fileType.toLowerCase().contains("html")){
						category = 3;
					}
					else {
						category = 4; 
					}
					
					if (linkOption == 1 && category == 1){
						System.out.println(i + ". " + fileLink);
						i++;											
					}
					else if (linkOption == 2 && category == 2){
						System.out.println(i + ". " + fileLink);
						i++;
					}
					else if (linkOption == 3 && category == 3){
						System.out.println(i + ". " + fileLink);
						i++;
					}
					else if (linkOption == 4){
						System.out.println(i + ". " + fileLink);
						i++;
					}
					
					//System.out.println(i + ". " + webpage.substring(start, finish));				
					//System.out.println(fileType);
					//i++;
					//System.out.println( );
					webpage = webpage.substring(finish); //keep this at the bottom 
					validHost = true;
					invalidHost = false; 
				}
				
				if (validHost){//actually want to use a boolean variable to be more safe
					numberOfLinks = i - 1; 
					System.out.println( ); //this causes a double line to happen if no links are found 
					System.out.println("Number of Links Found: " + numberOfLinks);
					System.out.println( );
				}				
				else{
					//needs to be empty for selecting 5 to quit 
				}
				
				if (invalidHost){
					start = webpage.indexOf("java");
					System.out.println(webpage.substring(start));
					System.out.println( ); 
				}
				else{
					
				}
					
				
			
			}
			else {			
				//willContinue = false; 
				
				System.out.println( );
				System.out.println("Input was unrecognized.");
				/////////////////////////////////////////////////double check whether or not we need a new line after this 
				//System.exit(0);
			}
			
			//strURL = ""; 
			//System.out.println("URL input is " + willContinue); //checks if willcontinue is correct
		}while (willContinue /*&& validLinkOption*/); 
		
		System.out.println("Goodbye!");
		keyboard.close(); 
		
	
		
	}	
		


}
