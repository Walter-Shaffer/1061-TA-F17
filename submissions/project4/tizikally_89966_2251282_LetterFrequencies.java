/* LetterFrequencies.java
 * Author: Allison Tizik
 * Submission Date: 12/1/17
 * Purpose: The program takes an inputed string array and runs through
 * each letter and counting how many of each letter are in the array
 * it then sets up a string which prints out each letter alphabetically
 * and how many times that letter appears lowercase  in the string array.
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
public class LetterFrequencies{
    public static void letterCount(String[] s, int[] count){
	if (count != null && s != null){
	    //Define a new array to temporarily store number of chars found
	    int[] tempNewArray = new int[count.length];
	    
	    for (int i = 0; i < s.length; i++) { 
		if (s[i] != null){
		    
		    char[] stringToChars = s[i].toCharArray();
		    
		    for (char c: stringToChars) {
			char c2;
			int i2;
			  
			  
			for (c2 = 'a', i2 = 0; c2 <= 'z' && i2 < 26; c2++, i2++) {
			    //only counts lower case
			    if (Character.toLowerCase(c) == c2) {
				tempNewArray[i2]++;
			    }
			}
		    }
		}
	    }
	    
	    for(int i= 0; i < tempNewArray.length; i++){
		count[i] = tempNewArray[i];
	    }
	}
	 
    }
    

    public static void initializeCount(int[] count){
	//Set all of count array back to 0 
	if (count != null){
	    for (int j = 0; j < count.length; j++) {
		count[j] = 0;
	    }
	}
    }
    
}
 
