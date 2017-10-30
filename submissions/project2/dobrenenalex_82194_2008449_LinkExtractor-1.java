/* LinkExtractor.java 
 * Author:  Alex Dobrenen 
 * Submission Date:  OCt 13  
 * Purpose: A brief paragraph description of the 
 * program. What does it do? For  this  project,  you  are  to  create a  Java  program  
 * called LinkExtractorthat prompts  the  user  for  a  URL, accesses  the  Web  page  
 * associated  with  that  URL,  parses  the  page’s HTML,  and  extracts  hyperlinks  present  
 * in  the  HTML.  The links will point to images, documents, and other pages on the Web 
 * (the different types will be indicated by the file extension contained in the URL). The 
 * program should allow the user to select the sort of links to search for,  and  the  links  
 * that  are  found  should  be  displayed  to  the  user.  The process  of  prompting  the  user  
 * for  a  URL,  accessing the appropriate page, and printing out extracted links should be repeated 
 * until the user decides to quit.
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

//Class Start
public class LinkExtractor 
{
	
	//Main Start
	public static void main(String[] args) 
	{
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//Variables
		String fetchedLinks = "";
		String urlToFetch = "";
		int typeChoice = 0;
		String urlType1 = "http://";
		String urlType2 = "https://";
		boolean good = true;
		String extractedLinks = "";
		String approvedLinks = "";
		
		
		do//Start While
		{
			int numLinks = 0;
			int numbering = 1;
			//Input
			do// Start while
			{
				input = new Scanner(System.in);
				urlToFetch = "";
				
				//Makes sure the user doesnt input a empty string and mess everything up
				while(urlToFetch.equals(""))
				{

					System.out.println("Enter a URL to read from (include the "
							+ "\"http://\" or \"https://\"), or type Q to quit:");
					System.out.print(">> ");
					urlToFetch = input.nextLine();
					//System.out.println(urlToFetch);
				}
				
				//Checks for good input
				if(((urlToFetch.charAt(0) == 'Q') 
					|| (urlToFetch.charAt(0) == 'q'))
					|| (urlType1.equalsIgnoreCase(urlToFetch.substring(0,7)))
					|| (urlType2.equalsIgnoreCase(urlToFetch.substring(0,8)))
				)
				{
					good = true;
				}
				else
				{
					System.out.println("Input was not Recognized");
					good = false;
				}
				
			}while(good == false); //End while
			
			//System.out.println(urlToFetch);
			//Start of Parsing
			if((urlToFetch.charAt(0) == 'Q') || (urlToFetch.charAt(0) == 'q'))
			{
				System.out.println("Goodbye!");
			}
			else
			{
				fetchedLinks = Fetch.fetchURL(urlToFetch);
				
				//Type Choice
				System.out.println("Enter the type of link to look for (1-5)");
				System.out.println("1. Images (PNG, JPG, BMP, GIF)");
				System.out.println("2. Documents (DOC, TXT, PDF)");
				System.out.println("3. Hypertext (HTM, HTML)");
				System.out.println("4. All Links");
				System.out.println("5. Quit");
				System.out.print(">> ");
				
				typeChoice = input.nextInt();
				
				//Searching Output
				System.out.println();
				if(typeChoice == 1)
				{
					System.out.println("Searching " + urlToFetch);
					System.out.println("Searching For: Images");
				}
				else
				{
					if(typeChoice == 1)
					{
						System.out.println("Searching " + urlToFetch);
						System.out.println("Searching For: Documents");
					}
					else
					{
						if(typeChoice == 1)
						{
							System.out.println("Searching " + urlToFetch);
							System.out.println("Searching For: Hypertext");
						}
						else
						{
							if(typeChoice == 1)
							{
								System.out.println("Searching " + urlToFetch);
								System.out.println("Searching For: All Links");
							}
							else
							{
								
							}
						}
					}
				}
				
				//Extraction
				do
				{
					//Cutting out Links
					extractedLinks = fetchedLinks.substring(fetchedLinks.indexOf("href=\"")+6);
					fetchedLinks = extractedLinks.substring(extractedLinks.indexOf("\">")+1);
					extractedLinks = extractedLinks.substring(0,extractedLinks.indexOf("\">"));
					
					//System.out.println(extractedLinks);
					//System.out.println(fetchedLinks);
					
					//Images
					if((typeChoice ==  1) && ((extractedLinks.indexOf(".png") >= 0) || 
											(extractedLinks.indexOf(".jpg") >= 0) || 
											(extractedLinks.indexOf(".bmp") >= 0) || 
											(extractedLinks.indexOf(".gif") >= 0)))
					{
						approvedLinks = approvedLinks + "\n" + numbering + ". " +  extractedLinks;
						numbering++;
						numLinks++;
						//System.out.println(approvedLinks);
					}
					else
					{
						//Documents
						if((typeChoice ==  2) && ((extractedLinks.indexOf(".doc") >= 0) || 
												(extractedLinks.indexOf(".txt") >= 0) || 
												(extractedLinks.indexOf(".pdf") >= 0)))
						{
							approvedLinks = approvedLinks + "\n" + numbering + ". " +  extractedLinks;
							numbering++;
							numLinks++;
							//System.out.println(approvedLinks);
						}
						else
						{
							//Weblinks
							if((typeChoice ==  3) && ((extractedLinks.indexOf(".htm") >= 0) || 
													(extractedLinks.indexOf(".html") >= 0)))
							{
								approvedLinks = approvedLinks + "\n" + numbering + ". " +  extractedLinks;
								numbering++;
								numLinks++;
								//System.out.println(approvedLinks);
							}
							else
							{
								//Everything
								if((typeChoice ==  4) && ((extractedLinks.indexOf(".png") >= 0) || 
														(extractedLinks.indexOf(".jpg") >= 0) || 
														(extractedLinks.indexOf(".bmp") >= 0) || 
														(extractedLinks.indexOf(".gif") >= 0) ||
														(extractedLinks.indexOf(".doc") >= 0) || 
														(extractedLinks.indexOf(".txt") >= 0) || 
														(extractedLinks.indexOf(".pdf") >= 0) ||
														(extractedLinks.indexOf(".htm") >= 0) || 
														(extractedLinks.indexOf(".html") >= 0) ||
														(extractedLinks.indexOf(".svg") >= 0) ||
														(extractedLinks.indexOf("") >= 0)))
								{
									approvedLinks = approvedLinks + "\n" + numbering + ". " +  extractedLinks;
									numbering++;
									numLinks++;
									//System.out.println(approvedLinks);
								}
								else
								{
									if(typeChoice ==  5)
									{
										System.out.println("Okay, exiting section.");
									}
								}
							}
						}
					}
				}while((fetchedLinks.indexOf("href=\"") != -1) && (typeChoice !=5));//Need to check end of parse
			//Correct output at correct time
			if(typeChoice !=5)
			{
				System.out.println(approvedLinks);
				System.out.println("Number of Links: " + numLinks);
			}
			}
		}while((urlToFetch.charAt(0) != 'Q') 
				&& (urlToFetch.charAt(0) != 'q'));//End While
		
		
	}//Main End

}//Class End
