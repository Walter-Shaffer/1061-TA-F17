/*
		* LinkExtractor.java
		* Author: Spalding Latham
		* Submission Date: [10/14/2017]
		*
		* Purpose: This program takes links from an html website and prints the type of links the user wants to see
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
	
	String url = "";
	
	System.out.print("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit: \n>> ");
	
	
	
		
		url = input.next();
		

		if((url.charAt(0) == 'q') || (url.charAt(0) == 'Q')) //if the first character the user types is a Q or q the program will terminate
			System.out.print("Goodbye!");
		else{
		
		String http = url.substring(0,7);
		String https = url.substring(0,8);
		boolean isTrue;
		
		if (http.equals("http://") || (https.equals("https://"))){ //these boolean statements check the validity of a link
			 isTrue = true;}
		else  {isTrue = false;}
		
		if (url.charAt(0)!= 'h'){
			isTrue = false;
		}
		
	
	while ((isTrue == false)){ //this while loop reprompts the user if their input is an invalid link
		System.out.println("Input was unrecognized");
		System.out.print("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit: \n>> ");
		url = input.next();
		http = url.substring(0,7);
		https = url.substring(0,8);
		
		if (http.equals("http://") || (https.equals("https://"))){ //these boolean statements check the validity of a link
			 isTrue = true;}
		else  {isTrue = false;}
	
		
		}		 
		System.out.println();
		System.out.println("Enter the type of link to look for: \n");
		System.out.println("1. Images (PNG, JPG, BMP, GIF)");
		System.out.println("2. Documents (DOC, TXT, PDF)");
		System.out.println("3. Hypertext (HTM, HTML)");
		System.out.println("4. All links");
		System.out.print("5. Quit \n>> "); 
		
		int type = input.nextInt();
		if (type == 5){
			System.out.print("Goodbye!"); //if the user enters 5 the program terminates
		}
			
	while ((type != 1)&&(type != 2)&&(type != 3)&&(type != 4)&&(type != 5)){ //if the user enters a number greater than 5 they are reprompted for a valid number
		System.out.println();
		System.out.println("Enter the type of link to look for: \n");
		System.out.println("1. Images (PNG, JPG, BMP, GIF)");
		System.out.println("2. Documents (DOC, TXT, PDF)");
		System.out.println("3. Hypertext (HTM, HTML)");
		System.out.println("4. All links");
		System.out.print("5. Quit \n>> ");
		
		type = input.nextInt();
		
		if (type == 5){
			System.out.print("Goodbye!");
			System.exit(0); } //if they enter 5 the program terminates
		else {}
		
		
	}
	
	String searching;
	
	if (type == 1)
		searching = "images";
	else if (type == 2)
		searching = "documents";
	else if (type ==3)
		searching = "hypertexts";
	else 
		{searching = "all links";}
	//this if statement determines and prints what type of files the user is looking for and reprints the url
	System.out.println();		
	System.out.println("Searching " + url);
	System.out.println("Searching for: " + searching);
	System.out.println();
	
	
	
	String webpage = Fetch.fetchURL(url); // Retrieve a web page and return its contents as a string.
	

	
	char error = webpage.charAt(0);
	
	if (error == '$'){
		System.out.println();
		System.out.print(webpage.substring(7));
		return;} //this if statement checks the console if there is an error in the link and then prints this error
	
	int initial = webpage.indexOf("<a");
	webpage = webpage.substring(initial +1); //by starting the parsing right before the first link I was able to avoid having the out of bounds error cause by a >" before the initial link
	
	
	int start = webpage.indexOf("href=\"")+6; //this command starts the parsing right after it sees href="
	int finish = webpage.indexOf("\">"); //this command stops the parsing right after it sees >"
	
	while ((finish>0)&&(start>0)){ //this boolean statement stops the loop when the program cannot find the right indexOf and returns a -1
	
		start = webpage.indexOf("href=\"")+6; //by assigning the start and finish values new integers the program parses through all links, not just the first
	finish = webpage.indexOf("\">");
	
	if ((start<0)||(finish<0)){
		return;} //if the indexOf returns -1, the loop stops
	
	
	String link = webpage.substring(start, finish); //this is the code that actually grabs the link
	
	int n = 0;

	//the upcoming series of if statements prints only the type of links that the user asks for
 if ((type == 1)&&(link.endsWith(".jpg")||(link.endsWith(".bmp"))||(link.endsWith(".gif")))){ 
		n++;
		System.out.print(n + ". " +link);
		System.out.println();}
	
	if ((type == 2)&&(link.endsWith(".doc")||(link.endsWith(".txt")||(link.endsWith(".pdf"))))){
		n++;
		System.out.print(n + ". " +link);
		System.out.print(link);
		System.out.println();
	}
	
	if ((type == 3)&&(link.endsWith(".htm")||(link.endsWith(".html")))){
		n++;
		System.out.print(n + ". " +link);
		System.out.print(link);
		System.out.println();
	}
	if (type == 4){
		n++;
		System.out.print(n + ". " +link);
		System.out.print(link);
		System.out.println();
	}
	

	
	webpage = webpage.substring(finish+1); //this changes the value of the webpage string so the same link is not parsed infinitely
	


	}

	}
	

	
		
		
	
		
		
		
		
		
		}
	}
	

