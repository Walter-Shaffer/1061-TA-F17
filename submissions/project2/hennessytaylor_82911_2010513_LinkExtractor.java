import java.util.Scanner;

/*
* LinkExtractor.java
* Author: Taylor Hennessy
* Submission Date: 10/13/2017
*
* Purpose: This program extracts links from an html file based
* on their filetype, and displays these to the user.
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

	//scanner object to read 
	public static Scanner inputScanner = new Scanner(System.in);
	
	//main method
	public static void main(String[] args) {
		
		
		
		//create the string to hold user input
		String urlString;
		//create the string to hold fetched data
		String html;
		//create the int to hold user number choice
		int type;
		//create int for number of links
		int linkNum = 0;
		//create an int that holds the number of links in the array, so I can re use linkNum as a counter in other loops
		int arrayValue;
		//create array of indexes
		int[] indexArray;
		//create array of all links
		String[] allLinkArray;
		
		//numbers  to hold for number of link types
		int numOfImages = 0;
		int numOfDocuments = 0;
		int numOfHypertext = 0;
		
		//arrays to hold for specific link types
		String[] imagesArray;
		String[] documentsArray;
		String[] hypertextArray;
		
		while (true){
			//prompt 
			System.out.println("Enter a URL to read from ... or type Q to quit.");
			urlString = inputScanner.next();
			
			//check if the user attempted to quit
			if (urlString.contains("Q"))
			{
				System.out.println("Goodbye!");
				System.exit(0);
			}
			
			//get the html
			html = Fetch.fetchURL(urlString);

			//check if the url is invalid, and repeat until valid or quit
			if (html.contains("$error$"))
			{
				while (html.contains("$error$"))
				{
					System.out.println("Invalid URL entered! Please try again.");
					System.out.println("Enter a URL to read from ... or type Q to quit.");
					//get new input
					urlString = inputScanner.next();
					//check if the user attempted to quit
					if (urlString.equalsIgnoreCase("Q") || urlString.equalsIgnoreCase("QUIT"))
					{
						System.out.println("Goodbye!");
						System.exit(0);
					}
					else
					{
						//get the html
						html = Fetch.fetchURL(urlString);
					}
				}
			}

			//prompt for number
			System.out.println("Enter the type of link to look for (1-5)");
			System.out.println("1. Images (PNG, JPG, BMP, GIF)");
			System.out.println("2. Documents (DOC, TXT, PDF)");
			System.out.println("3. Hypertext (HTM, HTML)");
			System.out.println("4. All Links");
			System.out.println("5. Quit");
			
			//get the type
			type = inputScanner.nextInt();
			
			//loop until good input
			if (type < 1 || type > 5)
			{
				while (type < 1 || type > 5)
				{
					System.out.println("Invalid number entered! Please try again.");
					//prompt for number
					System.out.println("Enter the type of link to look for (1-5)");
					System.out.println("1. Images (PNG, JPG, BMP, GIF)");
					System.out.println("2. Documents (DOC, TXT, PDF)");
					System.out.println("3. Hypertext (HTM, HTML)");
					System.out.println("4. All Links");
					System.out.println("5. Quit");
					//get the type
					type = inputScanner.nextInt();
					if (type == 5)
					{
						System.out.println("Goodbye!");
						System.exit(0);
					}
				}
			}
			
			if (type == 5)
			{
				System.out.println("Goodbye!");
				System.exit(0);
			}
			//parse the html! 
			//count occurrences of "http
			for (int i = html.indexOf("\"http");i>=0;i = html.indexOf("\"http", i + 1))
			{
				linkNum++;
			}
			//initialize arrays
			indexArray = new int[linkNum];
			allLinkArray = new String[linkNum];
			arrayValue = linkNum;
			linkNum = 0;
			//loop the same thing again, but after initializing the array
			for (int i = html.indexOf("\"http");i>=0;i = html.indexOf("\"http", i + 1))
			{
				indexArray[linkNum]= i;
				linkNum++;
			}
			
			//loop but this time going through the array to find the whole links to stick in the other array
			for (int i = 0; i < arrayValue; i++)
			{
				allLinkArray[i] = html.substring(indexArray[i], html.indexOf("\"", indexArray[i]+1));			
			}
			
			//LOOK FOR CERTAIN LINKS
			if (type == 1)
			{
				//loop to look through the array of all links
				for (int i = 0; i < arrayValue; i++)
				{
					//count number of image links
					if (allLinkArray[i].contains(".png")||allLinkArray[i].contains(".jpg")
							||allLinkArray[i].contains(".bmp")||allLinkArray[i].contains(".gif"))
					{
						numOfImages++;
					}
				}
				//initialize image array
				imagesArray = new String[numOfImages];
				numOfImages = 0;
				//fill image array
				//loop to look through the array of all links
				for (int i = 0; i < arrayValue; i++)
				{
					//count number of image links
					if (allLinkArray[i].contains(".png")||allLinkArray[i].contains(".jpg")
							||allLinkArray[i].contains(".bmp")||allLinkArray[i].contains(".gif"))
					{
						imagesArray[numOfImages]=allLinkArray[i];
						numOfImages++;
					}
				}
				
				//print out image links
				for (int i = 0; i <= numOfImages - 1; i++)
				{
					System.out.println((i+1) + ". " + imagesArray[i]);		
				}
			} 
			else if (type == 2)
			{
				//loop to look through the array of all links
				for (int i = 0; i < arrayValue; i++)
				{
					//count number of doc links
					if (allLinkArray[i].contains(".doc")||allLinkArray[i].contains(".txt")
							||allLinkArray[i].contains(".pdf"))
					{
						numOfDocuments++;
					}
				}
				//initialize document array
				documentsArray = new String[numOfDocuments];
				numOfDocuments = 0;
				//fill document array
				//loop to look through the array of all links
				for (int i = 0; i < arrayValue; i++)
				{
					//count number of documents links
					if (allLinkArray[i].contains(".doc")||allLinkArray[i].contains(".txt")
							||allLinkArray[i].contains(".pdf"))
					{
						documentsArray[numOfDocuments]=allLinkArray[i];
						numOfDocuments++;
					}
				}
				
				//print out doc links
				for (int i = 0; i <= numOfDocuments - 1; i++)
				{
					System.out.println((i+1) + ". " + documentsArray[i]);		
				}
				
			} 
			else if (type == 3)
			{
				//loop to look through the array of all links
				for (int i = 0; i < arrayValue; i++)
				{
					//count number of hypertext links
					if (allLinkArray[i].contains(".htm")||allLinkArray[i].contains(".html"))
					{
						numOfHypertext++;
					}
				}
				//initialize hypertext array
				hypertextArray = new String[numOfHypertext];
				numOfHypertext = 0;
				//fill hypertext array
				//loop to look through the array of all links
				for (int i = 0; i < arrayValue; i++)
				{
					//count number of hypertext links
					if (allLinkArray[i].contains(".htm")||allLinkArray[i].contains(".html"))
					{
						hypertextArray[numOfHypertext]=allLinkArray[i];
						numOfHypertext++;
					}
				}
				
				//print out hypertext links
				for (int i = 0; i <= numOfHypertext - 1; i++)
				{
					System.out.println((i+1) + ". " + hypertextArray[i]);		
				}
				
				
			}
			else if (type == 4)
			{
				//loop to print all links
				for (int i = 0; i < arrayValue; i++)
				{
					System.out.println((i+1) + ". " + allLinkArray[i]);		
				}
			}
			
			
			//last thing inside the loop
			//clear absolutely everything
			urlString = "";
			html = "";
			type = 0;
			linkNum = 0;
			arrayValue = 0;
			numOfImages = 0;
			numOfDocuments = 0;
			numOfHypertext = 0;
			
		}
		
		
		
		//make an array initialized with the number of each type found in the url
		//add them to the array and loop to print
	}

}
