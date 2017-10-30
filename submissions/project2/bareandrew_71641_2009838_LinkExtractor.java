import java.util.Scanner;

/*
* LinkExtractor.java
* Author: Andrew Bare
* Submission Date: 10/13/17
*
* Purpose: 
* 
* This program takes an inputed URL and prompts the user to find
* spcific things on the webpage. Based on the user's choice, it then 
* prints out the specific links for the choice
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

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//boolean for over arching loop of program
		boolean quit = false;
		boolean linkValid = false;
		
		int select =0;
		int start = 0;
		int linkNumber =0;
		
		String page, url, parse, output ="";
		
		while (quit == false)
		{
			
			//receive user URL
			System.out.println("Enter a URL to read from (include the \"http://\" or \"http://\") or type Q to quit");
			url = kb.next();			
			
			if(url.charAt(0) == 'q' ||url.charAt(0) == 'Q') //if the user wishes to quit
			{
				quit = true;
			}
			//checks for valid url, sets valid bool true if so
			else if (url.indexOf("http://") == 0 || url.indexOf("https://") == 0)
			{
				//System.out.println("Here!");
				linkValid = true;
			}
			else
			{
				System.out.println("Input was unrecognized");
				url="";
			}
			
			//if the url is ok
			if (linkValid == true && quit == false)
			{
				//when the link is valid, loops till a valid number is input
				boolean typeValid = false;
				while (typeValid == false)
				{
					//Prompt for input
					System.out.println("Enter the type of link to look for (1-5)");
					System.out.println("1. Images (PNG, JPG, BMP, GIF)");
					System.out.println("2. Documents (DOC, TXT, PDF)");
					System.out.println("3. Hypertext (HTM, HTML)");
					System.out.println("4. All Links");
					System.out.println("5. Quit");
					
					select = kb.nextInt();	
					
					//System.out.println("running!");
					
					if (5 - select>=0 && select >=1){
						if (select == 5)
							quit = true;
						typeValid= true;
						//System.out.println("true!");
						
					}
					else
						System.out.println("Invalid Number Entered");
					
				}
				//only runs if the user hasn't indicated that they don't want to quit
				if (quit == false)
				{
					page = Fetch.fetchURL(url);
					//System.out.println(page);
					
					//print searching statements
					System.out.println("Searching " + url);
					System.out.print("Searching for: " );
					//what is the users searching for?
					if (select == 1)
						System.out.println("Images");
					else if (select == 2)
						System.out.println("Documents");
					else if (select == 3)
						System.out.println("Hypertext");
					else if (select == 4)
						System.out.println("All Links");
					
					//SPACER
					System.out.println("");
					
					//if there's an error in the link retrieved
					if (page.indexOf("$error$") == 0)
					{
						//System.out.println("Fail!");
						System.out.println(page.substring(7, page.length()));
						quit = false;
						linkValid = false;
						select= 0;
						start =0;
						linkNumber =0;
						page = "";
						url="";
						parse = "";
						output="";
					}
					//enter the parsing phase of the algorythm
					else
					{
						parse=page.substring(page.indexOf("<a href="));
						
						//loops as long as there's something worth finding leftover in parse
						do
						{
							start = 0;	
							
							start = parse.indexOf("<a href=")+8;
							//experiment
							parse= parse.substring(start);
							start = 1;
							
							//sets the end value to the first found value of >
							int end = parse.indexOf(">")-1;
//							if (end == 277||end == 188)
//								end = parse.indexOf("\" >");
//							System.out.println(start);
//							System.out.println(end);
							
//							System.out.print("Start: ");
//							System.out.println(start);
//							System.out.print("End: ");
//							System.out.println(end);
							
							//only give output a value if it's actually a link
							if (parse.contains("http"))
							{
								output = parse.substring(start, end);
							}
							else
							{
								start = 0;
								output = "";
							}
							//the following else if ladder checks the specified want of the user and check to make sure 
							//the output has something in it
							if (select == 1 && !(output.isEmpty()))
							{
								//looks for each link and then prints it if it's the correct type
								if (output.toLowerCase().contains(".bmp")||output.toLowerCase().contains(".jpg")|| output.toLowerCase().contains(".png") || output.toLowerCase().contains(".gif")){
									linkNumber++;
									System.out.print(linkNumber + ". ");	
									System.out.println(output);	
								}
							}
							else if (select ==2 && !(output.isEmpty()))
							{
								if (output.toLowerCase().contains(".doc")|| output.toLowerCase().contains(".txt")||output.toLowerCase().contains(".pdf"))
								{
									//looks for each link and then prints it if it's the correct type
									linkNumber++;
									System.out.print(linkNumber + ". ");	
									System.out.println(output);	
										
								}
								
							}
							else if (select ==3 && !(output.isEmpty()))
							{
								if (output.toLowerCase().contains(".htm"))
								{
									//looks for each link and then prints it if it's the correct type
									linkNumber++;
									System.out.print(linkNumber + ". ");	
									System.out.println(output);	
										
								}
							}
							else if (select ==4 && !(output.isEmpty()))
							{
								//looks for each link and then prints it if it's the correct type
								linkNumber++;
								System.out.print(linkNumber + ". ");	
								System.out.println(output);								
							}
							parse = parse.substring(end+1);
													
							
						} while (start !=0);
						System.out.println("");
						System.out.println("Number of Links Found: " + linkNumber);
//						System.out.println(page);
					}
				}
				
				//System.out.println("Fail!");
				//Reset Everything
				//quit = false;
				linkValid = false;
				select= 0;
				start =0;
				linkNumber =0;
				page = "";
				url="";
				parse = "";
				output="";
				
				
			}
			
		}
		System.out.println("Goodbye!");

	}

}
