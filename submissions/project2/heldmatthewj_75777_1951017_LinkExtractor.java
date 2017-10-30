/*
* LinkExtractor.java
* Author: Matthew Held
* Submission Date: 10-3-17
*
* Purpose:
* The purpose of this program is to find and display the appropriate
* links requested, given from a link inputted by the user.
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
*
*/
 
import java.util.Scanner;
 
public class LinkExtractor {
 
       public static void main(String[] args) {
             
              //Create Scanner Object
              Scanner keyboard = new Scanner(System.in);
             
              //Declare Variables
              boolean hasUserQuit = false;
             
              //Main Loop
              while (hasUserQuit == false) {
                   
                    //Declare Variables
                    String userInputURL;
                    String httpCheck = "";
                    String httpsCheck = "";
                   
                    //Print Prompt To User
                    System.out.println("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit:");
                    System.out.print(">> ");
                   
                    //Obtain User Input & Get Rid Of White Space On Ends
                    userInputURL = keyboard.nextLine();
                    userInputURL = userInputURL.trim();
                   
                    //Fix Problem Where User Enters Nothing
                    if (userInputURL.isEmpty()) {
                           userInputURL = " ";
                    }
                   
                    //Used To Check For Valid Input
                    if (userInputURL.length() >= 7) {
                           httpCheck = userInputURL.substring(0, 7);
                    }
                    if (userInputURL.length() >= 8) {
                           httpsCheck = userInputURL.substring(0, 8);
                    }
                   
                    //Decide What To Do Based On User Input
                    if (userInputURL.charAt(0) == 'Q' || userInputURL.charAt(0) == 'q') {
                          
                           //Print Message To Console & Terminate Program
                           System.out.println("Goodbye!");
                           System.exit(0);
                          
                    } else if (httpCheck.equals("http://") || httpsCheck.equals("https://")) {
                          
                           boolean choseValidOption = false;
                          
                           while (choseValidOption == false) {
                                 
                                  //Declare Variables
                                  boolean noError = true;
                                  String userInputSearch;
                                 
                                  //Print Options To User
                                  System.out.println();
                                  System.out.println("Enter the type of link to look for (1-5):");
                                  System.out.println();
                                  System.out.println("1. Images (PNG, JPG, BMP, GIF)");
                                  System.out.println("2. Documents (DOC, TXT, PDF)");
                                  System.out.println("3. Hypertext (HTM, HTML)");
                                  System.out.println("4. All Links");
                                  System.out.println("5. Quit");
                                  System.out.print(">> ");
                                 
                                  //Obtain User Input & Get Rid Of White Space On Ends
                                  userInputSearch = keyboard.nextLine();
                                  userInputSearch = userInputSearch.trim();
                                 
                                  //Check For Input Of 5
                                  if (userInputSearch.equals("5")) {
                                        
                                         //Print Message To Console & Terminate Program
                                         System.out.println("Goodbye!");
                                         System.exit(0);
                                        
                                  }
                                 
                                  //Retrieve Page Contents
                                  String webpageCode = Fetch.fetchURL(userInputURL);
                                 
                                  //Check For Input Of 1, 2, 3, Or 4
                                  if (userInputSearch.equals("1") || userInputSearch.equals("2") || userInputSearch.equals("3") || userInputSearch.equals("4")) {
                                        
                                         //Print To Console Events Taking Place
                                         System.out.println();
                                         System.out.println("Searching " + userInputURL);
                                         if (userInputSearch.equals("1")) {
                                                System.out.println("Searching for: images");
                                         } else if (userInputSearch.equals("2")) {
                                                System.out.println("Searching for: documents");
                                         } else if (userInputSearch.equals("3")) {
                                                System.out.println("Searching for: hypertext");
                                         } else if (userInputSearch.equals("4")) {
                                                System.out.println("Searching for: all links");
                                         }
                                         System.out.println();
                                        
                                         //Check For Error
                                         String errorCheck = (webpageCode).substring(0, 7);
                                         if (errorCheck.equals("$error$")) {
                                              
                                               //Update Value Of choseValidOption & noError
                                               choseValidOption = true;
                                               noError = false;
                                              
                                               //Print Error To Console
                                                System.out.println(webpageCode.substring(7));
                                               System.out.println();
                                              
                                         }
                                        
                                         if (noError == true) {
                                              
                                               //Declare Variables
                                               int linkCount = 0, startAllLinks = -1, finishAllLinks = -1;
                                               String currentLink;
                                              
                                               //Update Value Of choseValidOption
                                               choseValidOption = true;
                                              
                                               while (startAllLinks != 0 && finishAllLinks != 0) {
                                                     
                                                      //Find Links
                                                      startAllLinks = webpageCode.indexOf("<a href=\"", startAllLinks) + 9;
                                                      finishAllLinks = webpageCode.indexOf("</a>", finishAllLinks);
                                                     
                                                      //Check For A Link
                                                      if (startAllLinks != -1 && finishAllLinks != -1) {
                                                            
                                                             //Refine Link String
                                                             currentLink = webpageCode.substring(startAllLinks, finishAllLinks);
                                                             int finishRefinedLink = currentLink.indexOf("\"");
                                                             
                                                             currentLink = currentLink.substring(0, finishRefinedLink);
                                                            
                                                             //Decide What To Display
                                                             if (userInputSearch.equals("4")) {
                                                                   
                                                                    //Update Value Of linkCount
                                                                    linkCount++;
                                                                   
                                                                    //Display Link To Console
                                                                    System.out.println(linkCount + ". " + currentLink);
                                                                   
                                                             } else if (userInputSearch.equals("3")) {
                                                                   
                                                                    //Check For Appropriate Link
                                                                    if (((currentLink.substring(finishRefinedLink - 3)).equalsIgnoreCase("HTM")) || ((currentLink.substring(finishRefinedLink - 4)).equalsIgnoreCase("HTML"))) {
                                                                         
                                                                           //Update Value Of linkCount
                                                                           linkCount++;
                                                                         
                                                                           //Display Link To Console
                                                                           System.out.println(linkCount + ". " + currentLink);
                                                                         
                                                                    }
                                                                   
                                                             } else if (userInputSearch.equals("2")) {
                                                                   
                                                                    //Check For Appropriate Link
                                                                    if (((currentLink.substring(finishRefinedLink - 3)).equalsIgnoreCase("DOC")) || ((currentLink.substring(finishRefinedLink - 3)).equalsIgnoreCase("TXT")) || ((currentLink.substring(finishRefinedLink - 3)).equalsIgnoreCase("PDF"))) {
                                                                         
                                                                           //Update Value Of linkCount
                                                                           linkCount++;
                                                                         
                                                                           //Display Link To Console
                                                                           System.out.println(linkCount + ". " + currentLink);
                                                                         
                                                                    }
                                                                   
                                                             } else if (userInputSearch.equals("1")) {
                                                                   
                                                                    //Check For Appropriate Link
                                                                    if (((currentLink.substring(finishRefinedLink - 3)).equalsIgnoreCase("PNG")) || ((currentLink.substring(finishRefinedLink - 3)).equalsIgnoreCase("JPG")) || ((currentLink.substring(finishRefinedLink - 3)).equalsIgnoreCase("BMP")) || ((currentLink.substring(finishRefinedLink - 3)).equalsIgnoreCase("GIF"))) {
                                                                         
                                                                           //Update Value Of linkCount
                                                                           linkCount++;
                                                                         
                                                                           //Display Link To Console
                                                                           System.out.println(linkCount + ". " + currentLink);
                                                                         
                                                                    }
                                                                   
                                                             }
                                                            
                                                      }
                                                     
                                                      //Update Value Of startAllLinks & finishAllLinks
                                                      startAllLinks++;
                                                      finishAllLinks++;
                                                     
                                               }
                                              
                                               //Print Number Of Links To Console
                                               System.out.println();
                                                System.out.println("Number of Links Found: " + linkCount);
                                               System.out.println();
                                              
                                         }
                                        
                                  }
                                 
                           }
                          
                    } else {
                          
                           //Print Error To Console
                           System.out.println();
                           System.out.println("Input was unrecognized.");
                          
                    }
                   
              }
             
       }
      
}