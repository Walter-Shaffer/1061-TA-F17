//Your class comments go here
/*
* LetterFrequencies.java
* Author: Jack Maggard
* Submission Date: 11/14/2017
*
* Purpose: A brief paragraph description of the
* program. What does it do?
* This program takes command line arguments
* and looks for a match of either a double or
* a String variable 
* 
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
public class LetterFrequencies {

	/*
	 * Search through each character in s, which is array of strings, and update
	 * the count array with the correct character counts. Note: check the
	 * examples to see if the counts should be case sensitive or case
	 * insensitive.
	 */
	public static void letterCount(String[] s, int[] count) {
		// Implement this function
		String z;//declare but not initializing z, which will be the lowercase version of s[index]
		if (s != null && count != null) {//checking if either input is null, just won't perform task
			for (int i = 0; i < s.length; i++) {//length of s array
				if (s[i] != null) {//again, making sure input is not null
					z = s[i].toLowerCase();//lowercase of the s[index]
					for (int j = 0; j < 26; j++)
						for (int l = 0; l < z.length(); l++)
							if (j + 'a' == z.charAt(l))//add ascii value of 'a' to j to match it to lowercse letters
								count[j] += 1;//adds one to count[index]
				}
			}

		}
	}

	/*
	 * Initialize each value in the count array to zero.
	 */
	public static void initializeCount(int[] count) {
		// Implement this function
		if (count != null) {//input must be valid
			for (int i = 0; i < count.length; i++)
				count[i] = 0;//initialize all 26 count values to 0 so it works
		}
	}

}
