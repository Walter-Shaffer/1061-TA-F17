/*
* LinkExtractor.java
* Author: Mark Blasko
* Submission Date: 10/13/17
* Purpose: The purpose of this program is to extract/parse html links and place them in specific categories.
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

      String entryURL = "";
      String webpage = "";
      String rawURL = "";
      String errorMessage = "";
      int linkNumber = 0;
      int loop = 1; //used for outer for loop


    //  System.out.print("Enter a URL to read from (include \"http://\" or \"https://\"), or type Q to quit: >>"); //Check quotations in String later
    //  entryURL = keyboard.next(); alternate for extra whiie is to add this into nested do statement and add webpage.conatins()
while (loop == 1) {
    do {
      System.out.println("Enter a URL to read from (include \"http://\" or \"https://\"), or type Q to quit:"); //Check quotations in String later
      System.out.print(">> ");
      entryURL = keyboard.next();

      do {
        //entryURL = keyboard.next(); //alternate for extra whiie is to add this into nested do statement and add webpage.conatins()


        if (entryURL.startsWith("http://") || entryURL.startsWith("https://")) { //use substring
        }

        else if (entryURL.startsWith("Q") || entryURL.startsWith("q")) {
          System.out.println("Goodbye!");
          System.exit(0);
        }

        else {
          System.out.println();
          System.out.println("Input was unrecognized"); //check reason for repeat later
          System.out.println("Enter a URL to read from (include \"http://\" or \"https://\"), or type Q to quit:"); //Check quotations in String later
          System.out.print(">> ");
          entryURL = keyboard.next();
                }
            } //End of do

      while (!entryURL.startsWith("http://") && !entryURL.startsWith("https://")); //end of do-while

      String strURL = entryURL;
      webpage = Fetch.fetchURL(strURL);
      errorMessage = webpage.substring(7, webpage.length());

    do {
      System.out.println();
      System.out.println("Enter the type of link to look for (1-5):");
      System.out.println();
      System.out.println("1. Images (PNG, JPG, BMP, GIF)");
      System.out.println("2. Documents (DOC, TXT, PDF)");
      System.out.println("3. Hypertext (HTM, HTML)");
      System.out.println("4. All links");
      System.out.println("5. Quit");
      System.out.print(">> ");

      linkNumber = keyboard.nextInt();

    if (linkNumber == 5) {
      System.out.println("Goodbye!");
      System.exit(0);
    }
  }
  while (linkNumber >= 5 || linkNumber < 1);

  if (webpage.startsWith("$error$")) {
    if (linkNumber == 4) {
      System.out.println();
      System.out.println("Searching " + entryURL);
      System.out.println("Searching for: all links");
      System.out.println();
      System.out.println(errorMessage);
      System.out.println();
    }
    if (!webpage.startsWith("$error$") && linkNumber != 4)  {
      System.out.println("Searching " + entryURL);
      System.out.println();
      System.out.println(errorMessage);
    }
  }
  else {
    System.out.println();
    System.out.println("Searching " + entryURL);
      if (linkNumber == 1) {
        System.out.println("Searching for: images");
        System.out.println();
      }
      else if (linkNumber == 2) {
        System.out.println("Searching for: documents");
        System.out.println();
      }
      else if (linkNumber == 3) {
        System.out.println("Searching for: hypertext");
        System.out.println();
      }
      else if (linkNumber == 4) {
        System.out.println("Searching for: all links");
        System.out.println();
      }
  }

  } //end of first do while

    while (webpage.startsWith("$error$"));

//initialize int variables equal to 0 (beginning and end)
//set while loop argument as int variables not equal to -1
//beginning and end equal to indexOf href="
//finish equal to index of \" (special character quote)
  int start = 0;
  int end = 0;
  String caseSensitive = "";
  int linkCount = 0;

        start = webpage.indexOf("href=\"") + 6;
        end = webpage.indexOf("\"", start);

      do {

        start = webpage.indexOf("href=\"") + 6;
        end = webpage.indexOf("\"", start);


      if ((linkNumber == 1) && (caseSensitive.endsWith("png") || caseSensitive.endsWith("jpg") || caseSensitive.endsWith("bmp") || caseSensitive.endsWith("gif"))) {
        linkCount++;
        if (linkCount >= 1) { //used to prevent zero from being printed
        System.out.println(linkCount + ". " + rawURL);
      }
        }

      else if ((linkNumber == 2) && (caseSensitive.endsWith("doc") || caseSensitive.endsWith("txt") || caseSensitive.endsWith("pdf"))) {
        linkCount++;
        if (linkCount >= 1) { //used to prevent zero from being printed
        System.out.println(linkCount + ". " + rawURL);
      }
      }

      else if ((linkNumber == 3) && (caseSensitive.endsWith("htm") || caseSensitive.endsWith("html"))) {
        linkCount++;
        if (linkCount >= 1) { //used to prevent zero from being printed
        System.out.println(linkCount + ". " + rawURL); //check tab
      }
      }

      else if (linkNumber == 4) {
       linkCount++;
       if (linkCount > 1) { //used to prevent zero from being printed
       System.out.println(linkCount - 1 + ". " + rawURL);
     }
      }
      if (start != -1 && end != -1) {
           rawURL = webpage.substring(start, end);
           webpage = webpage.substring(end + 1);
           caseSensitive = rawURL.toLowerCase();
         }
  }
  while ((start != -1) && (end != -1));
       System.out.println();
       int realLinkCount = linkCount;
       if (linkNumber == 4) {
         realLinkCount = linkCount - 1;
       }
       System.out.println("Number of Links Found: " + realLinkCount);
       System.out.println();


} //end of first while


} //end of main

}//end of class
