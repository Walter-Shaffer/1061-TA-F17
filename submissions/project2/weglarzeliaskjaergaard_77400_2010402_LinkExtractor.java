/*
* LinkExtractor.java
* Author: Elias Weglarz
* Submission Date: 10/13/17
*
* Purpose: Access a website given by the user and then parse the page's HTML to extract hyperlinks.
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
		Scanner keyboard = new Scanner (System.in);
		String initialLineString;
		int a = 0;
		int count = 0;
		do {
			
			System.out.println("Enter a URL to read from (include the 'http://' or 'https://'), or type Q to quit:");	
			initialLineString = keyboard.next();
			String webpage = Fetch.fetchURL(initialLineString);
			if (initialLineString.startsWith("http")||(initialLineString.startsWith("https"))){
				System.out.println("Enter the type of link to look for (1-5):");
				System.out.println(" ");
				System.out.println("1.Images (PNG, JPG, BMP, GIF");
				System.out.println("2.Documents (DOC, TXT, PDF");
				System.out.println("3.Hypertext (HTM, HTML");
				System.out.println("4.All Links");
				System.out.println("5.Quit");
				System.out.println(">>");		
			}
			else if (initialLineString.startsWith("q")){
				System.out.println("Goodbye");
				System.exit(0);
			}
				else{
					System.out.println("Invalid input");
					a = 1;
					
				}		
			String number;
			number = keyboard.next();
			if (number.equals("5")){
				System.out.println("Goodbye");
				System.exit(0);
			}
		
			else if (number.equals("4")){
				System.out.println("Searching" + initialLineString);
				System.out.println("Searching for: all links");
				System.out.println("");
				int start,finish;
				start=1;
				finish=1;
				while (start != 0 && finish !=-1){
				String all;
				finish = webpage.indexOf("href",start);
				start = webpage.indexOf('"',finish)+ 1;
					if (start !=-1 && finish != -1){
						finish = webpage.indexOf('"',start);
						all = webpage.substring(start ,finish);
						System.out.println(all);
						count++;
					}
				}
				if (webpage.startsWith("$")) {
					String error = webpage.substring(7);
					System.out.println(error);
					System.out.println("");
			}else {
				System.out.println("");	
				System.out.println("");
				System.out.println("Number of links found: " + count);	
				System.out.println("");
				}
			 a = 1;
			}
			
			
			
			else if (number.equals("3")){
				System.out.println("Searching" + initialLineString);
				System.out.println("Searching for: hypertext");
				System.out.println("");
				int start,finish;
				start=1;
				finish=1;
				while (start != 0 && finish !=-1){
					String hyper;
					finish = webpage.indexOf("href",start);
					start = webpage.indexOf('"',finish)+ 1;
						if (start !=-1 && finish != -1){
							finish = webpage.indexOf("\"",start);
							hyper = webpage.substring(start ,finish);
							if (hyper.toLowerCase().endsWith(".htm") || hyper.toLowerCase().endsWith(".html")){
							System.out.println(hyper);
							count++;
							}
						}
					}		
			if (webpage.startsWith("$")) {
					String error = webpage.substring(7);
					System.out.println(error);
					System.out.println("");
			}else {
				System.out.println("");	
				System.out.println("");
				System.out.println("Number of links found: " + count);	
				System.out.println("");
				}
			 a = 1;
			}
			else if (number.equals("2")){
					System.out.println("Searching" + initialLineString);
					System.out.println("Searching for: documents");
					System.out.println("");
					int start,finish;
					start=1;
					finish=1;
					while (start != 0 && finish !=-1){
						String docs ;
						finish = webpage.indexOf("href",start);
						start = webpage.indexOf('"',finish)+ 1;
							if (start !=-1 && finish != -1){
								finish = webpage.indexOf("\"",start);
								docs = webpage.substring(start ,finish);
								if (docs.toLowerCase().endsWith(".pdf") || docs.toLowerCase().endsWith(".txt") || docs.toLowerCase().endsWith(".doc")){
								System.out.println(docs);
								count++;
								}
							}
						}		
				if (webpage.startsWith("$")) {
						String error = webpage.substring(7);
						System.out.println(error);
						System.out.println("");
				}else {
					System.out.println("");	
					System.out.println("");
					System.out.println("Number of links found: " + count);	
					System.out.println("");
					}
				 a = 1;
				}
				
				else if (number.equals("1")){
					System.out.println("Searching" + initialLineString);
					System.out.println("Searching for: images");
					System.out.println("");
					
					
					int start,finish;
					start=1;
					finish=1;
					while (start != 0 && finish !=-1){
						String pic;
						finish = webpage.indexOf("href",start);
						start = webpage.indexOf("\"",finish)+ 1;
							if (start !=-1 && finish != -1){
								finish = webpage.indexOf("\"",start);
								pic = webpage.substring(start ,finish);
								if (pic.toLowerCase().endsWith(".jpg") || pic.toLowerCase().endsWith(".png") || pic.toLowerCase().endsWith(".bmp") || pic.toLowerCase().endsWith(".gif")){
								System.out.println(pic);
								count++;
								}
							}
						}		
				if (webpage.startsWith("$")) {
						String error = webpage.substring(7);
						System.out.println(error);
						System.out.println("");
				}else {
					System.out.println("");
					System.out.println("");
					System.out.println("Number of links found: " + count);		
					System.out.println("");
					}
				 a = 1;
				}
		}while (a == 1);
		//http://slamarc.people.clemson.edu/cpsc1060/files/test1.html
		
			
	}

}
