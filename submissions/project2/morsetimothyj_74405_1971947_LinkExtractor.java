/*
* LinkExtractor.java
* Author: Timothy Morse
* Submission Date: 7 October 2017
*
* Purpose: The program intakes a string. If the string starts with q or Q,
* the program quits. Otherwise, if the string is a valid URL, it fetches the HTML code
* and parses it based on further user input. If the string is not a valid URL, it passes on to the HTML parsing part,
* but will return an error. As for the parsing of the HTML, the user may choose
* to parse images, documents, hyperlinks, or all links in the code. The program then returns
* whichever type is chosen and asks for another input.
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
	//This method just prints or printlns a string based on inputs
	//Its just faster in the long run than System.out.print/println
	public static void pntr(String s, int i){
		if(i == 0){
			System.out.println(s);
		}else if(i==1){
			System.out.print(s);
		}else if(i==2){
			System.err.println(s);
		}else{
			System.out.print("Eh?");
		}
	}
	//This method just checks if the input string is a valid URL
	//by checking if the first four characters are 'h','t','t',and 'p'
	//although not actually characters
	//They're substrings
	public static boolean iIAVURL(String s){
		boolean toReturn = false;
		if(s.length()>4){
			s = s.substring(0,4);
		}else{toReturn = false;}
		if(s.equalsIgnoreCase("http")){
			toReturn = true;
		}else{
			toReturn = false;
		}
		return toReturn;
	}
	//This function just trawls the code.
	public static String trawler(String s, String URL, int i)
	{
		String toReturn = "";
		if(s.charAt(0)=='$'){
			toReturn = "Searching "+URL+"\nSearching for: ";
			if(i == 1){
				toReturn = toReturn + "images";
			}else if(i == 2){
				toReturn = toReturn + "documents";
			}else if(i == 3){
				toReturn = toReturn + "hyperlinks";
			}else if(i == 4){
				toReturn = toReturn + "all links";
			}
			toReturn = toReturn + "\n\n"+s.substring(7)+"\n";
		}else{
			boolean payAttention = false;
			int timesPaidAttention = 0;
			int imageTimes = 0;
			int docsTimes = 0;
			int hyperTimes = 0;
			int startIndex = 0;
			String images = "\nSearching "+URL+"\nSearching for: images\n\n";
			String documents = "\nSearching "+URL+"\nSearching for: documents\n\n";
			String hypertexts = "\nSearching "+URL+"\nSearching for: hyperlinks\n\n";
			String all = "\nSearching "+URL+"\nSearching for: all links\n\n";
				for(int j = 0; j<s.length();j++){
					if(j+12<=s.length()){
						if(s.substring(j,j+12).equalsIgnoreCase("a href=\"http")){
							payAttention = true;
							startIndex = j+8;
							if(j+8<=s.length()){
								j+=8;
							}else{
								j=j;
							}
							timesPaidAttention++;
						}else if(payAttention==true&&s.charAt(j)=='\"'){
							all = all+timesPaidAttention+". "+s.substring(startIndex,j)+"\n";
							if(s.substring(j-4,j).equalsIgnoreCase(".PNG")||s.substring(j-4,j).equalsIgnoreCase(".JPG")||s.substring(j-4,j).equalsIgnoreCase(".BMP")||s.substring(j-4,j).equalsIgnoreCase(".GIF")){
								imageTimes++;
								images = images+imageTimes+". "+s.substring(startIndex,j)+"\n";
							}else if(s.substring(j-4,j).equalsIgnoreCase(".DOC")||s.substring(j-4,j).equalsIgnoreCase(".TXT")||s.substring(j-4,j).equalsIgnoreCase(".PDF")){
								docsTimes++;
								documents=documents+docsTimes+". "+s.substring(startIndex,j)+"\n";
							}else if(s.substring(j-4,j).equalsIgnoreCase(".HTM")||s.substring(j-4,j).equalsIgnoreCase("HTML")){
								hyperTimes++;
								hypertexts=hypertexts+hyperTimes+". "+s.substring(startIndex,j)+"\n";
							}
							payAttention = false;
						}
					}
					
				}
			if(i==1){
				toReturn = images+"\nNumber of Links Found: "+imageTimes+"\n";
			}else if(i == 2){
				toReturn  = documents+"\nNumber of Links Found: "+docsTimes+"\n";
			}else if(i == 3){
				toReturn = hypertexts+"\nNumber of Links Found: "+hyperTimes+"\n";
			}else if(i == 4){
				toReturn = all+"\nNumber of Links Found: "+timesPaidAttention+"\n";
			}else{
				toReturn = "Eh?";
			}
		}
		return toReturn;
	}
	
	public static void main(String[] args) {
		boolean keepRunning = true;
		Fetch fetch = new Fetch();
		Scanner scan = new Scanner(System.in);
		while(keepRunning == true){
			String URLinput = "";
			pntr("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit:\n>> ",1);
			URLinput = scan.next();
			String firstChar = URLinput.substring(0, 1);
			if(firstChar.equalsIgnoreCase("q")){
				pntr("Goodbye!",1);
				keepRunning = false;
			}else if(iIAVURL(URLinput)){
				String webpage = fetch.fetchURL(URLinput);
					pntr("\nEnter the type of link to look for (1-5):\n\n1. Images (PNG, JPG, BMP, GIF)\n2. Documents (DOC, TXT, PDF)\n3. Hypertext (HTM, HTML)\n4. All Links\n5. Quit\n>>",1);
					int toSearch = scan.nextInt();
					boolean keepRunningThisLoop = true;
					while(keepRunningThisLoop){
						if(toSearch==5){
							pntr("Goodbye!",0);
							keepRunning = false;
							keepRunningThisLoop = false;
						}else if(toSearch>5){
							pntr("Invalid choice. Please try again.",0);
						}else{
							pntr(trawler(webpage,URLinput,toSearch),0);
							keepRunningThisLoop = false;
						}
					}
				
			}else{
				pntr("\nInput was unrecognized",0);
			}
		}

	}

}
