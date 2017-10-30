/*
* [LinkExtractor].java
* Author: [Jason Battaglini]
* Submission Date: [10/13/17]
*
* Purpose: The purpose of this project is to parse and search
* links found given a link inputted by the user.
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
		// TODO Auto-generated method stub
Scanner keyboard= new Scanner(System.in);
String link;
String input;
int count=0;
int start;
int finish;
//href+6
//html
System.out.println("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit.");
input=keyboard.next();
if (input.contains("q")||input.contains("Q")){
System.out.println("Goodbye!");
	System.exit(0);
}
//link=keyboard.next();
String webpage=Fetch.fetchURL(input);
//System.out.println(webpage);
//if()

while(input!=("1)")){
	//index of
System.out.println("Enter the type of link to look for (1-5)\n1. Images (PNG, JPG, BMP, GIF)\n2. Documents (DOC, TXT, PDF)\n3. Hypertext(HTM, HTML)\n4. All Links\n5. Quit");
String inputTwo=keyboard.next();

if(inputTwo.equals("5")){
	System.out.print("Goodbye!");
	System.exit(0);
	}

if (inputTwo.equals("2")){

	System.out.println("Searching " + input);
	System.out.println("Searching for: documents\n");
	int runWhile=0;
	
	while(runWhile==0)
	{
	start=webpage.indexOf("href=");
	webpage=webpage.substring(start+6);
	finish=webpage.indexOf("\"");
	link=webpage.substring(0, finish);
	//System.out.println(link);
	if(link.contains(".doc")||link.contains(".pdf")||link.contains(".txt")){
		count++;
	System.out.println(link);
	}
	
	if (webpage.contains("href="))
		runWhile=0;
	//count++;
	
	else
		runWhile=1;
	
	}
	System.out.println("\nNumber of Links Found :" + count);
	
	if (webpage.contains("href"))
		System.out.println(webpage);
	else
			System.exit(0);
	
	}
else if (inputTwo.equals("1")){
	System.out.println("Seaching "+ input);
	System.out.println("Searching for: images\n");
	 int runWhile=0;
	 while (runWhile==0){
		 start=webpage.indexOf("href=");
		 webpage=webpage.substring(start+6);
		 finish=webpage.indexOf("\"");
		 link=webpage.substring(0,finish);
		 if(link.contains(".png")||link.contains(".jpg")||link.contains(".bmp")||link.contains(".gif")){
			 	count++;
			 System.out.println(count + ". " + link);
		 }
		 if (webpage.contains("href="))
			 runWhile=0;
		 else
			 runWhile=1;
	 }
	 System.out.println("\nNumber of Links Found: " + count);
	 if(webpage.contains("href"))
		 System.out.println(webpage);
	 else
		 System.exit(0);

}
	 else if (inputTwo.equals("3")){
		 System.out.println("Searching "+ input);
		 System.out.println("Searching for: hypertext\n");
int runWhile=0;
while (runWhile==0){
	
	
	start=webpage.indexOf("href=");
	webpage=webpage.substring(start+6);
	finish=webpage.indexOf("\"");
	link=webpage.substring(0,finish);
	if(link.contains(".htm")||link.contains(".html")){
		count++;
		System.out.println(count + ". " + link);
	}
	if (webpage.contains("href="))
		runWhile=0;
		else
			runWhile=1;
}
System.out.println("\n Number of links found: " + count);
	 }
	 
		
	 
	 else if (inputTwo.equals("4")){
	System.out.println("Searching "+ input);
	System.out.println("Searcing for: all links\n");
	int runWhile=0;
	while(runWhile==0){
		start=webpage.indexOf("href=");
		webpage=webpage.substring(start +6);
		finish=webpage.indexOf("\"");
		link=webpage.substring(0,finish);
		if(link.contains(".htm")||link.contains(".html")||link.contains(".gif")||link.contains(".jpg")||link.contains(".doc")||link.contains(".pdf")||link.contains(".bmp")||link.contains(".txt")||link.contains(".edu")||link.contains(".com")||link.contains(".gov")||link.contains(".net")||link.contains(".org"))
			count++;
			System.out.println(count + ". " +link);
		if(webpage.contains("href="))
			runWhile=0;
		else
			runWhile=1;
		
	}
	System.out.println("Number of Links Found: " +count);
}
	 else if (webpage.contains("$error$"))
		 System.out.println(webpage);


		
	}

	


	}
		
	}		

	


