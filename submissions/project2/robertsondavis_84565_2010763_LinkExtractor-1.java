/*
     * LinkExtractor.Java
     * Author: Davis Robertson
     * Submission Date: October 13th, 2017
     * 
     * Purpose: This program takes the hours of work put in a week, and, using several different
     * variables, calculates the Gross and Net Pay of the job, as well as show you how much of
     * it was deducted and from where (in taxes)
     * 
     * Statement of Academic Honesty:
     * 
     * The following code represents my own work. I have neither received nor given inappropriate 
     * assistance. I have not copied or modified code from any source other than the course 
     * webpage or the course textbook. I recognize that any unauthorized assistance or 
     * plagiarism will be handled in accordance with the policies at Clemson University and 
     * the policies of this course. I recognize that my work is based on an assignment created
     * by the School of Computing at Clemson University. Any publishing or posting of source
     * code for this project is strictly prohibited unless you have written consent from the 
     * instructor.
     */
import java.util.Scanner;
public class LinkExtractor {
enum URLcategory {IMAGES, DOCUMENTS, HYPERTEXT, ALL_LINKS, QUIT, NOTHING}
	public static void main(String[] args) {
		int x = 0, start = 0, finish;
		Scanner keyboard = new Scanner(System.in);
		URLcategory category = URLcategory.NOTHING;
		String categoryNumberString = "";
		String parsedString;
		do{ //start of main loop that will repeat until one of the end conditions is met
			
			int count = 0;
			System.out.println("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit:");
			String strURL = keyboard.nextLine();
			String webpage = Fetch.fetchURL(strURL); //invokes Fetch
			
			if (strURL.startsWith("http://") || strURL.startsWith("https://")) { //Makes sure URL starts with the correct info
			
				do { //1-5 loop
					System.out.println("");
					System.out.println("Enter the type of link to look for (1-5)\n\n1. Images (PNG, JPG, BMP, GIF)\n2. Documents (DOC, TXT, PDF)\n3. Hypertext (HTM, HTML)\n4. All Links\n5. Quit");
					categoryNumberString = keyboard.nextLine();
					
					if (categoryNumberString.equals("1")){ // If-else statements that check different types of links  
						category = URLcategory.IMAGES;
						System.out.println(webpage);
						String cat = "images";
						System.out.println("");
						System.out.println("Searching " + strURL);
						System.out.println("Searching for: " + cat);
						System.out.println("");
						finish = 1;
						start = 1;
						
						while (start != 0 && finish != -1){ 
							finish = webpage.indexOf("<a href", start);
							start = webpage.indexOf("\"", finish) + 1;
							
							if (start != -1 && finish != -1){
								finish = webpage.indexOf("\"", start);
								parsedString = webpage.substring(start, finish);
								
								if (parsedString.toLowerCase().endsWith(".png") || parsedString.toLowerCase().endsWith(".jpg") || parsedString.toLowerCase().endsWith(".bmp") || parsedString.toLowerCase().endsWith(".gif")){
									System.out.println(parsedString);
									count++;
								}
							}
						}
						if (webpage.startsWith("$")){
							String errorMessage = webpage.substring(7);
							System.out.println(errorMessage);
							System.out.println("");
						}
						else {
							System.out.println("");
							System.out.println("Number of Links Found: " + count);
							System.out.println("");
						}
						x = 1;
					}
					else if (categoryNumberString.equals("2")){
						category = URLcategory.DOCUMENTS;
						String cat = "documents";
						System.out.println("");
						System.out.println("Searching " + strURL);
						System.out.println("Searching for: " + cat);
						System.out.println("");
						finish = 1;
						start = 1;
						
						while (start != 0 && finish != -1){ // nested loop used to parse. Continues throughout program
							finish = webpage.indexOf("<a href", start);
							start = webpage.indexOf("\"", finish) + 1;
							
							if (start != -1 && finish != -1){
								finish = webpage.indexOf("\"", start);
								parsedString = webpage.substring(start, finish);
								
								if (parsedString.toLowerCase().endsWith(".doc") || parsedString.toLowerCase().endsWith(".txt") || parsedString.toLowerCase().endsWith(".pdf")){
									System.out.println(parsedString);
									count++;
								}
							}
						}
						if (webpage.startsWith("$")){
							String errorMessage = webpage.substring(7);
							System.out.println(errorMessage);
							System.out.println("");
						}
						else {
							System.out.println("");
							System.out.println("Number of Links Found: " + count);
							System.out.println("");
						}
						x = 1;
					}
					else if (categoryNumberString.equals("3")){
						category = URLcategory.HYPERTEXT;
						String cat = "hypertext";
						System.out.println("");
						System.out.println("Searching " + strURL);
						System.out.println("Searching for: " + cat);
						System.out.println("");
						finish = webpage.indexOf("<a href");
						finish = 1;
						start = 1;
						
						while (start != 0 && finish != -1){
							finish = webpage.indexOf("<a href", start);
							start = webpage.indexOf("\"", finish) + 1;
							
							if (start != -1 && finish != -1){
								finish = webpage.indexOf("\"", start);
								parsedString = webpage.substring(start, finish);
								
								if (parsedString.toLowerCase().endsWith(".htm") || parsedString.toLowerCase().endsWith(".html")){
									System.out.println(parsedString);
									count++;
								}
							}
						}
						if (webpage.startsWith("$")){
							String errorMessage = webpage.substring(7);
							System.out.println(errorMessage);
							System.out.println("");
						}
						else {
							System.out.println("");
							System.out.println("Number of Links Found: " + count);
							System.out.println("");
						}
						x = 1;
					}
					else if (categoryNumberString.equals("4")){
						category = URLcategory.ALL_LINKS;
						String cat = "all links";
						System.out.println("");
						System.out.println("Searching " + strURL);
						System.out.println("Searching for: " + cat);
						System.out.println("");
						finish = 1;
						start = 1;
						
						while (start != 0 && finish != -1){
							finish = webpage.indexOf("<a href", start);
							start = webpage.indexOf("\"", finish) + 1;
							
							if (start != -1 && finish != -1){
								finish = webpage.indexOf("\"", start);
								parsedString = webpage.substring(start, finish);
								System.out.println(parsedString);
								count++;
							}
						}
						if (webpage.startsWith("$")){
							String errorMessage = webpage.substring(7);
							System.out.println(errorMessage);
							System.out.println("");
						}
						else {
							System.out.println("");
							System.out.println("Number of Links Found: " + count);
							System.out.println("");
						}
						x = 1;
					}
					else if (categoryNumberString.equals("5")){
						System.out.println("Goodbye!");
						category = URLcategory.QUIT;
						x = 1;
					}
					else{
						System.out.println("Invalid Number Entered."); // final else-ifs used to go over all other possible inputs
					}
				}while (x != 1);
			}
			else if (strURL.startsWith("q") || strURL.startsWith("Q")){
				System.out.println("Goodbye!");
				System.exit(0);
			}
			else{
				System.out.println("");
				System.out.println("Input was unrecognized.");
			}
		}while (category != URLcategory.QUIT);
			
		
	}

}