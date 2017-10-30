/*
* LinkExtractor.java
* Author: Harrison Hall
* Submission Date: October 9, 2017
*
* Purpose: This program will take the input of a simple url and will find and list the 
* suggested links from the url. 
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
// test http://slamarc.people.clemson.edu/cpsc1060/files/test3.html

public class LinkExtractor {
	
	public static void main(String[] args) {
		String webData;
		int fetchCount = 0;//makes sure this is used less than 20 times 
		while (fetchCount < 20) {
			Scanner keyboard = new Scanner(System.in); //Asks user for url input
			System.out.print("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit: \n>> ");
			String input1 = keyboard.next();
			String trueInput1;
			String httpMaybe;
			if (input1.length() >= 8){ //This will make variables to tell if url starts with http:// or https://
				trueInput1 = input1.substring(0,8);
				httpMaybe = trueInput1.substring(0,7);
			}else {
				trueInput1 = "empty";
				httpMaybe = "empty";
			}
			
			if (input1.substring(0,1).equalsIgnoreCase("Q")){ //This exits the program
				System.out.println("Goodbye!");
				System.exit(0);
			} else if ((httpMaybe.equalsIgnoreCase("http://")) || (trueInput1.equalsIgnoreCase("https://"))) {
				int input2 = 0;
				while ((input2 < 1) || (input2 > 5)) { //this asks for input and loops if input is not 1-5
					Scanner keyboard2 = new Scanner(System.in);
					System.out.println("\nEnter the type of link to look for (1-5): \n");
					System.out.println("1. Images (PNG, JPG, BMP, GIF)\n2. Documents (DOC, TXT, PDF)\n3. Hypertext (HTM, HTML)\n4. All Links\n5. Quit");
					System.out.print(">> ");
					input2 = keyboard2.nextInt();
					
					if (input2 == 5){ //quits if input 5
						System.out.println("Goodbye!");
						System.exit(0);
					}
					}
				
				String searchType = "empty"; //creates string for type of search
				if (input2 == 1){ //classifies link types wanted
					searchType = "images";
				}else if (input2 == 2){
					searchType = "documents";
				}else if (input2 == 3){
					searchType = "hypertext";
				}else if (input2 == 4){
					searchType = "all links";
				}
				
				System.out.println("\nSearching " + input1);
				System.out.println("Searching for: "+ searchType + "\n");
				webData = Fetch.fetchURL(input1); //this searches the url and saves as string through Fetch.java
				fetchCount++; //Increases fetchCount by 1, as long as less than 20 program runs
				if (webData.substring(0,7).equals("$error$")){ //If error this prints error message
					int webDataLength = webData.length();
					String errorMessage = webData.substring(7,webDataLength++);
					System.out.println(errorMessage + "\n");
				} else { //Hard part! This section takes the string of the website's html script and prints the found links by type		
					int i = 1;
					while (webData.indexOf("<a href=\"") >= 0) { //runs while there is an [<a href="] left in the webdata
						int start = webData.indexOf("<a href=\"") + 7;
						int finish;
						String link = "empty";
						webData = webData.substring(start + 2);
						finish = webData.indexOf("\"");
						link = webData.substring(0,finish);//This obtains the link
						
						String linkEnd = link.substring(link.length()-5);//This section finds the end of the link
						//System.out.println(linkEnd); //This was for testing purposes
						if (linkEnd.indexOf(".") >= 0){ // checks to make sure has a . (type) ending
							linkEnd = linkEnd.substring(linkEnd.indexOf("."));
							//System.out.println(linkEnd); //This was for testing purposes
						}
						String linkType; //This section classifies the type of link extracted
						if ((linkEnd.equalsIgnoreCase(".PNG") || linkEnd.equalsIgnoreCase(".JPG")) || (linkEnd.equalsIgnoreCase(".GIF") || linkEnd.equalsIgnoreCase(".BMP"))){
							linkType = "image";
						} else if ((linkEnd.equalsIgnoreCase(".DOC") || linkEnd.equalsIgnoreCase(".TXT")) || (linkEnd.equalsIgnoreCase(".PDF"))){
							linkType = "document";
						} else if ((linkEnd.equalsIgnoreCase(".HTM") || linkEnd.equalsIgnoreCase(".HTML"))){
							linkType = "hypertext";
						} else {
							linkType = "unknown";
						}
						
						webData = webData.substring(finish);//Shortens webdata to exclude script parsed through
						
						
						//this section prints out only the type of links wanted
						if (input2 == 4){
							System.out.println(i+". "+link);
							i++;
						} else if (input2 == 1){
							if (linkType.equals("image")){
								System.out.println(i+". "+link);
								i++;
							}
						} else if (input2 == 2){
							if (linkType.equals("document")){
								System.out.println(i+". "+link);
								i++;
							}
						} else if (input2 == 3){
							if (linkType.equals("hypertext")){
								System.out.println(i+". "+link);
								i++;
							}
						}
					
						
					}
					System.out.println("\nNumber of links found: " + (i-1) + "\n");//prints link count
				}
				
			} else {
				System.out.println("\nInput was unrecognized");//prints if, well, input was unrecognized
			}
		}
		//System.out.println("This works... maybe??"); //For testing purposes
	}

} 
