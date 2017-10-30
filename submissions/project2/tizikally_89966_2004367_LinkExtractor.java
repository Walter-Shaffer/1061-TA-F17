/* LinkExractor.Java
* Author: Allison Tizik
* Submission Date: 10/12/17
* Purpose: The program takes submitted URL and decides if
* it is valid or not. If it is valid it parses through depending
* on the number entered which depends on the links it extracts.
* The program parses through the URL links for specific
* hyperlinks on the page. It then prints those links and 
* the number of links found.
* 
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



import java.util.ArrayList;
import java.util.Scanner;
public class LinkExtractor {
	
public static void main(String[] args) {
                                 // TODO Auto-generated method stub
                    
	System.out.print("Enter a URL or Enter Q to quit:\n>> ");
                      
	Scanner keyboard = new Scanner (System.in);
	String strURL = keyboard.next();
	double type ; // used for getting what type of link to look for
	String temp=""; //temporary webpage
                      String webpage = Fetch.fetchURL(strURL);
                      
                     //Starting string 
                      String ahref = "<a href=\"";
                      
                      //array that allows for specified links to be stored
                      ArrayList<String> link = new ArrayList<String>();
                      
                    //exits program if any thing is entered starting with Q
                      if (strURL.startsWith(("Q")) || strURL.startsWith("q")){ 
                                 System.out.println("Goodbye");
                                 System.exit(0);
                      }else if (strURL.startsWith("http://")|(strURL.startsWith("https://"))){
                                 System.out.println("\nEnter the type of link to look for (1-5)\n1. Images (PNG, JPG, BMP, GIF)\n2. Documents (DOC, TXT, PDF)\n3. Hypertext (HTM, HTML)\n4. All Links\n5. Quit");
                                 Scanner input = new Scanner (System.in);
                                 System.out.print(">> ");
                                 type = input.nextDouble();
                                
                                 //goes through the steps for parsing image hyperlinks
                                 if (type==1){
                                	 System.out.print("\nSearching " + strURL + "\nSearching for: images\n\n");
                                 	for (int i = 0; i < webpage.length()-ahref.length()-1; i++){ // checks for lines that start with >a href=
                                 		temp = "";
                                		if (webpage.substring(i, i+ ahref.length()).equals(ahref)){
                                			for (int j=i+ahref.length();j< webpage.length()-ahref.length() && !webpage.substring(j, j+1).equals("\""); j++){
                                				temp += webpage.substring(j, j+1);	// creates string of link from ex. http - .doc
                                		}
                                			link.add(temp); // stores in array
                                	 }

                                	}
                                 	int count = 0; // creates count
                                 	for (int i = 0; i < link.size(); i++){
                                 		
                                 		if(link.get(i).endsWith(".jpg")||(link.get(i).endsWith(".png"))|| (link.get(i).endsWith(".bmp"))|| (link.get(i).endsWith(".gif"))){ // checks links for correct files/endings
                                 			System.out.println(++count + " . " + link.get(i)); // prints links found that match endings
                                 	
                                 		}
                                 	
                                 	}
                            		System.out.println("\nNumber of Links Found:"+(count)); // prints number of links
                                   
                            		// if error message is received it makes 
                                 }else if (webpage.startsWith("$error$")){
                                    	System.out.println(webpage.substring(7));
                                    	 main(new String[0]);
                                    	 
                                    	 // finding documents   	 
                                 }else if (type==2){
                                	 System.out.print("\nSearching " + strURL + "\nSearching for: documents\n\n");
                                	 for (int i = 0; i < webpage.length()-ahref.length()-1; i++){
                                  		temp = "";
                                 		if (webpage.substring(i, i+ ahref.length()).equals(ahref)){
                                 			for (int j=i+ahref.length();j< webpage.length()-ahref.length() && !webpage.substring(j, j+1).equals("\""); j++){
                                 				temp += webpage.substring(j, j+1);	
                                 		}
                                 			link.add(temp); 
                                 	 }

                                 	}
                                  	int count = 0;
                                  	for (int i = 0; i < link.size(); i++){
                                  		
                                  		if(link.get(i).endsWith(".doc")||(link.get(i).endsWith(".txt"))|| (link.get(i).endsWith(".pdf"))){
                                  			System.out.println(++count + " . " + link.get(i));
                                  	
                                  		}
                                  	
                                  	}
                             		System.out.println("\nNumber of Links Found:"+(count));
                                      }else if (webpage.startsWith("$error$")){
                                     	System.out.println(webpage.substring(7));
                                     	 main(new String[0]);
                                     	 
                                 }else if (type==3){
                                	 System.out.print("\nSearching " + strURL + "\nSearching for: hypertext\n\n");
                                	 for (int i = 0; i < webpage.length()-ahref.length()-1; i++){
                                  		temp = "";
                                 		if (webpage.substring(i, i+ ahref.length()).equals(ahref)){
                                 			for (int j=i+ahref.length();j< webpage.length()-ahref.length() && !webpage.substring(j, j+1).equals("\""); j++){
                                 				temp += webpage.substring(j, j+1);	
                                 		}
                                 			link.add(temp); 
                                 	 }

                                 	}
                                  	int count = 0;
                                  	for (int i = 0; i < link.size(); i++){
                                  		
                                  		if(link.get(i).endsWith(".htm")||(link.get(i).endsWith(".html"))){
                                  			System.out.println(++count + " . " + link.get(i));
                                  	
                                  		}
                                  	
                                  	}
                             		System.out.println("\nNumber of Links Found:"+(count));
                                      }else if (webpage.startsWith("$error$")){
                                     	System.out.println(webpage.substring(7));
                                     	 main(new String[0]);
                                     	 
                                 }else if (type==4){
                                 System.out.print("\nSearching " + strURL + "\nSearching for: all links\n");
                                 int count = 1;
                                 for (int i = 0; i < webpage.length()-ahref.length()-1; i++){
                                		if (webpage.substring(i, i+ ahref.length()).equals(ahref)){
                                			temp+=count + ". ";
                                			for (int j=i+ahref.length();j< webpage.length()-ahref.length() && !webpage.substring(j, j+1).equals("\""); j++){
                                				temp += webpage.substring(j, j+1);	
                                		}
                                			temp += "\n";
                                			count++;
                                	 }

                                	}
                            		System.out.print("\n"+temp);
                            		System.out.print("\nNumber of Links Found:"+(count-1));
                                     }else if (webpage.startsWith("$error$")){
                                    	System.out.println(webpage.substring(7));
                                    	 main(new String[0]);
                                    	
                                 }else if (type==5){
                                	 System.out.println("Goodbye!");
                                	 System.exit(0);

                                }else{
                                    main(new String[0]);
                                }
                      }else {
                                 System.out.println("Invalid URL Entered\n");
                                 main(new String[0]);
                      }
                      }

}

