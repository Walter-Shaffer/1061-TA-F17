/*
* [LinkExtractor].java
* 
* Author:  [Aneri Desai]
* 
* Submission Date:  [10/13/2017]
* 
* Purpose: In the project we learned how to use nested loops and parsing and extracting. We also learned littile 
* bit about the fetch class and used all the methods from the begging of the class.
* 
* Statement of Academic Honesty:
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied * or modified code from any source other than the course webpage * or the course textbook. I recognize that any unauthorized
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
		
		Scanner keyboard = new Scanner(System.in);
		String URL = "";	
		boolean change = true;	
		int start = 0, finish;	
		int image;	
		int number_count = 0;	
		boolean change1 = true;
		boolean change2 = true;
		boolean change3 = true;
		String line1;
		
		while (change) {
			
		System.out.println("Enter a URL to read from (include the \"http:// \" or \"https:// \"), or type Q to quit:");
		System.out.print(">>");
		URL = keyboard.nextLine();
		String strURL = URL;
		String webpage = Fetch.fetchURL(strURL);
		String url = Fetch.fetchURL(URL);
		change1 = true;
			
			if (!URL.startsWith("http://") && !URL.startsWith("https://") && !URL.equalsIgnoreCase("Q") && !URL.startsWith("Q") && !URL.startsWith("q")) {
			System.out.println("Input was unrecognized");
			
		
			}else if (URL.startsWith("http://") || URL.startsWith("https://")) {
				System.out.println("\nEnter the type of link to look for (1-5)");
				System.out.println("\n1. Images (PNG, JPG, BMP, GIF)");
				System.out.println("2. Documents (DOC, TXT, PDF)");
				System.out.println("3. Hypertext (HTM, HTML)");
				System.out.println("4. All Links");
				System.out.print("5. Quit \n>>");
						
				int number = keyboard.nextInt();
				
						
				while(change1) {					
					if(number==1) {				
						System.out.println("\nSearching" +URL);			
						System.out.println("Searching for:"+ "\timages");			
						change1 = false;			
							
					}else if(number==2) {				
						System.out.println("Searching" +URL);			
						System.out.println("Searching for:"+ "\tdocuments");			
						change1 = false;			
								
									
					}else if(number==3) {				
						System.out.println("Searching" +URL);			
						System.out.println("Searching for:"+ "\thypertext");			
						change1 = false;			
							
					}else if(number==4) {				
						System.out.println("Searching" +URL);			
						System.out.println("Searching for:"+ "\tAll links");			
						change1 = false;			
									
					}else if(number==5) {				
						System.out.println("Goodbye!");			
						change1 = false;
						change=false;			
					}else {				
						System.out.println("Enter a valid number");			
						int number1 = keyboard.nextInt();			
						number = number1;			
						change1 = false;			
					}				
						if(url.startsWith("$error$")) {			
							String error = url.substring(7);		
							System.out.println(error +"\n");		
						}			
									
									
				}if(change3 && number!=5) {
				while(url.contains("href") && number == 1) {				
							
				url = url.substring(url.indexOf("http"));			
				finish = url.indexOf("\"");			
				line1 = url.substring(start,finish);			
					if(line1.endsWith("png") || line1.endsWith("jpg") || line1.endsWith("bmp") || line1.endsWith("gif")) { 
						number_count++;	
						System.out.println(number_count + "." + line1);
						
						}
					url = url.substring(finish);	
					}
					
					
					change3 = false;
				
				while(url.contains("href") && number == 2) {			
						
						url = url.substring(url.indexOf("http"));		
						finish = url.indexOf("\"");		
						String line2 = url.substring(start,finish);		
						if(line2.endsWith("doc") || line2.endsWith("txt") || line2.endsWith("pdf")) {	
							number_count++;	
							System.out.println(number_count + "." + line2);	
							}change2 = false;
						url = url.substring(finish);		
						}		
						
						change3 = false;
				
				while(url.contains("href") && number == 3) {			
							
							url = url.substring(url.indexOf("http"));		
							finish = url.indexOf("\"");		
							String line3 = url.substring(start,finish);		
							if(line3.endsWith("htm") || line3.endsWith("html")){	
								number_count++;	
								System.out.println(number_count + "." + line3);	
								}	
							url = url.substring(finish);		
							}change2 = false;	
								
							change3 = false;
					
				
					
				while(url.contains("href") && number == 4) {			
								
								url = url.substring(url.indexOf("http://"));		
								finish = url.indexOf("\"");		
								String line4 = url.substring(start,finish);		
								if(!url.contains("<html>"))
								{number_count++;	
									System.out.println(number_count + "." + line4);	
								}	url = url.substring(finish);		
							}change2 = false;		
								
							change3 = false;
				if(!url.startsWith("$error$"))
				System.out.println("\nNumber of Links Found: " + number_count);
				
				}
					
			}else if (URL.equalsIgnoreCase("Q") || URL.startsWith("Q") || URL.startsWith("q")) { 
				System.out.println("Goodbye!");
				change= false;
			}
			
			}	
		}
}