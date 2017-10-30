import java.util.Scanner;

/*
* CPSC-1060.java

* Author: Trip Bastian
* Submission Date: October 13, 2017
*
* Purpose: To utilize the Fetch class given to us to retrieve and sift
* 			through links of different purposes. File types include images, 
* 			word documents, hypertexts, and links.
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
	public static void main(String[] args) {
		Scanner userIn =  new Scanner(System.in);
		while(42 == 42){
			boolean didAThing = false;
			int linkNumber = 0;
			//Output
			System.out.println("Please enter a URL, or enter 'Q' to quit.");
			System.out.print(">>");
			String URL = userIn.next();
			//The 'Q' test
			if (URL.indexOf("q")==0 || URL.indexOf("Q")==0){
				System.out.println("Goodbye!");
				System.exit(0);
			}
			//Examining the URL
			if (URL.length() > 6){
				//This was to avoid the error in case the given string was too short to be checked by the following if statement.
				String URLtest = URL.substring(0,5);
				if (URLtest.equals("http:")||URLtest.equals("https")){
					didAThing = true;
					String webPage = Fetch.fetchURL(URL);
					System.out.println("What kind of link would you like?");
					System.out.println("1. Images");
					System.out.println("2. Documents");
					System.out.println("3. Hypertext");
					System.out.println("4. All Links");
					System.out.println("5. Quit");
					System.out.print(">>");
					int choice = userIn.nextInt();
					if(webPage.indexOf("$error$")>-1){
						System.out.println(webPage.substring(7,webPage.length()));
					}
					while (webPage.indexOf("<a href=\"http") > 0){
						int fromHere = webPage.indexOf("<a href=\"http")+9;
						int toHere = webPage.indexOf("</a>");
						String linkTest = webPage.substring(fromHere, toHere);
						String linkActual = linkTest.substring(0, linkTest.indexOf("\">"));
						String extension = linkActual.substring(linkActual.length()-3, linkActual.length());
						if (choice == 1){
							if (extension.equalsIgnoreCase("png")||extension.equalsIgnoreCase("jpg")||extension.equalsIgnoreCase("gif")||extension.equalsIgnoreCase("bmp")){
								linkNumber++;
								System.out.println(linkNumber + ". " + linkActual);
								webPage = webPage.substring(toHere+4,webPage.length());
							}
						}
						else if (choice == 2){
							if (extension.equalsIgnoreCase("doc")||extension.equalsIgnoreCase("txt")||extension.equalsIgnoreCase("pdf")){
								linkNumber++;
								System.out.println(linkNumber + ". " + linkActual);
								webPage = webPage.substring(toHere+4,webPage.length());
							}
						}
						else if (choice == 3){
							if (extension.equalsIgnoreCase("htm")||extension.equalsIgnoreCase("html")){
								linkNumber++;
								System.out.println(linkNumber + ". " + linkActual);
								webPage = webPage.substring(toHere+4,webPage.length());
							}
						}
						else if (choice == 4){
							linkNumber++;
							System.out.println(linkNumber + ". " + linkActual);
							webPage = webPage.substring(toHere+4,webPage.length());
						}
						else if (choice == 5){
							System.out.println("Goodbye!");
							System.exit(0);
						}
						else{
							System.out.println("Invalid Number");
						}
					}
					System.out.println("Links found = " + linkNumber);
				}
			}
			if (didAThing == false) {
				System.out.println("Unrecognized input.");
			}
		}
	}
}