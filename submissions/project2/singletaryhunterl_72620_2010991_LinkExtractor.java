/* LinkExtractor.java
		* Author: Hunter Singletary
		* Submission Date: [10/13/2017]
		*
		* Purpose: A program to take links from an HTML site and print the type of link a user inputs.
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
		
	Scanner input = new Scanner(System.in);
	
	String stUrl = "";
	
	System.out.print("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit: \n ");
	
	
	
		
		stUrl = input.next();
		

		if((stUrl.charAt(0) == 'q') || (stUrl.charAt(0) == 'Q')) 
			System.out.print("Goodbye!");
		else{
		
		String http = stUrl.substring(0,7);
		String https = stUrl.substring(0,8);
		boolean validURL;
		
		if (http.equals("http://") || (https.equals("https://"))){ 
			 validURL = true;}
		else  {validURL = false;}
		
		if (stUrl.charAt(0)!= 'h'){
			validURL = false;
		}
		
	
	while ((validURL == false)){ 
		System.out.println("Input was unrecognized");
		System.out.print("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit: \n");
		stUrl = input.next();
		http = stUrl.substring(0,7);
		https = stUrl.substring(0,8);
		
		if (http.equals("http://") || (https.equals("https://"))){ 
			 validURL = true;}
		else  {validURL = false;}
		}		 
		System.out.println();
		System.out.println("Enter the type of link to look for: \n");
		System.out.println("1. Images (PNG, JPG, BMP, GIF)");
		System.out.println("2. Documents (DOC, TXT, PDF)");
		System.out.println("3. Hypertext (HTM, HTML)");
		System.out.println("4. All links");
		System.out.print("5. Quit \n"); 
		
		int type = input.nextInt();
		if (type == 5){
			System.out.print("Goodbye!");
		}
			
	while ((type < 1)||(type > 5)){ 
		System.out.println();
		System.out.println("Enter the type of link to look for: \n");
		System.out.println("1. Images (PNG, JPG, BMP, GIF)");
		System.out.println("2. Documents (DOC, TXT, PDF)");
		System.out.println("3. Hypertext (HTM, HTML)");
		System.out.println("4. All links");
		System.out.print("5. Quit \n");
		
		type = input.nextInt();
		
		if (type == 5){
			System.out.print("Goodbye!");
			System.exit(0); } 
		else {}
		
		
	}
	
	String typeString;
	
	if (type == 1)
		typeString = "images";
	else if (type == 2)
		typeString = "documents";
	else if (type ==3)
		typeString = "hypertexts";
	else 
		{typeString = "all links";}
	System.out.println();		
	System.out.println("Searching " + stUrl);
	System.out.println("Searching for " + typeString);
	System.out.println();
	
	String webpage = Fetch.fetchURL(stUrl); 
	
	int i = webpage.indexOf("<a");
	webpage = webpage.substring(i +1); 

	int start = webpage.indexOf("href=\"")+6;
	int finish = webpage.indexOf("\">");
	
	while ((finish>0)&&(start>0)){
	
		start = webpage.indexOf("href=\"")+6;
	finish = webpage.indexOf("\">");
	
	if ((start<0)||(finish<0)){
		return;}
	
	
	String link = webpage.substring(start, finish);
	
	int x = 0;

	
 if ((type == 1)&&(link.endsWith(".jpg")||(link.endsWith(".bmp"))||(link.endsWith(".gif")))){
		x++;
		System.out.print(x + ". " +link);
		System.out.println();}
	
	if ((type == 2)&&(link.endsWith(".doc")||(link.endsWith(".txt")||(link.endsWith(".pdf"))))){
		x++;
		System.out.print(x + ". " +link);
		System.out.print(link);
		System.out.println();
	}
	
	if ((type == 3)&&(link.endsWith(".htm")||(link.endsWith(".html")))){
		x++;
		System.out.print(x + ". " +link);
		System.out.print(link);
		System.out.println();
	}
	if (type == 4){
		x++;
		System.out.print(x + ". " +link);
		System.out.print(link);
		System.out.println();
	}
	webpage = webpage.substring(finish+1);
	


	}

	}
	

	
		
		
	
		
		
		
		
		
		}
	}
	


