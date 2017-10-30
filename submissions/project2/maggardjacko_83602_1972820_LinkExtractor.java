import java.util.Scanner;

/*
* LinkExtractor.java
* Author: Jack Maggard
* Submission Date: 10/08/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program grabs the hyperlinks of html code and allows the user 
* to choose what type of link they wish to see.
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int quit = 0;
		while (quit < 2) {// start of controlling while loop
			int inputLoop = 2;// initializing the controlling value for the
								// second loop. At line 50
			System.out.println(
					"Enter a valid URL to read from (include the \"http://\" or \"https://\"), or type Q to quit:");
			System.out.print(">>");
			String userURL = keyboard.next();//letting user input url
			userURL = userURL.toLowerCase();//.toLowerCase to avoid having to do equalsIgnoreCase later
			if (userURL.startsWith("q") || (userURL.startsWith("Q"))) {
				System.out.println("Goodbye!");
				quit = 2;//ends controlling while loop, terminating program
			} else if (userURL.startsWith("http://") || userURL.startsWith("https://")) {//look at line 211
				String code = Fetch.fetchURL(userURL);//using class kindly provided by Sal
				code = code.toLowerCase();//yet again, to avoid errors because of the case of chars. 

				while (inputLoop == 2) {
					System.out.println("Enter the type of link to look for (1-5):");
					System.out.println();
					System.out.println("1. Images (PNG, JPG, BMP, GIF");
					System.out.println("2. Document (DOC, TXT, PDF");
					System.out.println("3. Hypertext (HTM, HTML)");
					System.out.println("4. All Links");
					System.out.println("5. Quit");
					System.out.print(">> ");
					String input = keyboard.next();
					System.out.println();

					if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4")
							|| input.equals("5")) {//There is an else statement at the bottom in case the user inputs invalid url
						inputLoop = inputLoop + 1; //Indicates this loop will be the last. 
						if (input.equals("1")) {
							int outOfLinks = 0;//initializing variables local to this while loop. 
							int start = 0;
							int finish = 0;
							System.out.println("Searching " + userURL);
							System.out.println("Searching for: images");
							System.out.println();
							if (code.contains("$error$")) {//if page not found, this error appears
								start = code.indexOf("java");
								finish = code.indexOf(code.length());//just parsed out what we were told to print in this scenario
								System.out.println(code.substring(start) + "\n");
								outOfLinks = 2;
							} else {
								int count = 1;
								while (outOfLinks < 2) {
									System.out.println(outOfLinks);
									start = code.indexOf("href=");
									code = code.substring(start + 6);//This is very helpful because 
																	//the program won't accidentally grab the starting ""
									finish = code.indexOf("\"");
									String url = code.substring(0, finish);
									if (url.contains(".png") || url.contains(".jpg") || url.contains(".bmp")
											|| url.contains(".gif")) {//luckily, I made all of the code lower case 
										                             //so I wouldn't run into any trouble her
										System.out.println(count + ". " + url);
										count++;//This adds one more to count every time the loop repeats
									}
									if (code.contains("href="))//determined all html links started with href
										outOfLinks = 0;//loop repeats
									else
										outOfLinks = 2;//loop does not repeat
								}
								System.out.println("Number of links found: " + (count - 1));
								System.out.println();//After determining there are no more links, program prints number of links
							}
						}

						if (input.equals("2")) {
							int outOfLinks = 0;
							int start = 0;
							int finish = 0;
							System.out.println("Searching " + userURL);
							System.out.println("Searching for: documents");
							System.out.println();
							if (code.contains("$error$")) {
								start = code.indexOf("java");
								finish = code.indexOf(code.length());
								System.out.println(code.substring(start) + "\n");
								outOfLinks = 2;
							} else {
								int count = 1;
								while (outOfLinks < 2) {
									start = code.indexOf("href=");
									code = code.substring(start + 6);
									finish = code.indexOf("\"");
									String url = code.substring(0, finish);
									if (url.contains(".doc") || url.contains(".txt") || url.contains(".pdf")) {
										System.out.println(count + ". " + url);
										count++;
									}
									if (code.contains("href="))
										outOfLinks = 0;
									else
										outOfLinks = 2;
								}
								System.out.println();
								System.out.println("Number of links found: " + (count - 1));
							}
						}

						if (input.equals("3")) {
							int outOfLinks = 0;
							int start = 0;
							int finish = 0;
							System.out.println("Searching " + userURL);
							System.out.println("Searching for: hypertext");
							System.out.println();
							if (code.contains("$error$")) {
								start = code.indexOf("java");
								finish = code.indexOf(code.length());
								System.out.println(code.substring(start) + "\n");
								outOfLinks = 2;
							} else {
								int count = 1;
								while (outOfLinks < 2) {
									start = code.indexOf("href=");
									code = code.substring(start + 6);
									finish = code.indexOf("\"");
									String url = code.substring(0, finish);
									if (url.contains(".htm") || url.contains(".html")) {
										System.out.println(count + ". " + url);
										count++;
									}
									if (code.contains("href="))
										outOfLinks = 0;
									else
										outOfLinks = 2;
								}
								System.out.println("Number of links found: " + (count - 1));
								System.out.println();
							}
						}

						if (input.equals("4")) {
							int outOfLinks = 0;
							int start = 0;
							int finish = 0;
							System.out.println("Searching " + userURL);
							System.out.println("Searching for: all links");
							System.out.println();
							if (code.contains("$error$")) {
								start = code.indexOf("java");
								finish = code.indexOf(code.length());
								System.out.println(code.substring(start) + "\n");
								outOfLinks = 2;
							} else {
								int count = 1;
								while (outOfLinks < 2) {
									start = code.indexOf("href=");
									code = code.substring(start + 6);
									finish = code.indexOf("\"");
									String url = code.substring(0, finish);
									System.out.println(count + ". " + url);
									count++;
									if (code.contains("href="))
										outOfLinks = 0;
									else
										outOfLinks = 2;
								}
								System.out.println("Number of links found: " + (count - 1));
								System.out.println();
							}
						}
						if (input.equals("5")) {
							System.out.println("Goodbye!");
							System.exit(0);
						}

					}

					else//This is the else statement mentioned in line 64
						System.out.println("Try again");

				}

			} else// in case the user doesn't use an anticipated input. 
				System.out.println("input was unrecognized");
		}

	}

}
