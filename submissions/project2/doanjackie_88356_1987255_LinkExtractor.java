/* 
 * LinkExtractor.java 
 * Author:  Jackie Doan  
 * Submission Date: Saturday September 7, 2017
 * 
 * Purpose:
 * This program is designed with the purpose of being able to
 * look at a website and its source code in order to make a list
 * of image, document, hypertext, or all links. This will also
 * tell of how many of the type of link is found. This program is
 * capable of doing it at most 20 times before ending and can also
 * be ended at any moment.
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
import java.util.Scanner; //import resources

public class LinkExtractor {
	
	public static void main(String[] args) {
		
		//Initialize variables and Keyboard
		Scanner keyboard = new Scanner(System.in);
		String tryAgain;
		String website = null;
		String linkFetching;
		String lowerLinkFetching;
		String lowerWebsite;
		int count = 1;
		int begin = 0;
		int end = 0;
		
		//Loop values
		int linkType = 0;
		int repeatProgram = 0;
		int realWebsite = 0;
		int tries = 0;
		int linkCheck = 0;
	
			//Main loop
			while (repeatProgram == 0) {
				
				//Reset important values
				if (realWebsite != 0){
				tries = 0;
				linkCheck = 0;
				repeatProgram = 0;
				realWebsite = 0;
				tryAgain = "";
				end = 0;
				}
				
				//Begin URL loop
				while (realWebsite == 0) {
					System.out.println("Enter a URL to read from "
							+ "(include http:// and https://) "
							+ "or type Q to quit.");
					System.out.print(">> ");
					website = keyboard.next();
					website = website.trim();
					lowerWebsite = website.toLowerCase();
	
					//URL Check
					if (website.startsWith("http://") || website.startsWith("https://")) {
						realWebsite++;
					}
					else if (lowerWebsite.startsWith("q")) {
						System.out.println("Goodbye!");
						System.exit(0);
					}
					else {
						System.out.println("Input was unrecognized.\n");
					}
				}
				
				//Type Of Link Check
				System.out.println("\nEnter the type of link to look for (1-5)"
						+ "\n\n1. Images (PNG, JPG, BMP, GIF)"
						+ "\n2. Documents (DOC, TXT, PDF)"
						+ "\n3. Hypertext (HTM, HTML)"
						+ "\n4. All Links\n5. Quit");
				System.out.print(">> ");
				
				//Link Type Check
				while (linkCheck == 0) {
					linkType = keyboard.nextInt();
					if (linkType >= 1 && linkType <=4) {
						linkCheck++;
					}
					else if (linkType == 5) {
						System.out.println("Goodbye!");
						System.exit(0);
					}
					else {
						System.out.println("Number was unrecognized.");
						System.out.print(">> ");
					}
				}
				
				//Retrieving page contents
				String fetching = Fetch.fetchURL(website);
				/*details where the user is searching
				 *and what the user is searching for*/
				System.out.println("\nSearching " + website);
				if (linkType == 1) {
					System.out.println("Searching for: images\n");	
				}
				else if (linkType == 2) {
					System.out.println("Searching for: documents\n");	
				}
				else if (linkType == 3) {
					System.out.println("Searching for: hypertext\n");	
				}
				else if (linkType == 4) {
					System.out.println("Searching for: all links\n");	
				}
				
				//When user searches in an unusable website
				if (fetching.equalsIgnoreCase("$error$java.lang.IllegalArgumentException: "
						+ "protocol = http host = null")) {
					System.out.println("java.net.UnknownHostException: AnUnknownHost");
				}

				//When user searching for Images
				if (linkType == 1) {
					while (end != -1) {
						begin = fetching.indexOf("href") + 6;
						end = fetching.indexOf("</a>");
						if (end - begin >= 0){
							linkFetching = fetching.substring(begin, end);
							lowerLinkFetching = linkFetching.toLowerCase();
							if (lowerLinkFetching.contains("png")) {
								end = lowerLinkFetching.indexOf("png") + 3;
								linkFetching = linkFetching.substring(0, end);
								System.out.println(count + ") " + linkFetching);
								count++;
							}
							else if (lowerLinkFetching.contains("jpg")) {
								end = lowerLinkFetching.indexOf("jpg") + 3;
								linkFetching = linkFetching.substring(0, end);
								System.out.println(count + ") " + linkFetching);
								count++;
							}
							else if (lowerLinkFetching.contains("bmp")) {
								end = lowerLinkFetching.indexOf("bmp") + 3;
								linkFetching = linkFetching.substring(0, end);
								System.out.println(count + ") " + linkFetching);
								count++;
							}
							else if (lowerLinkFetching.contains("gif")) {
								end = lowerLinkFetching.indexOf("gif") + 3;
								linkFetching = linkFetching.substring(0, end);
								System.out.println(count + ") " + linkFetching);
								count++;
							}
							begin = fetching.indexOf("</a>") + 4;
							fetching = fetching.substring(begin);						
						}
					}
				}
				//When user is searching for Documents
				else if (linkType == 2) {
					while (end != -1) {
						begin = fetching.indexOf("href") + 6;
						end = fetching.indexOf("</a>");
						if (end - begin >= 0){
							linkFetching = fetching.substring(begin, end);
							lowerLinkFetching = linkFetching.toLowerCase();
							if (lowerLinkFetching.contains("doc")) {
								end = lowerLinkFetching.indexOf("doc") + 3;
								linkFetching = linkFetching.substring(0, end);
								System.out.println(count + ") " + linkFetching);
								count++;
							}
							else if (lowerLinkFetching.contains("txt")) {
								end = lowerLinkFetching.indexOf("txt") + 3;
								linkFetching = linkFetching.substring(0, end);
								System.out.println(count + ") " + linkFetching);
								count++;
							}
							else if (lowerLinkFetching.contains("pdf")) {
								end = lowerLinkFetching.indexOf("pdf") + 3;
								linkFetching = linkFetching.substring(0, end);
								System.out.println(count + ") " + linkFetching);
								count++;
							}
							begin = fetching.indexOf("</a>") + 4;
							fetching = fetching.substring(begin);
						}
					}
				}
				//When user is searching for Hypertext
				else if (linkType == 3) {
					while (end != -1) {
						begin = fetching.indexOf("href") + 6;
						end = fetching.indexOf("</a>");
						if (end - begin >= 0){
							linkFetching = fetching.substring(begin, end);
							lowerLinkFetching = linkFetching.toLowerCase();
							if (lowerLinkFetching.contains("html")) {
								end = lowerLinkFetching.indexOf("html") + 3;
								linkFetching = linkFetching.substring(0, end);
								System.out.println(count + ") " + linkFetching);
								count++;
							}
							else if (lowerLinkFetching.contains("htm")) {
								end = lowerLinkFetching.indexOf("htm") + 3;
								linkFetching = linkFetching.substring(0, end);
								System.out.println(count + ") " + linkFetching);
								count++;
							}
							begin = fetching.indexOf("</a>") + 4;
							fetching = fetching.substring(begin);
						}
					}
				}
				//When user is searching for All Links
				else if (linkType == 4) {
					while (end != -1) {
						begin = fetching.indexOf("href") + 6;
						end = fetching.indexOf("</a>");
						if (end - begin >= 0){
							linkFetching = fetching.substring(begin, end);
							lowerLinkFetching = linkFetching.toLowerCase();
							if (lowerLinkFetching.contains("png")) {
								end = lowerLinkFetching.indexOf("png") + 3;
								linkFetching = linkFetching.substring(0, end);
								System.out.println(count + ") " + linkFetching);
								count++;
							}
							else if (lowerLinkFetching.contains("jpg")) {
								end = lowerLinkFetching.indexOf("jpg") + 3;
								linkFetching = linkFetching.substring(0, end);
								System.out.println(count + ") " + linkFetching);
								count++;
							}
							else if (lowerLinkFetching.contains("bmp")) {
								end = lowerLinkFetching.indexOf("bmp") + 3;
								linkFetching = linkFetching.substring(0, end);
								System.out.println(count + ") " + linkFetching);
								count++;
							}
							else if (lowerLinkFetching.contains("gif")) {
								end = lowerLinkFetching.indexOf("gif") + 3;
								linkFetching = linkFetching.substring(0, end);
								System.out.println(count + ") " + linkFetching);
								count++;
							}
							else if (lowerLinkFetching.contains("doc")) {
								end = lowerLinkFetching.indexOf("doc") + 3;
								linkFetching = linkFetching.substring(0, end);
								System.out.println(count + ") " + linkFetching);
								count++;
							}
							else if (lowerLinkFetching.contains("txt")) {
								end = lowerLinkFetching.indexOf("txt") + 3;
								linkFetching = linkFetching.substring(0, end);
								System.out.println(count + ") " + linkFetching);
								count++;
							}
							else if (lowerLinkFetching.contains("pdf")) {
								end = lowerLinkFetching.indexOf("pdf") + 3;
								linkFetching = linkFetching.substring(0, end);
								System.out.println(count + ") " + linkFetching);
								count++;
							}
							else if (lowerLinkFetching.contains("html")) {
								end = lowerLinkFetching.indexOf("html") + 3;
								linkFetching = linkFetching.substring(0, end);
								System.out.println(count + ") " + linkFetching);
								count++;
							}
							else if (lowerLinkFetching.contains("htm")) {
								end = lowerLinkFetching.indexOf("htm") + 3;
								linkFetching = linkFetching.substring(0, end);
								System.out.println(count + ") " + linkFetching);
								count++;
							}
							else if (lowerLinkFetching.contains(">")) {
								end = lowerLinkFetching.indexOf(">") - 1;
								linkFetching = linkFetching.substring(0, end);
								System.out.println(count + ") " + linkFetching);
								count++;
							}
							begin = fetching.indexOf("</a>") + 4;
							fetching = fetching.substring(begin);
						}
					}
				}
				
				//Print out how many links were found
				if (count != 0) {
				count--;
				}
				System.out.println("\nNumber of Links Found:\t" + count);
				count = 1;
				
				//Main Loop repeat check
				while (tries == 0) {
					System.out.println("\nWould you like to try again (y/n):");
					System.out.print(">> ");
					tryAgain = keyboard.next();
					tryAgain = tryAgain.toLowerCase();
					if (tryAgain.startsWith("y")){
						tries++;
						System.out.println();
					} 
					else if (tryAgain.startsWith("n")){
						repeatProgram++;
						tries++;
					}
					else {
						System.out.println("Input was unrecognized.");
						System.out.print(">> ");
					}
				}
			}
			keyboard.close();
	}
}