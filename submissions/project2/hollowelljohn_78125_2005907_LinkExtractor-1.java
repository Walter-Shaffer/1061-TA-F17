import java.util.Scanner;

/** @formatter:off
* LinkExtractor.java
* @author John Hollowell
* Submission Date: 9/28/2017
*
* @purpose Given a valid URL and file type selection, this program will search the given site for links
* and display links that match the given file type(s). It will also display the number of
* links of that type(s) found.
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
* @formatter:on
*/

public class LinkExtractor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declare Variables
		String[] mask = null;
		String searchType = null;
		String HTML;

		// Initialize Variables outside main loop
		Scanner keyboard = new Scanner(System.in);

		while (true) {
			// Initialize variables
			String URL = "";
			int option = 0;
			int count = 0;


			// Get valid URL from user
			while (!(URL.toLowerCase().startsWith("http://") || URL.toLowerCase().startsWith("https://"))) {
				// Print error message if re-asking for URL
				if (!URL.equals("")) System.out.println("\nInput was unrecognized");

				// Get URL from user
				System.out.print("Enter a URL to read from (include the \"http://\" or \"https://\"), or type Q to quit:\n>> ");
				URL = keyboard.next();

				// Exit if "q*" entered
				if (URL.toLowerCase().startsWith("q")) {
					keyboard.close();
					exitWithMessage("Goodbye!");
				}
			}

			// Get Valid option from user
			while (option <= 0 || option > 5) {
				System.out.println("Enter the type of link to look for (1-5)");
				System.out.println("1. Images (PNG, JPG, BMP, GIF)");
				System.out.println("2. Documents (DOC, TXT, PDF)");
				System.out.println("3. Hypertext (HTM, HTML)");
				System.out.println("4. All Links");
				System.out.println("5. Quit");
				System.out.print(">> ");
				option = keyboard.nextInt();
			}


			// Set mask or exit, depending on option
			if (option == 1) {
				mask = new String[] {".png", ".jpg", ".bmp", ".gif"};
				searchType = "images";
			}
			if (option == 2) {
				mask = new String[] {".doc", ".txt", ".pdf"};
				searchType = "documents";
			}
			if (option == 3) {
				mask = new String[] {".htm", ".html"};
				searchType = "hypertext";
			}
			if (option == 4) {
				mask = new String[] {""};
				searchType = "all links";
			}
			if (option == 5) {
				keyboard.close();
				exitWithMessage("Goodbye!");
			}


			// Display Info
			System.out.printf("\nSearching %s\n", URL);
			System.out.printf("Searching for: %s\n\n", searchType);

			// read site's HTML into String and handle error
			HTML = Fetch.fetchURL(URL);
			if (HTML.startsWith("$error$")) {
				System.out.println(HTML.substring("$error$".length()) + "\n");
			}


			// if there is an error, this will not run and the program will break out back to
			// the top of the program.
			else {
				System.out.println(HTML.replace("\n", ""));

				// Read through HTML, add links to list, remove parsed HTML, repeat.
				while (HTML.length() > 0) {

					int startIndex = HTML.indexOf("href=\""); // Get index of starting href attribute
					int endIndex = HTML.indexOf("\"", startIndex + "href=\"".length()); // index of end quotation mark

					// Make sure the indexes will not cause errors
					if (startIndex > -1 && endIndex > -1) {
						String link = HTML.substring(startIndex + "href=\"".length(), endIndex);

						// Check the link for each file extension and print if match
						for (String extension : mask) {
							if (link.toLowerCase().endsWith(extension)) System.out.printf("%d. %s\n", ++count, link);
						}

						// Remove up to parsed location
						HTML = HTML.substring(endIndex + 1);
					}
					else
						HTML = "";
				}
				System.out.printf("\nNumber of Links Found: %s\n\n", count);
			}
		}
	}


	/**
	 * This method displays an exit message and exits the JVM, using the optional
	 * exit code if provided.
	 * 
	 * @param message
	 *            The message sent to System.out
	 * @param code
	 *            Optional exit code. When omitted, sends exit code of 0
	 */
	public static void exitWithMessage(String message, int... code) {

		System.out.println(message);
		System.exit(code.length > 0 ? code[0] : 0);
	}

}
