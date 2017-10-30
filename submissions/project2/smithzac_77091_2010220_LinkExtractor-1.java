/*LinkExtractor.java



 * Zachary Smith
 * 10-13-17
 * This program reads a user-inputed URL, and will determine if
 * the URL is valid, invalid, or if the user wants to quit.
 * If the URL is valid, it will search the URL for specified links
 * that the user selected through the program. Once all links are
 * found, the program will print them out, and then loop all over 
 * again. If at any time an input is invalid, then the program
 * will loop over again until a correct input is inputed.
 * 
 * Statement of Academic Honesty:
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not 
 * copied or modified code from any other source other than 
 * the course webpage or the course textbook. I recognize that 
 * any unauthorized assistance or plagiarism will be handled in
 * accordance with the policies at Clemson University and the
 * policies of this course, I recognize that my work is based
 * on an assignment created by the School of Computing at 
 * Clemson University. Any publishing or posting of source
 * code for this project is strictly prohibited unless
 * you have written consent from the instructor.
 * 
 */

import java.util.Scanner;

public class LinkExtractor {

	public static void main(String[] args) {
		
			boolean repeat = true;
			boolean validURL = false;
			boolean validNumber = false;
			boolean index = true;
			
			int range, start;
			
			int finish = 0;
			int count = 0;
			
			String strURL, error, exact;
			
			
			
			while(repeat == true)
			{
				
				Scanner keyboard = new Scanner(System.in);

				System.out.println("Enter a URL to read from(include the \"http://\" or \"https://\", or type Q to quit."); //enter in the URL

				strURL = keyboard.next();

				strURL = strURL.toLowerCase(); //to recognize all URL's no matter the case.
				
				if(strURL.startsWith("q")) // determines if the URL starts with a "q", which will stop the program
				{
					System.out.println("Goodbye!");
					
					repeat = false;
					
					System.exit(0);
				}
				else
				{
					if(strURL.contains("http://") || strURL.contains("https://")) // determines if the URL is valid
					{
						validURL = true;
						
						while(validURL == true)
						{
							System.out.print("Enter the type of link to look for (1-5):\n1. Images (PNG, JPG, BMP, GIF)\n2. Documents (DOC, TXT, PDF)\n3. Hypertext (HTM, HTML)\n4. All Links\n5. Quit\n");
							
							range = keyboard.nextInt();
							
							if(range == 1 || range == 2 || range == 3 || range == 4 || range == 5) // determines if the number input is valid
							{
								
								String webpage = Fetch.fetchURL(strURL);
								
								if(webpage.contains("$error$")) // if there is an error in the webpage, the program will return an error message
								{
									error = webpage.substring(7);
									
									System.out.println(error);
									
									repeat = true;
								}
							
								else if(range == 1) // finds all documents that are images
								{
									validNumber = true;
									
									System.out.println("Searching " + strURL);
									
									System.out.println("Searching for: Images");
								
									start = webpage.indexOf("<a href=\"") + 9;
									
									while(index == true)
									{
										finish = webpage.indexOf("\"", start);

										exact = webpage.substring(start,finish);
											
										if(!exact.contains("<a href="))
										{
											if(exact.endsWith(".png") || exact.endsWith(".jpg") || exact.endsWith(".bmp") || exact.endsWith(".gif"))
											{
												count++;
												
												exact = exact.toLowerCase();	
												
												System.out.println(count + ". " + exact); //prints out all images
											}
										}
										
										start = finish + 1;
										
									
									}
									
									System.out.println("Number of links found: " + count);
									
									validNumber = false;
									
								}
								else if(range == 2) // finds all documents that are documents
								{
									validNumber = true;
									
									System.out.println("Searching " + strURL);
									
									System.out.println("Searching for: Documents");
										
									start = webpage.indexOf("<a href=\"") + 9;
									
									while(index == true)
									{
										finish = webpage.indexOf("\"", start);

										exact = webpage.substring(start,finish);
											
										if(!exact.contains("<a href="))
										{
											if(exact.endsWith(".doc") || exact.endsWith(".txt") || exact.endsWith(".pdf"))
											{
												count++;
												
												exact = exact.toLowerCase();	
												
												System.out.println(count + ". " + exact); // prints out all documents
											}
										}
										
										
										
										start = finish + 1;	
									}
									
									System.out.println("Number of links found: " + count);
									
									validNumber = false;
								}
								else if(range == 3) // finds all documents that are hypertext
								{
									validNumber = true;
									
									System.out.println("Searching " + strURL);
									
									System.out.println("Searching for: Hypertext");
									
									start = webpage.indexOf("<a href=\"") + 9;
									
									while(index == true)
									{
										finish = webpage.indexOf("\"", start);

										exact = webpage.substring(start,finish);
											
										if(!exact.contains("<a href="))
										{
											if(exact.endsWith(".htm") || exact.endsWith(".html"))
											{
												count++;
												
												exact = exact.toLowerCase();	
												
												System.out.println(count + ". " + exact); // prints out all hypertext
											}
										}
										
										
										
										start = finish + 1;	
									}
									
									System.out.println("Number of links found: " + count);
									
									validNumber = false;
								}
								else if(range == 4) // finds all documents
								{
									validNumber = true;
									
									System.out.println("Searching " + strURL);
									
									System.out.println("Searching for: All Links");
									
									start = webpage.indexOf("<a href=\"") + 9;
									
									while(index == true)
									{
										finish = webpage.indexOf("\"", start);

										exact = webpage.substring(start,finish);
											
										if(!exact.contains("<a href="))
										{
											count++;
											
											exact = exact.toLowerCase();	
											
											System.out.println(count + ". " + exact); // prints out all documents
											
											
										}
										
										
										
										start = finish + 1;	
									}
									
									System.out.println("Number of links found: " + count);
									
									validNumber = false;
								}
								else if(range == 5) // quits the program if number 5 is selected
								{
									validNumber = true;
								
									repeat = false;
								
									System.out.println("Goodbye!");
								
									System.exit(0);
								}
								else // if the number input is invalid, will loop around until a valid input is entered
								{
									validNumber = false;
									
									System.out.println("Please enter a valid number.");
									
									range = keyboard.nextInt();
									
									if(range == 1 || range == 2 || range == 3 || range == 4 || range == 5)
									{							
										validNumber = false;
									}
									else
									{
										validNumber = true;						
									}
								}
							}
							
							validURL = false;
							
						}
					}
					
					else // if an invalid URL is inputed, will loop around until a valid one is entered
					{
							validURL = false;	
						
							System.out.println("Please enter a valid URL.");
							
							strURL = keyboard.next();
							
							if(strURL.equalsIgnoreCase("http://") || strURL.equalsIgnoreCase("https://"))
							{						
								validURL = true;
								
								System.out.print("Enter the type of link to look for (1-5)\n1. Images (PNG, JPG, BMP, GIF)\n2. Documents (DOC, TXT PDF)\n3. Hypertext (HTM, HTML)\n4. All Links\n5. Quit\n");

							}	
					}
						
						
					}
				}
			}
			
		}
