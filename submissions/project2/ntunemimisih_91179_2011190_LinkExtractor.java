
import java.util.Scanner;// dont forget to add else statement for invalid input in the end

public final class LinkExtractor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String url; 
		int s = 0;
		//  enter the url or quit
		while (s >= 0){ 
		System.out.println("Enter a URL to read from (include the 'http://' or 'https://'), or type Q to quit:");
		System.out.print(">>");
         	url = input.next();
         // if q then quit if https then its correct if none then unknown
         if (url.toLowerCase().startsWith("q")){// ignore case
        	 System.out.print("Goodbye!");
         System.exit(0);// terminate program if quit
         
         // make sure it is valid url
         } else if (url.substring(0,7) == "http://" || url.substring(0,8) == "https//" ); {
        	 // give options on link to search for
             System.out.println("Enter the type of link to look for (1-5)"); 
             System.out.println("1. Images ( PNG, JPG, BMP, GIF)");
             System.out.println("2. Documents (DOC, TXT, PDF)");
             System.out.println("3. Hypertext (HTM, HTML)");
             System.out.println("4. All links");
             System.out.println("5. Quit");
             System.out.print(">>");
             int option = input.nextInt();
             
             // what to do for each integer entered 
            
             if (option == 1){
             System.out.println("Searching " + url);	// what is printed after they choose option
             System.out.println("Searching for: Images");         
            // Retrieve a web page and return its contents as a string.
             String webpage = Fetch.fetchURL(url);
                 System.out.print(webpage);

            
             }else if  (option == 2){
             	 System.out.println("Searching " + url);	
                  System.out.println("Searching for: Documents");  
                  String webpage = Fetch.fetchURL(url);
                  System.out.print(webpage);
                  
             }else if (option == 3){
             	 System.out.println("Searching " + url);	
                  System.out.println("Searching for: Hypertext");
                  String webpage = Fetch.fetchURL(url);
                  System.out.print(webpage);
                  
             }else if(option == 4){
             	 System.out.println("Searching " + url);	
                  System.out.println("Searching for: All links");
                  String webpage = Fetch.fetchURL(url);
                  System.out.print(webpage);
                  
             }else if(option == 5){
             	System.out.print("Goodbye!");
             	System.exit(0);
             	
             } else {
             	System.out.print("Input not recognized.\n");
             }
         }
        	 
         }
}
}