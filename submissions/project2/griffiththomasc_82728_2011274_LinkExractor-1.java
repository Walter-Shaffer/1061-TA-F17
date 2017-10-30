/*
* [LinkExtractor].java
* Author:Thomas
* Submission Date: October 12, 2017
*
* Purpose: This project is designed for the user to input a link to a website 
* (that contains either https://or http://)and will allow the user to then choose
*  the documents desired to download giving five numbered options. This will
*  continue until specified by user or a 20 max with the Fetch
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
public class LinkExractor {

	public static void main(String[] args) {
		boolean all = true;


//this is a while loop for if the code should repeat after it is finnished unless "q""Q" are entered
		while (all = true){

		boolean Qu = false;

		boolean first = true;

		boolean Second = false;











		Scanner keyboard = new Scanner(System.in);


//you enter the website liknk here to become a string
		System.out.println("Enter a URL to read from (\"include the http:// or https://\"), or type Q to quit:.");

		System.out.print(">>");





		String Website = keyboard.nextLine();


		do{//this do statement sees if the url you entered is valid withhttps:// or http:// or just asks you to redo it or backs out if you type q



		String beta = Website.substring(0,1);

		if (Website.contains("http://")) {



		first = false;



		Second = true;



		Qu = false;


		}



		else if (Website.contains("https://")) {



		first = false;



		Second = true;



		Qu = false;





		}



		else if (beta.equalsIgnoreCase("q")) {





		System.out.println("GoodBye! ");



		System.exit(0);



		Second = false;



		first = false;





		Qu = true;





		}



		else{



		System.out.println("");

		System.out.println("Input was unrecognized.");





		Second = false;



		Qu = false;



		System.out.println("Enter a URL to read from (\"include the http:// or https://\"), or type Q to quit:.");

		System.out.print(">>");





		Website = keyboard.nextLine();



		}



		}while (first == true);









		if (Qu == false){



		while (Second == true){



		String webpage = Fetch.fetchURL(Website);




//here after you enter a valid url, the options 1-5 are printed to see what documents you are trying to recieve


		System.out.println("");

		System.out.println("Enter the type of link to look for (1-5)");

		System.out.println("");



		System.out.println("1. Images (PNG, JPG, BMP, GIF)");



		System.out.println("2. Documents (DOC, TXT, PDF)");



		System.out.println("3. Hypertext (HTM, HTML)");



		System.out.println("4. All Links");



		System.out.println("5. Quit");






		boolean best = true;



		do{



		Scanner keyboard2 = new Scanner(System.in);

		System.out.print(">>");



		String typeLink = keyboard2.nextLine();



		int number = Integer.parseInt(typeLink);






//if one is entered run through the code and if it has the endings located in url that are asked for by user then they are printed out and numbered


		if (number == 1){




		Second = false;



		best = false;




		int begin = 0;



		int stop = 0;



		int count =0;

		System.out.println("");

		System.out.println("Searching " + Website);

		System.out.println("Searching for: Images");

		System.out.println("");

		 

		

		while (begin!= -1 && stop != -1){






		begin = webpage.indexOf("href=\"");



		stop = webpage.indexOf("\">", begin); 






		if(begin != -1 && stop != -1){





		String link = webpage.substring(begin+6, stop);



		String test = link.substring(link.length()-4, link.length());



		webpage = webpage.substring(stop);





		if (test.equalsIgnoreCase(".png") || test.equalsIgnoreCase(".jpg")|| test.equalsIgnoreCase(".bmp")|| test.equalsIgnoreCase(".gif")){



		count++;



		System.out.println(count + ". " +link);


		}

		}





		}


		System.out.println("");

		System.out.println("Number of Links Found: " + count);

		System.out.println("");



		}



		//index of end " and endpoint four less than that if it contains something



		//if two is entered run through the code and if it has the endings located in url that are asked for by user then they are printed out and numbered

		else if (number == 2){



		Second = false;



		best = false;



		webpage = Fetch.fetchURL(Website);







		int begin = 0;



		int stop = 0;



		int count =0;

		System.out.println("");

		System.out.println("Searching " + Website);

		System.out.println("Searching for: Documents");

		System.out.println("");



		while (begin!= -1 && stop != -1){





		begin = webpage.indexOf("href=\"");



		stop = webpage.indexOf("\">", begin);





		if(begin != -1 && stop != -1){



		String link = webpage.substring(begin+6, stop);



		String test = link.substring(link.length()-4, link.length());



		webpage = webpage.substring(stop);






		if (test.equalsIgnoreCase(".doc") || test.equalsIgnoreCase(".txt")|| test.equalsIgnoreCase(".pdf")){



		count++;

		System.out.println(count + ". " +link);





		}


		}

		}

		System.out.println("");

		System.out.println("Number of Links Found: " + count);

		System.out.println("");



		}


		//if three is entered run through the code and if it has the endings located in url that are asked for by user then they are printed out and numbered
		else if (number == 3){



		Second = false;



		best = false;



		webpage = Fetch.fetchURL(Website);

		int begin = 0;



		int stop = 0;



		int count = 0;

		System.out.println("");

		System.out.println("Searching " + Website);

		System.out.println("Searching for: hypertext");

		System.out.println("");



		while (begin!= -1 && stop != -1){





		begin = webpage.indexOf("href=\"");



		stop = webpage.indexOf("\">", begin);





		if(begin != -1 && stop != -1){



		String link = webpage.substring(begin+6, stop);



		String test = link.substring(link.length()-5, link.length());



		webpage = webpage.substring(stop);





		if (test.equalsIgnoreCase(".htm") || test.equalsIgnoreCase(".html")){



		count++;

		System.out.println(count + ". " +link);






		}



		}

		}



		System.out.println("");

		System.out.println("Number of Links Found: " + count);

		System.out.println("");



		}


		//if four is entered run through the code and if it has the endings located in url that are asked for by user then they are printed out and numbered
		else if (number == 4){



		Second = false;



		best = false;



		webpage = Fetch.fetchURL(Website);







		int begin = 0;



		int stop = 0;



		int count = 0;

		System.out.println("");

		System.out.println("Searching " + Website);

		System.out.println("Searching for: all links");

		System.out.println("");



		while (begin!= -1 && stop != -1){





		begin = webpage.indexOf("href=\"");



		stop = webpage.indexOf("\">", begin);





		if(begin != -1 && stop != -1){



		String link = webpage.substring(begin+6, stop);



		String test = link.substring(link.length()-4, link.length());



		webpage = webpage.substring(stop);


		count++;

		System.out.println(count + ". " +link);












		}





		}

		if(count >=1){

		System.out.println("");

		System.out.println("Number of Links Found: " + count);

		System.out.println("");

		}else {


		System.out.println("java.net.UnknownHostException: AnUnknownHost");

		System.out.println("");

		}



		}


// this quits the program running if user enters 5
		else if (number == 5){



		Second = false;



		best = false;



		System.out.println("GoodBye! ");



		System.exit(0);



		}



		else { 



		Second = false;



		best = true;



		System.out.println("Invalid Number, Try Again!");











		}











		}while (best = true && webpage.contains("http"));



		}







		}















		if (Qu = true){



		all = false;



		}





		}



		}













		}