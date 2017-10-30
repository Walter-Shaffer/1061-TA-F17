
/* 
 * 
 * LinkExtractor.java 
 * Author:  Paul Orecchia  
 * Submission Date:  10/10/17 
 * 
 * Purpose: The purpose of this project is to extract all the links from the url inputed by the user.
 * 			The links that will be extracted will be specified by the user.
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
		Scanner Keyboard= new Scanner(System.in);
		//initializing variables
		final String loop="a";
		String url="";
		String webpage;
		int start=0;
		int finish=0;
		int end=0;
		String parse="";
		do{			//first loop used to make the program never stop unless told to.
			int totalLink=0;
			do{ 	//second loop used to determine whether the users input is valid
				System.out.println("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit:");
					url=Keyboard.next();
						
					if ((url.startsWith("q"))||(url.startsWith("Q"))){ //statement that allows user to stop program
						System.out.println("Goodbye");
						System.exit(0);;
					}else if ((url.startsWith("http://"))||(url.startsWith("https://"))){	
					}else{
						System.out.println("\nInput was unrecognized");
					}
			}while (!(url.startsWith("http://"))!=(url.startsWith("https://")));
			int link;
			do{		//third loop used to allow the user to choose which links to extract.
				System.out.println("Enter the type of link to look for (1-5):\n");
				System.out.println("1. Images (PNG, JPG, BMP, GIF)\n 2. Documents (DOC, TXT, PDF)\n 3. Hypertext (HTM, HTML)\n 4. All Links\n 5. Quit");
				link=Keyboard.nextInt();
				
				webpage = Fetch.fetchURL(url);
				
				if (link==1){
					System.out.println("\nSearching " + url);
					System.out.println("Searching for: images\n");
				
				}else if (link==2){
					System.out.println("\nSearching " + url);
					System.out.println("Searching for: documents\n");
					
				}else if (link==3){
					System.out.println("\nSearching " + url);
					System.out.println("Searching for: hypertext\n");
					
				}else if (link==4){
					System.out.println("\nSearching " + url);
					System.out.println("Searching for: all links\n");
					
				}else if (link==5){
					System.out.println("Goodbye");
					System.exit(0);
				}else
					System.out.println("Input was unrecognized");
				
			
			}while ((link!=1)&&(link!=2)&&(link!=3)&&(link!=4));
			do{ 	//last loop used to extract the links and sort them to display the correct links depending on what the user inputed.
				start=webpage.indexOf("href");
				finish=webpage.indexOf("</a>");
				
				if (webpage.startsWith("$error$")){
					System.out.println("java.net.UnknownHostException: AnUnknownHost\n");	
				}else if (finish>=0){
					parse=webpage.substring(start+6,finish);
					end=parse.indexOf("\">");
					parse=parse.substring(0,end);
					webpage=webpage.substring(finish+1);					
					if (link==1){ //if statement used to check if the extracted link matches the type chosen by the user.
						if (parse.endsWith(".png")||parse.endsWith(".jpg")||parse.endsWith(".bmp")){
							totalLink++;
							System.out.println(totalLink+". "+parse);
						}else {
						}
					}else if (link==2){
						if (parse.endsWith(".doc")||parse.endsWith(".txt")||parse.endsWith(".pdf")){
							totalLink++;
							System.out.println(totalLink+". "+parse);
						}else {
						}
					
					}else if (link==3){
						if (parse.endsWith(".htm")||parse.endsWith(".html")){
							totalLink++;
							System.out.println(totalLink+". "+parse);
						}else {
						}
					}else {	
						totalLink++;
						System.out.println(totalLink+". "+parse);
					}
				}else{
				}
			}while(finish>=0);
			if (webpage.startsWith("$error$")){
			}else System.out.println("\nNumber of Links Found: "+totalLink+"\n");	
		}while (loop=="a");
	}

}
