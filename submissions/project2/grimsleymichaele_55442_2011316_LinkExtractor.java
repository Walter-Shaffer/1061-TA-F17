/*
* LinkExtractor.java
* Author: Michael Grimsley
* Submission Date: 10/13/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
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

	public static void main(String args[]){
	
	Scanner Keyboard = new Scanner(System.in);
	//sating  some variables
	int check = 1;
	
	String [] links = new String[20];
	//Largest while loop
	while (check == 1){
	int count = 0;
	System.out.println("enter a url or type Q to quit...");
	String url = Keyboard.next();
	url = url.toLowerCase();
	int http = url.indexOf("https");
	int https = url.indexOf("http");
	int q = url.indexOf("q");
	
	if (http == 0 || https == 0){
	check = 2;
	//While loop for second input
	while (check == 2){
	System.out.println("Enter a number 1-5");
	System.out.println("\n1. Images (PNG, JPG, BMP, GIF");
	System.out.println("2. Documents (DOC, TXT, PDF");
	System.out.println("3. Hypertext (HTM, HTML)");
	System.out.println("4. All Links");
	System.out.println("5. Quit");
	int choice = Keyboard.nextInt();
	String webpage = Fetch.fetchURL(url);
	webpage = webpage.toUpperCase();
	//splitting the html code string into a string array 
	// with an index for each line so it can be parsed
	String split[] = webpage.split("[\\r\\n]+");
	//checking for input errors
	if (webpage.indexOf("$error$") != -1){
		check = 1;
		System.out.print(webpage);
		
		}else if (choice < 1 || choice > 4){
		check = 2;
		}else if (choice == 5){
			check = 10;
			System.out.println("Goodbey!");
		//if no errors we continue
		}else{
			//parseing the code with for loops and putting it accepted cases into a string array to be printed later
			if (choice == 1){
				 String[] type = {"PNG", "JPG", "BMP", "GIF"};  
			for (int i = 0; i < split.length; i++){
				for (int k = 0; k < type.length; k++){
					if (split[i].indexOf("HREF") != -1 && split[i].indexOf(type[k]) != -1){
						int start = split[i].indexOf("HREF")+6;
						int finish = split[i].indexOf(type[k])+type[k].length();
						links[count] = split[i].substring(start, finish);
						count++;
						check = 1;
						
			}
			}
			}
			
			}else if (choice == 2){
				String[] type = {"DOC", "TXT", "PDF"};
				for (int i = 0; i < split.length; i++){
					for (int k = 0; k < type.length; k++){
						if (split[i].indexOf("HREF") != -1 && split[i].indexOf(type[k]) != -1){
							int start = split[i].indexOf("HREF")+6;
							int finish = split[i].indexOf(type[k])+type[k].length();
							links[count] = split[i].substring(start, finish);
							count++;
							check = 1;
							System.out.println(start);
			}
			}
			}	
			
			}else if (choice == 3){
					String[] type = {"HTM", "HTML"};
					for (int i = 0; i < split.length; i++){
						for (int k = 0; k < type.length; k++){
							if (split[i].indexOf("HREF") != -1 && split[i].indexOf(type[k]) != -1){
								int start = split[i].indexOf("HREF")+6;
								int finish = split[i].indexOf(type[k])+type[k].length();
								links[count] = split[i].substring(start, finish);
								count++;
								check = 1;
			}
			}
			}		
			
			}else{
						String[] type = {"PNG", "JPG", "BMP", "GIF", "DOC", "TXT", "PDF", "HTM", "HTML"};
						for (int i = 0; i < split.length; i++){
							for (int k = 0; k < type.length; k++){
								if (split[i].indexOf("HREF") != -1 && split[i].indexOf(type[k]) != -1){
									int start = split[i].indexOf("HREF")+6;
									int finish = split[i].indexOf(type[k])+type[k].length();
									links[count] = split[i].substring(start, finish);
									count++;
									check = 1;
			}
			}
			}
		}
	}	
	}
	}
	//Exit output statements if the user quits
	else if (q == 0){
	System.out.println("Goodbey!");
	check = 10;
	
	}else{
	System.out.println("invald entry try again");		;
	}
	System.out.print("\nfinal link count:" +count+ "\n");
	
	//looping output statements
	for (int j = 0; j < count; j++){
		System.out.println(links[j]);

		// final braces yay!
}	
}
	//terminate that scanner
	Keyboard.close();
}
}

