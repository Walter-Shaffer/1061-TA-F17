
/*
* LinkExtractor.java
* Author: Daniel Christensen
* Submission Date: 10/13/17
*
* Purpose: Given a correctly formatted link to a webpage, this program searches for and extracts 
* links that are on the webpage. The program can search for certain file types upon request, or
* extract all links that are found.
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

		Scanner keyboard = new Scanner(System.in);//create scanner object
		
		boolean repeat = true;
		
		while(repeat==true) {
			
			boolean validLink = false;
			
			
			while (validLink==false){//need to check if link is of desired format
				
				System.out.println("Please enter the link that you wish to examine or press Q to quit:");//prompts user input
				String link = keyboard.next();//stores user input
				link.trim();//gets rid of any unwanted white space
				
				if (  Character.toString(link.charAt(0)).equalsIgnoreCase("Q")) {// checks to see if first inputted character is q
					repeat = false;
					System.out.println("Goodbye!");
					System.exit(0);// quits program
				}
				
				String linkCheck = link.substring(0,8);
				
				if (linkCheck.contains("http://") || linkCheck.contains("https://")) {//checks to see if link is of valid format
					
					validLink=true;
					
					boolean decisionMade = false;
					
					while(decisionMade==false) {//this loop will run until a valid choice has been made
						
						String decision1 = "Images(PNG, JPG, BMP, GIF)";
						String decision2 = "Documents (DOC, TXT, PDF)";
						String decision3 = "Hypertext (HTM, HTML)";
						String decision4 = " All Links";						
								
						System.out.println("Enter the type of link to look for (1-5):");
						System.out.println("1." + decision1);
						System.out.println("2." + decision2);
						System.out.println("3." + decision3);
						System.out.println("4." + decision4);
						System.out.println("5. Quit");
						
						int lookFor = keyboard.nextInt();
						
						if (lookFor<1 || lookFor>5) {
							
							System.out.println("Invalid input, please try again.");// gives error message if integer is out of range
						}
						else {//continues with valid decision
							
							decisionMade=true;// ends decision loop
							
							String webpage = Fetch.fetchURL(link);//fetches url webpage as a string
							
							if (webpage.substring(0,7).contains("$error$")) {
								System.out.println(webpage.substring(7));
							}
							else {
								
								if (lookFor == 1) {//print what links the program is searching for
									System.out.println("Searching "+ link);//print link program is extracting from
									System.out.println("");
									System.out.println("Searching for: " + decision1);
								}
								else {
									if (lookFor == 2) {
										System.out.println("Searching "+ link);//print link program is extracting from
										System.out.println("");
										System.out.println("Searching for: " + decision2);
									}
									else {
										if (lookFor == 3) {
											System.out.println("Searching "+ link);//print link program is extracting from
											System.out.println("");
											System.out.println("Searching for: " + decision3);
										}
										else {
											if (lookFor == 4) {
												System.out.println("Searching "+ link);//print link program is extracting from
												System.out.println("");
												System.out.println("Searching for: " + decision4);
											}
											else {
												System.out.println("Goodbye!");
												System.exit(0);
											}
										}
									}
								}//ends "searching for:" print nested if statement
								System.out.println("");
								String links = "";//a string of all the links will be appended to this string
					            
								while( webpage.contains("http://") ){//need to extract links
									
									int linkStartIndex = webpage.indexOf('"'+"http://");//finds the first instance of a correctly formatted link
									webpage = webpage.substring(linkStartIndex+1);//removes material preceding first link
									int linkEndIndex = webpage.indexOf('"');//goes to the next '"' character which marks the end of a correctly formatted link
									links+=webpage.substring(0,linkEndIndex);//adds the full url to the string: links
									webpage = webpage.substring(linkEndIndex+1);//removes the parsed link from the string webpage
									
								}
								
								if(lookFor == 4) {//all links
									
									int linkNumber = 1;//number of link being parsed
									
									while (links.contains("http://")) {
									    	
										String url = "http://";//will use to append link body
										
										links = links.substring(7);//removes the first "http://"
										
										if (links.contains("http://")) {
											int endLink = links.indexOf("http://");//finds the beginning of next link/end of current link
											
											url = url + links.substring(0, endLink);//appends body of link to "http://"
											
											System.out.printf("%3s%s%n",linkNumber+".",url);//prints url in desired format
											
											links = links.substring(endLink);//prepares string links for next iteration
											
											linkNumber++;
										}
										else {//accounts correctly for the last iteration
											url+=links;
											System.out.printf("%3s%s%n",linkNumber+".",url);
											System.out.println("");
											System.out.println("Number of links found:  " + linkNumber);
											System.out.println("");
										}
									}
								}
								else {
									if(lookFor == 3) {//hypertext links
										
										int linkNumber = 1;//number of link being parsed
										
										while (links.contains("http://")) {
										    	
											String url = "http://";//will use to append link body
											
											links = links.substring(7);//removes the first "http://"
											
											if (links.contains("http://")) {
												int endLink = links.indexOf("http://");//finds the beginning of next link/end of current link
												
												url = url + links.substring(0, endLink);//appends body of link to "http://"
												
												if(url.contains(".htm") || url.contains(".html")) {
													System.out.printf("%3s%s%n",linkNumber+".",url);//prints url in desired format.
													
													linkNumber++;
												}
												links = links.substring(endLink);//prepares string links for next iteration
											}
											else {//accounts correctly for the last iteration
												url+=links;
												if(url.contains(".htm") || url.contains(".html")) {
													System.out.printf("%3s%s%n",linkNumber+".",url);
												}
												
											}
										}
										System.out.println("");
										System.out.println("Number of links found:  " + linkNumber);
										System.out.println("");
									}
									else {
										if(lookFor == 2) {//hypertext links
											
											int linkNumber = 1;//number of link being parsed
											
											while (links.contains("http://")) {
											    	
												String url = "http://";//will use to append link body
												
												links = links.substring(7);//removes the first "http://"
												
												if (links.contains("http://")) {
													int endLink = links.indexOf("http://");//finds the beginning of next link/end of current link
													
													url = url + links.substring(0, endLink);//appends body of link to "http://"
													
													if(url.contains(".doc") || url.contains(".txt") || url.contains(".pdf")) {
														System.out.printf("%3s%s%n",linkNumber+".",url);//prints url in desired format.
														
														linkNumber++;
													}
													links = links.substring(endLink);//prepares string links for next iteration
												}
												else {//accounts correctly for the last iteration
													url+=links;
													if(url.contains(".doc") || url.contains(".txt") || url.contains(".pdf")) {
														System.out.printf("%3s%s%n",linkNumber+".",url);
														
													}
													
												}
											}
											System.out.println("");
											System.out.println("Number of links found:  " + linkNumber);
											System.out.println("");
										}
										else {
											if(lookFor == 1) {//hypertext links
												
												int linkNumber = 1;//number of link being parsed
												
												while (links.contains("http://")) {
												    	
													String url = "http://";//will use to append link body
													
													links = links.substring(7);//removes the first "http://"
													
													if (links.contains("http://")) {//last iteration will not satisfy this statement
														int endLink = links.indexOf("http://");//finds the beginning of next link/end of current link
														
														url = url + links.substring(0, endLink);//appends body of link to "http://"
														
														if(url.contains(".jpg") || url.contains(".bmp") || url.contains(".gif") || url.contains(".png")) {
															System.out.printf("%3s%s%n",linkNumber+".",url);//prints url in desired format.
															
															linkNumber++;
														}
														links = links.substring(endLink);//prepares string links for next iteration
													}
													else {//accounts correctly for the last iteration
														url+=links;
														if(url.contains(".jpg") || url.contains(".png") || url.contains(".bmp") || url.contains(".gif")) {
															System.out.printf("%3s%s%n",linkNumber+".",url);
															
														}
														
													}
												}
												System.out.println("");
												System.out.println("Number of links found:  " + linkNumber);
												System.out.println("");	
											}
										}
											
									}
									
								}
							}
							
								
								
								
						}
						
					}//ends decision loop
					
				}
				else {
					System.out.println("Input was unrecognized");
			    }
			}//ends link check loop
			
		}//ends repeat loop
		
		
		
		


		
		
		

	}
}