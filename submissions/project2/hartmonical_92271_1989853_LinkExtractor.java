/*
 * LinkExtractor.java
 * Author: Monica Hart
 * Submission Date: 10/10/2017
 * 
 * Purpose: The purpose of this program is to find and count
 * and display links within a webpage entered by a user.
 * 
 * Statement of Academic Honesty:
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
		
		//variables
		boolean urlRepeat = true; //is a new URL needed
		boolean numberRepeat; //is a new number needed
		String strURL; //URL entered
		String webpage; //webpage html
		String link; //links found in html
		String errorMessage; //error message
		int number;
		int startWebpage; //for cutting webpage
		int start, finish; //for finding link
		int count; //for counting number of links
		
		//beginning of URL loop
		while (urlRepeat) {
			System.out.println("Enter a URL to read from(include the \"http://\" or \"https://\"), or type Q to quit:");
			//user input url
			System.out.print(">> ");
			strURL = keyboard.next();
			strURL = strURL.trim();
			numberRepeat = true;
			count = 0;
			
			//check url
			if (strURL.toLowerCase().startsWith("http://")
				|| strURL.toLowerCase().startsWith("https://")){
				
				//continue
				
				//beginning of number loop
				while (numberRepeat) {
					System.out.println("\nEnter the type of link to look for (1-5):\n");
					System.out.println("1. Images (PNG, JPG, BMP, GIF)");
					System.out.println("2. Documents (DOC, TXT, PDF)");
					System.out.println("3. Hypertext (HTM, HTML)");
					System.out.println("4. All Links");
					System.out.println("5. Quit");
					
					//user input number
					System.out.print(">> ");
					number = keyboard.nextInt();
					
					//check number
					if (number == 1) {
						//images
						numberRepeat = false;
						System.out.println("\nSearching " + strURL);
						System.out.println("Searching for: images\n");
						
						webpage = Fetch.fetchURL(strURL); //get webpage info
						
						if (webpage.startsWith("$error$")){
							errorMessage = webpage.substring(8);
							System.out.println(errorMessage + "\n");
						}
						else{
							while (webpage.contains("<a href=\"")) {
								startWebpage = webpage.indexOf("<a href=\"");
								webpage = webpage.substring(startWebpage+9);
								start = 0;
								finish = webpage.indexOf("\"");
								link = webpage.substring(start, finish);
									if (link.toLowerCase().endsWith("png")
										|| link.toLowerCase().endsWith("jpg")
										|| link.toLowerCase().endsWith("bmp")
										|| link.toLowerCase().endsWith("gif")){
										count++;
										System.out.println(count + ". " + link);
									}
							webpage = webpage.substring(finish+2);
							}
							System.out.println("\nNumber of Links Found: " + count + "\n");
						}
					}
					else if (number == 2) {
						//documents
						numberRepeat = false;
						System.out.println("\nSearching " + strURL);
						System.out.println("Searching for: documents\n");
						
						webpage = Fetch.fetchURL(strURL); //get webpage info
						
						if (webpage.startsWith("$error$")){
							errorMessage = webpage.substring(8);
							System.out.println(errorMessage + "\n");
						}
						else{
							while (webpage.contains("<a href=\"")) {
								startWebpage = webpage.indexOf("<a href=\"");
								webpage = webpage.substring(startWebpage+9);
								start = 0;
								finish = webpage.indexOf("\"");
								link = webpage.substring(start, finish);
								if (link.toLowerCase().endsWith("doc")
									|| link.toLowerCase().endsWith("txt")
									|| link.toLowerCase().endsWith("pdf")){
									count++;
									System.out.println(count + ". " + link);
								}
								webpage = webpage.substring(finish+2);
							}
							System.out.println("\nNumber of Links Found: " + count + "\n");
						}
					}
					else if (number == 3) {
						//hypertext
						numberRepeat = false;
						System.out.println("\nSearching " + strURL);
						System.out.println("Searching for: hypertext\n");
						
						webpage = Fetch.fetchURL(strURL); //get webpage info
						
						if (webpage.startsWith("$error$")){
							errorMessage = webpage.substring(8);
							System.out.println(errorMessage + "\n");
						}
						else{
							while (webpage.contains("<a href=\"")) {
								startWebpage = webpage.indexOf("<a href=\"");
								webpage = webpage.substring(startWebpage+9);
								start = 0;
								finish = webpage.indexOf("\"");
								link = webpage.substring(start, finish);
								if (link.toLowerCase().endsWith("htm")
									|| link.toLowerCase().endsWith("html")){
									count++;
									System.out.println(count + ". " + link);
								}
								webpage = webpage.substring(finish+2);
							}
							System.out.println("\nNumber of Links Found: " + count + "\n");
						}
					}
					else if (number == 4) {
						//all links
						numberRepeat = false;
						System.out.println("\nSearching " + strURL);
						System.out.println("Searching for: all links\n");
						
						webpage = Fetch.fetchURL(strURL); //get webpage info
						
						if (webpage.startsWith("$error$")){
							errorMessage = webpage.substring(8);
							System.out.println(errorMessage + "\n");
						}
						else{
							while (webpage.contains("<a href=\"")) {
								count++;
								startWebpage = webpage.indexOf("<a href=\"");
								webpage = webpage.substring(startWebpage+9);
								start = 0;
								finish = webpage.indexOf("\"");
								link = webpage.substring(start, finish);
								System.out.println(count + ". " + link);
								webpage = webpage.substring(finish+2);
							}
							System.out.println("\nNumber of Links Found: " + count +"\n");
						}
					}
					else if (number == 5) {
						//quit
						numberRepeat = false;
						urlRepeat = false;
					}
					else {
						//invalid number
						System.out.println("Invalid Number Entered");
					}
					
				} 
				//end of number loop
			}
			else if (strURL.toLowerCase().startsWith("q")){
				//quit
				urlRepeat = false;
			}
			else {
				//repeat
				System.out.println("\nInput was unrecognized");
			}
			
		} 
		//end of URL loop
		
		System.out.println("Goodbye!");	

	}

}
