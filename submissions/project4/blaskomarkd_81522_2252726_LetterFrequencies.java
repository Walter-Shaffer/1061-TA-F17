/*
* LetterFrequencies.java
* Author: Mark Blasko
* Submission Date: 11/27/17
* Purpose: The purpose of the program is to find the frequencie in which a letter occurs in a string.
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
public class LetterFrequencies{

  public static void letterCount(String[] s, int[] count){ //Used to modify count to fit the number of letters in strings
    if (s != null && count != null)
    for (int i = 0; i < s.length; i++) { //For the array as a whole
      int x = 0;
      if (s[i] != null) {
      for (x = 0; x < s[i].length(); x++) { //For a String within the array
      //  System.out.println(s[i].charAt(x));
        int z = 0;
        char letter = 'a';
        for (z = 0; z < count.length; z++, letter++) { //For the letters within the string
            String compare = s[i].charAt(x) + "";
            String stringLetter = letter + "";
            if (compare.equalsIgnoreCase(stringLetter)) {
              count[z] += 1;
            }
        }
      }
    }
  }
  }


  public static void initializeCount(int[] count){ //used to initialize count
    if (count != null) {
    for (int i = 0; i < count.length; i++) {
      count[i] = 0;
    }
  }
}
}
