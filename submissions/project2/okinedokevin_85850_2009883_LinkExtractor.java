/*
* LinkExtractor.java
* Author: Kevin Okinedo
* Submission Date: 10/13/17
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program uses nested for loops to output statements depending on the user's input.
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
		
		//defining preliminary varialbes
		String strURL = "", websiteData = "", firstLine = "";
		int linkCount = 0, selection = 0;
		boolean isURL = false, quitCheck = false, extractCheck = false, selectionCheck = false, errorCheck = true;
		boolean selectLoopEscape = false, extractLoopEscape = false;
		Scanner keyboard = new Scanner(System.in);
		
		while (!quitCheck) {
			
			
			while (!isURL && !quitCheck){
				//taking URL input from user
				keyboard = new Scanner(System.in);
				System.out.println("Enter a URL to read from (include the \"http://\" or the \"https://\"), or type Q to quit.");
				strURL = keyboard.nextLine();
				
				//Checking URL from user
				if (strURL.startsWith("q") || strURL.startsWith("Q")) {
					quitCheck = true;
				} else if (strURL.startsWith("https://") || strURL.startsWith("http://")) {
					isURL = true;
				} else {
					System.out.println("\nInput was unrecognized.");
				}
				
			while (!quitCheck && isURL && !selectLoopEscape) {
				System.out.println("\nEnter the type od link to look for (1-5): n");
				System.out.println("1. Images (PNG, JPG, BMP, GIF)");
				System.out.println("2. Documents (DOC, TXT, PDF)");
				System.out.println("3. Hypertext (HTM, HTML)");
				System.out.println("4. All Links");
				System.out.println("5. Quit");
				System.out.println(">> ");
				selection = keyboard.nextInt();
				
			    if (selection == 1 || selection == 2 || selection == 3 || selection == 4) {
			    	selectionCheck = true;
			    	selectLoopEscape = true;
			    } else if (selection == 5) {
			    	quitCheck = true;
			    } else {
			    	System.out.println("Invalid number entered!");
			    }
			}
				
			if (!quitCheck) {
				//Printing preliminary message
				System.out.println("");
				System.out.println("Searching " + strURL);
				if (selection == 1){
					System.out.println("Searching for: images");
				} else if (selection == 2){
					System.out.println("Searching for: documents");
				} else if (selection == 3){ 
					System.out.println("Searching for: hypertext");
				} else if (selection == 4){
					System.out.println("Searching for: all links");
				}
				System.out.println("");
				
				//Invoking Fetch to get webpage contents
				websiteData = Fetch.fetchURL(strURL);
				keyboard = new Scanner(websiteData);
				firstLine = keyboard.nextLine();
				if (firstLine.contains("$error$")) {
					System.out.println(firstLine.substring(7));
					System.out.println("");
					errorCheck = true;
					isURL = false;
				} else {
					errorCheck = false;
				}
				
				//Main extraction loop
				keyboard = new Scanner(websiteData);
				while (!quitCheck && selectionCheck && !errorCheck && !extractLoopEscape) {
					int start = 0, end = 0;
					String lineCheck, lineCheckExtensions, printedData;
					lineCheck = keyboard.nextLine();
					lineCheckExtensions = lineCheck.toLowerCase();
					
					//Extracting with selection conditions
					if (lineCheck.contains("</html>")) {
						extractLoopEscape = true;
					} else {
						if (selection == 1) {
							if (lineCheckExtensions.contains(".jpg") || lineCheckExtensions.contains(".png") || lineCheckExtensions.contains(".bmp") || lineCheckExtensions.contains(".gif")){
								linkCount++;
								start = lineCheck.indexOf("href=\"");
								end = lineCheck.indexOf('"', start + 6);
								printedData = lineCheck.substring(start + 6, end);
								System.out.println(linkCount + ". " + printedData);
							}
						} else if (selection == 2)
						if	(lineCheckExtensions.contains(".doc") || lineCheckExtensions.contains(".txt") || lineCheckExtensions.contains(".pdf")){
							linkCount++;
							start = lineCheck.indexOf("href=\"");
							end = lineCheck.indexOf('"', start + 6);
							printedData = lineCheck.substring(start + 6, end);
							System.out.println(linkCount + ". " + printedData);
						} else if (selection == 3)
							if	(lineCheckExtensions.contains(".html") || lineCheckExtensions.contains(".htm")){
								linkCount++;
								start = lineCheck.indexOf("href=\"");
								end = lineCheck.indexOf('"', start + 6);
								printedData = lineCheck.substring(start + 6, end);
								System.out.println(linkCount + ". " + printedData);
						}else if (selection == 4)
							if	(lineCheckExtensions.contains("href")){
								linkCount++;
								start = lineCheck.indexOf("href=\"");
								end = lineCheck.indexOf('"', start + 6);
								printedData = lineCheck.substring(start + 6, end);
								System.out.println(linkCount + ". " + printedData);
							}
					}
				}
			}
			//Printing link count
			if(!quitCheck){
				System.out.println("\nNumber of Links Found: " + linkCount + "\n");
			}
			
			//Resetting loop checks
			extractLoopEscape = false;
			selectLoopEscape = false;
			isURL = false;
			linkCount = 0;
		}
			
			//Message when program is terminated
			if (quitCheck) {
				System.out.println("GoodBye!");
			
		}
			keyboard.close();
	}
}

}
