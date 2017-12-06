/*
* LetterFrequencies.java
* Author: Joshua Williams
* Submission Date: 12/1/17
*
* Purpose: 
* 	This class creates two static methods named letterCount and initializeCount.
* The two methods are used to test multiple strings and see how many of each character is
* in the string.
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
public class LetterFrequencies {
	public static void letterCount(String[] s, int[] count) {
		//This method counts the letters in each String in s
		if (s != null) {
			for (int i = 0; i < s.length; i++) {
				if (s[i] != null)
					s[i] = s[i].toUpperCase();
			}
			for (String l : s) {
				if (l != null) {
					char[] h = l.toCharArray();
					for (int i = 0; i < h.length; i++) {
						if (h[i] >= 65 && h[i] <= 90) {
							count[(int) h[i] - 65] += 1;
						}
					}
				}
			}
		}
	}

	public static void initializeCount(int[] count) {
		//This method resets the count to 0
		if (count != null) {
			for (int i = 0; i < count.length; i++) {
				count[i] = 0;
			}
		}
	}
}